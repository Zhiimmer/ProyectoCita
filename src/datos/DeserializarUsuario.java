/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.Usuario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author ronny
 */
public class DeserializarUsuario {
    
    public DeserializarUsuario() {

        Usuario user = null;

        try {
            FileInputStream f = new FileInputStream("usuario.txt");

            ObjectInputStream o = new ObjectInputStream(f);

            user = (Usuario) o.readObject();

            o.close();
            System.out.println("Objeto deserializado: " + user);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new DeserializarUsuario();
    }
    
}
