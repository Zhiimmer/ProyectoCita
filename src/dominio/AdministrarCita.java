package dominio;

/**
 *
 * @author Edu. N
 */
public class AdministrarCita {

    /**
     * Array de citas
     */
    private static Cita citas[];
    /**
     * Número de citas
     */
    private static int numCitas;

    
    /**
     * Bloque estático. Inicializa el array de citas con un tamaño de 3 y establece el número de citas en 0 al momento de crear la clase.
     */
    static {
        citas = new Cita[3];
        numCitas = 0;
    }

    /**
     * Constructor sin argumentos. Inicializa el array de citas con un tamaño de 3 y establece el número de citas en 0.
     */
    public AdministrarCita() {
//        this.citas = new Cita[3];
//        this.numCitas = 0;
        
    }

    /**
     * Constructor con argumentos. Inicializa el array de citas y el número de citas con los valores pasados como parámetros.
     *
     * @param citas array de citas
     * @param numCitas número de citas
     */
    public AdministrarCita(Cita[] citas, int numCitas) {
//        this.citas = citas;
//        this.numCitas = numCitas;

    }

    /**
     * Constructor con referencia a objeto. Inicializa el array de citas y el número de citas con los valores del objeto pasado como parámetro.
     *
     * @param o objeto con los valores a ser copiados
     */
    public AdministrarCita(AdministrarCita o) {
//        this.citas = o.citas;
//        this.numCitas = o.numCitas;
    }
    
    //Metodos CRUD de la clase 
    
    /**
     * Método para crear un nuevo lugar de citas.
     *
     * @param lugar el nombre del nuevo lugar.
     */
    public void crearCita(String lugar) {

        //Creacion de un array para si es el caso agregue más clientes
        if (numCitas == citas.length) {
            Cita[] aux = new Cita[citas.length + 1];
            System.arraycopy(citas, 0, aux, 0, citas.length);
            citas = aux;
        }
        int i = numCitas++;
        // System.out.println(i);
        //clientes[i] = new Cliente(idCliente, nombre, apellido);
        citas[i] = new Cita() {};

    }

    /**
     * Método para editar un lugar existente.
     *
     * @param posicion
     * @param lugar
     *
     */
    public void editarCita(int posicion, String lugar) {
        citas[posicion] = new Cita() {};
    }

    /**
     * Método para buscar un lugar específico.
     *
     * @param posicion
     * @return el objeto AdminCita correspondiente al lugar buscado, o null si
     * no se encuentra el lugar.
     */
    public Cita buscarCita(int posicion) {
        return citas[posicion];
    }

    /**
     * Método para listar todos los lugares creados.
     *
     * @return
     */
    public String listarCita() {
        String lista = "";
        for (Cita cita : citas) {
            if (cita != null) {
                lista += cita + "\r\n";
            }
        }
        return lista;

    }

    /**
     * Método para eliminar un lugar existente.
     *
     * @param posicion
     * @param lugar
     */
    public void eliminarCita(int posicion, String lugar) {
        numCitas--;
        int a = 0;
        Cita[] eliAux = citas;
        citas = new Cita[numCitas];
        if (posicion < eliAux.length - 1) {
            if (posicion == eliAux.length - 1) {
                System.arraycopy(eliAux, 0, citas, 0, numCitas);

            } else {
                for (int i = 0; i < eliAux.length; i++) {
                    if (i != posicion) {
                        citas[a] = eliAux[i];
                        a++;

                    }
                }
            }
        } else {
            System.out.println("No existe la posicion: " + posicion);

        }
    }
    

}
