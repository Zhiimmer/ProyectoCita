/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.Sugerencia;
import dominio.Usuario;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 *
 * @author ronny
 */
public class SerializacionSugerencia {

    public static Sugerencia[] sugerenciaRecuperado = new Sugerencia[3];

    public static void main(String[] args) {
        
        Sugerencia[] sugerencia1 = new Sugerencia[3];
        sugerencia1[0] = new Sugerencia("Muy buena aplicación espero con ancias mi próxima cita", new Date(2023, 1, 11));
        sugerencia1[1] = new Sugerencia("La cita virtual fue de maravilla, espero poder quedar algun día", new Date(2023, 2, 20));
        sugerencia1[2] = new Sugerencia("Me gusto poder elegir el tipo de cita, ya que me puedo organizar de mejor manera", new Date(2023, 1, 14));
        
        serializarSugerencia(sugerencia1);
        deserializarSugerencia();
    }

    /**
     * Método estático Serializar sugerencia 
     * serealizar los datos de las sugerencias
     *
     * @param sugerencias
     */
    public static void serializarSugerencia(Sugerencia sugerencias[]) {
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("sugerencia.txt"));
            o.writeObject(sugerencias);
            o.close();
        } catch (IOException e) {
        }
    }

    /**
     * Método estático deserializar sugerencias
     * Deserealizar los datos de las sugerencias
     * @return 
     */
    public static Sugerencia[] deserializarSugerencia() {
        Sugerencia[] sugerenciaRecuperado = new Sugerencia[3];
        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream("Sugerencia.txt"));
            sugerenciaRecuperado = (Sugerencia[]) o.readObject();
            o.close();
            for (Sugerencia sugerencia1 : sugerenciaRecuperado) {
                System.out.println(sugerencia1);
            }
        } catch (IOException | ClassNotFoundException e) {

        } finally {
            return sugerenciaRecuperado;
        }
    }
}
