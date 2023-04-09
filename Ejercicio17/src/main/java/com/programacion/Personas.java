package com.programacion;

import java.util.ArrayList;
import java.util.function.*;

public class Personas {
    
    private ArrayList<Persona> lista = new ArrayList<Persona>();

    public void annadirPersona(Persona persona) {
        lista.add(persona);
    }

    public ArrayList<Persona> getLista() {
        return lista;
    }

    public Persona elMasJoven() {

        Supplier<Persona> persona = () -> {
            long edadInicial = 200;
            Persona seleccionada = new Persona();
            for (Persona p : getLista()) {
                if (p.calcularEdad() < edadInicial) {
                    edadInicial = p.calcularEdad();
                    seleccionada = p;
                }
            }
            return seleccionada;
        };

        return persona.get();
    }

    public long calcularSumaEdades() {
        Supplier<Long> suma = () -> {
            long resultado = 0;
            for (Persona p : lista) {
                resultado += p.calcularEdad();
            }
            return resultado;
         };
         return suma.get();
    }

    public long calcularEdadMinima() {
        Supplier<Long> calcula = () -> {
            long edadInicial = 200;
            for (Persona p : lista) {
                if (p.calcularEdad() < edadInicial) {
                    edadInicial = p.calcularEdad();
                }
            }
            return edadInicial;
        };
        return calcula.get();
    }

    public double calcularMediaEdad() {
        Supplier <Double> calcula = () -> {
            double resultado = 0;
            for (Persona p : lista) {
                resultado += p.calcularEdad();
            }
            return resultado/lista.size();
         };
        return calcula.get();
    }
}