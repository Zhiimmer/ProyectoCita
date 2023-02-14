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
        
        Facultad[] facu1 = new Facultad[3];
        facu1[0] = new Facultad("INGENIERIA_QUIMICA");
        facu1[1] = new Facultad("INGENIERIA_Y_CIENCIAS_APLICADAS");
        facu1[2] = new Facultad("INGENIERIA_EN_GEOLOGIA_MINAS_PETRÓLEOS_Y_AMBIENTAL");
        
        
        serializarFacultad(facu1);
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
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("facultad.txt"));
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
        Facultad[] facultadRecuperado = new Facultad[3];
        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream("facultad.txt"));
            facultadRecuperado = (Facultad[]) o.readObject();
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
