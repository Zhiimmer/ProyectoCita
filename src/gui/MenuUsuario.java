/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import dominio.Carrera;
import dominio.Facultad;
import java.text.ParseException;
import java.util.Scanner;
import dominio.Usuario;

/**
 *
 * @author ronny
 */
public class MenuUsuario {
    Scanner sc = new Scanner(System.in);

    Usuario u = new Usuario();

    public void setOpc(int opcm) throws ParseException {
        int opcion;
        System.out.println("---------------------------------------");
        System.out.println("         Submenú de Usuarios           ");
        System.out.println("---------------------------------------");
        System.out.println("");
        System.out.println("Menú de opciones:");
        System.out.println("1. Crear Usuario ");
        System.out.println("2. Modificar Sugerencia");
        System.out.println("3. Consultar Sugerencia");
        System.out.println("4. Eliminar Sugerencia");
        System.out.println("5. Regresar al Menú Principal");
        System.out.println("");
        System.out.println("Escoja una opción: ");
        opcion = sc.nextInt();
        Facultad.carga();
        switch (opcion) {

            case 1 -> {
                //Usuario.crearSugerencia();
                Facultad.nuevoUsuario(u);
                System.out.println("Se creo con exito!");
                setOpc(1);
            }
            case 2 -> {
                //Usuario.modificarSugerencia(1, "");
                System.out.println(Facultad.listar());
                System.out.println("Se modifico con exito!");
                setOpc(1);
            }
            case 3 -> {
                //Usuario.buscarSugerencia(1);
                setOpc(1);
            }
            case 4 -> {
                //Usuario.eliminarSugerencia(1);
                setOpc(1);
            }
            case 5 -> {
                System.out.println("Regresando al Menú Principal...");
                Menu.Menu1();
            }
            default -> {
                System.out.println("Opcion no valida");
            }
        }
    }
}
