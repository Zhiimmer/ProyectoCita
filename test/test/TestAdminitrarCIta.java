package test;

import dominio.AdministrarCita;

/**
 *
 * @author Edu. N
 */
public class TestAdminitrarCIta {

    public static void main(String[] args) {

        //Crear lugares
        AdministrarCita cita = new AdministrarCita() {
            @Override
            public void motivo() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        cita.crearCita("CISCO");
        cita.crearCita("Lab. Sistemas");
        cita.crearCita("Aso. Ciencias");
        //Listar los lugares
        System.out.println("Se van a imprimir la lista de los lugares de las citas");
        System.out.println(cita.listarCita());
        //Buscar los lugares
        System.out.println("Buscamos el lugar llamado CISCO: \n\n" + cita.buscarCita(0));
        //Editar los lugares
        System.out.println("Se va a editar el lugar Lab. Sistemas por Patio Civil");
        cita.editarCita(1, "Patio Civil");
        System.out.println(cita.listarCita());
        //Eliminar lugar
        System.out.println("Vamos a eliminar Lab. Sistemas de los lugares de la cita");
        cita.eliminarCita(1, "Lab.Sistemas");
        System.out.println(cita.listarCita());

    }

}
