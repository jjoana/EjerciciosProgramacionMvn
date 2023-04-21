package com.programacion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

public class TableroTest {

    @Test
    void leerEstadoActualTest() {

        int[][] leido = new int[4][4];
        int[][] esperado = new int[4][4];

        Tablero mitablero = new Tablero(4,"matrizTest.txt");
        mitablero.leerEstadoActual();
        leido = mitablero.getestadoActual();

        esperado[0][0]= 1;
        esperado[0][1]= 0;
        esperado[0][2]= 0;
        esperado[0][3]= 0;
        esperado[1][0]= 0;
        esperado[1][1]= 1;
        esperado[1][2]= 0;
        esperado[1][3]= 0;
        esperado[2][0]= 1;
        esperado[2][1]= 0;
        esperado[2][2]= 0;
        esperado[2][3]= 1;
        esperado[3][0]= 0;
        esperado[3][1]= 1;
        esperado[3][2]= 1;
        esperado[3][3]= 0;

        assertArrayEquals(esperado, leido);

    }
    
}
