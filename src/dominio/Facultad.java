package dominio;

import datos.SerializacionFacultad;
import datos.SerializacionUsuario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Gaby Fernández
 */
public class Facultad implements IAdministrarCRUD, Serializable {

    private String nombreFacultad;
    
    /**
     * Arreglo de los usuarios creados
     */
    private static Usuario usuarios[];
    /**
     * Número de los usuarios
     */
    private static int numUsuarios;
    
    static {
        usuarios = new Usuario[2];
        numUsuarios = 0;
    }
    //Crear CRUD de usuario
    
    /**
     * Lee el arreglo de los usuarios
     *
     * @return usuarios
     */
    public static Usuario[] getUsuarios() {
        return usuarios;
    }

   

    /**
     * Lee el arreglo número de los usuarios
     *
     * @return número de los usuarios
     */
    public static int getNumUsuarios() {
        return numUsuarios;
    }

    /**
     * Método constructor con argumentos
     *
     * @param nombreFacultad
     */
    public Facultad(String nombreFacultad) {
        this.nombreFacultad = nombreFacultad;
    }


    /**
     * Metodo sin argumentos
     */
    public Facultad() {
        this("Ciencias aplicadas");
    }

    /**
     * Método constructor referenciado a un objeto con la "sobre carga de
     * métodos"
     *
     * @param facu1
     */
    public Facultad(Facultad facu1) {
        this(facu1.getNombreFacultad());
    }

    /**
     * Métodos Set y Get
     *
     * @return
     */
    public String getNombreFacultad() {
        return nombreFacultad;
    }

    public void setNombreFacultad(String nombreFacultad) {
        this.nombreFacultad = nombreFacultad;
    }

   

    //Metodo toString
    /**
     * Este es un metódo que nos permite mostrar la información completa del
     * objeto como una cadena de caracteres
     *
     * @return la información del objeto como una cadena de caracteres
     */
    @Override
    public String toString() {
        return "\n\nFacultad \nNombre de la Facultad: " + nombreFacultad;
    }

   
    public String nuevo(Object obj) {
        String mensaje = "No se creo la Usuario";
        if (obj instanceof Usuario) {
            Usuario car = (Usuario) obj;
            this.nuevoUsuario(car);
            mensaje = "La Usuario se creo con exito";
        }
        return mensaje;
    }

    

    public static void nuevoUsuario(Usuario u) {
        if (numUsuarios == usuarios.length) {
            Usuario[] aux = new Usuario[usuarios.length + 1];
            System.arraycopy(usuarios, 0, aux, 0, usuarios.length);
            usuarios = aux;
        }
        int i = numUsuarios++;
        usuarios[i] =u;
    }

//    /**
//     * Metodo para validar carrera de la clase facultad
//     *
//     * @param c
//     * @return
//     */
//    public boolean validarCarrera(Carrera c) throws DuplicadoException {
//        boolean resp = false;
//        for (Carrera carrera : carreras) {
//            if (carrera != null) {
//                if (carrera.equals(c)) {
//                    resp = true;
//                }
//                throw new DuplicadoException("elemento duplicado", carrera);
//            }
//        }
//        return resp;
//    }
//
//    @Override
//    public String editar(Object obj, int posicion) {
//        String mensaje = "";
//        if (obj instanceof Carrera) {
//            try {
//                Carrera carrera = (Carrera) obj;
//                editarCarrera(posicion, carrera);
//                mensaje = "Datos actualizados";
//            } catch (ArrayIndexOutOfBoundsException ae) {
//                mensaje = "No se encuentra la posición " + posicion + " Error: " + ae.getMessage();
//            }
//        }
//        return mensaje;
//    }
//
//    /**
//     * Método para editar una carrera existente.
//     *
//     * @param posicion
//     * @param carrera
//     *
//     */
//    public void editarCarrera(int posicion, Carrera carrera) {
//        carreras[posicion] = carrera;
//    }
//
//    /**
//     *
//     * @param obj
//     * @param id
//     * @return
//     */
//    @Override
//    public Object buscarPorId(Object obj, Integer id) {
//        Object ob = null;
//        if (obj instanceof Carrera) {
//            Carrera car = (Carrera) obj;
//            for (int i = 0; i < carreras.length; i++) {
//                if (i == id) {
//                    ob = carreras[i];
//                }
//            }
//        }
//        return ob;
//    }
//
//    /**
//     * Método para buscar un lugar específico.
//     *
//     * @param posicion
//     * @return el objeto Facultad correspondiente a la carrera buscada, o null
//     * si no se encuentra la carrera.
//     */
//    public Carrera buscarCarrera(int posicion) {
//        return carreras[posicion];
//    }
//
//    /**
//     *
//     * @param obj
//     * @param posicion
//     * @return
//     * @throws Exception
//     */
//    @Override
//    public String borrar(Object obj, int posicion) throws Exception {
//        String mensaje = "";
//        if (obj instanceof Carrera) {
//            int total = carreras.length - 1;
//            try {
//                if (posicion > total) {
//                    throw new Exception("No existe la carrera en la posición " + posicion);
//                } else {
//                    int despues = posicion - 1;
//
//                    Carrera[] caAux = carreras;
//                    carreras = new Carrera[numCarreras];
//                    Carrera[] carrerasantes = new Carrera[despues];
//                    Carrera[] carrerasdespues = new Carrera[numCarreras - posicion];
//                    System.arraycopy(caAux, 0, carrerasantes, 0, despues);
//                    System.arraycopy(caAux, posicion, carrerasdespues, 0, numCarreras - posicion);
//
//                    System.arraycopy(carrerasantes, 0, carreras, 0, carrerasantes.length);
//                    System.arraycopy(carrerasdespues, 0, carreras, carrerasantes.length, carrerasdespues.length);
//
//                    mensaje = "Datos eliminados correctamente";
//                }
//            } catch (ArrayIndexOutOfBoundsException ce) {
//                mensaje = "No existe la carrera en la posición " + posicion;
//            }
//        }
//        return mensaje;
//    }
//
    /**
     * Método para listar todos las carreras creados.
     *
     * @return
     */
    
    public static String listar() {
        String mensaje = "";
            for (Usuario car1 : usuarios) {
                if (car1 != null) {
                    mensaje +=  "].-" + car1.toString() + "\r\n";
                }
            }
        return mensaje;
    }

    public static void carga() {
       usuarios = SerializacionUsuario.deserializarUsuario();
       numUsuarios = usuarios.length -1;
    }

    private void descarga(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        nombreFacultad = (String) in.readObject();
    }

    @Override
    public String editar(Object obj, int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String borrar(Object obj, int posicion) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object buscarPorId(Object obj, Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String listar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
