package com.programacion;

import java.util.ArrayList;

public class Personas {
    private ArrayList<Persona> lista = new ArrayList<Persona>();

    public void annadirPersona(Persona persona) {
        lista.add(persona);
    }

    public ArrayList<Persona> getListado() {
        return lista;
    }

    public Persona elMasJoven() {
        int edadInicial = 1000;
        Persona seleccionada = new Persona();
        for (Persona p : lista) {
            if (p.calcularEdad() < edadInicial) {
                edadInicial = (int) p.calcularEdad();
                seleccionada = p;
            }
            ;
        }
        return seleccionada;
    }

    public long calcularSumaEdades() {
        int resultado = 0;
        for (int i = 0; lista.size() < i; i++) {
            if (!lista.isEmpty())
                ;
            resultado = (int) lista.get(i).calcularEdad();
        }
        return resultado;
    }

    public int calcularEdadMinima() {
        int edadInicial = 10000;
        for (Persona p : lista) {
            if (p.calcularEdad() < edadInicial) {
                edadInicial = (int) p.calcularEdad();
            }
        }
        return edadInicial;
    }

    public double calcularMediaEdad() {
        int resultado = (int)calcularSumaEdades();
        return resultado/lista.size();
    }

}
