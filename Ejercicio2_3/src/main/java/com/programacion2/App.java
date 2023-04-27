package com.programacion2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        CalculoPotencia objeto = new CalculoPotencia();
        System.out.println(objeto.potenciaIterativa(2,2));
        System.out.println(objeto.potenciaRecursiva(2, 5));
    }
}