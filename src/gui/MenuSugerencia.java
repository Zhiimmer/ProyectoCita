
package gui;

import dominio.Usuario;
import java.text.ParseException;
import java.util.Scanner;
import dominio.Usuario;

/**
 *
 * @author Edu. N
 */
public class MenuSugerencia {

    Scanner sc = new Scanner(System.in);

    Usuario sugerencia = new Usuario();

    public void setOpc(int opcm) throws ParseException {
        int opcion;
        System.out.println("---------------------------------------");
        System.out.println("           Submenú de Sugerencias            ");
        System.out.println("---------------------------------------");
        System.out.println("");
        System.out.println("Menú de opciones:");
        System.out.println("1. Crear Sugerencia ");
        System.out.println("2. Modificar Sugerencia");
        System.out.println("3. Consultar Sugerencia");
        System.out.println("4. Eliminar Sugerencia");
        System.out.println("5. Regresar al Menú Principal");
        System.out.println("");
        System.out.println("Escoja una opción: ");
        opcion = sc.nextInt();
        switch (opcion) {

            case 1 -> {
//                Usuario.crearSugerencia();
                System.out.println("Se creo con exito!");
                setOpc(1);
            }
            case 2 -> {
                //Usuario.editarSugerencia();
                System.out.println("Se modifico con exito!");
                setOpc(1);
            }
            case 3 -> {
                 //Usuario.buscarSugerencia();
                setOpc(1);
            }
            case 4 -> {
                //Usuario.eliminarSugerencia();
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
