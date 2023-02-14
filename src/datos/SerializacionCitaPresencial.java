/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.CitaPresencial;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 *
 * @author ronny
 */
public class SerializacionCitaPresencial {
    
    public static void main(String[] args ){
            
            CitaPresencial[] citas = new CitaPresencial[3];
            citas[0] = new CitaPresencial("Mateo", new Date(2022, 5, 13), "16:30", "18:30");
            citas[1] = new CitaPresencial("Luis", new Date(2022, 5, 13), "13:00", "14:00");
            citas[2] = new CitaPresencial("Jorge", new Date(2022, 5, 13), "14:15", "16:00");
        try {
            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("citaPresencial.txt"));
            escribir.writeObject(citas);
            escribir.close();
            
            ObjectInputStream recuperar = new ObjectInputStream(new FileInputStream("citaPresencial.txt"));
            CitaPresencial [] ingresoRecuperado = (CitaPresencial[]) recuperar.readObject();
            recuperar.close();
            for (CitaPresencial citap: ingresoRecuperado) {
                System.out.println(citap);
            }
        }catch(Exception e){
            
        }
        }
    
}
