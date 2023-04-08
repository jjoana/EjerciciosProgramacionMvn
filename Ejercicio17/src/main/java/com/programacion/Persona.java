package com.programacion;
import java.time.LocalDate;

public class Persona{
    private String nombre;
    private LocalDate fechaDeNacimiento;

    public long calcularEdad(){
        LocalDate hoy = LocalDate.now();

        long resultado = hoy.compareTo(fechaDeNacimiento);
        return resultado;
    }

    public void setNombreYNacimiento(String nombre, LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaNacimiento;
    }

    public String getNombre(){
        return nombre;
    }

    public LocalDate getFechaNacimiento(){
        return fechaDeNacimiento;
    }

    @Override
    public String toString() {
        String resultado = nombre + ": " + calcularEdad();
        return resultado;
    }
}