package me.legrange.mikrotik.impl;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.SocketFactory;
import me.legrange.mikrotik.ApiConnection;
import me.legrange.mikrotik.ApiConnectionException;
import me.legrange.mikrotik.MikrotikApiException;
import me.legrange.mikrotik.ResultListener;

/**
 * The Mikrotik API connection implementation. This is the class used to connect
 * to a remote Mikrotik and send commands to it.
 *
 * @author GideonLeGrange
 */
public final class ApiConnectionImpl extends ApiConnection {

    /**
     * Create a new API connection to the give device on the supplied port
     *
     * @param fact The socket factory used to construct the connection socket.
     * @param host The host to which to connect.
     * @param port The TCP port to use.
     * @param timeOut The connection timeout
     * @return The ApiConnection
     * @throws me.legrange.mikrotik.ApiConnectionException Thrown if there is a
     * problem connecting
     */
    public static ApiConnection connect(SocketFactory fact, String host, int port, int timeOut) throws ApiConnectionException {
        ApiConnectionImpl con = new ApiConnectionImpl();
        con.open(host, port, fact, timeOut);
        return con;
    }

    @Override
    public boolean isConnected() {
        return connected;
    }

    @Override
    public void login(String username, String password) throws MikrotikApiException {
        if (username.trim().isEmpty()) {
            throw new ApiConnectionException("API username cannot be empty");
        }
        Command cmd = new Command("/login");
        cmd.addParameter("name", username);
        cmd.addParameter("password", password);
        List<Map<String, String>> list = execute(cmd, timeout);
        if (!list.isEmpty()) {
            Map<String, String> res = list.get(0);
            if (res.containsKey("ret")) {
                String hash = res.get("ret");
                String chal = Util.hexStrToStr("00") + new String(password.toCharArray()) + Util.hexStrToStr(hash);
                chal = Util.hashMD5(chal);
                execute("/login name=" + username + " response=00" + chal);
            }
        }
    }

    @Override
    public List<Map<String, String>> execute(String cmd) throws MikrotikApiException {
        return execute(Parser.parse(cmd), timeout);
    }

    @Override
    public String execute(String cmd, ResultListener lis) throws MikrotikApiException {
        return execute(Parser.parse(cmd), lis);
    }

    @Override
    public void cancel(String tag) throws MikrotikApiException {
        execute(String.format("/cancel tag=%s", tag));
    }

    @Override
    public void setTimeout(int timeout) throws MikrotikApiException {
        if (timeout > 0) {
            this.timeout = timeout;
        } else {
            throw new MikrotikApiException(String.format("Invalid timeout value '%d'; must be postive", timeout));
        }
    }

    @Override
    public void close() throws ApiConnectionException {
        if (!connected) {
            throw new ApiConnectionException(("Not/no longer connected to remote Mikrotik"));
        }
        connected = false;
        processor.interrupt();
        reader.interrupt();
        try {
            in.close();
            out.close();
            sock.close();
        } catch (IOException ex) {
            throw new ApiConnectionException(String.format("Error closing socket: %s", ex.getMessage()), ex);
        }
    }

    private List<Map<String, String>> execute(Command cmd, int timeout) throws MikrotikApiException {
        SyncListener l = new SyncListener();
        execute(cmd, l);
        return l.getResults(timeout);
    }

    private String execute(Command cmd, ResultListener lis) throws MikrotikApiException {
        String tag = nextTag();
        cmd.setTag(tag);
        listeners.put(tag, lis);
        try {
            Util.write(cmd, out);
        } catch (UnsupportedEncodingException ex) {
            throw new ApiDataException(ex.getMessage(), ex);
        } catch (IOException ex) {
            throw new ApiConnectionException(ex.getMessage(), ex);
        }
        return tag;
    }

    private ApiConnectionImpl() {
        this.listeners = new ConcurrentHashMap<>();
    }

    /**
     * Start the API. Connects to the Mikrotik
     */
    private void open(String host, int port, SocketFactory fact, int conTimeout) throws ApiConnectionException {
        try {
            InetAddress ia = InetAddress.getByName(host.trim());
            sock = fact.createSocket();
            sock.connect(new InetSocketAddress(ia, port), conTimeout);
            in = new DataInputStream(sock.getInputStream());
            out = new DataOutputStream(sock.getOutputStream());
            connected = true;
            reader = new Reader();
            reader.setDaemon(true);
            reader.start();
            processor = new Processor();
            processor.setDaemon(true);
            processor.start();
        } catch (UnknownHostException ex) {
            connected = false;
            throw new ApiConnectionException(String.format("Unknown host '%s'", host), ex);
        } catch (IOException ex) {
            connected = false;
            throw new ApiConnectionException(String.format("Error connecting to %s:%d : %s", host, port, ex.getMessage()), ex);
        }
    }

    private synchronized String nextTag() {
        return Integer.toHexString(_tag.incrementAndGet());
    }

    private Socket sock = null;
    private DataOutputStream out = null;
    private DataInputStream in = null;
    private boolean connected = false;
    private Reader reader;
    private Processor processor;
    private final Map<String, ResultListener> listeners;
    private final AtomicInteger _tag = new AtomicInteger(0);
    private int timeout = ApiConnection.DEFAULT_COMMAND_TIMEOUT;

    /**
     * thread to read data from the socket and process it into Strings
     */
    private class Reader extends Thread {

        private Reader() {
            super("Mikrotik API Reader");
        }

        private String take() throws ApiConnectionException, ApiDataException {
            Object val;
            try {
                val = queue.take();
            } catch (InterruptedException ex) {
                throw new ApiConnectionException("Interrupted while reading data from queue.", ex);
            }
            if (val instanceof ApiConnectionException) {
                throw (ApiConnectionException) val;
            } else if (val instanceof ApiDataException) {
                throw (ApiDataException) val;
            }
            return (String) val;
        }

        private boolean isEmpty() {
            return queue.isEmpty();
        }

        @Override
        public void run() {
            while (connected) {
                try {
                    String s = Util.decode(in);
                    put(s);
                } catch (ApiDataException ex) {
                    put(ex);
                } catch (ApiConnectionException ex) {
                    if (connected || !sock.isClosed()) {
                        put(ex);
                    }
                }
            }
        }

        private void put(Object data) {
            try {
                queue.put(data);
            } catch (InterruptedException ignored) {
            }
        }

        private final LinkedBlockingQueue queue = new LinkedBlockingQueue(40);
    }

    /**
     * Thread to take the received strings and process it into Result objects
     */
    private class Processor extends Thread {

        private Processor() {
            super("Mikrotik API Result Processor");
        }

        @Override
        public void run() {
            while (connected) {
                Response res;
                try {
                    res = unpack();
                } catch (ApiCommandException ex) {
                    String tag = ex.getTag();
                    if (tag != null) {
                        res = new Error(tag, ex.getMessage(), ex.getCategory());
                    } else {
                        continue;
                    }
                } catch (MikrotikApiException ex) {
                    continue;
                }
                if (res.getTag() != null) {
                    ResultListener l = listeners.get(res.getTag());
                    if (l != null) {
                        if (res instanceof Result) {
                            l.receive((Result) res);
                        } else if (res instanceof Done) {
                            if (l instanceof SyncListener) {
                                ((SyncListener) l).completed((Done) res);
                            } else {
                                l.completed();
                            }
                            listeners.remove(res.getTag());
                        } else if (res instanceof Error) {
                            l.error(new ApiCommandException((Error) res));
                        }
                    }
                } else {
                    nextTag();
                }
            }
        }

        private void nextLine() throws ApiConnectionException, ApiDataException {
            if (lines.isEmpty()) {
                String block = reader.take();
                String[] parts = block.split("\n");
                lines.addAll(Arrays.asList(parts));
            }
            line = lines.remove(0);
        }

        private boolean hasNextLine() {
            return !lines.isEmpty() || !reader.isEmpty();
        }

        private String peekLine() throws ApiConnectionException, ApiDataException {
            if (lines.isEmpty()) {
                String block = reader.take();
                String[] parts = block.split("\n");
                lines.addAll(Arrays.asList(parts));
            }
            return lines.get(0);
        }

        private Response unpack() throws MikrotikApiException {
            if (line == null) {
                nextLine();
            }
            switch (line) {
                case "!re":
                    return unpackRe();
                case "!done":
                    return unpackDone();
                case "!trap":
                case "!halt":
                    return unpackError();
                case "":
                default:
                    throw new ApiDataException(String.format("Unexpected line '%s'", line));
            }
        }

        private Result unpackRe() throws ApiDataException, ApiConnectionException {
            nextLine();
            Result res = new Result();
            while (!line.startsWith(("!"))) {
                if (line.startsWith(("="))) {
                    String[] parts = line.split("=", 3);
                    if (parts.length == 3) {
                        if (!parts[2].endsWith("\r")) {
                            res.put(parts[1], unpackResult(parts[2]));
                        } else {
                            final StringBuilder sb = new StringBuilder();
                            sb.append(parts[2]);
                            while (!lines.isEmpty()) {
                                nextLine();
                                sb.append(line);
                            }
                            res.put(parts[1], sb.toString());
                        }
                    } else {
                        throw new ApiDataException(String.format("Malformed line '%s'", line));
                    }
                } else if (line.startsWith(".tag=")) {
                    String[] parts = line.split("=", 2);
                    if (parts.length == 2) {
                        res.setTag(parts[1]);
                    }
                } else {
                    throw new ApiDataException(String.format("Unexpected line '%s'", line));
                }
                if (hasNextLine()) {
                    nextLine();
                } else {
                    line = null;
                    break;
                }
            }
            return res;
        }

        private String unpackResult(String first) throws ApiConnectionException, ApiDataException {
            StringBuilder buf = new StringBuilder(first);
            line = null;

            while (hasNextLine()) {
                String peek = peekLine();
                if (!(peek.startsWith("!") || peek.startsWith("=") || peek.startsWith(".tag="))) {
                    nextLine();
                    buf.append("\n");
                    buf.append(line);
                } else {
                    break;
                }
            }
            return buf.toString();
        }

        private Done unpackDone() throws MikrotikApiException {
            Done done = new Done(null);
            if (hasNextLine()) {
                nextLine();

                while (!line.startsWith("!")) {
                    if (line.startsWith(".tag=")) {
                        String[] parts = line.split("=", 2);
                        if (parts.length == 2) {
                            done.setTag(parts[1]);
                        }
                    } else if (line.startsWith(("=ret"))) {
                        String[] parts = line.split("=", 3);
                        if (parts.length == 3) {
                            done.setHash(parts[2]);
                        } else {
                            throw new ApiDataException(String.format("Malformed line '%s'", line));
                        }
                    }
                    if (hasNextLine()) {
                        nextLine();
                    } else {
                        line = null;
                        break;
                    }
                }
            }
            return done;
        }

        private Error unpackError() throws MikrotikApiException {
            nextLine();
            Error err = new Error();
            if (hasNextLine()) {
                while (!line.startsWith("!")) {
                    if (line.startsWith(".tag=")) {
                        String[] parts = line.split("=", 2);
                        if (parts.length == 2) {
                            err.setTag(parts[1]);
                        }
                    } else if (line.startsWith("=message=")) {
                        err.setMessage(line.split("=", 3)[2]);
                    }
                    else if (line.startsWith("=category=")) {
                        err.setCategory(Integer.parseInt(line.split("=", 3)[2]));
                    }
                    if (hasNextLine()) {
                        nextLine();
                    } else {
                        line = null;
                        break;
                    }
                }
            }
            return err;
        }

        private final List<String> lines = new LinkedList<>();
        private String line;
    }

    private static class SyncListener implements ResultListener {

        @Override
        public synchronized void error(MikrotikApiException ex) {
            this.err = ex;
            notifyAll();
        }

        @Override
        public synchronized void completed() {
            complete = true;
            notifyAll();
        }

        synchronized void completed(Done done) {
            if (done.getHash() != null) {
                Result res = new Result();
                res.put("ret", done.getHash());
                results.add(res);
            }
            complete = true;
            notifyAll();
        }

        @Override
        public void receive(Map<String, String> result) {
            results.add(result);
        }

        private List<Map<String, String>> getResults(int timeout) throws MikrotikApiException {
            try {
                synchronized (this) { // don't wait if we already have a result.
                    int waitTime = timeout;
                    while (!complete && (waitTime > 0)) {
                        long start = System.currentTimeMillis();
                        wait(waitTime);
                        waitTime = waitTime - (int) (System.currentTimeMillis() - start);
                        if ((waitTime <= 0) && !complete) {
                            err = new ApiConnectionException(String.format("Command timed out after %d ms", timeout));
                        }
                    }
                }
            } catch (InterruptedException ex) {
                throw new ApiConnectionException(ex.getMessage(), ex);
            }
            if (err != null) {
                throw new MikrotikApiException(err.getMessage(), err);
            }
            return results;
        }

        private final List<Map<String, String>> results = new LinkedList<>();
        private MikrotikApiException err;
        private boolean complete = false;
    }
}
