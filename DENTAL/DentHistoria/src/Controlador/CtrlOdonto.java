package Controlador;

import Modelo.ConsultasOdontograma;
import Modelo.Odontograma;
import Vista.frmConsultasPaciente;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CtrlOdonto implements ActionListener {

    private frmConsultasPaciente frm;

    public CtrlOdonto(frmConsultasPaciente frm) {

        this.frm = frm;
        
        //diente 1
        this.frm.btnD1Cizq13.addActionListener(this);
        this.frm.btnD1Csup13.addActionListener(this);
        this.frm.btnD1Ccen13.addActionListener(this);
        this.frm.btnD1Cder13.addActionListener(this);
        this.frm.btnD1Cinf13.addActionListener(this);

        //diente 2
        this.frm.btnD1Cizq14.addActionListener(this);
        this.frm.btnD1Csup14.addActionListener(this);
        this.frm.btnD1Ccen14.addActionListener(this);
        this.frm.btnD1Cder14.addActionListener(this);
        this.frm.btnD1Cinf14.addActionListener(this);
        //diente 3
        this.frm.btnD1Cizq15.addActionListener(this);
        this.frm.btnD1Csup15.addActionListener(this);
        this.frm.btnD1Ccen15.addActionListener(this);
        this.frm.btnD1Cder15.addActionListener(this);
        this.frm.btnD1Cinf15.addActionListener(this);
        //diente4
        this.frm.btnD1Cizq16.addActionListener(this);
        this.frm.btnD1Csup16.addActionListener(this);
        this.frm.btnD1Ccen16.addActionListener(this);
        this.frm.btnD1Cder16.addActionListener(this);
        this.frm.btnD1Cinf16.addActionListener(this);
        //diente5
        this.frm.btnD1Cizq17.addActionListener(this);
        this.frm.btnD1Csup17.addActionListener(this);
        this.frm.btnD1Ccen17.addActionListener(this);
        this.frm.btnD1Cder17.addActionListener(this);
        this.frm.btnD1Cinf17.addActionListener(this);
        //diente6
        this.frm.btnD1Cizq18.addActionListener(this);
        this.frm.btnD1Csup18.addActionListener(this);
        this.frm.btnD1Ccen18.addActionListener(this);
        this.frm.btnD1Cder18.addActionListener(this);
        this.frm.btnD1Cinf18.addActionListener(this);
        //diente7
        this.frm.btnD1Cizq19.addActionListener(this);
        this.frm.btnD1Csup19.addActionListener(this);
        this.frm.btnD1Ccen19.addActionListener(this);
        this.frm.btnD1Cder19.addActionListener(this);
        this.frm.btnD1Cinf19.addActionListener(this);
        
         //diente8
        this.frm.btnD1Cizq20.addActionListener(this);
        this.frm.btnD1Csup20.addActionListener(this);
        this.frm.btnD1Ccen20.addActionListener(this);
        this.frm.btnD1Cder20.addActionListener(this);
        this.frm.btnD1Cinf20.addActionListener(this);

        //DIENTE 9
        this.frm.btnD21Cizq.addActionListener(this);
        this.frm.btnD21Csup.addActionListener(this);
        this.frm.btnD21Ccen.addActionListener(this);
        this.frm.btnD21Cder.addActionListener(this);
        this.frm.btnD21Cinf.addActionListener(this);
        
        //DIENTE 10
        this.frm.btnD22Cizq.addActionListener(this);
        this.frm.btnD22Csup.addActionListener(this);
        this.frm.btnD22Ccen.addActionListener(this);
        this.frm.btnD22Cder.addActionListener(this);
        this.frm.btnD22Cinf.addActionListener(this);
        
        //DIENTE 11
        this.frm.btnD23Cizq.addActionListener(this);
        this.frm.btnD23Csup.addActionListener(this);
        this.frm.btnD23Ccen.addActionListener(this);
        this.frm.btnD23Cder.addActionListener(this);
        this.frm.btnD23Cinf.addActionListener(this);

        //DIENTE 12
        this.frm.btnD1Cizq5.addActionListener(this);
        this.frm.btnD1Csup5.addActionListener(this);
        this.frm.btnD1Ccen5.addActionListener(this);
        this.frm.btnD1Cder5.addActionListener(this);
        this.frm.btnD1Cinf5.addActionListener(this);

        //DIENTE 13
        this.frm.btnD1Cizq4.addActionListener(this);
        this.frm.btnD1Csup4.addActionListener(this);
        this.frm.btnD1Ccen4.addActionListener(this);
        this.frm.btnD1Cder4.addActionListener(this);
        this.frm.btnD1Cinf4.addActionListener(this);

        //DIENTE 14
        this.frm.btnD1Cizq3.addActionListener(this);
        this.frm.btnD1Csup3.addActionListener(this);
        this.frm.btnD1Ccen3.addActionListener(this);
        this.frm.btnD1Cder3.addActionListener(this);
        this.frm.btnD1Cinf3.addActionListener(this);
        
        //DIENTE 15
        this.frm.btnD1Cizq9.addActionListener(this);
        this.frm.btnD1Csup9.addActionListener(this);
        this.frm.btnD1Ccen9.addActionListener(this);
        this.frm.btnD1Cder9.addActionListener(this);
        this.frm.btnD1Cinf9.addActionListener(this);
        
        //DIENTE 16
        this.frm.btnD1Cizq8.addActionListener(this);
        this.frm.btnD1Csup8.addActionListener(this);
        this.frm.btnD1Ccen8.addActionListener(this);
        this.frm.btnD1Cder8.addActionListener(this);
        this.frm.btnD1Cinf8.addActionListener(this);

    }

    public void iniciar() {
        frm.setTitle("ODONTOGRAMA");
        frm.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //********************************************* PIEZAS DENTALES***************************
        //***********************************************DIENTE 1 ********************************
        if (e.getSource() == frm.btnD1Cizq13) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq13.setIcon(null);
                frm.btnD1Cizq13.setOpaque(true);
                frm.btnD1Cizq13.setBackground(Color.WHITE);
                frm.btnD1Cizq13.setOpaque(true);
                frm.btnD1Cizq13.setBackground(Color.yellow);
                frm.d1_izq = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq13.setIcon(null);
                frm.btnD1Cizq13.setOpaque(true);
                frm.btnD1Cizq13.setBackground(Color.WHITE);
                frm.btnD1Cizq13.setOpaque(true);
                frm.btnD1Cizq13.setBackground(Color.GREEN);
                frm.d1_izq = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq13.setIcon(null);
                frm.btnD1Cizq13.setOpaque(true);
                frm.btnD1Cizq13.setBackground(Color.WHITE);
                frm.btnD1Cizq13.setOpaque(true);
                frm.btnD1Cizq13.setBackground(Color.RED);
                frm.d1_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq13.setIcon(null);
                frm.btnD1Cizq13.setOpaque(true);
                frm.btnD1Cizq13.setBackground(Color.WHITE);
                frm.btnD1Cizq13.setOpaque(true);
                frm.btnD1Cizq13.setBackground(Color.ORANGE);
                frm.d1_izq = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq13.setIcon(null);
                frm.btnD1Cizq13.setOpaque(true);
                frm.btnD1Cizq13.setBackground(Color.WHITE);
                frm.btnD1Cizq13.setOpaque(true);
                frm.btnD1Cizq13.setBackground(Color.BLACK);
                frm.d1_izq = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq13.setIcon(null);
                frm.btnD1Cizq13.setOpaque(true);
                frm.btnD1Cizq13.setBackground(Color.WHITE);
                frm.btnD1Cizq13.setOpaque(true);
                frm.btnD1Cizq13.setBackground(Color.BLUE);
                frm.d1_izq = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq13.setIcon(null);
                frm.btnD1Cizq13.setOpaque(true);
                frm.btnD1Cizq13.setBackground(Color.WHITE);
                frm.btnD1Cizq13.setOpaque(true);
                frm.btnD1Cizq13.setBackground(Color.GRAY);
                frm.d1_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq13.setIcon(null);
                frm.btnD1Cizq13.setOpaque(true);
                frm.btnD1Cizq13.setBackground(Color.WHITE);
                frm.d1_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup13) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup13.setIcon(null);
                frm.btnD1Csup13.setOpaque(true);
                frm.btnD1Csup13.setBackground(Color.WHITE);
                frm.btnD1Csup13.setOpaque(true);
                frm.btnD1Csup13.setBackground(Color.yellow);
                frm.d1_sup = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup13.setIcon(null);
                frm.btnD1Csup13.setOpaque(true);
                frm.btnD1Csup13.setBackground(Color.WHITE);
                frm.btnD1Csup13.setOpaque(true);
                frm.btnD1Csup13.setBackground(Color.GREEN);
                frm.d1_sup = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup13.setIcon(null);
                frm.btnD1Csup13.setOpaque(true);
                frm.btnD1Csup13.setBackground(Color.WHITE);
                frm.btnD1Csup13.setOpaque(true);
                frm.btnD1Csup13.setBackground(Color.RED);
                frm.d1_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup13.setIcon(null);
                frm.btnD1Csup13.setOpaque(true);
                frm.btnD1Csup13.setBackground(Color.WHITE);
                frm.btnD1Csup13.setOpaque(true);
                frm.btnD1Csup13.setBackground(Color.ORANGE);
                frm.d1_sup = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup13.setIcon(null);
                frm.btnD1Csup13.setOpaque(true);
                frm.btnD1Csup13.setBackground(Color.WHITE);
                frm.btnD1Csup13.setOpaque(true);
                frm.btnD1Csup13.setBackground(Color.BLACK);
                frm.d1_sup = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup13.setIcon(null);
                frm.btnD1Csup13.setOpaque(true);
                frm.btnD1Csup13.setBackground(Color.WHITE);
                frm.btnD1Csup13.setOpaque(true);
                frm.btnD1Csup13.setBackground(Color.BLUE);
                frm.d1_sup = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup13.setIcon(null);
                frm.btnD1Csup13.setOpaque(true);
                frm.btnD1Csup13.setBackground(Color.WHITE);
                frm.btnD1Csup13.setOpaque(true);
                frm.btnD1Csup13.setBackground(Color.GRAY);
                frm.d1_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup13.setIcon(null);
                frm.btnD1Csup13.setOpaque(true);
                frm.btnD1Csup13.setBackground(Color.WHITE);
                frm.d1_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen13) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen13.setIcon(null);
                frm.btnD1Ccen13.setOpaque(true);
                frm.btnD1Ccen13.setBackground(Color.WHITE);
                frm.btnD1Ccen13.setOpaque(true);
                frm.btnD1Ccen13.setBackground(Color.yellow);
                frm.d1_cen = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen13.setIcon(null);
                frm.btnD1Ccen13.setOpaque(true);
                frm.btnD1Ccen13.setBackground(Color.WHITE);
                frm.btnD1Ccen13.setOpaque(true);
                frm.btnD1Ccen13.setBackground(Color.GREEN);
                frm.d1_cen = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen13.setIcon(null);
                frm.btnD1Ccen13.setOpaque(true);
                frm.btnD1Ccen13.setBackground(Color.WHITE);
                frm.btnD1Ccen13.setOpaque(true);
                frm.btnD1Ccen13.setBackground(Color.RED);
                frm.d1_cen = "3";

            }

            if (frm.opXroja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen13.setIcon(null);
                frm.btnD1Ccen13.setOpaque(true);
                frm.btnD1Ccen13.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen13.getWidth(), frm.btnD1Ccen13.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD1Ccen13.setIcon(icono);

                frm.btnD1Cizq13.setIcon(null);
                frm.btnD1Cizq13.setOpaque(true);
                frm.btnD1Cizq13.setBackground(Color.WHITE);
                frm.btnD1Csup13.setIcon(null);
                frm.btnD1Csup13.setOpaque(true);
                frm.btnD1Csup13.setBackground(Color.WHITE);
                frm.btnD1Cder13.setIcon(null);
                frm.btnD1Cder13.setOpaque(true);
                frm.btnD1Cder13.setBackground(Color.WHITE);
                frm.btnD1Cinf13.setIcon(null);
                frm.btnD1Cinf13.setOpaque(true);
                frm.btnD1Cinf13.setBackground(Color.WHITE);

                frm.d1_cen = "4";
                frm.d1_izq = "0";
                frm.d1_sup = "0";
                frm.d1_der = "0";
                frm.d1_inf = "0";
            }

            if (frm.opXazul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen13.setIcon(null);
                frm.btnD1Ccen13.setOpaque(true);
                frm.btnD1Ccen13.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen13.getWidth(), frm.btnD1Ccen13.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD1Ccen13.setIcon(icono);

                frm.btnD1Cizq13.setIcon(null);
                frm.btnD1Cizq13.setOpaque(true);
                frm.btnD1Cizq13.setBackground(Color.WHITE);
                frm.btnD1Csup13.setIcon(null);
                frm.btnD1Csup13.setOpaque(true);
                frm.btnD1Csup13.setBackground(Color.WHITE);
                frm.btnD1Cder13.setIcon(null);
                frm.btnD1Cder13.setOpaque(true);
                frm.btnD1Cder13.setBackground(Color.WHITE);
                frm.btnD1Cinf13.setIcon(null);
                frm.btnD1Cinf13.setOpaque(true);
                frm.btnD1Cinf13.setBackground(Color.WHITE);

                frm.d1_cen = "5";
                frm.d1_izq = "0";
                frm.d1_sup = "0";
                frm.d1_der = "0";

            }
            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen13.setIcon(null);
                frm.btnD1Ccen13.setOpaque(true);
                frm.btnD1Ccen13.setBackground(Color.WHITE);
                frm.btnD1Ccen13.setOpaque(true);
                frm.btnD1Ccen13.setBackground(Color.ORANGE);
                frm.d1_cen = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen13.setIcon(null);
                frm.btnD1Ccen13.setOpaque(true);
                frm.btnD1Ccen13.setBackground(Color.WHITE);
                frm.btnD1Ccen13.setOpaque(true);
                frm.btnD1Ccen13.setBackground(Color.BLACK);
                frm.d1_cen = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen13.setIcon(null);
                frm.btnD1Ccen13.setOpaque(true);
                frm.btnD1Ccen13.setBackground(Color.WHITE);
                frm.btnD1Ccen13.setOpaque(true);
                frm.btnD1Ccen13.setBackground(Color.BLUE);
                frm.d1_cen = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen13.setIcon(null);
                frm.btnD1Ccen13.setOpaque(true);
                frm.btnD1Ccen13.setBackground(Color.WHITE);
                frm.btnD1Ccen13.setOpaque(true);
                frm.btnD1Ccen13.setBackground(Color.GRAY);
                frm.d1_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen13.setIcon(null);
                frm.btnD1Ccen13.setOpaque(true);
                frm.btnD1Ccen13.setBackground(Color.WHITE);
                frm.d1_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder13) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder13.setIcon(null);
                frm.btnD1Cder13.setOpaque(true);
                frm.btnD1Cder13.setBackground(Color.WHITE);
                frm.btnD1Cder13.setOpaque(true);
                frm.btnD1Cder13.setBackground(Color.yellow);
                frm.d1_der = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder13.setIcon(null);
                frm.btnD1Cder13.setOpaque(true);
                frm.btnD1Cder13.setBackground(Color.WHITE);
                frm.btnD1Cder13.setOpaque(true);
                frm.btnD1Cder13.setBackground(Color.GREEN);
                frm.d1_der = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder13.setIcon(null);
                frm.btnD1Cder13.setOpaque(true);
                frm.btnD1Cder13.setBackground(Color.WHITE);
                frm.btnD1Cder13.setOpaque(true);
                frm.btnD1Cder13.setBackground(Color.RED);
                frm.d1_der = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder13.setIcon(null);
                frm.btnD1Cder13.setOpaque(true);
                frm.btnD1Cder13.setBackground(Color.WHITE);
                frm.btnD1Cder13.setOpaque(true);
                frm.btnD1Cder13.setBackground(Color.ORANGE);
                frm.d1_der = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder13.setIcon(null);
                frm.btnD1Cder13.setOpaque(true);
                frm.btnD1Cder13.setBackground(Color.WHITE);
                frm.btnD1Cder13.setOpaque(true);
                frm.btnD1Cder13.setBackground(Color.BLACK);
                frm.d1_der = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder13.setIcon(null);
                frm.btnD1Cder13.setOpaque(true);
                frm.btnD1Cder13.setBackground(Color.WHITE);
                frm.btnD1Cder13.setOpaque(true);
                frm.btnD1Cder13.setBackground(Color.BLUE);
                frm.d1_der = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder13.setIcon(null);
                frm.btnD1Cder13.setOpaque(true);
                frm.btnD1Cder13.setBackground(Color.WHITE);
                frm.btnD1Cder13.setOpaque(true);
                frm.btnD1Cder13.setBackground(Color.GRAY);
                frm.d1_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder13.setIcon(null);
                frm.btnD1Cder13.setOpaque(true);
                frm.btnD1Cder13.setBackground(Color.WHITE);
                frm.d1_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf13) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf13.setIcon(null);
                frm.btnD1Cinf13.setOpaque(true);
                frm.btnD1Cinf13.setBackground(Color.WHITE);
                frm.btnD1Cinf13.setOpaque(true);
                frm.btnD1Cinf13.setBackground(Color.yellow);
                frm.d1_inf = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf13.setIcon(null);
                frm.btnD1Cinf13.setOpaque(true);
                frm.btnD1Cinf13.setBackground(Color.WHITE);
                frm.btnD1Cinf13.setOpaque(true);
                frm.btnD1Cinf13.setBackground(Color.GREEN);
                frm.d1_inf = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf13.setIcon(null);
                frm.btnD1Cinf13.setOpaque(true);
                frm.btnD1Cinf13.setBackground(Color.WHITE);
                frm.btnD1Cinf13.setOpaque(true);
                frm.btnD1Cinf13.setBackground(Color.RED);
                frm.d1_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf13.setIcon(null);
                frm.btnD1Cinf13.setOpaque(true);
                frm.btnD1Cinf13.setBackground(Color.WHITE);
                frm.btnD1Cinf13.setOpaque(true);
                frm.btnD1Cinf13.setBackground(Color.ORANGE);
                frm.d1_inf = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf13.setIcon(null);
                frm.btnD1Cinf13.setOpaque(true);
                frm.btnD1Cinf13.setBackground(Color.WHITE);
                frm.btnD1Cinf13.setOpaque(true);
                frm.btnD1Cinf13.setBackground(Color.BLACK);
                frm.d1_inf = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf13.setIcon(null);
                frm.btnD1Cinf13.setOpaque(true);
                frm.btnD1Cinf13.setBackground(Color.WHITE);
                frm.btnD1Cinf13.setOpaque(true);
                frm.btnD1Cinf13.setBackground(Color.BLUE);
                frm.d1_inf = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf13.setIcon(null);
                frm.btnD1Cinf13.setOpaque(true);
                frm.btnD1Cinf13.setBackground(Color.WHITE);
                frm.btnD1Cinf13.setOpaque(true);
                frm.btnD1Cinf13.setBackground(Color.GRAY);
                frm.d1_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf13.setIcon(null);
                frm.btnD1Cinf13.setOpaque(true);
                frm.btnD1Cinf13.setBackground(Color.WHITE);
                frm.d1_inf = "0";

            }
        }

        //*********************************************** DIENTE 2********************************
        if (e.getSource() == frm.btnD1Cizq14) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq14.setIcon(null);
                frm.btnD1Cizq14.setOpaque(true);
                frm.btnD1Cizq14.setBackground(Color.WHITE);
                frm.btnD1Cizq14.setOpaque(true);
                frm.btnD1Cizq14.setBackground(Color.yellow);
                frm.d2_izq = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq14.setIcon(null);
                frm.btnD1Cizq14.setOpaque(true);
                frm.btnD1Cizq14.setBackground(Color.WHITE);
                frm.btnD1Cizq14.setOpaque(true);
                frm.btnD1Cizq14.setBackground(Color.GREEN);
                frm.d2_izq = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq14.setIcon(null);
                frm.btnD1Cizq14.setOpaque(true);
                frm.btnD1Cizq14.setBackground(Color.WHITE);
                frm.btnD1Cizq14.setOpaque(true);
                frm.btnD1Cizq14.setBackground(Color.RED);
                frm.d2_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq14.setIcon(null);
                frm.btnD1Cizq14.setOpaque(true);
                frm.btnD1Cizq14.setBackground(Color.WHITE);
                frm.btnD1Cizq14.setOpaque(true);
                frm.btnD1Cizq14.setBackground(Color.ORANGE);
                frm.d2_izq = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq14.setIcon(null);
                frm.btnD1Cizq14.setOpaque(true);
                frm.btnD1Cizq14.setBackground(Color.WHITE);
                frm.btnD1Cizq14.setOpaque(true);
                frm.btnD1Cizq14.setBackground(Color.BLACK);
                frm.d2_izq = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq14.setIcon(null);
                frm.btnD1Cizq14.setOpaque(true);
                frm.btnD1Cizq14.setBackground(Color.WHITE);
                frm.btnD1Cizq14.setOpaque(true);
                frm.btnD1Cizq14.setBackground(Color.BLUE);
                frm.d2_izq = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq14.setIcon(null);
                frm.btnD1Cizq14.setOpaque(true);
                frm.btnD1Cizq14.setBackground(Color.WHITE);
                frm.btnD1Cizq14.setOpaque(true);
                frm.btnD1Cizq14.setBackground(Color.GRAY);
                frm.d2_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq14.setIcon(null);
                frm.btnD1Cizq14.setOpaque(true);
                frm.btnD1Cizq14.setBackground(Color.WHITE);
                frm.d2_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup14) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup14.setIcon(null);
                frm.btnD1Csup14.setOpaque(true);
                frm.btnD1Csup14.setBackground(Color.WHITE);
                frm.btnD1Csup14.setOpaque(true);
                frm.btnD1Csup14.setBackground(Color.yellow);
                frm.d2_sup = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup14.setIcon(null);
                frm.btnD1Csup14.setOpaque(true);
                frm.btnD1Csup14.setBackground(Color.WHITE);
                frm.btnD1Csup14.setOpaque(true);
                frm.btnD1Csup14.setBackground(Color.GREEN);
                frm.d2_sup = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup14.setIcon(null);
                frm.btnD1Csup14.setOpaque(true);
                frm.btnD1Csup14.setBackground(Color.WHITE);
                frm.btnD1Csup14.setOpaque(true);
                frm.btnD1Csup14.setBackground(Color.RED);
                frm.d2_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup14.setIcon(null);
                frm.btnD1Csup14.setOpaque(true);
                frm.btnD1Csup14.setBackground(Color.WHITE);
                frm.btnD1Csup14.setOpaque(true);
                frm.btnD1Csup14.setBackground(Color.ORANGE);
                frm.d2_sup = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup14.setIcon(null);
                frm.btnD1Csup14.setOpaque(true);
                frm.btnD1Csup14.setBackground(Color.WHITE);
                frm.btnD1Csup14.setOpaque(true);
                frm.btnD1Csup14.setBackground(Color.BLACK);
                frm.d2_sup = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup14.setIcon(null);
                frm.btnD1Csup14.setOpaque(true);
                frm.btnD1Csup14.setBackground(Color.WHITE);
                frm.btnD1Csup14.setOpaque(true);
                frm.btnD1Csup14.setBackground(Color.BLUE);
                frm.d2_sup = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup14.setIcon(null);
                frm.btnD1Csup14.setOpaque(true);
                frm.btnD1Csup14.setBackground(Color.WHITE);
                frm.btnD1Csup14.setOpaque(true);
                frm.btnD1Csup14.setBackground(Color.GRAY);
                frm.d2_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup14.setIcon(null);
                frm.btnD1Csup14.setOpaque(true);
                frm.btnD1Csup14.setBackground(Color.WHITE);
                frm.d2_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen14) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen14.setIcon(null);
                frm.btnD1Ccen14.setOpaque(true);
                frm.btnD1Ccen14.setBackground(Color.WHITE);
                frm.btnD1Ccen14.setOpaque(true);
                frm.btnD1Ccen14.setBackground(Color.yellow);
                frm.d2_cen = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen14.setIcon(null);
                frm.btnD1Ccen14.setOpaque(true);
                frm.btnD1Ccen14.setBackground(Color.WHITE);
                frm.btnD1Ccen14.setOpaque(true);
                frm.btnD1Ccen14.setBackground(Color.GREEN);
                frm.d2_cen = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen14.setIcon(null);
                frm.btnD1Ccen14.setOpaque(true);
                frm.btnD1Ccen14.setBackground(Color.WHITE);
                frm.btnD1Ccen14.setOpaque(true);
                frm.btnD1Ccen14.setBackground(Color.RED);
                frm.d2_cen = "3";

            }

            if (frm.opXroja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen14.setIcon(null);
                frm.btnD1Ccen14.setOpaque(true);
                frm.btnD1Ccen14.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen14.getWidth(), frm.btnD1Ccen14.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD1Ccen14.setIcon(icono);

                frm.btnD1Cizq14.setIcon(null);
                frm.btnD1Cizq14.setOpaque(true);
                frm.btnD1Cizq14.setBackground(Color.WHITE);
                frm.btnD1Csup14.setIcon(null);
                frm.btnD1Csup14.setOpaque(true);
                frm.btnD1Csup14.setBackground(Color.WHITE);
                frm.btnD1Cder14.setIcon(null);
                frm.btnD1Cder14.setOpaque(true);
                frm.btnD1Cder14.setBackground(Color.WHITE);
                frm.btnD1Cinf14.setIcon(null);
                frm.btnD1Cinf14.setOpaque(true);
                frm.btnD1Cinf14.setBackground(Color.WHITE);

                frm.d2_cen = "4";
                frm.d2_izq = "0";
                frm.d2_sup = "0";
                frm.d2_der = "0";
                frm.d2_inf = "0";
            }

            if (frm.opXazul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen14.setIcon(null);
                frm.btnD1Ccen14.setOpaque(true);
                frm.btnD1Ccen14.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen14.getWidth(), frm.btnD1Ccen14.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD1Ccen14.setIcon(icono);

                frm.btnD1Cizq14.setIcon(null);
                frm.btnD1Cizq14.setOpaque(true);
                frm.btnD1Cizq14.setBackground(Color.WHITE);
                frm.btnD1Csup14.setIcon(null);
                frm.btnD1Csup14.setOpaque(true);
                frm.btnD1Csup14.setBackground(Color.WHITE);
                frm.btnD1Cder14.setIcon(null);
                frm.btnD1Cder14.setOpaque(true);
                frm.btnD1Cder14.setBackground(Color.WHITE);
                frm.btnD1Cinf14.setIcon(null);
                frm.btnD1Cinf14.setOpaque(true);
                frm.btnD1Cinf14.setBackground(Color.WHITE);
                frm.d2_cen = "5";
                frm.d2_izq = "0";
                frm.d2_sup = "0";
                frm.d2_der = "0";
                frm.d2_inf = "0";

            }
            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen14.setIcon(null);
                frm.btnD1Ccen14.setOpaque(true);
                frm.btnD1Ccen14.setBackground(Color.WHITE);
                frm.btnD1Ccen14.setOpaque(true);
                frm.btnD1Ccen14.setBackground(Color.ORANGE);
                frm.d2_cen = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen14.setIcon(null);
                frm.btnD1Ccen14.setOpaque(true);
                frm.btnD1Ccen14.setBackground(Color.WHITE);
                frm.btnD1Ccen14.setOpaque(true);
                frm.btnD1Ccen14.setBackground(Color.BLACK);
                frm.d2_cen = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen14.setIcon(null);
                frm.btnD1Ccen14.setOpaque(true);
                frm.btnD1Ccen14.setBackground(Color.WHITE);
                frm.btnD1Ccen14.setOpaque(true);
                frm.btnD1Ccen14.setBackground(Color.BLUE);
                frm.d2_cen = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen14.setIcon(null);
                frm.btnD1Ccen14.setOpaque(true);
                frm.btnD1Ccen14.setBackground(Color.WHITE);
                frm.btnD1Ccen14.setOpaque(true);
                frm.btnD1Ccen14.setBackground(Color.GRAY);
                frm.d2_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen14.setIcon(null);
                frm.btnD1Ccen14.setOpaque(true);
                frm.btnD1Ccen14.setBackground(Color.WHITE);
                frm.d2_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder14) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder14.setIcon(null);
                frm.btnD1Cder14.setOpaque(true);
                frm.btnD1Cder14.setBackground(Color.WHITE);
                frm.btnD1Cder14.setOpaque(true);
                frm.btnD1Cder14.setBackground(Color.yellow);
                frm.d2_der = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder14.setIcon(null);
                frm.btnD1Cder14.setOpaque(true);
                frm.btnD1Cder14.setBackground(Color.WHITE);
                frm.btnD1Cder14.setOpaque(true);
                frm.btnD1Cder14.setBackground(Color.GREEN);
                frm.d2_der = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder14.setIcon(null);
                frm.btnD1Cder14.setOpaque(true);
                frm.btnD1Cder14.setBackground(Color.WHITE);
                frm.btnD1Cder14.setOpaque(true);
                frm.btnD1Cder14.setBackground(Color.RED);
                frm.d2_der = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder14.setIcon(null);
                frm.btnD1Cder14.setOpaque(true);
                frm.btnD1Cder14.setBackground(Color.WHITE);
                frm.btnD1Cder14.setOpaque(true);
                frm.btnD1Cder14.setBackground(Color.ORANGE);
                frm.d2_der = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder14.setIcon(null);
                frm.btnD1Cder14.setOpaque(true);
                frm.btnD1Cder14.setBackground(Color.WHITE);
                frm.btnD1Cder14.setOpaque(true);
                frm.btnD1Cder14.setBackground(Color.BLACK);
                frm.d2_der = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder14.setIcon(null);
                frm.btnD1Cder14.setOpaque(true);
                frm.btnD1Cder14.setBackground(Color.WHITE);
                frm.btnD1Cder14.setOpaque(true);
                frm.btnD1Cder14.setBackground(Color.BLUE);
                frm.d2_der = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder14.setIcon(null);
                frm.btnD1Cder14.setOpaque(true);
                frm.btnD1Cder14.setBackground(Color.WHITE);
                frm.btnD1Cder14.setOpaque(true);
                frm.btnD1Cder14.setBackground(Color.GRAY);
                frm.d2_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder14.setIcon(null);
                frm.btnD1Cder14.setOpaque(true);
                frm.btnD1Cder14.setBackground(Color.WHITE);
                frm.d2_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf14) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf14.setIcon(null);
                frm.btnD1Cinf14.setOpaque(true);
                frm.btnD1Cinf14.setBackground(Color.WHITE);
                frm.btnD1Cinf14.setOpaque(true);
                frm.btnD1Cinf14.setBackground(Color.yellow);
                frm.d2_inf = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf14.setIcon(null);
                frm.btnD1Cinf14.setOpaque(true);
                frm.btnD1Cinf14.setBackground(Color.WHITE);
                frm.btnD1Cinf14.setOpaque(true);
                frm.btnD1Cinf14.setBackground(Color.GREEN);
                frm.d2_inf = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf14.setIcon(null);
                frm.btnD1Cinf14.setOpaque(true);
                frm.btnD1Cinf14.setBackground(Color.WHITE);
                frm.btnD1Cinf14.setOpaque(true);
                frm.btnD1Cinf14.setBackground(Color.RED);
                frm.d2_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf14.setIcon(null);
                frm.btnD1Cinf14.setOpaque(true);
                frm.btnD1Cinf14.setBackground(Color.WHITE);
                frm.btnD1Cinf14.setOpaque(true);
                frm.btnD1Cinf14.setBackground(Color.ORANGE);
                frm.d2_inf = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf14.setIcon(null);
                frm.btnD1Cinf14.setOpaque(true);
                frm.btnD1Cinf14.setBackground(Color.WHITE);
                frm.btnD1Cinf14.setOpaque(true);
                frm.btnD1Cinf14.setBackground(Color.BLACK);
                frm.d2_inf = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf14.setIcon(null);
                frm.btnD1Cinf14.setOpaque(true);
                frm.btnD1Cinf14.setBackground(Color.WHITE);
                frm.btnD1Cinf14.setOpaque(true);
                frm.btnD1Cinf14.setBackground(Color.BLUE);
                frm.d2_inf = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf14.setIcon(null);
                frm.btnD1Cinf14.setOpaque(true);
                frm.btnD1Cinf14.setBackground(Color.WHITE);
                frm.btnD1Cinf14.setOpaque(true);
                frm.btnD1Cinf14.setBackground(Color.GRAY);
                frm.d2_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf14.setIcon(null);
                frm.btnD1Cinf14.setOpaque(true);
                frm.btnD1Cinf14.setBackground(Color.WHITE);
                frm.d2_inf = "0";

            }
        }

        //DIENTE 3****************************************
        if (e.getSource() == frm.btnD1Cizq15) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq15.setIcon(null);
                frm.btnD1Cizq15.setOpaque(true);
                frm.btnD1Cizq15.setBackground(Color.WHITE);
                frm.btnD1Cizq15.setOpaque(true);
                frm.btnD1Cizq15.setBackground(Color.yellow);
                frm.d3_izq = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq15.setIcon(null);
                frm.btnD1Cizq15.setOpaque(true);
                frm.btnD1Cizq15.setBackground(Color.WHITE);
                frm.btnD1Cizq15.setOpaque(true);
                frm.btnD1Cizq15.setBackground(Color.GREEN);
                frm.d3_izq = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq15.setIcon(null);
                frm.btnD1Cizq15.setOpaque(true);
                frm.btnD1Cizq15.setBackground(Color.WHITE);
                frm.btnD1Cizq15.setOpaque(true);
                frm.btnD1Cizq15.setBackground(Color.RED);
                frm.d3_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq15.setIcon(null);
                frm.btnD1Cizq15.setOpaque(true);
                frm.btnD1Cizq15.setBackground(Color.WHITE);
                frm.btnD1Cizq15.setOpaque(true);
                frm.btnD1Cizq15.setBackground(Color.ORANGE);
                frm.d3_izq = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq15.setIcon(null);
                frm.btnD1Cizq15.setOpaque(true);
                frm.btnD1Cizq15.setBackground(Color.WHITE);
                frm.btnD1Cizq15.setOpaque(true);
                frm.btnD1Cizq15.setBackground(Color.BLACK);
                frm.d3_izq = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq15.setIcon(null);
                frm.btnD1Cizq15.setOpaque(true);
                frm.btnD1Cizq15.setBackground(Color.WHITE);
                frm.btnD1Cizq15.setOpaque(true);
                frm.btnD1Cizq15.setBackground(Color.BLUE);
                frm.d3_izq = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq15.setIcon(null);
                frm.btnD1Cizq15.setOpaque(true);
                frm.btnD1Cizq15.setBackground(Color.WHITE);
                frm.btnD1Cizq15.setOpaque(true);
                frm.btnD1Cizq15.setBackground(Color.GRAY);
                frm.d3_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq15.setIcon(null);
                frm.btnD1Cizq15.setOpaque(true);
                frm.btnD1Cizq15.setBackground(Color.WHITE);
                frm.d3_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup15) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup15.setIcon(null);
                frm.btnD1Csup15.setOpaque(true);
                frm.btnD1Csup15.setBackground(Color.WHITE);
                frm.btnD1Csup15.setOpaque(true);
                frm.btnD1Csup15.setBackground(Color.yellow);
                frm.d3_sup = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup15.setIcon(null);
                frm.btnD1Csup15.setOpaque(true);
                frm.btnD1Csup15.setBackground(Color.WHITE);
                frm.btnD1Csup15.setOpaque(true);
                frm.btnD1Csup15.setBackground(Color.GREEN);
                frm.d3_sup = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup15.setIcon(null);
                frm.btnD1Csup15.setOpaque(true);
                frm.btnD1Csup15.setBackground(Color.WHITE);
                frm.btnD1Csup15.setOpaque(true);
                frm.btnD1Csup15.setBackground(Color.RED);
                frm.d3_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup15.setIcon(null);
                frm.btnD1Csup15.setOpaque(true);
                frm.btnD1Csup15.setBackground(Color.WHITE);
                frm.btnD1Csup15.setOpaque(true);
                frm.btnD1Csup15.setBackground(Color.ORANGE);
                frm.d3_sup = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup15.setIcon(null);
                frm.btnD1Csup15.setOpaque(true);
                frm.btnD1Csup15.setBackground(Color.WHITE);
                frm.btnD1Csup15.setOpaque(true);
                frm.btnD1Csup15.setBackground(Color.BLACK);
                frm.d3_sup = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup15.setIcon(null);
                frm.btnD1Csup15.setOpaque(true);
                frm.btnD1Csup15.setBackground(Color.WHITE);
                frm.btnD1Csup15.setOpaque(true);
                frm.btnD1Csup15.setBackground(Color.BLUE);
                frm.d3_sup = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup15.setIcon(null);
                frm.btnD1Csup15.setOpaque(true);
                frm.btnD1Csup15.setBackground(Color.WHITE);
                frm.btnD1Csup15.setOpaque(true);
                frm.btnD1Csup15.setBackground(Color.GRAY);
                frm.d3_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup15.setIcon(null);
                frm.btnD1Csup15.setOpaque(true);
                frm.btnD1Csup15.setBackground(Color.WHITE);
                frm.d3_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen15) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen15.setIcon(null);
                frm.btnD1Ccen15.setOpaque(true);
                frm.btnD1Ccen15.setBackground(Color.WHITE);
                frm.btnD1Ccen15.setOpaque(true);
                frm.btnD1Ccen15.setBackground(Color.yellow);
                frm.d3_cen = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen15.setIcon(null);
                frm.btnD1Ccen15.setOpaque(true);
                frm.btnD1Ccen15.setBackground(Color.WHITE);
                frm.btnD1Ccen15.setOpaque(true);
                frm.btnD1Ccen15.setBackground(Color.GREEN);
                frm.d3_cen = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen15.setIcon(null);
                frm.btnD1Ccen15.setOpaque(true);
                frm.btnD1Ccen15.setBackground(Color.WHITE);
                frm.btnD1Ccen15.setOpaque(true);
                frm.btnD1Ccen15.setBackground(Color.RED);
                frm.d3_cen = "3";

            }

            if (frm.opXroja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen15.setIcon(null);
                frm.btnD1Ccen15.setOpaque(true);
                frm.btnD1Ccen15.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen15.getWidth(), frm.btnD1Ccen15.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD1Ccen15.setIcon(icono);

                frm.btnD1Cizq15.setIcon(null);
                frm.btnD1Cizq15.setOpaque(true);
                frm.btnD1Cizq15.setBackground(Color.WHITE);
                frm.btnD1Csup15.setIcon(null);
                frm.btnD1Csup15.setOpaque(true);
                frm.btnD1Csup15.setBackground(Color.WHITE);
                frm.btnD1Cder15.setIcon(null);
                frm.btnD1Cder15.setOpaque(true);
                frm.btnD1Cder15.setBackground(Color.WHITE);
                frm.btnD1Cinf15.setIcon(null);
                frm.btnD1Cinf15.setOpaque(true);
                frm.btnD1Cinf15.setBackground(Color.WHITE);

                frm.d3_cen = "4";
                frm.d3_izq = "0";
                frm.d3_sup = "0";
                frm.d3_der = "0";
                frm.d3_inf = "0";
            }

            if (frm.opXazul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen15.setIcon(null);
                frm.btnD1Ccen15.setOpaque(true);
                frm.btnD1Ccen15.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen15.getWidth(), frm.btnD1Ccen15.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD1Ccen15.setIcon(icono);

                frm.btnD1Cizq15.setIcon(null);
                frm.btnD1Cizq15.setOpaque(true);
                frm.btnD1Cizq15.setBackground(Color.WHITE);
                frm.btnD1Csup15.setIcon(null);
                frm.btnD1Csup15.setOpaque(true);
                frm.btnD1Csup15.setBackground(Color.WHITE);
                frm.btnD1Cder15.setIcon(null);
                frm.btnD1Cder15.setOpaque(true);
                frm.btnD1Cder15.setBackground(Color.WHITE);
                frm.btnD1Cinf15.setIcon(null);
                frm.btnD1Cinf15.setOpaque(true);
                frm.btnD1Cinf15.setBackground(Color.WHITE);

                frm.d3_cen = "5";
                frm.d3_izq = "0";
                frm.d3_sup = "0";
                frm.d3_der = "0";
                frm.d3_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen15.setIcon(null);
                frm.btnD1Ccen15.setOpaque(true);
                frm.btnD1Ccen15.setBackground(Color.WHITE);
                frm.btnD1Ccen15.setOpaque(true);
                frm.btnD1Ccen15.setBackground(Color.ORANGE);
                frm.d3_cen = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen15.setIcon(null);
                frm.btnD1Ccen15.setOpaque(true);
                frm.btnD1Ccen15.setBackground(Color.WHITE);
                frm.btnD1Ccen15.setOpaque(true);
                frm.btnD1Ccen15.setBackground(Color.BLACK);
                frm.d3_cen = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen15.setIcon(null);
                frm.btnD1Ccen15.setOpaque(true);
                frm.btnD1Ccen15.setBackground(Color.WHITE);
                frm.btnD1Ccen15.setOpaque(true);
                frm.btnD1Ccen15.setBackground(Color.BLUE);
                frm.d3_cen = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen15.setIcon(null);
                frm.btnD1Ccen15.setOpaque(true);
                frm.btnD1Ccen15.setBackground(Color.WHITE);
                frm.btnD1Ccen15.setOpaque(true);
                frm.btnD1Ccen15.setBackground(Color.GRAY);
                frm.d3_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen15.setIcon(null);
                frm.btnD1Ccen15.setOpaque(true);
                frm.btnD1Ccen15.setBackground(Color.WHITE);
                frm.d3_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder15) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder15.setIcon(null);
                frm.btnD1Cder15.setOpaque(true);
                frm.btnD1Cder15.setBackground(Color.WHITE);
                frm.btnD1Cder15.setOpaque(true);
                frm.btnD1Cder15.setBackground(Color.yellow);
                frm.d3_der = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder15.setIcon(null);
                frm.btnD1Cder15.setOpaque(true);
                frm.btnD1Cder15.setBackground(Color.WHITE);
                frm.btnD1Cder15.setOpaque(true);
                frm.btnD1Cder15.setBackground(Color.GREEN);
                frm.d3_der = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder15.setIcon(null);
                frm.btnD1Cder15.setOpaque(true);
                frm.btnD1Cder15.setBackground(Color.WHITE);
                frm.btnD1Cder15.setOpaque(true);
                frm.btnD1Cder15.setBackground(Color.RED);
                frm.d3_der = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder15.setIcon(null);
                frm.btnD1Cder15.setOpaque(true);
                frm.btnD1Cder15.setBackground(Color.WHITE);
                frm.btnD1Cder15.setOpaque(true);
                frm.btnD1Cder15.setBackground(Color.ORANGE);
                frm.d3_der = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder15.setIcon(null);
                frm.btnD1Cder15.setOpaque(true);
                frm.btnD1Cder15.setBackground(Color.WHITE);
                frm.btnD1Cder15.setOpaque(true);
                frm.btnD1Cder15.setBackground(Color.BLACK);
                frm.d3_der = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder15.setIcon(null);
                frm.btnD1Cder15.setOpaque(true);
                frm.btnD1Cder15.setBackground(Color.WHITE);
                frm.btnD1Cder15.setOpaque(true);
                frm.btnD1Cder15.setBackground(Color.BLUE);
                frm.d3_der = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder15.setIcon(null);
                frm.btnD1Cder15.setOpaque(true);
                frm.btnD1Cder15.setBackground(Color.WHITE);
                frm.btnD1Cder15.setOpaque(true);
                frm.btnD1Cder15.setBackground(Color.GRAY);
                frm.d3_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder15.setIcon(null);
                frm.btnD1Cder15.setOpaque(true);
                frm.btnD1Cder15.setBackground(Color.WHITE);
                frm.d3_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf15) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf15.setIcon(null);
                frm.btnD1Cinf15.setOpaque(true);
                frm.btnD1Cinf15.setBackground(Color.WHITE);
                frm.btnD1Cinf15.setOpaque(true);
                frm.btnD1Cinf15.setBackground(Color.yellow);
                frm.d3_inf = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf15.setIcon(null);
                frm.btnD1Cinf15.setOpaque(true);
                frm.btnD1Cinf15.setBackground(Color.WHITE);
                frm.btnD1Cinf15.setOpaque(true);
                frm.btnD1Cinf15.setBackground(Color.GREEN);
                frm.d3_inf = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf15.setIcon(null);
                frm.btnD1Cinf15.setOpaque(true);
                frm.btnD1Cinf15.setBackground(Color.WHITE);
                frm.btnD1Cinf15.setOpaque(true);
                frm.btnD1Cinf15.setBackground(Color.RED);
                frm.d3_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf15.setIcon(null);
                frm.btnD1Cinf15.setOpaque(true);
                frm.btnD1Cinf15.setBackground(Color.WHITE);
                frm.btnD1Cinf15.setOpaque(true);
                frm.btnD1Cinf15.setBackground(Color.ORANGE);
                frm.d3_inf = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf15.setIcon(null);
                frm.btnD1Cinf15.setOpaque(true);
                frm.btnD1Cinf15.setBackground(Color.WHITE);
                frm.btnD1Cinf15.setOpaque(true);
                frm.btnD1Cinf15.setBackground(Color.BLACK);
                frm.d3_inf = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf15.setIcon(null);
                frm.btnD1Cinf15.setOpaque(true);
                frm.btnD1Cinf15.setBackground(Color.WHITE);
                frm.btnD1Cinf15.setOpaque(true);
                frm.btnD1Cinf15.setBackground(Color.BLUE);
                frm.d3_inf = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf15.setIcon(null);
                frm.btnD1Cinf15.setOpaque(true);
                frm.btnD1Cinf15.setBackground(Color.WHITE);
                frm.btnD1Cinf15.setOpaque(true);
                frm.btnD1Cinf15.setBackground(Color.GRAY);
                frm.d3_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf15.setIcon(null);
                frm.btnD1Cinf15.setOpaque(true);
                frm.btnD1Cinf15.setBackground(Color.WHITE);
                frm.d3_inf = "0";

            }
        }
        //*************************************
        //********************DIENTE 4**********************
        //
        if (e.getSource() == frm.btnD1Cizq16) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq16.setIcon(null);
                frm.btnD1Cizq16.setOpaque(true);
                frm.btnD1Cizq16.setBackground(Color.WHITE);
                frm.btnD1Cizq16.setOpaque(true);
                frm.btnD1Cizq16.setBackground(Color.yellow);
                frm.d4_izq = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq16.setIcon(null);
                frm.btnD1Cizq16.setOpaque(true);
                frm.btnD1Cizq16.setBackground(Color.WHITE);
                frm.btnD1Cizq16.setOpaque(true);
                frm.btnD1Cizq16.setBackground(Color.GREEN);
                frm.d4_izq = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq16.setIcon(null);
                frm.btnD1Cizq16.setOpaque(true);
                frm.btnD1Cizq16.setBackground(Color.WHITE);
                frm.btnD1Cizq16.setOpaque(true);
                frm.btnD1Cizq16.setBackground(Color.RED);
                frm.d4_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq16.setIcon(null);
                frm.btnD1Cizq16.setOpaque(true);
                frm.btnD1Cizq16.setBackground(Color.WHITE);
                frm.btnD1Cizq16.setOpaque(true);
                frm.btnD1Cizq16.setBackground(Color.ORANGE);
                frm.d4_izq = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq16.setIcon(null);
                frm.btnD1Cizq16.setOpaque(true);
                frm.btnD1Cizq16.setBackground(Color.WHITE);
                frm.btnD1Cizq16.setOpaque(true);
                frm.btnD1Cizq16.setBackground(Color.BLACK);
                frm.d4_izq = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq16.setIcon(null);
                frm.btnD1Cizq16.setOpaque(true);
                frm.btnD1Cizq16.setBackground(Color.WHITE);
                frm.btnD1Cizq16.setOpaque(true);
                frm.btnD1Cizq16.setBackground(Color.BLUE);
                frm.d4_izq = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq16.setIcon(null);
                frm.btnD1Cizq16.setOpaque(true);
                frm.btnD1Cizq16.setBackground(Color.WHITE);
                frm.btnD1Cizq16.setOpaque(true);
                frm.btnD1Cizq16.setBackground(Color.GRAY);
                frm.d4_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq16.setIcon(null);
                frm.btnD1Cizq16.setOpaque(true);
                frm.btnD1Cizq16.setBackground(Color.WHITE);
                frm.d4_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup16) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup16.setIcon(null);
                frm.btnD1Csup16.setOpaque(true);
                frm.btnD1Csup16.setBackground(Color.WHITE);
                frm.btnD1Csup16.setOpaque(true);
                frm.btnD1Csup16.setBackground(Color.yellow);
                frm.d4_sup = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup16.setIcon(null);
                frm.btnD1Csup16.setOpaque(true);
                frm.btnD1Csup16.setBackground(Color.WHITE);
                frm.btnD1Csup16.setOpaque(true);
                frm.btnD1Csup16.setBackground(Color.GREEN);
                frm.d4_sup = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup16.setIcon(null);
                frm.btnD1Csup16.setOpaque(true);
                frm.btnD1Csup16.setBackground(Color.WHITE);
                frm.btnD1Csup16.setOpaque(true);
                frm.btnD1Csup16.setBackground(Color.RED);
                frm.d4_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup16.setIcon(null);
                frm.btnD1Csup16.setOpaque(true);
                frm.btnD1Csup16.setBackground(Color.WHITE);
                frm.btnD1Csup16.setOpaque(true);
                frm.btnD1Csup16.setBackground(Color.ORANGE);
                frm.d4_sup = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup16.setIcon(null);
                frm.btnD1Csup16.setOpaque(true);
                frm.btnD1Csup16.setBackground(Color.WHITE);
                frm.btnD1Csup16.setOpaque(true);
                frm.btnD1Csup16.setBackground(Color.BLACK);
                frm.d4_sup = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup16.setIcon(null);
                frm.btnD1Csup16.setOpaque(true);
                frm.btnD1Csup16.setBackground(Color.WHITE);
                frm.btnD1Csup16.setOpaque(true);
                frm.btnD1Csup16.setBackground(Color.BLUE);
                frm.d4_sup = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup16.setIcon(null);
                frm.btnD1Csup16.setOpaque(true);
                frm.btnD1Csup16.setBackground(Color.WHITE);
                frm.btnD1Csup16.setOpaque(true);
                frm.btnD1Csup16.setBackground(Color.GRAY);
                frm.d4_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup16.setIcon(null);
                frm.btnD1Csup16.setOpaque(true);
                frm.btnD1Csup16.setBackground(Color.WHITE);
                frm.d4_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen16) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen16.setIcon(null);
                frm.btnD1Ccen16.setOpaque(true);
                frm.btnD1Ccen16.setBackground(Color.WHITE);
                frm.btnD1Ccen16.setOpaque(true);
                frm.btnD1Ccen16.setBackground(Color.yellow);
                frm.d4_cen = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen16.setIcon(null);
                frm.btnD1Ccen16.setOpaque(true);
                frm.btnD1Ccen16.setBackground(Color.WHITE);
                frm.btnD1Ccen16.setOpaque(true);
                frm.btnD1Ccen16.setBackground(Color.GREEN);
                frm.d4_cen = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen16.setIcon(null);
                frm.btnD1Ccen16.setOpaque(true);
                frm.btnD1Ccen16.setBackground(Color.WHITE);
                frm.btnD1Ccen16.setOpaque(true);
                frm.btnD1Ccen16.setBackground(Color.RED);
                frm.d4_cen = "3";

            }

            if (frm.opXroja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen16.setIcon(null);
                frm.btnD1Ccen16.setOpaque(true);
                frm.btnD1Ccen16.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen16.getWidth(), frm.btnD1Ccen16.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD1Ccen16.setIcon(icono);

                frm.btnD1Cizq16.setIcon(null);
                frm.btnD1Cizq16.setOpaque(true);
                frm.btnD1Cizq16.setBackground(Color.WHITE);
                frm.btnD1Csup16.setIcon(null);
                frm.btnD1Csup16.setOpaque(true);
                frm.btnD1Csup16.setBackground(Color.WHITE);
                frm.btnD1Cder16.setIcon(null);
                frm.btnD1Cder16.setOpaque(true);
                frm.btnD1Cder16.setBackground(Color.WHITE);
                frm.btnD1Cinf16.setIcon(null);
                frm.btnD1Cinf16.setOpaque(true);
                frm.btnD1Cinf16.setBackground(Color.WHITE);

                frm.d4_cen = "4";
                frm.d4_izq = "0";
                frm.d4_sup = "0";
                frm.d4_der = "0";
                frm.d4_inf = "0";
            }

            if (frm.opXazul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen16.setIcon(null);
                frm.btnD1Ccen16.setOpaque(true);
                frm.btnD1Ccen16.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen16.getWidth(), frm.btnD1Ccen16.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD1Ccen16.setIcon(icono);

                frm.btnD1Cizq16.setIcon(null);
                frm.btnD1Cizq16.setOpaque(true);
                frm.btnD1Cizq16.setBackground(Color.WHITE);
                frm.btnD1Csup16.setIcon(null);
                frm.btnD1Csup16.setOpaque(true);
                frm.btnD1Csup16.setBackground(Color.WHITE);
                frm.btnD1Cder16.setIcon(null);
                frm.btnD1Cder16.setOpaque(true);
                frm.btnD1Cder16.setBackground(Color.WHITE);
                frm.btnD1Cinf16.setIcon(null);
                frm.btnD1Cinf16.setOpaque(true);
                frm.btnD1Cinf16.setBackground(Color.WHITE);

                frm.d4_cen = "5";
                frm.d4_izq = "0";
                frm.d4_sup = "0";
                frm.d4_der = "0";
                frm.d4_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen16.setIcon(null);
                frm.btnD1Ccen16.setOpaque(true);
                frm.btnD1Ccen16.setBackground(Color.WHITE);
                frm.btnD1Ccen16.setOpaque(true);
                frm.btnD1Ccen16.setBackground(Color.ORANGE);
                frm.d4_cen = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen16.setIcon(null);
                frm.btnD1Ccen16.setOpaque(true);
                frm.btnD1Ccen16.setBackground(Color.WHITE);
                frm.btnD1Ccen16.setOpaque(true);
                frm.btnD1Ccen16.setBackground(Color.BLACK);
                frm.d4_cen = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen16.setIcon(null);
                frm.btnD1Ccen16.setOpaque(true);
                frm.btnD1Ccen16.setBackground(Color.WHITE);
                frm.btnD1Ccen16.setOpaque(true);
                frm.btnD1Ccen16.setBackground(Color.BLUE);
                frm.d4_cen = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen16.setIcon(null);
                frm.btnD1Ccen16.setOpaque(true);
                frm.btnD1Ccen16.setBackground(Color.WHITE);
                frm.btnD1Ccen16.setOpaque(true);
                frm.btnD1Ccen16.setBackground(Color.GRAY);
                frm.d4_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen16.setIcon(null);
                frm.btnD1Ccen16.setOpaque(true);
                frm.btnD1Ccen16.setBackground(Color.WHITE);
                frm.d4_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder16) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder16.setIcon(null);
                frm.btnD1Cder16.setOpaque(true);
                frm.btnD1Cder16.setBackground(Color.WHITE);
                frm.btnD1Cder16.setOpaque(true);
                frm.btnD1Cder16.setBackground(Color.yellow);
                frm.d4_der = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder16.setIcon(null);
                frm.btnD1Cder16.setOpaque(true);
                frm.btnD1Cder16.setBackground(Color.WHITE);
                frm.btnD1Cder16.setOpaque(true);
                frm.btnD1Cder16.setBackground(Color.GREEN);
                frm.d4_der = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder16.setIcon(null);
                frm.btnD1Cder16.setOpaque(true);
                frm.btnD1Cder16.setBackground(Color.WHITE);
                frm.btnD1Cder16.setOpaque(true);
                frm.btnD1Cder16.setBackground(Color.RED);
                frm.d4_der = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder16.setIcon(null);
                frm.btnD1Cder16.setOpaque(true);
                frm.btnD1Cder16.setBackground(Color.WHITE);
                frm.btnD1Cder16.setOpaque(true);
                frm.btnD1Cder16.setBackground(Color.ORANGE);
                frm.d4_der = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder16.setIcon(null);
                frm.btnD1Cder16.setOpaque(true);
                frm.btnD1Cder16.setBackground(Color.WHITE);
                frm.btnD1Cder16.setOpaque(true);
                frm.btnD1Cder16.setBackground(Color.BLACK);
                frm.d4_der = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder16.setIcon(null);
                frm.btnD1Cder16.setOpaque(true);
                frm.btnD1Cder16.setBackground(Color.WHITE);
                frm.btnD1Cder16.setOpaque(true);
                frm.btnD1Cder16.setBackground(Color.BLUE);
                frm.d4_der = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder16.setIcon(null);
                frm.btnD1Cder16.setOpaque(true);
                frm.btnD1Cder16.setBackground(Color.WHITE);
                frm.btnD1Cder16.setOpaque(true);
                frm.btnD1Cder16.setBackground(Color.GRAY);
                frm.d4_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder16.setIcon(null);
                frm.btnD1Cder16.setOpaque(true);
                frm.btnD1Cder16.setBackground(Color.WHITE);
                frm.d4_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf16) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf16.setIcon(null);
                frm.btnD1Cinf16.setOpaque(true);
                frm.btnD1Cinf16.setBackground(Color.WHITE);
                frm.btnD1Cinf16.setOpaque(true);
                frm.btnD1Cinf16.setBackground(Color.yellow);
                frm.d4_inf = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf16.setIcon(null);
                frm.btnD1Cinf16.setOpaque(true);
                frm.btnD1Cinf16.setBackground(Color.WHITE);
                frm.btnD1Cinf16.setOpaque(true);
                frm.btnD1Cinf16.setBackground(Color.GREEN);
                frm.d4_inf = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf16.setIcon(null);
                frm.btnD1Cinf16.setOpaque(true);
                frm.btnD1Cinf16.setBackground(Color.WHITE);
                frm.btnD1Cinf16.setOpaque(true);
                frm.btnD1Cinf16.setBackground(Color.RED);
                frm.d4_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf16.setIcon(null);
                frm.btnD1Cinf16.setOpaque(true);
                frm.btnD1Cinf16.setBackground(Color.WHITE);
                frm.btnD1Cinf16.setOpaque(true);
                frm.btnD1Cinf16.setBackground(Color.ORANGE);
                frm.d4_inf = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf16.setIcon(null);
                frm.btnD1Cinf16.setOpaque(true);
                frm.btnD1Cinf16.setBackground(Color.WHITE);
                frm.btnD1Cinf16.setOpaque(true);
                frm.btnD1Cinf16.setBackground(Color.BLACK);
                frm.d4_inf = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf16.setIcon(null);
                frm.btnD1Cinf16.setOpaque(true);
                frm.btnD1Cinf16.setBackground(Color.WHITE);
                frm.btnD1Cinf16.setOpaque(true);
                frm.btnD1Cinf16.setBackground(Color.BLUE);
                frm.d4_inf = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf16.setIcon(null);
                frm.btnD1Cinf16.setOpaque(true);
                frm.btnD1Cinf16.setBackground(Color.WHITE);
                frm.btnD1Cinf16.setOpaque(true);
                frm.btnD1Cinf16.setBackground(Color.GRAY);
                frm.d4_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf16.setIcon(null);
                frm.btnD1Cinf16.setOpaque(true);
                frm.btnD1Cinf16.setBackground(Color.WHITE);
                frm.d4_inf = "0";

            }
        }
        //*************************************************************************
        //****************DIENTE 5***********************************************************
        //**
        //
        if (e.getSource() == frm.btnD1Cizq17) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq17.setIcon(null);
                frm.btnD1Cizq17.setOpaque(true);
                frm.btnD1Cizq17.setBackground(Color.WHITE);
                frm.btnD1Cizq17.setOpaque(true);
                frm.btnD1Cizq17.setBackground(Color.yellow);
                frm.d5_izq = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq17.setIcon(null);
                frm.btnD1Cizq17.setOpaque(true);
                frm.btnD1Cizq17.setBackground(Color.WHITE);
                frm.btnD1Cizq17.setOpaque(true);
                frm.btnD1Cizq17.setBackground(Color.GREEN);
                frm.d5_izq = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq17.setIcon(null);
                frm.btnD1Cizq17.setOpaque(true);
                frm.btnD1Cizq17.setBackground(Color.WHITE);
                frm.btnD1Cizq17.setOpaque(true);
                frm.btnD1Cizq17.setBackground(Color.RED);
                frm.d5_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq17.setIcon(null);
                frm.btnD1Cizq17.setOpaque(true);
                frm.btnD1Cizq17.setBackground(Color.WHITE);
                frm.btnD1Cizq17.setOpaque(true);
                frm.btnD1Cizq17.setBackground(Color.ORANGE);
                frm.d5_izq = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq17.setIcon(null);
                frm.btnD1Cizq17.setOpaque(true);
                frm.btnD1Cizq17.setBackground(Color.WHITE);
                frm.btnD1Cizq17.setOpaque(true);
                frm.btnD1Cizq17.setBackground(Color.BLACK);
                frm.d5_izq = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq17.setIcon(null);
                frm.btnD1Cizq17.setOpaque(true);
                frm.btnD1Cizq17.setBackground(Color.WHITE);
                frm.btnD1Cizq17.setOpaque(true);
                frm.btnD1Cizq17.setBackground(Color.BLUE);
                frm.d5_izq = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq17.setIcon(null);
                frm.btnD1Cizq17.setOpaque(true);
                frm.btnD1Cizq17.setBackground(Color.WHITE);
                frm.btnD1Cizq17.setOpaque(true);
                frm.btnD1Cizq17.setBackground(Color.GRAY);
                frm.d5_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq17.setIcon(null);
                frm.btnD1Cizq17.setOpaque(true);
                frm.btnD1Cizq17.setBackground(Color.WHITE);
                frm.d5_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup17) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup17.setIcon(null);
                frm.btnD1Csup17.setOpaque(true);
                frm.btnD1Csup17.setBackground(Color.WHITE);
                frm.btnD1Csup17.setOpaque(true);
                frm.btnD1Csup17.setBackground(Color.yellow);
                frm.d5_sup = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup17.setIcon(null);
                frm.btnD1Csup17.setOpaque(true);
                frm.btnD1Csup17.setBackground(Color.WHITE);
                frm.btnD1Csup17.setOpaque(true);
                frm.btnD1Csup17.setBackground(Color.GREEN);
                frm.d5_sup = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup17.setIcon(null);
                frm.btnD1Csup17.setOpaque(true);
                frm.btnD1Csup17.setBackground(Color.WHITE);
                frm.btnD1Csup17.setOpaque(true);
                frm.btnD1Csup17.setBackground(Color.RED);
                frm.d5_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup17.setIcon(null);
                frm.btnD1Csup17.setOpaque(true);
                frm.btnD1Csup17.setBackground(Color.WHITE);
                frm.btnD1Csup17.setOpaque(true);
                frm.btnD1Csup17.setBackground(Color.ORANGE);
                frm.d5_sup = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup17.setIcon(null);
                frm.btnD1Csup17.setOpaque(true);
                frm.btnD1Csup17.setBackground(Color.WHITE);
                frm.btnD1Csup17.setOpaque(true);
                frm.btnD1Csup17.setBackground(Color.BLACK);
                frm.d5_sup = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup17.setIcon(null);
                frm.btnD1Csup17.setOpaque(true);
                frm.btnD1Csup17.setBackground(Color.WHITE);
                frm.btnD1Csup17.setOpaque(true);
                frm.btnD1Csup17.setBackground(Color.BLUE);
                frm.d5_sup = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup17.setIcon(null);
                frm.btnD1Csup17.setOpaque(true);
                frm.btnD1Csup17.setBackground(Color.WHITE);
                frm.btnD1Csup17.setOpaque(true);
                frm.btnD1Csup17.setBackground(Color.GRAY);
                frm.d5_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup17.setIcon(null);
                frm.btnD1Csup17.setOpaque(true);
                frm.btnD1Csup17.setBackground(Color.WHITE);
                frm.d5_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen17) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen17.setIcon(null);
                frm.btnD1Ccen17.setOpaque(true);
                frm.btnD1Ccen17.setBackground(Color.WHITE);
                frm.btnD1Ccen17.setOpaque(true);
                frm.btnD1Ccen17.setBackground(Color.yellow);
                frm.d5_cen = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen17.setIcon(null);
                frm.btnD1Ccen17.setOpaque(true);
                frm.btnD1Ccen17.setBackground(Color.WHITE);
                frm.btnD1Ccen17.setOpaque(true);
                frm.btnD1Ccen17.setBackground(Color.GREEN);
                frm.d5_cen = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen17.setIcon(null);
                frm.btnD1Ccen17.setOpaque(true);
                frm.btnD1Ccen17.setBackground(Color.WHITE);
                frm.btnD1Ccen17.setOpaque(true);
                frm.btnD1Ccen17.setBackground(Color.RED);
                frm.d5_cen = "3";

            }

            if (frm.opXroja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen17.setIcon(null);
                frm.btnD1Ccen17.setOpaque(true);
                frm.btnD1Ccen17.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen17.getWidth(), frm.btnD1Ccen17.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD1Ccen17.setIcon(icono);

                frm.btnD1Cizq17.setIcon(null);
                frm.btnD1Cizq17.setOpaque(true);
                frm.btnD1Cizq17.setBackground(Color.WHITE);
                frm.btnD1Csup17.setIcon(null);
                frm.btnD1Csup17.setOpaque(true);
                frm.btnD1Csup17.setBackground(Color.WHITE);
                frm.btnD1Cder17.setIcon(null);
                frm.btnD1Cder17.setOpaque(true);
                frm.btnD1Cder17.setBackground(Color.WHITE);
                frm.btnD1Cinf17.setIcon(null);
                frm.btnD1Cinf17.setOpaque(true);
                frm.btnD1Cinf17.setBackground(Color.WHITE);

                frm.d5_cen = "4";
                frm.d5_izq = "0";
                frm.d5_sup = "0";
                frm.d5_der = "0";
                frm.d5_inf = "0";
            }

            if (frm.opXazul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen17.setIcon(null);
                frm.btnD1Ccen17.setOpaque(true);
                frm.btnD1Ccen17.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen17.getWidth(), frm.btnD1Ccen17.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD1Ccen17.setIcon(icono);

                frm.btnD1Cizq17.setIcon(null);
                frm.btnD1Cizq17.setOpaque(true);
                frm.btnD1Cizq17.setBackground(Color.WHITE);
                frm.btnD1Csup17.setIcon(null);
                frm.btnD1Csup17.setOpaque(true);
                frm.btnD1Csup17.setBackground(Color.WHITE);
                frm.btnD1Cder17.setIcon(null);
                frm.btnD1Cder17.setOpaque(true);
                frm.btnD1Cder17.setBackground(Color.WHITE);
                frm.btnD1Cinf17.setIcon(null);
                frm.btnD1Cinf17.setOpaque(true);
                frm.btnD1Cinf17.setBackground(Color.WHITE);

                frm.d5_cen = "5";
                frm.d5_izq = "0";
                frm.d5_sup = "0";
                frm.d5_der = "0";
                frm.d5_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen17.setIcon(null);
                frm.btnD1Ccen17.setOpaque(true);
                frm.btnD1Ccen17.setBackground(Color.WHITE);
                frm.btnD1Ccen17.setOpaque(true);
                frm.btnD1Ccen17.setBackground(Color.ORANGE);
                frm.d5_cen = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen17.setIcon(null);
                frm.btnD1Ccen17.setOpaque(true);
                frm.btnD1Ccen17.setBackground(Color.WHITE);
                frm.btnD1Ccen17.setOpaque(true);
                frm.btnD1Ccen17.setBackground(Color.BLACK);
                frm.d5_cen = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen17.setIcon(null);
                frm.btnD1Ccen17.setOpaque(true);
                frm.btnD1Ccen17.setBackground(Color.WHITE);
                frm.btnD1Ccen17.setOpaque(true);
                frm.btnD1Ccen17.setBackground(Color.BLUE);
                frm.d5_cen = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen17.setIcon(null);
                frm.btnD1Ccen17.setOpaque(true);
                frm.btnD1Ccen17.setBackground(Color.WHITE);
                frm.btnD1Ccen17.setOpaque(true);
                frm.btnD1Ccen17.setBackground(Color.GRAY);
                frm.d5_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen17.setIcon(null);
                frm.btnD1Ccen17.setOpaque(true);
                frm.btnD1Ccen17.setBackground(Color.WHITE);
                frm.d5_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder17) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder17.setIcon(null);
                frm.btnD1Cder17.setOpaque(true);
                frm.btnD1Cder17.setBackground(Color.WHITE);
                frm.btnD1Cder17.setOpaque(true);
                frm.btnD1Cder17.setBackground(Color.yellow);
                frm.d5_der = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder17.setIcon(null);
                frm.btnD1Cder17.setOpaque(true);
                frm.btnD1Cder17.setBackground(Color.WHITE);
                frm.btnD1Cder17.setOpaque(true);
                frm.btnD1Cder17.setBackground(Color.GREEN);
                frm.d5_der = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder17.setIcon(null);
                frm.btnD1Cder17.setOpaque(true);
                frm.btnD1Cder17.setBackground(Color.WHITE);
                frm.btnD1Cder17.setOpaque(true);
                frm.btnD1Cder17.setBackground(Color.RED);
                frm.d5_der = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder17.setIcon(null);
                frm.btnD1Cder17.setOpaque(true);
                frm.btnD1Cder17.setBackground(Color.WHITE);
                frm.btnD1Cder17.setOpaque(true);
                frm.btnD1Cder17.setBackground(Color.ORANGE);
                frm.d5_der = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder17.setIcon(null);
                frm.btnD1Cder17.setOpaque(true);
                frm.btnD1Cder17.setBackground(Color.WHITE);
                frm.btnD1Cder17.setOpaque(true);
                frm.btnD1Cder17.setBackground(Color.BLACK);
                frm.d5_der = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder17.setIcon(null);
                frm.btnD1Cder17.setOpaque(true);
                frm.btnD1Cder17.setBackground(Color.WHITE);
                frm.btnD1Cder17.setOpaque(true);
                frm.btnD1Cder17.setBackground(Color.BLUE);
                frm.d5_der = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder17.setIcon(null);
                frm.btnD1Cder17.setOpaque(true);
                frm.btnD1Cder17.setBackground(Color.WHITE);
                frm.btnD1Cder17.setOpaque(true);
                frm.btnD1Cder17.setBackground(Color.GRAY);
                frm.d5_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder17.setIcon(null);
                frm.btnD1Cder17.setOpaque(true);
                frm.btnD1Cder17.setBackground(Color.WHITE);
                frm.d5_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf17) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf17.setIcon(null);
                frm.btnD1Cinf17.setOpaque(true);
                frm.btnD1Cinf17.setBackground(Color.WHITE);
                frm.btnD1Cinf17.setOpaque(true);
                frm.btnD1Cinf17.setBackground(Color.yellow);
                frm.d5_inf = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf17.setIcon(null);
                frm.btnD1Cinf17.setOpaque(true);
                frm.btnD1Cinf17.setBackground(Color.WHITE);
                frm.btnD1Cinf17.setOpaque(true);
                frm.btnD1Cinf17.setBackground(Color.GREEN);
                frm.d5_inf = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf17.setIcon(null);
                frm.btnD1Cinf17.setOpaque(true);
                frm.btnD1Cinf17.setBackground(Color.WHITE);
                frm.btnD1Cinf17.setOpaque(true);
                frm.btnD1Cinf17.setBackground(Color.RED);
                frm.d5_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf17.setIcon(null);
                frm.btnD1Cinf17.setOpaque(true);
                frm.btnD1Cinf17.setBackground(Color.WHITE);
                frm.btnD1Cinf17.setOpaque(true);
                frm.btnD1Cinf17.setBackground(Color.ORANGE);
                frm.d5_inf = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf17.setIcon(null);
                frm.btnD1Cinf17.setOpaque(true);
                frm.btnD1Cinf17.setBackground(Color.WHITE);
                frm.btnD1Cinf17.setOpaque(true);
                frm.btnD1Cinf17.setBackground(Color.BLACK);
                frm.d5_inf = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf17.setIcon(null);
                frm.btnD1Cinf17.setOpaque(true);
                frm.btnD1Cinf17.setBackground(Color.WHITE);
                frm.btnD1Cinf17.setOpaque(true);
                frm.btnD1Cinf17.setBackground(Color.BLUE);
                frm.d5_inf = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf17.setIcon(null);
                frm.btnD1Cinf17.setOpaque(true);
                frm.btnD1Cinf17.setBackground(Color.WHITE);
                frm.btnD1Cinf17.setOpaque(true);
                frm.btnD1Cinf17.setBackground(Color.GRAY);
                frm.d5_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf17.setIcon(null);
                frm.btnD1Cinf17.setOpaque(true);
                frm.btnD1Cinf17.setBackground(Color.WHITE);
                frm.d5_inf = "0";

            }
        }
        //***************************
        //****************************************DIENTE 6********************************  
        if (e.getSource() == frm.btnD1Cizq18) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq18.setIcon(null);
                frm.btnD1Cizq18.setOpaque(true);
                frm.btnD1Cizq18.setBackground(Color.WHITE);
                frm.btnD1Cizq18.setOpaque(true);
                frm.btnD1Cizq18.setBackground(Color.yellow);
                frm.d6_izq = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq18.setIcon(null);
                frm.btnD1Cizq18.setOpaque(true);
                frm.btnD1Cizq18.setBackground(Color.WHITE);
                frm.btnD1Cizq18.setOpaque(true);
                frm.btnD1Cizq18.setBackground(Color.GREEN);
                frm.d6_izq = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq18.setIcon(null);
                frm.btnD1Cizq18.setOpaque(true);
                frm.btnD1Cizq18.setBackground(Color.WHITE);
                frm.btnD1Cizq18.setOpaque(true);
                frm.btnD1Cizq18.setBackground(Color.RED);
                frm.d6_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq18.setIcon(null);
                frm.btnD1Cizq18.setOpaque(true);
                frm.btnD1Cizq18.setBackground(Color.WHITE);
                frm.btnD1Cizq18.setOpaque(true);
                frm.btnD1Cizq18.setBackground(Color.ORANGE);
                frm.d6_izq = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq18.setIcon(null);
                frm.btnD1Cizq18.setOpaque(true);
                frm.btnD1Cizq18.setBackground(Color.WHITE);
                frm.btnD1Cizq18.setOpaque(true);
                frm.btnD1Cizq18.setBackground(Color.BLACK);
                frm.d6_izq = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq18.setIcon(null);
                frm.btnD1Cizq18.setOpaque(true);
                frm.btnD1Cizq18.setBackground(Color.WHITE);
                frm.btnD1Cizq18.setOpaque(true);
                frm.btnD1Cizq18.setBackground(Color.BLUE);
                frm.d6_izq = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq18.setIcon(null);
                frm.btnD1Cizq18.setOpaque(true);
                frm.btnD1Cizq18.setBackground(Color.WHITE);
                frm.btnD1Cizq18.setOpaque(true);
                frm.btnD1Cizq18.setBackground(Color.GRAY);
                frm.d6_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq18.setIcon(null);
                frm.btnD1Cizq18.setOpaque(true);
                frm.btnD1Cizq18.setBackground(Color.WHITE);
                frm.d6_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup18) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup18.setIcon(null);
                frm.btnD1Csup18.setOpaque(true);
                frm.btnD1Csup18.setBackground(Color.WHITE);
                frm.btnD1Csup18.setOpaque(true);
                frm.btnD1Csup18.setBackground(Color.yellow);
                frm.d6_sup = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup18.setIcon(null);
                frm.btnD1Csup18.setOpaque(true);
                frm.btnD1Csup18.setBackground(Color.WHITE);
                frm.btnD1Csup18.setOpaque(true);
                frm.btnD1Csup18.setBackground(Color.GREEN);
                frm.d6_sup = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup18.setIcon(null);
                frm.btnD1Csup18.setOpaque(true);
                frm.btnD1Csup18.setBackground(Color.WHITE);
                frm.btnD1Csup18.setOpaque(true);
                frm.btnD1Csup18.setBackground(Color.RED);
                frm.d6_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup18.setIcon(null);
                frm.btnD1Csup18.setOpaque(true);
                frm.btnD1Csup18.setBackground(Color.WHITE);
                frm.btnD1Csup18.setOpaque(true);
                frm.btnD1Csup18.setBackground(Color.ORANGE);
                frm.d6_sup = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup18.setIcon(null);
                frm.btnD1Csup18.setOpaque(true);
                frm.btnD1Csup18.setBackground(Color.WHITE);
                frm.btnD1Csup18.setOpaque(true);
                frm.btnD1Csup18.setBackground(Color.BLACK);
                frm.d6_sup = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup18.setIcon(null);
                frm.btnD1Csup18.setOpaque(true);
                frm.btnD1Csup18.setBackground(Color.WHITE);
                frm.btnD1Csup18.setOpaque(true);
                frm.btnD1Csup18.setBackground(Color.BLUE);
                frm.d6_sup = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup18.setIcon(null);
                frm.btnD1Csup18.setOpaque(true);
                frm.btnD1Csup18.setBackground(Color.WHITE);
                frm.btnD1Csup18.setOpaque(true);
                frm.btnD1Csup18.setBackground(Color.GRAY);
                frm.d6_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup18.setIcon(null);
                frm.btnD1Csup18.setOpaque(true);
                frm.btnD1Csup18.setBackground(Color.WHITE);
                frm.d6_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen18) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen18.setIcon(null);
                frm.btnD1Ccen18.setOpaque(true);
                frm.btnD1Ccen18.setBackground(Color.WHITE);
                frm.btnD1Ccen18.setOpaque(true);
                frm.btnD1Ccen18.setBackground(Color.yellow);
                frm.d6_cen = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen18.setIcon(null);
                frm.btnD1Ccen18.setOpaque(true);
                frm.btnD1Ccen18.setBackground(Color.WHITE);
                frm.btnD1Ccen18.setOpaque(true);
                frm.btnD1Ccen18.setBackground(Color.GREEN);
                frm.d6_cen = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen18.setIcon(null);
                frm.btnD1Ccen18.setOpaque(true);
                frm.btnD1Ccen18.setBackground(Color.WHITE);
                frm.btnD1Ccen18.setOpaque(true);
                frm.btnD1Ccen18.setBackground(Color.RED);
                frm.d6_cen = "3";

            }

            if (frm.opXroja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen18.setIcon(null);
                frm.btnD1Ccen18.setOpaque(true);
                frm.btnD1Ccen18.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen18.getWidth(), frm.btnD1Ccen18.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD1Ccen18.setIcon(icono);

                frm.btnD1Cizq18.setIcon(null);
                frm.btnD1Cizq18.setOpaque(true);
                frm.btnD1Cizq18.setBackground(Color.WHITE);
                frm.btnD1Csup18.setIcon(null);
                frm.btnD1Csup18.setOpaque(true);
                frm.btnD1Csup18.setBackground(Color.WHITE);
                frm.btnD1Cder18.setIcon(null);
                frm.btnD1Cder18.setOpaque(true);
                frm.btnD1Cder18.setBackground(Color.WHITE);
                frm.btnD1Cinf18.setIcon(null);
                frm.btnD1Cinf18.setOpaque(true);
                frm.btnD1Cinf18.setBackground(Color.WHITE);

                frm.d6_cen = "4";
                frm.d6_izq = "0";
                frm.d6_sup = "0";
                frm.d6_der = "0";
                frm.d6_inf = "0";
            }

            if (frm.opXazul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen18.setIcon(null);
                frm.btnD1Ccen18.setOpaque(true);
                frm.btnD1Ccen18.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen18.getWidth(), frm.btnD1Ccen18.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD1Ccen18.setIcon(icono);

                frm.btnD1Cizq18.setIcon(null);
                frm.btnD1Cizq18.setOpaque(true);
                frm.btnD1Cizq18.setBackground(Color.WHITE);
                frm.btnD1Csup18.setIcon(null);
                frm.btnD1Csup18.setOpaque(true);
                frm.btnD1Csup18.setBackground(Color.WHITE);
                frm.btnD1Cder18.setIcon(null);
                frm.btnD1Cder18.setOpaque(true);
                frm.btnD1Cder18.setBackground(Color.WHITE);
                frm.btnD1Cinf18.setIcon(null);
                frm.btnD1Cinf18.setOpaque(true);
                frm.btnD1Cinf18.setBackground(Color.WHITE);

                frm.d6_cen = "5";
                frm.d6_izq = "0";
                frm.d6_sup = "0";
                frm.d6_der = "0";
                frm.d6_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen18.setIcon(null);
                frm.btnD1Ccen18.setOpaque(true);
                frm.btnD1Ccen18.setBackground(Color.WHITE);
                frm.btnD1Ccen18.setOpaque(true);
                frm.btnD1Ccen18.setBackground(Color.ORANGE);
                frm.d6_cen = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen18.setIcon(null);
                frm.btnD1Ccen18.setOpaque(true);
                frm.btnD1Ccen18.setBackground(Color.WHITE);
                frm.btnD1Ccen18.setOpaque(true);
                frm.btnD1Ccen18.setBackground(Color.BLACK);
                frm.d6_cen = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen18.setIcon(null);
                frm.btnD1Ccen18.setOpaque(true);
                frm.btnD1Ccen18.setBackground(Color.WHITE);
                frm.btnD1Ccen18.setOpaque(true);
                frm.btnD1Ccen18.setBackground(Color.BLUE);
                frm.d6_cen = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen18.setIcon(null);
                frm.btnD1Ccen18.setOpaque(true);
                frm.btnD1Ccen18.setBackground(Color.WHITE);
                frm.btnD1Ccen18.setOpaque(true);
                frm.btnD1Ccen18.setBackground(Color.GRAY);
                frm.d6_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen18.setIcon(null);
                frm.btnD1Ccen18.setOpaque(true);
                frm.btnD1Ccen18.setBackground(Color.WHITE);
                frm.d6_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder18) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder18.setIcon(null);
                frm.btnD1Cder18.setOpaque(true);
                frm.btnD1Cder18.setBackground(Color.WHITE);
                frm.btnD1Cder18.setOpaque(true);
                frm.btnD1Cder18.setBackground(Color.yellow);
                frm.d6_der = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder18.setIcon(null);
                frm.btnD1Cder18.setOpaque(true);
                frm.btnD1Cder18.setBackground(Color.WHITE);
                frm.btnD1Cder18.setOpaque(true);
                frm.btnD1Cder18.setBackground(Color.GREEN);
                frm.d6_der = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder18.setIcon(null);
                frm.btnD1Cder18.setOpaque(true);
                frm.btnD1Cder18.setBackground(Color.WHITE);
                frm.btnD1Cder18.setOpaque(true);
                frm.btnD1Cder18.setBackground(Color.RED);
                frm.d6_der = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder18.setIcon(null);
                frm.btnD1Cder18.setOpaque(true);
                frm.btnD1Cder18.setBackground(Color.WHITE);
                frm.btnD1Cder18.setOpaque(true);
                frm.btnD1Cder18.setBackground(Color.ORANGE);
                frm.d6_der = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder18.setIcon(null);
                frm.btnD1Cder18.setOpaque(true);
                frm.btnD1Cder18.setBackground(Color.WHITE);
                frm.btnD1Cder18.setOpaque(true);
                frm.btnD1Cder18.setBackground(Color.BLACK);
                frm.d6_der = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder18.setIcon(null);
                frm.btnD1Cder18.setOpaque(true);
                frm.btnD1Cder18.setBackground(Color.WHITE);
                frm.btnD1Cder18.setOpaque(true);
                frm.btnD1Cder18.setBackground(Color.BLUE);
                frm.d6_der = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder18.setIcon(null);
                frm.btnD1Cder18.setOpaque(true);
                frm.btnD1Cder18.setBackground(Color.WHITE);
                frm.btnD1Cder18.setOpaque(true);
                frm.btnD1Cder18.setBackground(Color.GRAY);
                frm.d6_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder18.setIcon(null);
                frm.btnD1Cder18.setOpaque(true);
                frm.btnD1Cder18.setBackground(Color.WHITE);
                frm.d6_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf18) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf18.setIcon(null);
                frm.btnD1Cinf18.setOpaque(true);
                frm.btnD1Cinf18.setBackground(Color.WHITE);
                frm.btnD1Cinf18.setOpaque(true);
                frm.btnD1Cinf18.setBackground(Color.yellow);
                frm.d6_inf = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf18.setIcon(null);
                frm.btnD1Cinf18.setOpaque(true);
                frm.btnD1Cinf18.setBackground(Color.WHITE);
                frm.btnD1Cinf18.setOpaque(true);
                frm.btnD1Cinf18.setBackground(Color.GREEN);
                frm.d6_inf = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf18.setIcon(null);
                frm.btnD1Cinf18.setOpaque(true);
                frm.btnD1Cinf18.setBackground(Color.WHITE);
                frm.btnD1Cinf18.setOpaque(true);
                frm.btnD1Cinf18.setBackground(Color.RED);
                frm.d6_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf18.setIcon(null);
                frm.btnD1Cinf18.setOpaque(true);
                frm.btnD1Cinf18.setBackground(Color.WHITE);
                frm.btnD1Cinf18.setOpaque(true);
                frm.btnD1Cinf18.setBackground(Color.ORANGE);
                frm.d6_inf = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf18.setIcon(null);
                frm.btnD1Cinf18.setOpaque(true);
                frm.btnD1Cinf18.setBackground(Color.WHITE);
                frm.btnD1Cinf18.setOpaque(true);
                frm.btnD1Cinf18.setBackground(Color.BLACK);
                frm.d6_inf = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf18.setIcon(null);
                frm.btnD1Cinf18.setOpaque(true);
                frm.btnD1Cinf18.setBackground(Color.WHITE);
                frm.btnD1Cinf18.setOpaque(true);
                frm.btnD1Cinf18.setBackground(Color.BLUE);
                frm.d6_inf = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf18.setIcon(null);
                frm.btnD1Cinf18.setOpaque(true);
                frm.btnD1Cinf18.setBackground(Color.WHITE);
                frm.btnD1Cinf18.setOpaque(true);
                frm.btnD1Cinf18.setBackground(Color.GRAY);
                frm.d6_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf18.setIcon(null);
                frm.btnD1Cinf18.setOpaque(true);
                frm.btnD1Cinf18.setBackground(Color.WHITE);
                frm.d6_inf = "0";

            }
        }
        //**********************************************************************************
        //***************************
        //****************************************DIENTE 7*******************************  
        if (e.getSource() == frm.btnD1Cizq19) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq19.setIcon(null);
                frm.btnD1Cizq19.setOpaque(true);
                frm.btnD1Cizq19.setBackground(Color.WHITE);
                frm.btnD1Cizq19.setOpaque(true);
                frm.btnD1Cizq19.setBackground(Color.yellow);
                frm.d7_izq = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq19.setIcon(null);
                frm.btnD1Cizq19.setOpaque(true);
                frm.btnD1Cizq19.setBackground(Color.WHITE);
                frm.btnD1Cizq19.setOpaque(true);
                frm.btnD1Cizq19.setBackground(Color.GREEN);
                frm.d7_izq = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq19.setIcon(null);
                frm.btnD1Cizq19.setOpaque(true);
                frm.btnD1Cizq19.setBackground(Color.WHITE);
                frm.btnD1Cizq19.setOpaque(true);
                frm.btnD1Cizq19.setBackground(Color.RED);
                frm.d7_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq19.setIcon(null);
                frm.btnD1Cizq19.setOpaque(true);
                frm.btnD1Cizq19.setBackground(Color.WHITE);
                frm.btnD1Cizq19.setOpaque(true);
                frm.btnD1Cizq19.setBackground(Color.ORANGE);
                frm.d7_izq = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq19.setIcon(null);
                frm.btnD1Cizq19.setOpaque(true);
                frm.btnD1Cizq19.setBackground(Color.WHITE);
                frm.btnD1Cizq19.setOpaque(true);
                frm.btnD1Cizq19.setBackground(Color.BLACK);
                frm.d7_izq = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq19.setIcon(null);
                frm.btnD1Cizq19.setOpaque(true);
                frm.btnD1Cizq19.setBackground(Color.WHITE);
                frm.btnD1Cizq19.setOpaque(true);
                frm.btnD1Cizq19.setBackground(Color.BLUE);
                frm.d7_izq = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq19.setIcon(null);
                frm.btnD1Cizq19.setOpaque(true);
                frm.btnD1Cizq19.setBackground(Color.WHITE);
                frm.btnD1Cizq19.setOpaque(true);
                frm.btnD1Cizq19.setBackground(Color.GRAY);
                frm.d7_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq19.setIcon(null);
                frm.btnD1Cizq19.setOpaque(true);
                frm.btnD1Cizq19.setBackground(Color.WHITE);
                frm.d7_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup19) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup19.setIcon(null);
                frm.btnD1Csup19.setOpaque(true);
                frm.btnD1Csup19.setBackground(Color.WHITE);
                frm.btnD1Csup19.setOpaque(true);
                frm.btnD1Csup19.setBackground(Color.yellow);
                frm.d7_sup = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup19.setIcon(null);
                frm.btnD1Csup19.setOpaque(true);
                frm.btnD1Csup19.setBackground(Color.WHITE);
                frm.btnD1Csup19.setOpaque(true);
                frm.btnD1Csup19.setBackground(Color.GREEN);
                frm.d7_sup = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup19.setIcon(null);
                frm.btnD1Csup19.setOpaque(true);
                frm.btnD1Csup19.setBackground(Color.WHITE);
                frm.btnD1Csup19.setOpaque(true);
                frm.btnD1Csup19.setBackground(Color.RED);
                frm.d7_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup19.setIcon(null);
                frm.btnD1Csup19.setOpaque(true);
                frm.btnD1Csup19.setBackground(Color.WHITE);
                frm.btnD1Csup19.setOpaque(true);
                frm.btnD1Csup19.setBackground(Color.ORANGE);
                frm.d7_sup = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup19.setIcon(null);
                frm.btnD1Csup19.setOpaque(true);
                frm.btnD1Csup19.setBackground(Color.WHITE);
                frm.btnD1Csup19.setOpaque(true);
                frm.btnD1Csup19.setBackground(Color.BLACK);
                frm.d7_sup = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup19.setIcon(null);
                frm.btnD1Csup19.setOpaque(true);
                frm.btnD1Csup19.setBackground(Color.WHITE);
                frm.btnD1Csup19.setOpaque(true);
                frm.btnD1Csup19.setBackground(Color.BLUE);
                frm.d7_sup = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup19.setIcon(null);
                frm.btnD1Csup19.setOpaque(true);
                frm.btnD1Csup19.setBackground(Color.WHITE);
                frm.btnD1Csup19.setOpaque(true);
                frm.btnD1Csup19.setBackground(Color.GRAY);
                frm.d7_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup19.setIcon(null);
                frm.btnD1Csup19.setOpaque(true);
                frm.btnD1Csup19.setBackground(Color.WHITE);
                frm.d7_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen19) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen19.setIcon(null);
                frm.btnD1Ccen19.setOpaque(true);
                frm.btnD1Ccen19.setBackground(Color.WHITE);
                frm.btnD1Ccen19.setOpaque(true);
                frm.btnD1Ccen19.setBackground(Color.yellow);
                frm.d7_cen = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen19.setIcon(null);
                frm.btnD1Ccen19.setOpaque(true);
                frm.btnD1Ccen19.setBackground(Color.WHITE);
                frm.btnD1Ccen19.setOpaque(true);
                frm.btnD1Ccen19.setBackground(Color.GREEN);
                frm.d7_cen = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen19.setIcon(null);
                frm.btnD1Ccen19.setOpaque(true);
                frm.btnD1Ccen19.setBackground(Color.WHITE);
                frm.btnD1Ccen19.setOpaque(true);
                frm.btnD1Ccen19.setBackground(Color.RED);
                frm.d7_cen = "3";

            }

            if (frm.opXroja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen19.setIcon(null);
                frm.btnD1Ccen19.setOpaque(true);
                frm.btnD1Ccen19.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen19.getWidth(), frm.btnD1Ccen19.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD1Ccen19.setIcon(icono);

                frm.btnD1Cizq19.setIcon(null);
                frm.btnD1Cizq19.setOpaque(true);
                frm.btnD1Cizq19.setBackground(Color.WHITE);
                frm.btnD1Csup19.setIcon(null);
                frm.btnD1Csup19.setOpaque(true);
                frm.btnD1Csup19.setBackground(Color.WHITE);
                frm.btnD1Cder19.setIcon(null);
                frm.btnD1Cder19.setOpaque(true);
                frm.btnD1Cder19.setBackground(Color.WHITE);
                frm.btnD1Cinf19.setIcon(null);
                frm.btnD1Cinf19.setOpaque(true);
                frm.btnD1Cinf19.setBackground(Color.WHITE);

                frm.d7_cen = "4";
                frm.d7_izq = "0";
                frm.d7_sup = "0";
                frm.d7_der = "0";
                frm.d7_inf = "0";
            }

            if (frm.opXazul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen19.setIcon(null);
                frm.btnD1Ccen19.setOpaque(true);
                frm.btnD1Ccen19.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen19.getWidth(), frm.btnD1Ccen19.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD1Ccen19.setIcon(icono);

                frm.btnD1Cizq19.setIcon(null);
                frm.btnD1Cizq19.setOpaque(true);
                frm.btnD1Cizq19.setBackground(Color.WHITE);
                frm.btnD1Csup19.setIcon(null);
                frm.btnD1Csup19.setOpaque(true);
                frm.btnD1Csup19.setBackground(Color.WHITE);
                frm.btnD1Cder19.setIcon(null);
                frm.btnD1Cder19.setOpaque(true);
                frm.btnD1Cder19.setBackground(Color.WHITE);
                frm.btnD1Cinf19.setIcon(null);
                frm.btnD1Cinf19.setOpaque(true);
                frm.btnD1Cinf19.setBackground(Color.WHITE);

                frm.d7_cen = "5";
                frm.d7_izq = "0";
                frm.d7_sup = "0";
                frm.d7_der = "0";
                frm.d7_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen19.setIcon(null);
                frm.btnD1Ccen19.setOpaque(true);
                frm.btnD1Ccen19.setBackground(Color.WHITE);
                frm.btnD1Ccen19.setOpaque(true);
                frm.btnD1Ccen19.setBackground(Color.ORANGE);
                frm.d7_cen = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen19.setIcon(null);
                frm.btnD1Ccen19.setOpaque(true);
                frm.btnD1Ccen19.setBackground(Color.WHITE);
                frm.btnD1Ccen19.setOpaque(true);
                frm.btnD1Ccen19.setBackground(Color.BLACK);
                frm.d7_cen = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen19.setIcon(null);
                frm.btnD1Ccen19.setOpaque(true);
                frm.btnD1Ccen19.setBackground(Color.WHITE);
                frm.btnD1Ccen19.setOpaque(true);
                frm.btnD1Ccen19.setBackground(Color.BLUE);
                frm.d7_cen = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen19.setIcon(null);
                frm.btnD1Ccen19.setOpaque(true);
                frm.btnD1Ccen19.setBackground(Color.WHITE);
                frm.btnD1Ccen19.setOpaque(true);
                frm.btnD1Ccen19.setBackground(Color.GRAY);
                frm.d7_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen19.setIcon(null);
                frm.btnD1Ccen19.setOpaque(true);
                frm.btnD1Ccen19.setBackground(Color.WHITE);
                frm.d7_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder19) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder19.setIcon(null);
                frm.btnD1Cder19.setOpaque(true);
                frm.btnD1Cder19.setBackground(Color.WHITE);
                frm.btnD1Cder19.setOpaque(true);
                frm.btnD1Cder19.setBackground(Color.yellow);
                frm.d7_der = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder19.setIcon(null);
                frm.btnD1Cder19.setOpaque(true);
                frm.btnD1Cder19.setBackground(Color.WHITE);
                frm.btnD1Cder19.setOpaque(true);
                frm.btnD1Cder19.setBackground(Color.GREEN);
                frm.d7_der = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder19.setIcon(null);
                frm.btnD1Cder19.setOpaque(true);
                frm.btnD1Cder19.setBackground(Color.WHITE);
                frm.btnD1Cder19.setOpaque(true);
                frm.btnD1Cder19.setBackground(Color.RED);
                frm.d7_der = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder19.setIcon(null);
                frm.btnD1Cder19.setOpaque(true);
                frm.btnD1Cder19.setBackground(Color.WHITE);
                frm.btnD1Cder19.setOpaque(true);
                frm.btnD1Cder19.setBackground(Color.ORANGE);
                frm.d7_der = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder19.setIcon(null);
                frm.btnD1Cder19.setOpaque(true);
                frm.btnD1Cder19.setBackground(Color.WHITE);
                frm.btnD1Cder19.setOpaque(true);
                frm.btnD1Cder19.setBackground(Color.BLACK);
                frm.d7_der = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder19.setIcon(null);
                frm.btnD1Cder19.setOpaque(true);
                frm.btnD1Cder19.setBackground(Color.WHITE);
                frm.btnD1Cder19.setOpaque(true);
                frm.btnD1Cder19.setBackground(Color.BLUE);
                frm.d7_der = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder19.setIcon(null);
                frm.btnD1Cder19.setOpaque(true);
                frm.btnD1Cder19.setBackground(Color.WHITE);
                frm.btnD1Cder19.setOpaque(true);
                frm.btnD1Cder19.setBackground(Color.GRAY);
                frm.d7_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder19.setIcon(null);
                frm.btnD1Cder19.setOpaque(true);
                frm.btnD1Cder19.setBackground(Color.WHITE);
                frm.d7_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf19) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf19.setIcon(null);
                frm.btnD1Cinf19.setOpaque(true);
                frm.btnD1Cinf19.setBackground(Color.WHITE);
                frm.btnD1Cinf19.setOpaque(true);
                frm.btnD1Cinf19.setBackground(Color.yellow);
                frm.d7_inf = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf19.setIcon(null);
                frm.btnD1Cinf19.setOpaque(true);
                frm.btnD1Cinf19.setBackground(Color.WHITE);
                frm.btnD1Cinf19.setOpaque(true);
                frm.btnD1Cinf19.setBackground(Color.GREEN);
                frm.d7_inf = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf19.setIcon(null);
                frm.btnD1Cinf19.setOpaque(true);
                frm.btnD1Cinf19.setBackground(Color.WHITE);
                frm.btnD1Cinf19.setOpaque(true);
                frm.btnD1Cinf19.setBackground(Color.RED);
                frm.d7_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf19.setIcon(null);
                frm.btnD1Cinf19.setOpaque(true);
                frm.btnD1Cinf19.setBackground(Color.WHITE);
                frm.btnD1Cinf19.setOpaque(true);
                frm.btnD1Cinf19.setBackground(Color.ORANGE);
                frm.d7_inf = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf19.setIcon(null);
                frm.btnD1Cinf19.setOpaque(true);
                frm.btnD1Cinf19.setBackground(Color.WHITE);
                frm.btnD1Cinf19.setOpaque(true);
                frm.btnD1Cinf19.setBackground(Color.BLACK);
                frm.d7_inf = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf19.setIcon(null);
                frm.btnD1Cinf19.setOpaque(true);
                frm.btnD1Cinf19.setBackground(Color.WHITE);
                frm.btnD1Cinf19.setOpaque(true);
                frm.btnD1Cinf19.setBackground(Color.BLUE);
                frm.d7_inf = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf19.setIcon(null);
                frm.btnD1Cinf19.setOpaque(true);
                frm.btnD1Cinf19.setBackground(Color.WHITE);
                frm.btnD1Cinf19.setOpaque(true);
                frm.btnD1Cinf19.setBackground(Color.GRAY);
                frm.d7_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf19.setIcon(null);
                frm.btnD1Cinf19.setOpaque(true);
                frm.btnD1Cinf19.setBackground(Color.WHITE);
                frm.d7_inf = "0";

            }
        }
        //**********************************************************************************

        //****************************************DIENTE 8*******************************  
        if (e.getSource() == frm.btnD1Cizq20) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq20.setIcon(null);
                frm.btnD1Cizq20.setOpaque(true);
                frm.btnD1Cizq20.setBackground(Color.WHITE);
                frm.btnD1Cizq20.setOpaque(true);
                frm.btnD1Cizq20.setBackground(Color.yellow);
                frm.d8_izq = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq20.setIcon(null);
                frm.btnD1Cizq20.setOpaque(true);
                frm.btnD1Cizq20.setBackground(Color.WHITE);
                frm.btnD1Cizq20.setOpaque(true);
                frm.btnD1Cizq20.setBackground(Color.GREEN);
                frm.d8_izq = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq20.setIcon(null);
                frm.btnD1Cizq20.setOpaque(true);
                frm.btnD1Cizq20.setBackground(Color.WHITE);
                frm.btnD1Cizq20.setOpaque(true);
                frm.btnD1Cizq20.setBackground(Color.RED);
                frm.d8_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq20.setIcon(null);
                frm.btnD1Cizq20.setOpaque(true);
                frm.btnD1Cizq20.setBackground(Color.WHITE);
                frm.btnD1Cizq20.setOpaque(true);
                frm.btnD1Cizq20.setBackground(Color.ORANGE);
                frm.d8_izq = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq20.setIcon(null);
                frm.btnD1Cizq20.setOpaque(true);
                frm.btnD1Cizq20.setBackground(Color.WHITE);
                frm.btnD1Cizq20.setOpaque(true);
                frm.btnD1Cizq20.setBackground(Color.BLACK);
                frm.d8_izq = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq20.setIcon(null);
                frm.btnD1Cizq20.setOpaque(true);
                frm.btnD1Cizq20.setBackground(Color.WHITE);
                frm.btnD1Cizq20.setOpaque(true);
                frm.btnD1Cizq20.setBackground(Color.BLUE);
                frm.d8_izq = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq20.setIcon(null);
                frm.btnD1Cizq20.setOpaque(true);
                frm.btnD1Cizq20.setBackground(Color.WHITE);
                frm.btnD1Cizq20.setOpaque(true);
                frm.btnD1Cizq20.setBackground(Color.GRAY);
                frm.d8_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq20.setIcon(null);
                frm.btnD1Cizq20.setOpaque(true);
                frm.btnD1Cizq20.setBackground(Color.WHITE);
                frm.d8_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup20) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup20.setIcon(null);
                frm.btnD1Csup20.setOpaque(true);
                frm.btnD1Csup20.setBackground(Color.WHITE);
                frm.btnD1Csup20.setOpaque(true);
                frm.btnD1Csup20.setBackground(Color.yellow);
                frm.d8_sup = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup20.setIcon(null);
                frm.btnD1Csup20.setOpaque(true);
                frm.btnD1Csup20.setBackground(Color.WHITE);
                frm.btnD1Csup20.setOpaque(true);
                frm.btnD1Csup20.setBackground(Color.GREEN);
                frm.d8_sup = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup20.setIcon(null);
                frm.btnD1Csup20.setOpaque(true);
                frm.btnD1Csup20.setBackground(Color.WHITE);
                frm.btnD1Csup20.setOpaque(true);
                frm.btnD1Csup20.setBackground(Color.RED);
                frm.d8_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup20.setIcon(null);
                frm.btnD1Csup20.setOpaque(true);
                frm.btnD1Csup20.setBackground(Color.WHITE);
                frm.btnD1Csup20.setOpaque(true);
                frm.btnD1Csup20.setBackground(Color.ORANGE);
                frm.d8_sup = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup20.setIcon(null);
                frm.btnD1Csup20.setOpaque(true);
                frm.btnD1Csup20.setBackground(Color.WHITE);
                frm.btnD1Csup20.setOpaque(true);
                frm.btnD1Csup20.setBackground(Color.BLACK);
                frm.d8_sup = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup20.setIcon(null);
                frm.btnD1Csup20.setOpaque(true);
                frm.btnD1Csup20.setBackground(Color.WHITE);
                frm.btnD1Csup20.setOpaque(true);
                frm.btnD1Csup20.setBackground(Color.BLUE);
                frm.d8_sup = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup20.setIcon(null);
                frm.btnD1Csup20.setOpaque(true);
                frm.btnD1Csup20.setBackground(Color.WHITE);
                frm.btnD1Csup20.setOpaque(true);
                frm.btnD1Csup20.setBackground(Color.GRAY);
                frm.d8_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup20.setIcon(null);
                frm.btnD1Csup20.setOpaque(true);
                frm.btnD1Csup20.setBackground(Color.WHITE);
                frm.d8_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen20) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen20.setIcon(null);
                frm.btnD1Ccen20.setOpaque(true);
                frm.btnD1Ccen20.setBackground(Color.WHITE);
                frm.btnD1Ccen20.setOpaque(true);
                frm.btnD1Ccen20.setBackground(Color.yellow);
                frm.d8_cen = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen20.setIcon(null);
                frm.btnD1Ccen20.setOpaque(true);
                frm.btnD1Ccen20.setBackground(Color.WHITE);
                frm.btnD1Ccen20.setOpaque(true);
                frm.btnD1Ccen20.setBackground(Color.GREEN);
                frm.d8_cen = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen20.setIcon(null);
                frm.btnD1Ccen20.setOpaque(true);
                frm.btnD1Ccen20.setBackground(Color.WHITE);
                frm.btnD1Ccen20.setOpaque(true);
                frm.btnD1Ccen20.setBackground(Color.RED);
                frm.d8_cen = "3";

            }

            if (frm.opXroja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen20.setIcon(null);
                frm.btnD1Ccen20.setOpaque(true);
                frm.btnD1Ccen20.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen20.getWidth(), frm.btnD1Ccen20.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD1Ccen20.setIcon(icono);

                frm.btnD1Cizq20.setIcon(null);
                frm.btnD1Cizq20.setOpaque(true);
                frm.btnD1Cizq20.setBackground(Color.WHITE);
                frm.btnD1Csup20.setIcon(null);
                frm.btnD1Csup20.setOpaque(true);
                frm.btnD1Csup20.setBackground(Color.WHITE);
                frm.btnD1Cder20.setIcon(null);
                frm.btnD1Cder20.setOpaque(true);
                frm.btnD1Cder20.setBackground(Color.WHITE);
                frm.btnD1Cinf20.setIcon(null);
                frm.btnD1Cinf20.setOpaque(true);
                frm.btnD1Cinf20.setBackground(Color.WHITE);

                frm.d8_cen = "4";
                frm.d8_izq = "0";
                frm.d8_sup = "0";
                frm.d8_der = "0";
                frm.d8_inf = "0";
            }

            if (frm.opXazul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen20.setIcon(null);
                frm.btnD1Ccen20.setOpaque(true);
                frm.btnD1Ccen20.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen20.getWidth(), frm.btnD1Ccen20.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD1Ccen20.setIcon(icono);

                frm.btnD1Cizq20.setIcon(null);
                frm.btnD1Cizq20.setOpaque(true);
                frm.btnD1Cizq20.setBackground(Color.WHITE);
                frm.btnD1Csup20.setIcon(null);
                frm.btnD1Csup20.setOpaque(true);
                frm.btnD1Csup20.setBackground(Color.WHITE);
                frm.btnD1Cder20.setIcon(null);
                frm.btnD1Cder20.setOpaque(true);
                frm.btnD1Cder20.setBackground(Color.WHITE);
                frm.btnD1Cinf20.setIcon(null);
                frm.btnD1Cinf20.setOpaque(true);
                frm.btnD1Cinf20.setBackground(Color.WHITE);

                frm.d8_cen = "5";
                frm.d8_izq = "0";
                frm.d8_sup = "0";
                frm.d8_der = "0";
                frm.d8_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen20.setIcon(null);
                frm.btnD1Ccen20.setOpaque(true);
                frm.btnD1Ccen20.setBackground(Color.WHITE);
                frm.btnD1Ccen20.setOpaque(true);
                frm.btnD1Ccen20.setBackground(Color.ORANGE);
                frm.d8_cen = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen20.setIcon(null);
                frm.btnD1Ccen20.setOpaque(true);
                frm.btnD1Ccen20.setBackground(Color.WHITE);
                frm.btnD1Ccen20.setOpaque(true);
                frm.btnD1Ccen20.setBackground(Color.BLACK);
                frm.d8_cen = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen20.setIcon(null);
                frm.btnD1Ccen20.setOpaque(true);
                frm.btnD1Ccen20.setBackground(Color.WHITE);
                frm.btnD1Ccen20.setOpaque(true);
                frm.btnD1Ccen20.setBackground(Color.BLUE);
                frm.d8_cen = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen20.setIcon(null);
                frm.btnD1Ccen20.setOpaque(true);
                frm.btnD1Ccen20.setBackground(Color.WHITE);
                frm.btnD1Ccen20.setOpaque(true);
                frm.btnD1Ccen20.setBackground(Color.GRAY);
                frm.d8_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen20.setIcon(null);
                frm.btnD1Ccen20.setOpaque(true);
                frm.btnD1Ccen20.setBackground(Color.WHITE);
                frm.d8_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder20) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder20.setIcon(null);
                frm.btnD1Cder20.setOpaque(true);
                frm.btnD1Cder20.setBackground(Color.WHITE);
                frm.btnD1Cder20.setOpaque(true);
                frm.btnD1Cder20.setBackground(Color.yellow);
                frm.d8_der = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder20.setIcon(null);
                frm.btnD1Cder20.setOpaque(true);
                frm.btnD1Cder20.setBackground(Color.WHITE);
                frm.btnD1Cder20.setOpaque(true);
                frm.btnD1Cder20.setBackground(Color.GREEN);
                frm.d8_der = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder20.setIcon(null);
                frm.btnD1Cder20.setOpaque(true);
                frm.btnD1Cder20.setBackground(Color.WHITE);
                frm.btnD1Cder20.setOpaque(true);
                frm.btnD1Cder20.setBackground(Color.RED);
                frm.d8_der = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder20.setIcon(null);
                frm.btnD1Cder20.setOpaque(true);
                frm.btnD1Cder20.setBackground(Color.WHITE);
                frm.btnD1Cder20.setOpaque(true);
                frm.btnD1Cder20.setBackground(Color.ORANGE);
                frm.d8_der = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder20.setIcon(null);
                frm.btnD1Cder20.setOpaque(true);
                frm.btnD1Cder20.setBackground(Color.WHITE);
                frm.btnD1Cder20.setOpaque(true);
                frm.btnD1Cder20.setBackground(Color.BLACK);
                frm.d8_der = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder20.setIcon(null);
                frm.btnD1Cder20.setOpaque(true);
                frm.btnD1Cder20.setBackground(Color.WHITE);
                frm.btnD1Cder20.setOpaque(true);
                frm.btnD1Cder20.setBackground(Color.BLUE);
                frm.d8_der = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder20.setIcon(null);
                frm.btnD1Cder20.setOpaque(true);
                frm.btnD1Cder20.setBackground(Color.WHITE);
                frm.btnD1Cder20.setOpaque(true);
                frm.btnD1Cder20.setBackground(Color.GRAY);
                frm.d8_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder20.setIcon(null);
                frm.btnD1Cder20.setOpaque(true);
                frm.btnD1Cder20.setBackground(Color.WHITE);
                frm.d8_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf20) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf20.setIcon(null);
                frm.btnD1Cinf20.setOpaque(true);
                frm.btnD1Cinf20.setBackground(Color.WHITE);
                frm.btnD1Cinf20.setOpaque(true);
                frm.btnD1Cinf20.setBackground(Color.yellow);
                frm.d8_inf = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf20.setIcon(null);
                frm.btnD1Cinf20.setOpaque(true);
                frm.btnD1Cinf20.setBackground(Color.WHITE);
                frm.btnD1Cinf20.setOpaque(true);
                frm.btnD1Cinf20.setBackground(Color.GREEN);
                frm.d8_inf = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf20.setIcon(null);
                frm.btnD1Cinf20.setOpaque(true);
                frm.btnD1Cinf20.setBackground(Color.WHITE);
                frm.btnD1Cinf20.setOpaque(true);
                frm.btnD1Cinf20.setBackground(Color.RED);
                frm.d8_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf20.setIcon(null);
                frm.btnD1Cinf20.setOpaque(true);
                frm.btnD1Cinf20.setBackground(Color.WHITE);
                frm.btnD1Cinf20.setOpaque(true);
                frm.btnD1Cinf20.setBackground(Color.ORANGE);
                frm.d8_inf = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf20.setIcon(null);
                frm.btnD1Cinf20.setOpaque(true);
                frm.btnD1Cinf20.setBackground(Color.WHITE);
                frm.btnD1Cinf20.setOpaque(true);
                frm.btnD1Cinf20.setBackground(Color.BLACK);
                frm.d8_inf = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf20.setIcon(null);
                frm.btnD1Cinf20.setOpaque(true);
                frm.btnD1Cinf20.setBackground(Color.WHITE);
                frm.btnD1Cinf20.setOpaque(true);
                frm.btnD1Cinf20.setBackground(Color.BLUE);
                frm.d8_inf = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf20.setIcon(null);
                frm.btnD1Cinf20.setOpaque(true);
                frm.btnD1Cinf20.setBackground(Color.WHITE);
                frm.btnD1Cinf20.setOpaque(true);
                frm.btnD1Cinf20.setBackground(Color.GRAY);
                frm.d8_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf20.setIcon(null);
                frm.btnD1Cinf20.setOpaque(true);
                frm.btnD1Cinf20.setBackground(Color.WHITE);
                frm.d8_inf = "0";

            }
        }
        //**********************************************************************************

        //**********************************DIENTE 9
        if (e.getSource() == frm.btnD21Cizq) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Cizq.setIcon(null);
                frm.btnD21Cizq.setOpaque(true);
                frm.btnD21Cizq.setBackground(Color.WHITE);
                frm.btnD21Cizq.setOpaque(true);
                frm.btnD21Cizq.setBackground(Color.yellow);
                frm.d9_izq = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Cizq.setIcon(null);
                frm.btnD21Cizq.setOpaque(true);
                frm.btnD21Cizq.setBackground(Color.WHITE);
                frm.btnD21Cizq.setOpaque(true);
                frm.btnD21Cizq.setBackground(Color.GREEN);
                frm.d9_izq = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Cizq.setIcon(null);
                frm.btnD21Cizq.setOpaque(true);
                frm.btnD21Cizq.setBackground(Color.WHITE);
                frm.btnD21Cizq.setOpaque(true);
                frm.btnD21Cizq.setBackground(Color.RED);
                frm.d9_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Cizq.setIcon(null);
                frm.btnD21Cizq.setOpaque(true);
                frm.btnD21Cizq.setBackground(Color.WHITE);
                frm.btnD21Cizq.setOpaque(true);
                frm.btnD21Cizq.setBackground(Color.ORANGE);
                frm.d9_izq = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Cizq.setIcon(null);
                frm.btnD21Cizq.setOpaque(true);
                frm.btnD21Cizq.setBackground(Color.WHITE);
                frm.btnD21Cizq.setOpaque(true);
                frm.btnD21Cizq.setBackground(Color.BLACK);
                frm.d9_izq = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Cizq.setIcon(null);
                frm.btnD21Cizq.setOpaque(true);
                frm.btnD21Cizq.setBackground(Color.WHITE);
                frm.btnD21Cizq.setOpaque(true);
                frm.btnD21Cizq.setBackground(Color.BLUE);
                frm.d9_izq = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Cizq.setIcon(null);
                frm.btnD21Cizq.setOpaque(true);
                frm.btnD21Cizq.setBackground(Color.WHITE);
                frm.btnD21Cizq.setOpaque(true);
                frm.btnD21Cizq.setBackground(Color.GRAY);
                frm.d9_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Cizq.setIcon(null);
                frm.btnD21Cizq.setOpaque(true);
                frm.btnD21Cizq.setBackground(Color.WHITE);
                frm.d9_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD21Csup) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Csup.setIcon(null);
                frm.btnD21Csup.setOpaque(true);
                frm.btnD21Csup.setBackground(Color.WHITE);
                frm.btnD21Csup.setOpaque(true);
                frm.btnD21Csup.setBackground(Color.yellow);
                frm.d9_sup = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Csup.setIcon(null);
                frm.btnD21Csup.setOpaque(true);
                frm.btnD21Csup.setBackground(Color.WHITE);
                frm.btnD21Csup.setOpaque(true);
                frm.btnD21Csup.setBackground(Color.GREEN);
                frm.d9_sup = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Csup.setIcon(null);
                frm.btnD21Csup.setOpaque(true);
                frm.btnD21Csup.setBackground(Color.WHITE);
                frm.btnD21Csup.setOpaque(true);
                frm.btnD21Csup.setBackground(Color.RED);
                frm.d9_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Csup.setIcon(null);
                frm.btnD21Csup.setOpaque(true);
                frm.btnD21Csup.setBackground(Color.WHITE);
                frm.btnD21Csup.setOpaque(true);
                frm.btnD21Csup.setBackground(Color.ORANGE);
                frm.d9_sup = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Csup.setIcon(null);
                frm.btnD21Csup.setOpaque(true);
                frm.btnD21Csup.setBackground(Color.WHITE);
                frm.btnD21Csup.setOpaque(true);
                frm.btnD21Csup.setBackground(Color.BLACK);
                frm.d9_sup = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Csup.setIcon(null);
                frm.btnD21Csup.setOpaque(true);
                frm.btnD21Csup.setBackground(Color.WHITE);
                frm.btnD21Csup.setOpaque(true);
                frm.btnD21Csup.setBackground(Color.BLUE);
                frm.d9_sup = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Csup.setIcon(null);
                frm.btnD21Csup.setOpaque(true);
                frm.btnD21Csup.setBackground(Color.WHITE);
                frm.btnD21Csup.setOpaque(true);
                frm.btnD21Csup.setBackground(Color.GRAY);
                frm.d9_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Csup.setIcon(null);
                frm.btnD21Csup.setOpaque(true);
                frm.btnD21Csup.setBackground(Color.WHITE);
                frm.d9_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD21Ccen) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Ccen.setIcon(null);
                frm.btnD21Ccen.setOpaque(true);
                frm.btnD21Ccen.setBackground(Color.WHITE);
                frm.btnD21Ccen.setOpaque(true);
                frm.btnD21Ccen.setBackground(Color.yellow);
                frm.d9_cen = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Ccen.setIcon(null);
                frm.btnD21Ccen.setOpaque(true);
                frm.btnD21Ccen.setBackground(Color.WHITE);
                frm.btnD21Ccen.setOpaque(true);
                frm.btnD21Ccen.setBackground(Color.GREEN);
                frm.d9_cen = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Ccen.setIcon(null);
                frm.btnD21Ccen.setOpaque(true);
                frm.btnD21Ccen.setBackground(Color.WHITE);
                frm.btnD21Ccen.setOpaque(true);
                frm.btnD21Ccen.setBackground(Color.RED);
                frm.d9_cen = "3";

            }

            if (frm.opXroja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Ccen.setIcon(null);
                frm.btnD21Ccen.setOpaque(true);
                frm.btnD21Ccen.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD21Ccen.getWidth(), frm.btnD21Ccen.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD21Ccen.setIcon(icono);

                frm.btnD21Cizq.setIcon(null);
                frm.btnD21Cizq.setOpaque(true);
                frm.btnD21Cizq.setBackground(Color.WHITE);
                frm.btnD21Csup.setIcon(null);
                frm.btnD21Csup.setOpaque(true);
                frm.btnD21Csup.setBackground(Color.WHITE);
                frm.btnD21Cder.setIcon(null);
                frm.btnD21Cder.setOpaque(true);
                frm.btnD21Cder.setBackground(Color.WHITE);
                frm.btnD21Cinf.setIcon(null);
                frm.btnD21Cinf.setOpaque(true);
                frm.btnD21Cinf.setBackground(Color.WHITE);

                frm.d9_cen = "4";
                frm.d9_izq = "0";
                frm.d9_sup = "0";
                frm.d9_der = "0";
                frm.d9_inf = "0";
            }

            if (frm.opXazul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Ccen.setIcon(null);
                frm.btnD21Ccen.setOpaque(true);
                frm.btnD21Ccen.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD21Ccen.getWidth(), frm.btnD21Ccen.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD21Ccen.setIcon(icono);

                frm.btnD21Cizq.setIcon(null);
                frm.btnD21Cizq.setOpaque(true);
                frm.btnD21Cizq.setBackground(Color.WHITE);
                frm.btnD21Csup.setIcon(null);
                frm.btnD21Csup.setOpaque(true);
                frm.btnD21Csup.setBackground(Color.WHITE);
                frm.btnD21Cder.setIcon(null);
                frm.btnD21Cder.setOpaque(true);
                frm.btnD21Cder.setBackground(Color.WHITE);
                frm.btnD21Cinf.setIcon(null);
                frm.btnD21Cinf.setOpaque(true);
                frm.btnD21Cinf.setBackground(Color.WHITE);

                frm.d9_cen = "5";
                frm.d9_izq = "0";
                frm.d9_sup = "0";
                frm.d9_der = "0";
                frm.d9_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Ccen.setIcon(null);
                frm.btnD21Ccen.setOpaque(true);
                frm.btnD21Ccen.setBackground(Color.WHITE);
                frm.btnD21Ccen.setOpaque(true);
                frm.btnD21Ccen.setBackground(Color.ORANGE);
                frm.d9_cen = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Ccen.setIcon(null);
                frm.btnD21Ccen.setOpaque(true);
                frm.btnD21Ccen.setBackground(Color.WHITE);
                frm.btnD21Ccen.setOpaque(true);
                frm.btnD21Ccen.setBackground(Color.BLACK);
                frm.d9_cen = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Ccen.setIcon(null);
                frm.btnD21Ccen.setOpaque(true);
                frm.btnD21Ccen.setBackground(Color.WHITE);
                frm.btnD21Ccen.setOpaque(true);
                frm.btnD21Ccen.setBackground(Color.BLUE);
                frm.d9_cen = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Ccen.setIcon(null);
                frm.btnD21Ccen.setOpaque(true);
                frm.btnD21Ccen.setBackground(Color.WHITE);
                frm.btnD21Ccen.setOpaque(true);
                frm.btnD21Ccen.setBackground(Color.GRAY);
                frm.d9_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Ccen.setIcon(null);
                frm.btnD21Ccen.setOpaque(true);
                frm.btnD21Ccen.setBackground(Color.WHITE);
                frm.d9_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD21Cder) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Cder.setIcon(null);
                frm.btnD21Cder.setOpaque(true);
                frm.btnD21Cder.setBackground(Color.WHITE);
                frm.btnD21Cder.setOpaque(true);
                frm.btnD21Cder.setBackground(Color.yellow);
                frm.d9_der = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Cder.setIcon(null);
                frm.btnD21Cder.setOpaque(true);
                frm.btnD21Cder.setBackground(Color.WHITE);
                frm.btnD21Cder.setOpaque(true);
                frm.btnD21Cder.setBackground(Color.GREEN);
                frm.d9_der = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Cder.setIcon(null);
                frm.btnD21Cder.setOpaque(true);
                frm.btnD21Cder.setBackground(Color.WHITE);
                frm.btnD21Cder.setOpaque(true);
                frm.btnD21Cder.setBackground(Color.RED);
                frm.d9_der = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Cder.setIcon(null);
                frm.btnD21Cder.setOpaque(true);
                frm.btnD21Cder.setBackground(Color.WHITE);
                frm.btnD21Cder.setOpaque(true);
                frm.btnD21Cder.setBackground(Color.ORANGE);
                frm.d9_der = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Cder.setIcon(null);
                frm.btnD21Cder.setOpaque(true);
                frm.btnD21Cder.setBackground(Color.WHITE);
                frm.btnD21Cder.setOpaque(true);
                frm.btnD21Cder.setBackground(Color.BLACK);
                frm.d9_der = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Cder.setIcon(null);
                frm.btnD21Cder.setOpaque(true);
                frm.btnD21Cder.setBackground(Color.WHITE);
                frm.btnD21Cder.setOpaque(true);
                frm.btnD21Cder.setBackground(Color.BLUE);
                frm.d9_der = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Cder.setIcon(null);
                frm.btnD21Cder.setOpaque(true);
                frm.btnD21Cder.setBackground(Color.WHITE);
                frm.btnD21Cder.setOpaque(true);
                frm.btnD21Cder.setBackground(Color.GRAY);
                frm.d9_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Cder.setIcon(null);
                frm.btnD21Cder.setOpaque(true);
                frm.btnD21Cder.setBackground(Color.WHITE);
                frm.d9_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD21Cinf) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Cinf.setIcon(null);
                frm.btnD21Cinf.setOpaque(true);
                frm.btnD21Cinf.setBackground(Color.WHITE);
                frm.btnD21Cinf.setOpaque(true);
                frm.btnD21Cinf.setBackground(Color.yellow);
                frm.d9_inf = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Cinf.setIcon(null);
                frm.btnD21Cinf.setOpaque(true);
                frm.btnD21Cinf.setBackground(Color.WHITE);
                frm.btnD21Cinf.setOpaque(true);
                frm.btnD21Cinf.setBackground(Color.GREEN);
                frm.d9_inf = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Cinf.setIcon(null);
                frm.btnD21Cinf.setOpaque(true);
                frm.btnD21Cinf.setBackground(Color.WHITE);
                frm.btnD21Cinf.setOpaque(true);
                frm.btnD21Cinf.setBackground(Color.RED);
                frm.d9_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Cinf.setIcon(null);
                frm.btnD21Cinf.setOpaque(true);
                frm.btnD21Cinf.setBackground(Color.WHITE);
                frm.btnD21Cinf.setOpaque(true);
                frm.btnD21Cinf.setBackground(Color.ORANGE);
                frm.d9_inf = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Cinf.setIcon(null);
                frm.btnD21Cinf.setOpaque(true);
                frm.btnD21Cinf.setBackground(Color.WHITE);
                frm.btnD21Cinf.setOpaque(true);
                frm.btnD21Cinf.setBackground(Color.BLACK);
                frm.d9_inf = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Cinf.setIcon(null);
                frm.btnD21Cinf.setOpaque(true);
                frm.btnD21Cinf.setBackground(Color.WHITE);
                frm.btnD21Cinf.setOpaque(true);
                frm.btnD21Cinf.setBackground(Color.BLUE);
                frm.d9_inf = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Cinf.setIcon(null);
                frm.btnD21Cinf.setOpaque(true);
                frm.btnD21Cinf.setBackground(Color.WHITE);
                frm.btnD21Cinf.setOpaque(true);
                frm.btnD21Cinf.setBackground(Color.GRAY);
                frm.d9_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD21Cinf.setIcon(null);
                frm.btnD21Cinf.setOpaque(true);
                frm.btnD21Cinf.setBackground(Color.WHITE);
                frm.d9_inf = "0";

            }
        }

        //****************************
        //****************************************  DIENTE 10 **************************
        if (e.getSource() == frm.btnD22Cizq) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD22Cizq.setIcon(null);
                frm.btnD22Cizq.setOpaque(true);
                frm.btnD22Cizq.setBackground(Color.WHITE);
                frm.btnD22Cizq.setOpaque(true);
                frm.btnD22Cizq.setBackground(Color.yellow);
                frm.d10_izq = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD22Cizq.setIcon(null);
                frm.btnD22Cizq.setOpaque(true);
                frm.btnD22Cizq.setBackground(Color.WHITE);
                frm.btnD22Cizq.setOpaque(true);
                frm.btnD22Cizq.setBackground(Color.GREEN);
                frm.d10_izq = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD22Cizq.setIcon(null);
                frm.btnD22Cizq.setOpaque(true);
                frm.btnD22Cizq.setBackground(Color.WHITE);
                frm.btnD22Cizq.setOpaque(true);
                frm.btnD22Cizq.setBackground(Color.RED);
                frm.d10_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD22Cizq.setIcon(null);
                frm.btnD22Cizq.setOpaque(true);
                frm.btnD22Cizq.setBackground(Color.WHITE);
                frm.btnD22Cizq.setOpaque(true);
                frm.btnD22Cizq.setBackground(Color.ORANGE);
                frm.d10_izq = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD22Cizq.setIcon(null);
                frm.btnD22Cizq.setOpaque(true);
                frm.btnD22Cizq.setBackground(Color.WHITE);
                frm.btnD22Cizq.setOpaque(true);
                frm.btnD22Cizq.setBackground(Color.BLACK);
                frm.d10_izq = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD22Cizq.setIcon(null);
                frm.btnD22Cizq.setOpaque(true);
                frm.btnD22Cizq.setBackground(Color.WHITE);
                frm.btnD22Cizq.setOpaque(true);
                frm.btnD22Cizq.setBackground(Color.BLUE);
                frm.d10_izq = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD22Cizq.setIcon(null);
                frm.btnD22Cizq.setOpaque(true);
                frm.btnD22Cizq.setBackground(Color.WHITE);
                frm.btnD22Cizq.setOpaque(true);
                frm.btnD22Cizq.setBackground(Color.GRAY);
                frm.d10_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD22Cizq.setIcon(null);
                frm.btnD22Cizq.setOpaque(true);
                frm.btnD22Cizq.setBackground(Color.WHITE);
                frm.d10_izq = "0";

            }

        }

        //*********************
        if (e.getSource() == frm.btnD22Csup) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD22Csup.setIcon(null);
                frm.btnD22Csup.setOpaque(true);
                frm.btnD22Csup.setBackground(Color.WHITE);
                frm.btnD22Csup.setOpaque(true);
                frm.btnD22Csup.setBackground(Color.yellow);
                frm.d10_sup = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD22Csup.setIcon(null);
                frm.btnD22Csup.setOpaque(true);
                frm.btnD22Csup.setBackground(Color.WHITE);
                frm.btnD22Csup.setOpaque(true);
                frm.btnD22Csup.setBackground(Color.GREEN);
                frm.d10_sup = "2";

            }

            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD22Csup.setIcon(null);
                frm.btnD22Csup.setOpaque(true);
                frm.btnD22Csup.setBackground(Color.WHITE);
                frm.btnD22Csup.setOpaque(true);
                frm.btnD22Csup.setBackground(Color.RED);
                frm.d10_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD22Csup.setIcon(null);
                frm.btnD22Csup.setOpaque(true);
                frm.btnD22Csup.setBackground(Color.WHITE);
                frm.btnD22Csup.setOpaque(true);
                frm.btnD22Csup.setBackground(Color.ORANGE);
                frm.d10_sup = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD22Csup.setIcon(null);
                frm.btnD22Csup.setOpaque(true);
                frm.btnD22Csup.setBackground(Color.WHITE);
                frm.btnD22Csup.setOpaque(true);
                frm.btnD22Csup.setBackground(Color.BLACK);
                frm.d10_sup = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD22Csup.setIcon(null);
                frm.btnD22Csup.setOpaque(true);
                frm.btnD22Csup.setBackground(Color.WHITE);
                frm.btnD22Csup.setOpaque(true);
                frm.btnD22Csup.setBackground(Color.BLUE);
                frm.d10_sup = "8";

            }

        }
        //****************************************** DIENTE 11 **********************************
        if (e.getSource() == frm.btnD23Cizq) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Cizq.setIcon(null);
                frm.btnD23Cizq.setOpaque(true);
                frm.btnD23Cizq.setBackground(Color.WHITE);
                frm.btnD23Cizq.setOpaque(true);
                frm.btnD23Cizq.setBackground(Color.yellow);
                frm.d11_izq = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Cizq.setIcon(null);
                frm.btnD23Cizq.setOpaque(true);
                frm.btnD23Cizq.setBackground(Color.WHITE);
                frm.btnD23Cizq.setOpaque(true);
                frm.btnD23Cizq.setBackground(Color.GREEN);
                frm.d11_izq = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Cizq.setIcon(null);
                frm.btnD23Cizq.setOpaque(true);
                frm.btnD23Cizq.setBackground(Color.WHITE);
                frm.btnD23Cizq.setOpaque(true);
                frm.btnD23Cizq.setBackground(Color.RED);
                frm.d11_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Cizq.setIcon(null);
                frm.btnD23Cizq.setOpaque(true);
                frm.btnD23Cizq.setBackground(Color.WHITE);
                frm.btnD23Cizq.setOpaque(true);
                frm.btnD23Cizq.setBackground(Color.ORANGE);
                frm.d11_izq = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Cizq.setIcon(null);
                frm.btnD23Cizq.setOpaque(true);
                frm.btnD23Cizq.setBackground(Color.WHITE);
                frm.btnD23Cizq.setOpaque(true);
                frm.btnD23Cizq.setBackground(Color.BLACK);
                frm.d11_izq = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Cizq.setIcon(null);
                frm.btnD23Cizq.setOpaque(true);
                frm.btnD23Cizq.setBackground(Color.WHITE);
                frm.btnD23Cizq.setOpaque(true);
                frm.btnD23Cizq.setBackground(Color.BLUE);
                frm.d11_izq = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Cizq.setIcon(null);
                frm.btnD23Cizq.setOpaque(true);
                frm.btnD23Cizq.setBackground(Color.WHITE);
                frm.btnD23Cizq.setOpaque(true);
                frm.btnD23Cizq.setBackground(Color.GRAY);
                frm.d11_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Cizq.setIcon(null);
                frm.btnD23Cizq.setOpaque(true);
                frm.btnD23Cizq.setBackground(Color.WHITE);
                frm.d11_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD23Csup) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Csup.setIcon(null);
                frm.btnD23Csup.setOpaque(true);
                frm.btnD23Csup.setBackground(Color.WHITE);
                frm.btnD23Csup.setOpaque(true);
                frm.btnD23Csup.setBackground(Color.yellow);
                frm.d11_sup = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Csup.setIcon(null);
                frm.btnD23Csup.setOpaque(true);
                frm.btnD23Csup.setBackground(Color.WHITE);
                frm.btnD23Csup.setOpaque(true);
                frm.btnD23Csup.setBackground(Color.GREEN);
                frm.d11_sup = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Csup.setIcon(null);
                frm.btnD23Csup.setOpaque(true);
                frm.btnD23Csup.setBackground(Color.WHITE);
                frm.btnD23Csup.setOpaque(true);
                frm.btnD23Csup.setBackground(Color.RED);
                frm.d11_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Csup.setIcon(null);
                frm.btnD23Csup.setOpaque(true);
                frm.btnD23Csup.setBackground(Color.WHITE);
                frm.btnD23Csup.setOpaque(true);
                frm.btnD23Csup.setBackground(Color.ORANGE);
                frm.d11_sup = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Csup.setIcon(null);
                frm.btnD23Csup.setOpaque(true);
                frm.btnD23Csup.setBackground(Color.WHITE);
                frm.btnD23Csup.setOpaque(true);
                frm.btnD23Csup.setBackground(Color.BLACK);
                frm.d11_sup = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Csup.setIcon(null);
                frm.btnD23Csup.setOpaque(true);
                frm.btnD23Csup.setBackground(Color.WHITE);
                frm.btnD23Csup.setOpaque(true);
                frm.btnD23Csup.setBackground(Color.BLUE);
                frm.d11_sup = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Csup.setIcon(null);
                frm.btnD23Csup.setOpaque(true);
                frm.btnD23Csup.setBackground(Color.WHITE);
                frm.btnD23Csup.setOpaque(true);
                frm.btnD23Csup.setBackground(Color.GRAY);
                frm.d11_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Csup.setIcon(null);
                frm.btnD23Csup.setOpaque(true);
                frm.btnD23Csup.setBackground(Color.WHITE);
                frm.d11_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD23Ccen) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Ccen.setIcon(null);
                frm.btnD23Ccen.setOpaque(true);
                frm.btnD23Ccen.setBackground(Color.WHITE);
                frm.btnD23Ccen.setOpaque(true);
                frm.btnD23Ccen.setBackground(Color.yellow);
                frm.d11_cen = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Ccen.setIcon(null);
                frm.btnD23Ccen.setOpaque(true);
                frm.btnD23Ccen.setBackground(Color.WHITE);
                frm.btnD23Ccen.setOpaque(true);
                frm.btnD23Ccen.setBackground(Color.GREEN);
                frm.d11_cen = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Ccen.setIcon(null);
                frm.btnD23Ccen.setOpaque(true);
                frm.btnD23Ccen.setBackground(Color.WHITE);
                frm.btnD23Ccen.setOpaque(true);
                frm.btnD23Ccen.setBackground(Color.RED);
                frm.d11_cen = "3";

            }

            if (frm.opXroja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Ccen.setIcon(null);
                frm.btnD23Ccen.setOpaque(true);
                frm.btnD23Ccen.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD23Ccen.getWidth(), frm.btnD23Ccen.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD23Ccen.setIcon(icono);

                frm.btnD23Cizq.setIcon(null);
                frm.btnD23Cizq.setOpaque(true);
                frm.btnD23Cizq.setBackground(Color.WHITE);
                frm.btnD23Csup.setIcon(null);
                frm.btnD23Csup.setOpaque(true);
                frm.btnD23Csup.setBackground(Color.WHITE);
                frm.btnD23Cder.setIcon(null);
                frm.btnD23Cder.setOpaque(true);
                frm.btnD23Cder.setBackground(Color.WHITE);
                frm.btnD23Cinf.setIcon(null);
                frm.btnD23Cinf.setOpaque(true);
                frm.btnD23Cinf.setBackground(Color.WHITE);

                frm.d11_cen = "4";
                frm.d11_izq = "0";
                frm.d11_sup = "0";
                frm.d11_der = "0";
                frm.d11_inf = "0";
            }

            if (frm.opXazul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Ccen.setIcon(null);
                frm.btnD23Ccen.setOpaque(true);
                frm.btnD23Ccen.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD23Ccen.getWidth(), frm.btnD23Ccen.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD23Ccen.setIcon(icono);

                frm.btnD23Cizq.setIcon(null);
                frm.btnD23Cizq.setOpaque(true);
                frm.btnD23Cizq.setBackground(Color.WHITE);
                frm.btnD23Csup.setIcon(null);
                frm.btnD23Csup.setOpaque(true);
                frm.btnD23Csup.setBackground(Color.WHITE);
                frm.btnD23Cder.setIcon(null);
                frm.btnD23Cder.setOpaque(true);
                frm.btnD23Cder.setBackground(Color.WHITE);
                frm.btnD23Cinf.setIcon(null);
                frm.btnD23Cinf.setOpaque(true);
                frm.btnD23Cinf.setBackground(Color.WHITE);

                frm.d11_cen = "5";
                frm.d11_izq = "0";
                frm.d11_sup = "0";
                frm.d11_der = "0";
                frm.d11_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Ccen.setIcon(null);
                frm.btnD23Ccen.setOpaque(true);
                frm.btnD23Ccen.setBackground(Color.WHITE);
                frm.btnD23Ccen.setOpaque(true);
                frm.btnD23Ccen.setBackground(Color.ORANGE);
                frm.d11_cen = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Ccen.setIcon(null);
                frm.btnD23Ccen.setOpaque(true);
                frm.btnD23Ccen.setBackground(Color.WHITE);
                frm.btnD23Ccen.setOpaque(true);
                frm.btnD23Ccen.setBackground(Color.BLACK);
                frm.d11_cen = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Ccen.setIcon(null);
                frm.btnD23Ccen.setOpaque(true);
                frm.btnD23Ccen.setBackground(Color.WHITE);
                frm.btnD23Ccen.setOpaque(true);
                frm.btnD23Ccen.setBackground(Color.BLUE);
                frm.d11_cen = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Ccen.setIcon(null);
                frm.btnD23Ccen.setOpaque(true);
                frm.btnD23Ccen.setBackground(Color.WHITE);
                frm.btnD23Ccen.setOpaque(true);
                frm.btnD23Ccen.setBackground(Color.GRAY);
                frm.d11_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Ccen.setIcon(null);
                frm.btnD23Ccen.setOpaque(true);
                frm.btnD23Ccen.setBackground(Color.WHITE);
                frm.d11_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD23Cder) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Cder.setIcon(null);
                frm.btnD23Cder.setOpaque(true);
                frm.btnD23Cder.setBackground(Color.WHITE);
                frm.btnD23Cder.setOpaque(true);
                frm.btnD23Cder.setBackground(Color.yellow);
                frm.d11_der = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Cder.setIcon(null);
                frm.btnD23Cder.setOpaque(true);
                frm.btnD23Cder.setBackground(Color.WHITE);
                frm.btnD23Cder.setOpaque(true);
                frm.btnD23Cder.setBackground(Color.GREEN);
                frm.d11_der = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Cder.setIcon(null);
                frm.btnD23Cder.setOpaque(true);
                frm.btnD23Cder.setBackground(Color.WHITE);
                frm.btnD23Cder.setOpaque(true);
                frm.btnD23Cder.setBackground(Color.RED);
                frm.d11_der = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Cder.setIcon(null);
                frm.btnD23Cder.setOpaque(true);
                frm.btnD23Cder.setBackground(Color.WHITE);
                frm.btnD23Cder.setOpaque(true);
                frm.btnD23Cder.setBackground(Color.ORANGE);
                frm.d11_der = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Cder.setIcon(null);
                frm.btnD23Cder.setOpaque(true);
                frm.btnD23Cder.setBackground(Color.WHITE);
                frm.btnD23Cder.setOpaque(true);
                frm.btnD23Cder.setBackground(Color.BLACK);
                frm.d11_der = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Cder.setIcon(null);
                frm.btnD23Cder.setOpaque(true);
                frm.btnD23Cder.setBackground(Color.WHITE);
                frm.btnD23Cder.setOpaque(true);
                frm.btnD23Cder.setBackground(Color.BLUE);
                frm.d11_der = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Cder.setIcon(null);
                frm.btnD23Cder.setOpaque(true);
                frm.btnD23Cder.setBackground(Color.WHITE);
                frm.btnD23Cder.setOpaque(true);
                frm.btnD23Cder.setBackground(Color.GRAY);
                frm.d11_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Cder.setIcon(null);
                frm.btnD23Cder.setOpaque(true);
                frm.btnD23Cder.setBackground(Color.WHITE);
                frm.d11_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD23Cinf) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Cinf.setIcon(null);
                frm.btnD23Cinf.setOpaque(true);
                frm.btnD23Cinf.setBackground(Color.WHITE);
                frm.btnD23Cinf.setOpaque(true);
                frm.btnD23Cinf.setBackground(Color.yellow);
                frm.d11_inf = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Cinf.setIcon(null);
                frm.btnD23Cinf.setOpaque(true);
                frm.btnD23Cinf.setBackground(Color.WHITE);
                frm.btnD23Cinf.setOpaque(true);
                frm.btnD23Cinf.setBackground(Color.GREEN);
                frm.d11_inf = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Cinf.setIcon(null);
                frm.btnD23Cinf.setOpaque(true);
                frm.btnD23Cinf.setBackground(Color.WHITE);
                frm.btnD23Cinf.setOpaque(true);
                frm.btnD23Cinf.setBackground(Color.RED);
                frm.d11_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Cinf.setIcon(null);
                frm.btnD23Cinf.setOpaque(true);
                frm.btnD23Cinf.setBackground(Color.WHITE);
                frm.btnD23Cinf.setOpaque(true);
                frm.btnD23Cinf.setBackground(Color.ORANGE);
                frm.d11_inf = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Cinf.setIcon(null);
                frm.btnD23Cinf.setOpaque(true);
                frm.btnD23Cinf.setBackground(Color.WHITE);
                frm.btnD23Cinf.setOpaque(true);
                frm.btnD23Cinf.setBackground(Color.BLACK);
                frm.d11_inf = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Cinf.setIcon(null);
                frm.btnD23Cinf.setOpaque(true);
                frm.btnD23Cinf.setBackground(Color.WHITE);
                frm.btnD23Cinf.setOpaque(true);
                frm.btnD23Cinf.setBackground(Color.BLUE);
                frm.d11_inf = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Cinf.setIcon(null);
                frm.btnD23Cinf.setOpaque(true);
                frm.btnD23Cinf.setBackground(Color.WHITE);
                frm.btnD23Cinf.setOpaque(true);
                frm.btnD23Cinf.setBackground(Color.GRAY);
                frm.d11_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD23Cinf.setIcon(null);
                frm.btnD23Cinf.setOpaque(true);
                frm.btnD23Cinf.setBackground(Color.WHITE);
                frm.d11_inf = "0";

            }
        }

        //**********************************************************************************
        //********************************************** DIENTE 12 **************************
        if (e.getSource() == frm.btnD1Cizq5) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq5.setIcon(null);
                frm.btnD1Cizq5.setOpaque(true);
                frm.btnD1Cizq5.setBackground(Color.WHITE);
                frm.btnD1Cizq5.setOpaque(true);
                frm.btnD1Cizq5.setBackground(Color.yellow);
                frm.d12_izq = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq5.setIcon(null);
                frm.btnD1Cizq5.setOpaque(true);
                frm.btnD1Cizq5.setBackground(Color.WHITE);
                frm.btnD1Cizq5.setOpaque(true);
                frm.btnD1Cizq5.setBackground(Color.GREEN);
                frm.d12_izq = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq5.setIcon(null);
                frm.btnD1Cizq5.setOpaque(true);
                frm.btnD1Cizq5.setBackground(Color.WHITE);
                frm.btnD1Cizq5.setOpaque(true);
                frm.btnD1Cizq5.setBackground(Color.RED);
                frm.d12_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq5.setIcon(null);
                frm.btnD1Cizq5.setOpaque(true);
                frm.btnD1Cizq5.setBackground(Color.WHITE);
                frm.btnD1Cizq5.setOpaque(true);
                frm.btnD1Cizq5.setBackground(Color.ORANGE);
                frm.d12_izq = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq5.setIcon(null);
                frm.btnD1Cizq5.setOpaque(true);
                frm.btnD1Cizq5.setBackground(Color.WHITE);
                frm.btnD1Cizq5.setOpaque(true);
                frm.btnD1Cizq5.setBackground(Color.BLACK);
                frm.d12_izq = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq5.setIcon(null);
                frm.btnD1Cizq5.setOpaque(true);
                frm.btnD1Cizq5.setBackground(Color.WHITE);
                frm.btnD1Cizq5.setOpaque(true);
                frm.btnD1Cizq5.setBackground(Color.BLUE);
                frm.d12_izq = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq5.setIcon(null);
                frm.btnD1Cizq5.setOpaque(true);
                frm.btnD1Cizq5.setBackground(Color.WHITE);
                frm.btnD1Cizq5.setOpaque(true);
                frm.btnD1Cizq5.setBackground(Color.GRAY);
                frm.d12_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq5.setIcon(null);
                frm.btnD1Cizq5.setOpaque(true);
                frm.btnD1Cizq5.setBackground(Color.WHITE);
                frm.d12_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup5) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup5.setIcon(null);
                frm.btnD1Csup5.setOpaque(true);
                frm.btnD1Csup5.setBackground(Color.WHITE);
                frm.btnD1Csup5.setOpaque(true);
                frm.btnD1Csup5.setBackground(Color.yellow);
                frm.d12_sup = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup5.setIcon(null);
                frm.btnD1Csup5.setOpaque(true);
                frm.btnD1Csup5.setBackground(Color.WHITE);
                frm.btnD1Csup5.setOpaque(true);
                frm.btnD1Csup5.setBackground(Color.GREEN);
                frm.d12_sup = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup5.setIcon(null);
                frm.btnD1Csup5.setOpaque(true);
                frm.btnD1Csup5.setBackground(Color.WHITE);
                frm.btnD1Csup5.setOpaque(true);
                frm.btnD1Csup5.setBackground(Color.RED);
                frm.d12_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup5.setIcon(null);
                frm.btnD1Csup5.setOpaque(true);
                frm.btnD1Csup5.setBackground(Color.WHITE);
                frm.btnD1Csup5.setOpaque(true);
                frm.btnD1Csup5.setBackground(Color.ORANGE);
                frm.d12_sup = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup5.setIcon(null);
                frm.btnD1Csup5.setOpaque(true);
                frm.btnD1Csup5.setBackground(Color.WHITE);
                frm.btnD1Csup5.setOpaque(true);
                frm.btnD1Csup5.setBackground(Color.BLACK);
                frm.d12_sup = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup5.setIcon(null);
                frm.btnD1Csup5.setOpaque(true);
                frm.btnD1Csup5.setBackground(Color.WHITE);
                frm.btnD1Csup5.setOpaque(true);
                frm.btnD1Csup5.setBackground(Color.BLUE);
                frm.d12_sup = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup5.setIcon(null);
                frm.btnD1Csup5.setOpaque(true);
                frm.btnD1Csup5.setBackground(Color.WHITE);
                frm.btnD1Csup5.setOpaque(true);
                frm.btnD1Csup5.setBackground(Color.GRAY);
                frm.d12_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup5.setIcon(null);
                frm.btnD1Csup5.setOpaque(true);
                frm.btnD1Csup5.setBackground(Color.WHITE);
                frm.d12_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen5) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen5.setIcon(null);
                frm.btnD1Ccen5.setOpaque(true);
                frm.btnD1Ccen5.setBackground(Color.WHITE);
                frm.btnD1Ccen5.setOpaque(true);
                frm.btnD1Ccen5.setBackground(Color.yellow);
                frm.d12_cen = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen5.setIcon(null);
                frm.btnD1Ccen5.setOpaque(true);
                frm.btnD1Ccen5.setBackground(Color.WHITE);
                frm.btnD1Ccen5.setOpaque(true);
                frm.btnD1Ccen5.setBackground(Color.GREEN);
                frm.d12_cen = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen5.setIcon(null);
                frm.btnD1Ccen5.setOpaque(true);
                frm.btnD1Ccen5.setBackground(Color.WHITE);
                frm.btnD1Ccen5.setOpaque(true);
                frm.btnD1Ccen5.setBackground(Color.RED);
                frm.d12_cen = "3";

            }

            if (frm.opXroja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen5.setIcon(null);
                frm.btnD1Ccen5.setOpaque(true);
                frm.btnD1Ccen5.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen5.getWidth(), frm.btnD1Ccen5.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD1Ccen5.setIcon(icono);

                frm.btnD1Cizq5.setIcon(null);
                frm.btnD1Cizq5.setOpaque(true);
                frm.btnD1Cizq5.setBackground(Color.WHITE);
                frm.btnD1Csup5.setIcon(null);
                frm.btnD1Csup5.setOpaque(true);
                frm.btnD1Csup5.setBackground(Color.WHITE);
                frm.btnD1Cder5.setIcon(null);
                frm.btnD1Cder5.setOpaque(true);
                frm.btnD1Cder5.setBackground(Color.WHITE);
                frm.btnD1Cinf5.setIcon(null);
                frm.btnD1Cinf5.setOpaque(true);
                frm.btnD1Cinf5.setBackground(Color.WHITE);

                frm.d12_cen = "4";
                frm.d12_izq = "0";
                frm.d12_sup = "0";
                frm.d12_der = "0";
                frm.d12_inf = "0";
            }

            if (frm.opXazul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen5.setIcon(null);
                frm.btnD1Ccen5.setOpaque(true);
                frm.btnD1Ccen5.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen5.getWidth(), frm.btnD1Ccen5.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD1Ccen5.setIcon(icono);

                frm.btnD1Cizq5.setIcon(null);
                frm.btnD1Cizq5.setOpaque(true);
                frm.btnD1Cizq5.setBackground(Color.WHITE);
                frm.btnD1Csup5.setIcon(null);
                frm.btnD1Csup5.setOpaque(true);
                frm.btnD1Csup5.setBackground(Color.WHITE);
                frm.btnD1Cder5.setIcon(null);
                frm.btnD1Cder5.setOpaque(true);
                frm.btnD1Cder5.setBackground(Color.WHITE);
                frm.btnD1Cinf5.setIcon(null);
                frm.btnD1Cinf5.setOpaque(true);
                frm.btnD1Cinf5.setBackground(Color.WHITE);

                frm.d12_cen = "5";
                frm.d12_izq = "0";
                frm.d12_sup = "0";
                frm.d12_der = "0";
                frm.d12_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen5.setIcon(null);
                frm.btnD1Ccen5.setOpaque(true);
                frm.btnD1Ccen5.setBackground(Color.WHITE);
                frm.btnD1Ccen5.setOpaque(true);
                frm.btnD1Ccen5.setBackground(Color.ORANGE);
                frm.d12_cen = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen5.setIcon(null);
                frm.btnD1Ccen5.setOpaque(true);
                frm.btnD1Ccen5.setBackground(Color.WHITE);
                frm.btnD1Ccen5.setOpaque(true);
                frm.btnD1Ccen5.setBackground(Color.BLACK);
                frm.d12_cen = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen5.setIcon(null);
                frm.btnD1Ccen5.setOpaque(true);
                frm.btnD1Ccen5.setBackground(Color.WHITE);
                frm.btnD1Ccen5.setOpaque(true);
                frm.btnD1Ccen5.setBackground(Color.BLUE);
                frm.d12_cen = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen5.setIcon(null);
                frm.btnD1Ccen5.setOpaque(true);
                frm.btnD1Ccen5.setBackground(Color.WHITE);
                frm.btnD1Ccen5.setOpaque(true);
                frm.btnD1Ccen5.setBackground(Color.GRAY);
                frm.d12_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen5.setIcon(null);
                frm.btnD1Ccen5.setOpaque(true);
                frm.btnD1Ccen5.setBackground(Color.WHITE);
                frm.d12_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder5) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder5.setIcon(null);
                frm.btnD1Cder5.setOpaque(true);
                frm.btnD1Cder5.setBackground(Color.WHITE);
                frm.btnD1Cder5.setOpaque(true);
                frm.btnD1Cder5.setBackground(Color.yellow);
                frm.d12_der = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder5.setIcon(null);
                frm.btnD1Cder5.setOpaque(true);
                frm.btnD1Cder5.setBackground(Color.WHITE);
                frm.btnD1Cder5.setOpaque(true);
                frm.btnD1Cder5.setBackground(Color.GREEN);
                frm.d12_der = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder5.setIcon(null);
                frm.btnD1Cder5.setOpaque(true);
                frm.btnD1Cder5.setBackground(Color.WHITE);
                frm.btnD1Cder5.setOpaque(true);
                frm.btnD1Cder5.setBackground(Color.RED);
                frm.d12_der = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder5.setIcon(null);
                frm.btnD1Cder5.setOpaque(true);
                frm.btnD1Cder5.setBackground(Color.WHITE);
                frm.btnD1Cder5.setOpaque(true);
                frm.btnD1Cder5.setBackground(Color.ORANGE);
                frm.d12_der = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder5.setIcon(null);
                frm.btnD1Cder5.setOpaque(true);
                frm.btnD1Cder5.setBackground(Color.WHITE);
                frm.btnD1Cder5.setOpaque(true);
                frm.btnD1Cder5.setBackground(Color.BLACK);
                frm.d12_der = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder5.setIcon(null);
                frm.btnD1Cder5.setOpaque(true);
                frm.btnD1Cder5.setBackground(Color.WHITE);
                frm.btnD1Cder5.setOpaque(true);
                frm.btnD1Cder5.setBackground(Color.BLUE);
                frm.d12_der = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder5.setIcon(null);
                frm.btnD1Cder5.setOpaque(true);
                frm.btnD1Cder5.setBackground(Color.WHITE);
                frm.btnD1Cder5.setOpaque(true);
                frm.btnD1Cder5.setBackground(Color.GRAY);
                frm.d12_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder5.setIcon(null);
                frm.btnD1Cder5.setOpaque(true);
                frm.btnD1Cder5.setBackground(Color.WHITE);
                frm.d12_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf5) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf5.setIcon(null);
                frm.btnD1Cinf5.setOpaque(true);
                frm.btnD1Cinf5.setBackground(Color.WHITE);
                frm.btnD1Cinf5.setOpaque(true);
                frm.btnD1Cinf5.setBackground(Color.yellow);
                frm.d12_inf = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf5.setIcon(null);
                frm.btnD1Cinf5.setOpaque(true);
                frm.btnD1Cinf5.setBackground(Color.WHITE);
                frm.btnD1Cinf5.setOpaque(true);
                frm.btnD1Cinf5.setBackground(Color.GREEN);
                frm.d12_inf = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf5.setIcon(null);
                frm.btnD1Cinf5.setOpaque(true);
                frm.btnD1Cinf5.setBackground(Color.WHITE);
                frm.btnD1Cinf5.setOpaque(true);
                frm.btnD1Cinf5.setBackground(Color.RED);
                frm.d12_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf5.setIcon(null);
                frm.btnD1Cinf5.setOpaque(true);
                frm.btnD1Cinf5.setBackground(Color.WHITE);
                frm.btnD1Cinf5.setOpaque(true);
                frm.btnD1Cinf5.setBackground(Color.ORANGE);
                frm.d12_inf = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf5.setIcon(null);
                frm.btnD1Cinf5.setOpaque(true);
                frm.btnD1Cinf5.setBackground(Color.WHITE);
                frm.btnD1Cinf5.setOpaque(true);
                frm.btnD1Cinf5.setBackground(Color.BLACK);
                frm.d12_inf = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf5.setIcon(null);
                frm.btnD1Cinf5.setOpaque(true);
                frm.btnD1Cinf5.setBackground(Color.WHITE);
                frm.btnD1Cinf5.setOpaque(true);
                frm.btnD1Cinf5.setBackground(Color.BLUE);
                frm.d12_inf = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf5.setIcon(null);
                frm.btnD1Cinf5.setOpaque(true);
                frm.btnD1Cinf5.setBackground(Color.WHITE);
                frm.btnD1Cinf5.setOpaque(true);
                frm.btnD1Cinf5.setBackground(Color.GRAY);
                frm.d12_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf5.setIcon(null);
                frm.btnD1Cinf5.setOpaque(true);
                frm.btnD1Cinf5.setBackground(Color.WHITE);
                frm.d12_inf = "0";

            }
        }

        //***********************************************************************************
        //**********************************DIENTE 13 ***************************************
        if (e.getSource() == frm.btnD1Cizq4) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq4.setIcon(null);
                frm.btnD1Cizq4.setOpaque(true);
                frm.btnD1Cizq4.setBackground(Color.WHITE);
                frm.btnD1Cizq4.setOpaque(true);
                frm.btnD1Cizq4.setBackground(Color.yellow);
                frm.d13_izq = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq4.setIcon(null);
                frm.btnD1Cizq4.setOpaque(true);
                frm.btnD1Cizq4.setBackground(Color.WHITE);
                frm.btnD1Cizq4.setOpaque(true);
                frm.btnD1Cizq4.setBackground(Color.GREEN);
                frm.d13_izq = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq4.setIcon(null);
                frm.btnD1Cizq4.setOpaque(true);
                frm.btnD1Cizq4.setBackground(Color.WHITE);
                frm.btnD1Cizq4.setOpaque(true);
                frm.btnD1Cizq4.setBackground(Color.RED);
                frm.d13_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq4.setIcon(null);
                frm.btnD1Cizq4.setOpaque(true);
                frm.btnD1Cizq4.setBackground(Color.WHITE);
                frm.btnD1Cizq4.setOpaque(true);
                frm.btnD1Cizq4.setBackground(Color.ORANGE);
                frm.d13_izq = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq4.setIcon(null);
                frm.btnD1Cizq4.setOpaque(true);
                frm.btnD1Cizq4.setBackground(Color.WHITE);
                frm.btnD1Cizq4.setOpaque(true);
                frm.btnD1Cizq4.setBackground(Color.BLACK);
                frm.d13_izq = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq4.setIcon(null);
                frm.btnD1Cizq4.setOpaque(true);
                frm.btnD1Cizq4.setBackground(Color.WHITE);
                frm.btnD1Cizq4.setOpaque(true);
                frm.btnD1Cizq4.setBackground(Color.BLUE);
                frm.d13_izq = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq4.setIcon(null);
                frm.btnD1Cizq4.setOpaque(true);
                frm.btnD1Cizq4.setBackground(Color.WHITE);
                frm.btnD1Cizq4.setOpaque(true);
                frm.btnD1Cizq4.setBackground(Color.GRAY);
                frm.d13_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq4.setIcon(null);
                frm.btnD1Cizq4.setOpaque(true);
                frm.btnD1Cizq4.setBackground(Color.WHITE);
                frm.d13_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup4) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup4.setIcon(null);
                frm.btnD1Csup4.setOpaque(true);
                frm.btnD1Csup4.setBackground(Color.WHITE);
                frm.btnD1Csup4.setOpaque(true);
                frm.btnD1Csup4.setBackground(Color.yellow);
                frm.d13_sup = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup4.setIcon(null);
                frm.btnD1Csup4.setOpaque(true);
                frm.btnD1Csup4.setBackground(Color.WHITE);
                frm.btnD1Csup4.setOpaque(true);
                frm.btnD1Csup4.setBackground(Color.GREEN);
                frm.d13_sup = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup4.setIcon(null);
                frm.btnD1Csup4.setOpaque(true);
                frm.btnD1Csup4.setBackground(Color.WHITE);
                frm.btnD1Csup4.setOpaque(true);
                frm.btnD1Csup4.setBackground(Color.RED);
                frm.d13_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup4.setIcon(null);
                frm.btnD1Csup4.setOpaque(true);
                frm.btnD1Csup4.setBackground(Color.WHITE);
                frm.btnD1Csup4.setOpaque(true);
                frm.btnD1Csup4.setBackground(Color.ORANGE);
                frm.d13_sup = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup4.setIcon(null);
                frm.btnD1Csup4.setOpaque(true);
                frm.btnD1Csup4.setBackground(Color.WHITE);
                frm.btnD1Csup4.setOpaque(true);
                frm.btnD1Csup4.setBackground(Color.BLACK);
                frm.d13_sup = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup4.setIcon(null);
                frm.btnD1Csup4.setOpaque(true);
                frm.btnD1Csup4.setBackground(Color.WHITE);
                frm.btnD1Csup4.setOpaque(true);
                frm.btnD1Csup4.setBackground(Color.BLUE);
                frm.d13_sup = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup4.setIcon(null);
                frm.btnD1Csup4.setOpaque(true);
                frm.btnD1Csup4.setBackground(Color.WHITE);
                frm.btnD1Csup4.setOpaque(true);
                frm.btnD1Csup4.setBackground(Color.GRAY);
                frm.d13_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup4.setIcon(null);
                frm.btnD1Csup4.setOpaque(true);
                frm.btnD1Csup4.setBackground(Color.WHITE);
                frm.d13_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen4) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen4.setIcon(null);
                frm.btnD1Ccen4.setOpaque(true);
                frm.btnD1Ccen4.setBackground(Color.WHITE);
                frm.btnD1Ccen4.setOpaque(true);
                frm.btnD1Ccen4.setBackground(Color.yellow);
                frm.d13_cen = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen4.setIcon(null);
                frm.btnD1Ccen4.setOpaque(true);
                frm.btnD1Ccen4.setBackground(Color.WHITE);
                frm.btnD1Ccen4.setOpaque(true);
                frm.btnD1Ccen4.setBackground(Color.GREEN);
                frm.d13_cen = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen4.setIcon(null);
                frm.btnD1Ccen4.setOpaque(true);
                frm.btnD1Ccen4.setBackground(Color.WHITE);
                frm.btnD1Ccen4.setOpaque(true);
                frm.btnD1Ccen4.setBackground(Color.RED);
                frm.d13_cen = "3";

            }

            if (frm.opXroja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen4.setIcon(null);
                frm.btnD1Ccen4.setOpaque(true);
                frm.btnD1Ccen4.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen4.getWidth(), frm.btnD1Ccen4.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD1Ccen4.setIcon(icono);

                frm.btnD1Cizq4.setIcon(null);
                frm.btnD1Cizq4.setOpaque(true);
                frm.btnD1Cizq4.setBackground(Color.WHITE);
                frm.btnD1Csup4.setIcon(null);
                frm.btnD1Csup4.setOpaque(true);
                frm.btnD1Csup4.setBackground(Color.WHITE);
                frm.btnD1Cder4.setIcon(null);
                frm.btnD1Cder4.setOpaque(true);
                frm.btnD1Cder4.setBackground(Color.WHITE);
                frm.btnD1Cinf4.setIcon(null);
                frm.btnD1Cinf4.setOpaque(true);
                frm.btnD1Cinf4.setBackground(Color.WHITE);

                frm.d13_cen = "4";
                frm.d13_izq = "0";
                frm.d13_sup = "0";
                frm.d13_der = "0";
                frm.d13_inf = "0";
            }

            if (frm.opXazul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen4.setIcon(null);
                frm.btnD1Ccen4.setOpaque(true);
                frm.btnD1Ccen4.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen4.getWidth(), frm.btnD1Ccen4.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD1Ccen4.setIcon(icono);

                frm.btnD1Cizq4.setIcon(null);
                frm.btnD1Cizq4.setOpaque(true);
                frm.btnD1Cizq4.setBackground(Color.WHITE);
                frm.btnD1Csup4.setIcon(null);
                frm.btnD1Csup4.setOpaque(true);
                frm.btnD1Csup4.setBackground(Color.WHITE);
                frm.btnD1Cder4.setIcon(null);
                frm.btnD1Cder4.setOpaque(true);
                frm.btnD1Cder4.setBackground(Color.WHITE);
                frm.btnD1Cinf4.setIcon(null);
                frm.btnD1Cinf4.setOpaque(true);
                frm.btnD1Cinf4.setBackground(Color.WHITE);

                frm.d13_cen = "5";
                frm.d13_izq = "0";
                frm.d13_sup = "0";
                frm.d13_der = "0";
                frm.d13_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen4.setIcon(null);
                frm.btnD1Ccen4.setOpaque(true);
                frm.btnD1Ccen4.setBackground(Color.WHITE);
                frm.btnD1Ccen4.setOpaque(true);
                frm.btnD1Ccen4.setBackground(Color.ORANGE);
                frm.d13_cen = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen4.setIcon(null);
                frm.btnD1Ccen4.setOpaque(true);
                frm.btnD1Ccen4.setBackground(Color.WHITE);
                frm.btnD1Ccen4.setOpaque(true);
                frm.btnD1Ccen4.setBackground(Color.BLACK);
                frm.d13_cen = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen4.setIcon(null);
                frm.btnD1Ccen4.setOpaque(true);
                frm.btnD1Ccen4.setBackground(Color.WHITE);
                frm.btnD1Ccen4.setOpaque(true);
                frm.btnD1Ccen4.setBackground(Color.BLUE);
                frm.d13_cen = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen4.setIcon(null);
                frm.btnD1Ccen4.setOpaque(true);
                frm.btnD1Ccen4.setBackground(Color.WHITE);
                frm.btnD1Ccen4.setOpaque(true);
                frm.btnD1Ccen4.setBackground(Color.GRAY);
                frm.d13_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen4.setIcon(null);
                frm.btnD1Ccen4.setOpaque(true);
                frm.btnD1Ccen4.setBackground(Color.WHITE);
                frm.d13_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder4) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder4.setIcon(null);
                frm.btnD1Cder4.setOpaque(true);
                frm.btnD1Cder4.setBackground(Color.WHITE);
                frm.btnD1Cder4.setOpaque(true);
                frm.btnD1Cder4.setBackground(Color.yellow);
                frm.d13_der = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder4.setIcon(null);
                frm.btnD1Cder4.setOpaque(true);
                frm.btnD1Cder4.setBackground(Color.WHITE);
                frm.btnD1Cder4.setOpaque(true);
                frm.btnD1Cder4.setBackground(Color.GREEN);
                frm.d13_der = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder4.setIcon(null);
                frm.btnD1Cder4.setOpaque(true);
                frm.btnD1Cder4.setBackground(Color.WHITE);
                frm.btnD1Cder4.setOpaque(true);
                frm.btnD1Cder4.setBackground(Color.RED);
                frm.d13_der = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder4.setIcon(null);
                frm.btnD1Cder4.setOpaque(true);
                frm.btnD1Cder4.setBackground(Color.WHITE);
                frm.btnD1Cder4.setOpaque(true);
                frm.btnD1Cder4.setBackground(Color.ORANGE);
                frm.d13_der = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder4.setIcon(null);
                frm.btnD1Cder4.setOpaque(true);
                frm.btnD1Cder4.setBackground(Color.WHITE);
                frm.btnD1Cder4.setOpaque(true);
                frm.btnD1Cder4.setBackground(Color.BLACK);
                frm.d13_der = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder4.setIcon(null);
                frm.btnD1Cder4.setOpaque(true);
                frm.btnD1Cder4.setBackground(Color.WHITE);
                frm.btnD1Cder4.setOpaque(true);
                frm.btnD1Cder4.setBackground(Color.BLUE);
                frm.d13_der = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder4.setIcon(null);
                frm.btnD1Cder4.setOpaque(true);
                frm.btnD1Cder4.setBackground(Color.WHITE);
                frm.btnD1Cder4.setOpaque(true);
                frm.btnD1Cder4.setBackground(Color.GRAY);
                frm.d13_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder4.setIcon(null);
                frm.btnD1Cder4.setOpaque(true);
                frm.btnD1Cder4.setBackground(Color.WHITE);
                frm.d13_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf4) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf4.setIcon(null);
                frm.btnD1Cinf4.setOpaque(true);
                frm.btnD1Cinf4.setBackground(Color.WHITE);
                frm.btnD1Cinf4.setOpaque(true);
                frm.btnD1Cinf4.setBackground(Color.yellow);
                frm.d13_inf = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf4.setIcon(null);
                frm.btnD1Cinf4.setOpaque(true);
                frm.btnD1Cinf4.setBackground(Color.WHITE);
                frm.btnD1Cinf4.setOpaque(true);
                frm.btnD1Cinf4.setBackground(Color.GREEN);
                frm.d13_inf = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf4.setIcon(null);
                frm.btnD1Cinf4.setOpaque(true);
                frm.btnD1Cinf4.setBackground(Color.WHITE);
                frm.btnD1Cinf4.setOpaque(true);
                frm.btnD1Cinf4.setBackground(Color.RED);
                frm.d13_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf4.setIcon(null);
                frm.btnD1Cinf4.setOpaque(true);
                frm.btnD1Cinf4.setBackground(Color.WHITE);
                frm.btnD1Cinf4.setOpaque(true);
                frm.btnD1Cinf4.setBackground(Color.ORANGE);
                frm.d13_inf = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf4.setIcon(null);
                frm.btnD1Cinf4.setOpaque(true);
                frm.btnD1Cinf4.setBackground(Color.WHITE);
                frm.btnD1Cinf4.setOpaque(true);
                frm.btnD1Cinf4.setBackground(Color.BLACK);
                frm.d13_inf = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf4.setIcon(null);
                frm.btnD1Cinf4.setOpaque(true);
                frm.btnD1Cinf4.setBackground(Color.WHITE);
                frm.btnD1Cinf4.setOpaque(true);
                frm.btnD1Cinf4.setBackground(Color.BLUE);
                frm.d13_inf = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf4.setIcon(null);
                frm.btnD1Cinf4.setOpaque(true);
                frm.btnD1Cinf4.setBackground(Color.WHITE);
                frm.btnD1Cinf4.setOpaque(true);
                frm.btnD1Cinf4.setBackground(Color.GRAY);
                frm.d13_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf4.setIcon(null);
                frm.btnD1Cinf4.setOpaque(true);
                frm.btnD1Cinf4.setBackground(Color.WHITE);
                frm.d13_inf = "0";

            }
            System.out.println(frm.d13_inf);
        }
        //***********************************************************************************

        //**********************************DIENTE 14 ***************************************
        if (e.getSource() == frm.btnD1Cizq3) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq3.setIcon(null);
                frm.btnD1Cizq3.setOpaque(true);
                frm.btnD1Cizq3.setBackground(Color.WHITE);
                frm.btnD1Cizq3.setOpaque(true);
                frm.btnD1Cizq3.setBackground(Color.yellow);
                frm.d14_izq = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq3.setIcon(null);
                frm.btnD1Cizq3.setOpaque(true);
                frm.btnD1Cizq3.setBackground(Color.WHITE);
                frm.btnD1Cizq3.setOpaque(true);
                frm.btnD1Cizq3.setBackground(Color.GREEN);
                frm.d14_izq = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq3.setIcon(null);
                frm.btnD1Cizq3.setOpaque(true);
                frm.btnD1Cizq3.setBackground(Color.WHITE);
                frm.btnD1Cizq3.setOpaque(true);
                frm.btnD1Cizq3.setBackground(Color.RED);
                frm.d14_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq3.setIcon(null);
                frm.btnD1Cizq3.setOpaque(true);
                frm.btnD1Cizq3.setBackground(Color.WHITE);
                frm.btnD1Cizq3.setOpaque(true);
                frm.btnD1Cizq3.setBackground(Color.ORANGE);
                frm.d14_izq = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq3.setIcon(null);
                frm.btnD1Cizq3.setOpaque(true);
                frm.btnD1Cizq3.setBackground(Color.WHITE);
                frm.btnD1Cizq3.setOpaque(true);
                frm.btnD1Cizq3.setBackground(Color.BLACK);
                frm.d14_izq = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq3.setIcon(null);
                frm.btnD1Cizq3.setOpaque(true);
                frm.btnD1Cizq3.setBackground(Color.WHITE);
                frm.btnD1Cizq3.setOpaque(true);
                frm.btnD1Cizq3.setBackground(Color.BLUE);
                frm.d14_izq = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq3.setIcon(null);
                frm.btnD1Cizq3.setOpaque(true);
                frm.btnD1Cizq3.setBackground(Color.WHITE);
                frm.btnD1Cizq3.setOpaque(true);
                frm.btnD1Cizq3.setBackground(Color.GRAY);
                frm.d14_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq3.setIcon(null);
                frm.btnD1Cizq3.setOpaque(true);
                frm.btnD1Cizq3.setBackground(Color.WHITE);
                frm.d14_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup3) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup3.setIcon(null);
                frm.btnD1Csup3.setOpaque(true);
                frm.btnD1Csup3.setBackground(Color.WHITE);
                frm.btnD1Csup3.setOpaque(true);
                frm.btnD1Csup3.setBackground(Color.yellow);
                frm.d14_sup = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup3.setIcon(null);
                frm.btnD1Csup3.setOpaque(true);
                frm.btnD1Csup3.setBackground(Color.WHITE);
                frm.btnD1Csup3.setOpaque(true);
                frm.btnD1Csup3.setBackground(Color.GREEN);
                frm.d14_sup = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup3.setIcon(null);
                frm.btnD1Csup3.setOpaque(true);
                frm.btnD1Csup3.setBackground(Color.WHITE);
                frm.btnD1Csup3.setOpaque(true);
                frm.btnD1Csup3.setBackground(Color.RED);
                frm.d14_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup3.setIcon(null);
                frm.btnD1Csup3.setOpaque(true);
                frm.btnD1Csup3.setBackground(Color.WHITE);
                frm.btnD1Csup3.setOpaque(true);
                frm.btnD1Csup3.setBackground(Color.ORANGE);
                frm.d14_sup = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup3.setIcon(null);
                frm.btnD1Csup3.setOpaque(true);
                frm.btnD1Csup3.setBackground(Color.WHITE);
                frm.btnD1Csup3.setOpaque(true);
                frm.btnD1Csup3.setBackground(Color.BLACK);
                frm.d14_sup = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup3.setIcon(null);
                frm.btnD1Csup3.setOpaque(true);
                frm.btnD1Csup3.setBackground(Color.WHITE);
                frm.btnD1Csup3.setOpaque(true);
                frm.btnD1Csup3.setBackground(Color.BLUE);
                frm.d14_sup = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup3.setIcon(null);
                frm.btnD1Csup3.setOpaque(true);
                frm.btnD1Csup3.setBackground(Color.WHITE);
                frm.btnD1Csup3.setOpaque(true);
                frm.btnD1Csup3.setBackground(Color.GRAY);
                frm.d14_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup3.setIcon(null);
                frm.btnD1Csup3.setOpaque(true);
                frm.btnD1Csup3.setBackground(Color.WHITE);
                frm.d14_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen3) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen3.setIcon(null);
                frm.btnD1Ccen3.setOpaque(true);
                frm.btnD1Ccen3.setBackground(Color.WHITE);
                frm.btnD1Ccen3.setOpaque(true);
                frm.btnD1Ccen3.setBackground(Color.yellow);
                frm.d14_cen = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen3.setIcon(null);
                frm.btnD1Ccen3.setOpaque(true);
                frm.btnD1Ccen3.setBackground(Color.WHITE);
                frm.btnD1Ccen3.setOpaque(true);
                frm.btnD1Ccen3.setBackground(Color.GREEN);
                frm.d14_cen = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen3.setIcon(null);
                frm.btnD1Ccen3.setOpaque(true);
                frm.btnD1Ccen3.setBackground(Color.WHITE);
                frm.btnD1Ccen3.setOpaque(true);
                frm.btnD1Ccen3.setBackground(Color.RED);
                frm.d14_cen = "3";

            }

            if (frm.opXroja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen3.setIcon(null);
                frm.btnD1Ccen3.setOpaque(true);
                frm.btnD1Ccen3.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen3.getWidth(), frm.btnD1Ccen3.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD1Ccen3.setIcon(icono);

                frm.btnD1Cizq3.setIcon(null);
                frm.btnD1Cizq3.setOpaque(true);
                frm.btnD1Cizq3.setBackground(Color.WHITE);
                frm.btnD1Csup3.setIcon(null);
                frm.btnD1Csup3.setOpaque(true);
                frm.btnD1Csup3.setBackground(Color.WHITE);
                frm.btnD1Cder3.setIcon(null);
                frm.btnD1Cder3.setOpaque(true);
                frm.btnD1Cder3.setBackground(Color.WHITE);
                frm.btnD1Cinf3.setIcon(null);
                frm.btnD1Cinf3.setOpaque(true);
                frm.btnD1Cinf3.setBackground(Color.WHITE);

                frm.d14_cen = "4";
                frm.d14_izq = "0";
                frm.d14_sup = "0";
                frm.d14_der = "0";
                frm.d14_inf = "0";
            }

            if (frm.opXazul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen3.setIcon(null);
                frm.btnD1Ccen3.setOpaque(true);
                frm.btnD1Ccen3.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen3.getWidth(), frm.btnD1Ccen3.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD1Ccen3.setIcon(icono);

                frm.btnD1Cizq3.setIcon(null);
                frm.btnD1Cizq3.setOpaque(true);
                frm.btnD1Cizq3.setBackground(Color.WHITE);
                frm.btnD1Csup3.setIcon(null);
                frm.btnD1Csup3.setOpaque(true);
                frm.btnD1Csup3.setBackground(Color.WHITE);
                frm.btnD1Cder3.setIcon(null);
                frm.btnD1Cder3.setOpaque(true);
                frm.btnD1Cder3.setBackground(Color.WHITE);
                frm.btnD1Cinf3.setIcon(null);
                frm.btnD1Cinf3.setOpaque(true);
                frm.btnD1Cinf3.setBackground(Color.WHITE);

                frm.d14_cen = "5";
                frm.d14_izq = "0";
                frm.d14_sup = "0";
                frm.d14_der = "0";
                frm.d14_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen3.setIcon(null);
                frm.btnD1Ccen3.setOpaque(true);
                frm.btnD1Ccen3.setBackground(Color.WHITE);
                frm.btnD1Ccen3.setOpaque(true);
                frm.btnD1Ccen3.setBackground(Color.ORANGE);
                frm.d14_cen = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen3.setIcon(null);
                frm.btnD1Ccen3.setOpaque(true);
                frm.btnD1Ccen3.setBackground(Color.WHITE);
                frm.btnD1Ccen3.setOpaque(true);
                frm.btnD1Ccen3.setBackground(Color.BLACK);
                frm.d14_cen = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen3.setIcon(null);
                frm.btnD1Ccen3.setOpaque(true);
                frm.btnD1Ccen3.setBackground(Color.WHITE);
                frm.btnD1Ccen3.setOpaque(true);
                frm.btnD1Ccen3.setBackground(Color.BLUE);
                frm.d14_cen = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen3.setIcon(null);
                frm.btnD1Ccen3.setOpaque(true);
                frm.btnD1Ccen3.setBackground(Color.WHITE);
                frm.btnD1Ccen3.setOpaque(true);
                frm.btnD1Ccen3.setBackground(Color.GRAY);
                frm.d14_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen3.setIcon(null);
                frm.btnD1Ccen3.setOpaque(true);
                frm.btnD1Ccen3.setBackground(Color.WHITE);
                frm.d14_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder3) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder3.setIcon(null);
                frm.btnD1Cder3.setOpaque(true);
                frm.btnD1Cder3.setBackground(Color.WHITE);
                frm.btnD1Cder3.setOpaque(true);
                frm.btnD1Cder3.setBackground(Color.yellow);
                frm.d14_der = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder3.setIcon(null);
                frm.btnD1Cder3.setOpaque(true);
                frm.btnD1Cder3.setBackground(Color.WHITE);
                frm.btnD1Cder3.setOpaque(true);
                frm.btnD1Cder3.setBackground(Color.GREEN);
                frm.d14_der = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder3.setIcon(null);
                frm.btnD1Cder3.setOpaque(true);
                frm.btnD1Cder3.setBackground(Color.WHITE);
                frm.btnD1Cder3.setOpaque(true);
                frm.btnD1Cder3.setBackground(Color.RED);
                frm.d14_der = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder3.setIcon(null);
                frm.btnD1Cder3.setOpaque(true);
                frm.btnD1Cder3.setBackground(Color.WHITE);
                frm.btnD1Cder3.setOpaque(true);
                frm.btnD1Cder3.setBackground(Color.ORANGE);
                frm.d14_der = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder3.setIcon(null);
                frm.btnD1Cder3.setOpaque(true);
                frm.btnD1Cder3.setBackground(Color.WHITE);
                frm.btnD1Cder3.setOpaque(true);
                frm.btnD1Cder3.setBackground(Color.BLACK);
                frm.d14_der = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder3.setIcon(null);
                frm.btnD1Cder3.setOpaque(true);
                frm.btnD1Cder3.setBackground(Color.WHITE);
                frm.btnD1Cder3.setOpaque(true);
                frm.btnD1Cder3.setBackground(Color.BLUE);
                frm.d14_der = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder3.setIcon(null);
                frm.btnD1Cder3.setOpaque(true);
                frm.btnD1Cder3.setBackground(Color.WHITE);
                frm.btnD1Cder3.setOpaque(true);
                frm.btnD1Cder3.setBackground(Color.GRAY);
                frm.d14_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder3.setIcon(null);
                frm.btnD1Cder3.setOpaque(true);
                frm.btnD1Cder3.setBackground(Color.WHITE);
                frm.d14_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf3) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf3.setIcon(null);
                frm.btnD1Cinf3.setOpaque(true);
                frm.btnD1Cinf3.setBackground(Color.WHITE);
                frm.btnD1Cinf3.setOpaque(true);
                frm.btnD1Cinf3.setBackground(Color.yellow);
                frm.d14_inf = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf3.setIcon(null);
                frm.btnD1Cinf3.setOpaque(true);
                frm.btnD1Cinf3.setBackground(Color.WHITE);
                frm.btnD1Cinf3.setOpaque(true);
                frm.btnD1Cinf3.setBackground(Color.GREEN);
                frm.d14_inf = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf3.setIcon(null);
                frm.btnD1Cinf3.setOpaque(true);
                frm.btnD1Cinf3.setBackground(Color.WHITE);
                frm.btnD1Cinf3.setOpaque(true);
                frm.btnD1Cinf3.setBackground(Color.RED);
                frm.d14_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf3.setIcon(null);
                frm.btnD1Cinf3.setOpaque(true);
                frm.btnD1Cinf3.setBackground(Color.WHITE);
                frm.btnD1Cinf3.setOpaque(true);
                frm.btnD1Cinf3.setBackground(Color.ORANGE);
                frm.d14_inf = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf3.setIcon(null);
                frm.btnD1Cinf3.setOpaque(true);
                frm.btnD1Cinf3.setBackground(Color.WHITE);
                frm.btnD1Cinf3.setOpaque(true);
                frm.btnD1Cinf3.setBackground(Color.BLACK);
                frm.d14_inf = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf3.setIcon(null);
                frm.btnD1Cinf3.setOpaque(true);
                frm.btnD1Cinf3.setBackground(Color.WHITE);
                frm.btnD1Cinf3.setOpaque(true);
                frm.btnD1Cinf3.setBackground(Color.BLUE);
                frm.d14_inf = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf3.setIcon(null);
                frm.btnD1Cinf3.setOpaque(true);
                frm.btnD1Cinf3.setBackground(Color.WHITE);
                frm.btnD1Cinf3.setOpaque(true);
                frm.btnD1Cinf3.setBackground(Color.GRAY);
                frm.d14_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf3.setIcon(null);
                frm.btnD1Cinf3.setOpaque(true);
                frm.btnD1Cinf3.setBackground(Color.WHITE);
                frm.d14_inf = "0";

            }
            System.out.println(frm.d13_inf);
        }
        //***********************************************************************************
        
        //**********************************DIENTE 15 ***************************************
        if (e.getSource() == frm.btnD1Cizq9) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq9.setIcon(null);
                frm.btnD1Cizq9.setOpaque(true);
                frm.btnD1Cizq9.setBackground(Color.WHITE);
                frm.btnD1Cizq9.setOpaque(true);
                frm.btnD1Cizq9.setBackground(Color.yellow);
                frm.d15_izq = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq9.setIcon(null);
                frm.btnD1Cizq9.setOpaque(true);
                frm.btnD1Cizq9.setBackground(Color.WHITE);
                frm.btnD1Cizq9.setOpaque(true);
                frm.btnD1Cizq9.setBackground(Color.GREEN);
                frm.d15_izq = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq9.setIcon(null);
                frm.btnD1Cizq9.setOpaque(true);
                frm.btnD1Cizq9.setBackground(Color.WHITE);
                frm.btnD1Cizq9.setOpaque(true);
                frm.btnD1Cizq9.setBackground(Color.RED);
                frm.d15_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq9.setIcon(null);
                frm.btnD1Cizq9.setOpaque(true);
                frm.btnD1Cizq9.setBackground(Color.WHITE);
                frm.btnD1Cizq9.setOpaque(true);
                frm.btnD1Cizq9.setBackground(Color.ORANGE);
                frm.d15_izq = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq9.setIcon(null);
                frm.btnD1Cizq9.setOpaque(true);
                frm.btnD1Cizq9.setBackground(Color.WHITE);
                frm.btnD1Cizq9.setOpaque(true);
                frm.btnD1Cizq9.setBackground(Color.BLACK);
                frm.d15_izq = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq9.setIcon(null);
                frm.btnD1Cizq9.setOpaque(true);
                frm.btnD1Cizq9.setBackground(Color.WHITE);
                frm.btnD1Cizq9.setOpaque(true);
                frm.btnD1Cizq9.setBackground(Color.BLUE);
                frm.d15_izq = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq9.setIcon(null);
                frm.btnD1Cizq9.setOpaque(true);
                frm.btnD1Cizq9.setBackground(Color.WHITE);
                frm.btnD1Cizq9.setOpaque(true);
                frm.btnD1Cizq9.setBackground(Color.GRAY);
                frm.d15_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq9.setIcon(null);
                frm.btnD1Cizq9.setOpaque(true);
                frm.btnD1Cizq9.setBackground(Color.WHITE);
                frm.d15_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup9) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup9.setIcon(null);
                frm.btnD1Csup9.setOpaque(true);
                frm.btnD1Csup9.setBackground(Color.WHITE);
                frm.btnD1Csup9.setOpaque(true);
                frm.btnD1Csup9.setBackground(Color.yellow);
                frm.d15_sup = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup9.setIcon(null);
                frm.btnD1Csup9.setOpaque(true);
                frm.btnD1Csup9.setBackground(Color.WHITE);
                frm.btnD1Csup9.setOpaque(true);
                frm.btnD1Csup9.setBackground(Color.GREEN);
                frm.d15_sup = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup9.setIcon(null);
                frm.btnD1Csup9.setOpaque(true);
                frm.btnD1Csup9.setBackground(Color.WHITE);
                frm.btnD1Csup9.setOpaque(true);
                frm.btnD1Csup9.setBackground(Color.RED);
                frm.d15_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup9.setIcon(null);
                frm.btnD1Csup9.setOpaque(true);
                frm.btnD1Csup9.setBackground(Color.WHITE);
                frm.btnD1Csup9.setOpaque(true);
                frm.btnD1Csup9.setBackground(Color.ORANGE);
                frm.d15_sup = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup9.setIcon(null);
                frm.btnD1Csup9.setOpaque(true);
                frm.btnD1Csup9.setBackground(Color.WHITE);
                frm.btnD1Csup9.setOpaque(true);
                frm.btnD1Csup9.setBackground(Color.BLACK);
                frm.d15_sup = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup9.setIcon(null);
                frm.btnD1Csup9.setOpaque(true);
                frm.btnD1Csup9.setBackground(Color.WHITE);
                frm.btnD1Csup9.setOpaque(true);
                frm.btnD1Csup9.setBackground(Color.BLUE);
                frm.d15_sup = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup9.setIcon(null);
                frm.btnD1Csup9.setOpaque(true);
                frm.btnD1Csup9.setBackground(Color.WHITE);
                frm.btnD1Csup9.setOpaque(true);
                frm.btnD1Csup9.setBackground(Color.GRAY);
                frm.d15_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup9.setIcon(null);
                frm.btnD1Csup9.setOpaque(true);
                frm.btnD1Csup9.setBackground(Color.WHITE);
                frm.d15_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen9) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen9.setIcon(null);
                frm.btnD1Ccen9.setOpaque(true);
                frm.btnD1Ccen9.setBackground(Color.WHITE);
                frm.btnD1Ccen9.setOpaque(true);
                frm.btnD1Ccen9.setBackground(Color.yellow);
                frm.d15_cen = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen9.setIcon(null);
                frm.btnD1Ccen9.setOpaque(true);
                frm.btnD1Ccen9.setBackground(Color.WHITE);
                frm.btnD1Ccen9.setOpaque(true);
                frm.btnD1Ccen9.setBackground(Color.GREEN);
                frm.d15_cen = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen9.setIcon(null);
                frm.btnD1Ccen9.setOpaque(true);
                frm.btnD1Ccen9.setBackground(Color.WHITE);
                frm.btnD1Ccen9.setOpaque(true);
                frm.btnD1Ccen9.setBackground(Color.RED);
                frm.d15_cen = "3";

            }

            if (frm.opXroja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen9.setIcon(null);
                frm.btnD1Ccen9.setOpaque(true);
                frm.btnD1Ccen9.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen9.getWidth(), frm.btnD1Ccen9.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD1Ccen9.setIcon(icono);

                frm.btnD1Cizq9.setIcon(null);
                frm.btnD1Cizq9.setOpaque(true);
                frm.btnD1Cizq9.setBackground(Color.WHITE);
                frm.btnD1Csup9.setIcon(null);
                frm.btnD1Csup9.setOpaque(true);
                frm.btnD1Csup9.setBackground(Color.WHITE);
                frm.btnD1Cder9.setIcon(null);
                frm.btnD1Cder9.setOpaque(true);
                frm.btnD1Cder9.setBackground(Color.WHITE);
                frm.btnD1Cinf9.setIcon(null);
                frm.btnD1Cinf9.setOpaque(true);
                frm.btnD1Cinf9.setBackground(Color.WHITE);

                frm.d15_cen = "4";
                frm.d15_izq = "0";
                frm.d15_sup = "0";
                frm.d15_der = "0";
                frm.d15_inf = "0";
            }

            if (frm.opXazul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen9.setIcon(null);
                frm.btnD1Ccen9.setOpaque(true);
                frm.btnD1Ccen9.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen9.getWidth(), frm.btnD1Ccen9.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD1Ccen9.setIcon(icono);

                frm.btnD1Cizq9.setIcon(null);
                frm.btnD1Cizq9.setOpaque(true);
                frm.btnD1Cizq9.setBackground(Color.WHITE);
                frm.btnD1Csup9.setIcon(null);
                frm.btnD1Csup9.setOpaque(true);
                frm.btnD1Csup9.setBackground(Color.WHITE);
                frm.btnD1Cder9.setIcon(null);
                frm.btnD1Cder9.setOpaque(true);
                frm.btnD1Cder9.setBackground(Color.WHITE);
                frm.btnD1Cinf9.setIcon(null);
                frm.btnD1Cinf9.setOpaque(true);
                frm.btnD1Cinf9.setBackground(Color.WHITE);

                frm.d15_cen = "5";
                frm.d15_izq = "0";
                frm.d15_sup = "0";
                frm.d15_der = "0";
                frm.d15_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen9.setIcon(null);
                frm.btnD1Ccen9.setOpaque(true);
                frm.btnD1Ccen9.setBackground(Color.WHITE);
                frm.btnD1Ccen9.setOpaque(true);
                frm.btnD1Ccen9.setBackground(Color.ORANGE);
                frm.d15_cen = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen9.setIcon(null);
                frm.btnD1Ccen9.setOpaque(true);
                frm.btnD1Ccen9.setBackground(Color.WHITE);
                frm.btnD1Ccen9.setOpaque(true);
                frm.btnD1Ccen9.setBackground(Color.BLACK);
                frm.d15_cen = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen9.setIcon(null);
                frm.btnD1Ccen9.setOpaque(true);
                frm.btnD1Ccen9.setBackground(Color.WHITE);
                frm.btnD1Ccen9.setOpaque(true);
                frm.btnD1Ccen9.setBackground(Color.BLUE);
                frm.d15_cen = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen9.setIcon(null);
                frm.btnD1Ccen9.setOpaque(true);
                frm.btnD1Ccen9.setBackground(Color.WHITE);
                frm.btnD1Ccen9.setOpaque(true);
                frm.btnD1Ccen9.setBackground(Color.GRAY);
                frm.d15_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen9.setIcon(null);
                frm.btnD1Ccen9.setOpaque(true);
                frm.btnD1Ccen9.setBackground(Color.WHITE);
                frm.d15_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder9) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder9.setIcon(null);
                frm.btnD1Cder9.setOpaque(true);
                frm.btnD1Cder9.setBackground(Color.WHITE);
                frm.btnD1Cder9.setOpaque(true);
                frm.btnD1Cder9.setBackground(Color.yellow);
                frm.d15_der = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder9.setIcon(null);
                frm.btnD1Cder9.setOpaque(true);
                frm.btnD1Cder9.setBackground(Color.WHITE);
                frm.btnD1Cder9.setOpaque(true);
                frm.btnD1Cder9.setBackground(Color.GREEN);
                frm.d15_der = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder9.setIcon(null);
                frm.btnD1Cder9.setOpaque(true);
                frm.btnD1Cder9.setBackground(Color.WHITE);
                frm.btnD1Cder9.setOpaque(true);
                frm.btnD1Cder9.setBackground(Color.RED);
                frm.d15_der = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder9.setIcon(null);
                frm.btnD1Cder9.setOpaque(true);
                frm.btnD1Cder9.setBackground(Color.WHITE);
                frm.btnD1Cder9.setOpaque(true);
                frm.btnD1Cder9.setBackground(Color.ORANGE);
                frm.d15_der = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder9.setIcon(null);
                frm.btnD1Cder9.setOpaque(true);
                frm.btnD1Cder9.setBackground(Color.WHITE);
                frm.btnD1Cder9.setOpaque(true);
                frm.btnD1Cder9.setBackground(Color.BLACK);
                frm.d15_der = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder9.setIcon(null);
                frm.btnD1Cder9.setOpaque(true);
                frm.btnD1Cder9.setBackground(Color.WHITE);
                frm.btnD1Cder9.setOpaque(true);
                frm.btnD1Cder9.setBackground(Color.BLUE);
                frm.d15_der = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder9.setIcon(null);
                frm.btnD1Cder9.setOpaque(true);
                frm.btnD1Cder9.setBackground(Color.WHITE);
                frm.btnD1Cder9.setOpaque(true);
                frm.btnD1Cder9.setBackground(Color.GRAY);
                frm.d15_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder9.setIcon(null);
                frm.btnD1Cder9.setOpaque(true);
                frm.btnD1Cder9.setBackground(Color.WHITE);
                frm.d15_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf9) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf9.setIcon(null);
                frm.btnD1Cinf9.setOpaque(true);
                frm.btnD1Cinf9.setBackground(Color.WHITE);
                frm.btnD1Cinf9.setOpaque(true);
                frm.btnD1Cinf9.setBackground(Color.yellow);
                frm.d15_inf = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf9.setIcon(null);
                frm.btnD1Cinf9.setOpaque(true);
                frm.btnD1Cinf9.setBackground(Color.WHITE);
                frm.btnD1Cinf9.setOpaque(true);
                frm.btnD1Cinf9.setBackground(Color.GREEN);
                frm.d15_inf = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf9.setIcon(null);
                frm.btnD1Cinf9.setOpaque(true);
                frm.btnD1Cinf9.setBackground(Color.WHITE);
                frm.btnD1Cinf9.setOpaque(true);
                frm.btnD1Cinf9.setBackground(Color.RED);
                frm.d15_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf9.setIcon(null);
                frm.btnD1Cinf9.setOpaque(true);
                frm.btnD1Cinf9.setBackground(Color.WHITE);
                frm.btnD1Cinf9.setOpaque(true);
                frm.btnD1Cinf9.setBackground(Color.ORANGE);
                frm.d15_inf = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf9.setIcon(null);
                frm.btnD1Cinf9.setOpaque(true);
                frm.btnD1Cinf9.setBackground(Color.WHITE);
                frm.btnD1Cinf9.setOpaque(true);
                frm.btnD1Cinf9.setBackground(Color.BLACK);
                frm.d15_inf = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf9.setIcon(null);
                frm.btnD1Cinf9.setOpaque(true);
                frm.btnD1Cinf9.setBackground(Color.WHITE);
                frm.btnD1Cinf9.setOpaque(true);
                frm.btnD1Cinf9.setBackground(Color.BLUE);
                frm.d15_inf = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf9.setIcon(null);
                frm.btnD1Cinf9.setOpaque(true);
                frm.btnD1Cinf9.setBackground(Color.WHITE);
                frm.btnD1Cinf9.setOpaque(true);
                frm.btnD1Cinf9.setBackground(Color.GRAY);
                frm.d15_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf9.setIcon(null);
                frm.btnD1Cinf9.setOpaque(true);
                frm.btnD1Cinf9.setBackground(Color.WHITE);
                frm.d15_inf = "0";

            }
            System.out.println(frm.d15_inf);
        }
        //***********************************************************************************
       
        //***********************************************************************************

    }

}
