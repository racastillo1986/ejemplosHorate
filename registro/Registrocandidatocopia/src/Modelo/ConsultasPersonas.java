package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConsultasPersonas extends Conexion {

    public boolean registrar(Personas per) {

        PreparedStatement ps = null;
        PreparedStatement psrep = null;
        PreparedStatement psclick = null;
        ResultSet rsrep = null;
        Connection con = getConexion();
        String sql = "INSERT INTO datospersonales (ced_per, nom_per, mail_per, tel_per, edad_per) VALUES (?,?,?,?,?)";
        String sqlclick = "INSERT INTO click (ced_per, pue_click) VALUES (?,?)";
        String sqlrep = "SELECT * FROM datospersonales WHERE ced_per=?";

        try {

            //BUSCAR REPETIDO
            psrep = con.prepareStatement(sqlrep);
            psrep.setString(1, per.getCed_per());
            rsrep = psrep.executeQuery();

            if (rsrep.next()) {

                System.out.println("CEDULA/PERSONA/CANDIDATO" + rsrep.getString("ced_per") + "YA SE ENCUENTRA REGISTRADO");
                JOptionPane.showMessageDialog(null, "CEDULA/PERSONA/CANDIDATO" + rsrep.getString("ced_per") + "YA SE ENCUENTRA REGISTRADO");
                //val = 1;
                return false;

            }

        } catch (SQLException e) {

            System.err.println(e);

        }

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, per.getCed_per());
            ps.setString(2, per.getNom_per());
            ps.setString(3, per.getMail_per());
            ps.setString(4, per.getTel_per());
            ps.setString(5, per.getEdad_per());
            ps.executeUpdate();

            psclick = con.prepareStatement(sqlclick);
            psclick.setString(1, per.getCed_per());
            psclick.setString(2, per.getPue_click());

            psclick.executeUpdate();

            return true;
        } catch (SQLException e) {

            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }

    }

    public boolean modificar(Personas per) {

        PreparedStatement psclick = null;
        Connection con = getConexion();
        String sql = "UPDATE datospersonales SET nom_per=?, mail_per=?, tel_per=?, edad_per=? WHERE ced_per=?";
        String sqlclick = "UPDATE click SET pue_click=? WHERE ced_per=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, per.getNom_per());
            ps.setString(2, per.getMail_per());
            ps.setString(3, per.getTel_per());

            ps.setString(4, per.getEdad_per());

            ps.setString(5, per.getCed_per());
            ps.execute();
            
            psclick=con.prepareStatement(sqlclick);
            psclick.setString(1, per.getPue_click());
            psclick.setString(2, per.getCed_per());
            psclick.executeUpdate();
            
            
            
            return true;
        } catch (SQLException e) {

            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }

    }

    public boolean eliminar(Personas per) {

        Connection con = getConexion();
        String sql = "DELETE FROM datospersonales WHERE ced_per=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, per.getCed_per());
            ps.execute();
            return true;
        } catch (SQLException e) {

            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

}
