/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.CitaVirtual;
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
public class SerializacionCitaVirtual {
    
    public static void main(String[] args ){
            
            CitaVirtual[] citasV = new CitaVirtual[3];
            citasV[0] = new CitaVirtual("", new Date(2022, 5, 13), "40 minutos", "Zoom");
            citasV[1] = new CitaVirtual("", new Date(2022, 5, 13), "120 minutos", "Teams");
            citasV[2] = new CitaVirtual("", new Date(2022, 5, 13), "60 minutos", "Google Meet");
            
            serializarCitaVirtual(citasV);
            deserializarCitaVirtual();
    }
    
    /**
     * Método estático Serializar cita virtual 
     * serealizar los datos de las citas virtuales
     *
     * @param sugerencias
     */
    public static void serializarCitaVirtual(CitaVirtual citavirtuales[]) {
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("citaVirtual.txt"));
            o.writeObject(citavirtuales);
            o.close();
        } catch (IOException e) {
        }
    }

    /**
     * Método estático deserializar sugerencias
     * Deserealizar los datos de las sugerencias
     * @return 
     */
    public static CitaVirtual[] deserializarCitaVirtual() {
        CitaVirtual[] citaVirtalRecuperado = null;
        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream("citaVirtal.txt"));
            citaVirtalRecuperado = (CitaVirtual[]) o.readObject();
            o.close();
            for (CitaVirtual citaV : citaVirtalRecuperado) {
                System.out.println(citaV);
            }
        } catch (IOException | ClassNotFoundException e) {

        } finally {
            return citaVirtalRecuperado;
        }
    }
    
        
                
    
}
