package com.programacion2;

import java.io.FileReader;
import java.io.IOException;

public class Tablero {
    private static int DIMENSION;
    private String nombreFichero;

    private String direccionArchivo = "C:/Users/jesus/DatosPruebas/";
    private int[][] estadoActual;
    private int[][] estadoSiguiente;


    public Tablero(int DIMENSION, String miTablero){
        Tablero.DIMENSION = DIMENSION;
        nombreFichero = miTablero;
        estadoActual = new int[DIMENSION][DIMENSION];
        estadoSiguiente = new int[DIMENSION][DIMENSION];
    }


    public void leerEstadoActual() {
        FileReader reader = null;
        int caracterLeido;
        int numeroLeido;
        try {
            reader = new FileReader(direccionArchivo+nombreFichero);
            for (int fila = 0; fila < Tablero.DIMENSION; fila++) {
                for (int columna = 0; columna < Tablero.DIMENSION; columna++) {
                    caracterLeido = reader.read();
                    if (caracterLeido == 10 || caracterLeido == 13){
                        caracterLeido = reader.read();
                        caracterLeido = reader.read();
                    }
                    numeroLeido = Integer.parseInt(String.valueOf((char)caracterLeido));
                    estadoActual[fila][columna] = numeroLeido;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void estadoSiguiente() {
        for (int fila = 0; fila < DIMENSION; fila++) {
            for (int columna = 0; columna < DIMENSION; columna++) {
                int vecinosVivos = 0;

                int filaAnterior = fila--;
                int filaPosterior = fila++;
                int columnaAnterior = columna--;
                int columnaPosterior = columna++;

                if (filaAnterior >= 0 && columnaAnterior >= 0) {
                    if (estadoActual[filaAnterior][columnaAnterior] == 1) {
                        vecinosVivos++;
                    }
                }

                if (filaAnterior >= 0) {
                    if (estadoActual[filaAnterior][columna] == 1) {
                        vecinosVivos++;
                    }
                }

                if (filaAnterior >= 0 || columnaPosterior <= 29) {
                    if (estadoActual[filaAnterior][columnaPosterior] == 1) {
                        vecinosVivos++;
                    }
                }

                if (columnaAnterior <= 0) {
                    if (estadoActual[fila][columnaAnterior] == 1) {
                        vecinosVivos++;
                    }
                }

                if (columnaPosterior <= 29) {
                    if (estadoActual[fila][columnaPosterior] == 1) {
                        vecinosVivos++;
                    }
                }

                if (filaPosterior <= 29 || columnaAnterior <= 0) {
                    if (estadoActual[filaPosterior][columnaAnterior] == 1) {
                        vecinosVivos++;
                    }
                }

                if (filaPosterior <= 29) {
                    if (estadoActual[filaPosterior][columna] == 1) {
                        vecinosVivos++;
                    }
                }

                if (filaPosterior <= 29 || columnaPosterior <= 0) {
                    if (estadoActual[filaPosterior][columnaPosterior] == 1) {
                        vecinosVivos++;
                    }
                }

                // Actualizacion de estado siguiente
                if (estadoActual[fila][columna] == 1 && (vecinosVivos == 2) || vecinosVivos == 3) {
                    estadoSiguiente[fila][columna] = 1;
                } else if (estadoActual[fila][columna] == 0 && vecinosVivos == 3) {
                    estadoSiguiente[fila][columna] = 1;
                } else {
                    estadoSiguiente[fila][columna] = 0;
                }

            }
        }

    }

    public int[][] getestadoActual(){
        return estadoActual;
    }

    public String getdireccionArchivo(){
        return direccionArchivo;
    }
}