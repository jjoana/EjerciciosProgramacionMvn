package com.programacion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

@DisplayName ("Tests para la clase …")
public class CalculoPotenciaTest {

    @Test
    void TestCalculoPotenciaR() {
        CalculoPotencia calcular = new CalculoPotencia();

        assertEquals(1, calcular.potenciaRecursiva(2, 0));
        assertEquals(2, calcular.potenciaRecursiva(2, 1));
        assertEquals(4, calcular.potenciaRecursiva(2, 2));
    }

    @Test
    void TestCalculoPotenciaI(){
        CalculoPotencia calcular = new CalculoPotencia();
        
        assertEquals (1, calcular.potenciaIterativa(2, 0));
        assertEquals(2, calcular.potenciaRecursiva(2, 1));
        assertEquals(4, calcular.potenciaRecursiva(2, 2));
    }
}
