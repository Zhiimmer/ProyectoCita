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
        usuarios[i] = u;
    }

    /**
     * Metodo para validar carrera de la clase facultad
     *
     * @param c
     * @return
     */
    public boolean validarUsuario(Usuario u) throws DuplicadoException {
        boolean resp = false;
        for (Usuario usuario : usuarios) {
            if (usuario != null) {
                if (usuario.equals(u)) {
                    resp = true;
                }
                throw new DuplicadoException("elemento duplicado", usuario);
            }
        }
        return resp;
    }

    @Override
    public String editar(Object obj, int posicion) {
        String mensaje = "";
        if (obj instanceof Usuario) {
            try {
                Usuario usuario = (Usuario) obj;
                editarUsuario(posicion, usuario);
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
    public void editarUsuario(int posicion, Usuario usuario) {
        usuarios[posicion] = usuario;
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
        if (obj instanceof Usuario) {
            Usuario usua = (Usuario) obj;
            for (int i = 0; i < usuarios.length; i++) {
                if (i == id) {
                    ob = usuarios[i];
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
    public static boolean buscarUsuario(Usuario us) {
        boolean resultado = false;

        for (Usuario u : usuarios) {
            if (u != null && u.equals(us)) {
                resultado = true;
            }
        }
        return resultado;
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
        if (obj instanceof Usuario) {
            int total = usuarios.length - 1;
            try {
                if (posicion > total) {
                    throw new Exception("No existe el usuario en la posición " + posicion);
                } else {
                    int despues = posicion - 1;

                    Usuario[] usAux = usuarios;
                    usuarios = new Usuario[numUsuarios];
                    Usuario[] usuariosantes = new Usuario[despues];
                    Usuario[] usuariosdespues = new Usuario[numUsuarios - posicion];
                    System.arraycopy(usAux, 0, usuariosantes, 0, despues);
                    System.arraycopy(usAux, posicion, usuariosdespues, 0, numUsuarios - posicion);

                    System.arraycopy(usuariosantes, 0, usuarios, 0, usuariosantes.length);
                    System.arraycopy(usuariosdespues, 0, usuarios, usuariosantes.length, usuariosdespues.length);

                    mensaje = "Datos eliminados correctamente";
                }
            } catch (ArrayIndexOutOfBoundsException ce) {
                mensaje = "No existe el usuario en la posición " + posicion;
            }
        }
        return mensaje;
    }

    /**
     * Método para listar todos las carreras creados.
     *
     * @return
     */
    public String listar(Object obj) {
        String mensaje = "";
        if (obj instanceof Usuario) {
            int con = 0;
            for (Usuario usu : usuarios) {
                if (usu != null) {
                    mensaje += "[" + con + "].-" + usu.toString() + "\r\n";
                    con++;
                }
            }
        }
        return mensaje;
    }

    public static void carga() {
        usuarios = SerializacionUsuario.deserializarUsuario();
        numUsuarios = usuarios.length - 1;
    }

    private void descarga(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        nombreFacultad = (String) in.readObject();
    }

}
