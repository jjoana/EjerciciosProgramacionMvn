package com.programacion2;


public class CalculaFactorial {
    public long factorialIterativo(long n) throws NegativeNumberException, ToLargeNumberException {
        if (n < 0) {
            throw (new NegativeNumberException());
        }

        if(n>=21){
            throw (new ToLargeNumberException());
        }

        long valor = 1;
        for (long i = n; i > 1; i--) {
            valor *= i;
        }
        return valor;
    }

    public long factorialRecursivo(long n) throws NegativeNumberException, ToLargeNumberException {
        if (n < 0) {
            throw (new NegativeNumberException());
        }

        if(n>=21){
            throw (new ToLargeNumberException());
        }

        if (n > 0) {
            n *= factorialRecursivo(n - 1);
        } else {
            return 1;
        }
        return n;
    }
}

class NegativeNumberException extends Exception {
}

class ToLargeNumberException extends Exception{
}

