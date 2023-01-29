
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
        nombre = user1.getNombre();
    }
    
    /**
     * Métodos Set
     */
    
    /**
    * Lee el nombre del usuario
    * @return nombre del usuario
    */
    public String getNombre() {
//        nombre = "Juanito";
        return nombre;
    }
    
    /**
    * Modifica el nombre del usuario
    * @param nombre nombre del usuario
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
    * Lee el apellido del usuario
    * @return apellido del usuario
    */
    public String getApellido() {
//        apellido = "Perez";
        return apellido;
    }

    /**
    * Modifica el apellido del usuario
    * @param apellido apellido del usuario
    */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
    * Lee el correo institucional del usuario
    * @return correoinstitucional correo del usuario
    */
    public String getCorreoinstitucional() {
//        correoinstitucional = "juanitoperez@uce.edu.ec";
        return correoinstitucional;
    }

    /**
    * Modifica el correo instirucional de usuario
    * @param correoinstitucional correo del usuario
    */
    public void setCorreoinstitucional(String correoinstitucional) {
        this.correoinstitucional = correoinstitucional;
    }
    
    /**
    * Lee el género musical del usuario
    * @return generoMusical género musical del usuario
    */
    public String getGeneroMusical() {
//        generoMusical = "Rock";
        return generoMusical;
    }

    /**
    * Modifica el género musical del usuario
    * @param generoMusical género musical del usuario
    */
    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }
    
    /**
    * Lee el color favorito del usuario
    * @return colorFav color favorito del usuario
    */
    public String getColorFav() {
//        colorFav = "Verde";
        return colorFav;
    }
    
    /**
    * Modifica el color favorito del usuario
    * @param colorFav color favorito del usuario
    */
    public void setColorFav(String colorFav) {
        this.colorFav = colorFav;
    }

    /**
    * Lee la comida favorita del usuario
    * @return comidaFav comida favorita del usuario
    */
    public String getComidaFav() {
//        comidaFav = "Papas";
        return comidaFav;
    }

    /**
    * Modifica el color favorito del usuario
    * @param comidaFav comida favorita del usuario
    */
    public void setComidaFav(String comidaFav) {
        this.comidaFav = comidaFav;
    }

    /**
    * Lee el hobby del usuario
    * @return hobby del usuario
    */
    public String getHobby() {
//        hobby = "Correr";
        return hobby;
    }

    /**
    * Modifica el hobby del usuario
    * @param hobby hobby del usuario
    */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    /**
    * Lee el signo zodiacal del usuario
    * @return signoZodiacal signoZodiacal del usuario
    */
    public String getSignoZodiacal() {
//        signoZodiacal = "Cancer";
        return signoZodiacal;
    }

    /**
    * Modifica el signo zodiacal de usuario
    * @param signoZodiacal signo zodiacal del usuario
    */
    public void setSignoZodiacal(String signoZodiacal) {
        this.signoZodiacal = signoZodiacal;
    }

    /**
    * Lee la película favorita del usuario
    * @return peliculaFav pelicula favorita del usuario
    */
    public String getPeliculaFav() {
//        peliculaFav = "Spider-Man";
        return peliculaFav;
    }

    /**
    * Modifica la película favotia del usuario
    * @param peliculaFav pelicula favorita del usuario
    */
    public void setPeliculaFav(String peliculaFav) {
        this.peliculaFav = peliculaFav;
    }

    /**
    * Lee el libro favorito del usuario
    * @return libroFav libro favorito del usuario
    */
    public String getLibroFav() {
//        libroFav = "Condorito";
        return libroFav;
    }

    /**
    * Modifica el libro favorito de usuario
    * @param libroFav libro favorito del usuario
    */
    public void setLibroFav(String libroFav) {
        this.libroFav = libroFav;
    }

    /**
    * Valida si es fumador social el usuario
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
    * Modifica el fumador social de usuario
    * @param fumadorSocial fumador social del usuario
    */
    public void setFumadorSocial(boolean fumadorSocial) {
        this.fumadorSocial = fumadorSocial;
    }

    /**
    * Lee el animal favorito de usuario
    * @return animalFav del usuario
    */
    public String getAnimalFav() {
//        animalFav = "Puma";
        return animalFav;
    }

    /**
    * Modifica el animal favorito de usuario
    * @param animalFav animal favorito del usuario
    */
    public void setAnimalFav(String animalFav) {
        this.animalFav = animalFav;
    }

    /**
    * Lee la edad del usuario
    * @return edad del usuario
    */
    public int getEdad() {
//        edad = 19;
        return edad;
    }

    /**
    * Modifica la edad del usuario
    * @param edad del usuario
    */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /**
     * 
     * @return 
     */
    public Sugerencia[] getSugerencias() {
        return sugerencias;
    }
    
    /**
     * Metodo Setter que sirve para modificar el valor
     *
     * @param clientes
     */
    public void setSugerencia(Sugerencia[] sugerencias) {
        Usuario.sugerencias = sugerencias;
    }
    
    /**
    * Lee el número de sugerenicas del usuario
    * @return numSugerencias nuúmero de sugerencias del usuario
    */
    public int getnumSugerencias() {
        return numSugerencias;
    }

    /**
    * Modifica el número de sugerencias del usuario
    * @param numSugerencias número de sugerencias del usuario
    */
    public void setnumSugerencias(int numSugerencias) {
        Usuario.numSugerencias = numSugerencias;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
