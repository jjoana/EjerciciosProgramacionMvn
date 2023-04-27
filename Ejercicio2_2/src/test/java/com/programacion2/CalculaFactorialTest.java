package com.programacion2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.DisplayName;

@DisplayName ("Tests para la clase …")
public class CalculaFactorialTest {

    @Test
    void testCalcularR() throws NegativeNumberException, ToLargeNumberException {
        
        CalculaFactorial calcular = new CalculaFactorial();

        assertEquals(1, calcular.factorialRecursivo(1));
        assertEquals(2, calcular.factorialRecursivo(2));
        assertEquals(6, calcular.factorialRecursivo(3));
        
    }

    @Test
    void testCalcularR2() throws NegativeNumberException, ToLargeNumberException {
        
        CalculaFactorial calcular = new CalculaFactorial();

        assertThrows(ToLargeNumberException.class, ()-> calcular.factorialRecursivo(50));

        
    }

    @Test
    void testCalcularR3() throws NegativeNumberException, ToLargeNumberException {
        
        CalculaFactorial calcular = new CalculaFactorial();

        assertThrows(NegativeNumberException.class, ()-> calcular.factorialRecursivo(-4));

        
    }

    @Test 
    void testCalcularI() throws NegativeNumberException, ToLargeNumberException{

        CalculaFactorial calcular = new CalculaFactorial();

        assertEquals(1, calcular.factorialIterativo(1));
        assertEquals(2, calcular.factorialIterativo(2));
        assertEquals(6, calcular.factorialRecursivo(3));
    }
    
}
