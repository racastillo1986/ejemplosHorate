package Controlador;

import Modelo.ConsultasOdonmaxinf;
import Modelo.ConsultasOdonmaxinfactual;
import Modelo.ConsultasOdontograma;
import Modelo.Odontograma;
import Modelo.Odontogramaxinf;
import Vista.frmConsultasPaciente;
import Vista.frmOdontogramaActual;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CtrlOdontogramainfActual implements ActionListener {

    private Odontogramaxinf mod;
    private ConsultasOdonmaxinfactual modc;
    private frmOdontogramaActual frm;

    public CtrlOdontogramainfActual(Odontogramaxinf mod, ConsultasOdonmaxinfactual modc, frmOdontogramaActual frm) {
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

           // System.out.println(frm.d17_izq + frm.d17_sup + frm.d17_cen + frm.d17_der + frm.d17_inf );

            mod.setId_pac(Integer.parseInt(frm.txtid_pac.getText()));

            mod.setD1_izq(frm.d17_izq);
            mod.setD1_sup(frm.d17_sup);
            mod.setD1_cen(frm.d17_cen);
            mod.setD1_der(frm.d17_der);
            mod.setD1_inf(frm.d17_inf);

            mod.setD2_izq(frm.d18_izq);
            mod.setD2_sup(frm.d18_sup);
            mod.setD2_cen(frm.d18_cen);
            mod.setD2_der(frm.d18_der);
            mod.setD2_inf(frm.d18_inf);

            mod.setD3_izq(frm.d19_izq);
            mod.setD3_sup(frm.d19_sup);
            mod.setD3_cen(frm.d19_cen);
            mod.setD3_der(frm.d19_der);
            mod.setD3_inf(frm.d19_inf);

            mod.setD4_izq(frm.d20_izq);
            mod.setD4_sup(frm.d20_sup);
            mod.setD4_cen(frm.d20_cen);
            mod.setD4_der(frm.d20_der);
            mod.setD4_inf(frm.d20_inf);

            mod.setD5_izq(frm.d21_izq);
            mod.setD5_sup(frm.d21_sup);
            mod.setD5_cen(frm.d21_cen);
            mod.setD5_der(frm.d21_der);
            mod.setD5_inf(frm.d21_inf);

            mod.setD6_izq(frm.d22_izq);
            mod.setD6_sup(frm.d22_sup);
            mod.setD6_cen(frm.d22_cen);
            mod.setD6_der(frm.d22_der);
            mod.setD6_inf(frm.d22_inf);

            mod.setD7_izq(frm.d23_izq);
            mod.setD7_sup(frm.d23_sup);
            mod.setD7_cen(frm.d23_cen);
            mod.setD7_der(frm.d23_der);
            mod.setD7_inf(frm.d23_inf);

            mod.setD8_izq(frm.d24_izq);
            mod.setD8_sup(frm.d24_sup);
            mod.setD8_cen(frm.d24_cen);
            mod.setD8_der(frm.d24_der);
            mod.setD8_inf(frm.d24_inf);

            mod.setD9_izq(frm.d25_izq);
            mod.setD9_sup(frm.d25_sup);
            mod.setD9_cen(frm.d25_cen);
            mod.setD9_der(frm.d25_der);
            mod.setD9_inf(frm.d25_inf);

            mod.setD10_izq(frm.d26_izq);
            mod.setD10_sup(frm.d26_sup);
            mod.setD10_cen(frm.d26_cen);
            mod.setD10_der(frm.d26_der);
            mod.setD10_inf(frm.d26_inf);

            mod.setD11_izq(frm.d27_izq);
            mod.setD11_sup(frm.d27_sup);
            mod.setD11_cen(frm.d27_cen);
            mod.setD11_der(frm.d27_der);
            mod.setD11_inf(frm.d27_inf);

            mod.setD12_izq(frm.d28_izq);
            mod.setD12_sup(frm.d28_sup);
            mod.setD12_cen(frm.d28_cen);
            mod.setD12_der(frm.d28_der);
            mod.setD12_inf(frm.d28_inf);

            mod.setD13_izq(frm.d29_izq);
            mod.setD13_sup(frm.d29_sup);
            mod.setD13_cen(frm.d29_cen);
            mod.setD13_der(frm.d29_der);
            mod.setD13_inf(frm.d29_inf);

            mod.setD14_izq(frm.d30_izq);
            mod.setD14_sup(frm.d30_sup);
            mod.setD14_cen(frm.d30_cen);
            mod.setD14_der(frm.d30_der);
            mod.setD14_inf(frm.d30_inf);

            mod.setD15_izq(frm.d31_izq);
            mod.setD15_sup(frm.d31_sup);
            mod.setD15_cen(frm.d31_cen);
            mod.setD15_der(frm.d31_der);
            mod.setD15_inf(frm.d31_inf);

            mod.setD16_izq(frm.d32_izq);
            mod.setD16_sup(frm.d32_sup);
            mod.setD16_cen(frm.d32_cen);
            mod.setD16_der(frm.d32_der);
            mod.setD16_inf(frm.d32_inf);

            if (modc.actualizar(mod)) {
                //JOptionPane.showMessageDialog(null, "Registro guardado");
                System.out.println("se actualizo odontograma superior");
                JOptionPane.showMessageDialog(null, "ODONTOGRAMA ACTUALIZADO");

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
                    System.out.println("buscando odontograma inferior");

                    //DIENTE 17...........................
                    //C IZQ
                    if ("1".equals(mod.getD1_izq())) {
                        frm.btnD1Cizq26.setOpaque(true);
                        frm.btnD1Cizq26.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD1_izq())) {
                        frm.btnD1Cizq26.setOpaque(true);
                        frm.btnD1Cizq26.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD1_izq())) {
                        frm.btnD1Cizq26.setOpaque(true);
                        frm.btnD1Cizq26.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD1_izq())) {
                        frm.btnD1Cizq26.setOpaque(true);
                        frm.btnD1Cizq26.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD1_izq())) {
                        frm.btnD1Cizq26.setOpaque(true);
                        frm.btnD1Cizq26.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD1_izq())) {
                        frm.btnD1Cizq26.setOpaque(true);
                        frm.btnD1Cizq26.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD1_izq())) {
                        frm.btnD1Cizq26.setOpaque(true);
                        frm.btnD1Cizq26.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD1_izq())) {
                        frm.btnD1Cizq26.setOpaque(true);
                        frm.btnD1Cizq26.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD1_sup())) {
                        frm.btnD1Csup26.setOpaque(true);
                        frm.btnD1Csup26.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD1_sup())) {
                        frm.btnD1Csup26.setOpaque(true);
                        frm.btnD1Csup26.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD1_sup())) {
                        frm.btnD1Csup26.setOpaque(true);
                        frm.btnD1Csup26.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD1_sup())) {
                        frm.btnD1Csup26.setOpaque(true);
                        frm.btnD1Csup26.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD1_sup())) {
                        frm.btnD1Csup26.setOpaque(true);
                        frm.btnD1Csup26.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD1_sup())) {
                        frm.btnD1Csup26.setOpaque(true);
                        frm.btnD1Csup26.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD1_sup())) {
                        frm.btnD1Csup26.setOpaque(true);
                        frm.btnD1Csup26.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD1_sup())) {
                        frm.btnD1Csup26.setOpaque(true);
                        frm.btnD1Csup26.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD1_cen())) {
                        frm.btnD1Ccen26.setOpaque(true);
                        frm.btnD1Ccen26.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD1_cen())) {
                        frm.btnD1Ccen26.setOpaque(true);
                        frm.btnD1Ccen26.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD1_cen())) {
                        frm.btnD1Ccen26.setOpaque(true);
                        frm.btnD1Ccen26.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD1_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen26.getWidth(), frm.btnD1Ccen26.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen26.setIcon(icono);

                    }
                    if ("5".equals(mod.getD1_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen26.getWidth(), frm.btnD1Ccen26.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen26.setIcon(icono);
                    }
                    if ("6".equals(mod.getD1_cen())) {
                        frm.btnD1Ccen26.setOpaque(true);
                        frm.btnD1Ccen26.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD1_cen())) {
                        frm.btnD1Ccen26.setOpaque(true);
                        frm.btnD1Ccen26.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD1_cen())) {
                        frm.btnD1Ccen26.setOpaque(true);
                        frm.btnD1Ccen26.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD1_cen())) {
                        frm.btnD1Ccen26.setOpaque(true);
                        frm.btnD1Ccen26.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD1_cen())) {
                        frm.btnD1Ccen26.setOpaque(true);
                        frm.btnD1Ccen26.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD1_der())) {
                        frm.btnD1Cder26.setOpaque(true);
                        frm.btnD1Cder26.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD1_der())) {
                        frm.btnD1Cder26.setOpaque(true);
                        frm.btnD1Cder26.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD1_der())) {
                        frm.btnD1Cder26.setOpaque(true);
                        frm.btnD1Cder26.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD1_der())) {
                        frm.btnD1Cder26.setOpaque(true);
                        frm.btnD1Cder26.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD1_der())) {
                        frm.btnD1Cder26.setOpaque(true);
                        frm.btnD1Cder26.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD1_der())) {
                        frm.btnD1Cder26.setOpaque(true);
                        frm.btnD1Cder26.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD1_der())) {
                        frm.btnD1Cder26.setOpaque(true);
                        frm.btnD1Cder26.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD1_der())) {
                        frm.btnD1Cder26.setOpaque(true);
                        frm.btnD1Cder26.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD1_inf())) {
                        frm.btnD1Cinf26.setOpaque(true);
                        frm.btnD1Cinf26.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD1_inf())) {
                        frm.btnD1Cinf26.setOpaque(true);
                        frm.btnD1Cinf26.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD1_inf())) {
                        frm.btnD1Cinf26.setOpaque(true);
                        frm.btnD1Cinf26.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD1_inf())) {
                        frm.btnD1Cinf26.setOpaque(true);
                        frm.btnD1Cinf26.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD1_inf())) {
                        frm.btnD1Cinf26.setOpaque(true);
                        frm.btnD1Cinf26.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD1_inf())) {
                        frm.btnD1Cinf26.setOpaque(true);
                        frm.btnD1Cinf26.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD1_inf())) {
                        frm.btnD1Cinf26.setOpaque(true);
                        frm.btnD1Cinf26.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD1_inf())) {
                        frm.btnD1Cinf26.setOpaque(true);
                        frm.btnD1Cinf26.setBackground(Color.WHITE);
                    }

                    //***************************************************************************************
                    //DIENTE 18...........................
                    //C IZQ
                    if ("1".equals(mod.getD2_izq())) {
                        frm.btnD1Cizq27.setOpaque(true);
                        frm.btnD1Cizq27.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD2_izq())) {
                        frm.btnD1Cizq27.setOpaque(true);
                        frm.btnD1Cizq27.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD2_izq())) {
                        frm.btnD1Cizq27.setOpaque(true);
                        frm.btnD1Cizq27.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD2_izq())) {
                        frm.btnD1Cizq27.setOpaque(true);
                        frm.btnD1Cizq27.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD2_izq())) {
                        frm.btnD1Cizq27.setOpaque(true);
                        frm.btnD1Cizq27.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD2_izq())) {
                        frm.btnD1Cizq27.setOpaque(true);
                        frm.btnD1Cizq27.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD2_izq())) {
                        frm.btnD1Cizq27.setOpaque(true);
                        frm.btnD1Cizq27.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD2_izq())) {
                        frm.btnD1Cizq27.setOpaque(true);
                        frm.btnD1Cizq27.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD2_sup())) {
                        frm.btnD1Csup27.setOpaque(true);
                        frm.btnD1Csup27.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD2_sup())) {
                        frm.btnD1Csup27.setOpaque(true);
                        frm.btnD1Csup27.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD2_sup())) {
                        frm.btnD1Csup27.setOpaque(true);
                        frm.btnD1Csup27.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD2_sup())) {
                        frm.btnD1Csup27.setOpaque(true);
                        frm.btnD1Csup27.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD2_sup())) {
                        frm.btnD1Csup27.setOpaque(true);
                        frm.btnD1Csup27.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD2_sup())) {
                        frm.btnD1Csup27.setOpaque(true);
                        frm.btnD1Csup27.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD2_sup())) {
                        frm.btnD1Csup27.setOpaque(true);
                        frm.btnD1Csup27.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD2_sup())) {
                        frm.btnD1Csup27.setOpaque(true);
                        frm.btnD1Csup27.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD2_cen())) {
                        frm.btnD1Ccen27.setOpaque(true);
                        frm.btnD1Ccen27.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD2_cen())) {
                        frm.btnD1Ccen27.setOpaque(true);
                        frm.btnD1Ccen27.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD2_cen())) {
                        frm.btnD1Ccen27.setOpaque(true);
                        frm.btnD1Ccen27.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD2_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen27.getWidth(), frm.btnD1Ccen27.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen27.setIcon(icono);

                    }
                    if ("5".equals(mod.getD2_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen27.getWidth(), frm.btnD1Ccen27.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen27.setIcon(icono);
                    }
                    if ("6".equals(mod.getD2_cen())) {
                        frm.btnD1Ccen27.setOpaque(true);
                        frm.btnD1Ccen27.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD2_cen())) {
                        frm.btnD1Ccen27.setOpaque(true);
                        frm.btnD1Ccen27.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD2_cen())) {
                        frm.btnD1Ccen27.setOpaque(true);
                        frm.btnD1Ccen27.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD2_cen())) {
                        frm.btnD1Ccen27.setOpaque(true);
                        frm.btnD1Ccen27.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD2_cen())) {
                        frm.btnD1Ccen27.setOpaque(true);
                        frm.btnD1Ccen27.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD2_der())) {
                        frm.btnD1Cder27.setOpaque(true);
                        frm.btnD1Cder27.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD2_der())) {
                        frm.btnD1Cder27.setOpaque(true);
                        frm.btnD1Cder27.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD2_der())) {
                        frm.btnD1Cder27.setOpaque(true);
                        frm.btnD1Cder27.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD2_der())) {
                        frm.btnD1Cder27.setOpaque(true);
                        frm.btnD1Cder27.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD2_der())) {
                        frm.btnD1Cder27.setOpaque(true);
                        frm.btnD1Cder27.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD2_der())) {
                        frm.btnD1Cder27.setOpaque(true);
                        frm.btnD1Cder27.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD2_der())) {
                        frm.btnD1Cder27.setOpaque(true);
                        frm.btnD1Cder27.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD2_der())) {
                        frm.btnD1Cder27.setOpaque(true);
                        frm.btnD1Cder27.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD2_inf())) {
                        frm.btnD1Cinf27.setOpaque(true);
                        frm.btnD1Cinf27.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD2_inf())) {
                        frm.btnD1Cinf27.setOpaque(true);
                        frm.btnD1Cinf27.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD2_inf())) {
                        frm.btnD1Cinf27.setOpaque(true);
                        frm.btnD1Cinf27.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD2_inf())) {
                        frm.btnD1Cinf27.setOpaque(true);
                        frm.btnD1Cinf27.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD2_inf())) {
                        frm.btnD1Cinf27.setOpaque(true);
                        frm.btnD1Cinf27.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD2_inf())) {
                        frm.btnD1Cinf27.setOpaque(true);
                        frm.btnD1Cinf27.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD2_inf())) {
                        frm.btnD1Cinf27.setOpaque(true);
                        frm.btnD1Cinf27.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD2_inf())) {
                        frm.btnD1Cinf27.setOpaque(true);
                        frm.btnD1Cinf27.setBackground(Color.WHITE);
                    }

                    //***************************************************************************************
                    //DIENTE 19...........................
                    //C IZQ
                    if ("1".equals(mod.getD3_izq())) {
                        frm.btnD1Cizq28.setOpaque(true);
                        frm.btnD1Cizq28.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD3_izq())) {
                        frm.btnD1Cizq28.setOpaque(true);
                        frm.btnD1Cizq28.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD3_izq())) {
                        frm.btnD1Cizq28.setOpaque(true);
                        frm.btnD1Cizq28.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD3_izq())) {
                        frm.btnD1Cizq28.setOpaque(true);
                        frm.btnD1Cizq28.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD3_izq())) {
                        frm.btnD1Cizq28.setOpaque(true);
                        frm.btnD1Cizq28.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD3_izq())) {
                        frm.btnD1Cizq28.setOpaque(true);
                        frm.btnD1Cizq28.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD3_izq())) {
                        frm.btnD1Cizq28.setOpaque(true);
                        frm.btnD1Cizq28.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD3_izq())) {
                        frm.btnD1Cizq28.setOpaque(true);
                        frm.btnD1Cizq28.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD3_sup())) {
                        frm.btnD1Csup28.setOpaque(true);
                        frm.btnD1Csup28.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD3_sup())) {
                        frm.btnD1Csup28.setOpaque(true);
                        frm.btnD1Csup28.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD3_sup())) {
                        frm.btnD1Csup28.setOpaque(true);
                        frm.btnD1Csup28.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD3_sup())) {
                        frm.btnD1Csup28.setOpaque(true);
                        frm.btnD1Csup28.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD3_sup())) {
                        frm.btnD1Csup28.setOpaque(true);
                        frm.btnD1Csup28.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD3_sup())) {
                        frm.btnD1Csup28.setOpaque(true);
                        frm.btnD1Csup28.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD3_sup())) {
                        frm.btnD1Csup28.setOpaque(true);
                        frm.btnD1Csup28.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD3_sup())) {
                        frm.btnD1Csup28.setOpaque(true);
                        frm.btnD1Csup28.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD3_cen())) {
                        frm.btnD1Ccen28.setOpaque(true);
                        frm.btnD1Ccen28.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD3_cen())) {
                        frm.btnD1Ccen28.setOpaque(true);
                        frm.btnD1Ccen28.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD3_cen())) {
                        frm.btnD1Ccen28.setOpaque(true);
                        frm.btnD1Ccen28.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD3_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen28.getWidth(), frm.btnD1Ccen28.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen28.setIcon(icono);

                    }
                    if ("5".equals(mod.getD3_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen28.getWidth(), frm.btnD1Ccen28.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen28.setIcon(icono);
                    }
                    if ("6".equals(mod.getD3_cen())) {
                        frm.btnD1Ccen28.setOpaque(true);
                        frm.btnD1Ccen28.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD3_cen())) {
                        frm.btnD1Ccen28.setOpaque(true);
                        frm.btnD1Ccen28.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD3_cen())) {
                        frm.btnD1Ccen28.setOpaque(true);
                        frm.btnD1Ccen28.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD3_cen())) {
                        frm.btnD1Ccen28.setOpaque(true);
                        frm.btnD1Ccen28.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD3_cen())) {
                        frm.btnD1Ccen28.setOpaque(true);
                        frm.btnD1Ccen28.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD3_der())) {
                        frm.btnD1Cder28.setOpaque(true);
                        frm.btnD1Cder28.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD3_der())) {
                        frm.btnD1Cder28.setOpaque(true);
                        frm.btnD1Cder28.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD3_der())) {
                        frm.btnD1Cder28.setOpaque(true);
                        frm.btnD1Cder28.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD3_der())) {
                        frm.btnD1Cder28.setOpaque(true);
                        frm.btnD1Cder28.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD3_der())) {
                        frm.btnD1Cder28.setOpaque(true);
                        frm.btnD1Cder28.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD3_der())) {
                        frm.btnD1Cder28.setOpaque(true);
                        frm.btnD1Cder28.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD3_der())) {
                        frm.btnD1Cder28.setOpaque(true);
                        frm.btnD1Cder28.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD3_der())) {
                        frm.btnD1Cder28.setOpaque(true);
                        frm.btnD1Cder28.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD3_inf())) {
                        frm.btnD1Cinf28.setOpaque(true);
                        frm.btnD1Cinf28.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD3_inf())) {
                        frm.btnD1Cinf28.setOpaque(true);
                        frm.btnD1Cinf28.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD3_inf())) {
                        frm.btnD1Cinf28.setOpaque(true);
                        frm.btnD1Cinf28.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD3_inf())) {
                        frm.btnD1Cinf28.setOpaque(true);
                        frm.btnD1Cinf28.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD3_inf())) {
                        frm.btnD1Cinf28.setOpaque(true);
                        frm.btnD1Cinf28.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD3_inf())) {
                        frm.btnD1Cinf28.setOpaque(true);
                        frm.btnD1Cinf28.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD3_inf())) {
                        frm.btnD1Cinf28.setOpaque(true);
                        frm.btnD1Cinf28.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD3_inf())) {
                        frm.btnD1Cinf28.setOpaque(true);
                        frm.btnD1Cinf28.setBackground(Color.WHITE);
                    }

                    //***************************************************************************************
                    //DIENTE 20...........................
                    //C IZQ
                    if ("1".equals(mod.getD4_izq())) {
                        frm.btnD1Cizq29.setOpaque(true);
                        frm.btnD1Cizq29.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD4_izq())) {
                        frm.btnD1Cizq29.setOpaque(true);
                        frm.btnD1Cizq29.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD4_izq())) {
                        frm.btnD1Cizq29.setOpaque(true);
                        frm.btnD1Cizq29.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD4_izq())) {
                        frm.btnD1Cizq29.setOpaque(true);
                        frm.btnD1Cizq29.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD4_izq())) {
                        frm.btnD1Cizq29.setOpaque(true);
                        frm.btnD1Cizq29.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD4_izq())) {
                        frm.btnD1Cizq29.setOpaque(true);
                        frm.btnD1Cizq29.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD4_izq())) {
                        frm.btnD1Cizq29.setOpaque(true);
                        frm.btnD1Cizq29.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD4_izq())) {
                        frm.btnD1Cizq29.setOpaque(true);
                        frm.btnD1Cizq29.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD4_sup())) {
                        frm.btnD1Csup29.setOpaque(true);
                        frm.btnD1Csup29.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD4_sup())) {
                        frm.btnD1Csup29.setOpaque(true);
                        frm.btnD1Csup29.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD4_sup())) {
                        frm.btnD1Csup29.setOpaque(true);
                        frm.btnD1Csup29.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD4_sup())) {
                        frm.btnD1Csup29.setOpaque(true);
                        frm.btnD1Csup29.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD4_sup())) {
                        frm.btnD1Csup29.setOpaque(true);
                        frm.btnD1Csup29.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD4_sup())) {
                        frm.btnD1Csup29.setOpaque(true);
                        frm.btnD1Csup29.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD4_sup())) {
                        frm.btnD1Csup29.setOpaque(true);
                        frm.btnD1Csup29.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD4_sup())) {
                        frm.btnD1Csup29.setOpaque(true);
                        frm.btnD1Csup29.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD4_cen())) {
                        frm.btnD1Ccen29.setOpaque(true);
                        frm.btnD1Ccen29.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD4_cen())) {
                        frm.btnD1Ccen29.setOpaque(true);
                        frm.btnD1Ccen29.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD4_cen())) {
                        frm.btnD1Ccen29.setOpaque(true);
                        frm.btnD1Ccen29.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD4_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen29.getWidth(), frm.btnD1Ccen29.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen29.setIcon(icono);

                    }
                    if ("5".equals(mod.getD4_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen29.getWidth(), frm.btnD1Ccen29.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen29.setIcon(icono);
                    }
                    if ("6".equals(mod.getD4_cen())) {
                        frm.btnD1Ccen29.setOpaque(true);
                        frm.btnD1Ccen29.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD4_cen())) {
                        frm.btnD1Ccen29.setOpaque(true);
                        frm.btnD1Ccen29.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD4_cen())) {
                        frm.btnD1Ccen29.setOpaque(true);
                        frm.btnD1Ccen29.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD4_cen())) {
                        frm.btnD1Ccen29.setOpaque(true);
                        frm.btnD1Ccen29.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD4_cen())) {
                        frm.btnD1Ccen29.setOpaque(true);
                        frm.btnD1Ccen29.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD4_der())) {
                        frm.btnD1Cder29.setOpaque(true);
                        frm.btnD1Cder29.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD4_der())) {
                        frm.btnD1Cder29.setOpaque(true);
                        frm.btnD1Cder29.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD4_der())) {
                        frm.btnD1Cder29.setOpaque(true);
                        frm.btnD1Cder29.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD4_der())) {
                        frm.btnD1Cder29.setOpaque(true);
                        frm.btnD1Cder29.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD4_der())) {
                        frm.btnD1Cder29.setOpaque(true);
                        frm.btnD1Cder29.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD4_der())) {
                        frm.btnD1Cder29.setOpaque(true);
                        frm.btnD1Cder29.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD3_cen())) {
                        frm.btnD1Cder29.setOpaque(true);
                        frm.btnD1Cder29.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD4_der())) {
                        frm.btnD1Cder29.setOpaque(true);
                        frm.btnD1Cder29.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD4_inf())) {
                        frm.btnD1Cinf29.setOpaque(true);
                        frm.btnD1Cinf29.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD4_inf())) {
                        frm.btnD1Cinf29.setOpaque(true);
                        frm.btnD1Cinf29.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD4_inf())) {
                        frm.btnD1Cinf29.setOpaque(true);
                        frm.btnD1Cinf29.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD4_inf())) {
                        frm.btnD1Cinf29.setOpaque(true);
                        frm.btnD1Cinf29.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD4_inf())) {
                        frm.btnD1Cinf29.setOpaque(true);
                        frm.btnD1Cinf29.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD4_inf())) {
                        frm.btnD1Cinf29.setOpaque(true);
                        frm.btnD1Cinf29.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD4_inf())) {
                        frm.btnD1Cinf29.setOpaque(true);
                        frm.btnD1Cinf29.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD4_inf())) {
                        frm.btnD1Cinf29.setOpaque(true);
                        frm.btnD1Cinf29.setBackground(Color.WHITE);
                    }

                    //***************************************************************************************
                    //*********************DIENTE 5 ************************************** DIENTE 5
                    //**********
                    //
                    if ("1".equals(mod.getD5_izq())) {
                        frm.btnD1Cizq30.setOpaque(true);
                        frm.btnD1Cizq30.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD5_izq())) {
                        frm.btnD1Cizq30.setOpaque(true);
                        frm.btnD1Cizq30.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD5_izq())) {
                        frm.btnD1Cizq30.setOpaque(true);
                        frm.btnD1Cizq30.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD5_izq())) {
                        frm.btnD1Cizq30.setOpaque(true);
                        frm.btnD1Cizq30.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD5_izq())) {
                        frm.btnD1Cizq30.setOpaque(true);
                        frm.btnD1Cizq30.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD5_izq())) {
                        frm.btnD1Cizq30.setOpaque(true);
                        frm.btnD1Cizq30.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD5_izq())) {
                        frm.btnD1Cizq30.setOpaque(true);
                        frm.btnD1Cizq30.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD5_izq())) {
                        frm.btnD1Cizq30.setOpaque(true);
                        frm.btnD1Cizq30.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD5_sup())) {
                        frm.btnD1Csup30.setOpaque(true);
                        frm.btnD1Csup30.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD5_sup())) {
                        frm.btnD1Csup30.setOpaque(true);
                        frm.btnD1Csup30.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD5_sup())) {
                        frm.btnD1Csup30.setOpaque(true);
                        frm.btnD1Csup30.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD5_sup())) {
                        frm.btnD1Csup30.setOpaque(true);
                        frm.btnD1Csup30.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD5_sup())) {
                        frm.btnD1Csup30.setOpaque(true);
                        frm.btnD1Csup30.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD5_sup())) {
                        frm.btnD1Csup30.setOpaque(true);
                        frm.btnD1Csup30.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD5_sup())) {
                        frm.btnD1Csup30.setOpaque(true);
                        frm.btnD1Csup30.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD5_sup())) {
                        frm.btnD1Csup30.setOpaque(true);
                        frm.btnD1Csup30.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD5_cen())) {
                        frm.btnD1Ccen30.setOpaque(true);
                        frm.btnD1Ccen30.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD5_cen())) {
                        frm.btnD1Ccen30.setOpaque(true);
                        frm.btnD1Ccen30.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD5_cen())) {
                        frm.btnD1Ccen30.setOpaque(true);
                        frm.btnD1Ccen30.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD5_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen30.getWidth(), frm.btnD1Ccen30.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen30.setIcon(icono);

                    }
                    if ("5".equals(mod.getD5_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen30.getWidth(), frm.btnD1Ccen30.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen30.setIcon(icono);
                    }
                    if ("6".equals(mod.getD5_cen())) {
                        frm.btnD1Ccen30.setOpaque(true);
                        frm.btnD1Ccen30.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD5_cen())) {
                        frm.btnD1Ccen30.setOpaque(true);
                        frm.btnD1Ccen30.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD5_cen())) {
                        frm.btnD1Ccen30.setOpaque(true);
                        frm.btnD1Ccen30.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD5_cen())) {
                        frm.btnD1Ccen30.setOpaque(true);
                        frm.btnD1Ccen30.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD5_cen())) {
                        frm.btnD1Ccen30.setOpaque(true);
                        frm.btnD1Ccen30.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD5_der())) {
                        frm.btnD1Cder30.setOpaque(true);
                        frm.btnD1Cder30.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD5_der())) {
                        frm.btnD1Cder30.setOpaque(true);
                        frm.btnD1Cder30.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD5_der())) {
                        frm.btnD1Cder30.setOpaque(true);
                        frm.btnD1Cder30.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD5_der())) {
                        frm.btnD1Cder30.setOpaque(true);
                        frm.btnD1Cder30.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD5_der())) {
                        frm.btnD1Cder30.setOpaque(true);
                        frm.btnD1Cder30.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD5_der())) {
                        frm.btnD1Cder30.setOpaque(true);
                        frm.btnD1Cder30.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD5_der())) {
                        frm.btnD1Cder30.setOpaque(true);
                        frm.btnD1Cder30.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD5_der())) {
                        frm.btnD1Cder30.setOpaque(true);
                        frm.btnD1Cder30.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD5_inf())) {
                        frm.btnD1Cinf30.setOpaque(true);
                        frm.btnD1Cinf30.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD5_inf())) {
                        frm.btnD1Cinf30.setOpaque(true);
                        frm.btnD1Cinf30.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD5_inf())) {
                        frm.btnD1Cinf30.setOpaque(true);
                        frm.btnD1Cinf30.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD5_inf())) {
                        frm.btnD1Cinf30.setOpaque(true);
                        frm.btnD1Cinf30.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD5_inf())) {
                        frm.btnD1Cinf30.setOpaque(true);
                        frm.btnD1Cinf30.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD5_inf())) {
                        frm.btnD1Cinf30.setOpaque(true);
                        frm.btnD1Cinf30.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD5_inf())) {
                        frm.btnD1Cinf30.setOpaque(true);
                        frm.btnD1Cinf30.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD5_inf())) {
                        frm.btnD1Cinf30.setOpaque(true);
                        frm.btnD1Cinf30.setBackground(Color.WHITE);
                    }

                    //*****************
                    //*******************************DIENTE 6**********************************
                    //**********
                    //
                    if ("1".equals(mod.getD6_izq())) {
                        frm.btnD1Cizq31.setOpaque(true);
                        frm.btnD1Cizq31.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD6_izq())) {
                        frm.btnD1Cizq31.setOpaque(true);
                        frm.btnD1Cizq31.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD6_izq())) {
                        frm.btnD1Cizq31.setOpaque(true);
                        frm.btnD1Cizq31.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD6_izq())) {
                        frm.btnD1Cizq31.setOpaque(true);
                        frm.btnD1Cizq31.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD6_izq())) {
                        frm.btnD1Cizq31.setOpaque(true);
                        frm.btnD1Cizq31.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD6_izq())) {
                        frm.btnD1Cizq31.setOpaque(true);
                        frm.btnD1Cizq31.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD6_izq())) {
                        frm.btnD1Cizq31.setOpaque(true);
                        frm.btnD1Cizq31.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD6_izq())) {
                        frm.btnD1Cizq31.setOpaque(true);
                        frm.btnD1Cizq31.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD6_sup())) {
                        frm.btnD1Csup31.setOpaque(true);
                        frm.btnD1Csup31.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD6_sup())) {
                        frm.btnD1Csup31.setOpaque(true);
                        frm.btnD1Csup31.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD6_sup())) {
                        frm.btnD1Csup31.setOpaque(true);
                        frm.btnD1Csup31.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD6_sup())) {
                        frm.btnD1Csup31.setOpaque(true);
                        frm.btnD1Csup31.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD6_sup())) {
                        frm.btnD1Csup31.setOpaque(true);
                        frm.btnD1Csup31.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD6_sup())) {
                        frm.btnD1Csup31.setOpaque(true);
                        frm.btnD1Csup31.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD6_sup())) {
                        frm.btnD1Csup31.setOpaque(true);
                        frm.btnD1Csup31.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD6_sup())) {
                        frm.btnD1Csup31.setOpaque(true);
                        frm.btnD1Csup31.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD6_cen())) {
                        frm.btnD1Ccen31.setOpaque(true);
                        frm.btnD1Ccen31.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD6_cen())) {
                        frm.btnD1Ccen31.setOpaque(true);
                        frm.btnD1Ccen31.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD6_cen())) {
                        frm.btnD1Ccen31.setOpaque(true);
                        frm.btnD1Ccen31.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD6_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen31.getWidth(), frm.btnD1Ccen31.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen31.setIcon(icono);

                    }
                    if ("5".equals(mod.getD6_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen31.getWidth(), frm.btnD1Ccen31.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen31.setIcon(icono);
                    }
                    if ("6".equals(mod.getD6_cen())) {
                        frm.btnD1Ccen31.setOpaque(true);
                        frm.btnD1Ccen31.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD6_cen())) {
                        frm.btnD1Ccen31.setOpaque(true);
                        frm.btnD1Ccen31.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD6_cen())) {
                        frm.btnD1Ccen31.setOpaque(true);
                        frm.btnD1Ccen31.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD6_cen())) {
                        frm.btnD1Ccen31.setOpaque(true);
                        frm.btnD1Ccen31.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD6_cen())) {
                        frm.btnD1Ccen31.setOpaque(true);
                        frm.btnD1Ccen31.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD6_der())) {
                        frm.btnD1Cder31.setOpaque(true);
                        frm.btnD1Cder31.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD6_der())) {
                        frm.btnD1Cder31.setOpaque(true);
                        frm.btnD1Cder31.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD6_der())) {
                        frm.btnD1Cder31.setOpaque(true);
                        frm.btnD1Cder31.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD6_der())) {
                        frm.btnD1Cder31.setOpaque(true);
                        frm.btnD1Cder31.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD6_der())) {
                        frm.btnD1Cder31.setOpaque(true);
                        frm.btnD1Cder31.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD6_der())) {
                        frm.btnD1Cder31.setOpaque(true);
                        frm.btnD1Cder31.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD6_der())) {
                        frm.btnD1Cder31.setOpaque(true);
                        frm.btnD1Cder31.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD6_der())) {
                        frm.btnD1Cder31.setOpaque(true);
                        frm.btnD1Cder31.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD6_inf())) {
                        frm.btnD1Cinf31.setOpaque(true);
                        frm.btnD1Cinf31.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD6_inf())) {
                        frm.btnD1Cinf31.setOpaque(true);
                        frm.btnD1Cinf31.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD6_inf())) {
                        frm.btnD1Cinf31.setOpaque(true);
                        frm.btnD1Cinf31.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD6_inf())) {
                        frm.btnD1Cinf31.setOpaque(true);
                        frm.btnD1Cinf31.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD6_inf())) {
                        frm.btnD1Cinf31.setOpaque(true);
                        frm.btnD1Cinf31.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD6_inf())) {
                        frm.btnD1Cinf31.setOpaque(true);
                        frm.btnD1Cinf31.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD6_inf())) {
                        frm.btnD1Cinf31.setOpaque(true);
                        frm.btnD1Cinf31.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD6_inf())) {
                        frm.btnD1Cinf31.setOpaque(true);
                        frm.btnD1Cinf31.setBackground(Color.WHITE);
                    }

                    //*****************
                    //**********************************DIENTE 7
                    //**********
                    //
                    if ("1".equals(mod.getD7_izq())) {
                        frm.btnD1Cizq32.setOpaque(true);
                        frm.btnD1Cizq32.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD7_izq())) {
                        frm.btnD1Cizq32.setOpaque(true);
                        frm.btnD1Cizq32.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD7_izq())) {
                        frm.btnD1Cizq32.setOpaque(true);
                        frm.btnD1Cizq32.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD7_izq())) {
                        frm.btnD1Cizq32.setOpaque(true);
                        frm.btnD1Cizq32.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD7_izq())) {
                        frm.btnD1Cizq32.setOpaque(true);
                        frm.btnD1Cizq32.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD7_izq())) {
                        frm.btnD1Cizq32.setOpaque(true);
                        frm.btnD1Cizq32.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD7_izq())) {
                        frm.btnD1Cizq32.setOpaque(true);
                        frm.btnD1Cizq32.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD7_izq())) {
                        frm.btnD1Cizq32.setOpaque(true);
                        frm.btnD1Cizq32.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD7_sup())) {
                        frm.btnD1Csup32.setOpaque(true);
                        frm.btnD1Csup32.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD7_sup())) {
                        frm.btnD1Csup32.setOpaque(true);
                        frm.btnD1Csup32.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD7_sup())) {
                        frm.btnD1Csup32.setOpaque(true);
                        frm.btnD1Csup32.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD7_sup())) {
                        frm.btnD1Csup32.setOpaque(true);
                        frm.btnD1Csup32.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD7_sup())) {
                        frm.btnD1Csup32.setOpaque(true);
                        frm.btnD1Csup32.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD7_sup())) {
                        frm.btnD1Csup32.setOpaque(true);
                        frm.btnD1Csup32.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD7_sup())) {
                        frm.btnD1Csup32.setOpaque(true);
                        frm.btnD1Csup32.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD7_sup())) {
                        frm.btnD1Csup32.setOpaque(true);
                        frm.btnD1Csup32.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD7_cen())) {
                        frm.btnD1Ccen32.setOpaque(true);
                        frm.btnD1Ccen32.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD7_cen())) {
                        frm.btnD1Ccen32.setOpaque(true);
                        frm.btnD1Ccen32.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD7_cen())) {
                        frm.btnD1Ccen32.setOpaque(true);
                        frm.btnD1Ccen32.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD7_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen32.getWidth(), frm.btnD1Ccen32.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen32.setIcon(icono);

                    }
                    if ("5".equals(mod.getD7_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen32.getWidth(), frm.btnD1Ccen32.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen32.setIcon(icono);
                    }
                    if ("6".equals(mod.getD7_cen())) {
                        frm.btnD1Ccen32.setOpaque(true);
                        frm.btnD1Ccen32.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD7_cen())) {
                        frm.btnD1Ccen32.setOpaque(true);
                        frm.btnD1Ccen32.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD7_cen())) {
                        frm.btnD1Ccen32.setOpaque(true);
                        frm.btnD1Ccen32.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD7_cen())) {
                        frm.btnD1Ccen32.setOpaque(true);
                        frm.btnD1Ccen32.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD7_cen())) {
                        frm.btnD1Ccen32.setOpaque(true);
                        frm.btnD1Ccen32.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD7_der())) {
                        frm.btnD1Cder32.setOpaque(true);
                        frm.btnD1Cder32.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD7_der())) {
                        frm.btnD1Cder32.setOpaque(true);
                        frm.btnD1Cder32.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD7_der())) {
                        frm.btnD1Cder32.setOpaque(true);
                        frm.btnD1Cder32.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD7_der())) {
                        frm.btnD1Cder32.setOpaque(true);
                        frm.btnD1Cder32.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD7_der())) {
                        frm.btnD1Cder32.setOpaque(true);
                        frm.btnD1Cder32.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD7_der())) {
                        frm.btnD1Cder32.setOpaque(true);
                        frm.btnD1Cder32.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD7_der())) {
                        frm.btnD1Cder32.setOpaque(true);
                        frm.btnD1Cder32.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD7_der())) {
                        frm.btnD1Cder32.setOpaque(true);
                        frm.btnD1Cder32.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD7_inf())) {
                        frm.btnD1Cinf32.setOpaque(true);
                        frm.btnD1Cinf32.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD7_inf())) {
                        frm.btnD1Cinf32.setOpaque(true);
                        frm.btnD1Cinf32.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD7_inf())) {
                        frm.btnD1Cinf32.setOpaque(true);
                        frm.btnD1Cinf32.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD7_inf())) {
                        frm.btnD1Cinf32.setOpaque(true);
                        frm.btnD1Cinf32.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD7_inf())) {
                        frm.btnD1Cinf32.setOpaque(true);
                        frm.btnD1Cinf32.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD7_inf())) {
                        frm.btnD1Cinf32.setOpaque(true);
                        frm.btnD1Cinf32.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD7_inf())) {
                        frm.btnD1Cinf32.setOpaque(true);
                        frm.btnD1Cinf32.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD7_inf())) {
                        frm.btnD1Cinf32.setOpaque(true);
                        frm.btnD1Cinf32.setBackground(Color.WHITE);
                    }

                    //*****************
                    //**********************************DIENTE 8
                    //**********
                    //
                    if ("1".equals(mod.getD8_izq())) {
                        frm.btnD1Cizq33.setOpaque(true);
                        frm.btnD1Cizq33.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD8_izq())) {
                        frm.btnD1Cizq33.setOpaque(true);
                        frm.btnD1Cizq33.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD8_izq())) {
                        frm.btnD1Cizq33.setOpaque(true);
                        frm.btnD1Cizq33.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD8_izq())) {
                        frm.btnD1Cizq33.setOpaque(true);
                        frm.btnD1Cizq33.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD8_izq())) {
                        frm.btnD1Cizq33.setOpaque(true);
                        frm.btnD1Cizq33.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD8_izq())) {
                        frm.btnD1Cizq33.setOpaque(true);
                        frm.btnD1Cizq33.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD8_izq())) {
                        frm.btnD1Cizq33.setOpaque(true);
                        frm.btnD1Cizq33.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD8_izq())) {
                        frm.btnD1Cizq33.setOpaque(true);
                        frm.btnD1Cizq33.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD8_sup())) {
                        frm.btnD1Csup33.setOpaque(true);
                        frm.btnD1Csup33.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD8_sup())) {
                        frm.btnD1Csup33.setOpaque(true);
                        frm.btnD1Csup33.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD8_sup())) {
                        frm.btnD1Csup33.setOpaque(true);
                        frm.btnD1Csup33.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD8_sup())) {
                        frm.btnD1Csup33.setOpaque(true);
                        frm.btnD1Csup33.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD8_sup())) {
                        frm.btnD1Csup33.setOpaque(true);
                        frm.btnD1Csup33.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD8_sup())) {
                        frm.btnD1Csup33.setOpaque(true);
                        frm.btnD1Csup33.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD8_sup())) {
                        frm.btnD1Csup33.setOpaque(true);
                        frm.btnD1Csup33.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD8_sup())) {
                        frm.btnD1Csup33.setOpaque(true);
                        frm.btnD1Csup33.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD8_cen())) {
                        frm.btnD1Ccen33.setOpaque(true);
                        frm.btnD1Ccen33.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD8_cen())) {
                        frm.btnD1Ccen33.setOpaque(true);
                        frm.btnD1Ccen33.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD8_cen())) {
                        frm.btnD1Ccen33.setOpaque(true);
                        frm.btnD1Ccen33.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD8_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen33.getWidth(), frm.btnD1Ccen33.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen33.setIcon(icono);

                    }
                    if ("5".equals(mod.getD8_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen33.getWidth(), frm.btnD1Ccen33.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen33.setIcon(icono);
                    }
                    if ("6".equals(mod.getD8_cen())) {
                        frm.btnD1Ccen33.setOpaque(true);
                        frm.btnD1Ccen33.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD8_cen())) {
                        frm.btnD1Ccen33.setOpaque(true);
                        frm.btnD1Ccen33.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD8_cen())) {
                        frm.btnD1Ccen33.setOpaque(true);
                        frm.btnD1Ccen33.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD8_cen())) {
                        frm.btnD1Ccen33.setOpaque(true);
                        frm.btnD1Ccen33.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD8_cen())) {
                        frm.btnD1Ccen33.setOpaque(true);
                        frm.btnD1Ccen33.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD8_der())) {
                        frm.btnD1Cder33.setOpaque(true);
                        frm.btnD1Cder33.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD8_der())) {
                        frm.btnD1Cder33.setOpaque(true);
                        frm.btnD1Cder33.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD8_der())) {
                        frm.btnD1Cder33.setOpaque(true);
                        frm.btnD1Cder33.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD8_der())) {
                        frm.btnD1Cder33.setOpaque(true);
                        frm.btnD1Cder33.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD8_der())) {
                        frm.btnD1Cder33.setOpaque(true);
                        frm.btnD1Cder33.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD8_der())) {
                        frm.btnD1Cder33.setOpaque(true);
                        frm.btnD1Cder33.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD8_der())) {
                        frm.btnD1Cder33.setOpaque(true);
                        frm.btnD1Cder33.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD8_der())) {
                        frm.btnD1Cder33.setOpaque(true);
                        frm.btnD1Cder33.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD8_inf())) {
                        frm.btnD1Cinf33.setOpaque(true);
                        frm.btnD1Cinf33.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD8_inf())) {
                        frm.btnD1Cinf33.setOpaque(true);
                        frm.btnD1Cinf33.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD8_inf())) {
                        frm.btnD1Cinf33.setOpaque(true);
                        frm.btnD1Cinf33.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD8_inf())) {
                        frm.btnD1Cinf33.setOpaque(true);
                        frm.btnD1Cinf33.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD8_inf())) {
                        frm.btnD1Cinf33.setOpaque(true);
                        frm.btnD1Cinf33.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD8_inf())) {
                        frm.btnD1Cinf33.setOpaque(true);
                        frm.btnD1Cinf33.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD8_inf())) {
                        frm.btnD1Cinf33.setOpaque(true);
                        frm.btnD1Cinf33.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD8_inf())) {
                        frm.btnD1Cinf33.setOpaque(true);
                        frm.btnD1Cinf33.setBackground(Color.WHITE);
                    }

                    //*****************
                    //************************** DIENTE 9
                    if ("1".equals(mod.getD9_izq())) {
                        frm.btnD1Cizq39.setOpaque(true);
                        frm.btnD1Cizq39.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD9_izq())) {
                        frm.btnD1Cizq39.setOpaque(true);
                        frm.btnD1Cizq39.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD9_izq())) {
                        frm.btnD1Cizq39.setOpaque(true);
                        frm.btnD1Cizq39.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD9_izq())) {
                        frm.btnD1Cizq39.setOpaque(true);
                        frm.btnD1Cizq39.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD9_izq())) {
                        frm.btnD1Cizq39.setOpaque(true);
                        frm.btnD1Cizq39.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD9_izq())) {
                        frm.btnD1Cizq39.setOpaque(true);
                        frm.btnD1Cizq39.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD9_izq())) {
                        frm.btnD1Cizq39.setOpaque(true);
                        frm.btnD1Cizq39.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD9_izq())) {
                        frm.btnD1Cizq39.setOpaque(true);
                        frm.btnD1Cizq39.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD9_sup())) {
                        frm.btnD1Csup39.setOpaque(true);
                        frm.btnD1Csup39.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD9_sup())) {
                        frm.btnD1Csup39.setOpaque(true);
                        frm.btnD1Csup39.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD9_sup())) {
                        frm.btnD1Csup39.setOpaque(true);
                        frm.btnD1Csup39.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD9_sup())) {
                        frm.btnD1Csup39.setOpaque(true);
                        frm.btnD1Csup39.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD9_sup())) {
                        frm.btnD1Csup39.setOpaque(true);
                        frm.btnD1Csup39.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD9_sup())) {
                        frm.btnD1Csup39.setOpaque(true);
                        frm.btnD1Csup39.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD9_sup())) {
                        frm.btnD1Csup39.setOpaque(true);
                        frm.btnD1Csup39.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD9_sup())) {
                        frm.btnD1Csup39.setOpaque(true);
                        frm.btnD1Csup39.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD9_cen())) {
                        frm.btnD1Ccen39.setOpaque(true);
                        frm.btnD1Ccen39.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD9_cen())) {
                        frm.btnD1Ccen39.setOpaque(true);
                        frm.btnD1Ccen39.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD9_cen())) {
                        frm.btnD1Ccen39.setOpaque(true);
                        frm.btnD1Ccen39.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD9_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen39.getWidth(), frm.btnD1Ccen39.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen39.setIcon(icono);

                    }
                    if ("5".equals(mod.getD9_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen39.getWidth(), frm.btnD1Ccen39.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen39.setIcon(icono);
                    }
                    if ("6".equals(mod.getD9_cen())) {
                        frm.btnD1Ccen39.setOpaque(true);
                        frm.btnD1Ccen39.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD9_cen())) {
                        frm.btnD1Ccen39.setOpaque(true);
                        frm.btnD1Ccen39.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD9_cen())) {
                        frm.btnD1Ccen39.setOpaque(true);
                        frm.btnD1Ccen39.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD9_cen())) {
                        frm.btnD1Ccen39.setOpaque(true);
                        frm.btnD1Ccen39.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD9_cen())) {
                        frm.btnD1Ccen39.setOpaque(true);
                        frm.btnD1Ccen39.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD9_der())) {
                        frm.btnD1Cder39.setOpaque(true);
                        frm.btnD1Cder39.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD9_der())) {
                        frm.btnD1Cder39.setOpaque(true);
                        frm.btnD1Cder39.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD9_der())) {
                        frm.btnD1Cder39.setOpaque(true);
                        frm.btnD1Cder39.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD9_der())) {
                        frm.btnD1Cder39.setOpaque(true);
                        frm.btnD1Cder39.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD9_der())) {
                        frm.btnD1Cder39.setOpaque(true);
                        frm.btnD1Cder39.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD9_der())) {
                        frm.btnD1Cder39.setOpaque(true);
                        frm.btnD1Cder39.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD9_der())) {
                        frm.btnD1Cder39.setOpaque(true);
                        frm.btnD1Cder39.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD9_der())) {
                        frm.btnD1Cder39.setOpaque(true);
                        frm.btnD1Cder39.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD9_inf())) {
                        frm.btnD1Cinf39.setOpaque(true);
                        frm.btnD1Cinf39.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD9_inf())) {
                        frm.btnD1Cinf39.setOpaque(true);
                        frm.btnD1Cinf39.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD9_inf())) {
                        frm.btnD1Cinf39.setOpaque(true);
                        frm.btnD1Cinf39.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD9_inf())) {
                        frm.btnD1Cinf39.setOpaque(true);
                        frm.btnD1Cinf39.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD9_inf())) {
                        frm.btnD1Cinf39.setOpaque(true);
                        frm.btnD1Cinf39.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD9_inf())) {
                        frm.btnD1Cinf39.setOpaque(true);
                        frm.btnD1Cinf39.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD9_inf())) {
                        frm.btnD1Cinf39.setOpaque(true);
                        frm.btnD1Cinf39.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD9_inf())) {
                        frm.btnD1Cinf39.setOpaque(true);
                        frm.btnD1Cinf39.setBackground(Color.WHITE);
                    }

                    //*****************
                    //****************************************DIENTE 10*******************************************
                    if ("1".equals(mod.getD10_izq())) {
                        frm.btnD1Cinf40.setOpaque(true);
                        frm.btnD1Cinf40.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD10_izq())) {
                        frm.btnD1Cinf40.setOpaque(true);
                        frm.btnD1Cinf40.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD10_izq())) {
                        frm.btnD1Cinf40.setOpaque(true);
                        frm.btnD1Cinf40.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD10_izq())) {
                        frm.btnD1Cinf40.setOpaque(true);
                        frm.btnD1Cinf40.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD10_izq())) {
                        frm.btnD1Cinf40.setOpaque(true);
                        frm.btnD1Cinf40.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD10_izq())) {
                        frm.btnD1Cinf40.setOpaque(true);
                        frm.btnD1Cinf40.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD10_izq())) {
                        frm.btnD1Cinf40.setOpaque(true);
                        frm.btnD1Cinf40.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD10_izq())) {
                        frm.btnD1Cinf40.setOpaque(true);
                        frm.btnD1Cinf40.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD10_sup())) {
                        frm.btnD1Csup40.setOpaque(true);
                        frm.btnD1Csup40.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD10_sup())) {
                        frm.btnD1Csup40.setOpaque(true);
                        frm.btnD1Csup40.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD10_sup())) {
                        frm.btnD1Csup40.setOpaque(true);
                        frm.btnD1Csup40.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD10_sup())) {
                        frm.btnD1Csup40.setOpaque(true);
                        frm.btnD1Csup40.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD10_sup())) {
                        frm.btnD1Csup40.setOpaque(true);
                        frm.btnD1Csup40.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD10_sup())) {
                        frm.btnD1Csup40.setOpaque(true);
                        frm.btnD1Csup40.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD10_sup())) {
                        frm.btnD1Csup40.setOpaque(true);
                        frm.btnD1Csup40.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD10_sup())) {
                        frm.btnD1Csup40.setOpaque(true);
                        frm.btnD1Csup40.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD10_cen())) {
                        frm.btnD1Ccen40.setOpaque(true);
                        frm.btnD1Ccen40.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD10_cen())) {
                        frm.btnD1Ccen40.setOpaque(true);
                        frm.btnD1Ccen40.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD10_cen())) {
                        frm.btnD1Ccen40.setOpaque(true);
                        frm.btnD1Ccen40.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD10_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen40.getWidth(), frm.btnD1Ccen40.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen40.setIcon(icono);

                    }
                    if ("5".equals(mod.getD10_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen40.getWidth(), frm.btnD1Ccen40.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen40.setIcon(icono);
                    }
                    if ("6".equals(mod.getD10_cen())) {
                        frm.btnD1Ccen40.setOpaque(true);
                        frm.btnD1Ccen40.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD10_cen())) {
                        frm.btnD1Ccen40.setOpaque(true);
                        frm.btnD1Ccen40.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD10_cen())) {
                        frm.btnD1Ccen40.setOpaque(true);
                        frm.btnD1Ccen40.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD10_cen())) {
                        frm.btnD1Ccen40.setOpaque(true);
                        frm.btnD1Ccen40.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD10_cen())) {
                        frm.btnD1Ccen40.setOpaque(true);
                        frm.btnD1Ccen40.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD10_der())) {
                        frm.btnD1Cder40.setOpaque(true);
                        frm.btnD1Cder40.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD10_der())) {
                        frm.btnD1Cder40.setOpaque(true);
                        frm.btnD1Cder40.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD10_der())) {
                        frm.btnD1Cder40.setOpaque(true);
                        frm.btnD1Cder40.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD10_der())) {
                        frm.btnD1Cder40.setOpaque(true);
                        frm.btnD1Cder40.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD10_der())) {
                        frm.btnD1Cder40.setOpaque(true);
                        frm.btnD1Cder40.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD10_der())) {
                        frm.btnD1Cder40.setOpaque(true);
                        frm.btnD1Cder40.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD10_der())) {
                        frm.btnD1Cder40.setOpaque(true);
                        frm.btnD1Cder40.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD10_der())) {
                        frm.btnD1Cder40.setOpaque(true);
                        frm.btnD1Cder40.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD10_inf())) {
                        frm.btnD1Cinf40.setOpaque(true);
                        frm.btnD1Cinf40.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD10_inf())) {
                        frm.btnD1Cinf40.setOpaque(true);
                        frm.btnD1Cinf40.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD10_inf())) {
                        frm.btnD1Cinf40.setOpaque(true);
                        frm.btnD1Cinf40.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD10_inf())) {
                        frm.btnD1Cinf40.setOpaque(true);
                        frm.btnD1Cinf40.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD10_inf())) {
                        frm.btnD1Cinf40.setOpaque(true);
                        frm.btnD1Cinf40.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD10_inf())) {
                        frm.btnD1Cinf40.setOpaque(true);
                        frm.btnD1Cinf40.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD10_inf())) {
                        frm.btnD1Cinf40.setOpaque(true);
                        frm.btnD1Cinf40.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD10_inf())) {
                        frm.btnD1Cinf40.setOpaque(true);
                        frm.btnD1Cinf40.setBackground(Color.WHITE);
                    }
                    //*****************
                    //*****************************************
                    //DIENTE 11*******************************************
                    if ("1".equals(mod.getD11_izq())) {
                        frm.btnD1Cizq41.setOpaque(true);
                        frm.btnD1Cizq41.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD11_izq())) {
                        frm.btnD1Cizq41.setOpaque(true);
                        frm.btnD1Cizq41.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD11_izq())) {
                        frm.btnD1Cizq41.setOpaque(true);
                        frm.btnD1Cizq41.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD11_izq())) {
                        frm.btnD1Cizq41.setOpaque(true);
                        frm.btnD1Cizq41.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD11_izq())) {
                        frm.btnD1Cizq41.setOpaque(true);
                        frm.btnD1Cizq41.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD11_izq())) {
                        frm.btnD1Cizq41.setOpaque(true);
                        frm.btnD1Cizq41.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD11_izq())) {
                        frm.btnD1Cizq41.setOpaque(true);
                        frm.btnD1Cizq41.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD11_izq())) {
                        frm.btnD1Cizq41.setOpaque(true);
                        frm.btnD1Cizq41.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD11_sup())) {
                        frm.btnD1Csup41.setOpaque(true);
                        frm.btnD1Csup41.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD11_sup())) {
                        frm.btnD1Csup41.setOpaque(true);
                        frm.btnD1Csup41.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD11_sup())) {
                        frm.btnD1Csup41.setOpaque(true);
                        frm.btnD1Csup41.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD11_sup())) {
                        frm.btnD1Csup41.setOpaque(true);
                        frm.btnD1Csup41.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD11_sup())) {
                        frm.btnD1Csup41.setOpaque(true);
                        frm.btnD1Csup41.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD11_sup())) {
                        frm.btnD1Csup41.setOpaque(true);
                        frm.btnD1Csup41.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD11_sup())) {
                        frm.btnD1Csup41.setOpaque(true);
                        frm.btnD1Csup41.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD11_sup())) {
                        frm.btnD1Csup41.setOpaque(true);
                        frm.btnD1Csup41.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD11_cen())) {
                        frm.btnD1Ccen41.setOpaque(true);
                        frm.btnD1Ccen41.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD11_cen())) {
                        frm.btnD1Ccen41.setOpaque(true);
                        frm.btnD1Ccen41.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD11_cen())) {
                        frm.btnD1Ccen41.setOpaque(true);
                        frm.btnD1Ccen41.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD11_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen41.getWidth(), frm.btnD1Ccen41.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen41.setIcon(icono);

                    }
                    if ("5".equals(mod.getD11_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen41.getWidth(), frm.btnD1Ccen41.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen41.setIcon(icono);
                    }
                    if ("6".equals(mod.getD11_cen())) {
                        frm.btnD1Ccen41.setOpaque(true);
                        frm.btnD1Ccen41.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD11_cen())) {
                        frm.btnD1Ccen41.setOpaque(true);
                        frm.btnD1Ccen41.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD11_cen())) {
                        frm.btnD1Ccen41.setOpaque(true);
                        frm.btnD1Ccen41.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD11_cen())) {
                        frm.btnD1Ccen41.setOpaque(true);
                        frm.btnD1Ccen41.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD11_cen())) {
                        frm.btnD1Ccen41.setOpaque(true);
                        frm.btnD1Ccen41.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD11_der())) {
                        frm.btnD1Cder41.setOpaque(true);
                        frm.btnD1Cder41.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD11_der())) {
                        frm.btnD1Cder41.setOpaque(true);
                        frm.btnD1Cder41.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD11_der())) {
                        frm.btnD1Cder41.setOpaque(true);
                        frm.btnD1Cder41.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD11_der())) {
                        frm.btnD1Cder41.setOpaque(true);
                        frm.btnD1Cder41.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD11_der())) {
                        frm.btnD1Cder41.setOpaque(true);
                        frm.btnD1Cder41.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD11_der())) {
                        frm.btnD1Cder41.setOpaque(true);
                        frm.btnD1Cder41.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD11_der())) {
                        frm.btnD1Cder41.setOpaque(true);
                        frm.btnD1Cder41.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD11_der())) {
                        frm.btnD1Cder41.setOpaque(true);
                        frm.btnD1Cder41.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD11_inf())) {
                        frm.btnD1Cinf41.setOpaque(true);
                        frm.btnD1Cinf41.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD11_inf())) {
                        frm.btnD1Cinf41.setOpaque(true);
                        frm.btnD1Cinf41.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD11_inf())) {
                        frm.btnD1Cinf41.setOpaque(true);
                        frm.btnD1Cinf41.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD11_inf())) {
                        frm.btnD1Cinf41.setOpaque(true);
                        frm.btnD1Cinf41.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD11_inf())) {
                        frm.btnD1Cinf41.setOpaque(true);
                        frm.btnD1Cinf41.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD11_inf())) {
                        frm.btnD1Cinf41.setOpaque(true);
                        frm.btnD1Cinf41.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD11_inf())) {
                        frm.btnD1Cinf41.setOpaque(true);
                        frm.btnD1Cinf41.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD11_inf())) {
                        frm.btnD1Cinf41.setOpaque(true);
                        frm.btnD1Cinf41.setBackground(Color.WHITE);
                    }

                    //************************************
                    //***************************************** DIENTE 12 **************************
                    if ("1".equals(mod.getD12_izq())) {
                        frm.btnD1Cizq42.setOpaque(true);
                        frm.btnD1Cizq42.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD12_izq())) {
                        frm.btnD1Cizq42.setOpaque(true);
                        frm.btnD1Cizq42.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD12_izq())) {
                        frm.btnD1Cizq42.setOpaque(true);
                        frm.btnD1Cizq42.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD12_izq())) {
                        frm.btnD1Cizq42.setOpaque(true);
                        frm.btnD1Cizq42.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD12_izq())) {
                        frm.btnD1Cizq42.setOpaque(true);
                        frm.btnD1Cizq42.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD12_izq())) {
                        frm.btnD1Cizq42.setOpaque(true);
                        frm.btnD1Cizq42.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD12_izq())) {
                        frm.btnD1Cizq42.setOpaque(true);
                        frm.btnD1Cizq42.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD12_izq())) {
                        frm.btnD1Cizq42.setOpaque(true);
                        frm.btnD1Cizq42.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD12_sup())) {
                        frm.btnD1Csup42.setOpaque(true);
                        frm.btnD1Csup42.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD12_sup())) {
                        frm.btnD1Csup42.setOpaque(true);
                        frm.btnD1Csup42.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD12_sup())) {
                        frm.btnD1Csup42.setOpaque(true);
                        frm.btnD1Csup42.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD12_sup())) {
                        frm.btnD1Csup42.setOpaque(true);
                        frm.btnD1Csup42.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD12_sup())) {
                        frm.btnD1Csup42.setOpaque(true);
                        frm.btnD1Csup42.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD12_sup())) {
                        frm.btnD1Csup42.setOpaque(true);
                        frm.btnD1Csup42.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD12_sup())) {
                        frm.btnD1Csup42.setOpaque(true);
                        frm.btnD1Csup42.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD12_sup())) {
                        frm.btnD1Csup42.setOpaque(true);
                        frm.btnD1Csup42.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD12_cen())) {
                        frm.btnD1Ccen42.setOpaque(true);
                        frm.btnD1Ccen42.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD12_cen())) {
                        frm.btnD1Ccen42.setOpaque(true);
                        frm.btnD1Ccen42.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD12_cen())) {
                        frm.btnD1Ccen42.setOpaque(true);
                        frm.btnD1Ccen42.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD12_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen42.getWidth(), frm.btnD1Ccen42.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen42.setIcon(icono);

                    }
                    if ("5".equals(mod.getD12_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen42.getWidth(), frm.btnD1Ccen42.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen42.setIcon(icono);
                    }
                    if ("6".equals(mod.getD12_cen())) {
                        frm.btnD1Ccen42.setOpaque(true);
                        frm.btnD1Ccen42.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD12_cen())) {
                        frm.btnD1Ccen42.setOpaque(true);
                        frm.btnD1Ccen42.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD12_cen())) {
                        frm.btnD1Ccen42.setOpaque(true);
                        frm.btnD1Ccen42.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD12_cen())) {
                        frm.btnD1Ccen42.setOpaque(true);
                        frm.btnD1Ccen42.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD12_cen())) {
                        frm.btnD1Ccen42.setOpaque(true);
                        frm.btnD1Ccen42.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD12_der())) {
                        frm.btnD1Cder42.setOpaque(true);
                        frm.btnD1Cder42.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD12_der())) {
                        frm.btnD1Cder42.setOpaque(true);
                        frm.btnD1Cder42.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD12_der())) {
                        frm.btnD1Cder42.setOpaque(true);
                        frm.btnD1Cder42.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD12_der())) {
                        frm.btnD1Cder42.setOpaque(true);
                        frm.btnD1Cder42.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD12_der())) {
                        frm.btnD1Cder42.setOpaque(true);
                        frm.btnD1Cder42.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD12_der())) {
                        frm.btnD1Cder42.setOpaque(true);
                        frm.btnD1Cder42.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD12_der())) {
                        frm.btnD1Cder42.setOpaque(true);
                        frm.btnD1Cder42.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD12_der())) {
                        frm.btnD1Cder42.setOpaque(true);
                        frm.btnD1Cder42.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD12_inf())) {
                        frm.btnD1Cinf42.setOpaque(true);
                        frm.btnD1Cinf42.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD12_inf())) {
                        frm.btnD1Cinf42.setOpaque(true);
                        frm.btnD1Cinf42.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD12_inf())) {
                        frm.btnD1Cinf42.setOpaque(true);
                        frm.btnD1Cinf42.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD12_inf())) {
                        frm.btnD1Cinf42.setOpaque(true);
                        frm.btnD1Cinf42.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD12_inf())) {
                        frm.btnD1Cinf42.setOpaque(true);
                        frm.btnD1Cinf42.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD12_inf())) {
                        frm.btnD1Cinf42.setOpaque(true);
                        frm.btnD1Cinf42.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD12_inf())) {
                        frm.btnD1Cinf42.setOpaque(true);
                        frm.btnD1Cinf42.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD12_inf())) {
                        frm.btnD1Cinf42.setOpaque(true);
                        frm.btnD1Cinf42.setBackground(Color.WHITE);
                    }
                    //******************************************************************************
                    //*********************************************** DIENTE 13 ********************************
                    if ("1".equals(mod.getD13_izq())) {
                        frm.btnD1Cizq43.setOpaque(true);
                        frm.btnD1Cizq43.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD13_izq())) {
                        frm.btnD1Cizq43.setOpaque(true);
                        frm.btnD1Cizq43.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD13_izq())) {
                        frm.btnD1Cizq43.setOpaque(true);
                        frm.btnD1Cizq43.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD13_izq())) {
                        frm.btnD1Cizq43.setOpaque(true);
                        frm.btnD1Cizq43.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD13_izq())) {
                        frm.btnD1Cizq43.setOpaque(true);
                        frm.btnD1Cizq43.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD13_izq())) {
                        frm.btnD1Cizq43.setOpaque(true);
                        frm.btnD1Cizq43.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD13_izq())) {
                        frm.btnD1Cizq43.setOpaque(true);
                        frm.btnD1Cizq43.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD13_izq())) {
                        frm.btnD1Cizq43.setOpaque(true);
                        frm.btnD1Cizq43.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD13_sup())) {
                        frm.btnD1Csup43.setOpaque(true);
                        frm.btnD1Csup43.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD13_sup())) {
                        frm.btnD1Csup43.setOpaque(true);
                        frm.btnD1Csup43.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD13_sup())) {
                        frm.btnD1Csup43.setOpaque(true);
                        frm.btnD1Csup43.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD13_sup())) {
                        frm.btnD1Csup43.setOpaque(true);
                        frm.btnD1Csup43.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD13_sup())) {
                        frm.btnD1Csup43.setOpaque(true);
                        frm.btnD1Csup43.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD13_sup())) {
                        frm.btnD1Csup43.setOpaque(true);
                        frm.btnD1Csup43.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD13_sup())) {
                        frm.btnD1Csup43.setOpaque(true);
                        frm.btnD1Csup43.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD13_sup())) {
                        frm.btnD1Csup43.setOpaque(true);
                        frm.btnD1Csup43.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD13_cen())) {
                        frm.btnD1Ccen43.setOpaque(true);
                        frm.btnD1Ccen43.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD13_cen())) {
                        frm.btnD1Ccen43.setOpaque(true);
                        frm.btnD1Ccen43.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD13_cen())) {
                        frm.btnD1Ccen43.setOpaque(true);
                        frm.btnD1Ccen43.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD13_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen43.getWidth(), frm.btnD1Ccen43.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen43.setIcon(icono);

                    }
                    if ("5".equals(mod.getD13_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen43.getWidth(), frm.btnD1Ccen43.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen43.setIcon(icono);
                    }
                    if ("6".equals(mod.getD13_cen())) {
                        frm.btnD1Ccen43.setOpaque(true);
                        frm.btnD1Ccen43.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD13_cen())) {
                        frm.btnD1Ccen43.setOpaque(true);
                        frm.btnD1Ccen43.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD13_cen())) {
                        frm.btnD1Ccen43.setOpaque(true);
                        frm.btnD1Ccen43.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD13_cen())) {
                        frm.btnD1Ccen43.setOpaque(true);
                        frm.btnD1Ccen43.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD13_cen())) {
                        frm.btnD1Ccen43.setOpaque(true);
                        frm.btnD1Ccen43.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD13_der())) {
                        frm.btnD1Cder43.setOpaque(true);
                        frm.btnD1Cder43.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD13_der())) {
                        frm.btnD1Cder43.setOpaque(true);
                        frm.btnD1Cder43.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD13_der())) {
                        frm.btnD1Cder43.setOpaque(true);
                        frm.btnD1Cder43.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD13_der())) {
                        frm.btnD1Cder43.setOpaque(true);
                        frm.btnD1Cder43.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD13_der())) {
                        frm.btnD1Cder43.setOpaque(true);
                        frm.btnD1Cder43.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD13_der())) {
                        frm.btnD1Cder43.setOpaque(true);
                        frm.btnD1Cder43.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD13_der())) {
                        frm.btnD1Cder43.setOpaque(true);
                        frm.btnD1Cder43.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD13_der())) {
                        frm.btnD1Cder43.setOpaque(true);
                        frm.btnD1Cder43.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD13_inf())) {
                        frm.btnD1Cinf43.setOpaque(true);
                        frm.btnD1Cinf43.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD13_inf())) {
                        frm.btnD1Cinf43.setOpaque(true);
                        frm.btnD1Cinf43.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD13_inf())) {
                        frm.btnD1Cinf43.setOpaque(true);
                        frm.btnD1Cinf43.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD13_inf())) {
                        frm.btnD1Cinf43.setOpaque(true);
                        frm.btnD1Cinf43.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD13_inf())) {
                        frm.btnD1Cinf43.setOpaque(true);
                        frm.btnD1Cinf43.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD13_inf())) {
                        frm.btnD1Cinf43.setOpaque(true);
                        frm.btnD1Cinf43.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD13_inf())) {
                        frm.btnD1Cinf43.setOpaque(true);
                        frm.btnD1Cinf43.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD13_inf())) {
                        frm.btnD1Cinf43.setOpaque(true);
                        frm.btnD1Cinf43.setBackground(Color.WHITE);
                    }
                    //******************************************************************************************

                    //***************************************************DIENTE 14 ****************************
                    if ("1".equals(mod.getD14_izq())) {
                        frm.btnD1Cizq44.setOpaque(true);
                        frm.btnD1Cizq44.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD14_izq())) {
                        frm.btnD1Cizq44.setOpaque(true);
                        frm.btnD1Cizq44.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD14_izq())) {
                        frm.btnD1Cizq44.setOpaque(true);
                        frm.btnD1Cizq44.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD14_izq())) {
                        frm.btnD1Cizq44.setOpaque(true);
                        frm.btnD1Cizq44.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD14_izq())) {
                        frm.btnD1Cizq44.setOpaque(true);
                        frm.btnD1Cizq44.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD14_izq())) {
                        frm.btnD1Cizq44.setOpaque(true);
                        frm.btnD1Cizq44.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD14_izq())) {
                        frm.btnD1Cizq44.setOpaque(true);
                        frm.btnD1Cizq44.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD14_izq())) {
                        frm.btnD1Cizq44.setOpaque(true);
                        frm.btnD1Cizq44.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD14_sup())) {
                        frm.btnD1Csup44.setOpaque(true);
                        frm.btnD1Csup44.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD14_sup())) {
                        frm.btnD1Csup44.setOpaque(true);
                        frm.btnD1Csup44.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD14_sup())) {
                        frm.btnD1Csup44.setOpaque(true);
                        frm.btnD1Csup44.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD14_sup())) {
                        frm.btnD1Csup44.setOpaque(true);
                        frm.btnD1Csup44.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD14_sup())) {
                        frm.btnD1Csup44.setOpaque(true);
                        frm.btnD1Csup44.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD14_sup())) {
                        frm.btnD1Csup44.setOpaque(true);
                        frm.btnD1Csup44.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD14_sup())) {
                        frm.btnD1Csup44.setOpaque(true);
                        frm.btnD1Csup44.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD14_sup())) {
                        frm.btnD1Csup44.setOpaque(true);
                        frm.btnD1Csup44.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD14_cen())) {
                        frm.btnD1Ccen44.setOpaque(true);
                        frm.btnD1Ccen44.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD14_cen())) {
                        frm.btnD1Ccen44.setOpaque(true);
                        frm.btnD1Ccen44.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD14_cen())) {
                        frm.btnD1Ccen44.setOpaque(true);
                        frm.btnD1Ccen44.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD14_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen44.getWidth(), frm.btnD1Ccen44.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen44.setIcon(icono);

                    }
                    if ("5".equals(mod.getD14_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen44.getWidth(), frm.btnD1Ccen44.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen44.setIcon(icono);
                    }
                    if ("6".equals(mod.getD14_cen())) {
                        frm.btnD1Ccen44.setOpaque(true);
                        frm.btnD1Ccen44.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD14_cen())) {
                        frm.btnD1Ccen44.setOpaque(true);
                        frm.btnD1Ccen44.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD14_cen())) {
                        frm.btnD1Ccen44.setOpaque(true);
                        frm.btnD1Ccen44.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD14_cen())) {
                        frm.btnD1Ccen44.setOpaque(true);
                        frm.btnD1Ccen44.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD14_cen())) {
                        frm.btnD1Ccen44.setOpaque(true);
                        frm.btnD1Ccen44.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD14_der())) {
                        frm.btnD1Cder44.setOpaque(true);
                        frm.btnD1Cder44.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD14_der())) {
                        frm.btnD1Cder44.setOpaque(true);
                        frm.btnD1Cder44.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD14_der())) {
                        frm.btnD1Cder44.setOpaque(true);
                        frm.btnD1Cder44.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD14_der())) {
                        frm.btnD1Cder44.setOpaque(true);
                        frm.btnD1Cder44.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD14_der())) {
                        frm.btnD1Cder44.setOpaque(true);
                        frm.btnD1Cder44.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD14_der())) {
                        frm.btnD1Cder44.setOpaque(true);
                        frm.btnD1Cder44.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD14_der())) {
                        frm.btnD1Cder44.setOpaque(true);
                        frm.btnD1Cder44.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD14_der())) {
                        frm.btnD1Cder44.setOpaque(true);
                        frm.btnD1Cder44.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD14_inf())) {
                        frm.btnD1Cinf44.setOpaque(true);
                        frm.btnD1Cinf44.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD14_inf())) {
                        frm.btnD1Cinf44.setOpaque(true);
                        frm.btnD1Cinf44.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD14_inf())) {
                        frm.btnD1Cinf44.setOpaque(true);
                        frm.btnD1Cinf44.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD14_inf())) {
                        frm.btnD1Cinf44.setOpaque(true);
                        frm.btnD1Cinf44.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD14_inf())) {
                        frm.btnD1Cinf44.setOpaque(true);
                        frm.btnD1Cinf44.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD14_inf())) {
                        frm.btnD1Cinf44.setOpaque(true);
                        frm.btnD1Cinf44.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD14_inf())) {
                        frm.btnD1Cinf44.setOpaque(true);
                        frm.btnD1Cinf44.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD14_inf())) {
                        frm.btnD1Cinf44.setOpaque(true);
                        frm.btnD1Cinf44.setBackground(Color.WHITE);
                    }
                    //******************************************************************************************

                    //***************************************************DIENTE 15 ****************************
                    if ("1".equals(mod.getD15_izq())) {
                        frm.btnD1Cizq45.setOpaque(true);
                        frm.btnD1Cizq45.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD15_izq())) {
                        frm.btnD1Cizq45.setOpaque(true);
                        frm.btnD1Cizq45.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD15_izq())) {
                        frm.btnD1Cizq45.setOpaque(true);
                        frm.btnD1Cizq45.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD15_izq())) {
                        frm.btnD1Cizq45.setOpaque(true);
                        frm.btnD1Cizq45.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD15_izq())) {
                        frm.btnD1Cizq45.setOpaque(true);
                        frm.btnD1Cizq45.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD15_izq())) {
                        frm.btnD1Cizq45.setOpaque(true);
                        frm.btnD1Cizq45.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD15_izq())) {
                        frm.btnD1Cizq45.setOpaque(true);
                        frm.btnD1Cizq45.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD15_izq())) {
                        frm.btnD1Cizq45.setOpaque(true);
                        frm.btnD1Cizq45.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD15_sup())) {
                        frm.btnD1Csup45.setOpaque(true);
                        frm.btnD1Csup45.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD15_sup())) {
                        frm.btnD1Csup45.setOpaque(true);
                        frm.btnD1Csup45.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD15_sup())) {
                        frm.btnD1Csup45.setOpaque(true);
                        frm.btnD1Csup45.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD15_sup())) {
                        frm.btnD1Csup45.setOpaque(true);
                        frm.btnD1Csup45.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD15_sup())) {
                        frm.btnD1Csup45.setOpaque(true);
                        frm.btnD1Csup45.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD15_sup())) {
                        frm.btnD1Csup45.setOpaque(true);
                        frm.btnD1Csup45.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD15_sup())) {
                        frm.btnD1Csup45.setOpaque(true);
                        frm.btnD1Csup45.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD15_sup())) {
                        frm.btnD1Csup45.setOpaque(true);
                        frm.btnD1Csup45.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD15_cen())) {
                        frm.btnD1Ccen45.setOpaque(true);
                        frm.btnD1Ccen45.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD15_cen())) {
                        frm.btnD1Ccen45.setOpaque(true);
                        frm.btnD1Ccen45.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD15_cen())) {
                        frm.btnD1Ccen45.setOpaque(true);
                        frm.btnD1Ccen45.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD15_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen45.getWidth(), frm.btnD1Ccen45.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen45.setIcon(icono);

                    }
                    if ("5".equals(mod.getD15_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen45.getWidth(), frm.btnD1Ccen45.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen45.setIcon(icono);
                    }
                    if ("6".equals(mod.getD15_cen())) {
                        frm.btnD1Ccen45.setOpaque(true);
                        frm.btnD1Ccen45.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD15_cen())) {
                        frm.btnD1Ccen45.setOpaque(true);
                        frm.btnD1Ccen45.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD15_cen())) {
                        frm.btnD1Ccen45.setOpaque(true);
                        frm.btnD1Ccen45.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD15_cen())) {
                        frm.btnD1Ccen45.setOpaque(true);
                        frm.btnD1Ccen45.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD15_cen())) {
                        frm.btnD1Ccen45.setOpaque(true);
                        frm.btnD1Ccen45.setBackground(Color.WHITE);
                    }
                    //C_DER
                    if ("1".equals(mod.getD15_der())) {
                        frm.btnD1Cder45.setOpaque(true);
                        frm.btnD1Cder45.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD15_der())) {
                        frm.btnD1Cder45.setOpaque(true);
                        frm.btnD1Cder45.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD15_der())) {
                        frm.btnD1Cder45.setOpaque(true);
                        frm.btnD1Cder45.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD15_der())) {
                        frm.btnD1Cder45.setOpaque(true);
                        frm.btnD1Cder45.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD15_der())) {
                        frm.btnD1Cder45.setOpaque(true);
                        frm.btnD1Cder45.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD15_der())) {
                        frm.btnD1Cder45.setOpaque(true);
                        frm.btnD1Cder45.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD15_der())) {
                        frm.btnD1Cder45.setOpaque(true);
                        frm.btnD1Cder45.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD15_der())) {
                        frm.btnD1Cder45.setOpaque(true);
                        frm.btnD1Cder45.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD15_inf())) {
                        frm.btnD1Cinf45.setOpaque(true);
                        frm.btnD1Cinf45.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD15_inf())) {
                        frm.btnD1Cinf45.setOpaque(true);
                        frm.btnD1Cinf45.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD15_inf())) {
                        frm.btnD1Cinf45.setOpaque(true);
                        frm.btnD1Cinf45.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD15_inf())) {
                        frm.btnD1Cinf45.setOpaque(true);
                        frm.btnD1Cinf45.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD15_inf())) {
                        frm.btnD1Cinf45.setOpaque(true);
                        frm.btnD1Cinf45.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD15_inf())) {
                        frm.btnD1Cinf45.setOpaque(true);
                        frm.btnD1Cinf45.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD15_inf())) {
                        frm.btnD1Cinf45.setOpaque(true);
                        frm.btnD1Cinf45.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD15_inf())) {
                        frm.btnD1Cinf45.setOpaque(true);
                        frm.btnD1Cinf45.setBackground(Color.WHITE);
                    }
                    //******************************************************************************************
                    //***************************************************DIENTE 16 ****************************
                    if ("1".equals(mod.getD16_izq())) {
                        frm.btnD1Cizq46.setOpaque(true);
                        frm.btnD1Cizq46.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD16_izq())) {
                        frm.btnD1Cizq46.setOpaque(true);
                        frm.btnD1Cizq46.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD16_izq())) {
                        frm.btnD1Cizq46.setOpaque(true);
                        frm.btnD1Cizq46.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD16_izq())) {
                        frm.btnD1Cizq46.setOpaque(true);
                        frm.btnD1Cizq46.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD16_izq())) {
                        frm.btnD1Cizq46.setOpaque(true);
                        frm.btnD1Cizq46.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD16_izq())) {
                        frm.btnD1Cizq46.setOpaque(true);
                        frm.btnD1Cizq46.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD16_izq())) {
                        frm.btnD1Cizq46.setOpaque(true);
                        frm.btnD1Cizq46.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD16_izq())) {
                        frm.btnD1Cizq46.setOpaque(true);
                        frm.btnD1Cizq46.setBackground(Color.WHITE);
                    }

                    //C_SUP
                    if ("1".equals(mod.getD16_sup())) {
                        frm.btnD1Csup46.setOpaque(true);
                        frm.btnD1Csup46.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD16_sup())) {
                        frm.btnD1Csup46.setOpaque(true);
                        frm.btnD1Csup46.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD16_sup())) {
                        frm.btnD1Csup46.setOpaque(true);
                        frm.btnD1Csup46.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD16_sup())) {
                        frm.btnD1Csup46.setOpaque(true);
                        frm.btnD1Csup46.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD16_sup())) {
                        frm.btnD1Csup46.setOpaque(true);
                        frm.btnD1Csup46.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD16_sup())) {
                        frm.btnD1Csup46.setOpaque(true);
                        frm.btnD1Csup46.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD16_sup())) {
                        frm.btnD1Csup46.setOpaque(true);
                        frm.btnD1Csup46.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD16_sup())) {
                        frm.btnD1Csup46.setOpaque(true);
                        frm.btnD1Csup46.setBackground(Color.WHITE);
                    }

                    //C_CEN
                    if ("1".equals(mod.getD16_cen())) {
                        frm.btnD1Ccen46.setOpaque(true);
                        frm.btnD1Ccen46.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD16_cen())) {
                        frm.btnD1Ccen46.setOpaque(true);
                        frm.btnD1Ccen46.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD16_cen())) {
                        frm.btnD1Ccen46.setOpaque(true);
                        frm.btnD1Ccen46.setBackground(Color.RED);
                    }
                    if ("4".equals(mod.getD16_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xroja.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen46.getWidth(), frm.btnD1Ccen46.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen46.setIcon(icono);

                    }
                    if ("5".equals(mod.getD16_cen())) {

                        ImageIcon sonic = new ImageIcon(getClass().getResource("/Graficos/Xazul.png"));
                        ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(frm.btnD1Ccen46.getWidth(), frm.btnD1Ccen46.getHeight(), Image.SCALE_DEFAULT));
                        frm.btnD1Ccen46.setIcon(icono);
                    }
                    if ("6".equals(mod.getD16_cen())) {
                        frm.btnD1Ccen46.setOpaque(true);
                        frm.btnD1Ccen46.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD16_cen())) {
                        frm.btnD1Ccen46.setOpaque(true);
                        frm.btnD1Ccen46.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD16_cen())) {
                        frm.btnD1Ccen46.setOpaque(true);
                        frm.btnD1Ccen46.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD16_cen())) {
                        frm.btnD1Ccen46.setOpaque(true);
                        frm.btnD1Ccen46.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD16_cen())) {
                        frm.btnD1Ccen46.setOpaque(true);
                        frm.btnD1Ccen46.setBackground(Color.WHITE);
                    }

                    //C_DER
                    if ("1".equals(mod.getD16_der())) {
                        frm.btnD1Cder46.setOpaque(true);
                        frm.btnD1Cder46.setBackground(Color.YELLOW);
                    }
                    if ("2".equals(mod.getD16_der())) {
                        frm.btnD1Cder46.setOpaque(true);
                        frm.btnD1Cder46.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD16_der())) {
                        frm.btnD1Cder46.setOpaque(true);
                        frm.btnD1Cder46.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD16_der())) {
                        frm.btnD1Cder46.setOpaque(true);
                        frm.btnD1Cder46.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD16_der())) {
                        frm.btnD1Cder46.setOpaque(true);
                        frm.btnD1Cder46.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD16_der())) {
                        frm.btnD1Cder46.setOpaque(true);
                        frm.btnD1Cder46.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD16_der())) {
                        frm.btnD1Cder46.setOpaque(true);
                        frm.btnD1Cder46.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD16_der())) {
                        frm.btnD1Cder46.setOpaque(true);
                        frm.btnD1Cder46.setBackground(Color.WHITE);
                    }

                    //C_INF
                    if ("1".equals(mod.getD16_inf())) {
                        frm.btnD1Cinf46.setOpaque(true);
                        frm.btnD1Cinf46.setBackground(Color.YELLOW);
                    }

                    if ("2".equals(mod.getD16_inf())) {
                        frm.btnD1Cinf46.setOpaque(true);
                        frm.btnD1Cinf46.setBackground(Color.GREEN);
                    }
                    if ("3".equals(mod.getD16_inf())) {
                        frm.btnD1Cinf46.setOpaque(true);
                        frm.btnD1Cinf46.setBackground(Color.RED);
                    }
                    if ("6".equals(mod.getD16_inf())) {
                        frm.btnD1Cinf46.setOpaque(true);
                        frm.btnD1Cinf46.setBackground(Color.ORANGE);
                    }
                    if ("7".equals(mod.getD16_inf())) {
                        frm.btnD1Cinf46.setOpaque(true);
                        frm.btnD1Cinf46.setBackground(Color.BLACK);
                    }
                    if ("8".equals(mod.getD16_inf())) {
                        frm.btnD1Cinf46.setOpaque(true);
                        frm.btnD1Cinf46.setBackground(Color.BLUE);
                    }
                    if ("9".equals(mod.getD16_inf())) {
                        frm.btnD1Cinf46.setOpaque(true);
                        frm.btnD1Cinf46.setBackground(Color.GRAY);
                    }
                    if ("0".equals(mod.getD16_inf())) {
                        frm.btnD1Cinf46.setOpaque(true);
                        frm.btnD1Cinf46.setBackground(Color.WHITE);
                    }

                    //***************************************************************************************
                    frm.d17_izq = mod.getD1_izq();
                    frm.d17_sup = mod.getD1_sup();
                    frm.d17_cen = mod.getD1_cen();
                    frm.d17_der = mod.getD1_der();
                    frm.d17_inf = mod.getD1_inf();

                    frm.d18_izq = mod.getD2_izq();
                    frm.d18_sup = mod.getD2_sup();
                    frm.d18_cen = mod.getD2_cen();
                    frm.d18_der = mod.getD2_der();
                    frm.d18_inf = mod.getD2_inf();

                    frm.d19_izq = mod.getD3_izq();
                    frm.d19_sup = mod.getD3_sup();
                    frm.d19_cen = mod.getD3_cen();
                    frm.d19_der = mod.getD3_der();
                    frm.d19_inf = mod.getD3_inf();

                    frm.d20_izq = mod.getD4_izq();
                    frm.d20_sup = mod.getD4_sup();
                    frm.d20_cen = mod.getD4_cen();
                    frm.d20_der = mod.getD4_der();
                    frm.d20_inf = mod.getD4_inf();

                    frm.d21_izq = mod.getD5_izq();
                    frm.d21_sup = mod.getD5_sup();
                    frm.d21_cen = mod.getD5_cen();
                    frm.d21_der = mod.getD5_der();
                    frm.d21_inf = mod.getD5_inf();

                    frm.d22_izq = mod.getD6_izq();
                    frm.d22_sup = mod.getD6_sup();
                    frm.d22_cen = mod.getD6_cen();
                    frm.d22_der = mod.getD6_der();
                    frm.d22_inf = mod.getD6_inf();

                    frm.d23_izq = mod.getD7_izq();
                    frm.d23_sup = mod.getD7_sup();
                    frm.d23_cen = mod.getD7_cen();
                    frm.d23_der = mod.getD7_der();
                    frm.d23_inf = mod.getD7_inf();

                    frm.d24_izq = mod.getD8_izq();
                    frm.d24_sup = mod.getD8_sup();
                    frm.d24_cen = mod.getD8_cen();
                    frm.d24_der = mod.getD8_der();
                    frm.d24_inf = mod.getD8_inf();

                    frm.d25_izq = mod.getD9_izq();
                    frm.d25_sup = mod.getD9_sup();
                    frm.d25_cen = mod.getD9_cen();
                    frm.d25_der = mod.getD9_der();
                    frm.d25_inf = mod.getD9_inf();

                    frm.d26_izq = mod.getD10_izq();
                    frm.d26_sup = mod.getD10_sup();
                    frm.d26_cen = mod.getD10_cen();
                    frm.d26_der = mod.getD10_der();
                    frm.d26_inf = mod.getD10_inf();

                    frm.d27_izq = mod.getD11_izq();
                    frm.d27_sup = mod.getD11_sup();
                    frm.d27_cen = mod.getD11_cen();
                    frm.d27_der = mod.getD11_der();
                    frm.d27_inf = mod.getD11_inf();

                    frm.d28_izq = mod.getD12_izq();
                    frm.d28_sup = mod.getD12_sup();
                    frm.d28_cen = mod.getD12_cen();
                    frm.d28_der = mod.getD12_der();
                    frm.d28_inf = mod.getD12_inf();

                    frm.d29_izq = mod.getD13_izq();
                    frm.d29_sup = mod.getD13_sup();
                    frm.d29_cen = mod.getD13_cen();
                    frm.d29_der = mod.getD13_der();
                    frm.d29_inf = mod.getD13_inf();

                    frm.d30_izq = mod.getD14_izq();
                    frm.d30_sup = mod.getD14_sup();
                    frm.d30_cen = mod.getD14_cen();
                    frm.d30_der = mod.getD14_der();
                    frm.d30_inf = mod.getD14_inf();

                    frm.d31_izq = mod.getD15_izq();
                    frm.d31_sup = mod.getD15_sup();
                    frm.d31_cen = mod.getD15_cen();
                    frm.d31_der = mod.getD15_der();
                    frm.d31_inf = mod.getD15_inf();

                    frm.d32_izq = mod.getD16_izq();
                    frm.d32_sup = mod.getD16_sup();
                    frm.d32_cen = mod.getD16_cen();
                    frm.d32_der = mod.getD16_der();
                    frm.d32_inf = mod.getD16_inf();
                    
                    //System.out.println(frm.d17_izq + frm.d17_sup + frm.d17_cen + frm.d17_der + frm.d17_inf );

                    //****************************************************************************************
                } else {
                    JOptionPane.showMessageDialog(null, "NO EXISTE ODONTOGRAMA INICIAL");

                }

            }

        }

    }
}
