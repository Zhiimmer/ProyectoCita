package dominio;

/**
 *
 * @author Gaby Fernandez
 */
public class Carrera {

    //Atributos
    private static String nombreCarrera;
    private static String semestre;
    private final String SISTEMASINFORMACION = "1. SISTEMAS INFORMACION";
    private final String CIVIL = "2. CIVIL";
    private final String DISEÑOINDUSTRIAL = "3. DISEÑO INDUSTRIAL";
    private final String QUIMICA = "4. QUIMICA";
    private final String MINAS = "5. MINAS";
    private final String PETROLEOS = "6. PETROLEOS";
    private final String AMBIENTAL = "7. AMBIENTAL";
    private final String COMPUTACION = "8. COMPUTACION";
    private final String GEOLOGIA = "9. GEOLOGIA";

    /**
     * Método constructor sin argumentos con la "sobre carga de métodos"
     */
    public Carrera() {
        this("Sistemas", "segundo");
    }

    /**
     * Bloque estatico
     */
    static {
        nombreCarrera = "";
        semestre = "";
    }

    /**
     * Método constructor con argumentos
     *
     * @param nombreCarrera
     * @param semestre
     */
    public Carrera(String nombreCarrera, String semestre) {
        this.nombreCarrera = nombreCarrera;
        this.semestre = semestre;
    }

    /**
     * Metodo de enumerar
     */
    public enum Carreras {
        SISTEMASINFORMACION,
        CIVIL,
        DISEÑOINDUSTRIAL,
        QUIMICA,
        MINAS,
        PETROLEOS,
        AMBIENTAL,
        COMPUTACION,
        GEOLOGIA
    }

    /**
     * Método para mostrar la enumeración de las carreras
     */
    public void mostarnNumCarrera() {
        System.out.println(SISTEMASINFORMACION);
        System.out.println(CIVIL);
        System.out.println(DISEÑOINDUSTRIAL);
        System.out.println(QUIMICA);
        System.out.println(MINAS);
        System.out.println(PETROLEOS);
        System.out.println(AMBIENTAL);
        System.out.println(COMPUTACION);
        System.out.println(GEOLOGIA);
    }

    /**
     ** Método constructor referenciado a un objeto con la "sobre carga de métodos"
     *
     * @param carre1
     */
    public Carrera(Carrera carre1) {
        this(carre1.getNombreCarrera(), carre1.getSemestre());
    }

    /**
     * Método set y get
     *
     * @return
     */
    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    //Metodo toString
    /**
     * Este es un metódo que nos permite mostrar la información completa del objeto como una cadena de caracteres
     *
     * @return la información del objeto como una cadena de caracteres
     */
    @Override
    public String toString() {
        return "\n\nCarrera \nNombre de la Carrera: " + nombreCarrera + ", \nSemestre: " + semestre + '}';
    }

}
