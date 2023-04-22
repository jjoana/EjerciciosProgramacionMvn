package com.programacion2;

public class App {

    public static void main( String[] args ){
        Tablero objeto = new Tablero(4, "matrizTest.txt");
        objeto.leerEstadoActual();
        objeto.estadoSiguiente();
       
    }
    
}
