package dominio;

import datos.SerializacionCitaVirtual;
import java.io.Serializable;

/**
 *
 * @author Edu. N
 */
public class AdministrarCita implements IAdministrarCRUD, Serializable {

    /**
     * Array de citas
     */
    public static Cita citas[];
    /**
     * Número de citas
     */
    public static int numCitas;

    /**
     * Bloque estático. Inicializa el array de citas con un tamaño de 3 y establece el número de citas en 0 al momento de crear la clase.
     */
    
    static {
        citasV = new CitaVirtual[3];
        numCitasVirtuales = 0;
    }
    
    protected static CitaVirtual citasV[];
    protected static int numCitasVirtuales;
    

    /**
     * Constructor sin argumentos. Inicializa el array de citas con un tamaño de 3 y establece el número de citas en 0.
     */
    public AdministrarCita() {
        citas = new Cita [3];
        numCitas= 0;
        citasV = new CitaVirtual[3];
        numCitasVirtuales = 0;
    }

    /**
     * Constructor con argumentos. Inicializa el array de citas y el número de citas con los valores pasados como parámetros.
     *
     * @param citas array de citas
     * @param numCitas número de citas
     */
    public AdministrarCita(Cita[] citas, int numCitas) {
        citas = new Cita[3];
        numCitas = 0;
        citasV = new CitaVirtual[3];
        numCitasVirtuales = 0;
    }

    /**
     * Constructor con referencia a objeto. Inicializa el array de citas y el número de citas con los valores del objeto pasado como parámetro.
     *
     * @param o objeto con los valores a ser copiados
     */
    public AdministrarCita(AdministrarCita cita1) {
        this(cita1.getCitas(), cita1.getNumCitas());
    }

    //Get y Set

    /**
     * Lee el arreglo de citas
     * @return 
     */
    public static Cita[] getCitas() {
        return citas;
    }

    /**
     * Modifica el arreglo de citas
     * @param citas 
     */
    public static void setCitas(Cita[] citas) {
        AdministrarCita.citas = citas;
    }

    /**
     * Lee el numero de citas
     * @return 
     */
    public static int getNumCitas() {
        return numCitas;
    }

    /**
     * Modofica el numero de citas
     * @param numCitas 
     */
    public static void setNumCitas(int numCitas) {
        AdministrarCita.numCitas = numCitas;
    }

    /**
     * Lee el el numero de citas virtuales
     * @return 
     */
    public static int getNumCitasVirtuales() {
        return numCitasVirtuales;
    }

    /**
     * Modifica  el numero de citas
     * @param numCitasVirtuales 
     */
    public static void setNumCitasVirtuales(int numCitasVirtuales) {
        AdministrarCita.numCitasVirtuales = numCitasVirtuales;
    }

    /**
     * Lee el arreglo de citas viruales
     * @return 
     */
    public CitaVirtual[] getCitasV() {
        return citasV;
    }

    /**
     * Modifica el arreglo de citas virtuales
     * @param citasV 
     */
    public static void setCitasV(CitaVirtual[] citasV) {
        AdministrarCita.citasV = citasV;
    }
    
    
    //Metodos CRUD de la clase 
    /**
     * Método para crear un nuevo lugar de citas.
     *
     * @param cita
     */
//    public void crearCita(String lugar) {
    public void crearCita(Cita cita) {

        //Creacion de un array para si es el caso agregue más clientes
        if (numCitas == citas.length) {
            Cita[] aux = new Cita[citas.length + 1];
            System.arraycopy(citas, 0, aux, 0, citas.length);
            citas = aux;
        }
        int i = numCitas++;
        // System.out.println(i);
        //clientes[i] = new Cliente(idCliente, nombre, apellido);
        citas[i] = cita;

    }

    /**
     * Método para editar un lugar existente.
     *
     * @param posicion
     * @param cita
     *
     */
//    public void editarCita(int posicion, String lugar) {
            

    public void editarCita(int posicion, Cita cita) {

//        citas[posicion] = Cita(citas);
    }

    /**
     * Método para buscar un lugar específico.
     *
     * @param posicion
     * @return el objeto AdminCita correspondiente al lugar buscado, o null si no se encuentra el lugar.
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
     * @param cita
     */
    public void eliminarCita(int posicion, Cita cita) {
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

    public void inicializarCitaVirtual(){
        citasV = SerializacionCitaVirtual.deserializarCitaVirtual();
        if (citasV==null) {
            citasV=new CitaVirtual[3];
        }else{
            for (CitaVirtual citaV : citasV) {
                if (citaV!=null) {
                }
            }
            numCitasVirtuales = citasV.length;
        }
    }

    @Override
    public String nuevo(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
