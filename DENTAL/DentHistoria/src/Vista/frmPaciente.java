/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Conexion;
import Modelo.Paciente;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Armandfly
 */
public class frmPaciente extends javax.swing.JFrame {

    public int val = 0;

    public frmPaciente() {
        initComponents();
        txtfechaingreso.setText(fechasistema());
        jLabel1.setVisible(false);
        txtid_pac.setVisible(false);
        txtid_per.setVisible(false);
    }

    public static String fechasistema() {

        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtid_pac = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtfechanacimiento = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        cmbsexo = new javax.swing.JComboBox();
        cmbestadocivil = new javax.swing.JComboBox();
        txtdireccion = new javax.swing.JTextField();
        txtrepresentante = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        txtmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnGrabaPersona = new javax.swing.JToggleButton();
        txtfechaingreso = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblfotoperfil = new javax.swing.JLabel();
        btnCargarfoto = new javax.swing.JToggleButton();
        txtrutaperfil = new javax.swing.JTextField();
        txtid_per = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        cmbTrat_med = new javax.swing.JComboBox();
        cmbIngest_med = new javax.swing.JComboBox();
        cmbReac_aler = new javax.swing.JComboBox();
        txtObs_trat_med = new javax.swing.JTextField();
        cmbHemorragias = new javax.swing.JComboBox();
        cmbIrradiaciones = new javax.swing.JComboBox();
        cmbSinusitis = new javax.swing.JComboBox();
        cmbEnf_resp = new javax.swing.JComboBox();
        cmbCardiopatias = new javax.swing.JComboBox();
        cmbDiabetes = new javax.swing.JComboBox();
        cmbFieb_reum = new javax.swing.JComboBox();
        cmbHepatitis = new javax.swing.JComboBox();
        cmbHipertension = new javax.swing.JComboBox();
        txtOtras_enf = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtObs_Ing_med = new javax.swing.JTextField();
        txtObsReacAler = new javax.swing.JTextField();
        txtObs_Hemo = new javax.swing.JTextField();
        txtIrrad = new javax.swing.JTextField();
        txtSinusitis = new javax.swing.JTextField();
        txtEnfResp = new javax.swing.JTextField();
        txtCardio = new javax.swing.JTextField();
        txtDiab = new javax.swing.JTextField();
        txtFiebReum = new javax.swing.JTextField();
        txtHepa = new javax.swing.JTextField();
        txtHiperT = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cmbCepillado = new javax.swing.JComboBox();
        cmbSeda = new javax.swing.JComboBox();
        jLabel31 = new javax.swing.JLabel();
        txtCepi = new javax.swing.JTextField();
        txtSeda = new javax.swing.JTextField();
        btnGrabaAnamnesis = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        txttemper = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtrespiracion = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtpulso = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txttension = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        cmbArtTemporo = new javax.swing.JComboBox();
        cmbLabio = new javax.swing.JComboBox();
        cmbLengua = new javax.swing.JComboBox();
        cmbPaladar = new javax.swing.JComboBox();
        cmbPisoBoca = new javax.swing.JComboBox();
        cmbCarrillo = new javax.swing.JComboBox();
        cmbglandulas = new javax.swing.JComboBox();
        cmbMaxilares = new javax.swing.JComboBox();
        cmbSenosMaxi = new javax.swing.JComboBox();
        cmbMusc = new javax.swing.JComboBox();
        jLabel46 = new javax.swing.JLabel();
        cmbSisNerv = new javax.swing.JComboBox();
        jLabel47 = new javax.swing.JLabel();
        cmbSisVas = new javax.swing.JComboBox();
        jLabel48 = new javax.swing.JLabel();
        cmbLinfReg = new javax.swing.JComboBox();
        jLabel49 = new javax.swing.JLabel();
        cmbFuncion = new javax.swing.JComboBox();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaObservacion = new javax.swing.JTextArea();
        btnGrabaExamen = new javax.swing.JToggleButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        cmbsuper_num = new javax.swing.JComboBox();
        cmbabra_exad = new javax.swing.JComboBox();
        cmbmanchas_exad = new javax.swing.JComboBox();
        cmbpatologia_pul = new javax.swing.JComboBox();
        cmbplaca_blan = new javax.swing.JComboBox();
        cmbplaca_cal = new javax.swing.JComboBox();
        cmbfluorosis_den = new javax.swing.JComboBox();
        txtotras_exad = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        txtobserb_exad = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        cmbcausa_ext = new javax.swing.JComboBox();
        jLabel62 = new javax.swing.JLabel();
        cmbfinalid_con = new javax.swing.JComboBox();
        jLabel63 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDx = new javax.swing.JTable();
        btnAgragarDx = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtdiagnos = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtpronost = new javax.swing.JTextArea();
        btnEliminarDx = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        cmboperat_tra = new javax.swing.JComboBox();
        jLabel67 = new javax.swing.JLabel();
        cmbciruj_tra = new javax.swing.JComboBox();
        jLabel68 = new javax.swing.JLabel();
        cmbperiod_tra = new javax.swing.JComboBox();
        jLabel69 = new javax.swing.JLabel();
        cmbortod_tra = new javax.swing.JComboBox();
        jLabel70 = new javax.swing.JLabel();
        cmbmedici_tra = new javax.swing.JComboBox();
        jLabel71 = new javax.swing.JLabel();
        cmbexodon_tra = new javax.swing.JComboBox();
        jLabel72 = new javax.swing.JLabel();
        cmbendod_tra = new javax.swing.JComboBox();
        jLabel73 = new javax.swing.JLabel();
        cmbprote_tra = new javax.swing.JComboBox();
        jLabel74 = new javax.swing.JLabel();
        txtotro_tra = new javax.swing.JTextField();
        btnGrabaDiagnostico = new javax.swing.JButton();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        cmbpul_tra = new javax.swing.JComboBox();
        cmbpulpec_tra = new javax.swing.JComboBox();
        cmbexosim_tra = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane2.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Codigo");

        jLabel2.setText("Cedula");

        jLabel3.setText("Nombres");

        jLabel4.setText("Apellidos");

        jLabel5.setText("Fecha. Nacimiento");

        jLabel6.setText("Edad");

        jLabel7.setText("Sexo");

        jLabel10.setText("E. Civil");

        jLabel9.setText("Direccion");

        jLabel12.setText("Representante");

        txtid_pac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtid_pacActionPerformed(evt);
            }
        });

        cmbsexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MASCULINO", "FEMENINO" }));

        cmbestadocivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SOLTERO", "CASADO", " " }));

        txtrepresentante.setText("MISMO PACIENTE");

        jLabel13.setText("Telefono");

        jLabel14.setText("Mail");

        jLabel11.setText("Fecha de ingreso");

        btnGrabaPersona.setText("GRABAR DATOS PERSONALES");
        btnGrabaPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabaPersonaActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblfotoperfil, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblfotoperfil, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnCargarfoto.setText("BUSCAR FOTO");
        btnCargarfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarfotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(btnCargarfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtrutaperfil)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCargarfoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtrutaperfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel11))
                .addGap(40, 40, 40)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbestadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtapellido, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                        .addComponent(txtnombre)
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtfechanacimiento)
                        .addComponent(txtrepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txttelefono)
                        .addComponent(txtdireccion)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(txtid_pac, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtid_per, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtfechaingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnGrabaPersona)))
                .addGap(84, 84, 84))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid_pac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtid_per, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtfechanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbestadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtrepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGrabaPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtfechaingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 71, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("DATOS PERSONALES", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("13. Otras Enfermedades");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("1. Tratamiento Medico");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("2. Ingestion de medicamentos");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("3. Reacciones alergicas");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("4. Hemorragias");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("5. Irradiaciones");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("6. Sinusitis");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("8. Cardiopatias");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("7. Enfermedades respiratorias");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("9. Diabetes");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("10. Fiebre Reumatica");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("12. Hipertension Arterial");

        cmbTrat_med.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));

        cmbIngest_med.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));

        cmbReac_aler.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));

        txtObs_trat_med.setText("NINGUNA");

        cmbHemorragias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));

        cmbIrradiaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));

        cmbSinusitis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));

        cmbEnf_resp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));

        cmbCardiopatias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));

        cmbDiabetes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));

        cmbFieb_reum.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));

        cmbHepatitis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));

        cmbHipertension.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));

        txtOtras_enf.setText("NINGUNA");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("Observaciones");

        txtObs_Ing_med.setText("NINGUNA");
        txtObs_Ing_med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObs_Ing_medActionPerformed(evt);
            }
        });

        txtObsReacAler.setText("NINGUNA");

        txtObs_Hemo.setText("NINGUNA");

        txtIrrad.setText("NINGUNA");
        txtIrrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIrradActionPerformed(evt);
            }
        });

        txtSinusitis.setText("NINGUNA");

        txtEnfResp.setText("NINGUNA");

        txtCardio.setText("NINGUNA");
        txtCardio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCardioActionPerformed(evt);
            }
        });

        txtDiab.setText("NINGUNA");

        txtFiebReum.setText("NINGUNA");

        txtHepa.setText("NINGUNA");

        txtHiperT.setText("NINGUNA");

        jLabel27.setText("Hábito de higiene oral");

        jLabel29.setText("Cepillado");

        jLabel30.setText("Seda dental");

        cmbCepillado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));

        cmbSeda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));

        jLabel31.setText("Frecuendia(dia)");

        txtCepi.setText("0");

        txtSeda.setText("0");

        btnGrabaAnamnesis.setText("GRABAR DATOS");
        btnGrabaAnamnesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabaAnamnesisActionPerformed(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel75.setText("11. Hepatitis");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(jLabel28)
                        .addGap(243, 243, 243)
                        .addComponent(jLabel27)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel31))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(cmbHepatitis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtHepa, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(118, 118, 118)
                                        .addComponent(btnGrabaAnamnesis, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(cmbHipertension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtHiperT, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(cmbTrat_med, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtObs_trat_med, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(112, 112, 112)
                                        .addComponent(jLabel29)
                                        .addGap(38, 38, 38)
                                        .addComponent(cmbCepillado, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(txtCepi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(cmbIngest_med, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtObs_Ing_med, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(112, 112, 112)
                                        .addComponent(jLabel30)
                                        .addGap(24, 24, 24)
                                        .addComponent(cmbSeda, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(txtSeda, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(41, 41, 41))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(cmbReac_aler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtObsReacAler, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(93, 93, 93)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cmbIrradiaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cmbSinusitis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cmbEnf_resp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cmbCardiopatias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cmbDiabetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cmbFieb_reum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtSinusitis, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtIrrad, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtEnfResp, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtCardio, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtDiab, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtFiebReum, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(cmbHemorragias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtObs_Hemo, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(80, 80, 80)
                                        .addComponent(txtOtras_enf, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(31, 31, 31))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel31))))
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbTrat_med, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(txtObs_trat_med, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel29))
                    .addComponent(cmbCepillado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCepi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbIngest_med, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(txtObs_Ing_med, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel30))
                    .addComponent(cmbSeda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSeda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbReac_aler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtObsReacAler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel8)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbHemorragias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)
                                    .addComponent(txtObs_Hemo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(txtOtras_enf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbIrradiaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(txtIrrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbSinusitis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(txtSinusitis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbEnf_resp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(txtEnfResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCardiopatias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(txtCardio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbDiabetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(txtDiab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbFieb_reum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(txtFiebReum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnGrabaAnamnesis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbHipertension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtHiperT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbHepatitis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel75)
                                .addComponent(txtHepa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("ANAMNESIS", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setText("Temperatura:");

        txttemper.setText("37  ºC");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setText("Respiracion:");

        txtrespiracion.setText("21");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setText("Pulso:");

        txtpulso.setText("110");
        txtpulso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpulsoActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setText("Tension Arterial:");

        txttension.setText("110 / 70");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addComponent(txttemper, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel34)
                .addGap(18, 18, 18)
                .addComponent(txtpulso, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(jLabel35)
                .addGap(18, 18, 18)
                .addComponent(txttension, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(jLabel33)
                .addGap(30, 30, 30)
                .addComponent(txtrespiracion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txttemper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(txtpulso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(txttension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(txtrespiracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setText("1. Artic. Temporo_Mandib");
        jPanel7.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 21, -1, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setText("2. Labios");
        jPanel7.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 59, -1, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setText("3. Lengua");
        jPanel7.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 97, -1, -1));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setText("4. Paladar");
        jPanel7.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 135, -1, -1));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel40.setText("5. Piso de la boca");
        jPanel7.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 173, -1, -1));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setText("6. Carrillos");
        jPanel7.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 217, -1, -1));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel42.setText("7. Glandulas Salivales");
        jPanel7.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 258, -1, -1));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setText("8. Maxilares");
        jPanel7.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 296, -1, -1));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel44.setText("9. Senos Maxilares");
        jPanel7.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 334, -1, -1));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel45.setText("10. Musculos Masticadores");
        jPanel7.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 378, -1, -1));

        cmbArtTemporo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NORMAL", "ANORMAL" }));
        jPanel7.add(cmbArtTemporo, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 18, 110, -1));

        cmbLabio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NORMAL", "ANORMAL" }));
        jPanel7.add(cmbLabio, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 56, 110, -1));

        cmbLengua.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NORMAL", "ANORMAL" }));
        jPanel7.add(cmbLengua, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 94, 110, -1));

        cmbPaladar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NORMAL", "ANORMAL" }));
        jPanel7.add(cmbPaladar, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 132, 110, -1));

        cmbPisoBoca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NORMAL", "ANORMAL" }));
        jPanel7.add(cmbPisoBoca, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 170, 110, -1));

        cmbCarrillo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NORMAL", "ANORMAL" }));
        cmbCarrillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCarrilloActionPerformed(evt);
            }
        });
        jPanel7.add(cmbCarrillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 214, 110, -1));

        cmbglandulas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NORMAL", "ANORMAL" }));
        jPanel7.add(cmbglandulas, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 255, 110, -1));

        cmbMaxilares.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NORMAL", "ANORMAL" }));
        jPanel7.add(cmbMaxilares, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 293, 110, -1));

        cmbSenosMaxi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NORMAL", "ANORMAL" }));
        jPanel7.add(cmbSenosMaxi, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 331, 110, -1));

        cmbMusc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NORMAL", "ANORMAL" }));
        jPanel7.add(cmbMusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 375, 110, -1));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel46.setText("11. Sistema Nervioso");
        jPanel7.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 21, -1, -1));

        cmbSisNerv.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NORMAL", "ANORMAL" }));
        jPanel7.add(cmbSisNerv, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 18, 110, -1));

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel47.setText("12.Sistema Vascular");
        jPanel7.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 59, -1, -1));

        cmbSisVas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NORMAL", "ANORMAL" }));
        jPanel7.add(cmbSisVas, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 56, 110, -1));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel48.setText("13. Linfatico Regional");
        jPanel7.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 97, -1, -1));

        cmbLinfReg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NORMAL", "ANORMAL" }));
        jPanel7.add(cmbLinfReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 94, 110, -1));

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel49.setText("14. Funcion de oclucion");
        jPanel7.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 135, -1, -1));

        cmbFuncion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NORMAL", "ANORMAL" }));
        jPanel7.add(cmbFuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 132, 110, -1));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel50.setText("Observaciones:");
        jPanel7.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 173, -1, -1));

        txtareaObservacion.setColumns(20);
        txtareaObservacion.setRows(5);
        txtareaObservacion.setText("NINGUNA\n");
        jScrollPane1.setViewportView(txtareaObservacion);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 214, 252, 50));

        btnGrabaExamen.setText("GRABA EXAMEN");
        btnGrabaExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabaExamenActionPerformed(evt);
            }
        });
        jPanel7.add(btnGrabaExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 130, 60));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("EXAMEN FISICO ESTOMATOLOGICO", jPanel3);

        jPanel10.setBackground(new java.awt.Color(204, 204, 255));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "EXAMEN DENTAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel52.setText("1. Supernumerarios");

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel53.setText("3. Manchas");

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel54.setText("5. Placa Bacteriana");

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel55.setText("4. Patologia Pulpar");

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel56.setText("7. Fluorosis Dental");

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel57.setText("8. Otras(cual)");

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel58.setText("2. Bruxismo");

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel59.setText("6. Calculo Dental");

        cmbsuper_num.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));

        cmbabra_exad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));

        cmbmanchas_exad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));

        cmbpatologia_pul.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));

        cmbplaca_blan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));

        cmbplaca_cal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));

        cmbfluorosis_den.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NO", "LEVE", "MODERADO", "SEVERO" }));

        txtotras_exad.setText("NINGUNA");

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel60.setText("Observaciones.");

        txtobserb_exad.setText("OBSERVACION DEL ESPECIALISTA");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel53)
                    .addComponent(jLabel60)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbabra_exad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbmanchas_exad, 0, 100, Short.MAX_VALUE))
                            .addComponent(cmbsuper_num, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addComponent(jLabel59)
                            .addComponent(jLabel55))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbpatologia_pul, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbplaca_blan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbplaca_cal, 0, 100, Short.MAX_VALUE)))
                    .addComponent(txtobserb_exad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56)
                            .addComponent(jLabel57))
                        .addGap(38, 38, 38)
                        .addComponent(cmbfluorosis_den, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtotras_exad))
                .addGap(95, 95, 95))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(cmbsuper_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55)
                    .addComponent(cmbpatologia_pul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56)
                    .addComponent(cmbfluorosis_den, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(cmbabra_exad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54)
                    .addComponent(jLabel57)
                    .addComponent(cmbplaca_blan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbmanchas_exad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel59)
                        .addComponent(cmbplaca_cal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtotras_exad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel60)
                    .addComponent(txtobserb_exad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "DIAGNOSTICO - PRONOSTICO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel61.setText("CAUSA EXTERNA");

        cmbcausa_ext.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ACCIDENTE DE TRABAJO", "ACCIDENTE DE TRANSITO", "ENFERMEDAD GENERAL", "EVENTO CATASTROFICO", "LESION AUTOINFLINGIDA", "LESION POR AGRESION", "OTRA", "OTRO TIPO DE ACCIDENTE", "SUSPECHA DE ABUSO SEXUAL", "SOSPECHA DE MALTRATO EMOCIONAL" }));

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel62.setText("FINALIDAD DE LA CONSULTA");

        cmbfinalid_con.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INTERCONSULTA SOLICITADA", "ATENCION EN PLANIFICACION FAMILIAR", "DETECCION DE ENFERMEDADES", "NO APLICA" }));

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel63.setText("Dx PRINCIPAL Y Dx Rel.");

        jtDx.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD.", "DX. "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtDx);

        btnAgragarDx.setText("AGREGAR DX");
        btnAgragarDx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgragarDxActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel64.setText("DIAGNOSTICO");

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel65.setText("PRONOSTICO");

        txtdiagnos.setColumns(20);
        txtdiagnos.setRows(5);
        txtdiagnos.setText("DIAGNOSTICO DEL ESPECIALISTA");
        jScrollPane3.setViewportView(txtdiagnos);

        txtpronost.setColumns(20);
        txtpronost.setRows(5);
        txtpronost.setText("PRONOSTICO DEL ESPECIALISTA");
        jScrollPane4.setViewportView(txtpronost);

        btnEliminarDx.setText("ELIMINAR DX");
        btnEliminarDx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel61)
                            .addComponent(jLabel62)
                            .addComponent(jLabel63))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbfinalid_con, 0, 238, Short.MAX_VALUE)
                            .addComponent(cmbcausa_ext, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(btnAgragarDx)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminarDx)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel65)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(87, 87, 87))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel61)
                            .addComponent(cmbcausa_ext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel62)
                            .addComponent(cmbfinalid_con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgragarDx)
                            .addComponent(jLabel63)
                            .addComponent(btnEliminarDx)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(jLabel65))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "TRATAMIENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel66.setText("Operatoria");

        cmboperat_tra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        cmboperat_tra.setSelectedIndex(1);

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel67.setText("Periodoncia");

        cmbciruj_tra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        cmbciruj_tra.setSelectedIndex(1);

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel68.setText("Cirujia");

        cmbperiod_tra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        cmbperiod_tra.setSelectedIndex(1);

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel69.setText("Ortodoncia");

        cmbortod_tra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        cmbortod_tra.setSelectedIndex(1);

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel70.setText("Medicina Oral");

        cmbmedici_tra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        cmbmedici_tra.setSelectedIndex(1);

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel71.setText("Exodoncia");

        cmbexodon_tra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        cmbexodon_tra.setSelectedIndex(1);

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel72.setText("Endodoncia");

        cmbendod_tra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        cmbendod_tra.setSelectedIndex(1);

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel73.setText("Protesis");

        cmbprote_tra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        cmbprote_tra.setSelectedIndex(1);

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel74.setText("OTRO");

        txtotro_tra.setText("NINGUNO");

        btnGrabaDiagnostico.setText("GRABAR DATOS");
        btnGrabaDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabaDiagnosticoActionPerformed(evt);
            }
        });

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel76.setText("Pulpotomia");

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel77.setText("Pulpectomia");

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel79.setText("Exodoncia Simple");

        cmbpul_tra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        cmbpul_tra.setSelectedIndex(1);

        cmbpulpec_tra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        cmbpulpec_tra.setSelectedIndex(1);

        cmbexosim_tra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        cmbexosim_tra.setSelectedIndex(1);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel66)
                                .addGap(18, 18, 18)
                                .addComponent(cmboperat_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel72)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbendod_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel76)
                            .addComponent(jLabel67))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbperiod_tra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbpul_tra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel68)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbciruj_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel77))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel69)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbortod_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel70))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(cmbpulpec_tra, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel79)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbexosim_tra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbmedici_tra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(txtotro_tra, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel74))
                .addGap(56, 56, 56)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGrabaDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel73)
                            .addComponent(jLabel71))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbexodon_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbprote_tra, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(cmboperat_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67)
                    .addComponent(cmbperiod_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbciruj_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68)
                    .addComponent(jLabel69)
                    .addComponent(cmbortod_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70)
                    .addComponent(cmbmedici_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71)
                    .addComponent(cmbexodon_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(cmbendod_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel76)
                    .addComponent(jLabel77)
                    .addComponent(jLabel79)
                    .addComponent(cmbpul_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbpulpec_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbexosim_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73)
                    .addComponent(cmbprote_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel74)
                            .addComponent(txtotro_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnGrabaDiagnostico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("DIAGNOSTICOS", jPanel10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIrradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIrradActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIrradActionPerformed

    private void cmbCarrilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCarrilloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCarrilloActionPerformed

    private void btnGrabaAnamnesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabaAnamnesisActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnGrabaAnamnesisActionPerformed

    private void btnAgragarDxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgragarDxActionPerformed
        // TODO add your handling code here:
        frmListadoDX frm = new frmListadoDX();
        frm.setVisible(true);
    }//GEN-LAST:event_btnAgragarDxActionPerformed

    private void btnGrabaPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabaPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGrabaPersonaActionPerformed

    private void btnGrabaExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabaExamenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGrabaExamenActionPerformed

    private void btnEliminarDxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDxActionPerformed
        // TODO add your handling code here:
        int fsel = jtDx.getSelectedRow();
        if (fsel == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione antes de borrar");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) jtDx.getModel();
            dtm.removeRow(jtDx.getSelectedRow());
        }
    }//GEN-LAST:event_btnEliminarDxActionPerformed

    private void txtObs_Ing_medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObs_Ing_medActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObs_Ing_medActionPerformed

    private void txtCardioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCardioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCardioActionPerformed

    private void btnCargarfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarfotoActionPerformed
        // TODO add your handling code here:

        if ("".equals(txtcedula.getText())) {
            JOptionPane.showMessageDialog(null, "PRIMERO GUARDE LOS DATOS PERSONALES");
        } else {
            PreparedStatement psrep = null;
            ResultSet rsrep = null;
            String sqlrep = "SELECT * FROM personas WHERE ced_per=?";
            Conexion obj = new Conexion();
            Connection con = obj.getConexion();

            try {

                //BUSCAR REPETIDO
                psrep = con.prepareStatement(sqlrep);
                psrep.setString(1, txtcedula.getText());
                rsrep = psrep.executeQuery();

                if (rsrep.next()) {
                    JOptionPane.showMessageDialog(null, "Existe");
                    val = 0;
             JFileChooser fc = new JFileChooser();
             fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
             FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.PNG", "png");
             fc.setFileFilter(filtro);
             int seleccion = fc.showOpenDialog(this);

             if (seleccion == JFileChooser.APPROVE_OPTION) {

             File fichero = fc.getSelectedFile();

             txtrutaperfil.setText(String.valueOf(fichero));
             Image foto = getToolkit().getImage(txtrutaperfil.getText());
             foto = foto.getScaledInstance(lblfotoperfil.getWidth(), lblfotoperfil.getHeight(), Image.SCALE_DEFAULT);
             lblfotoperfil.setIcon(new ImageIcon(foto));

             //**********************
             int op = JOptionPane.showConfirmDialog(null, "DESEAS GUARDAR ESTA FOTO?");
             if (op == JOptionPane.YES_OPTION) {

             PreparedStatement ps;

             //Conexion obj = new Conexion();
             try {

             FileInputStream fis = new FileInputStream(fichero);
             //Connection con = obj.getConexion();
             ps = con.prepareStatement("UPDATE personas SET rut_ima=?, imagen=? WHERE ced_per=?");
             ps.setString(1, txtrutaperfil.getText());
             ps.setBinaryStream(2, fis, (int) fichero.length());
             ps.setString(3, txtcedula.getText());
             ps.execute();
             JOptionPane.showMessageDialog(null, "Imagen Guardada");

             } catch (HeadlessException | FileNotFoundException | SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al Guardar Imagen");
             System.out.println(ex);
             }

             }
             //*********************** 

             }

                    val = 1;

                }else{
                    JOptionPane.showMessageDialog(null, "Registre primero al paciente");
                }

            } catch (SQLException e) {

                System.err.println(e);

            }
        }
            /*
            
             
             */

    }//GEN-LAST:event_btnCargarfotoActionPerformed

    private void btnGrabaDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabaDiagnosticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGrabaDiagnosticoActionPerformed

    private void txtpulsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpulsoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpulsoActionPerformed

    private void txtid_pacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtid_pacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtid_pacActionPerformed

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
            java.util.logging.Logger.getLogger(frmPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgragarDx;
    public javax.swing.JToggleButton btnCargarfoto;
    public javax.swing.JButton btnEliminarDx;
    public javax.swing.JButton btnGrabaAnamnesis;
    public javax.swing.JButton btnGrabaDiagnostico;
    public javax.swing.JToggleButton btnGrabaExamen;
    public javax.swing.JToggleButton btnGrabaPersona;
    public javax.swing.JComboBox cmbArtTemporo;
    public javax.swing.JComboBox cmbCardiopatias;
    public javax.swing.JComboBox cmbCarrillo;
    public javax.swing.JComboBox cmbCepillado;
    public javax.swing.JComboBox cmbDiabetes;
    public javax.swing.JComboBox cmbEnf_resp;
    public javax.swing.JComboBox cmbFieb_reum;
    public javax.swing.JComboBox cmbFuncion;
    public javax.swing.JComboBox cmbHemorragias;
    public javax.swing.JComboBox cmbHepatitis;
    public javax.swing.JComboBox cmbHipertension;
    public javax.swing.JComboBox cmbIngest_med;
    public javax.swing.JComboBox cmbIrradiaciones;
    public javax.swing.JComboBox cmbLabio;
    public javax.swing.JComboBox cmbLengua;
    public javax.swing.JComboBox cmbLinfReg;
    public javax.swing.JComboBox cmbMaxilares;
    public javax.swing.JComboBox cmbMusc;
    public javax.swing.JComboBox cmbPaladar;
    public javax.swing.JComboBox cmbPisoBoca;
    public javax.swing.JComboBox cmbReac_aler;
    public javax.swing.JComboBox cmbSeda;
    public javax.swing.JComboBox cmbSenosMaxi;
    public javax.swing.JComboBox cmbSinusitis;
    public javax.swing.JComboBox cmbSisNerv;
    public javax.swing.JComboBox cmbSisVas;
    public javax.swing.JComboBox cmbTrat_med;
    public javax.swing.JComboBox cmbabra_exad;
    public javax.swing.JComboBox cmbcausa_ext;
    public javax.swing.JComboBox cmbciruj_tra;
    public javax.swing.JComboBox cmbendod_tra;
    public javax.swing.JComboBox cmbestadocivil;
    public javax.swing.JComboBox cmbexodon_tra;
    public javax.swing.JComboBox cmbexosim_tra;
    public javax.swing.JComboBox cmbfinalid_con;
    public javax.swing.JComboBox cmbfluorosis_den;
    public javax.swing.JComboBox cmbglandulas;
    public javax.swing.JComboBox cmbmanchas_exad;
    public javax.swing.JComboBox cmbmedici_tra;
    public javax.swing.JComboBox cmboperat_tra;
    public javax.swing.JComboBox cmbortod_tra;
    public javax.swing.JComboBox cmbpatologia_pul;
    public javax.swing.JComboBox cmbperiod_tra;
    public javax.swing.JComboBox cmbplaca_blan;
    public javax.swing.JComboBox cmbplaca_cal;
    public javax.swing.JComboBox cmbprote_tra;
    public javax.swing.JComboBox cmbpul_tra;
    public javax.swing.JComboBox cmbpulpec_tra;
    public javax.swing.JComboBox cmbsexo;
    public javax.swing.JComboBox cmbsuper_num;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JPanel jPanel7;
    public javax.swing.JPanel jPanel8;
    public javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane2;
    public static javax.swing.JTable jtDx;
    private javax.swing.JLabel lblfotoperfil;
    public javax.swing.JTextField txtCardio;
    public javax.swing.JTextField txtCepi;
    public javax.swing.JTextField txtDiab;
    public javax.swing.JTextField txtEnfResp;
    public javax.swing.JTextField txtFiebReum;
    public javax.swing.JTextField txtHepa;
    public javax.swing.JTextField txtHiperT;
    public javax.swing.JTextField txtIrrad;
    public javax.swing.JTextField txtObsReacAler;
    public javax.swing.JTextField txtObs_Hemo;
    public javax.swing.JTextField txtObs_Ing_med;
    public javax.swing.JTextField txtObs_trat_med;
    public javax.swing.JTextField txtOtras_enf;
    public javax.swing.JTextField txtSeda;
    public javax.swing.JTextField txtSinusitis;
    public javax.swing.JTextField txtapellido;
    public javax.swing.JTextArea txtareaObservacion;
    public static javax.swing.JTextField txtcedula;
    public javax.swing.JTextArea txtdiagnos;
    public javax.swing.JTextField txtdireccion;
    public javax.swing.JTextField txtedad;
    public javax.swing.JTextField txtfechaingreso;
    public javax.swing.JTextField txtfechanacimiento;
    public javax.swing.JTextField txtid_pac;
    public javax.swing.JTextField txtid_per;
    public javax.swing.JTextField txtmail;
    public javax.swing.JTextField txtnombre;
    public javax.swing.JTextField txtobserb_exad;
    public javax.swing.JTextField txtotras_exad;
    public javax.swing.JTextField txtotro_tra;
    public javax.swing.JTextArea txtpronost;
    public javax.swing.JTextField txtpulso;
    public javax.swing.JTextField txtrepresentante;
    public javax.swing.JTextField txtrespiracion;
    public javax.swing.JTextField txtrutaperfil;
    public javax.swing.JTextField txttelefono;
    public javax.swing.JTextField txttemper;
    public javax.swing.JTextField txttension;
    // End of variables declaration//GEN-END:variables
}
