package dominio;
import datos.SerializacionSugerencia;
import static datos.SerializacionSugerencia.deserializarSugerencia;
import datos.SerializacionUsuario;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author Ronny Alexis Paspuel Anchundia
 */
public class Usuario implements Serializable {

   

    //ATRIBUTOS
    /**
     * Nombre del usuario
     */
    private String nombre;
    /**
     * Apellido del usuario
     */
    private String apellido;
    /**
     * Edad del usuario
     */
    private int edad;
    /**
     * Correo institucional del usuario
     */
    private String correoinstitucional;
    /**
     * Género musical del usuario
     */
    private String generoMusical;
    /**
     * Color favorito del usuario
     */
    private String colorFav;
    /**
     * Comida favorita del usuario
     */
    private String comidaFav;
    /**
     * Libro favorito del usuario
     */
    private String libroFav;
    /**
     * animal favorito del usuario
     */
    private String animalFav;
    /**
     * Película favorita del usuario
     */
    private String peliculaFav;
    /**
     * Hobby del usuario
     */
    private String hobby;
    /**
     * Signo zodiacal del usuario
     */
    private String signoZodiacal;
    /**
     * Fumador Social del usuario
     */
    final boolean fumadorSocial;
    /**
     * Compatibilidad del usuarii
     */
    private Compatibilidad compatibilidad;
    /**
     * Arreglo de las sugerencias creadas
     */
    private static Sugerencia sugerencias[];
    
    /**
     * Número de sugerencias
     */
    private static int numSugerencias;
    
    /**
     * Bloque estático
     */
    static {
        sugerencias = new Sugerencia[3];
        numSugerencias = 0;
    }

    /**
     * Método constructor sin argumentos con la "sobre carga de métodos"
     */
    public Usuario() {
        this("Mateo", "Espinosa", 20, "maespinosa@uce.edu.ec", "bachata", "Azul", "Lasaña", "Los 3 cerditos", "Perro",
                "El conjuro", "Tocar guitarra", "Aries", false);
    }

    /**
     * Método constructor con argumentos
     *
     * @param nombre
     * @param apellido
     * @param edad
     * @param correoInstitucional
     * @param generoMusical
     * @param colorFav
     * @param comidaFav
     * @param libroFav
     * @param animalFav
     * @param peliculaFav
     * @param hobby
     * @param signoZodiacal
     * @param fumadorSocial
     */
    public Usuario(String nombre, String apellido, int edad, String correoInstitucional, String generoMusical, String colorFav,
            String comidaFav, String libroFav, String animalFav, String peliculaFav, String hobby, String signoZodiacal,
            boolean fumadorSocial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correoinstitucional = correoInstitucional;
        this.generoMusical = generoMusical;
        this.colorFav = colorFav;
        this.comidaFav = comidaFav;
        this.libroFav = libroFav;
        this.animalFav = animalFav;
        this.peliculaFav = peliculaFav;
        this.hobby = hobby;
        this.signoZodiacal = signoZodiacal;
        this.fumadorSocial = fumadorSocial;
    }
    

    /**
     * Método constructor referenciado a un objeto con la "sobre carga de
     * métodos"
     *
     * @param user1
     */
    public Usuario(Usuario user1) {
        this(user1.getNombre(), user1.getApellido(), user1.getEdad(), user1.getCorreoinstitucional(), user1.getGeneroMusical(),
                user1.getColorFav(), user1.getComidaFav(), user1.getLibroFav(), user1.getAnimalFav(), user1.getPeliculaFav(),
                user1.getHobby(), user1.getSignoZodiacal(), user1.isFumadorSocial());
    }

    /**
     * Métodos Set
     */
    /**
     * Lee el nombre del usuario
     *
     * @return nombre del usuario
     */
    public String getNombre() {
//        nombre = "Juanito";
        return nombre;
    }

    /**
     * Modifica el nombre del usuario
     *
     * @param nombre nombre del usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Lee el apellido del usuario
     *
     * @return apellido del usuario
     */
    public String getApellido() {
//        apellido = "Perez";
        return apellido;
    }

    /**
     * Modifica el apellido del usuario
     *
     * @param apellido apellido del usuario
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Lee la edad del usuario
     *
     * @return edad del usuario
     */
    public int getEdad() {
//        edad = 19;
        return edad;
    }

    /**
     * Modifica la edad del usuario
     *
     * @param edad del usuario
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Lee el correo institucional del usuario
     *
     * @return correoinstitucional correo del usuario
     */
    public String getCorreoinstitucional() {
//        correoinstitucional = "juanitoperez@uce.edu.ec";
        return correoinstitucional;
    }

    /**
     * Modifica el correo instirucional de usuario
     *
     * @param correoinstitucional correo del usuario
     */
    public void setCorreoinstitucional(String correoinstitucional) {
        this.correoinstitucional = correoinstitucional;
    }

    /**
     * Lee el género musical del usuario
     *
     * @return generoMusical género musical del usuario
     */
    public String getGeneroMusical() {
//        generoMusical = "Rock";
        return generoMusical;
    }

    /**
     * Modifica el género musical del usuario
     *
     * @param generoMusical género musical del usuario
     */
    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    /**
     * Lee el color favorito del usuario
     *
     * @return colorFav color favorito del usuario
     */
    public String getColorFav() {
//        colorFav = "Verde";
        return colorFav;
    }

    /**
     * Modifica el color favorito del usuario
     *
     * @param colorFav color favorito del usuario
     */
    public void setColorFav(String colorFav) {
        this.colorFav = colorFav;
    }

    /**
     * Lee la comida favorita del usuario
     *
     * @return comidaFav comida favorita del usuario
     */
    public String getComidaFav() {
//        comidaFav = "Papas";
        return comidaFav;
    }

    /**
     * Modifica el color favorito del usuario
     *
     * @param comidaFav comida favorita del usuario
     */
    public void setComidaFav(String comidaFav) {
        this.comidaFav = comidaFav;
    }

    /**
     * Lee el libro favorito del usuario
     *
     * @return libroFav libro favorito del usuario
     */
    public String getLibroFav() {
//        libroFav = "Condorito";
        return libroFav;
    }

    /**
     * Modifica el libro favorito de usuario
     *
     * @param libroFav libro favorito del usuario
     */
    public void setLibroFav(String libroFav) {
        this.libroFav = libroFav;
    }

    /**
     * Lee el animal favorito de usuario
     *
     * @return animalFav del usuario
     */
    public String getAnimalFav() {
//        animalFav = "Puma";
        return animalFav;
    }

    /**
     * Modifica el animal favorito de usuario
     *
     * @param animalFav animal favorito del usuario
     */
    public void setAnimalFav(String animalFav) {
        this.animalFav = animalFav;
    }

    /**
     * Lee la película favorita del usuario
     *
     * @return peliculaFav pelicula favorita del usuario
     */
    public String getPeliculaFav() {
//        peliculaFav = "Spider-Man";
        return peliculaFav;
    }

    /**
     * Modifica la película favotia del usuario
     *
     * @param peliculaFav pelicula favorita del usuario
     */
    public void setPeliculaFav(String peliculaFav) {
        this.peliculaFav = peliculaFav;
    }

    /**
     * Lee el hobby del usuario
     *
     * @return hobby del usuario
     */
    public String getHobby() {
//        hobby = "Correr";
        return hobby;
    }

    /**
     * Modifica el hobby del usuario
     *
     * @param hobby hobby del usuario
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    /**
     * Lee el signo zodiacal del usuario
     *
     * @return signoZodiacal signoZodiacal del usuario
     */
    public String getSignoZodiacal() {
//        signoZodiacal = "Cancer";
        return signoZodiacal;
    }

    /**
     * Modifica el signo zodiacal de usuario
     *
     * @param signoZodiacal signo zodiacal del usuario
     */
    public void setSignoZodiacal(String signoZodiacal) {
        this.signoZodiacal = signoZodiacal;
    }

    /**
     * Valida si es fumador social el usuario
     *
     * @return fumadorSocial fumador social del usuario
     */
    public boolean isFumadorSocial() {
//        boolean result;
        if (fumadorSocial == true) {
            System.out.println("El " + getNombre() + " es fumador");
        } else {
            System.out.println("No es fumador " + getNombre());
        }
        return fumadorSocial;
    }

    /**
     * Lee la compatibilidad del usuario
     *
     * @return Compatibilidad del usuario
     */
    public Compatibilidad getCompatibilidad() {
        return compatibilidad;
    }

    /**
     * Modifica la compatibilidad del usuario
     *
     * @param compatibilidad compatibilidad del usuario
     */
    public void setCompatibilidad(Compatibilidad compatibilidad) {
        this.compatibilidad = compatibilidad;
    }

    /**
     * Lee el número de sugerencias del usuario
     *
     * @return Número de sugerencias del usuario
     */
    public static int getNumSugerencias() {
        return numSugerencias;
    }

    /**
     * 
     * @return 
     */
    public Sugerencia[] getSugerencias() {
        return sugerencias;
    }

    /**
     * 
     * @param sugerencias 
     */
    public static void setSugerencias(Sugerencia[] sugerencias) {
        Usuario.sugerencias = sugerencias;
    }
    
    /**
     * Modifica el número de sugerencias del usuario
     *
     * @param numSugerencias número de sugerencias del usuario
     */
    public static void setNumSugerencias(int numSugerencias) {
        Usuario.numSugerencias = numSugerencias;
    }

    

    @Override
    public String toString() {
        return "\n\nUsuario \n Nombre: " + nombre + "\n Apellido: " + apellido + "\n edad: " + edad + "\n correoinstitucional: " + 
                correoinstitucional + "\n generoMusical: " + generoMusical + "\n colorFav: " + colorFav + "\n comidaFav: " + comidaFav + 
                "\n libroFav: " + libroFav + "\n animalFav: " + animalFav + "\n peliculaFav: " + peliculaFav + "\n hobby: " + hobby + 
                "\n signoZodiacal: " + signoZodiacal + "\n fumadorSocial: " + fumadorSocial + "\n compatibilidad: " + compatibilidad;
    }
    
    public void inicializarSugerencia(){
        sugerencias = deserializarSugerencia();
        if (sugerencias==null) {
            sugerencias=new Sugerencia[3];
        }else{
            for (Sugerencia su : sugerencias) {
                if(su!=null){
                }
            }
            numSugerencias = sugerencias.length;
        }
    }

    /**
     * Creación del método equals
     *
     * @param s
     * @return para saber si dos objetos son del mismo tipo y tienen los mismos
     * datos
     */
    @Override
    public boolean equals(Object s) {
        boolean resp = false;
        Usuario u = null;
        if (s != null && s instanceof Usuario) {
            u = (Usuario) s;
            if (nombre.equals(u.nombre) && apellido.equals(u.apellido) && correoinstitucional.equals(u.correoinstitucional)) {
                resp = true;
            }
        }
        return resp;
    }

    public static void nuevaSugerencia(Sugerencia s) {
        if (numSugerencias == sugerencias.length) {
            Sugerencia[] aux = new Sugerencia[sugerencias.length + 1];
            System.arraycopy(sugerencias, 0, aux, 0, sugerencias.length);
            sugerencias = aux;
        }
        int i = numSugerencias++;
        sugerencias[i] = s;
    }
    
    /**
     * Método para crear una nueva sugerencia.
     *
     * @param sugerencia la sugerencia nueva.
     */
    public void crearSugerencia(String s) throws DuplicadoException{
        int i = numSugerencias++;
        if (numSugerencias > sugerencias.length) {
            Sugerencia[] sugerenciaAux = sugerencias;
            sugerencias = new Sugerencia[numSugerencias];
            System.arraycopy(sugerencias, 0, sugerenciaAux, s.length(), 20);
            throw new DuplicadoException("La sugerencia ya existe");
        }
        sugerencias[i] = new Sugerencia();
    }
    
    /**
     * Método para validar la sugerencia creada
     * @param s
     * @return 
     */
    public boolean validarSugerencia(Sugerencia s) throws DuplicadoException{
        boolean resp = false;
        for (Sugerencia sugerencia : sugerencias) {
            if (sugerencia != null) {
                if (sugerencia.equals(s)) {
                    throw new DuplicadoException("La sugerencia ya existe"+ sugerencia);
                }
            }
        }
        return resp;
    }

    /**
     * Método para editar una sugerencia existente.
     *
     * @param posicion
     * @param sugerencia
     *
     */
    public void editarSugerencia(int posicion, String sugerencia) {
        sugerencias[posicion] = new Sugerencia();
    }

    /**
     * Método para buscar una sugerencia específica.
     *
     * @param posicion
     * @return el objeto Usuario correspondiente a la sugerencia buscada, o null si
     * no se encuentra la sugerencia.
     */
    public boolean buscarSugerencia(Sugerencia su) throws NoEncontradaException{
        boolean resultado = false;
        for(Sugerencia s : sugerencias){
            if (s != null && s.equals(su)) {
                throw new NoEncontradaException(2, "La sugerencia no se encontro");
            }
        }
        return resultado;
    }

    /**
     * Método para listar todos las sugerencias creadas.
     *
     * @return
     */
    public String listarSugerencia() throws NoEncontradaException{
        String lista = "";
        for (Sugerencia sugerencia : sugerencias) {
            if (sugerencia != null) {
                lista += sugerencia + "\r\n";
                throw new NoEncontradaException(2, "La sugerencia no se encontro");
            }
        }
        return lista;

    }

    /**
     * Método para eliminar una sugerencia existente.
     *
     * @param posicion
     * @param sugerencia
     */
    public void eliminarSugerencia(int posicion, String sugerencia) throws NoEncontradaException{
        numSugerencias--;
        int a = 0;
        Sugerencia[] eliAux = sugerencias;
        sugerencias = new Sugerencia[numSugerencias];
        if (posicion < eliAux.length - 1) {
            if (posicion == eliAux.length - 1) {
                System.arraycopy(eliAux, 0, sugerencias, 0, numSugerencias);
                throw new NoEncontradaException(1, "La sugerencia no se encuentro");
            } else {
                for (int i = 0; i < eliAux.length; i++) {
                    if (i != posicion) {
                        sugerencias[a] = eliAux[i];
                        a++;
                    }
                }
            }
        } else {
            System.out.println("No existe la sugerencia en la posicion: " + posicion);
        }
    }
    
    public String impirmirSugerencias() {
        String texto = "";
        for (Sugerencia su : sugerencias) {
            if (su != null) {
                texto += su.toString() + "\r\n";
            }
        }
        return texto;
    }
    
//    public String nuevo(Object obj){
//        //hacer un casting de sugerencia
//        String resp = "Error";
//        if(obj instanceof Sugerencia sugerenca){
//            nuevaSugerencia((Sugerencia)sugerenca);
//            SerializacionSugerencia.serializarSugerencia(sugerencias);
//            resp = "Sugerencia registrada";
//        }
//        return resp;
//    }
    
}
