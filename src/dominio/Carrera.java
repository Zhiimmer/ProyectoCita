package dominio;

/**
 *
 * @author Gaby Fernandez
 */
public class Carrera {

    private String nombreCarrera;
    private String semestre;

    /**
     *Método constructor con argumentos
     * @param nombreCarrera
     * @param semestre
     */
    public Carrera(String nombreCarrera, String semestre) {
        this.nombreCarrera = nombreCarrera;
        this.semestre = semestre;
    }

    /**
     *Método constructor sin argumentos con la "sobre carga de métodos"
     */
    public Carrera() {
        this("Sistemas", "segundo");
    }

    /**
     * Método set y get
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
     * Este es un metódo que nos permite mostrar la información completa del
     * objeto como una cadena de caracteres
     *
     * @return la información del objeto como una cadena de caracteres
     */
    @Override
    public String toString() {
        return "Carrera{" + "nombreCarrera=" + nombreCarrera + ", semestre=" + semestre + '}';
    }

}
