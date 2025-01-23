package Controlador;

import Modelo.Anamnesi;
import Modelo.ConsultasAnamnesi;
import Modelo.DetalleDiagnostico;
import Vista.frmPaciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CtrlAnamnesi implements ActionListener {

    private Anamnesi mod;
    private ConsultasAnamnesi modc;
    private frmPaciente frm;

    public CtrlAnamnesi(Anamnesi mod, ConsultasAnamnesi modc, frmPaciente frm) {
        this.mod = mod;
        this.modc = modc;
        this.frm = frm;
        this.frm.btnGrabaAnamnesis.addActionListener(this);
        this.frm.btnGrabaExamen.addActionListener(this);
        this.frm.btnGrabaDiagnostico.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm.btnGrabaAnamnesis) {
            System.out.println("controlador");

            if (!"".equals(frm.txtcedula.getText())) {

                mod.setTra_med(String.valueOf(frm.cmbTrat_med.getSelectedItem()));
                mod.setObs_tra_med(frm.txtObs_trat_med.getText());
                mod.setIng_med((String) frm.cmbIngest_med.getSelectedItem());
                mod.setObs_ing_med(frm.txtObs_Ing_med.getText());
                mod.setRea_ale((String) frm.cmbReac_aler.getSelectedItem());
                mod.setObs_rea_ale(frm.txtObsReacAler.getText());
                mod.setHemo((String) frm.cmbHemorragias.getSelectedItem());
                mod.setObs_hemo(frm.txtObs_Hemo.getText());
                mod.setIrrad((String) frm.cmbIrradiaciones.getSelectedItem());
                mod.setObs_irrad(frm.txtIrrad.getText());
                mod.setSinu((String) frm.cmbSinusitis.getSelectedItem());
                mod.setObs_sinu(frm.txtSinusitis.getText());
                mod.setEnf_res((String) frm.cmbEnf_resp.getSelectedItem());
                mod.setObs_enf_res(frm.txtEnfResp.getText());
                mod.setCard((String) frm.cmbCardiopatias.getSelectedItem());
                mod.setObs_card(frm.txtCardio.getText());
                mod.setDiab((String) frm.cmbDiabetes.getSelectedItem());
                mod.setObs_diab(frm.txtDiab.getText());
                mod.setFie_reu((String) frm.cmbFieb_reum.getSelectedItem());
                mod.setObs_fie_reu(frm.txtFiebReum.getText());
                mod.setHepa((String) frm.cmbHepatitis.getSelectedItem());
                mod.setObs_hepa(frm.txtHepa.getText());
                mod.setHiper((String) frm.cmbHipertension.getSelectedItem());
                mod.setObs_hiper(frm.txtHiperT.getText());
                mod.setOtras(frm.txtOtras_enf.getText());
                mod.setCepillado((String) frm.cmbCepillado.getSelectedItem());
                mod.setObs_cepillado(frm.txtCepi.getText());
                mod.setSeda((String) frm.cmbSeda.getSelectedItem());
                mod.setObs_seda(frm.txtSeda.getText());

                System.out.println("Tratamiento medico: " + mod.getTra_med());

                if (modc.registrar(mod)) {
                    JOptionPane.showMessageDialog(null, "Registro guardado");
                    //bloquear();

                } else {
                    JOptionPane.showMessageDialog(null, "Problemas de coneccion/Paciente aun no se ha registrado... llame al técnico 0990232832");

                }
            } else {
                JOptionPane.showMessageDialog(null, "PORFAVOR PRIMERO LLENE LOS CAMPOS DE DATOS PERSONALES/y/o/ CAMPOS DE EXAMEN");
            }

        }

        if (e.getSource() == frm.btnGrabaExamen) {
            if (!"".equals(frm.txtcedula.getText()) &&!"".equals(frm.txttemper.getText()) && !"".equals(frm.txtpulso.getText()) && !"".equals(frm.txttension.getText()) && !"".equals(frm.txtrespiracion.getText())  ) {
                System.out.println("Examen Estomatologico");
                mod.setTemper_exa(frm.txttemper.getText());
                mod.setPulso_exa(frm.txtpulso.getText());
                mod.setTension_exa(frm.txttension.getText());
                mod.setRespira_exa(frm.txtrespiracion.getText());
                mod.setArt_exa(String.valueOf(frm.cmbArtTemporo.getSelectedItem()));
                mod.setLab_exa(String.valueOf(frm.cmbLabio.getSelectedItem()));
                mod.setLen_exa(String.valueOf(frm.cmbLengua.getSelectedItem()));
                mod.setPal_exa(String.valueOf(frm.cmbPaladar.getSelectedItem()));
                mod.setPis_exa(String.valueOf(frm.cmbPisoBoca.getSelectedItem()));
                mod.setCar_exa(String.valueOf(frm.cmbCarrillo.getSelectedItem()));
                mod.setGla_exa(String.valueOf(frm.cmbglandulas.getSelectedItem()));
                mod.setMax_exa(String.valueOf(frm.cmbMaxilares.getSelectedItem()));
                mod.setSen_exa(String.valueOf(frm.cmbSenosMaxi.getSelectedItem()));
                mod.setMus_exa(String.valueOf(frm.cmbMusc.getSelectedItem()));
                mod.setSis_ner(String.valueOf(frm.cmbSisNerv.getSelectedItem()));
                mod.setSis_vas(String.valueOf(frm.cmbSisVas.getSelectedItem()));
                mod.setLin_exa(String.valueOf(frm.cmbLinfReg.getSelectedItem()));
                mod.setFun_exa(String.valueOf(frm.cmbFuncion.getSelectedItem()));
                mod.setObs_exa(frm.txtareaObservacion.getText());

                System.out.println("Temperatura: " + mod.getTemper_exa());
                System.out.println("Primer combo Art temporo maxilar: " + mod.getArt_exa());

                if (modc.registrarexa(mod)) {
                    JOptionPane.showMessageDialog(null, "Registro guardado");
                    //bloquear();

                } else {
                    JOptionPane.showMessageDialog(null, "Problemas de coneccion... llame al técnico 0990232832");

                }
            } else {
                JOptionPane.showMessageDialog(null, "PORFAVOR PRIMERO LLENE LOS CAMPOS DE DATOS PERSONALES");
            }

        }

        if (e.getSource() == frm.btnGrabaDiagnostico) {
            if (!"".equals(frm.txtcedula.getText())) {

                int fil = frm.jtDx.getRowCount();
                if (fil == 0) {
                    JOptionPane.showMessageDialog(null, "DESE SELECCIONAR AL MENOS 1 Dx");
                } else {

                    System.out.println("DIAGNOSTICO ");
                    mod.setSup_num((String) frm.cmbsuper_num.getSelectedItem());
                    mod.setAbr_exad((String) frm.cmbabra_exad.getSelectedItem());
                    mod.setMan_exad((String) frm.cmbmanchas_exad.getSelectedItem());
                    mod.setPat_pul((String) frm.cmbpatologia_pul.getSelectedItem());
                    mod.setPla_bla((String) frm.cmbplaca_blan.getSelectedItem());
                    mod.setPla_cal((String) frm.cmbplaca_cal.getSelectedItem());
                    mod.setFlu_den((String) frm.cmbfluorosis_den.getSelectedItem());
                    mod.setOtr_exad((String) frm.txtotras_exad.getText());
                    mod.setObs_exad((String) frm.txtobserb_exad.getText());
                    mod.setCau_ext((String) frm.cmbcausa_ext.getSelectedItem());
                    mod.setFin_con((String) frm.cmbfinalid_con.getSelectedItem());
                    mod.setDia((String) frm.txtdiagnos.getText());
                    mod.setPro((String) frm.txtpronost.getText());
                    mod.setOpe_tra((String) frm.cmboperat_tra.getSelectedItem());
                    mod.setEnd_tra((String) frm.cmbendod_tra.getSelectedItem());
                    mod.setPer_tra((String) frm.cmbperiod_tra.getSelectedItem());
                    mod.setPro_tra((String) frm.cmbprote_tra.getSelectedItem());
                    mod.setCir_tra((String) frm.cmbciruj_tra.getSelectedItem());
                    mod.setOrt_tra((String) frm.cmbortod_tra.getSelectedItem());
                    mod.setExo_tra((String) frm.cmbexodon_tra.getSelectedItem());
                    mod.setMed_ora((String) frm.cmbmedici_tra.getSelectedItem());
                    mod.setOtra_tra((String) frm.txtotro_tra.getText());
                    mod.setPul_tra((String) frm.cmbpul_tra.getSelectedItem());
                    mod.setPulpe_tra((String) frm.cmbpulpec_tra.getSelectedItem());
                    mod.setExosim_tra((String) frm.cmbexosim_tra.getSelectedItem());

                    System.out.println("DIAGNOSTICO XD ");

                    //FILAS Y COLUMNAS PARA CREAR EL OBJETO DETALLEDIAGNOSTICO
                    int filas = frm.jtDx.getRowCount();
                    int columnas = 2;

                    DetalleDiagnostico deta = new DetalleDiagnostico(filas, columnas);
                    deta.datos();               //LLENAMOS LA MATRIZ CON EL METODO datos() tomando los datos del jtDX
                    System.out.println(deta);

                    if (modc.registrardia(mod, deta)) {
                        JOptionPane.showMessageDialog(null, "Registro guardado");
                        //bloquear();

                    } else {
                        JOptionPane.showMessageDialog(null, "Problemas de coneccion... llame al técnico 0990232832");

                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "PORFAVOR PRIMERO LLENE LOS CAMPOS DE DATOS PERSONALES");
            }

        }

    }

}
