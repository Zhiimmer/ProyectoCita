/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.CitaVirtual;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
            citasV[0] = new CitaVirtual("", new Date(2022, 5, 13), 0, "Zoom");
            citasV[1] = new CitaVirtual("", new Date(2022, 5, 13), 0, "Teams");
            citasV[2] = new CitaVirtual("", new Date(2022, 5, 13), 0, "Google Meet");
        try {
            ObjectOutputStream e = new ObjectOutputStream(new FileOutputStream("citaVirtual.txt"));
            e.writeObject(citasV);
            e.close();
            
            ObjectInputStream r = new ObjectInputStream(new FileInputStream("citaVirtual.txt"));
            CitaVirtual [] ingresoRecuperado = (CitaVirtual[]) r.readObject();
            r.close();
            for (CitaVirtual cita1V: ingresoRecuperado) {
                System.out.println(cita1V);
            }
        }catch(Exception e){
            
        }
        }
    
}
