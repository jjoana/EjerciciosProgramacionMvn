package org.pr2.interfaces;

import org.pr2.dominio.*;

public class Interfaz {
    public static void iniciar(String args[]) {
        Libreta libreta = new Libreta();
        if (args[0].equals("add")) {
            Contacto contacto = new Contacto(args[1], args[2]);
            libreta.annadirContacto(contacto);
        } else if (args[0].equals("show"))
            System.out.println(
                    libreta);
        else
            System.out.println("Opción incorrecta");
    }
}
