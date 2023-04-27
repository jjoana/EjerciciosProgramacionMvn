package com.programacion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

@DisplayName ("Tests para la clase …")
public class SumarNumeroTest {



    @Test
    void testSumaNumerosR() {
        SumarNumeros sumar = new SumarNumeros();

        assertEquals(1,sumar.SumaNumerosR(1));
        assertEquals(3,sumar.SumaNumerosR(2));
        assertEquals(6,sumar.SumaNumerosR(3));
        assertEquals(10,sumar.SumaNumerosR(4));
        assertEquals(15,sumar.SumaNumerosR(5));
    } 

    @Test 
    void testSumaNumerosI(){
        SumarNumeros sumar = new SumarNumeros();

        assertEquals(1, sumar.SumaNumeroI(1));
        assertEquals(3, sumar.SumaNumeroI(2));
        assertEquals(6, sumar.SumaNumeroI(3));

    }
}
