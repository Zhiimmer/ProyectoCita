/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;


import dominio.Sugerencia;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Dell
 */
public class SerializarSugerencia {
     public SerializarSugerencia() {
        Sugerencia su = new Sugerencia();

        try {

            FileOutputStream s = new FileOutputStream("Sugerencia.txt");

            ObjectOutputStream o = new ObjectOutputStream(s);

            o.writeObject(su);
            o.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SerializarSugerencia();
    }
}
