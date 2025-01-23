package Modelo;

import Vista.frmCDRUDPaciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConsultasPaciente extends Conexion {

    public boolean registrar(Paciente pac) {

        PreparedStatement ps = null;
        PreparedStatement psced = null;
        PreparedStatement pspac = null;
        PreparedStatement psrep = null;
        ResultSet rsrep = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "INSERT INTO personas (ced_per, nom_per, ape_per, fec_nac, edad_per, tel_per, dir_per, sex_per, est_civ, mail_per, rep_per, fec_ing) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        String sqlcedula = "SELECT id_per FROM personas WHERE ced_per=?";
        String sqlpac = "INSERT INTO pacientes (id_per) VALUES (?)";
        String sqlrep = "SELECT * FROM personas WHERE ced_per=?";
        int val = 0;

        try {

            //BUSCAR REPETIDO
            psrep = con.prepareStatement(sqlrep);
            psrep.setString(1, pac.getCedula());
            rsrep = psrep.executeQuery();

            if (rsrep.next()) {

                System.out.println("CEDULA/PACIENTE" + rsrep.getString("ced_per") + "YA SE ENCUENTRA REGISTRADO");
                JOptionPane.showMessageDialog(null, "CEDULA/PACIENTE" + rsrep.getString("ced_per") + "YA SE ENCUENTRA REGISTRADO");
                val = 1;
                return false;

            }

        } catch (SQLException e) {

            System.err.println(e);

        }

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, pac.getCedula());
            ps.setString(2, pac.getNombre());
            ps.setString(3, pac.getApellido());
            ps.setString(4, pac.getFechanacimiento());
            ps.setInt(5, pac.getEdad());
            ps.setString(6, pac.getTelefono());
            ps.setString(7, pac.getDireccion());
            ps.setInt(8, pac.getSexo());
            ps.setInt(9, pac.getEst_civil());
            ps.setString(10, pac.getMail());
            ps.setString(11, pac.getRepresentante());
            ps.setString(12, pac.getFechaingreso());
            ps.executeUpdate();

            System.out.println(pac.getCedula());

            //BUSCAR EL ULTIMO
            psced = con.prepareStatement(sqlcedula);
            psced.setString(1, pac.getCedula());
            rs = psced.executeQuery();

            if (rs.next()) {
                pac.setId_per(Integer.parseInt(rs.getString("id_per")));
                System.out.println("encontrojajajaja");

            }

            System.out.println(pac.getId_per());

            //Insertar en tabla pacientes
            pspac = con.prepareStatement(sqlpac);
            pspac.setString(1, String.valueOf(pac.getId_per()));
            pspac.executeUpdate();

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

    public boolean modificarpersona(Paciente pac) {
        System.out.println("Hola mundo");

        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "UPDATE personas SET ced_per=?, nom_per=?, ape_per=?, fec_nac=?, edad_per=?, tel_per=?, dir_per=?, sex_per=?, est_civ=?, mail_per=?, rep_per=?, fec_ing=? WHERE id_per=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pac.getCedula());
            ps.setString(2, pac.getNombre());
            ps.setString(3, pac.getApellido());
            ps.setString(4, pac.getFechanacimiento());
            ps.setInt(5, pac.getEdad());
            ps.setString(6, pac.getTelefono());
            ps.setString(7, pac.getDireccion());
            ps.setInt(8, pac.getSexo());
            ps.setInt(9, pac.getEst_civil());
            ps.setString(10, pac.getMail());
            ps.setString(11, pac.getRepresentante());
            ps.setString(12, pac.getFechaingreso());
            ps.setInt(13, pac.getId_per());
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

    public boolean modificarana(Anamnesi ana) {
        System.out.println("Hola anamnesis");

        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "UPDATE anamnesis SET tra_med=?, obs_tra=?, ing_med=?, obs_ing=?, rea_ale=?, obs_rea=?, hemo=?, obs_hem=?, irrad=?, obs_irr=?, sinu=?, obs_sin=?, enf_res=?, obs_enf=?, card=?, obs_car=?, diab=?, obs_dia=?, fie_reu=?, obs_fie=?, hepa=?, obs_hep=?, hiper=?, obs_hip=?, otras=?, cepillado=?, obs_cep=?, seda=?, obs_sed=?  WHERE id_ana=?";
        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, ana.getTra_med());
            ps.setString(2, ana.getObs_tra_med());
            ps.setString(3, ana.getIng_med());
            ps.setString(4, ana.getObs_ing_med());
            ps.setString(5, ana.getRea_ale());
            ps.setString(6, ana.getObs_rea_ale());
            ps.setString(7, ana.getHemo());
            ps.setString(8, ana.getObs_hemo());
            ps.setString(9, ana.getIrrad());
            ps.setString(10, ana.getObs_irrad());
            ps.setString(11, ana.getSinu());
            ps.setString(12, ana.getObs_sinu());
            ps.setString(13, ana.getEnf_res());
            ps.setString(14, ana.getObs_enf_res());
            ps.setString(15, ana.getCard());
            ps.setString(16, ana.getObs_card());
            ps.setString(17, ana.getDiab());
            ps.setString(18, ana.getObs_diab());
            ps.setString(19, ana.getFie_reu());
            ps.setString(20, ana.getObs_fie_reu());
            ps.setString(21, ana.getHepa());
            ps.setString(22, ana.getObs_hepa());
            ps.setString(23, ana.getHiper());
            ps.setString(24, ana.getObs_hiper());
            ps.setString(25, ana.getOtras());
            ps.setString(26, ana.getCepillado());
            ps.setString(27, ana.getObs_cepillado());
            ps.setString(28, ana.getSeda());
            ps.setString(29, ana.getObs_seda());
            ps.setInt(30, ana.getId_ana());

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

    public boolean modificarexa(Anamnesi exa) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "UPDATE exaestomatologicos SET tem_exa=?, pul_exa=?, ten_exa=?, res_exa=?, art_exa=?, lab_exa=?, len_exa=?, pal_exa=?, pis_exa=?, car_exa=?, gla_exa=?, max_exa=?, sen_exa=?, mus_exa=?, sis_ner=?, sis_vas=?, lin_exa=?, fun_exa=?, obs_exa=?   WHERE id_exa=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, exa.getTemper_exa());
            ps.setString(2, exa.getPulso_exa());
            ps.setString(3, exa.getTension_exa());
            ps.setString(4, exa.getRespira_exa());
            ps.setString(5, exa.getArt_exa());
            ps.setString(6, exa.getLab_exa());
            ps.setString(7, exa.getLen_exa());
            ps.setString(8, exa.getPal_exa());
            ps.setString(9, exa.getPis_exa());
            ps.setString(10, exa.getCar_exa());
            ps.setString(11, exa.getGla_exa());
            ps.setString(12, exa.getMax_exa());
            ps.setString(13, exa.getSen_exa());
            ps.setString(14, exa.getMus_exa());
            ps.setString(15, exa.getSis_ner());
            ps.setString(16, exa.getSis_vas());
            ps.setString(17, exa.getLin_exa());
            ps.setString(18, exa.getFun_exa());
            ps.setString(19, exa.getObs_exa());
            ps.setInt(20, exa.getId_exa());

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

    public boolean modificardia(Anamnesi dia, DetalleDiagnostico deta) {

        PreparedStatement ps = null;
        PreparedStatement psdeldet = null;
        PreparedStatement psdet = null;
        Connection con = getConexion();
        String sql = "UPDATE diagnosticos SET sup_num=?, abr_exad=?, man_exad=?, pat_pul=?, pla_bla=?, pla_cal=?, flu_den=?, otr_exad=?, obs_exad=?, cau_ext=?, fin_con=?, dia=?, pro=?, ope_tra=?, end_tra=?, per_tra=?, pro_tra=?, cir_tra=?, ort_tra=?, exo_tra=?, med_ora=?, otra_tra=?, pul_tra=?, pulpe_tra=?, exosim_tra=?   WHERE id_dia=?";
        String sqldeldet = "DELETE FROM detallediagnostico WHERE id_dia=?";
        String sqldetdia = "INSERT INTO detallediagnostico (id_dia, id_dx) VALUES (?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, dia.getSup_num());
            ps.setString(2, dia.getAbr_exad());
            ps.setString(3, dia.getMan_exad());
            ps.setString(4, dia.getPat_pul());
            ps.setString(5, dia.getPla_bla());
            ps.setString(6, dia.getPla_cal());
            ps.setString(7, dia.getFlu_den());
            ps.setString(8, dia.getOtr_exad());
            ps.setString(9, dia.getObs_exad());
            ps.setString(10, dia.getCau_ext());
            ps.setString(11, dia.getFin_con());
            ps.setString(12, dia.getDia());
            ps.setString(13, dia.getPro());
            ps.setString(14, dia.getOpe_tra());
            ps.setString(15, dia.getEnd_tra());
            ps.setString(16, dia.getPer_tra());
            ps.setString(17, dia.getPro_tra());
            ps.setString(18, dia.getCir_tra());
            ps.setString(19, dia.getOrt_tra());
            ps.setString(20, dia.getExo_tra());
            ps.setString(21, dia.getMed_ora());
            ps.setString(22, dia.getOtra_tra());
            ps.setString(23, dia.getPul_tra());
            ps.setString(24, dia.getPulpe_tra());
            ps.setString(25, dia.getExosim_tra());
            ps.setInt(26, dia.getId_dia());
            ps.execute();

            psdeldet = con.prepareStatement(sqldeldet);
            psdeldet.setInt(1, dia.getId_dia());
            psdeldet.execute();

            int x = frmCDRUDPaciente.jtDx.getRowCount();
            for (int i = 0; i < x; i++) {
                psdet = con.prepareStatement(sqldetdia);
                psdet.setInt(1, dia.getId_dia());
                psdet.setInt(2, Integer.parseInt(deta.matriz[i][0]));

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
