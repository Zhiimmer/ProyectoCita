/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.Carrera;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ronny
 */
public class SerializacionCarrera {
    public static Carrera[] carreraRecuperado = new Carrera[9];
    
    public static void main(String[] args) {
        
        Carrera[] carrera1 = new Carrera[9];
        carrera1[0] = new Carrera("Ingeniería en sistemas de información", "1");
        carrera1[1] = new Carrera("Ingeniería civil", "2");
        carrera1[2] = new Carrera("Ingeniería en sistemas de información", "3");
        carrera1[3] = new Carrera("Ingeniería química", "4");
        carrera1[4] = new Carrera("Ingeniería civil", "5");
        carrera1[5] = new Carrera("Ingeniería química", "6");
        carrera1[6] = new Carrera("Ingeniería en sistemas de información", "7");
        carrera1[7] = new Carrera("Ingeniería en sistemas de información", "8");
        carrera1[8] = new Carrera("Ingeniería civil", "9");
        carrera1[9] = new Carrera("Ingeniería química", "10");
        
        serializarCarrera(carrera1);
        deserializarCarrera();
    }


    /**
     * Método estático Serializar usuario serealizar los datos de los usuarios
     *
     * @param sugerencias
     */
    public static void serializarCarrera(Carrera carreras[]) {
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("carreras.txt"));
            o.writeObject(carreras);
            o.close();
        } catch (IOException e) {
        }
    }

    /**
     * Método estático deserializar usuarios Deserealizar los datos de las
     * usuarios
     *
     * @return
     */
    public static Carrera[] deserializarCarrera() {
        Carrera[] usuarioRecuperado = new Carrera[9];
        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream("carreras.txt"));
            usuarioRecuperado = (Carrera[]) o.readObject();
            o.close();
            for (Carrera carrera1 : usuarioRecuperado) {
                System.out.println(carrera1);
            }
        } catch (IOException | ClassNotFoundException e) {

        } finally {
            return carreraRecuperado;
        }
    }
}
