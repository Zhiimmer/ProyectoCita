
package dominio;

/**
 *
 * @author Edu. N
 */
public class Usuario {

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
    private boolean fumadorSocial;
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
     * Arreglo de los usuarios creados
     */
    private static Usuario Usuarios[];
    /**
     * Número de los usuarios
     */
    private static int numUsuarios;
    
    /**
     * Bloque estático
     */
    static {
        sugerencias = new Sugerencia[3];
        numSugerencias = 0;
        Usuarios = new Usuario[2];
        numUsuarios = 0; 
    }
    
    /**
     * Método constructor sin argumentos
     */
    public Usuario(){        
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
                    boolean fumadorSocial){
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
        this.fumadorSocial= fumadorSocial;
    }
    
    public Usuario(Usuario user1){
        //nombre = user1.getNombre();
    }
    
    /**
     * Métodos Set
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
