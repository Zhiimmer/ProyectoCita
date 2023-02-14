/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.Usuario;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ronny
 */
public class SerializacionUsuario {
    
    public static Usuario[] usuarioRecuperado = new Usuario[2];

    public static void main(String[] args) {
        serializarUsuario(usuarioRecuperado);
        deserializarUsuario();
    }

    /**
     * Método estático Serializar usuario 
     * serealizar los datos de los usuarios
     *
     * @param sugerencias
     */
    public static void serializarUsuario(Usuario usuarios[]) {
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("usuario.txt"));
            o.writeObject(usuarios);
            o.close();
        } catch (IOException e) {
        }
    }

    /**
     * Método estático deserializar usuarios
     * Deserealizar los datos de las usuarios
     * @return 
     */
    public static Usuario[] deserializarUsuario() {
        Usuario[] usuarioRecuperado = new Usuario[2];
        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream("Sugerencia.txt"));
            usuarioRecuperado = (Usuario[]) o.readObject();
            o.close();
            for (Usuario user1 : usuarioRecuperado) {
                System.out.println(user1);
            }
        } catch (IOException | ClassNotFoundException e) {

        } finally {
            return usuarioRecuperado;
        }
    }
    
}
