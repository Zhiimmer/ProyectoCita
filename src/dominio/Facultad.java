package dominio;

/**
 *
 * @author Gaby Fernández
 */
public class Facultad {

    private String nombreFacultad;
    private static Carrera carreras[];
    private static int numCarreras;

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

     public enum Facultades {
    INGENIERIAQUIMICA,
    INGENIERIAYCIENCIASAPLICADAS,
    INGENIERIAENGEOLOGIAMINASPETRÓLEOSYAMBIENTAL, 
   
}
    /**
     * Metodo sin argumentos
     */
    public Facultad() {
        this("Ciencias aplicadas");
    }

    /**
     * Constructor con argumentos. Inicializa el array de citas y el número de citas con los valores pasados como parámetros.
     *
     * @param carreras
     * @param numCarreras
     */
    public Facultad(Carrera[] carreras, int numCarreras) {
        this.carreras = carreras;
        this.numCarreras = numCarreras;
    }

    /**
     * Método constructor referenciado a un objeto con la "sobre carga de métodos"
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

    /**
     * Creación del método equals
     *
     * @param o
     * @return para saber si dos objetos son del mismo tipo y tienen los mismos datos
     */
    @Override
    public boolean equals(Object o) {
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
    public boolean validarCarrera(Carrera c) {
        boolean resp = false;
        for (Carrera carrera : carreras) {
            if (carrera != null) {
                if (carrera.equals(c)) {
                    resp = true;
                }
            }
        }
        return resp;
    }

    /**
     * Método para editar una carrera existente.
     *
     * @param posicion
     * @param carrera
     *
     */
    public void editarCarrera(int posicion, String carrera) {
        carreras[posicion] = new Carrera();
    }

    /**
     * Método para buscar un lugar específico.
     *
     * @param posicion
     * @return el objeto Facultad correspondiente a la carrera buscada, o null si no se encuentra la carrera.
     */
    public Carrera buscarCarrera(int posicion) {
        return carreras[posicion];
    }

    /**
     * Método para listar todos las carreras creados.
     *
     * @return
     */
    public String listarCarrera() {
        String lista = "";
        for (Carrera carrera : carreras) {
            if (carrera != null) {
                lista += carrera + "\r\n";
            }
        }
        return lista;

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

    //Metodo toString
    /**
     * Este es un metódo que nos permite mostrar la información completa del objeto como una cadena de caracteres
     *
     * @return la información del objeto como una cadena de caracteres
     */
    @Override
    public String toString() {
        return "Facultad{" + "nombreFacultad=" + nombreFacultad + '}';
    }

}
