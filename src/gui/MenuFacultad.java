package gui;

import dominio.Facultad;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Gaby Fernandez
 */
public class MenuFacultad {
    Scanner sc = new Scanner(System.in);

    Facultad carrera = new Facultad();

    /**
     * Creación del submenú de carrera
     *
     * @param opcm
     * @throws ParseException
     */
    public void setOpc(int opcm) throws ParseException {
        int opcion;
        System.out.println("---------------------------------------");
        System.out.println("           Submenú de Carreras            ");
        System.out.println("---------------------------------------");
        System.out.println("");
        System.out.println("Menú de opciones:");
        System.out.println("1. Crear Carrera ");
        System.out.println("2. Modificar Carrera");
        System.out.println("3. Consultar Carrera");
        System.out.println("4. Eliminar Carrera");
        System.out.println("5. Regresar al Menú Principal");
        System.out.println("");
        System.out.println("Escoja una opción: ");
        opcion = sc.nextInt();
        switch (opcion) {

            case 1 -> {

                carrera.crearCarrera("Ing.Sistemas");
                carrera.crearCarrera("Ing. Civil");
                carrera.crearCarrera("Ing. quimica");
                System.out.println("Se creo con exito!");
                setOpc(1);

            }
//            case 2 -> {
//                carrera.editarCarrera(1, "Ing. Petroleo");
//                System.out.println("Se modifico con exito!");
//                setOpc(1);
//
//            }
            case 3 -> {

                carrera.listar();
                System.out.println(carrera.listar());
                setOpc(1);
            }
            case 4 -> {

                carrera.borrar(0, "Ing.Sistemas");
                System.out.println("Se elimino la carrera con exito!");
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
