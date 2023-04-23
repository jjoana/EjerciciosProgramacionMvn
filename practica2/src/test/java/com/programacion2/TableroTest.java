package com.programacion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TableroTest {

    @Test
    void leerEstadoActualTest1() {

        int[][] leido = new int[4][4];
        int[][] esperado = new int[4][4];

        Tablero mitablero = new Tablero(4, "matrizTest.txt");
        mitablero.leerEstadoActual();
        leido = mitablero.getestadoActual();

        esperado[0][0] = 1;
        esperado[0][1] = 0;
        esperado[0][2] = 0;
        esperado[0][3] = 1;
        esperado[1][0] = 0;
        esperado[1][1] = 0;
        esperado[1][2] = 1;
        esperado[1][3] = 0;
        esperado[2][0] = 1;
        esperado[2][1] = 1;
        esperado[2][2] = 1;
        esperado[2][3] = 0;
        esperado[3][0] = 0;
        esperado[3][1] = 0;
        esperado[3][2] = 0;
        esperado[3][3] = 1;
        assertArrayEquals(esperado, leido);

    }

    @Test
    void leerEstadoActualTest2() {

        int[][] leido = new int[4][4];
        int[][] esperado = new int[4][4];

        Tablero mitablero = new Tablero(4, "matrizTest2.txt");
        mitablero.leerEstadoActual();
        leido = mitablero.getestadoActual();

        esperado[0][0] = 0;
        esperado[0][1] = 0;
        esperado[0][2] = 0;
        esperado[0][3] = 0;
        esperado[1][0] = 1;
        esperado[1][1] = 0;
        esperado[1][2] = 1;
        esperado[1][3] = 1;
        esperado[2][0] = 0;
        esperado[2][1] = 1;
        esperado[2][2] = 1;
        esperado[2][3] = 1;
        esperado[3][0] = 0;
        esperado[3][1] = 1;
        esperado[3][2] = 1;
        esperado[3][3] = 0;
        assertArrayEquals(esperado, leido);

    }

    @Test
    void transitarAlEstadoSiguienteTest1() {

        int[][] estadoActual = new int[4][4];
        int[][] estadoSiguienteCalculado = new int[4][4];
        int[][] estadoSiguienteEsperado = new int[4][4];

        Tablero miTablero = new Tablero(4, "matrizTest.txt");

        miTablero.leerEstadoActual();
        estadoActual = miTablero.getestadoActual();

        miTablero.transitarAlEstadoSiguiente();
        estadoSiguienteCalculado = miTablero.getestadoSiguiente();

        estadoSiguienteEsperado[0][0] = 0;
        estadoSiguienteEsperado[0][1] = 0;
        estadoSiguienteEsperado[0][2] = 0;
        estadoSiguienteEsperado[0][3] = 0;
        estadoSiguienteEsperado[1][0] = 1;
        estadoSiguienteEsperado[1][1] = 0;
        estadoSiguienteEsperado[1][2] = 1;
        estadoSiguienteEsperado[1][3] = 1;
        estadoSiguienteEsperado[2][0] = 0;
        estadoSiguienteEsperado[2][1] = 1;
        estadoSiguienteEsperado[2][2] = 1;
        estadoSiguienteEsperado[2][3] = 1;
        estadoSiguienteEsperado[3][0] = 0;
        estadoSiguienteEsperado[3][1] = 1;
        estadoSiguienteEsperado[3][2] = 1;
        estadoSiguienteEsperado[3][3] = 0;

        assertArrayEquals(estadoSiguienteEsperado, estadoSiguienteCalculado);

    }

    @Test
    void transitarAlEstadoSiguienteTest2 () {

        int[][] estadoActual = new int[4][4];
        int[][] estadoSiguienteCalculado = new int[4][4];
        int[][] estadoSiguienteEsperado = new int[4][4];

        Tablero miTablero = new Tablero(4, "matrizTest2.txt");

        miTablero.leerEstadoActual();
        estadoActual = miTablero.getestadoActual();

        miTablero.transitarAlEstadoSiguiente();
        estadoSiguienteCalculado = miTablero.getestadoSiguiente();

        estadoSiguienteEsperado[0][0] = 0;
        estadoSiguienteEsperado[0][1] = 0;
        estadoSiguienteEsperado[0][2] = 0;
        estadoSiguienteEsperado[0][3] = 0;
        estadoSiguienteEsperado[1][0] = 0;
        estadoSiguienteEsperado[1][1] = 0;
        estadoSiguienteEsperado[1][2] = 0;
        estadoSiguienteEsperado[1][3] = 1;
        estadoSiguienteEsperado[2][0] = 1;
        estadoSiguienteEsperado[2][1] = 0;
        estadoSiguienteEsperado[2][2] = 0;
        estadoSiguienteEsperado[2][3] = 0;
        estadoSiguienteEsperado[3][0] = 0;
        estadoSiguienteEsperado[3][1] = 1;
        estadoSiguienteEsperado[3][2] = 0;
        estadoSiguienteEsperado[3][3] = 1;

        assertArrayEquals(estadoSiguienteEsperado, estadoSiguienteCalculado);

    }

    @Test
    void transitarAlEstadoSiguienteTest3 (){

        int[][] estadoActual = new int[4][4];
        int[][] estadoSiguienteCalculado = new int[4][4];
        int[][] estadoSiguienteEsperado = new int[4][4];

        Tablero miTablero = new Tablero(4, "matrizTest3.txt");

        miTablero.leerEstadoActual();
        estadoActual = miTablero.getestadoActual();

        miTablero.transitarAlEstadoSiguiente();
        estadoSiguienteCalculado = miTablero.getestadoSiguiente();

        estadoSiguienteEsperado[0][0] = 0;
        estadoSiguienteEsperado[0][1] = 0;
        estadoSiguienteEsperado[0][2] = 0;
        estadoSiguienteEsperado[0][3] = 0;
        estadoSiguienteEsperado[1][0] = 0;
        estadoSiguienteEsperado[1][1] = 0;
        estadoSiguienteEsperado[1][2] = 0;
        estadoSiguienteEsperado[1][3] = 0;
        estadoSiguienteEsperado[2][0] = 0;
        estadoSiguienteEsperado[2][1] = 0;
        estadoSiguienteEsperado[2][2] = 1;
        estadoSiguienteEsperado[2][3] = 0;
        estadoSiguienteEsperado[3][0] = 0;
        estadoSiguienteEsperado[3][1] = 0;
        estadoSiguienteEsperado[3][2] = 0;
        estadoSiguienteEsperado[3][3] = 0;

        assertArrayEquals(estadoSiguienteEsperado, estadoSiguienteCalculado);

    }


    @Test
    void transitarAlEstadoSiguienteTest4(){

        int[][] estadoActual = new int [4][4];
        int[][] estadoSiguienteCalculado = new int[4][4];
        int[][] estadoSiguienteEsperado = new int [4][4];

        Tablero miTablero = new Tablero(4, "matrizTest.txt");
        miTablero.leerEstadoActual();

        for(int i=0; i < 2; i++ ){
            miTablero.transitarAlEstadoSiguiente();
        }
        estadoSiguienteCalculado= miTablero.getestadoSiguiente();

        estadoSiguienteEsperado[0][0] = 0;
        estadoSiguienteEsperado[0][1] = 0;
        estadoSiguienteEsperado[0][2] = 0;
        estadoSiguienteEsperado[0][3] = 0;
        estadoSiguienteEsperado[1][0] = 0;
        estadoSiguienteEsperado[1][1] = 0;
        estadoSiguienteEsperado[1][2] = 0;
        estadoSiguienteEsperado[1][3] = 1;
        estadoSiguienteEsperado[2][0] = 1;
        estadoSiguienteEsperado[2][1] = 0;
        estadoSiguienteEsperado[2][2] = 0;
        estadoSiguienteEsperado[2][3] = 0;
        estadoSiguienteEsperado[3][0] = 0;
        estadoSiguienteEsperado[3][1] = 1;
        estadoSiguienteEsperado[3][2] = 0;
        estadoSiguienteEsperado[3][3] = 1;

        assertArrayEquals(estadoSiguienteEsperado, estadoSiguienteCalculado);
    }

    @Test
    void transitarAlEstadoSiguienteTest5(){

        int[][] estadoActual = new int [4][4];
        int[][] estadoSiguienteCalculado = new int [4][4];
        int[][] estadoSiguienteEsperado = new int [4][4];

        Tablero miTablero = new Tablero(4, "matrizTest.txt");
        miTablero.leerEstadoActual();

        for(int i=0; i < 3; i++){
            miTablero.transitarAlEstadoSiguiente();
        }
        estadoSiguienteCalculado = miTablero.getestadoSiguiente();

        estadoSiguienteEsperado[0][0] = 0;
        estadoSiguienteEsperado[0][1] = 0;
        estadoSiguienteEsperado[0][2] = 0;
        estadoSiguienteEsperado[0][3] = 0;
        estadoSiguienteEsperado[1][0] = 0;
        estadoSiguienteEsperado[1][1] = 0;
        estadoSiguienteEsperado[1][2] = 0;
        estadoSiguienteEsperado[1][3] = 0;
        estadoSiguienteEsperado[2][0] = 0;
        estadoSiguienteEsperado[2][1] = 0;
        estadoSiguienteEsperado[2][2] = 1;
        estadoSiguienteEsperado[2][3] = 0;
        estadoSiguienteEsperado[3][0] = 0;
        estadoSiguienteEsperado[3][1] = 0;
        estadoSiguienteEsperado[3][2] = 0;
        estadoSiguienteEsperado[3][3] = 0;

        assertArrayEquals(estadoSiguienteEsperado, estadoSiguienteCalculado);

    }
}
