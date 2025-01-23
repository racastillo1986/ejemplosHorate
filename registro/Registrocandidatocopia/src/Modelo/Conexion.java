package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    Connection con = null;

    public Connection getConexion() {
        try {
                
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/personal","root","12345678");
                System.out.println("conexion establecida");
                
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("error de conexion");
                JOptionPane.showMessageDialog(null,"Error de conexion"+e);
            }
        return con;

    }
}


