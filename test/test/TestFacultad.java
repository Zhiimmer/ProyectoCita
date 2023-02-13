/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import dominio.Carrera;
import dominio.Facultad;

/**
 *
 * @author Gaby Fernandez
 */
public class TestFacultad {
    public static void main(String[] args) {

        //Crear carreras
        Facultad carrera = new Facultad();
        carrera.crearCarrera("Ing. Civil");
        carrera.crearCarrera("Ing Sistemas");
        carrera.crearCarrera("Ing. Quimica");
        
        //Listar los carreras
        System.out.println("Se van a imprimir la lista de las carreras de las citas");
        System.out.println(carrera.listar(carrera));
        
        //Buscar los carreras
        System.out.println("Buscamos el lugar llamado Ing. quimica: \n\n" + carrera.buscarCarrera(0));
        
        //Editar los carreras
        System.out.println("Se va a editar el lugar Ing. Sistemas por Ing Civil");
//        carrera.editarCarrera(1, "Ing Civil");
        System.out.println(carrera.listar(carrera));
        
        //Eliminar carreras
        System.out.println("Vamos a eliminar Ing. Sistemas de las carreras de la cita");
       // carrera.borrar(carrera, 2);
        System.out.println(carrera.listar(carrera));

    }
}
