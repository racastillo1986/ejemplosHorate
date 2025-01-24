package practica;

import examples.Config;
import me.legrange.mikrotik.ApiConnectionException;
import me.legrange.mikrotik.MikrotikApiException;
import me.legrange.mikrotik.ResultListener;
import me.legrange.mikrotik.impl.ApiConnectionImpl;

import javax.net.SocketFactory;
import java.util.Map;

public class MikrotikEjemplo {

    public static void main(String[] args) throws MikrotikApiException {
        System.out.println("Hola chingao - Iniciando prueba");

        String ip = Config.HOST;
        String user = Config.USERNAME;
        String password = Config.PASSWORD;

        try {
            ApiConnectionImpl connection = (ApiConnectionImpl) ApiConnectionImpl.connect(SocketFactory.getDefault(), ip, 8728, 5000);
            System.out.println("********* Conexion exitosa chingao **********");

            //login
            connection.login(user, password);
            System.out.println("********** Login ok chingao *********");

            // Ejecutar el comando para obtener los clientes DHCP
            //comando para clientes por ip: /ip/arp/print
            //comando para clientes dhcp:/ip/dhcp-server/lease/print
            connection.execute("/ip/arp/print", new ResultListener() {

                @Override
                public void receive(Map<String, String> result) {
                    // Procesar los resultados de los clientes por IP
                    System.out.println("Clientes por IP registrados:");

                    //Map es como un array pero con clave y valor
                    for (Map.Entry<String, String> entry : result.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                }

                @Override
                public void error(MikrotikApiException ex) {
                    // Manejar errores
                    System.err.println("Error al ejecutar el comando: " + ex.getMessage());
                }

                @Override
                public void completed() {
                    // Acción cuando el comando se completa
                    System.out.println("Comando ejecutado exitosamente");
                }
            });

            // cerrar la conexion no olvide esto chingao
            connection.close();
            System.out.println("********** Conexion cerrada OK **********");
        } catch (ApiConnectionException e) {
            // Manejo de la excepción ApiConnectionException
            e.printStackTrace();
        } catch (MikrotikApiException e) {
            // Manejo de la excepción MikrotikApiException
            e.printStackTrace();
        }
    }

}
