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
        return "\n\nFacultad \nNombre de la Facultad: " + nombreFacultad;
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

    public String nuevo(Object obj) {
        String mensaje = "No se creo la carrera";
        if (obj instanceof Carrera) {
            Carrera car = (Carrera) obj;
            this.nuevaCarrera(car);
            mensaje = "La carrera se creo con exito";
        }
        return mensaje;
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

    public void nuevaCarrera(Carrera car) {
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

    @Override
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
     *
     * @param obj
     * @param id
     * @return
     */
    @Override
    public Object buscarPorId(Object obj, Integer id) {
        Object ob = null;
        if (obj instanceof Carrera) {
            Carrera car = (Carrera) obj;
            for (int i = 0; i < carreras.length; i++) {
                if (i == id) {
                    ob = carreras[i];
                }
            }
        }
        return ob;
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
     *
     * @param obj
     * @param posicion
     * @return
     * @throws Exception
     */
    @Override
    public String borrar(Object obj, int posicion) throws Exception {
        String mensaje = "";
        if (obj instanceof Carrera) {
            int total = carreras.length - 1;
            try {
                if (posicion > total) {
                    throw new Exception("No existe la carrera en la posición " + posicion);
                } else {
                    int despues = posicion - 1;

                    Carrera[] caAux = carreras;
                    carreras = new Carrera[numCarreras];
                    Carrera[] carrerasantes = new Carrera[despues];
                    Carrera[] carrerasdespues = new Carrera[numCarreras - posicion];
                    System.arraycopy(caAux, 0, carrerasantes, 0, despues);
                    System.arraycopy(caAux, posicion, carrerasdespues, 0, numCarreras - posicion);

                    System.arraycopy(carrerasantes, 0, carreras, 0, carrerasantes.length);
                    System.arraycopy(carrerasdespues, 0, carreras, carrerasantes.length, carrerasdespues.length);

                    mensaje = "Datos eliminados correctamente";
                }
            } catch (ArrayIndexOutOfBoundsException ce) {
                mensaje = "No existe la carrera en la posición " + posicion;
            }
        }
        return mensaje;
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

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeObject(nombreFacultad);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        nombreFacultad = (String) in.readObject();
    }

}
