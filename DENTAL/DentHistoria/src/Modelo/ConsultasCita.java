package Modelo;

import Vista.frmCita;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultasCita extends Conexion {

    public boolean registrar(Cita cit, DetalleCita det) {

        //PreparedStatement ps = null; //seleccionar el id_pac de la vista
        PreparedStatement psinscit = null;
        PreparedStatement psidcita = null;
        PreparedStatement psdet = null;
        Connection con = getConexion();
        ResultSet rs = null;
        ResultSet rsidcita = null;
        String sql = "SELECT id_pac FROM vistapacientes WHERE ced_per=?";
        String sqlinscit = "INSERT INTO citas (id_pac, fec_cit, mot_cit, cau_cit) VALUES (?,?,?,?)";
        String sqlidcita = "SELECT id_cit FROM citas ORDER BY id_cit DESC LIMIT 1";
        String sqldetcit = "INSERT INTO detallecitas (id_cit, tra_det, pie_det, car_det, obs_det) VALUES (?,?,?,?,?)";

        try {

            System.out.println("objeto cit id paciente:" + cit.getId_pac());

            //INSERT CITAS
            psinscit = con.prepareStatement(sqlinscit);
            psinscit.setInt(1, cit.getId_pac());
            psinscit.setString(2, cit.getFec_cit());
            psinscit.setString(3, cit.getMot_cit());
            psinscit.setString(4, cit.getCau_cit());

            psinscit.executeUpdate();

            //.............. Obtener el id generado al guardar cita
            psidcita = con.prepareStatement(sqlidcita);
            rsidcita = psidcita.executeQuery();
            if (rsidcita.next()) {
                cit.setId_cit(Integer.parseInt(rsidcita.getString("id_cit")));
                System.out.println("encontrojajajaja");
            }

            System.out.println("id de la cita que de acaba de guardar: " + cit.getId_cit()); //id de la cita que de acaba de guardar

            int x = frmCita.jtTrat_Citas.getRowCount();
            for (int i = 0; i < x; i++) {
                psdet = con.prepareStatement(sqldetcit);
                psdet.setInt(1, cit.getId_cit());
                psdet.setString(2, det.matriz[i][2]);
                psdet.setString(3, det.matriz[i][0]);
                psdet.setString(4, det.matriz[i][1]);
                psdet.setString(5, det.matriz[i][3]);

                psdet.executeUpdate();
            }

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
