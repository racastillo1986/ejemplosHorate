package Modelo;

import Vista.frmCDRUDPaciente;
import Vista.frmPaciente;

public class DetalleDiagnostico {

    private int filas;
    private int columnas;
    public String matriz[][];

    public DetalleDiagnostico(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        matriz = new String[filas][columnas];

    }

    public void datos() {
        int i, j;
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                matriz[i][j] = String.valueOf(frmPaciente.jtDx.getValueAt(i, j));
            }
        }
    }
    public void datosdia() {
        int i, j;
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                matriz[i][j] = String.valueOf(frmCDRUDPaciente.jtDx.getValueAt(i, j));
            }
        }
    }

    @Override
    public String toString() {
        String aux = "";
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                aux += matriz[i][j] + "\t";

            }
            aux += "\n";
        }

        return aux;
    }

}
