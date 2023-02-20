package dominio;

/**
 *
 * @author Gaby Fernandez
 */
public enum Carrera {

    //Atributos
    SISTEMASINFORMACION("1. SISTEMAS INFORMACION", 10),
    CIVIL("2. CIVIL", 10),
    DISEÑOINDUSTRIAL("3. DISEÑO INDUSTRIAL", 10),
    QUIMICA("4. QUIMICA", 10),
    MINAS("5. MINAS", 10),
    PETROLEOS("6. PETROLEOS", 10),
    AMBIENTAL("7. AMBIENTAL", 10),
    COMPUTACION("8. COMPUTACION", 10),
    GEOLOGIA("9. GEOLOGIA", 10);

    private final String nombreCarrera;
    private final int semestre;

    /**
     * Método constructor con argumentos
     *
     * @param nombreCarrera
     * @param semestre
     */
    private Carrera(String nombreCarrera, int semestre) {
        this.nombreCarrera = nombreCarrera;
        this.semestre = semestre;
    }

    /**
     * Método set y get
     *
     * @return
     */
    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public int getSemestre() {
        return semestre;
    }

}
