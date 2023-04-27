package com.programacion2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        SumarNumeros objeto = new SumarNumeros();

        Scanner sc = new Scanner(System.in);
        int valor;
        int resultado;

        System.out.println("Introduzca el valor");
        valor = sc.nextInt();

        resultado = objeto.SumaNumerosR(valor);
        System.out.println(resultado);

        resultado = objeto.SumaNumeroI(valor);
        System.out.println(resultado);
    }
}