package Modelo;

import Vista.frmCita;

public class DetalleCita {

    private int filas;
    private int columnas;
    public String matriz[][];

    public DetalleCita(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        matriz = new String[filas][columnas];
        //fill();
    }

    public void datos() {
        int i, j;
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                matriz[i][j] = String.valueOf(frmCita.jtTrat_Citas.getValueAt(i, j));
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
