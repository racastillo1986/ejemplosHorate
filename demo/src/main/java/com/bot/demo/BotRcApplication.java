package com.bot.demo;

//import org.springframework.boot.SpringApplication;

import me.legrange.mikrotik.impl.ApiConnectionImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import me.legrange.mikrotik.ApiConnection;
import me.legrange.mikrotik.MikrotikApiException;
import me.legrange.mikrotik.ResultListener;
import me.legrange.mikrotik.ApiConnectionException;

import javax.net.SocketFactory;
import java.util.Map;


@SpringBootApplication
public class BotRcApplication {

    public static void main(String[] args) throws MikrotikApiException {

        //SpringApplication.run(BotRcApplication.class, args);
        System.out.println("Hola chingao...");

        String ip = "192.168.1.1";  // IP del router MikroTik
        String user = "admin";       // Usuario del router
        String password = "your_password"; // Contraseña del router

        // conexión a MikroTik chingao
        try {
            ApiConnectionImpl connection = (ApiConnectionImpl) ApiConnectionImpl.connect(SocketFactory.getDefault(), ip, 8728, 5000);
            System.out.println("Conexión exitosa al MikroTik");

            // login
            connection.login(user, password);
            System.out.println("Login ok");

            // Ejecutar el comando para obtener los clientes DHCP
            connection.execute("/ip/dhcp-server/lease/print", new ResultListener() {
                @Override
                public void receive(Map<String, String> result) {
                    // Procesar los resultados de los clientes DHCP
                    System.out.println("Clientes DHCP registrados:");
                    
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

            // Cerrar la conexión
            connection.close();
            System.out.println("Conexión cerrada");

        } catch (ApiConnectionException e) {
            // Manejo de la excepción ApiConnectionException
            e.printStackTrace();
        } catch (MikrotikApiException e) {
            // Manejo de la excepción MikrotikApiException
            e.printStackTrace();
        }


    }

}
