package Controlador;

import Modelo.Anamnesi;
import Modelo.Conexion;
import Modelo.ConsultasAnamnesi;
import Modelo.ConsultasPaciente;
import Modelo.DetalleDiagnostico;
import Modelo.Paciente;
import Vista.frmCDRUDPaciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CtrlCRUDPaciente implements ActionListener {

    private Paciente mod;
    private ConsultasPaciente modc;
    private frmCDRUDPaciente frm;

    public CtrlCRUDPaciente(Paciente mod, ConsultasPaciente modc, frmCDRUDPaciente frm) {

        this.mod = mod;
        this.modc = modc;
        this.frm = frm;
        this.frm.btnModificarpersona.addActionListener(this);
        this.frm.btnModificarana.addActionListener(this);
        this.frm.btnModificarexa.addActionListener(this);
        this.frm.btnModificardia.addActionListener(this);

    }

    public void iniciar() {
        frm.setTitle("FORMULARIO DE CONSULTA DE PACIENTES");
        frm.setLocationRelativeTo(null);
        cargar("");
        frm.txtid_pac.setVisible(false);
        frm.txtid_per.setVisible(false);
        frm.txtid_anamnesis.setVisible(false);
        frm.txtid_exaestom.setVisible(false);
        frm.txtid_diagnostico.setVisible(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == frm.btnModificarpersona) {

            mod.setId_pac(Integer.parseInt(frm.txtid_pac.getText()));
            mod.setId_per(Integer.parseInt(frm.txtid_per.getText()));
            mod.setCedula(frm.txtcedula.getText());
            mod.setNombre(frm.txtnombre.getText());
            mod.setApellido(frm.txtapellido.getText());
            mod.setFechanacimiento(frm.txtfechanacimiento.getText());
            mod.setEdad(Integer.parseInt(frm.txtedad.getText()));
            mod.setTelefono(frm.txttelefono.getText());
            mod.setDireccion(frm.txtdireccion.getText());
            mod.setSexo(frm.cmbsexo.getSelectedIndex());
            mod.setEst_civil(frm.cmbestadocivil.getSelectedIndex());
            mod.setMail(frm.txtmail.getText());
            mod.setRepresentante(frm.txtrepresentante.getText());
            mod.setFechaingreso(frm.txtfechaingreso.getText());

            if (modc.modificarpersona(mod)) {
                JOptionPane.showMessageDialog(null, "Registro Actualizado");
                cargar("");
                // bloquear();

            } else {
                JOptionPane.showMessageDialog(null, "Problemas de coneccion... llame al técnico 0990232832");

            }

        }

        if (e.getSource() == frm.btnModificarana) {

            Anamnesi ana = new Anamnesi();

            ana.setId_ana(Integer.parseInt(frm.txtid_anamnesis.getText()));
            ana.setTra_med(String.valueOf(frm.cmbTrat_med.getSelectedItem()));
            ana.setObs_tra_med(frm.txtObs_trat_med.getText());
            ana.setIng_med((String) frm.cmbIngest_med.getSelectedItem());
            ana.setObs_ing_med(frm.txtObs_Ing_med.getText());
            ana.setRea_ale((String) frm.cmbReac_aler.getSelectedItem());
            ana.setObs_rea_ale(frm.txtObsReacAler.getText());
            ana.setHemo((String) frm.cmbHemorragias.getSelectedItem());
            ana.setObs_hemo(frm.txtObs_Hemo.getText());
            ana.setIrrad((String) frm.cmbIrradiaciones.getSelectedItem());
            ana.setObs_irrad(frm.txtIrrad.getText());
            ana.setSinu((String) frm.cmbSinusitis.getSelectedItem());
            ana.setObs_sinu(frm.txtSinusitis.getText());
            ana.setEnf_res((String) frm.cmbEnf_resp.getSelectedItem());
            ana.setObs_enf_res(frm.txtEnfResp.getText());
            ana.setCard((String) frm.cmbCardiopatias.getSelectedItem());
            ana.setObs_card(frm.txtCardio.getText());
            ana.setDiab((String) frm.cmbDiabetes.getSelectedItem());
            ana.setObs_diab(frm.txtDiab.getText());
            ana.setFie_reu((String) frm.cmbFieb_reum.getSelectedItem());
            ana.setObs_fie_reu(frm.txtFiebReum.getText());
            ana.setHepa((String) frm.cmbHepatitis.getSelectedItem());
            ana.setObs_hepa(frm.txtHepa.getText());
            ana.setHiper((String) frm.cmbHipertension.getSelectedItem());
            ana.setObs_hiper(frm.txtHiperT.getText());
            ana.setOtras(frm.txtOtras_enf.getText());
            ana.setCepillado((String) frm.cmbCepillado.getSelectedItem());
            ana.setObs_cepillado(frm.txtCepi.getText());
            ana.setSeda((String) frm.cmbSeda.getSelectedItem());
            ana.setObs_seda(frm.txtSeda.getText());

            if (modc.modificarana(ana)) {
                JOptionPane.showMessageDialog(null, "Anamnesis Actualizada");
                cargar("");
                // bloquear();

            } else {
                JOptionPane.showMessageDialog(null, "Problemas de coneccion... llame al técnico 0990232832");

            }

        }

        if (e.getSource() == frm.btnModificarexa) {

            System.out.println("Examen Estomatologico");

            Anamnesi exa = new Anamnesi();

            exa.setId_exa(Integer.parseInt(frm.txtid_exaestom.getText()));
            exa.setTemper_exa(frm.txttemper.getText());
            exa.setPulso_exa(frm.txtpulso.getText());
            exa.setTension_exa(frm.txttension.getText());
            exa.setRespira_exa(frm.txtrespiracion.getText());
            exa.setArt_exa(String.valueOf(frm.cmbArtTemporo.getSelectedItem()));
            exa.setLab_exa(String.valueOf(frm.cmbLabio.getSelectedItem()));
            exa.setLen_exa(String.valueOf(frm.cmbLengua.getSelectedItem()));
            exa.setPal_exa(String.valueOf(frm.cmbPaladar.getSelectedItem()));
            exa.setPis_exa(String.valueOf(frm.cmbPisoBoca.getSelectedItem()));
            exa.setCar_exa(String.valueOf(frm.cmbCarrillo.getSelectedItem()));
            exa.setGla_exa(String.valueOf(frm.cmbglandulas.getSelectedItem()));
            exa.setMax_exa(String.valueOf(frm.cmbMaxilares.getSelectedItem()));
            exa.setSen_exa(String.valueOf(frm.cmbSenosMaxi.getSelectedItem()));
            exa.setMus_exa(String.valueOf(frm.cmbMusc.getSelectedItem()));
            exa.setSis_ner(String.valueOf(frm.cmbSisNerv.getSelectedItem()));
            exa.setSis_vas(String.valueOf(frm.cmbSisVas.getSelectedItem()));
            exa.setLin_exa(String.valueOf(frm.cmbLinfReg.getSelectedItem()));
            exa.setFun_exa(String.valueOf(frm.cmbFuncion.getSelectedItem()));
            exa.setObs_exa(frm.txtobsexa.getText());
            
            
            if (modc.modificarexa(exa)) {
                JOptionPane.showMessageDialog(null, "EXAMEN ACTUALIZADO");
                //bloquear();
                cargar("");

            } else {
                JOptionPane.showMessageDialog(null, "Problemas de coneccion... llame al técnico 0990232832");

            }
          
        }
        
        if (e.getSource() == frm.btnModificardia) {

            System.out.println("DIAGNOSTICO");

            Anamnesi dia = new Anamnesi();
            
            int fil = frm.jtDx.getRowCount();
            if (fil == 0) {
                JOptionPane.showMessageDialog(null, "DESE SELECCIONAR AL MENOS 1 Dx");
            }else{
                

            
            System.out.println("DIAGNOSTICO ");
            dia.setId_dia(Integer.parseInt(frm.txtid_diagnostico.getText()));
            dia.setSup_num((String) frm.cmbsuper_num.getSelectedItem());
            dia.setAbr_exad((String) frm.cmbabra_exad.getSelectedItem());
            dia.setMan_exad((String) frm.cmbmanchas_exad.getSelectedItem());
            dia.setPat_pul((String) frm.cmbpatologia_pul.getSelectedItem());
            dia.setPla_bla((String) frm.cmbplaca_blan.getSelectedItem());
            dia.setPla_cal((String) frm.cmbplaca_cal.getSelectedItem());
            dia.setFlu_den((String) frm.cmbfluorosis_den.getSelectedItem());
            dia.setOtr_exad((String) frm.txtotras_exad.getText());
            dia.setObs_exad((String) frm.txtobserb_exad.getText());
            dia.setCau_ext((String) frm.cmbcausa_ext.getSelectedItem());
            dia.setFin_con((String) frm.cmbfinalid_con.getSelectedItem());
            dia.setDia((String) frm.txtdiagnos.getText());
            dia.setPro((String) frm.txtpronost.getText());
            dia.setOpe_tra((String) frm.cmboperat_tra.getSelectedItem());
            dia.setEnd_tra((String) frm.cmbendod_tra.getSelectedItem());
            dia.setPer_tra((String) frm.cmbperiod_tra.getSelectedItem());
            dia.setPro_tra((String) frm.cmbprote_tra.getSelectedItem());
            dia.setCir_tra((String) frm.cmbciruj_tra.getSelectedItem());
            dia.setOrt_tra((String) frm.cmbortod_tra.getSelectedItem());
            dia.setExo_tra((String) frm.cmbexodon_tra.getSelectedItem());
            dia.setMed_ora((String) frm.cmbmedici_tra.getSelectedItem());
            dia.setOtra_tra((String) frm.txtotro_tra.getText());
            dia.setPul_tra((String) frm.cmbpul_tra.getSelectedItem());
            dia.setPulpe_tra((String) frm.cmbpulpec_tra.getSelectedItem());
            dia.setExosim_tra((String) frm.cmbexosim_tra.getSelectedItem());

            System.out.println("DIAGNOSTICO XD ");
            
            
            //FILAS Y COLUMNAS PARA CREAR EL OBJETO DETALLEDIAGNOSTICO
            int filas = frm.jtDx.getRowCount();
            int columnas = 2;

            DetalleDiagnostico deta = new DetalleDiagnostico(filas, columnas);
            deta.datosdia();//LLENAMOS LA MATRIZ CON EL METODO datos() tomando los datos del jtDX
            System.out.println(deta);
            
            if (modc.modificardia(dia, deta)) {
                JOptionPane.showMessageDialog(null, "DIAGNOSTICO ACTUALIZADO");
                //bloquear();

            } else {
                JOptionPane.showMessageDialog(null, "Problemas de coneccion... llame al técnico 0990232832");

            }
            
            
            

            
            }
            
        }
        
        

    }

    public void cargar(String valor) {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            frm.jtPacientes.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;

            Conexion conn = new Conexion();
            Connection con = conn.getConexion();
            String sql = "SELECT id_pac, ced_per, nom_per, ape_per, edad_per FROM vistapacientes WHERE nom_per LIKE '%" + valor + "%'";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = rs.getMetaData();

            int cantidadcolumnas = rsMd.getColumnCount();

            modelo.addColumn("COD.");
            modelo.addColumn("CEDULA");
            modelo.addColumn("NOMBRES");
            modelo.addColumn("APELLIDOS");
            modelo.addColumn("EDAD");

            while (rs.next()) {

                Object[] filas = new Object[cantidadcolumnas];
                for (int i = 0; i < cantidadcolumnas; i++) {
                    filas[i] = rs.getObject(i + 1);

                }
                modelo.addRow(filas);
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }

    }

}
