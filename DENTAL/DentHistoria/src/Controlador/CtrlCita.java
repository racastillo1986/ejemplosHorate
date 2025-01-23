package Controlador;

import Modelo.Cita;
import Modelo.Conexion;
import Modelo.ConsultasCita;
import Modelo.DetalleCita;
import Vista.frmCita;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CtrlCita implements ActionListener {

    private Cita mod;
    private ConsultasCita modc;
    private frmCita frm;

    public CtrlCita(Cita mod, ConsultasCita modc, frmCita frm) {
        this.mod = mod;
        this.modc = modc;
        this.frm = frm;
        this.frm.btnGuardar.addActionListener(this);
        this.frm.btnMostrar.addActionListener(this);
    }

    public void iniciar() {
        frm.setTitle("CONTROL DE CITAS");
        frm.setLocationRelativeTo(null);
        frm.txtidcita.setVisible(false);
        frm.txtruta.setVisible(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == frm.btnGuardar) {
            if (!"".equals(frm.txtcedula.getText())) {
            System.out.println("Acceso al controlador de cita");

            mod.setId_pac(Integer.parseInt(frm.txtid_pac.getText()));
            mod.setFec_cit(String.valueOf(frm.txtFecha.getText()));
            mod.setMot_cit(String.valueOf(frm.txtmotivo.getText()));
            mod.setCau_cit(String.valueOf(frm.txtcausa.getText()));

            //Detalle de la CITA
            //enviar a DETALLECITAS el numero de filas y columnas
            int filas = frm.jtTrat_Citas.getRowCount();
            int columnas = 4;

            DetalleCita det = new DetalleCita(filas, columnas);
            det.datos();
            System.out.println(det);

            if (modc.registrar(mod, det)) {
                JOptionPane.showMessageDialog(null, "Registro guardado");
                //bloquear();

            } else {
                JOptionPane.showMessageDialog(null, "Problemas de coneccion... llame al técnico 0990232832");

            }
            }else {
                JOptionPane.showMessageDialog(null, "PORFAVOR PRIMERO LLENE LOS CAMPOS DE DATOS PERSONALES");
            }

        }

        if (e.getSource() == frm.btnMostrar) {
            cargar(Integer.parseInt(frm.txtid_pac.getText()));

        }

    }

    public void cargar(int valor) {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            frm.jtregistrocitas.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;

            Conexion conn = new Conexion();
            Connection con = conn.getConexion();
            String sql = "SELECT id_cit, fec_cit, mot_cit, cau_cit FROM citas WHERE id_pac=" + valor + " ORDER BY fec_cit ";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = rs.getMetaData();

            int cantidadcolumnas = rsMd.getColumnCount();

            modelo.addColumn("COD.");
            modelo.addColumn("FECHA");
            modelo.addColumn("MOTIVO");
            modelo.addColumn("CAUSA");

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
