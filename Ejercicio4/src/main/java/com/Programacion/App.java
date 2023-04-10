package com.Programacion;

import main.java.com.Programacion.CalculoIntegral;

public class App {
    public static void main( String[] args ){

        //Mediante Scanner introducir limite inferior, superior y paso
        double limInferior = 0.0;
        double limiteSuperior = 1.0;
        double h = 0.5;

        CalculoIntegral objeto = new CalculoIntegral(limInferior, limiteSuperior, h);

        System.out.println("El resultado es: " + objeto.integralEXCuadrado(limInferior, limiteSuperior, h));
        System.out.println("El resultado es:" + objeto.integralEXCuadradoLambda(limInferior, limiteSuperior, h));
    }
}
