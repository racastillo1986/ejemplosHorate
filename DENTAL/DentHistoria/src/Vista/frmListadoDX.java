/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Armandfly
 */
public class frmListadoDX extends javax.swing.JFrame {

    DefaultTableModel m;

    /**
     * Creates new form frmListadoDX
     */
    public frmListadoDX() {
        initComponents();
        cargardatos("");
    }

    void cargardatos(String valor) {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            jtTabla.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;

            Conexion conn = new Conexion();
            Connection con = conn.getConexion();
            String sql = "SELECT   id_dx ,dx FROM dx WHERE dx LIKE '%" + valor + "%'";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = rs.getMetaData();

            int cantidadcolumnas = rsMd.getColumnCount();

            modelo.addColumn("cod.");
            modelo.addColumn("Dx(Nombre)");

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        txtBuscartabla = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jMenuItem1.setText("ENVIAR");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD.", "Dx. (NOMBRE)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtTabla.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jtTabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 72, -1, 360));

        txtBuscartabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscartablaKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscartabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 32, 250, -1));

        jButton1.setText("REGISTRAR Dx");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 31, -1, -1));

        jButton2.setText("SALIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 31, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/HD-Wallpapers1_FOSmVKg.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int fsel = jtTabla.getSelectedRow();

        try {

            String codigo, nombre;

            if (fsel == -1) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una fila", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {

                m = (DefaultTableModel) jtTabla.getModel();
                codigo = jtTabla.getValueAt(fsel, 0).toString();
                nombre = jtTabla.getValueAt(fsel, 1).toString();
                
                m = (DefaultTableModel) frmPaciente.jtDx.getModel();
                String filaelemento[] = {codigo, nombre};
               

                m.addRow(filaelemento);
                
            }
            
        } catch (Exception e) {
        }


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txtBuscartablaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscartablaKeyReleased
        // TODO add your handling code here:
        cargardatos(txtBuscartabla.getText()); 
    }//GEN-LAST:event_txtBuscartablaKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmListadoDX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmListadoDX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmListadoDX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmListadoDX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmListadoDX().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jtTabla;
    private javax.swing.JTextField txtBuscartabla;
    // End of variables declaration//GEN-END:variables
}
