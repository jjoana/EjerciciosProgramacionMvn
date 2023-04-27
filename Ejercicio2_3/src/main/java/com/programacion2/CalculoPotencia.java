package com.programacion2;

public class CalculoPotencia {
    public int potenciaIterativa(int base, int exponente) {
        int resultado=1;
        for (int i = exponente; i > 0; i--) {
            resultado*= base;
        }
        return resultado;
    }

    public int potenciaRecursiva(int base, int exponente){
        int resultado=base;
        if(exponente>0){
            resultado *= potenciaRecursiva(base, exponente-1);
        }else{
            return 1;
        }
        return resultado;
    }    
    
}
