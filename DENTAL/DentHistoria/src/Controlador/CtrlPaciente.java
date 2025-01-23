package Controlador;

import Modelo.ConsultasPaciente;
import Modelo.Paciente;
import Vista.frmPaciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CtrlPaciente implements ActionListener {

    private Paciente mod;
    private ConsultasPaciente modc;
    private frmPaciente frm;

    public CtrlPaciente(Paciente mod, ConsultasPaciente modc, frmPaciente frm) {
        this.mod = mod;
        this.modc = modc;
        this.frm = frm;
        this.frm.btnGrabaPersona.addActionListener(this);

    }

    public void iniciar() {
        frm.setTitle("Registro de Pacientes");
        frm.setLocationRelativeTo(null);
        //frm.btnCargarfoto.setEnabled(false);
        //frm.txtid_pac.setVisible(false);
        //frm.txtid_per.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm.btnGrabaPersona) {

            if (!"".equals(frm.txtcedula.getText()) && !"".equals(frm.txtnombre.getText()) && !"".equals(frm.txtapellido.getText()) && !"".equals(frm.txtdireccion.getText()) && !"".equals(frm.txtfechanacimiento.getText()) && !"".equals(frm.txtedad.getText()) && !"".equals(frm.txttelefono.getText())  ) {
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

                if (modc.registrar(mod)) {
                    JOptionPane.showMessageDialog(null, "Registro guardado");
                    frm.btnCargarfoto.setEnabled(true);
                    frm.btnGrabaPersona.setEnabled(false);
                    frm.val = 1;
                    // bloquear();

                } else {
                    JOptionPane.showMessageDialog(null, "Registro no se puede guardar/Cedula ya existe... llame al técnico ");

                }
            } else {
                JOptionPane.showMessageDialog(null, "PORFAVOR PRIMERO LLENE LOS CAMPOS DE DATOS PERSONALES");
            }
        }

    }

    void bloquear() {
        frm.txtcedula.setEnabled(false);
        frm.txtnombre.setEnabled(false);
        frm.txtapellido.setEnabled(false);
        frm.txtfechanacimiento.setEnabled(false);
        frm.txtedad.setEnabled(false);
        frm.txttelefono.setEnabled(false);
        frm.txtdireccion.setEnabled(false);
        frm.cmbsexo.setEnabled(false);
        frm.cmbestadocivil.setEnabled(false);
        frm.txtmail.setEnabled(false);
        frm.txtrepresentante.setEnabled(false);
        frm.txtfechaingreso.setEnabled(false);
        frm.btnGrabaPersona.setEnabled(false);
    }

}
