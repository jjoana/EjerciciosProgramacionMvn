package org.pr2.dominio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;import java.util.Scanner;

public class Libreta {
    private String nombreFichero = "contactos.txt";
    private ArrayList<Contacto> contactos = new ArrayList<>();

    public void addContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Contacto contacto : contactos) {
            sb.append(contacto + "\n");
        }
        return sb.toString();
    }

    public Libreta() {
        try {
            File fichero = new File(nombreFichero);
            fichero.createNewFile();
            Scanner sc = new Scanner(fichero);
            while (sc.hasNext()) {
                Contacto contacto = new Contacto();
                contacto.setNombre(sc.nextLine());
                contacto.setTelefono(sc.nextLine());
                contactos.add(contacto);
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    private void volcarContactos() {
        System.out.println(contactos);
        try {
            FileWriter fw = new FileWriter(nombreFichero);
            for (Contacto contacto : contactos) {
                fw.write(contacto.getNombre() + "\n");
                fw.write(contacto.getTelefono() + "\n");
            }
            fw.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    public void annadirContacto(Contacto contacto) {
        contactos.add(contacto);
        this.volcarContactos();
    }
}
