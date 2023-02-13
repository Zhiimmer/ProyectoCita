/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;


import dominio.Sugerencia;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Dell
 */
public class DeserializarSugerencia {
     public DeserializarSugerencia() {
        Sugerencia su = null;
        try {
            FileInputStream s= new FileInputStream("Sugerencia.txt");

            ObjectInputStream o = new ObjectInputStream(s);

            su = (Sugerencia) o.readObject();
            o.close();
            System.out.println("Sugerencia desearilizar" + su);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();

        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
        }

    }
    
    public static void main(String[] args) {
        new DeserializarSugerencia();
    }
}
