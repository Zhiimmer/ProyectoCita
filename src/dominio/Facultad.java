package dominio;

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
    private static Carrera carreras[];
    private static int numCarreras;
    private final String INGENIERIA_QUIMICA = "1. INGENIERIA_QUIMICA";
    private final String INGENIERIA_Y_CIENCIAS_APLICADAS = "2. INGENIERIA_Y_CIENCIAS_APLICADAS";
    private final String INGENIERIA_EN_GEOLOGIA_MINAS_PETRÓLEOS_Y_AMBIENTAL = "3. INGENIERIA_EN_GEOLOGIA_MINAS_PETRÓLEOS_Y_AMBIENTAL";

    /**
     * Bloque estático
     */
    static {
        carreras = new Carrera[3];
        numCarreras = 0;

    }

    /**
     * Método constructor con argumentos
     *
     * @param nombreFacultad
     */
    public Facultad(String nombreFacultad) {
        this.nombreFacultad = nombreFacultad;
    }

    @Override
    public String borrar(Object obj, int posicion) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /**
     * Enum para representar las diferentes facultades
     */
    public enum Facultades {
        INGENIERIA_QUIMICA,
        INGENIERIA_Y_CIENCIAS_APLICADAS,
        INGENIERIA_EN_GEOLOGIA_MINAS_PETRÓLEOS_Y_AMBIENTAL,
    }

    /**
     * Método para mostrar la enumeración de las facultades
     */
    public void mostarnNumFacultad() {
        System.out.println(INGENIERIA_QUIMICA);
        System.out.println(INGENIERIA_Y_CIENCIAS_APLICADAS);
        System.out.println(INGENIERIA_EN_GEOLOGIA_MINAS_PETRÓLEOS_Y_AMBIENTAL);
    }

    /**
     * Metodo sin argumentos
     */
    public Facultad() {
        this("Ciencias aplicadas");
    }

    /**
     * Constructor con argumentos. Inicializa el array de citas y el número de
     * citas con los valores pasados como parámetros.
     *
     * @param carreras
     * @param numCarreras
     */
    public Facultad(Carrera[] carreras, int numCarreras) {
        this.carreras = carreras;
        this.numCarreras = numCarreras;
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

    public static Carrera[] getCarreras() {
        return carreras;
    }

    public static void setCarreras(Carrera[] carreras) {
        Facultad.carreras = carreras;
    }

    public static int getNumCarreras() {
        return numCarreras;
    }

    public static void setNumCarreras(int numCarreras) {
        Facultad.numCarreras = numCarreras;
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
        return "Facultad{" + "nombreFacultad=" + nombreFacultad + '}';
    }

    /**
     * Creación del método equals
     *
     * @param o
     * @return para saber si dos objetos son del mismo tipo y tienen los mismos
     * datos
     */
    @Override
    public boolean equals(Object o
    ) {
        boolean resp = false;
        Carrera f = null;
        if (o != null && f instanceof Carrera) {
            f = (Carrera) o;
            if (nombreFacultad.equals(f.nombreCarrera)) {
                resp = true;
            }
        }
        return false;
    }

    /**
     * Metodo crear carrera de la clase facultad
     *
     * @param carrera
     */
    public void crearCarrera(String carrera) {

        //Creacion de un array para si es el caso agregue más carreras
        if (numCarreras == carreras.length) {
            Carrera[] aux = new Carrera[carreras.length + 1];
            System.arraycopy(carreras, 0, aux, 0, carreras.length);
            carreras = aux;
        }
        int i = numCarreras++;
        carreras[i] = new Carrera();

    }

    /**
     * Metodo para validar carrera de la clase facultad
     *
     * @param c
     * @return
     */
    public boolean validarCarrera(Carrera c) throws DuplicadoException {
        boolean resp = false;
        for (Carrera carrera : carreras) {
            if (carrera != null) {
                if (carrera.equals(c)) {
                    resp = true;
                }
                throw new DuplicadoException("elemento duplicado", carrera);
            }
        }
        return resp;
    }

    public String editar(Object obj, int posicion) {
        String mensaje = "";
        if (obj instanceof Carrera) {
            try {
                Carrera carrera = (Carrera) obj;
                editarCarrera(posicion, carrera);
                mensaje = "Datos actualizados";
            } catch (ArrayIndexOutOfBoundsException ae) {
                mensaje = "No se encuentra la posición " + posicion + " Error: " + ae.getMessage();
            }
        }
        return mensaje;
    }

    /**
     * Método para editar una carrera existente.
     *
     * @param posicion
     * @param carrera
     *
     */
    public void editarCarrera(int posicion, Carrera carrera) {
        carreras[posicion] = carrera;
    }

    /**
     * Método para buscar un lugar específico.
     *
     * @param posicion
     * @return el objeto Facultad correspondiente a la carrera buscada, o null
     * si no se encuentra la carrera.
     */
    public Carrera buscarCarrera(int posicion) {
        return carreras[posicion];
    }

    /**
     * Método para listar todos las carreras creados.
     *
     * @return
     */
    @Override
    public String listar(Object obj) {
        String mensaje = "";
        if (obj instanceof Carrera) {
            int con = 0;
            for (Carrera car1 : carreras) {
                if (car1 != null) {
                    mensaje += "[" + con + "].-" + car1.toString() + "\r\n";
                    con++;
                }
            }
        }
        return mensaje;
    }

    /**
     * Método para eliminar una carrera existente.
     *
     * @param posicion
     * @param carrera
     */
    public void eliminarCarrera(int posicion, String carrera) {
        numCarreras--;
        int a = 0;
        Carrera[] eliAux = carreras;
        carreras = new Carrera[numCarreras];
        if (posicion < eliAux.length - 1) {
            if (posicion == eliAux.length - 1) {
                System.arraycopy(eliAux, 0, carreras, 0, numCarreras);

            } else {
                for (int i = 0; i < eliAux.length; i++) {
                    if (i != posicion) {
                        carreras[a] = eliAux[i];
                        a++;

                    }
                }
            }
        } else {
            System.out.println("No existe la posicion: " + posicion);

        }
    }

}
