package Controlador;

import Modelo.Conexion;
import Modelo.ConsultasPersonas;
import Modelo.Personas;
import Vista.frmPersonalclik;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CtrlPersonas implements ActionListener {

    private final Personas mod;
    private final ConsultasPersonas modc;
    private final frmPersonalclik frm;

    public CtrlPersonas(Personas mod, ConsultasPersonas modc, frmPersonalclik frm) {
        this.mod = mod;
        this.modc = modc;
        this.frm = frm;
        this.frm.btnGuardar.addActionListener(this);
        this.frm.btnModificar.addActionListener(this);
        this.frm.btnEliminar.addActionListener(this);
        this.frm.btnLimpiar.addActionListener(this);

    }

    public void iniciar() {
        frm.setTitle("INSUMOS");
        frm.setLocationRelativeTo(null);
        //bloquear();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == frm.btnGuardar) {

            mod.setCed_per(frm.txtcedula.getText());
            mod.setNom_per(frm.txtnombre.getText());
            mod.setMail_per(frm.txtmail.getText());
            mod.setTel_per(frm.txttelefono.getText());
            mod.setEdad_per(frm.txtedad.getText());
            mod.setPue_click(frm.txtpuesto.getText());
            //mod.setCan_per(frm.txtcanton.getText());

            if (modc.registrar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro guardado");
                limpiar();
                cargar("");
            } else {
                JOptionPane.showMessageDialog(null, "Problemas de coneccion... llame al técnico 0990232832");
                limpiar();
            }

        }

        if (e.getSource() == frm.btnModificar) {

            mod.setId_click(Integer.parseInt(frm.txtid_click.getText()));
            mod.setCed_per(frm.txtcedula.getText());
            mod.setNom_per(frm.txtnombre.getText());
            mod.setMail_per(frm.txtmail.getText());
            mod.setTel_per(frm.txttelefono.getText());
            mod.setEdad_per(frm.txtedad.getText());
            mod.setPue_click(frm.txtpuesto.getText());
            
            
            /*System.out.println(mod.getId_click());
            System.out.println(mod.getCed_per());
            System.out.println(mod.getNom_per());
            System.out.println( mod.getMail_per());
            System.out.println(mod.getTel_per());
            System.out.println(mod.getEdad_per());
            System.out.println(mod.getPue_click());
            */
            

           if (modc.modificar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
                cargar("");
            } else {
                JOptionPane.showMessageDialog(null, "Problemas de coneccion... llame al técnico 0990232832");
                limpiar();
            }

        }

        if (e.getSource() == frm.btnEliminar) {

            mod.setCed_per(frm.txtcedula.getText());

            if (modc.eliminar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
                cargar("");
            } else {
                JOptionPane.showMessageDialog(null, "Problemas de coneccion... llame al técnico 0990232832");
                limpiar();
            }

        }

        if (e.getSource() == frm.btnLimpiar) {

            limpiar();

        }

    }

    public void limpiar() {
        frm.txtid_click.setText(null);
        frm.txtnombre.setText(null);
        frm.txtmail.setText(null);
        frm.txttelefono.setText(null);
        frm.txtcedula.setText(null);
        frm.txtedad.setText(null);
        frm.txtpuesto.setText(null);
        //frm.txtcanton.setText(null);

    }

    public void cargar(String valor) {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            frm.jtPersonas.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;

            Conexion conn = new Conexion();
            Connection con = conn.getConexion();
            String sql = "SELECT id_click, ced_per, nom_per, mail_per, tel_per FROM vistaclick WHERE nom_per LIKE '%" + valor + "%'";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = rs.getMetaData();

            int cantidadcolumnas = rsMd.getColumnCount();

            modelo.addColumn("COD.");
            modelo.addColumn("CEDULA");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("CORREO");
            modelo.addColumn("TELEFONO");

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
