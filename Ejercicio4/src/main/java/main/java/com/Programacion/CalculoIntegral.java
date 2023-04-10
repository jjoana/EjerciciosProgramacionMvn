package main.java.com.Programacion;

import java.util.function.Supplier;

public class CalculoIntegral {
    double area1 = 0.0;
    double area2=0.0;

    double limInferior;
    double limiteSuperior;
    double paso;

    public CalculoIntegral(double limInf, double limSup, double h){

        limInferior=limInf;
        limiteSuperior=limSup;
        paso=h;

    }

    public double integralEXCuadrado(double limInf, double limSup, double h) {
        if (limInf < limSup) {
            area1 += h * Math.exp(Math.pow(limInf, 2));
            limInf += h;
            integralEXCuadrado(limInf, limSup, h);
        }
        return area1;
    }

    public double integralEXCuadradoLambda(double limInf, double limSup, double h) {
        Supplier<Double> calcula = () -> {
            if (limInf < limSup) {
                area2 += h * Math.exp(Math.pow(limInf, 2));
                double nuevoLimInf =  limInf + h;
                integralEXCuadradoLambda(nuevoLimInf, limSup, h);
            }
            return area2;
        };

        return calcula.get();

    }
}


