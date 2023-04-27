package com.programacion2;

public class SumarNumeros {
    public int SumaNumerosR(int n) {
        if (n > 0) {
            n += SumaNumerosR(n - 1);
        }
        return n;
    }

    public int SumaNumeroI(int n) {
        int valor = 0;
        for (int i = n; i > 0; i--) {
            valor += i;
        }
        return valor;
    }
}
