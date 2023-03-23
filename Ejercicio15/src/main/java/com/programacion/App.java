package com.programacion;

import java.time.LocalDate;

public class App {
    public static void main( String[] args ){

        Persona objeto = new Persona();
        Personas list = new Personas();

        objeto.setNombreYNacimiento("Jesus", LocalDate.of(2002, 12, 9));
        list.annadirPersona(objeto);

        objeto.setNombreYNacimiento("Julio", LocalDate.of(2004, 11, 1));
        list.annadirPersona(objeto);

        System.out.println(objeto.getNombre() + " " + objeto.getFechaNacimiento());
        System.out.println(objeto.calcularEdad());

        
        list.annadirPersona(objeto);
        System.out.println();
    }
}
