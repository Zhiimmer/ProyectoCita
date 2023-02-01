
package gui;

import dominio.Cita;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Edu. N
 */
public class MenuAdministrarCita {
    Scanner sc = new Scanner(System.in);

    Cita cita = new Cita() {};

    public void setOpc(int opcm) throws ParseException {
        int opcion;
        System.out.println("---------------------------------------");
        System.out.println("           Submenú de Citas            ");
        System.out.println("---------------------------------------");
        System.out.println("");
        System.out.println("Menú de opciones:");
        System.out.println("1. Crear Cita ");
        System.out.println("2. Modificar Cita");
        System.out.println("3. Consultar Cita");
        System.out.println("4. Eliminar Cita");
        System.out.println("5. Regresar al Menú Principal");
        System.out.println("");
        System.out.println("Escoja una opción: ");
        opcion = sc.nextInt();
        switch (opcion) {

            case 1 -> {

//                cita.crearUsuario("Martín");
//                cita.crearUsuario("Johanna");
//                System.out.println("Se generó con éxito su cita!");
//                setOpc(1);

            }
            case 2 -> {
//                cita.editarUsuario(1, "Jorge");
//                System.out.println("Se modifico con exito!");
//                setOpc(1);

            }
            case 3 -> {

//                cita.listarUsuario();
//                System.out.println(cita.listarUsuario());
//                setOpc(1);
            }
            case 4 -> {

//                cita.eliminarUsuario(0, "Martín");
//                System.out.println("Se elimino la persona con la que iba a tener la cita!");
//                setOpc(1);

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
