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

public class CtrlOdontoinf implements ActionListener {

    private frmConsultasPaciente frm;

    public CtrlOdontoinf(frmConsultasPaciente frm) {

        this.frm = frm;

        //diente 17
        this.frm.btnD1Cizq26.addActionListener(this);
        this.frm.btnD1Csup26.addActionListener(this);
        this.frm.btnD1Ccen26.addActionListener(this);
        this.frm.btnD1Cder26.addActionListener(this);
        this.frm.btnD1Cinf26.addActionListener(this);

        //diente 18
        this.frm.btnD1Cizq27.addActionListener(this);
        this.frm.btnD1Csup27.addActionListener(this);
        this.frm.btnD1Ccen27.addActionListener(this);
        this.frm.btnD1Cder27.addActionListener(this);
        this.frm.btnD1Cinf27.addActionListener(this);
        //diente 19
        this.frm.btnD1Cizq28.addActionListener(this);
        this.frm.btnD1Csup28.addActionListener(this);
        this.frm.btnD1Ccen28.addActionListener(this);
        this.frm.btnD1Cder28.addActionListener(this);
        this.frm.btnD1Cinf28.addActionListener(this);
        //diente 20
        this.frm.btnD1Cizq29.addActionListener(this);
        this.frm.btnD1Csup29.addActionListener(this);
        this.frm.btnD1Ccen29.addActionListener(this);
        this.frm.btnD1Cder29.addActionListener(this);
        this.frm.btnD1Cinf29.addActionListener(this);
        //diente 21
        this.frm.btnD1Cizq30.addActionListener(this);
        this.frm.btnD1Csup30.addActionListener(this);
        this.frm.btnD1Ccen30.addActionListener(this);
        this.frm.btnD1Cder30.addActionListener(this);
        this.frm.btnD1Cinf30.addActionListener(this);
        //diente 22
        this.frm.btnD1Cizq31.addActionListener(this);
        this.frm.btnD1Csup31.addActionListener(this);
        this.frm.btnD1Ccen31.addActionListener(this);
        this.frm.btnD1Cder31.addActionListener(this);
        this.frm.btnD1Cinf31.addActionListener(this);
        //diente 23
        this.frm.btnD1Cizq32.addActionListener(this);
        this.frm.btnD1Csup32.addActionListener(this);
        this.frm.btnD1Ccen32.addActionListener(this);
        this.frm.btnD1Cder32.addActionListener(this);
        this.frm.btnD1Cinf32.addActionListener(this);

        //diente 24
        this.frm.btnD1Cizq33.addActionListener(this);
        this.frm.btnD1Csup33.addActionListener(this);
        this.frm.btnD1Ccen33.addActionListener(this);
        this.frm.btnD1Cder33.addActionListener(this);
        this.frm.btnD1Cinf33.addActionListener(this);

        //DIENTE 25
        this.frm.btnD1Cizq39.addActionListener(this);
        this.frm.btnD1Csup39.addActionListener(this);
        this.frm.btnD1Ccen39.addActionListener(this);
        this.frm.btnD1Cder39.addActionListener(this);
        this.frm.btnD1Cinf39.addActionListener(this);

        //DIENTE 26
        this.frm.btnD1Cizq40.addActionListener(this);
        this.frm.btnD1Csup40.addActionListener(this);
        this.frm.btnD1Ccen40.addActionListener(this);
        this.frm.btnD1Cder40.addActionListener(this);
        this.frm.btnD1Cinf40.addActionListener(this);

        //DIENTE 27
        this.frm.btnD1Cizq41.addActionListener(this);
        this.frm.btnD1Csup41.addActionListener(this);
        this.frm.btnD1Ccen41.addActionListener(this);
        this.frm.btnD1Cder41.addActionListener(this);
        this.frm.btnD1Cinf41.addActionListener(this);

        //DIENTE 28
        this.frm.btnD1Cizq42.addActionListener(this);
        this.frm.btnD1Csup42.addActionListener(this);
        this.frm.btnD1Ccen42.addActionListener(this);
        this.frm.btnD1Cder42.addActionListener(this);
        this.frm.btnD1Cinf42.addActionListener(this);

        //DIENTE 29
        this.frm.btnD1Cizq43.addActionListener(this);
        this.frm.btnD1Csup43.addActionListener(this);
        this.frm.btnD1Ccen43.addActionListener(this);
        this.frm.btnD1Cder43.addActionListener(this);
        this.frm.btnD1Cinf43.addActionListener(this);

        //DIENTE 30
        this.frm.btnD1Cizq44.addActionListener(this);
        this.frm.btnD1Csup44.addActionListener(this);
        this.frm.btnD1Ccen44.addActionListener(this);
        this.frm.btnD1Cder44.addActionListener(this);
        this.frm.btnD1Cinf44.addActionListener(this);

        //DIENTE 31
        this.frm.btnD1Cizq45.addActionListener(this);
        this.frm.btnD1Csup45.addActionListener(this);
        this.frm.btnD1Ccen45.addActionListener(this);
        this.frm.btnD1Cder45.addActionListener(this);
        this.frm.btnD1Cinf45.addActionListener(this);

        //DIENTE 32
        this.frm.btnD1Cizq46.addActionListener(this);
        this.frm.btnD1Csup46.addActionListener(this);
        this.frm.btnD1Ccen46.addActionListener(this);
        this.frm.btnD1Cder46.addActionListener(this);
        this.frm.btnD1Cinf46.addActionListener(this);

    }

    public void iniciar() {
        frm.setTitle("ODONTOGRAMA");
        frm.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //********************************************* PIEZAS DENTALES***************************
        //***********************************************DIENTE 17 ********************************
        if (e.getSource() == frm.btnD1Cizq26) {
            if (frm.opAmarillo.isSelected()) {

                frm.d17_izq = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d17_izq = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d17_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d17_izq = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d17_izq = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d17_izq = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d17_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d17_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup26) {
            if (frm.opAmarillo.isSelected()) {

                frm.d17_sup = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d17_sup = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d17_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d17_sup = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d17_sup = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d17_sup = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d17_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d17_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen26) {
            if (frm.opAmarillo.isSelected()) {

                frm.d17_cen = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d17_cen = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d17_cen = "3";

            }

            if (frm.opXroja.isSelected()) {

                frm.d17_cen = "4";
                frm.d17_izq = "0";
                frm.d17_sup = "0";
                frm.d17_der = "0";
                frm.d17_inf = "0";
            }

            if (frm.opXazul.isSelected()) {

                frm.d17_cen = "5";
                frm.d17_izq = "0";
                frm.d17_sup = "0";
                frm.d17_der = "0";
                frm.d17_inf = "0";

            }
            if (frm.opNaranja.isSelected()) {

                frm.d17_cen = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d17_cen = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d17_cen = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d17_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d17_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder26) {
            if (frm.opAmarillo.isSelected()) {

                frm.d17_der = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d17_der = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d17_der = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d17_der = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d17_der = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d17_der = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d17_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d17_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf26) {
            if (frm.opAmarillo.isSelected()) {

                frm.d17_inf = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d17_inf = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d17_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d17_inf = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d17_inf = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d17_inf = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d17_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d17_inf = "0";

            }
        }

        //*********************************************** DIENTE 18********************************
        if (e.getSource() == frm.btnD1Cizq27) {
            if (frm.opAmarillo.isSelected()) {

                frm.d18_izq = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d18_izq = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d18_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d18_izq = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d18_izq = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d18_izq = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d18_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d18_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup27) {
            if (frm.opAmarillo.isSelected()) {

                frm.d18_sup = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d18_sup = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d18_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d18_sup = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d18_sup = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d18_sup = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d18_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d18_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen27) {
            if (frm.opAmarillo.isSelected()) {

                frm.d18_cen = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d18_cen = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d18_cen = "3";

            }

            if (frm.opXroja.isSelected()) {

                frm.d18_cen = "4";
                frm.d18_izq = "0";
                frm.d18_sup = "0";
                frm.d18_der = "0";
                frm.d18_inf = "0";
            }

            if (frm.opXazul.isSelected()) {
                frm.d18_cen = "5";
                frm.d18_izq = "0";
                frm.d18_sup = "0";
                frm.d18_der = "0";
                frm.d18_inf = "0";

            }
            if (frm.opNaranja.isSelected()) {

                frm.d18_cen = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d18_cen = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d18_cen = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d18_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d18_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder27) {
            if (frm.opAmarillo.isSelected()) {

                frm.d18_der = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d18_der = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d18_der = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d18_der = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d18_der = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d18_der = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d18_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d18_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf27) {
            if (frm.opAmarillo.isSelected()) {

                frm.d18_inf = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d18_inf = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d18_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d18_inf = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d18_inf = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d18_inf = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d18_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d18_inf = "0";

            }
        }

        //DIENTE 19****************************************
        if (e.getSource() == frm.btnD1Cizq28) {
            if (frm.opAmarillo.isSelected()) {

                frm.d19_izq = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d19_izq = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d19_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d19_izq = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d19_izq = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d19_izq = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d19_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d19_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup28) {
            if (frm.opAmarillo.isSelected()) {

                frm.d19_sup = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d19_sup = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d19_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d19_sup = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d19_sup = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d19_sup = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d19_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d19_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen28) {
            if (frm.opAmarillo.isSelected()) {

                frm.d19_cen = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d19_cen = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d19_cen = "3";

            }

            if (frm.opXroja.isSelected()) {

                frm.d19_cen = "4";
                frm.d19_izq = "0";
                frm.d19_sup = "0";
                frm.d19_der = "0";
                frm.d19_inf = "0";
            }

            if (frm.opXazul.isSelected()) {

                frm.d19_cen = "5";
                frm.d19_izq = "0";
                frm.d19_sup = "0";
                frm.d19_der = "0";
                frm.d19_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {

                frm.d19_cen = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d19_cen = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d19_cen = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d19_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d19_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder28) {
            if (frm.opAmarillo.isSelected()) {

                frm.d19_der = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d19_der = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d19_der = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d19_der = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d19_der = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d19_der = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d19_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d19_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf28) {
            if (frm.opAmarillo.isSelected()) {

                frm.d19_inf = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d19_inf = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d19_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d19_inf = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d19_inf = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d19_inf = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d19_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d19_inf = "0";

            }
        }
        //*************************************
        //********************DIENTE 20**********************
        //
        if (e.getSource() == frm.btnD1Cizq29) {
            if (frm.opAmarillo.isSelected()) {

                frm.d20_izq = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d20_izq = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d20_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d20_izq = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d20_izq = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d20_izq = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d20_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d20_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup29) {
            if (frm.opAmarillo.isSelected()) {

                frm.d20_sup = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d20_sup = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d20_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d20_sup = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d20_sup = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d20_sup = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d20_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d20_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen29) {
            if (frm.opAmarillo.isSelected()) {
                System.out.println("seleccionado");

                frm.d20_cen = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d20_cen = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d20_cen = "3";

            }

            if (frm.opXroja.isSelected()) {

                frm.d20_cen = "4";
                frm.d20_izq = "0";
                frm.d20_sup = "0";
                frm.d20_der = "0";
                frm.d20_inf = "0";
            }

            if (frm.opXazul.isSelected()) {

                frm.d20_cen = "5";
                frm.d20_izq = "0";
                frm.d20_sup = "0";
                frm.d20_der = "0";
                frm.d20_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {

                frm.d20_cen = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d20_cen = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d20_cen = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d20_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d20_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder29) {
            if (frm.opAmarillo.isSelected()) {

                frm.d20_der = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d20_der = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d20_der = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d20_der = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d20_der = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d20_der = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d20_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d20_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf29) {
            if (frm.opAmarillo.isSelected()) {

                frm.d20_inf = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d20_inf = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d20_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d20_inf = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d20_inf = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d20_inf = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d20_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d20_inf = "0";

            }
        }
        //*************************************************************************
        //****************DIENTE 21***********************************************************
        //**
        //
        if (e.getSource() == frm.btnD1Cizq30) {
            if (frm.opAmarillo.isSelected()) {

                frm.d21_izq = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d21_izq = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d21_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d21_izq = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d21_izq = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d21_izq = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d21_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d21_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup30) {
            if (frm.opAmarillo.isSelected()) {

                frm.d21_sup = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d21_sup = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d21_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d21_sup = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d21_sup = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d21_sup = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d21_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d21_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen30) {
            if (frm.opAmarillo.isSelected()) {

                frm.d21_cen = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d21_cen = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d21_cen = "3";

            }

            if (frm.opXroja.isSelected()) {

                frm.d21_cen = "4";
                frm.d21_izq = "0";
                frm.d21_sup = "0";
                frm.d21_der = "0";
                frm.d21_inf = "0";
            }

            if (frm.opXazul.isSelected()) {

                frm.d21_cen = "5";
                frm.d21_izq = "0";
                frm.d21_sup = "0";
                frm.d21_der = "0";
                frm.d21_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {

                frm.d21_cen = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d21_cen = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d21_cen = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d21_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d21_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder30) {
            if (frm.opAmarillo.isSelected()) {

                frm.d21_der = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d21_der = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d21_der = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d21_der = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d21_der = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d21_der = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d21_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d21_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf30) {
            if (frm.opAmarillo.isSelected()) {

                frm.d21_inf = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d21_inf = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d21_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d21_inf = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d21_inf = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d21_inf = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d21_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d21_inf = "0";

            }
        }
        //***************************
        //****************************************DIENTE 22********************************  
        if (e.getSource() == frm.btnD1Cizq31) {
            if (frm.opAmarillo.isSelected()) {

                frm.d22_izq = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d22_izq = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d22_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d22_izq = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d22_izq = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d22_izq = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d22_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d22_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup31) {
            if (frm.opAmarillo.isSelected()) {

                frm.d22_sup = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d22_sup = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d22_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d22_sup = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d22_sup = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d22_sup = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d22_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d22_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen31) {
            if (frm.opAmarillo.isSelected()) {

                frm.d22_cen = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d22_cen = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d22_cen = "3";

            }

            if (frm.opXroja.isSelected()) {

                frm.d22_cen = "4";
                frm.d22_izq = "0";
                frm.d22_sup = "0";
                frm.d22_der = "0";
                frm.d22_inf = "0";
            }

            if (frm.opXazul.isSelected()) {

                frm.d22_cen = "5";
                frm.d22_izq = "0";
                frm.d22_sup = "0";
                frm.d22_der = "0";
                frm.d22_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {

                frm.d22_cen = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d22_cen = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d22_cen = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d22_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d22_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder31) {
            if (frm.opAmarillo.isSelected()) {

                frm.d22_der = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d22_der = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d22_der = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d22_der = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d22_der = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d22_der = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d22_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d22_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf31) {
            if (frm.opAmarillo.isSelected()) {

                frm.d22_inf = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d22_inf = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d22_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d22_inf = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d22_inf = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d22_inf = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d22_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d22_inf = "0";

            }
        }
        //**********************************************************************************
        //***************************
        //****************************************DIENTE 23*******************************  
        if (e.getSource() == frm.btnD1Cizq32) {
            if (frm.opAmarillo.isSelected()) {

                frm.d23_izq = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d23_izq = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d23_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d23_izq = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d23_izq = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d23_izq = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d23_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d23_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup32) {
            if (frm.opAmarillo.isSelected()) {

                frm.d23_sup = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d23_sup = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d23_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d23_sup = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d23_sup = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d23_sup = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d23_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d23_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen32) {
            if (frm.opAmarillo.isSelected()) {

                frm.d23_cen = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d23_cen = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d23_cen = "3";

            }

            if (frm.opXroja.isSelected()) {

                frm.d23_cen = "4";
                frm.d23_izq = "0";
                frm.d23_sup = "0";
                frm.d23_der = "0";
                frm.d23_inf = "0";
            }

            if (frm.opXazul.isSelected()) {

                frm.d23_cen = "5";
                frm.d23_izq = "0";
                frm.d23_sup = "0";
                frm.d23_der = "0";
                frm.d23_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {

                frm.d23_cen = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d23_cen = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d23_cen = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d23_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d23_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder32) {
            if (frm.opAmarillo.isSelected()) {

                frm.d23_der = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d23_der = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d23_der = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d23_der = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d23_der = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d23_der = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d23_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d23_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf32) {
            if (frm.opAmarillo.isSelected()) {

                frm.d23_inf = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d23_inf = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d23_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d23_inf = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d23_inf = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d23_inf = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d23_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d23_inf = "0";

            }
        }
        //**********************************************************************************

        //****************************************DIENTE 24*******************************  
        if (e.getSource() == frm.btnD1Cizq33) {
            if (frm.opAmarillo.isSelected()) {

                frm.d24_izq = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d24_izq = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d24_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d24_izq = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d24_izq = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d24_izq = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d24_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d24_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup33) {
            if (frm.opAmarillo.isSelected()) {

                frm.d24_sup = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d24_sup = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d24_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d24_sup = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d24_sup = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d24_sup = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d24_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d24_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen33) {
            if (frm.opAmarillo.isSelected()) {

                frm.d24_cen = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d24_cen = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d24_cen = "3";

            }

            if (frm.opXroja.isSelected()) {

                frm.d24_cen = "4";
                frm.d24_izq = "0";
                frm.d24_sup = "0";
                frm.d24_der = "0";
                frm.d24_inf = "0";
            }

            if (frm.opXazul.isSelected()) {

                frm.d24_cen = "5";
                frm.d24_izq = "0";
                frm.d24_sup = "0";
                frm.d24_der = "0";
                frm.d24_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {

                frm.d24_cen = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d24_cen = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d24_cen = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d24_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d24_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder33) {
            if (frm.opAmarillo.isSelected()) {

                frm.d24_der = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d24_der = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d24_der = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d24_der = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d24_der = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d24_der = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d24_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d24_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf33) {
            if (frm.opAmarillo.isSelected()) {

                frm.d24_inf = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d24_inf = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d24_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d24_inf = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d24_inf = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d24_inf = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d24_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d24_inf = "0";

            }
        }
        //**********************************************************************************

        //**********************************DIENTE 25
        if (e.getSource() == frm.btnD1Cizq39) {
            if (frm.opAmarillo.isSelected()) {

                frm.d25_izq = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d25_izq = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d25_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d25_izq = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d25_izq = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d25_izq = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d25_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d25_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup39) {
            if (frm.opAmarillo.isSelected()) {

                frm.d25_sup = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d25_sup = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d25_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d25_sup = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d25_sup = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d25_sup = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d25_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d25_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen39) {
            if (frm.opAmarillo.isSelected()) {

                frm.d25_cen = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d25_cen = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d25_cen = "3";

            }

            if (frm.opXroja.isSelected()) {

                frm.d25_cen = "4";
                frm.d25_izq = "0";
                frm.d25_sup = "0";
                frm.d25_der = "0";
                frm.d25_inf = "0";
            }

            if (frm.opXazul.isSelected()) {
                frm.d25_cen = "5";
                frm.d25_izq = "0";
                frm.d25_sup = "0";
                frm.d25_der = "0";
                frm.d25_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {

                frm.d25_cen = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d25_cen = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d25_cen = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d25_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d25_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder39) {
            if (frm.opAmarillo.isSelected()) {

                frm.d25_der = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d25_der = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d25_der = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d25_der = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d25_der = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d25_der = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d25_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d25_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf39) {
            if (frm.opAmarillo.isSelected()) {

                frm.d25_inf = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d25_inf = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d25_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d25_inf = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d25_inf = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d25_inf = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d25_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d25_inf = "0";

            }
        }

        //****************************
        //****************************************  DIENTE 26 **************************
        if (e.getSource() == frm.btnD1Cizq40) {
            if (frm.opAmarillo.isSelected()) {

                frm.d26_izq = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d26_izq = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d26_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d26_izq = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d26_izq = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d26_izq = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d26_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d26_izq = "0";

            }

        }

        //*********************
        if (e.getSource() == frm.btnD1Csup40) {
            if (frm.opAmarillo.isSelected()) {

                frm.d26_sup = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d26_sup = "2";

            }

            if (frm.opRojo.isSelected()) {

                frm.d26_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d26_sup = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d26_sup = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d26_sup = "8";

            }

            if (frm.opGris.isSelected()) {

                frm.d26_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d26_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen40) {
            if (frm.opAmarillo.isSelected()) {

                frm.d26_cen = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d26_cen = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d26_cen = "3";

            }

            if (frm.opXroja.isSelected()) {

                frm.d26_cen = "4";
                frm.d26_izq = "0";
                frm.d26_sup = "0";
                frm.d26_der = "0";
                frm.d26_inf = "0";
            }

            if (frm.opXazul.isSelected()) {

                frm.d26_cen = "5";
                frm.d26_izq = "0";
                frm.d26_sup = "0";
                frm.d26_der = "0";
                frm.d26_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {

                frm.d26_cen = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d26_cen = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d26_cen = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d26_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d26_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder40) {
            if (frm.opAmarillo.isSelected()) {

                frm.d26_der = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d26_der = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d26_der = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d26_der = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d26_der = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d26_der = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d26_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d26_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf40) {
            if (frm.opAmarillo.isSelected()) {

                frm.d26_inf = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d26_inf = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d26_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d26_inf = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d26_inf = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d26_inf = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d26_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d26_inf = "0";

            }

        }
        //****************************************** DIENTE 11 **********************************
        if (e.getSource() == frm.btnD1Cizq41) {
            if (frm.opAmarillo.isSelected()) {

                frm.d27_izq = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d27_izq = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d27_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d27_izq = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d27_izq = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d27_izq = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d27_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d27_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup41) {
            if (frm.opAmarillo.isSelected()) {

                frm.d27_sup = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d27_sup = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d27_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d27_sup = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d27_sup = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d27_sup = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d27_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d27_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen41) {
            if (frm.opAmarillo.isSelected()) {

                frm.d27_cen = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d27_cen = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d27_cen = "3";

            }

            if (frm.opXroja.isSelected()) {

                frm.d27_cen = "4";
                frm.d27_izq = "0";
                frm.d27_sup = "0";
                frm.d27_der = "0";
                frm.d27_inf = "0";
            }

            if (frm.opXazul.isSelected()) {

                frm.d27_cen = "5";
                frm.d27_izq = "0";
                frm.d27_sup = "0";
                frm.d27_der = "0";
                frm.d27_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {

                frm.d27_cen = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d27_cen = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d27_cen = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d27_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d27_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder41) {
            if (frm.opAmarillo.isSelected()) {

                frm.d27_der = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d27_der = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d27_der = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d27_der = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d27_der = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d27_der = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d27_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d27_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf41) {
            if (frm.opAmarillo.isSelected()) {

                frm.d27_inf = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d27_inf = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d27_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d27_inf = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d27_inf = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d27_inf = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d27_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d27_inf = "0";

            }
        }

        //**********************************************************************************
        //********************************************** DIENTE 28 **************************
        if (e.getSource() == frm.btnD1Cizq42) {
            if (frm.opAmarillo.isSelected()) {

                frm.d28_izq = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d28_izq = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d28_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d28_izq = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d28_izq = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d28_izq = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d28_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d28_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup42) {
            if (frm.opAmarillo.isSelected()) {

                frm.d28_sup = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d28_sup = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d28_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d28_sup = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d28_sup = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d28_sup = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d28_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d28_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen42) {
            if (frm.opAmarillo.isSelected()) {

                frm.d28_cen = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d28_cen = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d28_cen = "3";

            }

            if (frm.opXroja.isSelected()) {

                frm.d28_cen = "4";
                frm.d28_izq = "0";
                frm.d28_sup = "0";
                frm.d28_der = "0";
                frm.d28_inf = "0";
            }

            if (frm.opXazul.isSelected()) {

                frm.d28_cen = "5";
                frm.d28_izq = "0";
                frm.d28_sup = "0";
                frm.d28_der = "0";
                frm.d28_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {

                frm.d28_cen = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d28_cen = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d28_cen = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d28_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d28_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder42) {
            if (frm.opAmarillo.isSelected()) {

                frm.d28_der = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d28_der = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d28_der = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d28_der = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d28_der = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d28_der = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d28_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d28_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf42) {
            if (frm.opAmarillo.isSelected()) {

                frm.d28_inf = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d28_inf = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d28_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d28_inf = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d28_inf = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d28_inf = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d28_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d28_inf = "0";

            }
        }

        //***********************************************************************************
        //**********************************DIENTE 29 ***************************************
        if (e.getSource() == frm.btnD1Cizq43) {
            if (frm.opAmarillo.isSelected()) {

                frm.d29_izq = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d29_izq = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d29_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d29_izq = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d29_izq = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d29_izq = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d29_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d29_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup43) {
            if (frm.opAmarillo.isSelected()) {

                frm.d29_sup = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d29_sup = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d29_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d29_sup = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d29_sup = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d29_sup = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d29_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d29_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen43) {
            if (frm.opAmarillo.isSelected()) {

                frm.d29_cen = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d29_cen = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d29_cen = "3";

            }

            if (frm.opXroja.isSelected()) {

                frm.d29_cen = "4";
                frm.d29_izq = "0";
                frm.d29_sup = "0";
                frm.d29_der = "0";
                frm.d29_inf = "0";
            }

            if (frm.opXazul.isSelected()) {

                frm.d29_cen = "5";
                frm.d29_izq = "0";
                frm.d29_sup = "0";
                frm.d29_der = "0";
                frm.d29_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {

                frm.d29_cen = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d29_cen = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d29_cen = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d29_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d29_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder43) {
            if (frm.opAmarillo.isSelected()) {

                frm.d29_der = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d29_der = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d29_der = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d29_der = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d29_der = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d29_der = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d29_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d29_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf43) {
            if (frm.opAmarillo.isSelected()) {

                frm.d29_inf = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d29_inf = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d29_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d29_inf = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d29_inf = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d29_inf = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d29_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d29_inf = "0";

            }
            System.out.println(frm.d13_inf);
        }
        //***********************************************************************************

        //**********************************DIENTE 30 ***************************************
        if (e.getSource() == frm.btnD1Cizq44) {
            if (frm.opAmarillo.isSelected()) {

                frm.d30_izq = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d30_izq = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d30_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d30_izq = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d30_izq = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d30_izq = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d30_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d30_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup44) {
            if (frm.opAmarillo.isSelected()) {

                frm.d30_sup = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d30_sup = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d30_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d30_sup = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d30_sup = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d30_sup = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d30_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d30_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen44) {
            if (frm.opAmarillo.isSelected()) {

                frm.d30_cen = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d30_cen = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d30_cen = "3";

            }

            if (frm.opXroja.isSelected()) {

                frm.d30_cen = "4";
                frm.d30_izq = "0";
                frm.d30_sup = "0";
                frm.d30_der = "0";
                frm.d30_inf = "0";
            }

            if (frm.opXazul.isSelected()) {

                frm.d30_cen = "5";
                frm.d30_izq = "0";
                frm.d30_sup = "0";
                frm.d30_der = "0";
                frm.d30_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {

                frm.d30_cen = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d30_cen = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d30_cen = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d30_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d30_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder44) {
            if (frm.opAmarillo.isSelected()) {

                frm.d30_der = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d30_der = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d30_der = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d30_der = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d30_der = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d30_der = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d30_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d30_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf44) {
            if (frm.opAmarillo.isSelected()) {

                frm.d30_inf = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d30_inf = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d30_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d30_inf = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d30_inf = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d30_inf = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d30_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d30_inf = "0";

            }
            System.out.println(frm.d13_inf);
        }
        //***********************************************************************************

        //**********************************DIENTE 31 ***************************************
        if (e.getSource() == frm.btnD1Cizq45) {
            if (frm.opAmarillo.isSelected()) {

                frm.d31_izq = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d31_izq = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d31_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d31_izq = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d31_izq = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d31_izq = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d31_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d31_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup45) {
            if (frm.opAmarillo.isSelected()) {

                frm.d31_sup = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d31_sup = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d31_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d31_sup = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d31_sup = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d31_sup = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d31_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d31_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen45) {
            if (frm.opAmarillo.isSelected()) {

                frm.d31_cen = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d31_cen = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d31_cen = "3";

            }

            if (frm.opXroja.isSelected()) {

                frm.d31_cen = "4";
                frm.d31_izq = "0";
                frm.d31_sup = "0";
                frm.d31_der = "0";
                frm.d31_inf = "0";
            }

            if (frm.opXazul.isSelected()) {

                frm.d31_cen = "5";
                frm.d31_izq = "0";
                frm.d31_sup = "0";
                frm.d31_der = "0";
                frm.d31_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {

                frm.d31_cen = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d31_cen = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d31_cen = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d31_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d31_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder45) {
            if (frm.opAmarillo.isSelected()) {

                frm.d31_der = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d31_der = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d31_der = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d31_der = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d31_der = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d31_der = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d31_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d31_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf45) {
            if (frm.opAmarillo.isSelected()) {

                frm.d31_inf = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d31_inf = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d31_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d31_inf = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d31_inf = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d31_inf = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d31_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d31_inf = "0";

            }
            System.out.println(frm.d31_inf);
        }
        //***********************************************************************************
        //**********************************DIENTE 32 ***************************************
        if (e.getSource() == frm.btnD1Cizq46) {
            if (frm.opAmarillo.isSelected()) {

                frm.d32_izq = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d32_izq = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d32_izq = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d32_izq = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d32_izq = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d32_izq = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d32_izq = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d32_izq = "0";

            }

        }

        //***********************
        if (e.getSource() == frm.btnD1Csup46) {
            if (frm.opAmarillo.isSelected()) {

                frm.d32_sup = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d32_sup = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d32_sup = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d32_sup = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d32_sup = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d32_sup = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d32_sup = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d32_sup = "0";

            }
        }
        //*******************

        if (e.getSource() == frm.btnD1Ccen46) {
            if (frm.opAmarillo.isSelected()) {

                frm.d32_cen = "1";

            }
            if (frm.opVerde.isSelected()) {

                frm.d32_cen = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d32_cen = "3";

            }

            if (frm.opXroja.isSelected()) {

                frm.d32_cen = "4";
                frm.d32_izq = "0";
                frm.d32_sup = "0";
                frm.d32_der = "0";
                frm.d32_inf = "0";
            }

            if (frm.opXazul.isSelected()) {

                frm.d32_cen = "5";
                frm.d32_izq = "0";
                frm.d32_sup = "0";
                frm.d32_der = "0";
                frm.d32_inf = "0";
            }
            if (frm.opNaranja.isSelected()) {

                frm.d32_cen = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d32_cen = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d32_cen = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d32_cen = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d32_cen = "0";

            }
        }

        //***************************
        if (e.getSource() == frm.btnD1Cder46) {
            if (frm.opAmarillo.isSelected()) {

                frm.d32_der = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d32_der = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d32_der = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d32_der = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d32_der = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d32_der = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d32_der = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d32_der = "0";
            }
        }
        //********************************
        if (e.getSource() == frm.btnD1Cinf46) {
            if (frm.opAmarillo.isSelected()) {

                frm.d32_inf = "1";

            }

            if (frm.opVerde.isSelected()) {

                frm.d32_inf = "2";

            }
            if (frm.opRojo.isSelected()) {

                frm.d32_inf = "3";

            }

            if (frm.opNaranja.isSelected()) {

                frm.d32_inf = "6";

            }
            if (frm.opNegro.isSelected()) {

                frm.d32_inf = "7";

            }

            if (frm.opAzul.isSelected()) {

                frm.d32_inf = "8";

            }
            if (frm.opGris.isSelected()) {

                frm.d32_inf = "9";

            }

            if (frm.opLimpiar.isSelected()) {

                frm.d32_inf = "0";

            }
            System.out.println(frm.d32_inf);
        }
        //***********************************************************************************

        //***********************************************************************************
    }

}
