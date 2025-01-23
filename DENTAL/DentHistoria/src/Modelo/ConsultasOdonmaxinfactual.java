package Modelo;

import Vista.frmConsultasPaciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultasOdonmaxinfactual extends Conexion {

    public boolean actualizar(Odontogramaxinf odo) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "UPDATE odontomaxinfactuales SET d1_izq=?, d1_sup=?, d1_cen=?, d1_der=?, d1_inf=?, d2_izq=?, d2_sup=?, d2_cen=?, d2_der=?, d2_inf=?, d3_izq=?, d3_sup=?, d3_cen=?, d3_der=?, d3_inf=?, d4_izq=?, d4_sup=?, d4_cen=?, d4_der=?, d4_inf=?, d5_izq=?, d5_sup=?, d5_cen=?, d5_der=?, d5_inf=?, d6_izq=?, d6_sup=?, d6_cen=?, d6_der=?, d6_inf=?, d7_izq=?, d7_sup=?, d7_cen=?, d7_der=?, d7_inf=?, d8_izq=?, d8_sup=?, d8_cen=?, d8_der=?, d8_inf=?, d9_izq=?, d9_sup=?, d9_cen=?, d9_der=?, d9_inf=?, d10_izq=?, d10_sup=?, d10_cen=?, d10_der=?, d10_inf=?, d11_izq=?, d11_sup=?, d11_cen=?, d11_der=?, d11_inf=?, d12_izq=?, d12_sup=?, d12_cen=?, d12_der=?, d12_inf=?, d13_izq=?, d13_sup=?, d13_cen=?, d13_der=?, d13_inf=?, d14_izq=?, d14_sup=?, d14_cen=?, d14_der=?, d14_inf=?, d15_izq=?, d15_sup=?, d15_cen=?, d15_der=?, d15_inf=?, d16_izq=?, d16_sup=?, d16_cen=?, d16_der=?, d16_inf=? WHERE id_pac=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, odo.getD1_izq());
            ps.setString(2, odo.getD1_sup());
            ps.setString(3, odo.getD1_cen());
            ps.setString(4, odo.getD1_der());
            ps.setString(5, odo.getD1_inf());
            ps.setString(6, odo.getD2_izq());
            ps.setString(7, odo.getD2_sup());
            ps.setString(8, odo.getD2_cen());
            ps.setString(9, odo.getD2_der());
            ps.setString(10, odo.getD2_inf());
            ps.setString(11, odo.getD3_izq());
            ps.setString(12, odo.getD3_sup());
            ps.setString(13, odo.getD3_cen());
            ps.setString(14, odo.getD3_der());
            ps.setString(15, odo.getD3_inf());
            ps.setString(16, odo.getD4_izq());
            ps.setString(17, odo.getD4_sup());
            ps.setString(18, odo.getD4_cen());
            ps.setString(19, odo.getD4_der());
            ps.setString(20, odo.getD4_inf());
            ps.setString(21, odo.getD5_izq());
            ps.setString(22, odo.getD5_sup());
            ps.setString(23, odo.getD5_cen());
            ps.setString(24, odo.getD5_der());
            ps.setString(25, odo.getD5_inf());
            ps.setString(26, odo.getD6_izq());
            ps.setString(27, odo.getD6_sup());
            ps.setString(28, odo.getD6_cen());
            ps.setString(29, odo.getD6_der());
            ps.setString(30, odo.getD6_inf());
            ps.setString(31, odo.getD7_izq());
            ps.setString(32, odo.getD7_sup());
            ps.setString(33, odo.getD7_cen());
            ps.setString(34, odo.getD7_der());
            ps.setString(35, odo.getD7_inf());
            ps.setString(36, odo.getD8_izq());
            ps.setString(37, odo.getD8_sup());
            ps.setString(38, odo.getD8_cen());
            ps.setString(39, odo.getD8_der());
            ps.setString(40, odo.getD8_inf());
            ps.setString(41, odo.getD9_izq());
            ps.setString(42, odo.getD9_sup());
            ps.setString(43, odo.getD9_cen());
            ps.setString(44, odo.getD9_der());
            ps.setString(45, odo.getD9_inf());
            ps.setString(46, odo.getD10_izq());
            ps.setString(47, odo.getD10_sup());
            ps.setString(48, odo.getD10_cen());
            ps.setString(49, odo.getD10_der());
            ps.setString(50, odo.getD10_inf());
            ps.setString(51, odo.getD11_izq());
            ps.setString(52, odo.getD11_sup());
            ps.setString(53, odo.getD11_cen());
            ps.setString(54, odo.getD11_der());
            ps.setString(55, odo.getD11_inf());
            ps.setString(56, odo.getD12_izq());
            ps.setString(57, odo.getD12_sup());
            ps.setString(58, odo.getD12_cen());
            ps.setString(59, odo.getD12_der());
            ps.setString(60, odo.getD12_inf());
            ps.setString(61, odo.getD13_izq());
            ps.setString(62, odo.getD13_sup());
            ps.setString(63, odo.getD13_cen());
            ps.setString(64, odo.getD13_der());
            ps.setString(65, odo.getD13_inf());
            ps.setString(66, odo.getD14_izq());
            ps.setString(67, odo.getD14_sup());
            ps.setString(68, odo.getD14_cen());
            ps.setString(69, odo.getD14_der());
            ps.setString(70, odo.getD14_inf());
            ps.setString(71, odo.getD15_izq());
            ps.setString(72, odo.getD15_sup());
            ps.setString(73, odo.getD15_cen());
            ps.setString(74, odo.getD15_der());
            ps.setString(75, odo.getD15_inf());
            ps.setString(76, odo.getD16_izq());
            ps.setString(77, odo.getD16_sup());
            ps.setString(78, odo.getD16_cen());
            ps.setString(79, odo.getD16_der());
            ps.setString(80, odo.getD16_inf());

            ps.setInt(81, odo.getId_pac());

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

    public boolean buscar(Odontogramaxinf odo) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM odontomaxinfactuales WHERE id_pac=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, odo.getId_pac());
            rs = ps.executeQuery();

            if (rs.next()) {
                odo.setId_odo(Integer.parseInt(rs.getString("id_odo")));

                odo.setD1_izq(rs.getString("d1_izq"));
                odo.setD1_sup(rs.getString("d1_sup"));
                odo.setD1_cen(rs.getString("d1_cen"));
                odo.setD1_der(rs.getString("d1_der"));
                odo.setD1_inf(rs.getString("d1_inf"));

                odo.setD2_izq(rs.getString("d2_izq"));
                odo.setD2_sup(rs.getString("d2_sup"));
                odo.setD2_cen(rs.getString("d2_cen"));
                odo.setD2_der(rs.getString("d2_der"));
                odo.setD2_inf(rs.getString("d2_inf"));

                odo.setD3_izq(rs.getString("d3_izq"));
                odo.setD3_sup(rs.getString("d3_sup"));
                odo.setD3_cen(rs.getString("d3_cen"));
                odo.setD3_der(rs.getString("d3_der"));
                odo.setD3_inf(rs.getString("d3_inf"));

                odo.setD4_izq(rs.getString("d4_izq"));
                odo.setD4_sup(rs.getString("d4_sup"));
                odo.setD4_cen(rs.getString("d4_cen"));
                odo.setD4_der(rs.getString("d4_der"));
                odo.setD4_inf(rs.getString("d4_inf"));

                odo.setD5_izq(rs.getString("d5_izq"));
                odo.setD5_sup(rs.getString("d5_sup"));
                odo.setD5_cen(rs.getString("d5_cen"));
                odo.setD5_der(rs.getString("d5_der"));
                odo.setD5_inf(rs.getString("d5_inf"));

                odo.setD6_izq(rs.getString("d6_izq"));
                odo.setD6_sup(rs.getString("d6_sup"));
                odo.setD6_cen(rs.getString("d6_cen"));
                odo.setD6_der(rs.getString("d6_der"));
                odo.setD6_inf(rs.getString("d6_inf"));

                odo.setD7_izq(rs.getString("d7_izq"));
                odo.setD7_sup(rs.getString("d7_sup"));
                odo.setD7_cen(rs.getString("d7_cen"));
                odo.setD7_der(rs.getString("d7_der"));
                odo.setD7_inf(rs.getString("d7_inf"));

                odo.setD8_izq(rs.getString("d8_izq"));
                odo.setD8_sup(rs.getString("d8_sup"));
                odo.setD8_cen(rs.getString("d8_cen"));
                odo.setD8_der(rs.getString("d8_der"));
                odo.setD8_inf(rs.getString("d8_inf"));

                odo.setD9_izq(rs.getString("d9_izq"));
                odo.setD9_sup(rs.getString("d9_sup"));
                odo.setD9_cen(rs.getString("d9_cen"));
                odo.setD9_der(rs.getString("d9_der"));
                odo.setD9_inf(rs.getString("d9_inf"));

                odo.setD10_izq(rs.getString("d10_izq"));
                odo.setD10_sup(rs.getString("d10_sup"));
                odo.setD10_cen(rs.getString("d10_cen"));
                odo.setD10_der(rs.getString("d10_der"));
                odo.setD10_inf(rs.getString("d10_inf"));

                odo.setD11_izq(rs.getString("d11_izq"));
                odo.setD11_sup(rs.getString("d11_sup"));
                odo.setD11_cen(rs.getString("d11_cen"));
                odo.setD11_der(rs.getString("d11_der"));
                odo.setD11_inf(rs.getString("d11_inf"));

                odo.setD12_izq(rs.getString("d12_izq"));
                odo.setD12_sup(rs.getString("d12_sup"));
                odo.setD12_cen(rs.getString("d12_cen"));
                odo.setD12_der(rs.getString("d12_der"));
                odo.setD12_inf(rs.getString("d12_inf"));

                odo.setD13_izq(rs.getString("d13_izq"));
                odo.setD13_sup(rs.getString("d13_sup"));
                odo.setD13_cen(rs.getString("d13_cen"));
                odo.setD13_der(rs.getString("d13_der"));
                odo.setD13_inf(rs.getString("d13_inf"));

                odo.setD14_izq(rs.getString("d14_izq"));
                odo.setD14_sup(rs.getString("d14_sup"));
                odo.setD14_cen(rs.getString("d14_cen"));
                odo.setD14_der(rs.getString("d14_der"));
                odo.setD14_inf(rs.getString("d14_inf"));

                odo.setD15_izq(rs.getString("d15_izq"));
                odo.setD15_sup(rs.getString("d15_sup"));
                odo.setD15_cen(rs.getString("d15_cen"));
                odo.setD15_der(rs.getString("d15_der"));
                odo.setD15_inf(rs.getString("d15_inf"));

                odo.setD16_izq(rs.getString("d16_izq"));
                odo.setD16_sup(rs.getString("d16_sup"));
                odo.setD16_cen(rs.getString("d16_cen"));
                odo.setD16_der(rs.getString("d16_der"));
                odo.setD16_inf(rs.getString("d16_inf"));

                return true;
            }

            return false;
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
