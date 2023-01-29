/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import dominio.Carrera;
import java.text.ParseException;
import java.util.Scanner;
import dominio.Usuario;

/**
 *
 * @author ronny
 */
public class MenuUsuario {
    Scanner sc = new Scanner(System.in);
    Carrera usuario = new Carrera();
    
    public void setOpc(int opcm) throws ParseException {
        int opcion;
        System.out.println("---------------------------------------");
        System.out.println("           Submenú de Usuarios            ");
        System.out.println("---------------------------------------");
        System.out.println("");
        System.out.println("Menú de opciones:");
        System.out.println("1. Crear usuario");
        System.out.println("2. Modificar usuario");
        System.out.println("3. Consultar usuario");
        System.out.println("4. Eliminar usuario");
        System.out.println("5. Regresar al Menú Principal");
        System.out.println("");
        System.out.println("Escoja una opción: ");
        opcion = sc.nextInt();
        switch (opcion) {

            case 1 -> {
               
                setOpc(1);

            }
            case 2 -> {
//                
                setOpc(1);

            }
            case 3 -> {

                setOpc(1);
            }
            case 4 -> {

                
                setOpc(1);
                

            }
            case 5 -> {
                
                Menu.Menu1();

            }
            default -> {
                System.out.println("Opcion no valida");
            }
        }
    }
}
