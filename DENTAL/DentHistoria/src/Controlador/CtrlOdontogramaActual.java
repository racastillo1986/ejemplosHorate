package Controlador;

import Modelo.ConsultasOdontoActual;
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

public class CtrlOdontogramaActual implements ActionListener {

    private Odontograma mod;
    private ConsultasOdontoActual modc;
    private frmOdontogramaActual frm;

    public CtrlOdontogramaActual(Odontograma mod, ConsultasOdontoActual modc, frmOdontogramaActual frm) {
        this.mod = mod;
        this.modc = modc;
        this.frm = frm;
        this.frm.btnActualizarodontograma.addActionListener(this);
        this.frm.btnMostrarodontograma.addActionListener(this);

    }

    public void iniciar() {
        frm.setTitle("ODONTOGRAMA");
        frm.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //**********************************************************************************
        if (e.getSource() == frm.btnActualizarodontograma) {

            System.out.println(frm.d2_izq + frm.d2_sup + frm.d2_cen + frm.d2_der + frm.d2_inf);
            System.out.println(frm.d8_izq + frm.d8_sup + frm.d8_cen + frm.d8_der + frm.d8_inf);

            mod.setId_pac(Integer.parseInt(frm.txtid_pac.getText()));

            mod.setD1_izq(frm.d1_izq);
            mod.setD1_sup(frm.d1_sup);
            mod.setD1_cen(frm.d1_cen);
            mod.setD1_der(frm.d1_der);
            mod.setD1_inf(frm.d1_inf);

            mod.setD2_izq(frm.d2_izq);
            mod.setD2_sup(frm.d2_sup);
            mod.setD2_cen(frm.d2_cen);
            mod.setD2_der(frm.d2_der);
            mod.setD2_inf(frm.d2_inf);

            mod.setD3_izq(frm.d3_izq);
            mod.setD3_sup(frm.d3_sup);
            mod.setD3_cen(frm.d3_cen);
            mod.setD3_der(frm.d3_der);
            mod.setD3_inf(frm.d3_inf);

            mod.setD4_izq(frm.d4_izq);
            mod.setD4_sup(frm.d4_sup);
            mod.setD4_cen(frm.d4_cen);
            mod.setD4_der(frm.d4_der);
            mod.setD4_inf(frm.d4_inf);

            mod.setD5_izq(frm.d5_izq);
            mod.setD5_sup(frm.d5_sup);
            mod.setD5_cen(frm.d5_cen);
            mod.setD5_der(frm.d5_der);
            mod.setD5_inf(frm.d5_inf);

            mod.setD6_izq(frm.d6_izq);
            mod.setD6_sup(frm.d6_sup);
            mod.setD6_cen(frm.d6_cen);
            mod.setD6_der(frm.d6_der);
            mod.setD6_inf(frm.d6_inf);

            mod.setD7_izq(frm.d7_izq);
            mod.setD7_sup(frm.d7_sup);
            mod.setD7_cen(frm.d7_cen);
            mod.setD7_der(frm.d7_der);
            mod.setD7_inf(frm.d7_inf);

            mod.setD8_izq(frm.d8_izq);
            mod.setD8_sup(frm.d8_sup);
            mod.setD8_cen(frm.d8_cen);
            mod.setD8_der(frm.d8_der);
            mod.setD8_inf(frm.d8_inf);

            mod.setD9_izq(frm.d9_izq);
            mod.setD9_sup(frm.d9_sup);
            mod.setD9_cen(frm.d9_cen);
            mod.setD9_der(frm.d9_der);
            mod.setD9_inf(frm.d9_inf);

            mod.setD10_izq(frm.d10_izq);
            mod.setD10_sup(frm.d10_sup);
            mod.setD10_cen(frm.d10_cen);
            mod.setD10_der(frm.d10_der);
            mod.setD10_inf(frm.d10_inf);

            mod.setD11_izq(frm.d11_izq);
            mod.setD11_sup(frm.d11_sup);
            mod.setD11_cen(frm.d11_cen);
            mod.setD11_der(frm.d11_der);
            mod.setD11_inf(frm.d11_inf);

            mod.setD12_izq(frm.d12_izq);
            mod.setD12_sup(frm.d12_sup);
            mod.setD12_cen(frm.d12_cen);
            mod.setD12_der(frm.d12_der);
            mod.setD12_inf(frm.d12_inf);

            mod.setD13_izq(frm.d13_izq);
            mod.setD13_sup(frm.d13_sup);
            mod.setD13_cen(frm.d13_cen);
            mod.setD13_der(frm.d13_der);
            mod.setD13_inf(frm.d13_inf);

            mod.setD14_izq(frm.d14_izq);
            mod.setD14_sup(frm.d14_sup);
            mod.setD14_cen(frm.d14_cen);
            mod.setD14_der(frm.d14_der);
            mod.setD14_inf(frm.d14_inf);

            mod.setD15_izq(frm.d15_izq);
            mod.setD15_sup(frm.d15_sup);
            mod.setD15_cen(frm.d15_cen);
            mod.setD15_der(frm.d15_der);
            mod.setD15_inf(frm.d15_inf);

            mod.setD16_izq(frm.d16_izq);
            mod.setD16_sup(frm.d16_sup);
            mod.setD16_cen(frm.d16_cen);
            mod.setD16_der(frm.d16_der);
            mod.setD16_inf(frm.d16_inf);

            if (modc.actualizar(mod)) {
                //JOptionPane.showMessageDialog(null, "Registro guardado");
                System.out.println("se actualizo odontograma superior");

            } else {
                JOptionPane.showMessageDialog(null, "No se guardo");

            }

        }

        if (e.getSource() == frm.btnMostrarodontograma) {

            if ("".equals(frm.txtcedula.getText())) {
                JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR PACEINTE");

            } else {

                mod.setId_pac(Integer.parseInt(frm.txtid_pac.getText()));

                if (modc.buscar(mod)) {

                    //DIENTE 1...........................
                    //C IZQ
                    if ("1".equals(mod.getD1_izq())) {
                        frm.btnD1Cizq13.setOpaque(true);
                        frm.btnD1Cizq13.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD1_izq())) {
                        frm.btnD1Cizq13.setOpaque(true);
                        frm.btnD1Cizq13.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD1_izq())) {
                        frm.btnD1Cizq13.setOpaque(true);
                        frm.btnD1Cizq13.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD1_izq())) {
                        frm.btnD1Cizq13.setOpaque(true);
                        frm.btnD1Cizq13.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD1_izq())) {
                        frm.btnD1Cizq13.setOpaque(true);
                        frm.btnD1Cizq13.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD1_izq())) {
                        frm.btnD1Cizq13.setOpaque(true);
                        frm.btnD1Cizq13.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD1_izq())) {
                        frm.btnD1Cizq13.setOpaque(true);
                        frm.btnD1Cizq13.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD1_izq())) {
                        frm.btnD1Cizq13.setOpaque(true);
                        frm.btnD1Cizq13.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD1_sup())) {
                        frm.btnD1Csup13.setOpaque(true);
                        frm.btnD1Csup13.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD1_sup())) {
                        frm.btnD1Csup13.setOpaque(true);
                        frm.btnD1Csup13.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD1_sup())) {
                        frm.btnD1Csup13.setOpaque(true);
                        frm.btnD1Csup13.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD1_sup())) {
                        frm.btnD1Csup13.setOpaque(true);
                        frm.btnD1Csup13.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD1_sup())) {
                        frm.btnD1Csup13.setOpaque(true);
                        frm.btnD1Csup13.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD1_sup())) {
                        frm.btnD1Csup13.setOpaque(true);
                        frm.btnD1Csup13.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD1_sup())) {
                        frm.btnD1Csup13.setOpaque(true);
                        frm.btnD1Csup13.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD1_sup())) {
                        frm.btnD1Csup13.setOpaque(true);
                        frm.btnD1Csup13.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD1_cen())) {
                        frm.btnD1Ccen13.setOpaque(true);
                        frm.btnD1Ccen13.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD1_cen())) {
                        frm.btnD1Ccen13.setOpaque(true);
                        frm.btnD1Ccen13.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD1_cen())) {
                        frm.btnD1Ccen13.setOpaque(true);
                        frm.btnD1Ccen13.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD1_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen13.getWidth(), frm.btnD1Ccen13.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen13.setIcon(icono);

                    }
                    if ("5".equals(mod.getD1_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen13.getWidth(), frm.btnD1Ccen13.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen13.setIcon(icono);
                    }
                    if ("6".equals(mod.getD1_cen())) {
                        frm.btnD1Ccen13.setOpaque(true);
                        frm.btnD1Ccen13.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD1_cen())) {
                        frm.btnD1Ccen13.setOpaque(true);
                        frm.btnD1Ccen13.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD1_cen())) {
                        frm.btnD1Ccen13.setOpaque(true);
                        frm.btnD1Ccen13.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD1_cen())) {
                        frm.btnD1Ccen13.setOpaque(true);
                        frm.btnD1Ccen13.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD1_cen())) {
                        frm.btnD1Ccen13.setOpaque(true);
                        frm.btnD1Ccen13.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD1_der())) {
                        frm.btnD1Cder13.setOpaque(true);
                        frm.btnD1Cder13.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD1_der())) {
                        frm.btnD1Cder13.setOpaque(true);
                        frm.btnD1Cder13.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD1_der())) {
                        frm.btnD1Cder13.setOpaque(true);
                        frm.btnD1Cder13.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD1_der())) {
                        frm.btnD1Cder13.setOpaque(true);
                        frm.btnD1Cder13.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD1_der())) {
                        frm.btnD1Cder13.setOpaque(true);
                        frm.btnD1Cder13.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD1_der())) {
                        frm.btnD1Cder13.setOpaque(true);
                        frm.btnD1Cder13.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD1_der())) {
                        frm.btnD1Cder13.setOpaque(true);
                        frm.btnD1Cder13.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD1_der())) {
                        frm.btnD1Cder13.setOpaque(true);
                        frm.btnD1Cder13.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD1_inf())) {
                        frm.btnD1Cinf13.setOpaque(true);
                        frm.btnD1Cinf13.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD1_inf())) {
                        frm.btnD1Cinf13.setOpaque(true);
                        frm.btnD1Cinf13.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD1_inf())) {
                        frm.btnD1Cinf13.setOpaque(true);
                        frm.btnD1Cinf13.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD1_inf())) {
                        frm.btnD1Cinf13.setOpaque(true);
                        frm.btnD1Cinf13.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD1_inf())) {
                        frm.btnD1Cinf13.setOpaque(true);
                        frm.btnD1Cinf13.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD1_inf())) {
                        frm.btnD1Cinf13.setOpaque(true);
                        frm.btnD1Cinf13.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD1_inf())) {
                        frm.btnD1Cinf13.setOpaque(true);
                        frm.btnD1Cinf13.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD1_inf())) {
                        frm.btnD1Cinf13.setOpaque(true);
                        frm.btnD1Cinf13.setBackground(Color.WHITE);
                    }
                    //***********************************
                    //DIENTE 2

                    if ("1".equals(mod.getD2_izq())) {
                        frm.btnD1Cizq14.setOpaque(true);
                        frm.btnD1Cizq14.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD2_izq())) {
                        frm.btnD1Cizq14.setOpaque(true);
                        frm.btnD1Cizq14.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD2_izq())) {
                        frm.btnD1Cizq14.setOpaque(true);
                        frm.btnD1Cizq14.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD2_izq())) {
                        frm.btnD1Cizq14.setOpaque(true);
                        frm.btnD1Cizq14.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD2_izq())) {
                        frm.btnD1Cizq14.setOpaque(true);
                        frm.btnD1Cizq14.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD2_izq())) {
                        frm.btnD1Cizq14.setOpaque(true);
                        frm.btnD1Cizq14.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD2_izq())) {
                        frm.btnD1Cizq14.setOpaque(true);
                        frm.btnD1Cizq14.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD2_izq())) {
                        frm.btnD1Cizq14.setOpaque(true);
                        frm.btnD1Cizq14.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD2_sup())) {
                        frm.btnD1Csup14.setOpaque(true);
                        frm.btnD1Csup14.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD2_sup())) {
                        frm.btnD1Csup14.setOpaque(true);
                        frm.btnD1Csup14.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD2_sup())) {
                        frm.btnD1Csup14.setOpaque(true);
                        frm.btnD1Csup14.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD2_sup())) {
                        frm.btnD1Csup14.setOpaque(true);
                        frm.btnD1Csup14.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD2_sup())) {
                        frm.btnD1Csup14.setOpaque(true);
                        frm.btnD1Csup14.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD2_sup())) {
                        frm.btnD1Csup14.setOpaque(true);
                        frm.btnD1Csup14.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD2_sup())) {
                        frm.btnD1Csup14.setOpaque(true);
                        frm.btnD1Csup14.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD2_sup())) {
                        frm.btnD1Csup14.setOpaque(true);
                        frm.btnD1Csup14.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD2_cen())) {
                        frm.btnD1Ccen14.setOpaque(true);
                        frm.btnD1Ccen14.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD2_cen())) {
                        frm.btnD1Ccen14.setOpaque(true);
                        frm.btnD1Ccen14.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD2_cen())) {
                        frm.btnD1Ccen14.setOpaque(true);
                        frm.btnD1Ccen14.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD2_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen14.getWidth(), frm.btnD1Ccen14.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen14.setIcon(icono);

                    }
                    if ("5".equals(mod.getD2_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen14.getWidth(), frm.btnD1Ccen14.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen14.setIcon(icono);
                    }
                    if ("6".equals(mod.getD2_cen())) {
                        frm.btnD1Ccen14.setOpaque(true);
                        frm.btnD1Ccen14.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD2_cen())) {
                        frm.btnD1Ccen14.setOpaque(true);
                        frm.btnD1Ccen14.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD2_cen())) {
                        frm.btnD1Ccen14.setOpaque(true);
                        frm.btnD1Ccen14.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD2_cen())) {
                        frm.btnD1Ccen14.setOpaque(true);
                        frm.btnD1Ccen14.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD2_cen())) {
                        frm.btnD1Ccen14.setOpaque(true);
                        frm.btnD1Ccen14.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD2_der())) {
                        frm.btnD1Cder14.setOpaque(true);
                        frm.btnD1Cder14.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD2_der())) {
                        frm.btnD1Cder14.setOpaque(true);
                        frm.btnD1Cder14.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD2_der())) {
                        frm.btnD1Cder14.setOpaque(true);
                        frm.btnD1Cder14.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD2_der())) {
                        frm.btnD1Cder14.setOpaque(true);
                        frm.btnD1Cder14.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD2_der())) {
                        frm.btnD1Cder14.setOpaque(true);
                        frm.btnD1Cder14.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD2_der())) {
                        frm.btnD1Cder14.setOpaque(true);
                        frm.btnD1Cder14.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD2_der())) {
                        frm.btnD1Cder14.setOpaque(true);
                        frm.btnD1Cder14.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD2_der())) {
                        frm.btnD1Cder14.setOpaque(true);
                        frm.btnD1Cder14.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD2_inf())) {
                        frm.btnD1Cinf14.setOpaque(true);
                        frm.btnD1Cinf14.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD2_inf())) {
                        frm.btnD1Cinf14.setOpaque(true);
                        frm.btnD1Cinf14.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD2_inf())) {
                        frm.btnD1Cinf14.setOpaque(true);
                        frm.btnD1Cinf14.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD2_inf())) {
                        frm.btnD1Cinf14.setOpaque(true);
                        frm.btnD1Cinf14.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD2_inf())) {
                        frm.btnD1Cinf14.setOpaque(true);
                        frm.btnD1Cinf14.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD2_inf())) {
                        frm.btnD1Cinf14.setOpaque(true);
                        frm.btnD1Cinf14.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD2_inf())) {
                        frm.btnD1Cinf14.setOpaque(true);
                        frm.btnD1Cinf14.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD2_inf())) {
                        frm.btnD1Cinf14.setOpaque(true);
                        frm.btnD1Cinf14.setBackground(Color.WHITE);
                    }

                    //**********
                    //DIENTE 3
                    if ("1".equals(mod.getD3_izq())) {
                        frm.btnD1Cizq15.setOpaque(true);
                        frm.btnD1Cizq15.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD3_izq())) {
                        frm.btnD1Cizq15.setOpaque(true);
                        frm.btnD1Cizq15.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD3_izq())) {
                        frm.btnD1Cizq15.setOpaque(true);
                        frm.btnD1Cizq15.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD3_izq())) {
                        frm.btnD1Cizq15.setOpaque(true);
                        frm.btnD1Cizq15.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD3_izq())) {
                        frm.btnD1Cizq15.setOpaque(true);
                        frm.btnD1Cizq15.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD3_izq())) {
                        frm.btnD1Cizq15.setOpaque(true);
                        frm.btnD1Cizq15.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD3_izq())) {
                        frm.btnD1Cizq15.setOpaque(true);
                        frm.btnD1Cizq15.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD3_izq())) {
                        frm.btnD1Cizq15.setOpaque(true);
                        frm.btnD1Cizq15.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD3_sup())) {
                        frm.btnD1Csup15.setOpaque(true);
                        frm.btnD1Csup15.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD3_sup())) {
                        frm.btnD1Csup15.setOpaque(true);
                        frm.btnD1Csup15.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD3_sup())) {
                        frm.btnD1Csup15.setOpaque(true);
                        frm.btnD1Csup15.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD3_sup())) {
                        frm.btnD1Csup15.setOpaque(true);
                        frm.btnD1Csup15.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD3_sup())) {
                        frm.btnD1Csup15.setOpaque(true);
                        frm.btnD1Csup15.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD3_sup())) {
                        frm.btnD1Csup15.setOpaque(true);
                        frm.btnD1Csup15.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD3_sup())) {
                        frm.btnD1Csup15.setOpaque(true);
                        frm.btnD1Csup15.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD3_sup())) {
                        frm.btnD1Csup15.setOpaque(true);
                        frm.btnD1Csup15.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD3_cen())) {
                        frm.btnD1Ccen15.setOpaque(true);
                        frm.btnD1Ccen15.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD3_cen())) {
                        frm.btnD1Ccen15.setOpaque(true);
                        frm.btnD1Ccen15.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD3_cen())) {
                        frm.btnD1Ccen15.setOpaque(true);
                        frm.btnD1Ccen15.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD3_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen15.getWidth(), frm.btnD1Ccen15.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen15.setIcon(icono);

                    }
                    if ("5".equals(mod.getD3_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen15.getWidth(), frm.btnD1Ccen15.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen15.setIcon(icono);
                    }
                    if ("6".equals(mod.getD3_cen())) {
                        frm.btnD1Ccen15.setOpaque(true);
                        frm.btnD1Ccen15.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD3_cen())) {
                        frm.btnD1Ccen15.setOpaque(true);
                        frm.btnD1Ccen15.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD3_cen())) {
                        frm.btnD1Ccen15.setOpaque(true);
                        frm.btnD1Ccen15.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD3_cen())) {
                        frm.btnD1Ccen15.setOpaque(true);
                        frm.btnD1Ccen15.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD3_cen())) {
                        frm.btnD1Ccen15.setOpaque(true);
                        frm.btnD1Ccen15.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD3_der())) {
                        frm.btnD1Cder15.setOpaque(true);
                        frm.btnD1Cder15.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD3_der())) {
                        frm.btnD1Cder15.setOpaque(true);
                        frm.btnD1Cder15.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD3_der())) {
                        frm.btnD1Cder15.setOpaque(true);
                        frm.btnD1Cder15.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD3_der())) {
                        frm.btnD1Cder15.setOpaque(true);
                        frm.btnD1Cder15.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD3_der())) {
                        frm.btnD1Cder15.setOpaque(true);
                        frm.btnD1Cder15.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD3_der())) {
                        frm.btnD1Cder15.setOpaque(true);
                        frm.btnD1Cder15.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD3_der())) {
                        frm.btnD1Cder15.setOpaque(true);
                        frm.btnD1Cder15.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD3_der())) {
                        frm.btnD1Cder15.setOpaque(true);
                        frm.btnD1Cder15.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD3_inf())) {
                        frm.btnD1Cinf15.setOpaque(true);
                        frm.btnD1Cinf15.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD3_inf())) {
                        frm.btnD1Cinf15.setOpaque(true);
                        frm.btnD1Cinf15.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD3_inf())) {
                        frm.btnD1Cinf15.setOpaque(true);
                        frm.btnD1Cinf15.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD3_inf())) {
                        frm.btnD1Cinf15.setOpaque(true);
                        frm.btnD1Cinf15.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD3_inf())) {
                        frm.btnD1Cinf15.setOpaque(true);
                        frm.btnD1Cinf15.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD3_inf())) {
                        frm.btnD1Cinf15.setOpaque(true);
                        frm.btnD1Cinf15.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD3_inf())) {
                        frm.btnD1Cinf15.setOpaque(true);
                        frm.btnD1Cinf15.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD3_inf())) {
                        frm.btnD1Cinf15.setOpaque(true);
                        frm.btnD1Cinf15.setBackground(Color.WHITE);
                    }

                    //**********
                    //DIENTE 4**********************************
                    //**********
                    //
                    if ("1".equals(mod.getD4_izq())) {
                        frm.btnD1Cizq16.setOpaque(true);
                        frm.btnD1Cizq16.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD4_izq())) {
                        frm.btnD1Cizq16.setOpaque(true);
                        frm.btnD1Cizq16.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD4_izq())) {
                        frm.btnD1Cizq16.setOpaque(true);
                        frm.btnD1Cizq16.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD4_izq())) {
                        frm.btnD1Cizq16.setOpaque(true);
                        frm.btnD1Cizq16.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD4_izq())) {
                        frm.btnD1Cizq16.setOpaque(true);
                        frm.btnD1Cizq16.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD4_izq())) {
                        frm.btnD1Cizq16.setOpaque(true);
                        frm.btnD1Cizq16.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD4_izq())) {
                        frm.btnD1Cizq16.setOpaque(true);
                        frm.btnD1Cizq16.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD4_izq())) {
                        frm.btnD1Cizq16.setOpaque(true);
                        frm.btnD1Cizq16.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD4_sup())) {
                        frm.btnD1Csup16.setOpaque(true);
                        frm.btnD1Csup16.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD4_sup())) {
                        frm.btnD1Csup16.setOpaque(true);
                        frm.btnD1Csup16.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD4_sup())) {
                        frm.btnD1Csup16.setOpaque(true);
                        frm.btnD1Csup16.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD4_sup())) {
                        frm.btnD1Csup16.setOpaque(true);
                        frm.btnD1Csup16.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD4_sup())) {
                        frm.btnD1Csup16.setOpaque(true);
                        frm.btnD1Csup16.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD4_sup())) {
                        frm.btnD1Csup16.setOpaque(true);
                        frm.btnD1Csup16.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD4_sup())) {
                        frm.btnD1Csup16.setOpaque(true);
                        frm.btnD1Csup16.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD4_sup())) {
                        frm.btnD1Csup16.setOpaque(true);
                        frm.btnD1Csup16.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD4_cen())) {
                        frm.btnD1Ccen16.setOpaque(true);
                        frm.btnD1Ccen16.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD4_cen())) {
                        frm.btnD1Ccen16.setOpaque(true);
                        frm.btnD1Ccen16.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD4_cen())) {
                        frm.btnD1Ccen16.setOpaque(true);
                        frm.btnD1Ccen16.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD4_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen16.getWidth(), frm.btnD1Ccen16.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen16.setIcon(icono);

                    }
                    if ("5".equals(mod.getD4_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen16.getWidth(), frm.btnD1Ccen16.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen16.setIcon(icono);
                    }
                    if ("6".equals(mod.getD4_cen())) {
                        frm.btnD1Ccen16.setOpaque(true);
                        frm.btnD1Ccen16.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD4_cen())) {
                        frm.btnD1Ccen16.setOpaque(true);
                        frm.btnD1Ccen16.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD4_cen())) {
                        frm.btnD1Ccen16.setOpaque(true);
                        frm.btnD1Ccen16.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD4_cen())) {
                        frm.btnD1Ccen16.setOpaque(true);
                        frm.btnD1Ccen16.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD4_cen())) {
                        frm.btnD1Ccen16.setOpaque(true);
                        frm.btnD1Ccen16.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD4_der())) {
                        frm.btnD1Cder16.setOpaque(true);
                        frm.btnD1Cder16.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD4_der())) {
                        frm.btnD1Cder16.setOpaque(true);
                        frm.btnD1Cder16.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD4_der())) {
                        frm.btnD1Cder16.setOpaque(true);
                        frm.btnD1Cder16.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD4_der())) {
                        frm.btnD1Cder16.setOpaque(true);
                        frm.btnD1Cder16.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD4_der())) {
                        frm.btnD1Cder16.setOpaque(true);
                        frm.btnD1Cder16.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD4_der())) {
                        frm.btnD1Cder16.setOpaque(true);
                        frm.btnD1Cder16.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD4_der())) {
                        frm.btnD1Cder16.setOpaque(true);
                        frm.btnD1Cder16.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD4_der())) {
                        frm.btnD1Cder16.setOpaque(true);
                        frm.btnD1Cder16.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD4_inf())) {
                        frm.btnD1Cinf16.setOpaque(true);
                        frm.btnD1Cinf16.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD4_inf())) {
                        frm.btnD1Cinf16.setOpaque(true);
                        frm.btnD1Cinf16.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD4_inf())) {
                        frm.btnD1Cinf16.setOpaque(true);
                        frm.btnD1Cinf16.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD4_inf())) {
                        frm.btnD1Cinf16.setOpaque(true);
                        frm.btnD1Cinf16.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD4_inf())) {
                        frm.btnD1Cinf16.setOpaque(true);
                        frm.btnD1Cinf16.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD4_inf())) {
                        frm.btnD1Cinf16.setOpaque(true);
                        frm.btnD1Cinf16.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD4_inf())) {
                        frm.btnD1Cinf16.setOpaque(true);
                        frm.btnD1Cinf16.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD4_inf())) {
                        frm.btnD1Cinf16.setOpaque(true);
                        frm.btnD1Cinf16.setBackground(Color.WHITE);
                    }

                    //*********************DIENTE 5 ************************************** DIENTE 5
                    //**********
                    //
                    if ("1".equals(mod.getD5_izq())) {
                        frm.btnD1Cizq17.setOpaque(true);
                        frm.btnD1Cizq17.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD5_izq())) {
                        frm.btnD1Cizq17.setOpaque(true);
                        frm.btnD1Cizq17.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD5_izq())) {
                        frm.btnD1Cizq17.setOpaque(true);
                        frm.btnD1Cizq17.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD5_izq())) {
                        frm.btnD1Cizq17.setOpaque(true);
                        frm.btnD1Cizq17.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD5_izq())) {
                        frm.btnD1Cizq17.setOpaque(true);
                        frm.btnD1Cizq17.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD5_izq())) {
                        frm.btnD1Cizq17.setOpaque(true);
                        frm.btnD1Cizq17.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD5_izq())) {
                        frm.btnD1Cizq17.setOpaque(true);
                        frm.btnD1Cizq17.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD5_izq())) {
                        frm.btnD1Cizq17.setOpaque(true);
                        frm.btnD1Cizq17.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD5_sup())) {
                        frm.btnD1Csup17.setOpaque(true);
                        frm.btnD1Csup17.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD5_sup())) {
                        frm.btnD1Csup17.setOpaque(true);
                        frm.btnD1Csup17.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD5_sup())) {
                        frm.btnD1Csup17.setOpaque(true);
                        frm.btnD1Csup17.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD5_sup())) {
                        frm.btnD1Csup17.setOpaque(true);
                        frm.btnD1Csup17.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD5_sup())) {
                        frm.btnD1Csup17.setOpaque(true);
                        frm.btnD1Csup17.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD5_sup())) {
                        frm.btnD1Csup17.setOpaque(true);
                        frm.btnD1Csup17.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD5_sup())) {
                        frm.btnD1Csup17.setOpaque(true);
                        frm.btnD1Csup17.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD5_sup())) {
                        frm.btnD1Csup17.setOpaque(true);
                        frm.btnD1Csup17.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD5_cen())) {
                        frm.btnD1Ccen17.setOpaque(true);
                        frm.btnD1Ccen17.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD5_cen())) {
                        frm.btnD1Ccen17.setOpaque(true);
                        frm.btnD1Ccen17.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD5_cen())) {
                        frm.btnD1Ccen17.setOpaque(true);
                        frm.btnD1Ccen17.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD5_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen17.getWidth(), frm.btnD1Ccen17.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen17.setIcon(icono);

                    }
                    if ("5".equals(mod.getD5_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen17.getWidth(), frm.btnD1Ccen17.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen17.setIcon(icono);
                    }
                    if ("6".equals(mod.getD5_cen())) {
                        frm.btnD1Ccen17.setOpaque(true);
                        frm.btnD1Ccen17.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD5_cen())) {
                        frm.btnD1Ccen17.setOpaque(true);
                        frm.btnD1Ccen17.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD5_cen())) {
                        frm.btnD1Ccen17.setOpaque(true);
                        frm.btnD1Ccen17.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD5_cen())) {
                        frm.btnD1Ccen17.setOpaque(true);
                        frm.btnD1Ccen17.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD5_cen())) {
                        frm.btnD1Ccen17.setOpaque(true);
                        frm.btnD1Ccen17.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD5_der())) {
                        frm.btnD1Cder17.setOpaque(true);
                        frm.btnD1Cder17.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD5_der())) {
                        frm.btnD1Cder17.setOpaque(true);
                        frm.btnD1Cder17.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD5_der())) {
                        frm.btnD1Cder17.setOpaque(true);
                        frm.btnD1Cder17.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD5_der())) {
                        frm.btnD1Cder17.setOpaque(true);
                        frm.btnD1Cder17.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD5_der())) {
                        frm.btnD1Cder17.setOpaque(true);
                        frm.btnD1Cder17.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD5_der())) {
                        frm.btnD1Cder17.setOpaque(true);
                        frm.btnD1Cder17.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD5_der())) {
                        frm.btnD1Cder17.setOpaque(true);
                        frm.btnD1Cder17.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD5_der())) {
                        frm.btnD1Cder17.setOpaque(true);
                        frm.btnD1Cder17.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD5_inf())) {
                        frm.btnD1Cinf17.setOpaque(true);
                        frm.btnD1Cinf17.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD5_inf())) {
                        frm.btnD1Cinf17.setOpaque(true);
                        frm.btnD1Cinf17.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD5_inf())) {
                        frm.btnD1Cinf17.setOpaque(true);
                        frm.btnD1Cinf17.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD5_inf())) {
                        frm.btnD1Cinf17.setOpaque(true);
                        frm.btnD1Cinf17.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD5_inf())) {
                        frm.btnD1Cinf17.setOpaque(true);
                        frm.btnD1Cinf17.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD5_inf())) {
                        frm.btnD1Cinf17.setOpaque(true);
                        frm.btnD1Cinf17.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD5_inf())) {
                        frm.btnD1Cinf17.setOpaque(true);
                        frm.btnD1Cinf17.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD5_inf())) {
                        frm.btnD1Cinf17.setOpaque(true);
                        frm.btnD1Cinf17.setBackground(Color.WHITE);
                    }

                    //*****************
                    //*******************************DIENTE 6**********************************
                    //**********
                    //
                    if ("1".equals(mod.getD6_izq())) {
                        frm.btnD1Cizq18.setOpaque(true);
                        frm.btnD1Cizq18.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD6_izq())) {
                        frm.btnD1Cizq18.setOpaque(true);
                        frm.btnD1Cizq18.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD6_izq())) {
                        frm.btnD1Cizq18.setOpaque(true);
                        frm.btnD1Cizq18.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD6_izq())) {
                        frm.btnD1Cizq18.setOpaque(true);
                        frm.btnD1Cizq18.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD6_izq())) {
                        frm.btnD1Cizq18.setOpaque(true);
                        frm.btnD1Cizq18.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD6_izq())) {
                        frm.btnD1Cizq18.setOpaque(true);
                        frm.btnD1Cizq18.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD6_izq())) {
                        frm.btnD1Cizq18.setOpaque(true);
                        frm.btnD1Cizq18.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD6_izq())) {
                        frm.btnD1Cizq18.setOpaque(true);
                        frm.btnD1Cizq18.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD6_sup())) {
                        frm.btnD1Csup18.setOpaque(true);
                        frm.btnD1Csup18.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD6_sup())) {
                        frm.btnD1Csup18.setOpaque(true);
                        frm.btnD1Csup18.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD6_sup())) {
                        frm.btnD1Csup18.setOpaque(true);
                        frm.btnD1Csup18.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD6_sup())) {
                        frm.btnD1Csup18.setOpaque(true);
                        frm.btnD1Csup18.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD6_sup())) {
                        frm.btnD1Csup18.setOpaque(true);
                        frm.btnD1Csup18.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD6_sup())) {
                        frm.btnD1Csup18.setOpaque(true);
                        frm.btnD1Csup18.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD6_sup())) {
                        frm.btnD1Csup18.setOpaque(true);
                        frm.btnD1Csup18.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD6_sup())) {
                        frm.btnD1Csup18.setOpaque(true);
                        frm.btnD1Csup18.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD6_cen())) {
                        frm.btnD1Ccen18.setOpaque(true);
                        frm.btnD1Ccen18.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD6_cen())) {
                        frm.btnD1Ccen18.setOpaque(true);
                        frm.btnD1Ccen18.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD6_cen())) {
                        frm.btnD1Ccen18.setOpaque(true);
                        frm.btnD1Ccen18.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD6_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen18.getWidth(), frm.btnD1Ccen18.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen18.setIcon(icono);

                    }
                    if ("5".equals(mod.getD6_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen18.getWidth(), frm.btnD1Ccen18.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen18.setIcon(icono);
                    }
                    if ("6".equals(mod.getD6_cen())) {
                        frm.btnD1Ccen18.setOpaque(true);
                        frm.btnD1Ccen18.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD6_cen())) {
                        frm.btnD1Ccen18.setOpaque(true);
                        frm.btnD1Ccen18.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD6_cen())) {
                        frm.btnD1Ccen18.setOpaque(true);
                        frm.btnD1Ccen18.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD6_cen())) {
                        frm.btnD1Ccen18.setOpaque(true);
                        frm.btnD1Ccen18.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD6_cen())) {
                        frm.btnD1Ccen18.setOpaque(true);
                        frm.btnD1Ccen18.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD6_der())) {
                        frm.btnD1Cder18.setOpaque(true);
                        frm.btnD1Cder18.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD6_der())) {
                        frm.btnD1Cder18.setOpaque(true);
                        frm.btnD1Cder18.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD6_der())) {
                        frm.btnD1Cder18.setOpaque(true);
                        frm.btnD1Cder18.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD6_der())) {
                        frm.btnD1Cder18.setOpaque(true);
                        frm.btnD1Cder18.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD6_der())) {
                        frm.btnD1Cder18.setOpaque(true);
                        frm.btnD1Cder18.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD6_der())) {
                        frm.btnD1Cder18.setOpaque(true);
                        frm.btnD1Cder18.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD6_der())) {
                        frm.btnD1Cder18.setOpaque(true);
                        frm.btnD1Cder18.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD6_der())) {
                        frm.btnD1Cder18.setOpaque(true);
                        frm.btnD1Cder18.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD6_inf())) {
                        frm.btnD1Cinf18.setOpaque(true);
                        frm.btnD1Cinf18.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD6_inf())) {
                        frm.btnD1Cinf18.setOpaque(true);
                        frm.btnD1Cinf18.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD6_inf())) {
                        frm.btnD1Cinf18.setOpaque(true);
                        frm.btnD1Cinf18.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD6_inf())) {
                        frm.btnD1Cinf18.setOpaque(true);
                        frm.btnD1Cinf18.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD6_inf())) {
                        frm.btnD1Cinf18.setOpaque(true);
                        frm.btnD1Cinf18.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD6_inf())) {
                        frm.btnD1Cinf18.setOpaque(true);
                        frm.btnD1Cinf18.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD6_inf())) {
                        frm.btnD1Cinf18.setOpaque(true);
                        frm.btnD1Cinf18.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD6_inf())) {
                        frm.btnD1Cinf18.setOpaque(true);
                        frm.btnD1Cinf18.setBackground(Color.WHITE);
                    }

                    //*****************
                    //**********************************DIENTE 7
                    //**********
                    //
                    if ("1".equals(mod.getD7_izq())) {
                        frm.btnD1Cizq19.setOpaque(true);
                        frm.btnD1Cizq19.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD7_izq())) {
                        frm.btnD1Cizq19.setOpaque(true);
                        frm.btnD1Cizq19.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD7_izq())) {
                        frm.btnD1Cizq19.setOpaque(true);
                        frm.btnD1Cizq19.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD7_izq())) {
                        frm.btnD1Cizq19.setOpaque(true);
                        frm.btnD1Cizq19.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD7_izq())) {
                        frm.btnD1Cizq19.setOpaque(true);
                        frm.btnD1Cizq19.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD7_izq())) {
                        frm.btnD1Cizq19.setOpaque(true);
                        frm.btnD1Cizq19.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD7_izq())) {
                        frm.btnD1Cizq19.setOpaque(true);
                        frm.btnD1Cizq19.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD7_izq())) {
                        frm.btnD1Cizq19.setOpaque(true);
                        frm.btnD1Cizq19.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD7_sup())) {
                        frm.btnD1Csup19.setOpaque(true);
                        frm.btnD1Csup19.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD7_sup())) {
                        frm.btnD1Csup19.setOpaque(true);
                        frm.btnD1Csup19.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD7_sup())) {
                        frm.btnD1Csup19.setOpaque(true);
                        frm.btnD1Csup19.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD7_sup())) {
                        frm.btnD1Csup19.setOpaque(true);
                        frm.btnD1Csup19.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD7_sup())) {
                        frm.btnD1Csup19.setOpaque(true);
                        frm.btnD1Csup19.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD7_sup())) {
                        frm.btnD1Csup19.setOpaque(true);
                        frm.btnD1Csup19.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD7_sup())) {
                        frm.btnD1Csup19.setOpaque(true);
                        frm.btnD1Csup19.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD7_sup())) {
                        frm.btnD1Csup19.setOpaque(true);
                        frm.btnD1Csup19.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD7_cen())) {
                        frm.btnD1Ccen19.setOpaque(true);
                        frm.btnD1Ccen19.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD7_cen())) {
                        frm.btnD1Ccen19.setOpaque(true);
                        frm.btnD1Ccen19.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD7_cen())) {
                        frm.btnD1Ccen19.setOpaque(true);
                        frm.btnD1Ccen19.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD7_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen19.getWidth(), frm.btnD1Ccen19.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen19.setIcon(icono);

                    }
                    if ("5".equals(mod.getD7_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen19.getWidth(), frm.btnD1Ccen19.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen19.setIcon(icono);
                    }
                    if ("6".equals(mod.getD7_cen())) {
                        frm.btnD1Ccen19.setOpaque(true);
                        frm.btnD1Ccen19.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD7_cen())) {
                        frm.btnD1Ccen19.setOpaque(true);
                        frm.btnD1Ccen19.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD7_cen())) {
                        frm.btnD1Ccen19.setOpaque(true);
                        frm.btnD1Ccen19.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD7_cen())) {
                        frm.btnD1Ccen19.setOpaque(true);
                        frm.btnD1Ccen19.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD7_cen())) {
                        frm.btnD1Ccen19.setOpaque(true);
                        frm.btnD1Ccen19.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD7_der())) {
                        frm.btnD1Cder19.setOpaque(true);
                        frm.btnD1Cder19.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD7_der())) {
                        frm.btnD1Cder19.setOpaque(true);
                        frm.btnD1Cder19.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD7_der())) {
                        frm.btnD1Cder19.setOpaque(true);
                        frm.btnD1Cder19.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD7_der())) {
                        frm.btnD1Cder19.setOpaque(true);
                        frm.btnD1Cder19.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD7_der())) {
                        frm.btnD1Cder19.setOpaque(true);
                        frm.btnD1Cder19.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD7_der())) {
                        frm.btnD1Cder19.setOpaque(true);
                        frm.btnD1Cder19.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD7_der())) {
                        frm.btnD1Cder19.setOpaque(true);
                        frm.btnD1Cder19.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD7_der())) {
                        frm.btnD1Cder19.setOpaque(true);
                        frm.btnD1Cder19.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD7_inf())) {
                        frm.btnD1Cinf19.setOpaque(true);
                        frm.btnD1Cinf19.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD7_inf())) {
                        frm.btnD1Cinf19.setOpaque(true);
                        frm.btnD1Cinf19.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD7_inf())) {
                        frm.btnD1Cinf19.setOpaque(true);
                        frm.btnD1Cinf19.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD7_inf())) {
                        frm.btnD1Cinf19.setOpaque(true);
                        frm.btnD1Cinf19.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD7_inf())) {
                        frm.btnD1Cinf19.setOpaque(true);
                        frm.btnD1Cinf19.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD7_inf())) {
                        frm.btnD1Cinf19.setOpaque(true);
                        frm.btnD1Cinf19.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD7_inf())) {
                        frm.btnD1Cinf19.setOpaque(true);
                        frm.btnD1Cinf19.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD7_inf())) {
                        frm.btnD1Cinf19.setOpaque(true);
                        frm.btnD1Cinf19.setBackground(Color.WHITE);
                    }

                    //*****************
                    //**********************************DIENTE 8
                    //**********
                    //
                    if ("1".equals(mod.getD8_izq())) {
                        frm.btnD1Cizq20.setOpaque(true);
                        frm.btnD1Cizq20.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD8_izq())) {
                        frm.btnD1Cizq20.setOpaque(true);
                        frm.btnD1Cizq20.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD8_izq())) {
                        frm.btnD1Cizq20.setOpaque(true);
                        frm.btnD1Cizq20.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD8_izq())) {
                        frm.btnD1Cizq20.setOpaque(true);
                        frm.btnD1Cizq20.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD8_izq())) {
                        frm.btnD1Cizq20.setOpaque(true);
                        frm.btnD1Cizq20.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD8_izq())) {
                        frm.btnD1Cizq20.setOpaque(true);
                        frm.btnD1Cizq20.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD8_izq())) {
                        frm.btnD1Cizq20.setOpaque(true);
                        frm.btnD1Cizq20.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD8_izq())) {
                        frm.btnD1Cizq20.setOpaque(true);
                        frm.btnD1Cizq20.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD8_sup())) {
                        frm.btnD1Csup20.setOpaque(true);
                        frm.btnD1Csup20.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD8_sup())) {
                        frm.btnD1Csup20.setOpaque(true);
                        frm.btnD1Csup20.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD8_sup())) {
                        frm.btnD1Csup20.setOpaque(true);
                        frm.btnD1Csup20.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD8_sup())) {
                        frm.btnD1Csup20.setOpaque(true);
                        frm.btnD1Csup20.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD8_sup())) {
                        frm.btnD1Csup20.setOpaque(true);
                        frm.btnD1Csup20.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD8_sup())) {
                        frm.btnD1Csup20.setOpaque(true);
                        frm.btnD1Csup20.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD8_sup())) {
                        frm.btnD1Csup20.setOpaque(true);
                        frm.btnD1Csup20.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD8_sup())) {
                        frm.btnD1Csup20.setOpaque(true);
                        frm.btnD1Csup20.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD8_cen())) {
                        frm.btnD1Ccen20.setOpaque(true);
                        frm.btnD1Ccen20.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD8_cen())) {
                        frm.btnD1Ccen20.setOpaque(true);
                        frm.btnD1Ccen20.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD8_cen())) {
                        frm.btnD1Ccen20.setOpaque(true);
                        frm.btnD1Ccen20.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD8_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen20.getWidth(), frm.btnD1Ccen20.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen20.setIcon(icono);

                    }
                    if ("5".equals(mod.getD8_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen20.getWidth(), frm.btnD1Ccen20.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen20.setIcon(icono);
                    }
                    if ("6".equals(mod.getD8_cen())) {
                        frm.btnD1Ccen20.setOpaque(true);
                        frm.btnD1Ccen20.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD8_cen())) {
                        frm.btnD1Ccen20.setOpaque(true);
                        frm.btnD1Ccen20.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD8_cen())) {
                        frm.btnD1Ccen20.setOpaque(true);
                        frm.btnD1Ccen20.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD8_cen())) {
                        frm.btnD1Ccen20.setOpaque(true);
                        frm.btnD1Ccen20.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD8_cen())) {
                        frm.btnD1Ccen20.setOpaque(true);
                        frm.btnD1Ccen20.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD8_der())) {
                        frm.btnD1Cder20.setOpaque(true);
                        frm.btnD1Cder20.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD8_der())) {
                        frm.btnD1Cder20.setOpaque(true);
                        frm.btnD1Cder20.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD8_der())) {
                        frm.btnD1Cder20.setOpaque(true);
                        frm.btnD1Cder20.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD8_der())) {
                        frm.btnD1Cder20.setOpaque(true);
                        frm.btnD1Cder20.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD8_der())) {
                        frm.btnD1Cder20.setOpaque(true);
                        frm.btnD1Cder20.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD8_der())) {
                        frm.btnD1Cder20.setOpaque(true);
                        frm.btnD1Cder20.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD8_der())) {
                        frm.btnD1Cder20.setOpaque(true);
                        frm.btnD1Cder20.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD8_der())) {
                        frm.btnD1Cder20.setOpaque(true);
                        frm.btnD1Cder20.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD8_inf())) {
                        frm.btnD1Cinf20.setOpaque(true);
                        frm.btnD1Cinf20.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD8_inf())) {
                        frm.btnD1Cinf20.setOpaque(true);
                        frm.btnD1Cinf20.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD8_inf())) {
                        frm.btnD1Cinf20.setOpaque(true);
                        frm.btnD1Cinf20.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD8_inf())) {
                        frm.btnD1Cinf20.setOpaque(true);
                        frm.btnD1Cinf20.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD8_inf())) {
                        frm.btnD1Cinf20.setOpaque(true);
                        frm.btnD1Cinf20.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD8_inf())) {
                        frm.btnD1Cinf20.setOpaque(true);
                        frm.btnD1Cinf20.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD8_inf())) {
                        frm.btnD1Cinf20.setOpaque(true);
                        frm.btnD1Cinf20.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD8_inf())) {
                        frm.btnD1Cinf20.setOpaque(true);
                        frm.btnD1Cinf20.setBackground(Color.WHITE);
                    }

                    //*****************
                    //************************** DIENTE 9
                    if ("1".equals(mod.getD9_izq())) {
                        frm.btnD21Cizq.setOpaque(true);
                        frm.btnD21Cizq.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD9_izq())) {
                        frm.btnD21Cizq.setOpaque(true);
                        frm.btnD21Cizq.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD9_izq())) {
                        frm.btnD21Cizq.setOpaque(true);
                        frm.btnD21Cizq.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD9_izq())) {
                        frm.btnD21Cizq.setOpaque(true);
                        frm.btnD21Cizq.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD9_izq())) {
                        frm.btnD21Cizq.setOpaque(true);
                        frm.btnD21Cizq.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD9_izq())) {
                        frm.btnD21Cizq.setOpaque(true);
                        frm.btnD21Cizq.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD9_izq())) {
                        frm.btnD21Cizq.setOpaque(true);
                        frm.btnD1Cizq20.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD9_izq())) {
                        frm.btnD21Cizq.setOpaque(true);
                        frm.btnD21Cizq.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD9_sup())) {
                        frm.btnD21Csup.setOpaque(true);
                        frm.btnD21Csup.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD9_sup())) {
                        frm.btnD21Csup.setOpaque(true);
                        frm.btnD21Csup.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD9_sup())) {
                        frm.btnD21Csup.setOpaque(true);
                        frm.btnD21Csup.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD9_sup())) {
                        frm.btnD21Csup.setOpaque(true);
                        frm.btnD21Csup.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD9_sup())) {
                        frm.btnD21Csup.setOpaque(true);
                        frm.btnD21Csup.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD9_sup())) {
                        frm.btnD21Csup.setOpaque(true);
                        frm.btnD21Csup.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD9_sup())) {
                        frm.btnD21Csup.setOpaque(true);
                        frm.btnD21Csup.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD9_sup())) {
                        frm.btnD21Csup.setOpaque(true);
                        frm.btnD21Csup.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD9_cen())) {
                        frm.btnD21Ccen.setOpaque(true);
                        frm.btnD21Ccen.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD9_cen())) {
                        frm.btnD21Ccen.setOpaque(true);
                        frm.btnD21Ccen.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD9_cen())) {
                        frm.btnD21Ccen.setOpaque(true);
                        frm.btnD21Ccen.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD9_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD21Ccen.getWidth(), frm.btnD21Ccen.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD21Ccen.setIcon(icono);

                    }
                    if ("5".equals(mod.getD9_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD21Ccen.getWidth(), frm.btnD21Ccen.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD21Ccen.setIcon(icono);
                    }
                    if ("6".equals(mod.getD9_cen())) {
                        frm.btnD21Ccen.setOpaque(true);
                        frm.btnD21Ccen.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD9_cen())) {
                        frm.btnD21Ccen.setOpaque(true);
                        frm.btnD21Ccen.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD9_cen())) {
                        frm.btnD21Ccen.setOpaque(true);
                        frm.btnD21Ccen.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD9_cen())) {
                        frm.btnD21Ccen.setOpaque(true);
                        frm.btnD21Ccen.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD9_cen())) {
                        frm.btnD21Ccen.setOpaque(true);
                        frm.btnD21Ccen.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD9_der())) {
                        frm.btnD21Cder.setOpaque(true);
                        frm.btnD21Cder.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD9_der())) {
                        frm.btnD21Cder.setOpaque(true);
                        frm.btnD21Cder.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD9_der())) {
                        frm.btnD21Cder.setOpaque(true);
                        frm.btnD21Cder.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD9_der())) {
                        frm.btnD21Cder.setOpaque(true);
                        frm.btnD21Cder.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD9_der())) {
                        frm.btnD21Cder.setOpaque(true);
                        frm.btnD21Cder.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD9_der())) {
                        frm.btnD21Cder.setOpaque(true);
                        frm.btnD21Cder.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD9_der())) {
                        frm.btnD21Cder.setOpaque(true);
                        frm.btnD21Cder.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD9_der())) {
                        frm.btnD21Cder.setOpaque(true);
                        frm.btnD21Cder.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD9_inf())) {
                        frm.btnD21Cinf.setOpaque(true);
                        frm.btnD21Cinf.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD9_inf())) {
                        frm.btnD21Cinf.setOpaque(true);
                        frm.btnD21Cinf.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD9_inf())) {
                        frm.btnD21Cinf.setOpaque(true);
                        frm.btnD21Cinf.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD9_inf())) {
                        frm.btnD21Cinf.setOpaque(true);
                        frm.btnD21Cinf.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD9_inf())) {
                        frm.btnD21Cinf.setOpaque(true);
                        frm.btnD21Cinf.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD9_inf())) {
                        frm.btnD21Cinf.setOpaque(true);
                        frm.btnD21Cinf.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD9_inf())) {
                        frm.btnD21Cinf.setOpaque(true);
                        frm.btnD21Cinf.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD9_inf())) {
                        frm.btnD21Cinf.setOpaque(true);
                        frm.btnD21Cinf.setBackground(Color.WHITE);
                    }

                    //*****************
                    //****************************************DIENTE 10*******************************************
                    if ("1".equals(mod.getD10_izq())) {
                        frm.btnD22Cizq.setOpaque(true);
                        frm.btnD22Cizq.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD10_izq())) {
                        frm.btnD22Cizq.setOpaque(true);
                        frm.btnD22Cizq.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD10_izq())) {
                        frm.btnD22Cizq.setOpaque(true);
                        frm.btnD22Cizq.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD10_izq())) {
                        frm.btnD22Cizq.setOpaque(true);
                        frm.btnD22Cizq.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD10_izq())) {
                        frm.btnD22Cizq.setOpaque(true);
                        frm.btnD22Cizq.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD10_izq())) {
                        frm.btnD22Cizq.setOpaque(true);
                        frm.btnD22Cizq.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD10_izq())) {
                        frm.btnD22Cizq.setOpaque(true);
                        frm.btnD22Cizq.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD10_izq())) {
                        frm.btnD22Cizq.setOpaque(true);
                        frm.btnD22Cizq.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD10_sup())) {
                        frm.btnD22Csup.setOpaque(true);
                        frm.btnD22Csup.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD10_sup())) {
                        frm.btnD22Csup.setOpaque(true);
                        frm.btnD22Csup.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD10_sup())) {
                        frm.btnD22Csup.setOpaque(true);
                        frm.btnD22Csup.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD10_sup())) {
                        frm.btnD22Csup.setOpaque(true);
                        frm.btnD22Csup.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD10_sup())) {
                        frm.btnD22Csup.setOpaque(true);
                        frm.btnD22Csup.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD10_sup())) {
                        frm.btnD22Csup.setOpaque(true);
                        frm.btnD22Csup.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD10_sup())) {
                        frm.btnD22Csup.setOpaque(true);
                        frm.btnD22Csup.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD10_sup())) {
                        frm.btnD22Csup.setOpaque(true);
                        frm.btnD22Csup.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD10_cen())) {
                        frm.btnD22Ccen.setOpaque(true);
                        frm.btnD22Ccen.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD10_cen())) {
                        frm.btnD22Ccen.setOpaque(true);
                        frm.btnD22Ccen.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD10_cen())) {
                        frm.btnD22Ccen.setOpaque(true);
                        frm.btnD22Ccen.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD10_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD22Ccen.getWidth(), frm.btnD22Ccen.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD22Ccen.setIcon(icono);

                    }
                    if ("5".equals(mod.getD10_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD22Ccen.getWidth(), frm.btnD22Ccen.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD22Ccen.setIcon(icono);
                    }
                    if ("6".equals(mod.getD10_cen())) {
                        frm.btnD22Ccen.setOpaque(true);
                        frm.btnD22Ccen.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD10_cen())) {
                        frm.btnD22Ccen.setOpaque(true);
                        frm.btnD22Ccen.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD10_cen())) {
                        frm.btnD22Ccen.setOpaque(true);
                        frm.btnD22Ccen.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD10_cen())) {
                        frm.btnD22Ccen.setOpaque(true);
                        frm.btnD22Ccen.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD10_cen())) {
                        frm.btnD22Ccen.setOpaque(true);
                        frm.btnD22Ccen.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD10_der())) {
                        frm.btnD22Cder.setOpaque(true);
                        frm.btnD22Cder.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD10_der())) {
                        frm.btnD22Cder.setOpaque(true);
                        frm.btnD22Cder.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD10_der())) {
                        frm.btnD22Cder.setOpaque(true);
                        frm.btnD22Cder.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD10_der())) {
                        frm.btnD22Cder.setOpaque(true);
                        frm.btnD22Cder.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD10_der())) {
                        frm.btnD22Cder.setOpaque(true);
                        frm.btnD22Cder.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD10_der())) {
                        frm.btnD22Cder.setOpaque(true);
                        frm.btnD22Cder.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD10_der())) {
                        frm.btnD22Cder.setOpaque(true);
                        frm.btnD22Cder.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD10_der())) {
                        frm.btnD22Cder.setOpaque(true);
                        frm.btnD22Cder.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD10_inf())) {
                        frm.btnD22Cinf.setOpaque(true);
                        frm.btnD22Cinf.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD10_inf())) {
                        frm.btnD22Cinf.setOpaque(true);
                        frm.btnD22Cinf.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD10_inf())) {
                        frm.btnD22Cinf.setOpaque(true);
                        frm.btnD22Cinf.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD10_inf())) {
                        frm.btnD22Cinf.setOpaque(true);
                        frm.btnD22Cinf.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD10_inf())) {
                        frm.btnD22Cinf.setOpaque(true);
                        frm.btnD22Cinf.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD10_inf())) {
                        frm.btnD22Cinf.setOpaque(true);
                        frm.btnD22Cinf.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD10_inf())) {
                        frm.btnD22Cinf.setOpaque(true);
                        frm.btnD22Cinf.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD10_inf())) {
                        frm.btnD22Cinf.setOpaque(true);
                        frm.btnD22Cinf.setBackground(Color.WHITE);
                    }
                    //*****************
                    //*****************************************
                    //DIENTE 11*******************************************
                    if ("1".equals(mod.getD11_izq())) {
                        frm.btnD23Cizq.setOpaque(true);
                        frm.btnD23Cizq.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD11_izq())) {
                        frm.btnD23Cizq.setOpaque(true);
                        frm.btnD23Cizq.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD11_izq())) {
                        frm.btnD23Cizq.setOpaque(true);
                        frm.btnD23Cizq.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD11_izq())) {
                        frm.btnD23Cizq.setOpaque(true);
                        frm.btnD23Cizq.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD11_izq())) {
                        frm.btnD23Cizq.setOpaque(true);
                        frm.btnD23Cizq.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD11_izq())) {
                        frm.btnD23Cizq.setOpaque(true);
                        frm.btnD23Cizq.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD11_izq())) {
                        frm.btnD23Cizq.setOpaque(true);
                        frm.btnD23Cizq.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD11_izq())) {
                        frm.btnD23Cizq.setOpaque(true);
                        frm.btnD23Cizq.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD11_sup())) {
                        frm.btnD23Csup.setOpaque(true);
                        frm.btnD23Csup.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD11_sup())) {
                        frm.btnD23Csup.setOpaque(true);
                        frm.btnD23Csup.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD11_sup())) {
                        frm.btnD23Csup.setOpaque(true);
                        frm.btnD23Csup.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD11_sup())) {
                        frm.btnD23Csup.setOpaque(true);
                        frm.btnD23Csup.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD11_sup())) {
                        frm.btnD23Csup.setOpaque(true);
                        frm.btnD23Csup.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD11_sup())) {
                        frm.btnD23Csup.setOpaque(true);
                        frm.btnD23Csup.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD11_sup())) {
                        frm.btnD23Csup.setOpaque(true);
                        frm.btnD23Csup.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD11_sup())) {
                        frm.btnD23Csup.setOpaque(true);
                        frm.btnD23Csup.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD11_cen())) {
                        frm.btnD23Ccen.setOpaque(true);
                        frm.btnD23Ccen.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD11_cen())) {
                        frm.btnD23Ccen.setOpaque(true);
                        frm.btnD23Ccen.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD11_cen())) {
                        frm.btnD23Ccen.setOpaque(true);
                        frm.btnD23Ccen.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD11_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD23Ccen.getWidth(), frm.btnD23Ccen.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD23Ccen.setIcon(icono);

                    }
                    if ("5".equals(mod.getD11_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD23Ccen.getWidth(), frm.btnD23Ccen.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD23Ccen.setIcon(icono);
                    }
                    if ("6".equals(mod.getD11_cen())) {
                        frm.btnD23Ccen.setOpaque(true);
                        frm.btnD23Ccen.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD11_cen())) {
                        frm.btnD23Ccen.setOpaque(true);
                        frm.btnD23Ccen.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD11_cen())) {
                        frm.btnD23Ccen.setOpaque(true);
                        frm.btnD23Ccen.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD11_cen())) {
                        frm.btnD23Ccen.setOpaque(true);
                        frm.btnD23Ccen.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD11_cen())) {
                        frm.btnD23Ccen.setOpaque(true);
                        frm.btnD23Ccen.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD11_der())) {
                        frm.btnD23Cder.setOpaque(true);
                        frm.btnD23Cder.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD11_der())) {
                        frm.btnD23Cder.setOpaque(true);
                        frm.btnD23Cder.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD11_der())) {
                        frm.btnD23Cder.setOpaque(true);
                        frm.btnD23Cder.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD11_der())) {
                        frm.btnD23Cder.setOpaque(true);
                        frm.btnD23Cder.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD11_der())) {
                        frm.btnD23Cder.setOpaque(true);
                        frm.btnD23Cder.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD11_der())) {
                        frm.btnD23Cder.setOpaque(true);
                        frm.btnD23Cder.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD11_der())) {
                        frm.btnD23Cder.setOpaque(true);
                        frm.btnD23Cder.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD11_der())) {
                        frm.btnD23Cder.setOpaque(true);
                        frm.btnD23Cder.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD11_inf())) {
                        frm.btnD23Cinf.setOpaque(true);
                        frm.btnD23Cinf.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD11_inf())) {
                        frm.btnD23Cinf.setOpaque(true);
                        frm.btnD23Cinf.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD11_inf())) {
                        frm.btnD23Cinf.setOpaque(true);
                        frm.btnD23Cinf.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD11_inf())) {
                        frm.btnD23Cinf.setOpaque(true);
                        frm.btnD23Cinf.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD11_inf())) {
                        frm.btnD23Cinf.setOpaque(true);
                        frm.btnD23Cinf.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD11_inf())) {
                        frm.btnD23Cinf.setOpaque(true);
                        frm.btnD23Cinf.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD11_inf())) {
                        frm.btnD23Cinf.setOpaque(true);
                        frm.btnD23Cinf.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD11_inf())) {
                        frm.btnD23Cinf.setOpaque(true);
                        frm.btnD23Cinf.setBackground(Color.WHITE);
                    }

                    //************************************
                    //***************************************** DIENTE 12 **************************
                    if ("1".equals(mod.getD12_izq())) {
                        frm.btnD1Cizq5.setOpaque(true);
                        frm.btnD1Cizq5.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD12_izq())) {
                        frm.btnD1Cizq5.setOpaque(true);
                        frm.btnD1Cizq5.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD12_izq())) {
                        frm.btnD1Cizq5.setOpaque(true);
                        frm.btnD1Cizq5.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD12_izq())) {
                        frm.btnD1Cizq5.setOpaque(true);
                        frm.btnD1Cizq5.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD12_izq())) {
                        frm.btnD1Cizq5.setOpaque(true);
                        frm.btnD1Cizq5.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD12_izq())) {
                        frm.btnD1Cizq5.setOpaque(true);
                        frm.btnD1Cizq5.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD12_izq())) {
                        frm.btnD1Cizq5.setOpaque(true);
                        frm.btnD1Cizq5.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD12_izq())) {
                        frm.btnD1Cizq5.setOpaque(true);
                        frm.btnD1Cizq5.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD12_sup())) {
                        frm.btnD1Csup5.setOpaque(true);
                        frm.btnD1Csup5.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD12_sup())) {
                        frm.btnD1Csup5.setOpaque(true);
                        frm.btnD1Csup5.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD12_sup())) {
                        frm.btnD1Csup5.setOpaque(true);
                        frm.btnD1Csup5.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD12_sup())) {
                        frm.btnD1Csup5.setOpaque(true);
                        frm.btnD1Csup5.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD12_sup())) {
                        frm.btnD1Csup5.setOpaque(true);
                        frm.btnD1Csup5.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD12_sup())) {
                        frm.btnD1Csup5.setOpaque(true);
                        frm.btnD1Csup5.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD12_sup())) {
                        frm.btnD1Csup5.setOpaque(true);
                        frm.btnD1Csup5.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD12_sup())) {
                        frm.btnD1Csup5.setOpaque(true);
                        frm.btnD1Csup5.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD12_cen())) {
                        frm.btnD1Ccen5.setOpaque(true);
                        frm.btnD1Ccen5.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD12_cen())) {
                        frm.btnD1Ccen5.setOpaque(true);
                        frm.btnD1Ccen5.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD12_cen())) {
                        frm.btnD1Ccen5.setOpaque(true);
                        frm.btnD1Ccen5.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD12_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen5.getWidth(), frm.btnD1Ccen5.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen5.setIcon(icono);

                    }
                    if ("5".equals(mod.getD12_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen5.getWidth(), frm.btnD1Ccen5.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen5.setIcon(icono);
                    }
                    if ("6".equals(mod.getD12_cen())) {
                        frm.btnD1Ccen5.setOpaque(true);
                        frm.btnD1Ccen5.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD12_cen())) {
                        frm.btnD1Ccen5.setOpaque(true);
                        frm.btnD1Ccen5.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD12_cen())) {
                        frm.btnD1Ccen5.setOpaque(true);
                        frm.btnD1Ccen5.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD12_cen())) {
                        frm.btnD1Ccen5.setOpaque(true);
                        frm.btnD1Ccen5.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD12_cen())) {
                        frm.btnD1Ccen5.setOpaque(true);
                        frm.btnD1Ccen5.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD12_der())) {
                        frm.btnD1Cder5.setOpaque(true);
                        frm.btnD1Cder5.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD12_der())) {
                        frm.btnD1Cder5.setOpaque(true);
                        frm.btnD1Cder5.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD12_der())) {
                        frm.btnD1Cder5.setOpaque(true);
                        frm.btnD1Cder5.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD12_der())) {
                        frm.btnD1Cder5.setOpaque(true);
                        frm.btnD1Cder5.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD12_der())) {
                        frm.btnD1Cder5.setOpaque(true);
                        frm.btnD1Cder5.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD12_der())) {
                        frm.btnD1Cder5.setOpaque(true);
                        frm.btnD1Cder5.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD12_der())) {
                        frm.btnD1Cder5.setOpaque(true);
                        frm.btnD1Cder5.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD12_der())) {
                        frm.btnD1Cder5.setOpaque(true);
                        frm.btnD1Cder5.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD12_inf())) {
                        frm.btnD1Cinf5.setOpaque(true);
                        frm.btnD1Cinf5.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD12_inf())) {
                        frm.btnD1Cinf5.setOpaque(true);
                        frm.btnD1Cinf5.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD12_inf())) {
                        frm.btnD1Cinf5.setOpaque(true);
                        frm.btnD1Cinf5.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD12_inf())) {
                        frm.btnD1Cinf5.setOpaque(true);
                        frm.btnD1Cinf5.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD12_inf())) {
                        frm.btnD1Cinf5.setOpaque(true);
                        frm.btnD1Cinf5.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD12_inf())) {
                        frm.btnD1Cinf5.setOpaque(true);
                        frm.btnD1Cinf5.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD12_inf())) {
                        frm.btnD1Cinf5.setOpaque(true);
                        frm.btnD1Cinf5.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD12_inf())) {
                        frm.btnD1Cinf5.setOpaque(true);
                        frm.btnD1Cinf5.setBackground(Color.WHITE);
                    }
                    //******************************************************************************
                    //*********************************************** DIENTE 13 ********************************
                    if ("1".equals(mod.getD13_izq())) {
                        frm.btnD1Cizq4.setOpaque(true);
                        frm.btnD1Cizq4.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD13_izq())) {
                        frm.btnD1Cizq4.setOpaque(true);
                        frm.btnD1Cizq4.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD13_izq())) {
                        frm.btnD1Cizq4.setOpaque(true);
                        frm.btnD1Cizq4.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD13_izq())) {
                        frm.btnD1Cizq4.setOpaque(true);
                        frm.btnD1Cizq4.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD13_izq())) {
                        frm.btnD1Cizq4.setOpaque(true);
                        frm.btnD1Cizq4.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD13_izq())) {
                        frm.btnD1Cizq4.setOpaque(true);
                        frm.btnD1Cizq4.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD13_izq())) {
                        frm.btnD1Cizq4.setOpaque(true);
                        frm.btnD1Cizq4.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD13_izq())) {
                        frm.btnD1Cizq4.setOpaque(true);
                        frm.btnD1Cizq4.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD13_sup())) {
                        frm.btnD1Csup4.setOpaque(true);
                        frm.btnD1Csup4.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD13_sup())) {
                        frm.btnD1Csup4.setOpaque(true);
                        frm.btnD1Csup4.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD13_sup())) {
                        frm.btnD1Csup4.setOpaque(true);
                        frm.btnD1Csup4.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD13_sup())) {
                        frm.btnD1Csup4.setOpaque(true);
                        frm.btnD1Csup4.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD13_sup())) {
                        frm.btnD1Csup4.setOpaque(true);
                        frm.btnD1Csup4.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD13_sup())) {
                        frm.btnD1Csup4.setOpaque(true);
                        frm.btnD1Csup4.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD13_sup())) {
                        frm.btnD1Csup4.setOpaque(true);
                        frm.btnD1Csup4.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD13_sup())) {
                        frm.btnD1Csup4.setOpaque(true);
                        frm.btnD1Csup4.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD13_cen())) {
                        frm.btnD1Ccen4.setOpaque(true);
                        frm.btnD1Ccen4.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD13_cen())) {
                        frm.btnD1Ccen4.setOpaque(true);
                        frm.btnD1Ccen4.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD13_cen())) {
                        frm.btnD1Ccen4.setOpaque(true);
                        frm.btnD1Ccen4.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD13_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen4.getWidth(), frm.btnD1Ccen4.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen4.setIcon(icono);

                    }
                    if ("5".equals(mod.getD13_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen4.getWidth(), frm.btnD1Ccen4.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen4.setIcon(icono);
                    }
                    if ("6".equals(mod.getD13_cen())) {
                        frm.btnD1Ccen4.setOpaque(true);
                        frm.btnD1Ccen4.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD13_cen())) {
                        frm.btnD1Ccen4.setOpaque(true);
                        frm.btnD1Ccen4.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD13_cen())) {
                        frm.btnD1Ccen4.setOpaque(true);
                        frm.btnD1Ccen4.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD13_cen())) {
                        frm.btnD1Ccen4.setOpaque(true);
                        frm.btnD1Ccen4.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD13_cen())) {
                        frm.btnD1Ccen4.setOpaque(true);
                        frm.btnD1Ccen4.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD13_der())) {
                        frm.btnD1Cder4.setOpaque(true);
                        frm.btnD1Cder4.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD13_der())) {
                        frm.btnD1Cder4.setOpaque(true);
                        frm.btnD1Cder4.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD13_der())) {
                        frm.btnD1Cder4.setOpaque(true);
                        frm.btnD1Cder4.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD13_der())) {
                        frm.btnD1Cder4.setOpaque(true);
                        frm.btnD1Cder4.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD13_der())) {
                        frm.btnD1Cder4.setOpaque(true);
                        frm.btnD1Cder4.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD13_der())) {
                        frm.btnD1Cder4.setOpaque(true);
                        frm.btnD1Cder4.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD13_der())) {
                        frm.btnD1Cder4.setOpaque(true);
                        frm.btnD1Cder4.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD13_der())) {
                        frm.btnD1Cder4.setOpaque(true);
                        frm.btnD1Cder4.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD13_inf())) {
                        frm.btnD1Cinf4.setOpaque(true);
                        frm.btnD1Cinf4.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD13_inf())) {
                        frm.btnD1Cinf4.setOpaque(true);
                        frm.btnD1Cinf4.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD13_inf())) {
                        frm.btnD1Cinf4.setOpaque(true);
                        frm.btnD1Cinf4.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD13_inf())) {
                        frm.btnD1Cinf4.setOpaque(true);
                        frm.btnD1Cinf4.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD13_inf())) {
                        frm.btnD1Cinf4.setOpaque(true);
                        frm.btnD1Cinf4.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD13_inf())) {
                        frm.btnD1Cinf4.setOpaque(true);
                        frm.btnD1Cinf4.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD13_inf())) {
                        frm.btnD1Cinf4.setOpaque(true);
                        frm.btnD1Cinf4.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD13_inf())) {
                        frm.btnD1Cinf4.setOpaque(true);
                        frm.btnD1Cinf4.setBackground(Color.WHITE);
                    }
                    //******************************************************************************************
                    //***************************************************DIENTE 14 ****************************
                    if ("1".equals(mod.getD14_izq())) {
                        frm.btnD1Cizq3.setOpaque(true);
                        frm.btnD1Cizq3.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD14_izq())) {
                        frm.btnD1Cizq3.setOpaque(true);
                        frm.btnD1Cizq3.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD14_izq())) {
                        frm.btnD1Cizq3.setOpaque(true);
                        frm.btnD1Cizq3.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD14_izq())) {
                        frm.btnD1Cizq3.setOpaque(true);
                        frm.btnD1Cizq3.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD14_izq())) {
                        frm.btnD1Cizq3.setOpaque(true);
                        frm.btnD1Cizq3.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD14_izq())) {
                        frm.btnD1Cizq3.setOpaque(true);
                        frm.btnD1Cizq3.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD14_izq())) {
                        frm.btnD1Cizq3.setOpaque(true);
                        frm.btnD1Cizq3.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD14_izq())) {
                        frm.btnD1Cizq3.setOpaque(true);
                        frm.btnD1Cizq3.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD14_sup())) {
                        frm.btnD1Csup3.setOpaque(true);
                        frm.btnD1Csup3.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD14_sup())) {
                        frm.btnD1Csup3.setOpaque(true);
                        frm.btnD1Csup3.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD14_sup())) {
                        frm.btnD1Csup3.setOpaque(true);
                        frm.btnD1Csup3.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD14_sup())) {
                        frm.btnD1Csup3.setOpaque(true);
                        frm.btnD1Csup3.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD14_sup())) {
                        frm.btnD1Csup3.setOpaque(true);
                        frm.btnD1Csup3.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD14_sup())) {
                        frm.btnD1Csup3.setOpaque(true);
                        frm.btnD1Csup3.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD14_sup())) {
                        frm.btnD1Csup3.setOpaque(true);
                        frm.btnD1Csup3.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD14_sup())) {
                        frm.btnD1Csup3.setOpaque(true);
                        frm.btnD1Csup3.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD14_cen())) {
                        frm.btnD1Ccen3.setOpaque(true);
                        frm.btnD1Ccen3.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD14_cen())) {
                        frm.btnD1Ccen3.setOpaque(true);
                        frm.btnD1Ccen4.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD14_cen())) {
                        frm.btnD1Ccen3.setOpaque(true);
                        frm.btnD1Ccen3.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD14_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen3.getWidth(), frm.btnD1Ccen3.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen3.setIcon(icono);

                    }
                    if ("5".equals(mod.getD14_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen3.getWidth(), frm.btnD1Ccen3.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen3.setIcon(icono);
                    }
                    if ("6".equals(mod.getD14_cen())) {
                        frm.btnD1Ccen3.setOpaque(true);
                        frm.btnD1Ccen3.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD14_cen())) {
                        frm.btnD1Ccen3.setOpaque(true);
                        frm.btnD1Ccen3.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD14_cen())) {
                        frm.btnD1Ccen3.setOpaque(true);
                        frm.btnD1Ccen3.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD14_cen())) {
                        frm.btnD1Ccen3.setOpaque(true);
                        frm.btnD1Ccen3.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD14_cen())) {
                        frm.btnD1Ccen3.setOpaque(true);
                        frm.btnD1Ccen3.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD14_der())) {
                        frm.btnD1Cder3.setOpaque(true);
                        frm.btnD1Cder3.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD14_der())) {
                        frm.btnD1Cder3.setOpaque(true);
                        frm.btnD1Cder3.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD14_der())) {
                        frm.btnD1Cder3.setOpaque(true);
                        frm.btnD1Cder3.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD14_der())) {
                        frm.btnD1Cder3.setOpaque(true);
                        frm.btnD1Cder3.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD14_der())) {
                        frm.btnD1Cder3.setOpaque(true);
                        frm.btnD1Cder3.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD14_der())) {
                        frm.btnD1Cder3.setOpaque(true);
                        frm.btnD1Cder3.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD14_der())) {
                        frm.btnD1Cder3.setOpaque(true);
                        frm.btnD1Cder3.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD14_der())) {
                        frm.btnD1Cder3.setOpaque(true);
                        frm.btnD1Cder3.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD14_inf())) {
                        frm.btnD1Cinf3.setOpaque(true);
                        frm.btnD1Cinf3.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD14_inf())) {
                        frm.btnD1Cinf3.setOpaque(true);
                        frm.btnD1Cinf3.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD14_inf())) {
                        frm.btnD1Cinf3.setOpaque(true);
                        frm.btnD1Cinf3.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD14_inf())) {
                        frm.btnD1Cinf3.setOpaque(true);
                        frm.btnD1Cinf3.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD14_inf())) {
                        frm.btnD1Cinf3.setOpaque(true);
                        frm.btnD1Cinf3.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD14_inf())) {
                        frm.btnD1Cinf3.setOpaque(true);
                        frm.btnD1Cinf3.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD14_inf())) {
                        frm.btnD1Cinf3.setOpaque(true);
                        frm.btnD1Cinf3.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD14_inf())) {
                        frm.btnD1Cinf3.setOpaque(true);
                        frm.btnD1Cinf3.setBackground(Color.WHITE);
                    }
                    //******************************************************************************************
                    //***************************************************DIENTE 15 ****************************
                    if ("1".equals(mod.getD15_izq())) {
                        frm.btnD1Cizq9.setOpaque(true);
                        frm.btnD1Cizq9.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD15_izq())) {
                        frm.btnD1Cizq9.setOpaque(true);
                        frm.btnD1Cizq9.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD15_izq())) {
                        frm.btnD1Cizq9.setOpaque(true);
                        frm.btnD1Cizq9.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD15_izq())) {
                        frm.btnD1Cizq9.setOpaque(true);
                        frm.btnD1Cizq9.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD15_izq())) {
                        frm.btnD1Cizq9.setOpaque(true);
                        frm.btnD1Cizq9.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD15_izq())) {
                        frm.btnD1Cizq9.setOpaque(true);
                        frm.btnD1Cizq9.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD15_izq())) {
                        frm.btnD1Cizq9.setOpaque(true);
                        frm.btnD1Cizq9.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD15_izq())) {
                        frm.btnD1Cizq9.setOpaque(true);
                        frm.btnD1Cizq9.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD15_sup())) {
                        frm.btnD1Csup9.setOpaque(true);
                        frm.btnD1Csup9.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD15_sup())) {
                        frm.btnD1Csup9.setOpaque(true);
                        frm.btnD1Csup9.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD15_sup())) {
                        frm.btnD1Csup9.setOpaque(true);
                        frm.btnD1Csup9.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD15_sup())) {
                        frm.btnD1Csup9.setOpaque(true);
                        frm.btnD1Csup9.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD15_sup())) {
                        frm.btnD1Csup9.setOpaque(true);
                        frm.btnD1Csup9.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD15_sup())) {
                        frm.btnD1Csup9.setOpaque(true);
                        frm.btnD1Csup9.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD15_sup())) {
                        frm.btnD1Csup9.setOpaque(true);
                        frm.btnD1Csup9.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD15_sup())) {
                        frm.btnD1Csup9.setOpaque(true);
                        frm.btnD1Csup9.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD15_cen())) {
                        frm.btnD1Ccen9.setOpaque(true);
                        frm.btnD1Ccen9.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD15_cen())) {
                        frm.btnD1Ccen9.setOpaque(true);
                        frm.btnD1Ccen9.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD15_cen())) {
                        frm.btnD1Ccen9.setOpaque(true);
                        frm.btnD1Ccen9.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD15_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen9.getWidth(), frm.btnD1Ccen9.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen9.setIcon(icono);

                    }
                    if ("5".equals(mod.getD15_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen9.getWidth(), frm.btnD1Ccen9.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen9.setIcon(icono);
                    }
                    if ("6".equals(mod.getD15_cen())) {
                        frm.btnD1Ccen9.setOpaque(true);
                        frm.btnD1Ccen9.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD15_cen())) {
                        frm.btnD1Ccen9.setOpaque(true);
                        frm.btnD1Ccen9.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD15_cen())) {
                        frm.btnD1Ccen9.setOpaque(true);
                        frm.btnD1Ccen9.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD15_cen())) {
                        frm.btnD1Ccen9.setOpaque(true);
                        frm.btnD1Ccen9.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD15_cen())) {
                        frm.btnD1Ccen9.setOpaque(true);
                        frm.btnD1Ccen9.setBackground(Color.WHITE);
                    }
                    //C_DER
                    if ("1".equals(mod.getD15_der())) {
                        frm.btnD1Cder9.setOpaque(true);
                        frm.btnD1Cder9.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD15_der())) {
                        frm.btnD1Cder9.setOpaque(true);
                        frm.btnD1Cder9.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD15_der())) {
                        frm.btnD1Cder9.setOpaque(true);
                        frm.btnD1Cder9.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD15_der())) {
                        frm.btnD1Cder9.setOpaque(true);
                        frm.btnD1Cder9.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD15_der())) {
                        frm.btnD1Cder9.setOpaque(true);
                        frm.btnD1Cder9.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD15_der())) {
                        frm.btnD1Cder9.setOpaque(true);
                        frm.btnD1Cder9.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD15_der())) {
                        frm.btnD1Cder9.setOpaque(true);
                        frm.btnD1Cder9.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD15_der())) {
                        frm.btnD1Cder9.setOpaque(true);
                        frm.btnD1Cder9.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD15_inf())) {
                        frm.btnD1Cinf9.setOpaque(true);
                        frm.btnD1Cinf9.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD15_inf())) {
                        frm.btnD1Cinf9.setOpaque(true);
                        frm.btnD1Cinf9.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD15_inf())) {
                        frm.btnD1Cinf9.setOpaque(true);
                        frm.btnD1Cinf9.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD15_inf())) {
                        frm.btnD1Cinf9.setOpaque(true);
                        frm.btnD1Cinf9.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD15_inf())) {
                        frm.btnD1Cinf9.setOpaque(true);
                        frm.btnD1Cinf9.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD15_inf())) {
                        frm.btnD1Cinf9.setOpaque(true);
                        frm.btnD1Cinf9.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD15_inf())) {
                        frm.btnD1Cinf9.setOpaque(true);
                        frm.btnD1Cinf9.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD15_inf())) {
                        frm.btnD1Cinf9.setOpaque(true);
                        frm.btnD1Cinf9.setBackground(Color.WHITE);
                    }
                    //******************************************************************************************

                    //***************************************************DIENTE 16 ****************************
                    if ("1".equals(mod.getD16_izq())) {
                        frm.btnD1Cizq8.setOpaque(true);
                        frm.btnD1Cizq8.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD16_izq())) {
                        frm.btnD1Cizq8.setOpaque(true);
                        frm.btnD1Cizq8.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD16_izq())) {
                        frm.btnD1Cizq8.setOpaque(true);
                        frm.btnD1Cizq8.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD16_izq())) {
                        frm.btnD1Cizq8.setOpaque(true);
                        frm.btnD1Cizq8.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD16_izq())) {
                        frm.btnD1Cizq8.setOpaque(true);
                        frm.btnD1Cizq8.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD16_izq())) {
                        frm.btnD1Cizq8.setOpaque(true);
                        frm.btnD1Cizq8.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD16_izq())) {
                        frm.btnD1Cizq8.setOpaque(true);
                        frm.btnD1Cizq8.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD16_izq())) {
                        frm.btnD1Cizq8.setOpaque(true);
                        frm.btnD1Cizq8.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD16_sup())) {
                        frm.btnD1Csup8.setOpaque(true);
                        frm.btnD1Csup8.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD16_sup())) {
                        frm.btnD1Csup8.setOpaque(true);
                        frm.btnD1Csup8.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD16_sup())) {
                        frm.btnD1Csup8.setOpaque(true);
                        frm.btnD1Csup8.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD16_sup())) {
                        frm.btnD1Csup8.setOpaque(true);
                        frm.btnD1Csup8.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD16_sup())) {
                        frm.btnD1Csup8.setOpaque(true);
                        frm.btnD1Csup8.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD16_sup())) {
                        frm.btnD1Csup8.setOpaque(true);
                        frm.btnD1Csup8.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD16_sup())) {
                        frm.btnD1Csup8.setOpaque(true);
                        frm.btnD1Csup8.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD16_sup())) {
                        frm.btnD1Csup8.setOpaque(true);
                        frm.btnD1Csup8.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD16_cen())) {
                        frm.btnD1Ccen8.setOpaque(true);
                        frm.btnD1Ccen8.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD16_cen())) {
                        frm.btnD1Ccen8.setOpaque(true);
                        frm.btnD1Ccen8.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD16_cen())) {
                        frm.btnD1Ccen8.setOpaque(true);
                        frm.btnD1Ccen8.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD16_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen8.getWidth(), frm.btnD1Ccen8.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen8.setIcon(icono);

                    }
                    if ("5".equals(mod.getD16_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen8.getWidth(), frm.btnD1Ccen8.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen8.setIcon(icono);
                    }
                    if ("6".equals(mod.getD16_cen())) {
                        frm.btnD1Ccen8.setOpaque(true);
                        frm.btnD1Ccen8.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD16_cen())) {
                        frm.btnD1Ccen8.setOpaque(true);
                        frm.btnD1Ccen8.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD16_cen())) {
                        frm.btnD1Ccen8.setOpaque(true);
                        frm.btnD1Ccen8.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD16_cen())) {
                        frm.btnD1Ccen8.setOpaque(true);
                        frm.btnD1Ccen8.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD16_cen())) {
                        frm.btnD1Ccen8.setOpaque(true);
                        frm.btnD1Ccen8.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD16_der())) {
                        frm.btnD1Cder8.setOpaque(true);
                        frm.btnD1Cder8.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD16_der())) {
                        frm.btnD1Cder8.setOpaque(true);
                        frm.btnD1Cder8.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD16_der())) {
                        frm.btnD1Cder8.setOpaque(true);
                        frm.btnD1Cder8.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD16_der())) {
                        frm.btnD1Cder8.setOpaque(true);
                        frm.btnD1Cder8.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD16_der())) {
                        frm.btnD1Cder8.setOpaque(true);
                        frm.btnD1Cder8.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD16_der())) {
                        frm.btnD1Cder8.setOpaque(true);
                        frm.btnD1Cder8.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD16_der())) {
                        frm.btnD1Cder8.setOpaque(true);
                        frm.btnD1Cder8.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD16_der())) {
                        frm.btnD1Cder8.setOpaque(true);
                        frm.btnD1Cder8.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD16_inf())) {
                        frm.btnD1Cinf8.setOpaque(true);
                        frm.btnD1Cinf8.setBackground(Color.YELLOW);
                    }

                    if ("2".equals(mod.getD16_inf())) {
                        frm.btnD1Cinf8.setOpaque(true);
                        frm.btnD1Cinf8.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD16_inf())) {
                        frm.btnD1Cinf8.setOpaque(true);
                        frm.btnD1Cinf8.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD16_inf())) {
                        frm.btnD1Cinf8.setOpaque(true);
                        frm.btnD1Cinf8.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD16_inf())) {
                        frm.btnD1Cinf8.setOpaque(true);
                        frm.btnD1Cinf8.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD16_inf())) {
                        frm.btnD1Cinf8.setOpaque(true);
                        frm.btnD1Cinf8.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD16_inf())) {
                        frm.btnD1Cinf8.setOpaque(true);
                        frm.btnD1Cinf8.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD16_inf())) {
                        frm.btnD1Cinf8.setOpaque(true);
                        frm.btnD1Cinf8.setBackground(Color.WHITE);
                    }

                    //***************************************************************************************
                    frm.d1_izq = mod.getD1_izq();
                    frm.d1_sup = mod.getD1_sup();
                    frm.d1_cen = mod.getD1_cen();
                    frm.d1_der = mod.getD1_der();
                    frm.d1_inf = mod.getD1_inf();

                    frm.d2_izq = mod.getD2_izq();
                    frm.d2_sup = mod.getD2_sup();
                    frm.d2_cen = mod.getD2_cen();
                    frm.d2_der = mod.getD2_der();
                    frm.d2_inf = mod.getD2_inf();

                    frm.d3_izq = mod.getD3_izq();
                    frm.d3_sup = mod.getD3_sup();
                    frm.d3_cen = mod.getD3_cen();
                    frm.d3_der = mod.getD3_der();
                    frm.d3_inf = mod.getD3_inf();

                    frm.d4_izq = mod.getD4_izq();
                    frm.d4_sup = mod.getD4_sup();
                    frm.d4_cen = mod.getD4_cen();
                    frm.d4_der = mod.getD4_der();
                    frm.d4_inf = mod.getD4_inf();

                    frm.d5_izq = mod.getD5_izq();
                    frm.d5_sup = mod.getD5_sup();
                    frm.d5_cen = mod.getD5_cen();
                    frm.d5_der = mod.getD5_der();
                    frm.d5_inf = mod.getD5_inf();

                    frm.d6_izq = mod.getD6_izq();
                    frm.d6_sup = mod.getD6_sup();
                    frm.d6_cen = mod.getD6_cen();
                    frm.d6_der = mod.getD6_der();
                    frm.d6_inf = mod.getD6_inf();

                    frm.d7_izq = mod.getD7_izq();
                    frm.d7_sup = mod.getD7_sup();
                    frm.d7_cen = mod.getD7_cen();
                    frm.d7_der = mod.getD7_der();
                    frm.d7_inf = mod.getD7_inf();

                    frm.d8_izq = mod.getD8_izq();
                    frm.d8_sup = mod.getD8_sup();
                    frm.d8_cen = mod.getD8_cen();
                    frm.d8_der = mod.getD8_der();
                    frm.d8_inf = mod.getD8_inf();

                    frm.d9_izq = mod.getD9_izq();
                    frm.d9_sup = mod.getD9_sup();
                    frm.d9_cen = mod.getD9_cen();
                    frm.d9_der = mod.getD9_der();
                    frm.d9_inf = mod.getD9_inf();

                    frm.d10_izq = mod.getD10_izq();
                    frm.d10_sup = mod.getD10_sup();
                    frm.d10_cen = mod.getD10_cen();
                    frm.d10_der = mod.getD10_der();
                    frm.d10_inf = mod.getD10_inf();

                    frm.d11_izq = mod.getD11_izq();
                    frm.d11_sup = mod.getD11_sup();
                    frm.d11_cen = mod.getD11_cen();
                    frm.d11_der = mod.getD11_der();
                    frm.d11_inf = mod.getD11_inf();

                    frm.d12_izq = mod.getD12_izq();
                    frm.d12_sup = mod.getD12_sup();
                    frm.d12_cen = mod.getD12_cen();
                    frm.d12_der = mod.getD12_der();
                    frm.d12_inf = mod.getD12_inf();

                    frm.d13_izq = mod.getD13_izq();
                    frm.d13_sup = mod.getD13_sup();
                    frm.d13_cen = mod.getD13_cen();
                    frm.d13_der = mod.getD13_der();
                    frm.d13_inf = mod.getD13_inf();

                    frm.d14_izq = mod.getD14_izq();
                    frm.d14_sup = mod.getD14_sup();
                    frm.d14_cen = mod.getD14_cen();
                    frm.d14_der = mod.getD14_der();
                    frm.d14_inf = mod.getD14_inf();

                    frm.d15_izq = mod.getD15_izq();
                    frm.d15_sup = mod.getD15_sup();
                    frm.d15_cen = mod.getD15_cen();
                    frm.d15_der = mod.getD15_der();
                    frm.d15_inf = mod.getD15_inf();

                    frm.d16_izq = mod.getD16_izq();
                    frm.d16_sup = mod.getD16_sup();
                    frm.d16_cen = mod.getD16_cen();
                    frm.d16_der = mod.getD16_der();
                    frm.d16_inf = mod.getD16_inf();

                    System.out.println(frm.d2_izq + frm.d2_sup + frm.d2_cen + frm.d2_der + frm.d2_inf);
                    System.out.println(frm.d8_izq + frm.d8_sup + frm.d8_cen + frm.d8_der + frm.d8_inf);

                    frm.btnActualizarodontograma.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(null, "NO EXISTE ODONTOGRAMA INICIAL");

                }

            }

        }

    }
}
