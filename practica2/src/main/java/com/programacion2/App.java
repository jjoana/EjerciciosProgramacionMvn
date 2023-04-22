package com.programacion2;

import java.util.concurrent.TimeUnit;
import java.lang.InterruptedException;

public class App {

    public static void main(String[] args) {
        Tablero objeto = new Tablero(4, "matrizTest.txt");
        objeto.leerEstadoActual();
        objeto.transitarAlEstadoSiguiente();

        try {
            for (int i = 0; i < 5; i++) {
                TimeUnit.SECONDS.sleep(1);
                objeto.transitarAlEstadoSiguiente();
                System.out.println(objeto);
            }

        } catch (InterruptedException e) {
            System.out.println(e);

        }
    }
}
