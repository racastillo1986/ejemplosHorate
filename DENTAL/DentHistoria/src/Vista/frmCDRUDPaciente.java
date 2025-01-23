/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Conexion;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Armandfly
 */
public class frmCDRUDPaciente extends javax.swing.JFrame {

    /**
     * Creates new form frmCDRUDPaciente
     */
    public frmCDRUDPaciente() {
        initComponents();
        jScrollPaneprincipal.setSize(jPanel8.getWidth(), jPanel8.getHeight());
        
    }

    public void cargar(String valor) {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            jtPacientes.setModel(modelo);

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneprincipal = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        txtBuscarpaciente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPacientes = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtid_pac = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtfechanacimiento = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        cmbsexo = new javax.swing.JComboBox();
        cmbestadocivil = new javax.swing.JComboBox();
        txtdireccion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtmail = new javax.swing.JTextField();
        txtrepresentante = new javax.swing.JTextField();
        txtfechaingreso = new javax.swing.JTextField();
        btnModificarpersona = new javax.swing.JToggleButton();
        txtid_per = new javax.swing.JTextField();
        txtid_anamnesis = new javax.swing.JTextField();
        txtid_exaestom = new javax.swing.JTextField();
        txtid_diagnostico = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        txtobsexa = new javax.swing.JTextArea();
        btnModificarexa = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jtDx = new javax.swing.JTable();
        btnAgragarDx = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtdiagnos = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
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
        btnModificardia = new javax.swing.JButton();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        cmbpul_tra = new javax.swing.JComboBox();
        cmbpulpec_tra = new javax.swing.JComboBox();
        cmbexosim_tra = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        cmbTrat_med = new javax.swing.JComboBox();
        cmbIngest_med = new javax.swing.JComboBox();
        cmbReac_aler = new javax.swing.JComboBox();
        cmbHemorragias = new javax.swing.JComboBox();
        cmbIrradiaciones = new javax.swing.JComboBox();
        cmbSinusitis = new javax.swing.JComboBox();
        cmbEnf_resp = new javax.swing.JComboBox();
        cmbCardiopatias = new javax.swing.JComboBox();
        cmbDiabetes = new javax.swing.JComboBox();
        cmbFieb_reum = new javax.swing.JComboBox();
        cmbHepatitis = new javax.swing.JComboBox();
        cmbHipertension = new javax.swing.JComboBox();
        txtObs_trat_med = new javax.swing.JTextField();
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
        jLabel31 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbCepillado = new javax.swing.JComboBox();
        txtCepi = new javax.swing.JTextField();
        cmbSeda = new javax.swing.JComboBox();
        txtSeda = new javax.swing.JTextField();
        txtOtras_enf = new javax.swing.JTextField();
        btnModificarana = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscarpaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarpacienteKeyReleased(evt);
            }
        });
        jPanel8.add(txtBuscarpaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jtPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD.", "CEDULA", "NOMBRE", "APELLIDOS", "EDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtPacientes);

        jPanel8.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 350, 610));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Cedula");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 58, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nombres");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 96, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Apellidos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 134, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Fecha. Nacimiento");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 172, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Edad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Sexo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 246, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("E. Civil");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 284, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Direccion");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 322, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Telefono");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 366, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Mail");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 414, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Representante");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 447, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Fecha de ingreso");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 480, -1, -1));
        jPanel1.add(txtid_pac, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 27, 32, -1));

        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });
        jPanel1.add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 56, 136, -1));
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 94, 219, -1));
        jPanel1.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 132, 219, -1));
        jPanel1.add(txtfechanacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 219, -1));
        jPanel1.add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 208, 60, -1));

        cmbsexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MASCULINO", "FEMENINO" }));
        jPanel1.add(cmbsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 244, 118, -1));

        cmbestadocivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SOLTERO", "CASADO", " " }));
        jPanel1.add(cmbestadocivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 282, 119, -1));
        jPanel1.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 320, 219, -1));
        jPanel1.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 364, 219, -1));
        jPanel1.add(txtmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 410, 217, -1));
        jPanel1.add(txtrepresentante, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 448, 217, -1));
        jPanel1.add(txtfechaingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 486, 217, -1));

        btnModificarpersona.setText("ACTUALIZAR");
        jPanel1.add(btnModificarpersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 139, 39));
        jPanel1.add(txtid_per, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 29, -1));
        jPanel1.add(txtid_anamnesis, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 42, -1));
        jPanel1.add(txtid_exaestom, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 66, -1));
        jPanel1.add(txtid_diagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 32, -1));

        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, 140, 40));

        jTabbedPane1.addTab("DATOS PERSONALES", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setText("Temperatura:");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setText("Respiracion:");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setText("Pulso:");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setText("Tension Arterial:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addComponent(txttemper, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel34)
                .addGap(18, 18, 18)
                .addComponent(txtpulso, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel35)
                .addGap(18, 18, 18)
                .addComponent(txttension, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel33)
                .addGap(30, 30, 30)
                .addComponent(txtrespiracion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        txtobsexa.setColumns(20);
        txtobsexa.setRows(5);
        txtobsexa.setText("NIMGUNA");
        jScrollPane2.setViewportView(txtobsexa);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 214, 252, 50));

        btnModificarexa.setText("ACTUALIZAR DATOS");
        jPanel7.add(btnModificarexa, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, 40));

        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 120, 40));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("EXAMEN ESTOMATOLOGICO", jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

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
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbabra_exad, javax.swing.GroupLayout.Alignment.LEADING, 0, 51, Short.MAX_VALUE)
                            .addComponent(cmbsuper_num, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbmanchas_exad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel59)
                                .addComponent(jLabel54)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbplaca_blan, javax.swing.GroupLayout.Alignment.LEADING, 0, 51, Short.MAX_VALUE)
                            .addComponent(cmbpatologia_pul, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbplaca_cal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel57)
                                    .addComponent(jLabel56))
                                .addGap(38, 38, 38)
                                .addComponent(cmbfluorosis_den, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtotras_exad)))
                    .addComponent(txtobserb_exad, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52)
                            .addComponent(cmbsuper_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel53)
                                    .addComponent(cmbmanchas_exad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbabra_exad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel58)))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel59))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbpatologia_pul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56)
                            .addComponent(cmbfluorosis_den, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbplaca_blan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbplaca_cal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtotras_exad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel60)
                    .addComponent(txtobserb_exad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
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
        jScrollPane3.setViewportView(jtDx);

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
        jScrollPane4.setViewportView(txtdiagnos);

        txtpronost.setColumns(20);
        txtpronost.setRows(5);
        txtpronost.setText("PRONOSTICO DEL ESPECIALISTA");
        jScrollPane5.setViewportView(txtpronost);

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
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addGap(379, 379, 379)
                        .addComponent(jLabel65))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel61)
                                    .addComponent(jLabel62)
                                    .addComponent(jLabel63))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmbfinalid_con, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(btnAgragarDx)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEliminarDx))
                                    .addComponent(cmbcausa_ext, 0, 1, Short.MAX_VALUE))
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jScrollPane4)
                                .addGap(15, 15, 15)))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                            .addComponent(jScrollPane5))
                        .addGap(20, 20, 20)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel61)
                            .addComponent(cmbcausa_ext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel62)
                            .addComponent(cmbfinalid_con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgragarDx)
                            .addComponent(btnEliminarDx)
                            .addComponent(jLabel63)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(jLabel65))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "TRATAMIENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel66.setText("Operatoria");
        jPanel13.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 30, -1, -1));

        cmboperat_tra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        cmboperat_tra.setSelectedIndex(1);
        jPanel13.add(cmboperat_tra, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 28, -1, -1));

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel67.setText("Periodoncia");
        jPanel13.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 30, -1, -1));

        cmbciruj_tra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        cmbciruj_tra.setSelectedIndex(1);
        jPanel13.add(cmbciruj_tra, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 28, -1, -1));

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel68.setText("Cirujia");
        jPanel13.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        cmbperiod_tra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        cmbperiod_tra.setSelectedIndex(1);
        jPanel13.add(cmbperiod_tra, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 28, -1, -1));

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel69.setText("Ortodoncia");
        jPanel13.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 30, -1, -1));

        cmbortod_tra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        cmbortod_tra.setSelectedIndex(1);
        jPanel13.add(cmbortod_tra, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 28, -1, -1));

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel70.setText("Medicina Oral");
        jPanel13.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 30, -1, -1));

        cmbmedici_tra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        cmbmedici_tra.setSelectedIndex(1);
        jPanel13.add(cmbmedici_tra, new org.netbeans.lib.awtextra.AbsoluteConstraints(763, 28, -1, -1));

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel71.setText("Exodoncia");
        jPanel13.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 106, -1, -1));

        cmbexodon_tra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        cmbexodon_tra.setSelectedIndex(1);
        jPanel13.add(cmbexodon_tra, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 104, -1, -1));

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel72.setText("Endodoncia");
        jPanel13.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 68, -1, -1));

        cmbendod_tra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        cmbendod_tra.setSelectedIndex(1);
        jPanel13.add(cmbendod_tra, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 66, -1, -1));

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel73.setText("Protesis");
        jPanel13.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 106, -1, -1));

        cmbprote_tra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        cmbprote_tra.setSelectedIndex(1);
        jPanel13.add(cmbprote_tra, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 104, -1, -1));

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel74.setText("OTRO");
        jPanel13.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 134, -1, -1));

        txtotro_tra.setText("NINGUNO");
        jPanel13.add(txtotro_tra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 358, -1));

        btnModificardia.setText("GRABAR DATOS");
        btnModificardia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificardiaActionPerformed(evt);
            }
        });
        jPanel13.add(btnModificardia, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 131, 137, -1));

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel76.setText("Pulpotomia");
        jPanel13.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 68, -1, -1));

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel77.setText("Pulpectomia");
        jPanel13.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 68, -1, -1));

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel79.setText("Exodoncia Simple");
        jPanel13.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 68, -1, -1));

        cmbpul_tra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        cmbpul_tra.setSelectedIndex(1);
        jPanel13.add(cmbpul_tra, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 66, -1, -1));

        cmbpulpec_tra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        cmbpulpec_tra.setSelectedIndex(1);
        jPanel13.add(cmbpulpec_tra, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 66, 48, -1));

        cmbexosim_tra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        cmbexosim_tra.setSelectedIndex(1);
        jPanel13.add(cmbexosim_tra, new org.netbeans.lib.awtextra.AbsoluteConstraints(763, 66, -1, -1));

        jButton4.setText("SALIR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 131, 103, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DIAGNOSTICO", jPanel4);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("1. Tratamiento Medico");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 29, 131, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("2. Ingestion de medicamentos");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 62, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("3. Reacciones alergicas");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 95, 144, 14));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("4. Hemorragias");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 131, 182, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("5. Irradiaciones");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 166, 182, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("6. Sinusitis");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 202, 182, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("7. Enfermedades respiratorias");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 235, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("8. Cardiopatias");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 268, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("9. Diabetes");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 301, 161, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("10. Fiebre Reumatica");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 334, 119, -1));

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel75.setText("11. Hepatitis");
        jPanel2.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 369, 119, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("12. Hipertension Arterial");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 405, 167, 23));

        cmbTrat_med.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));
        jPanel2.add(cmbTrat_med, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 27, -1, -1));

        cmbIngest_med.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));
        jPanel2.add(cmbIngest_med, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 60, -1, -1));

        cmbReac_aler.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));
        jPanel2.add(cmbReac_aler, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 93, -1, -1));

        cmbHemorragias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));
        jPanel2.add(cmbHemorragias, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 131, -1, -1));

        cmbIrradiaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));
        jPanel2.add(cmbIrradiaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 164, -1, -1));

        cmbSinusitis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));
        jPanel2.add(cmbSinusitis, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 200, -1, -1));

        cmbEnf_resp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));
        jPanel2.add(cmbEnf_resp, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 233, -1, -1));

        cmbCardiopatias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));
        jPanel2.add(cmbCardiopatias, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 266, -1, -1));

        cmbDiabetes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));
        jPanel2.add(cmbDiabetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 299, -1, -1));

        cmbFieb_reum.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));
        jPanel2.add(cmbFieb_reum, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 332, -1, -1));

        cmbHepatitis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));
        jPanel2.add(cmbHepatitis, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 367, -1, -1));

        cmbHipertension.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));
        jPanel2.add(cmbHipertension, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 405, -1, -1));

        txtObs_trat_med.setText("NINGUNA");
        jPanel2.add(txtObs_trat_med, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 27, 256, -1));

        txtObs_Ing_med.setText("NINGUNA");
        txtObs_Ing_med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObs_Ing_medActionPerformed(evt);
            }
        });
        jPanel2.add(txtObs_Ing_med, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 60, 256, -1));

        txtObsReacAler.setText("NINGUNA");
        jPanel2.add(txtObsReacAler, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 93, 256, -1));

        txtObs_Hemo.setText("NINGUNA");
        jPanel2.add(txtObs_Hemo, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 131, 256, -1));

        txtIrrad.setText("NINGUNA");
        txtIrrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIrradActionPerformed(evt);
            }
        });
        jPanel2.add(txtIrrad, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 164, 256, -1));

        txtSinusitis.setText("NINGUNA");
        jPanel2.add(txtSinusitis, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 200, 256, -1));

        txtEnfResp.setText("NINGUNA");
        jPanel2.add(txtEnfResp, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 233, 256, -1));

        txtCardio.setText("NINGUNA");
        txtCardio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCardioActionPerformed(evt);
            }
        });
        jPanel2.add(txtCardio, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 266, 256, -1));

        txtDiab.setText("NINGUNA");
        jPanel2.add(txtDiab, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 299, 256, -1));

        txtFiebReum.setText("NINGUNA");
        jPanel2.add(txtFiebReum, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 332, 256, -1));

        txtHepa.setText("NINGUNA");
        jPanel2.add(txtHepa, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 367, 256, -1));

        txtHiperT.setText("NINGUNA");
        jPanel2.add(txtHiperT, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 405, 256, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Hábito de higiene oral");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("Frecuendia(dia)");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Cepillado");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("Seda dental");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("13. Otras Enfermedades");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        cmbCepillado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));
        jPanel2.add(cmbCepillado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 43, -1));

        txtCepi.setText("0");
        jPanel2.add(txtCepi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 41, -1));

        cmbSeda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO", "NO SABE" }));
        jPanel2.add(cmbSeda, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 43, -1));

        txtSeda.setText("0");
        jPanel2.add(txtSeda, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 41, -1));

        txtOtras_enf.setText("NINGUNA");
        jPanel2.add(txtOtras_enf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 370, -1));

        btnModificarana.setText("ACTUALIZAR DATOS");
        jPanel2.add(btnModificarana, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, -1, 44));

        jButton2.setText("SALIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 120, 40));

        jTabbedPane1.addTab("ANAMNESIS", jPanel2);

        jPanel8.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 890, 640));

        jScrollPaneprincipal.setViewportView(jPanel8);

        getContentPane().add(jScrollPaneprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarpacienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarpacienteKeyReleased
        // TODO add your handling code here:
        cargar(txtBuscarpaciente.getText());
    }//GEN-LAST:event_txtBuscarpacienteKeyReleased

    private void txtObs_Ing_medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObs_Ing_medActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObs_Ing_medActionPerformed

    private void txtIrradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIrradActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIrradActionPerformed

    private void txtCardioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCardioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCardioActionPerformed

    private void cmbCarrilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCarrilloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCarrilloActionPerformed

    private void btnAgragarDxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgragarDxActionPerformed
        // TODO add your handling code here:
        frmListadoDXCRUD frm = new frmListadoDXCRUD();
        frm.setVisible(true);
    }//GEN-LAST:event_btnAgragarDxActionPerformed

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

    private void btnModificardiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificardiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificardiaActionPerformed

    private void jtPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPacientesMouseClicked
        // TODO add your handling code here:

        int fila = jtPacientes.getSelectedRow();
        if (fila >= 0) {
            try {
                txtid_pac.setText(jtPacientes.getValueAt(fila, 0).toString());
                txtcedula.setText(jtPacientes.getValueAt(fila, 1).toString());
                txtnombre.setText(jtPacientes.getValueAt(fila, 2).toString());
                txtapellido.setText(jtPacientes.getValueAt(fila, 3).toString());
                txtedad.setText(jtPacientes.getValueAt(fila, 4).toString());

                PreparedStatement ps = null;
                ResultSet rs = null;
                String sql = "SELECT * FROM vistapacientes WHERE id_pac = ?";
                PreparedStatement psana = null;
                ResultSet rsana = null;
                String sqlana = "SELECT * FROM anamnesis WHERE id_pac = ?";
                PreparedStatement psex = null;
                ResultSet rsex = null;
                String sqlex = "SELECT * FROM exaestomatologicos WHERE id_pac = ?";
                PreparedStatement psdia = null;
                ResultSet rsdia = null;
                String sqldia = "SELECT * FROM diagnosticos WHERE id_pac = ?";
                PreparedStatement psdiadet = null;
                ResultSet rsdiadet = null;
                String sqldiadet = "SELECT id_dx, dx FROM vistadetdiagnostico WHERE id_dia = ?";
                try {
                    Conexion objCon = new Conexion();
                    Connection conn = objCon.getConexion();
                    String codigo = txtid_pac.getText();

                    //DATOS PERSONALES
                    ps = conn.prepareStatement(sql);
                    ps.setString(1, codigo);
                    rs = ps.executeQuery();

                    while (rs.next()) {

                        txtid_per.setText(rs.getString("id_per"));
                        txtfechanacimiento.setText(rs.getString("fec_nac"));
                        cmbsexo.setSelectedIndex(Integer.parseInt(rs.getString("sex_per")));
                        cmbestadocivil.setSelectedIndex(Integer.parseInt(rs.getString("est_civ")));
                        txtdireccion.setText(rs.getString("dir_per"));
                        txttelefono.setText(rs.getString("tel_per"));
                        txtmail.setText(rs.getString("mail_per"));
                        txtrepresentante.setText(rs.getString("rep_per"));
                        txtfechaingreso.setText(rs.getString("fec_ing"));
                        

                    }
                    

                    //ANAMNESIS
                    psana = conn.prepareStatement(sqlana);
                    psana.setString(1, codigo);
                    rsana = psana.executeQuery();

                    while (rsana.next()) {

                        cmbTrat_med.setSelectedItem(rsana.getString("tra_med"));
                        txtObs_trat_med.setText(rsana.getString("obs_tra"));
                        cmbIngest_med.setSelectedItem(rsana.getString("ing_med"));
                        txtObs_Ing_med.setText(rsana.getString("obs_ing"));
                        cmbReac_aler.setSelectedItem(rsana.getString("rea_ale"));
                        txtObsReacAler.setText(rsana.getString("obs_rea"));
                        cmbHemorragias.setSelectedItem(rsana.getString("hemo"));
                        txtObs_Hemo.setText(rsana.getString("obs_hem"));
                        cmbIrradiaciones.setSelectedItem(rsana.getString("irrad"));
                        txtIrrad.setText(rsana.getString("obs_irr"));
                        cmbSinusitis.setSelectedItem(rsana.getString("sinu"));
                        txtSinusitis.setText(rsana.getString("obs_sin"));
                        cmbEnf_resp.setSelectedItem(rsana.getString("enf_res"));
                        txtEnfResp.setText(rsana.getString("obs_enf"));
                        cmbCardiopatias.setSelectedItem(rsana.getString("card"));
                        txtCardio.setText(rsana.getString("obs_car"));
                        cmbDiabetes.setSelectedItem(rsana.getString("diab"));
                        txtDiab.setText(rsana.getString("obs_dia"));
                        cmbFieb_reum.setSelectedItem(rsana.getString("fie_reu"));
                        txtFiebReum.setText(rsana.getString("obs_fie"));
                        cmbHepatitis.setSelectedItem(rsana.getString("hepa"));
                        txtHepa.setText(rsana.getString("obs_hep"));
                        cmbHipertension.setSelectedItem(rsana.getString("hiper"));
                        txtHiperT.setText(rsana.getString("obs_hip"));
                        txtOtras_enf.setText(rsana.getString("otras"));
                        cmbCepillado.setSelectedItem(rsana.getString("cepillado"));
                        txtCepi.setText(rsana.getString("obs_cep"));
                        cmbSeda.setSelectedItem(rsana.getString("seda"));
                        txtSeda.setText(rsana.getString("obs_sed"));
                        txtid_anamnesis.setText(rsana.getString("id_ana"));

                    }

                    //EXAMEN ESTOMATOLOGICO
                    psex = conn.prepareStatement(sqlex);
                    psex.setString(1, codigo);
                    rsex = psex.executeQuery();

                    while (rsex.next()) {

                        txtid_exaestom.setText(rsex.getString("id_exa"));
                        txttemper.setText(rsex.getString("tem_exa"));
                        txtpulso.setText(rsex.getString("pul_exa"));
                        txttension.setText(rsex.getString("ten_exa"));
                        txtrespiracion.setText(rsex.getString("res_exa"));
                        cmbArtTemporo.setSelectedItem(rsex.getString("art_exa"));
                        cmbLabio.setSelectedItem(rsex.getString("lab_exa"));
                        cmbLengua.setSelectedItem(rsex.getString("len_exa"));
                        cmbPaladar.setSelectedItem(rsex.getString("pal_exa"));
                        cmbPisoBoca.setSelectedItem(rsex.getString("pis_exa"));
                        cmbCarrillo.setSelectedItem(rsex.getString("car_exa"));
                        cmbglandulas.setSelectedItem(rsex.getString("gla_exa"));
                        cmbMaxilares.setSelectedItem(rsex.getString("max_exa"));
                        cmbSenosMaxi.setSelectedItem(rsex.getString("sen_exa"));
                        cmbMusc.setSelectedItem(rsex.getString("mus_exa"));
                        cmbSisNerv.setSelectedItem(rsex.getString("sis_ner"));
                        cmbSisVas.setSelectedItem(rsex.getString("sis_vas"));
                        cmbLinfReg.setSelectedItem(rsex.getString("lin_exa"));
                        cmbFuncion.setSelectedItem(rsex.getString("fun_exa"));
                        txtobsexa.setText(rsex.getString("obs_exa"));

                    }

                    //DIAGNOSTICOS
                    psdia = conn.prepareStatement(sqldia);
                    psdia.setString(1, codigo);
                    rsdia = psdia.executeQuery();

                    while (rsdia.next()) {

                        cmbsuper_num.setSelectedItem(rsdia.getString("sup_num"));
                        cmbabra_exad.setSelectedItem(rsdia.getString("abr_exad"));
                        cmbmanchas_exad.setSelectedItem(rsdia.getString("man_exad"));
                        cmbpatologia_pul.setSelectedItem(rsdia.getString("pat_pul"));
                        cmbplaca_blan.setSelectedItem(rsdia.getString("pla_bla"));
                        cmbplaca_cal.setSelectedItem(rsdia.getString("pla_cal"));
                        cmbfluorosis_den.setSelectedItem(rsdia.getString("flu_den"));
                        txtotras_exad.setText(rsdia.getString("otr_exad"));
                        txtobserb_exad.setText(rsdia.getString("obs_exad"));
                        cmbcausa_ext.setSelectedItem(rsdia.getString("cau_ext"));
                        cmbfinalid_con.setSelectedItem(rsdia.getString("fin_con"));
                        txtdiagnos.setText(rsdia.getString("dia"));
                        txtpronost.setText(rsdia.getString("pro"));
                        cmboperat_tra.setSelectedItem(rsdia.getString("ope_tra"));
                        cmbendod_tra.setSelectedItem(rsdia.getString("end_tra"));
                        cmbperiod_tra.setSelectedItem(rsdia.getString("per_tra"));
                        cmbprote_tra.setSelectedItem(rsdia.getString("pro_tra"));
                        cmbciruj_tra.setSelectedItem(rsdia.getString("cir_tra"));
                        cmbortod_tra.setSelectedItem(rsdia.getString("ort_tra"));
                        cmbexodon_tra.setSelectedItem(rsdia.getString("exo_tra"));
                        cmbmedici_tra.setSelectedItem(rsdia.getString("med_ora"));
                        cmbpul_tra.setSelectedItem(rsdia.getString("pul_tra"));
                        cmbpulpec_tra.setSelectedItem(rsdia.getString("pulpe_tra"));
                        cmbexosim_tra.setSelectedItem(rsdia.getString("exosim_tra"));
                        txtotras_exad.setText(rsdia.getString("otra_tra"));
                        txtid_diagnostico.setText(rsdia.getString("id_dia"));

                    }

                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }

                //DETALLEDIAGNOSTICO
                Conexion objCon = new Conexion();
                Connection conn = objCon.getConexion();
                psdiadet = conn.prepareStatement(sqldiadet);
                psdiadet.setInt(1, Integer.parseInt(txtid_diagnostico.getText()));
                rsdiadet = psdiadet.executeQuery();

                DefaultTableModel modelo = new DefaultTableModel();
                jtDx.setModel(modelo);

                ResultSetMetaData rsMd = rsdiadet.getMetaData();

                int cantidadcolumnas = rsMd.getColumnCount();

                modelo.addColumn("COD.");
                modelo.addColumn("Dx.       ");

                while (rsdiadet.next()) {

                    Object[] filas = new Object[cantidadcolumnas];
                    for (int i = 0; i < cantidadcolumnas; i++) {
                        filas[i] = rsdiadet.getObject(i + 1);

                    }
                    modelo.addRow(filas);
                }

            } catch (SQLException ex) {
                Logger.getLogger(frmCDRUDPaciente.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "NO HAY FILAS");
        }


    }//GEN-LAST:event_jtPacientesMouseClicked

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(frmCDRUDPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCDRUDPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCDRUDPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCDRUDPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCDRUDPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgragarDx;
    public javax.swing.JButton btnEliminarDx;
    public static javax.swing.JButton btnModificarana;
    public static javax.swing.JButton btnModificardia;
    public static javax.swing.JButton btnModificarexa;
    public static javax.swing.JToggleButton btnModificarpersona;
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPaneprincipal;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTable jtDx;
    public static javax.swing.JTable jtPacientes;
    public static javax.swing.JTextField txtBuscarpaciente;
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
    public static javax.swing.JTextField txtcedula;
    public javax.swing.JTextArea txtdiagnos;
    public javax.swing.JTextField txtdireccion;
    public javax.swing.JTextField txtedad;
    public javax.swing.JTextField txtfechaingreso;
    public javax.swing.JTextField txtfechanacimiento;
    public static javax.swing.JTextField txtid_anamnesis;
    public static javax.swing.JTextField txtid_diagnostico;
    public static javax.swing.JTextField txtid_exaestom;
    public javax.swing.JTextField txtid_pac;
    public javax.swing.JTextField txtid_per;
    public javax.swing.JTextField txtmail;
    public javax.swing.JTextField txtnombre;
    public javax.swing.JTextField txtobserb_exad;
    public javax.swing.JTextArea txtobsexa;
    public javax.swing.JTextField txtotras_exad;
    public javax.swing.JTextField txtotro_tra;
    public javax.swing.JTextArea txtpronost;
    public javax.swing.JTextField txtpulso;
    public javax.swing.JTextField txtrepresentante;
    public javax.swing.JTextField txtrespiracion;
    public javax.swing.JTextField txttelefono;
    public javax.swing.JTextField txttemper;
    public javax.swing.JTextField txttension;
    // End of variables declaration//GEN-END:variables
}
