package com.programacion;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public static void main( String[] args ){

        ArrayList<Persona> milista;
        Persona objeto;
        Personas list = new Personas();
        Long sumaEdades;
        double MediaEdad;

        objeto = new Persona();
        objeto.setNombreYNacimiento("Jesus", LocalDate.of(2002, 12, 9));
        list.annadirPersona(objeto);

        objeto = new Persona();
        objeto.setNombreYNacimiento("Julio", LocalDate.of(2004, 11, 1));
        list.annadirPersona(objeto);

        objeto = new Persona();
        objeto.setNombreYNacimiento("Ana", LocalDate.of(2000, 10, 1));
        list.annadirPersona(objeto);

        objeto = new Persona();
        objeto.setNombreYNacimiento("Joaquin", LocalDate.of(2001, 5, 5));
        list.annadirPersona(objeto);

        objeto = list.elMasJoven();
        System.out.println("El mas joven es: " + objeto);
        
        sumaEdades = list.calcularSumaEdades();
        System.out.println("La suma de las edades es: " + sumaEdades);

        sumaEdades = list.calcularEdadMinima();
        System.out.println("La edad minima es de: " + sumaEdades);
        
        MediaEdad = list.calcularMediaEdad();
        System.out.println("La edad media de las personas es de: " + MediaEdad);
        
    }
}
