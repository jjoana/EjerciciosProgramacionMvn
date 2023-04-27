package com.programacion2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        CalculaFactorial factorial = new CalculaFactorial();
        Scanner sc = new Scanner(System.in);
        long valor;
        long resultado;
        
        System.out.println("Introduzca el valor");
        valor = sc.nextLong();

        try {
            resultado = factorial.factorialRecursivo(valor);
            System.out.println(resultado);
            resultado = factorial.factorialIterativo(valor);
            System.out.println(resultado);
        } catch (NegativeNumberException e) {
            System.out.println("El numero que ha introducido es negativo");
        } catch (ToLargeNumberException e){
            System.out.println("El numero es demasiado grande");
        }
    }
}