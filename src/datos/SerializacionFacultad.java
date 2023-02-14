/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.Facultad;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ronny
 */
public class SerializacionFacultad {
    public static Facultad[] facultadRecuperado = new Facultad[3];

    public static void main(String[] args) {
        serializarFacultad(facultadRecuperado);
        deserializarFacultad();
    }

    /**
     * Método estático Serializar facultades 
     * serealizar los datos de las facultades
     *
     * @param facultades
     */
    public static void serializarFacultad(Facultad facultades[]) {
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("sugerencia.txt"));
            o.writeObject(facultades);
            o.close();
        } catch (IOException e) {
        }
    }

    /**
     * Método estático deserializar facultades
     * Deserealizar los datos de las facultades
     * @return 
     */
    public static Facultad[] deserializarFacultad() {
        Facultad[] sugerenciaRecuperado = new Facultad[3];
        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream("Sugerencia.txt"));
            sugerenciaRecuperado = (Facultad[]) o.readObject();
            o.close();
            for (Facultad facu1 : facultadRecuperado) {
                System.out.println(facu1);
            }
        } catch (IOException | ClassNotFoundException e) {

        } finally {
            return facultadRecuperado;
        }
    }
    
}
