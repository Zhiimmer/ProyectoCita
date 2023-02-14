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
            
            CitaPresencial[] citaP = new CitaPresencial[3];
            citaP[0] = new CitaPresencial("Mateo", new Date(2022, 5, 13), "11:30 AM", "12:30 PM");
            citaP[1] = new CitaPresencial("Luis", new Date(2022, 5, 13), "13:00 PM", "14:00 PM");
            citaP[2] = new CitaPresencial("Jorge", new Date(2022, 5, 13), "14:15 PM", "16:00 PM");
        try {
            ObjectOutputStream e = new ObjectOutputStream(new FileOutputStream("citaPresencial.txt"));
            e.writeObject(citaP);
            e.close();
            
            ObjectInputStream r = new ObjectInputStream(new FileInputStream("citaPresencial.txt"));
            CitaPresencial [] ingresoRecuperado = (CitaPresencial[]) r.readObject();
            r.close();
            for (CitaPresencial citap: ingresoRecuperado) {
                System.out.println(citap);
            }
        }catch(Exception e){
            
        }
        }
}
