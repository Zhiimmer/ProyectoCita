/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.Facultad;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Gaby Fernandez
 */
public class SerializarFacultad {

    public SerializarFacultad() {
        Facultad fa = new Facultad();

        try {

            FileOutputStream f = new FileOutputStream("facultad.txt");

            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(fa);
            o.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SerializarFacultad();
    }
}
