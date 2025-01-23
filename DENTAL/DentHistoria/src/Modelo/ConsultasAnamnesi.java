package Modelo;

import Vista.frmPaciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultasAnamnesi extends Conexion {

    public boolean registrar(Anamnesi ana) {

        PreparedStatement ps = null; //seleccionar el id_pac de la vista
        PreparedStatement psinsana = null;
        Connection con = getConexion();
        ResultSet rs = null;
        String sql = "SELECT id_pac FROM vistapacientes WHERE ced_per=?";
        String sqlinsana = "INSERT INTO anamnesis (id_pac, tra_med, obs_tra, ing_med, obs_ing, rea_ale, obs_rea, hemo, obs_hem, irrad, obs_irr, sinu, obs_sin, enf_res, obs_enf, card, obs_car, diab, obs_dia, fie_reu, obs_fie, hepa, obs_hep, hiper, obs_hip, otras, cepillado, obs_cep, seda, obs_sed) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {

            //BUSCAR EL ULTIMO
            ps = con.prepareStatement(sql);
            ps.setString(1, frmPaciente.txtcedula.getText());
            rs = ps.executeQuery();

            if (rs.next()) {
                ana.setId_pac(Integer.parseInt(rs.getString("id_pac")));

            }

            System.out.println("objeto ana id paciente:" + ana.getId_pac());

            //INSERT anamnesis
            psinsana = con.prepareStatement(sqlinsana);
            psinsana.setInt(1, ana.getId_pac());
            psinsana.setString(2, ana.getTra_med());
            psinsana.setString(3, ana.getObs_tra_med());
            psinsana.setString(4, ana.getIng_med());
            psinsana.setString(5, ana.getObs_ing_med());
            psinsana.setString(6, ana.getRea_ale());
            psinsana.setString(7, ana.getObs_rea_ale());
            psinsana.setString(8, ana.getHemo());
            psinsana.setString(9, ana.getObs_hemo());
            psinsana.setString(10, ana.getIrrad());
            psinsana.setString(11, ana.getObs_irrad());
            psinsana.setString(12, ana.getSinu());
            psinsana.setString(13, ana.getObs_sinu());
            psinsana.setString(14, ana.getEnf_res());
            psinsana.setString(15, ana.getObs_enf_res());
            psinsana.setString(16, ana.getCard());
            psinsana.setString(17, ana.getObs_card());
            psinsana.setString(18, ana.getDiab());
            psinsana.setString(19, ana.getObs_diab());
            psinsana.setString(20, ana.getFie_reu());
            psinsana.setString(21, ana.getObs_fie_reu());
            psinsana.setString(22, ana.getHepa());
            psinsana.setString(23, ana.getObs_hepa());
            psinsana.setString(24, ana.getHiper());
            psinsana.setString(25, ana.getObs_hiper());
            psinsana.setString(26, ana.getOtras());
            psinsana.setString(27, ana.getCepillado());
            psinsana.setString(28, ana.getObs_cepillado());
            psinsana.setString(29, ana.getSeda());
            psinsana.setString(30, ana.getObs_seda());

            psinsana.executeUpdate();

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

    public boolean registrarexa(Anamnesi ana) {

        PreparedStatement ps = null; //seleccionar el id_pac de la vista
        PreparedStatement psinsexa = null;
        Connection con = getConexion();
        ResultSet rs = null;
        String sql = "SELECT id_pac FROM vistapacientes WHERE ced_per=?";
        String sqlinsexa = "INSERT INTO exaestomatologicos (id_pac, tem_exa, pul_exa, ten_exa, res_exa, art_exa, lab_exa, len_exa, pal_exa, pis_exa, car_exa, gla_exa, max_exa, sen_exa, mus_exa, sis_ner, sis_vas, lin_exa, fun_exa, obs_exa) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {

            //BUSCAR EL ULTIMO
            ps = con.prepareStatement(sql);
            ps.setString(1, frmPaciente.txtcedula.getText());
            rs = ps.executeQuery();

            if (rs.next()) {
                ana.setId_pac(Integer.parseInt(rs.getString("id_pac")));

            }

            System.out.println("objeto ana id paciente:" + ana.getId_pac());

            //INSERT anamnesis
            psinsexa = con.prepareStatement(sqlinsexa);
            psinsexa.setInt(1, ana.getId_pac());
            psinsexa.setString(2, ana.getTemper_exa());
            psinsexa.setString(3, ana.getPulso_exa());
            psinsexa.setString(4, ana.getTension_exa());
            psinsexa.setString(5, ana.getRespira_exa());
            psinsexa.setString(6, ana.getArt_exa());
            psinsexa.setString(7, ana.getLab_exa());
            psinsexa.setString(8, ana.getLen_exa());
            psinsexa.setString(9, ana.getPal_exa());
            psinsexa.setString(10, ana.getPis_exa());
            psinsexa.setString(11, ana.getCar_exa());
            psinsexa.setString(12, ana.getGla_exa());
            psinsexa.setString(13, ana.getMax_exa());
            psinsexa.setString(14, ana.getSen_exa());
            psinsexa.setString(15, ana.getMus_exa());
            psinsexa.setString(16, ana.getSis_ner());
            psinsexa.setString(17, ana.getSis_vas());
            psinsexa.setString(18, ana.getLin_exa());
            psinsexa.setString(19, ana.getFun_exa());
            psinsexa.setString(20, ana.getObs_exa());

            psinsexa.executeUpdate();

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

    public boolean registrardia(Anamnesi ana, DetalleDiagnostico det) {

        PreparedStatement ps = null; //seleccionar el id_pac de la vista
        PreparedStatement psinsdia = null;
        PreparedStatement psiddia = null;
        PreparedStatement psdet = null;
        Connection con = getConexion();
        ResultSet rs = null;
        String sql = "SELECT id_pac FROM vistapacientes WHERE ced_per=?";
        String sqlinsdia = "INSERT INTO diagnosticos (id_pac, sup_num, abr_exad, man_exad, pat_pul, pla_bla, pla_cal, flu_den, otr_exad, obs_exad, cau_ext, fin_con, dia, pro, ope_tra, end_tra, per_tra, pro_tra, cir_tra, ort_tra, exo_tra, med_ora, otra_tra, pul_tra, pulpe_tra, exosim_tra) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        String sqliddia = "SELECT * FROM diagnosticos ORDER BY id_dia DESC LIMIT 1";
        String sqldetdia = "INSERT INTO detallediagnostico (id_dia, id_dx) VALUES (?,?)";

        try {

            //BUSCAR EL ULTIMO
            ps = con.prepareStatement(sql);
            ps.setString(1, frmPaciente.txtcedula.getText());
            rs = ps.executeQuery();

            if (rs.next()) {
                ana.setId_pac(Integer.parseInt(rs.getString("id_pac")));

            }

            System.out.println("objeto ana id paciente:" + ana.getId_pac());

            //INSERT diagnostico
            psinsdia = con.prepareStatement(sqlinsdia);
            psinsdia.setInt(1, ana.getId_pac());
            psinsdia.setString(2, ana.getSup_num());
            psinsdia.setString(3, ana.getAbr_exad());
            psinsdia.setString(4, ana.getMan_exad());
            psinsdia.setString(5, ana.getPat_pul());
            psinsdia.setString(6, ana.getPla_bla());
            psinsdia.setString(7, ana.getPla_cal());
            psinsdia.setString(8, ana.getFlu_den());
            psinsdia.setString(9, ana.getOtr_exad());
            psinsdia.setString(10, ana.getObs_exad());
            psinsdia.setString(11, ana.getCau_ext());
            psinsdia.setString(12, ana.getFin_con());
            psinsdia.setString(13, ana.getDia());
            psinsdia.setString(14, ana.getPro());
            psinsdia.setString(15, ana.getOpe_tra());
            psinsdia.setString(16, ana.getEnd_tra());
            psinsdia.setString(17, ana.getPer_tra());
            psinsdia.setString(18, ana.getPro_tra());
            psinsdia.setString(19, ana.getCir_tra());
            psinsdia.setString(20, ana.getOrt_tra());
            psinsdia.setString(21, ana.getExo_tra());
            psinsdia.setString(22, ana.getMed_ora());
            psinsdia.setString(23, ana.getOtra_tra());
            psinsdia.setString(24, ana.getPul_tra());
            psinsdia.setString(25, ana.getPulpe_tra());
            psinsdia.setString(26, ana.getExosim_tra());

            psinsdia.executeUpdate();
            
            
             //.............. Obtener el id_dia que se Autogenero en la tabla 
            psiddia = con.prepareStatement(sqliddia);
            ResultSet rsdia = null;
            rsdia = psiddia.executeQuery();

            if (rsdia.next()) {
                ana.setId_dia(Integer.parseInt(rsdia.getString("id_dia")));
                System.out.println("encontrojajajaja" + ana.getId_dia());

            }
            
            int x = frmPaciente.jtDx.getRowCount();
            for (int i = 0; i < x; i++) {
                psdet = con.prepareStatement(sqldetdia);
                psdet.setInt(1, ana.getId_dia());
                psdet.setInt(2, Integer.parseInt(det.matriz[i][0]));
                
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
