package main.java.com.Programacion;

public class CalculoIntegral {
    double area = 0.0;

    double limInferior;
    double limiteSuperior;
    double paso;

    public CalculoIntegral(double limInf, double limSup, double h){

        limInferior=limInf;
        limiteSuperior=limSup;
        paso=h;

    }
n 
    public double integralEXCuadrado(double limInf, double limSup, double h) {
        if (limInf < limSup) {
            area += h * Math.exp(Math.pow(limInf, 2));
            limInf += h;
            integralEXCuadrado(limInf, limSup, h);
        }
        return area;
    }
}
