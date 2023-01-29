
package gui;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Edu. N
 */
public class MenuCompatibilidad {
    Scanner sc = new Scanner(System.in);

    public void setOpc(int opcm) throws ParseException{

        int opcion;

        System.out.println("-----------------------------");
        System.out.println("|  SubMenú Compatibilidad   |");
        System.out.println("-----------------------------");
        System.out.println("");
        System.out.println("Menú de opciones:");
        System.out.println("");
        System.out.println("1. Vincular Usuario");
        System.out.println("2. Desvincular Usuario");
        System.out.println("3. Regresar al Menú Principal");
        System.out.println("");
        System.out.println("Escoja una opción: ");
        opcion = sc.nextInt();
        /**
         * Creacion de los case para cada accion dentro de nuestro programa
         */
        switch (opcion) {
            case 1 -> {
                
            }
            case 2 -> {
                
            }
            case 3 -> {
                System.out.println("Regresando al Menú Principal...");
                Menu.Menu1();

            }

            default -> {
                System.out.println("");
                System.out.println("--Opción no válida--");
                System.out.println("--Ingrese nuevamente--");
                System.out.println("");
            }
        }

    }

}
