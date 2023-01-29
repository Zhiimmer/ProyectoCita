package gui;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Edu. N
 */
public class Menu {

    /**
     * Despliegue del Menu principal de nuestro pyoyecto
     *
     * @throws java.text.ParseException
     */
    public static void Menu1() throws ParseException {

        Scanner leer = new Scanner(System.in);

        int opcion;
        System.out.println("-----------------------------");
        System.out.println("|Bienvenido a Cupido Cabezón|");
        System.out.println("-----------------------------");
        System.out.println("");
        System.out.println("Menú de opciones:");
        System.out.println("");
        System.out.println("1. Menú Gestionar Usuario");
        System.out.println("2. Menú Gestionar Facultad");
        System.out.println("3. Menú Gestionar Compatibilidad");
        System.out.println("4. Menú Gestionar Citas");
        System.out.println("5. Menú Gestionar Sugerencias");
        System.out.println("6. Salir ");
        System.out.println("");
        System.out.println("Escoja una opción: ");
        opcion = leer.nextInt();
        /**
         * Creacion de los case para cada accion dentro de nuestro programa
         */
        switch (opcion) {
            case 1 -> {
                System.out.println("");
                System.out.println("-------------------------------------");
                System.out.println("|         Gestionar Usuario         |");
                System.out.println("-------------------------------------");
                System.out.println("");
//                MenuUsuario subMenuUsuarios = new MenuUsuario();
//                subMenuUsuarios.setOpc(opcion);
            }
            case 2 -> {
                System.out.println("");
                System.out.println("-------------------------------------");
                System.out.println("|          Gestionar Carrera       |");
                System.out.println("-------------------------------------");
                System.out.println("");
//                MenuFacultad subMenuFac = new MenuFacultad();
//                subMenuFac.setOpc(opcion);
            }
            case 3 -> {
                System.out.println("");
                System.out.println("-------------------------------------");
                System.out.println("|      Gestionar Compatibilidad     |");
                System.out.println("-------------------------------------");
                System.out.println("");
                System.out.println("");
                MenuCompatibilidad comp = new MenuCompatibilidad();
                comp.setOpc(opcion);
            }

            case 4 -> {
                System.out.println("");
                System.out.println("-------------------------------------");
                System.out.println("|          Gestionar Citas           |");
                System.out.println("-------------------------------------");
                System.out.println("");
                System.out.println("");
                MenuAdministrarCita subMenuAdminCitas = new MenuAdministrarCita();
                subMenuAdminCitas.setOpc(opcion);
            }
            case 5 -> {
                System.out.println("");
                System.out.println("-------------------------------------");
                System.out.println("|        Gestionar Sugerencias      |");
                System.out.println("-------------------------------------");
                System.out.println("");
                System.out.println("");
//                MenuSugerencia subMenuSugerencias = new MenuSugerencia();
//                subMenuSugerencias.setOpc(opcion);
            }
            case 6 ->
                System.out.println("Gracias por visitarnos, vuelva pronto :)");
            default -> {
                System.out.println("");
                System.out.println("--Opción no válida--");
                System.out.println("--Ingrese nuevamente--");
                System.out.println("");
            }
        }

    }

    public static void main(String[] args) throws ParseException {
        Menu1();
    }

}
