/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.Facultad;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gaby Fernandez
 */
public class DeserializarFacultad {

    public DeserializarFacultad() {
        Facultad fa = null;
        try {
            FileInputStream f = new FileInputStream("facultad.txt");

            ObjectInputStream o = new ObjectInputStream(f);

            fa = (Facultad) o.readObject();
            o.close();
            System.out.println("Facultad desearilizar" + fa);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();

        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
        }

    }
    
    public static void main(String[] args) {
        new DeserializarFacultad();
    }
}
