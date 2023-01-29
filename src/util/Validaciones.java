package util;

/**
 *
 * @author Edu. N
 */
public class Validaciones {

    /**
     *
     * Validación del Nombre
     */
    public static boolean validarNombre(String nombre) {
        return nombre.matches("[A-Z][a-zA-Z]*");
    }
    /**
     *
     * Validación del Apellido
     */
    public static boolean validarApellido(String apellido) {
        return apellido.matches("[A-Z][a-zA-Z]*");
    }
    /**
     *
     * Validación del Correo
     */
    public static boolean validarCorreo(String correo) {
        return correo.matches("^[^@]+@[^@]+\\.[a-zA-Z]{2,}$");
    }
    /**
     *
     * Validación del colorFav
     */
    public static boolean validarColorFav(String colorFav) {
        return colorFav.matches("[A-Z][a-zA-Z]*");
    }
    /**
     *
     * Validación del comidaFav
     */
    public static boolean validarComidaFav(String comidaFav) {
        return comidaFav.matches("[A-Z][a-zA-Z]*");
    }
    /**
     *
     * Validación del libroFav
     */
    public static boolean validarlibroFav(String libroFav) {
        return libroFav.matches("[A-Z][a-zA-Z]*");
    }
    /**
     *
     * Validación del animalFav
     */
    public static boolean validarAnimalFav(String animalFav) {
        return animalFav.matches("[A-Z][a-zA-Z]*");
    }
    /**
     *
     * Validación del peliculaFav
     */
    public static boolean validarPeliculaFav(String peliculaFav) {
        return peliculaFav.matches("[A-Z][a-zA-Z]*");
    }
    /**
     *
     * Validación del hobby
     */
    public static boolean validarHobby(String hobby) {
        return hobby.matches("[A-Z][a-zA-Z]*");
    }
    /**
     *
     * Validación del Nombre
     */
    public static boolean validarSignoZodiacal(String signoZodiacal) {
        return signoZodiacal.matches("[A-Z][a-zA-Z]*");
    }
   
}
