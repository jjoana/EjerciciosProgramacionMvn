package com.programacion;

import java.util.ArrayList;

public class Personas {
    private ArrayList<Persona> lista = new ArrayList<Persona>();

    public void annadirPersona(Persona persona) {
        lista.add(persona);
    }

    public ArrayList<Persona> getLista() {
        return lista;
    }

    public Persona elMasJoven() {

        ElMasJoven soyYo = () -> {
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

        return soyYo.elMasJoven();
    }

    public long calcularSumaEdades() {
        CalcularSumaEdades suma = () -> {
            int resultado = 0;
            for (Persona p : lista) {
                resultado += p.calcularEdad();
            }
            return resultado;

        };
        return suma.calcularSumaEdades();
    }

    public long calcularEdadMinima() {
        CalcularEdadMinima calcula = () -> {
            long edadInicial = 200;
            for (Persona p : lista) {
                if (p.calcularEdad() < edadInicial) {
                    edadInicial = p.calcularEdad();
                }
            }
            return edadInicial;
        };
        return calcula.calcularEdadMinima();
    }

    public double calcularMediaEdad() {
        CalcularMediaEdad calcula = () -> {
            int resultado = (int) calcularSumaEdades();
            return resultado / lista.size();
        };
        return calcula.calcularMediaEdad();
    }
}

@FunctionalInterface
interface ElMasJoven {
    public Persona elMasJoven();
}

@FunctionalInterface
interface CalcularSumaEdades {
    public long calcularSumaEdades();
}

@FunctionalInterface
interface CalcularEdadMinima {
    public long calcularEdadMinima();
}

@FunctionalInterface
interface CalcularMediaEdad {
    public double calcularMediaEdad();
}
