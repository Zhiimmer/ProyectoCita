/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.Usuario;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author ronny
 */
public class SerializarUsuario {
    
    public SerializarUsuario() {
        Usuario user = new Usuario();

        try {
            FileOutputStream f = new FileOutputStream("usuario.txt");
            
            ObjectOutputStream o = new ObjectOutputStream(f);
            
            o.writeObject(user);
            o.close();
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new SerializarCompatibilidad();
    }
    
}
