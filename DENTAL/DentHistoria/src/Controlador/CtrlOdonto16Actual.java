package Controlador;

import Modelo.ConsultasOdontograma;
import Modelo.Odontograma;
import Vista.frmConsultasPaciente;
import Vista.frmOdontogramaActual;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CtrlOdonto16Actual implements ActionListener {

    private frmOdontogramaActual frm;

    public CtrlOdonto16Actual(frmOdontogramaActual frm) {

        this.frm = frm;
        
       
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
         //**********************************DIENTE 16 ***************************************
        if (e.getSource() == frm.btnD1Cizq8) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq8.setIcon(null);
                frm.btnD1Cizq8.setOpaque(true);
                frm.btnD1Cizq8.setBackground(Color.WHITE);
                frm.btnD1Cizq8.setOpaque(true);
                frm.btnD1Cizq8.setBackground(Color.yellow);
                frm.d16_izq = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq8.setIcon(null);
                frm.btnD1Cizq8.setOpaque(true);
                frm.btnD1Cizq8.setBackground(Color.WHITE);
                frm.btnD1Cizq8.setOpaque(true);
                frm.btnD1Cizq8.setBackground(Color.GREEN);
                frm.d16_izq = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq8.setIcon(null);
                frm.btnD1Cizq8.setOpaque(true);
                frm.btnD1Cizq8.setBackground(Color.WHITE);
                frm.btnD1Cizq8.setOpaque(true);
                frm.btnD1Cizq8.setBackground(Color.RED);
                frm.d16_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq8.setIcon(null);
                frm.btnD1Cizq8.setOpaque(true);
                frm.btnD1Cizq8.setBackground(Color.WHITE);
                frm.btnD1Cizq8.setOpaque(true);
                frm.btnD1Cizq8.setBackground(Color.ORANGE);
                frm.d16_izq = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq8.setIcon(null);
                frm.btnD1Cizq8.setOpaque(true);
                frm.btnD1Cizq8.setBackground(Color.WHITE);
                frm.btnD1Cizq8.setOpaque(true);
                frm.btnD1Cizq8.setBackground(Color.BLACK);
                frm.d16_izq = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq8.setIcon(null);
                frm.btnD1Cizq8.setOpaque(true);
                frm.btnD1Cizq8.setBackground(Color.WHITE);
                frm.btnD1Cizq8.setOpaque(true);
                frm.btnD1Cizq8.setBackground(Color.BLUE);
                frm.d16_izq = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq8.setIcon(null);
                frm.btnD1Cizq8.setOpaque(true);
                frm.btnD1Cizq8.setBackground(Color.WHITE);
                frm.btnD1Cizq8.setOpaque(true);
                frm.btnD1Cizq8.setBackground(Color.GRAY);
                frm.d16_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cizq8.setIcon(null);
                frm.btnD1Cizq8.setOpaque(true);
                frm.btnD1Cizq8.setBackground(Color.WHITE);
                frm.d16_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup8) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup8.setIcon(null);
                frm.btnD1Csup8.setOpaque(true);
                frm.btnD1Csup8.setBackground(Color.WHITE);
                frm.btnD1Csup8.setOpaque(true);
                frm.btnD1Csup8.setBackground(Color.yellow);
                frm.d16_sup = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup8.setIcon(null);
                frm.btnD1Csup8.setOpaque(true);
                frm.btnD1Csup8.setBackground(Color.WHITE);
                frm.btnD1Csup8.setOpaque(true);
                frm.btnD1Csup8.setBackground(Color.GREEN);
                frm.d16_sup = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup8.setIcon(null);
                frm.btnD1Csup8.setOpaque(true);
                frm.btnD1Csup8.setBackground(Color.WHITE);
                frm.btnD1Csup8.setOpaque(true);
                frm.btnD1Csup8.setBackground(Color.RED);
                frm.d16_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup8.setIcon(null);
                frm.btnD1Csup8.setOpaque(true);
                frm.btnD1Csup8.setBackground(Color.WHITE);
                frm.btnD1Csup8.setOpaque(true);
                frm.btnD1Csup8.setBackground(Color.ORANGE);
                frm.d16_sup = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup8.setIcon(null);
                frm.btnD1Csup8.setOpaque(true);
                frm.btnD1Csup8.setBackground(Color.WHITE);
                frm.btnD1Csup8.setOpaque(true);
                frm.btnD1Csup8.setBackground(Color.BLACK);
                frm.d16_sup = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup8.setIcon(null);
                frm.btnD1Csup8.setOpaque(true);
                frm.btnD1Csup8.setBackground(Color.WHITE);
                frm.btnD1Csup8.setOpaque(true);
                frm.btnD1Csup8.setBackground(Color.BLUE);
                frm.d16_sup = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup8.setIcon(null);
                frm.btnD1Csup8.setOpaque(true);
                frm.btnD1Csup8.setBackground(Color.WHITE);
                frm.btnD1Csup8.setOpaque(true);
                frm.btnD1Csup8.setBackground(Color.GRAY);
                frm.d16_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Csup8.setIcon(null);
                frm.btnD1Csup8.setOpaque(true);
                frm.btnD1Csup8.setBackground(Color.WHITE);
                frm.d16_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen8) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen8.setIcon(null);
                frm.btnD1Ccen8.setOpaque(true);
                frm.btnD1Ccen8.setBackground(Color.WHITE);
                frm.btnD1Ccen8.setOpaque(true);
                frm.btnD1Ccen8.setBackground(Color.yellow);
                frm.d16_cen = "1";

            }
            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen8.setIcon(null);
                frm.btnD1Ccen8.setOpaque(true);
                frm.btnD1Ccen8.setBackground(Color.WHITE);
                frm.btnD1Ccen8.setOpaque(true);
                frm.btnD1Ccen8.setBackground(Color.GREEN);
                frm.d16_cen = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen8.setIcon(null);
                frm.btnD1Ccen8.setOpaque(true);
                frm.btnD1Ccen8.setBackground(Color.WHITE);
                frm.btnD1Ccen8.setOpaque(true);
                frm.btnD1Ccen8.setBackground(Color.RED);
                frm.d16_cen = "3";

            }

            if (frm.opXroja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen8.setIcon(null);
                frm.btnD1Ccen8.setOpaque(true);
                frm.btnD1Ccen8.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen8.getWidth(), frm.btnD1Ccen8.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD1Ccen8.setIcon(icono);

                frm.btnD1Cizq8.setIcon(null);
                frm.btnD1Cizq8.setOpaque(true);
                frm.btnD1Cizq8.setBackground(Color.WHITE);
                frm.btnD1Csup8.setIcon(null);
                frm.btnD1Csup8.setOpaque(true);
                frm.btnD1Csup8.setBackground(Color.WHITE);
                frm.btnD1Cder8.setIcon(null);
                frm.btnD1Cder8.setOpaque(true);
                frm.btnD1Cder8.setBackground(Color.WHITE);
                frm.btnD1Cinf8.setIcon(null);
                frm.btnD1Cinf8.setOpaque(true);
                frm.btnD1Cinf8.setBackground(Color.WHITE);

                frm.d16_cen = "4";
                frm.d16_izq = "0";
                frm.d16_sup = "0";
                frm.d16_der = "0";
                frm.d16_inf = "0";
            }

            if (frm.opXazul.isSelected()) {
                System.out.println("seleccionado");
                 frm.btnD1Ccen8.setIcon(null);
                frm.btnD1Ccen8.setOpaque(true);
                frm.btnD1Ccen8.setBackground(Color.WHITE);
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen8.getWidth(), frm.btnD1Ccen8.getHeight(), Image.SCALE_DEFAULT));
                frm.btnD1Ccen8.setIcon(icono);

                frm.btnD1Cizq8.setIcon(null);
                frm.btnD1Cizq8.setOpaque(true);
                frm.btnD1Cizq8.setBackground(Color.WHITE);
                frm.btnD1Csup8.setIcon(null);
                frm.btnD1Csup8.setOpaque(true);
                frm.btnD1Csup8.setBackground(Color.WHITE);
                frm.btnD1Cder8.setIcon(null);
                frm.btnD1Cder8.setOpaque(true);
                frm.btnD1Cder8.setBackground(Color.WHITE);
                frm.btnD1Cinf8.setIcon(null);
                frm.btnD1Cinf8.setOpaque(true);
                frm.btnD1Cinf8.setBackground(Color.WHITE);

                frm.d16_cen = "5";
                frm.d16_izq = "0";
                frm.d16_sup = "0";
                frm.d16_der = "0";
                frm.d16_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen8.setIcon(null);
                frm.btnD1Ccen8.setOpaque(true);
                frm.btnD1Ccen8.setBackground(Color.WHITE);
                frm.btnD1Ccen8.setOpaque(true);
                frm.btnD1Ccen8.setBackground(Color.ORANGE);
                frm.d16_cen = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen8.setIcon(null);
                frm.btnD1Ccen8.setOpaque(true);
                frm.btnD1Ccen8.setBackground(Color.WHITE);
                frm.btnD1Ccen8.setOpaque(true);
                frm.btnD1Ccen8.setBackground(Color.BLACK);
                frm.d16_cen = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen8.setIcon(null);
                frm.btnD1Ccen8.setOpaque(true);
                frm.btnD1Ccen8.setBackground(Color.WHITE);
                frm.btnD1Ccen8.setOpaque(true);
                frm.btnD1Ccen8.setBackground(Color.BLUE);
                frm.d16_cen = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen8.setIcon(null);
                frm.btnD1Ccen8.setOpaque(true);
                frm.btnD1Ccen8.setBackground(Color.WHITE);
                frm.btnD1Ccen8.setOpaque(true);
                frm.btnD1Ccen8.setBackground(Color.GRAY);
                frm.d16_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Ccen8.setIcon(null);
                frm.btnD1Ccen8.setOpaque(true);
                frm.btnD1Ccen8.setBackground(Color.WHITE);
                frm.d16_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder8) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder8.setIcon(null);
                frm.btnD1Cder8.setOpaque(true);
                frm.btnD1Cder8.setBackground(Color.WHITE);
                frm.btnD1Cder8.setOpaque(true);
                frm.btnD1Cder8.setBackground(Color.yellow);
                frm.d16_der = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder8.setIcon(null);
                frm.btnD1Cder8.setOpaque(true);
                frm.btnD1Cder8.setBackground(Color.WHITE);
                frm.btnD1Cder8.setOpaque(true);
                frm.btnD1Cder8.setBackground(Color.GREEN);
                frm.d16_der = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder8.setIcon(null);
                frm.btnD1Cder8.setOpaque(true);
                frm.btnD1Cder8.setBackground(Color.WHITE);
                frm.btnD1Cder8.setOpaque(true);
                frm.btnD1Cder8.setBackground(Color.RED);
                frm.d16_der = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder8.setIcon(null);
                frm.btnD1Cder8.setOpaque(true);
                frm.btnD1Cder8.setBackground(Color.WHITE);
                frm.btnD1Cder8.setOpaque(true);
                frm.btnD1Cder8.setBackground(Color.ORANGE);
                frm.d16_der = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder8.setIcon(null);
                frm.btnD1Cder8.setOpaque(true);
                frm.btnD1Cder8.setBackground(Color.WHITE);
                frm.btnD1Cder8.setOpaque(true);
                frm.btnD1Cder8.setBackground(Color.BLACK);
                frm.d16_der = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder8.setIcon(null);
                frm.btnD1Cder8.setOpaque(true);
                frm.btnD1Cder8.setBackground(Color.WHITE);
                frm.btnD1Cder8.setOpaque(true);
                frm.btnD1Cder8.setBackground(Color.BLUE);
                frm.d16_der = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder8.setIcon(null);
                frm.btnD1Cder8.setOpaque(true);
                frm.btnD1Cder8.setBackground(Color.WHITE);
                frm.btnD1Cder8.setOpaque(true);
                frm.btnD1Cder8.setBackground(Color.GRAY);
                frm.d16_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cder8.setIcon(null);
                frm.btnD1Cder8.setOpaque(true);
                frm.btnD1Cder8.setBackground(Color.WHITE);
                frm.d16_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf8) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf8.setIcon(null);
                frm.btnD1Cinf8.setOpaque(true);
                frm.btnD1Cinf8.setBackground(Color.WHITE);
                frm.btnD1Cinf8.setOpaque(true);
                frm.btnD1Cinf8.setBackground(Color.yellow);
                frm.d16_inf = "1";

            }

            if (frm.opVerde.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf8.setIcon(null);
                frm.btnD1Cinf8.setOpaque(true);
                frm.btnD1Cinf8.setBackground(Color.WHITE);
                frm.btnD1Cinf8.setOpaque(true);
                frm.btnD1Cinf8.setBackground(Color.GREEN);
                frm.d16_inf = "2";

            }
            if (frm.opRojo.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf8.setIcon(null);
                frm.btnD1Cinf8.setOpaque(true);
                frm.btnD1Cinf8.setBackground(Color.WHITE);
                frm.btnD1Cinf8.setOpaque(true);
                frm.btnD1Cinf8.setBackground(Color.RED);
                frm.d16_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf8.setIcon(null);
                frm.btnD1Cinf8.setOpaque(true);
                frm.btnD1Cinf8.setBackground(Color.WHITE);
                frm.btnD1Cinf8.setOpaque(true);
                frm.btnD1Cinf8.setBackground(Color.ORANGE);
                frm.d16_inf = "6";

            }
            if (frm.opNegro.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf8.setIcon(null);
                frm.btnD1Cinf8.setOpaque(true);
                frm.btnD1Cinf8.setBackground(Color.WHITE);
                frm.btnD1Cinf8.setOpaque(true);
                frm.btnD1Cinf8.setBackground(Color.BLACK);
                frm.d16_inf = "7";

            }

            if (frm.opAzul.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf8.setIcon(null);
                frm.btnD1Cinf8.setOpaque(true);
                frm.btnD1Cinf8.setBackground(Color.WHITE);
                frm.btnD1Cinf8.setOpaque(true);
                frm.btnD1Cinf8.setBackground(Color.BLUE);
                frm.d16_inf = "8";

            }
            if (frm.opGris.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf8.setIcon(null);
                frm.btnD1Cinf8.setOpaque(true);
                frm.btnD1Cinf8.setBackground(Color.WHITE);
                frm.btnD1Cinf8.setOpaque(true);
                frm.btnD1Cinf8.setBackground(Color.GRAY);
                frm.d16_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {
                System.out.println("seleccionado");
                frm.btnD1Cinf8.setIcon(null);
                frm.btnD1Cinf8.setOpaque(true);
                frm.btnD1Cinf8.setBackground(Color.WHITE);
                frm.d16_inf = "0";

            }
            System.out.println(frm.d15_inf);
        }
        //***********************************************************************************
              
        //***********************************************************************************

    }

}
