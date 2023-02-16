package dominio;

/**
 *
 * @author Gaby Fernandez
 */
public enum Carrera {

    //Atributos
   SISTEMASINFORMACION ( "1. SISTEMAS INFORMACION",10),
    CIVIL ("2. CIVIL",10);
//    private final String DISEÑOINDUSTRIAL = "3. DISEÑO INDUSTRIAL";
//    private final String QUIMICA = "4. QUIMICA";
//    private final String MINAS = "5. MINAS";
//    private final String PETROLEOS = "6. PETROLEOS";
//    private final String AMBIENTAL = "7. AMBIENTAL";
//    private final String COMPUTACION = "8. COMPUTACION";
//    private final String GEOLOGIA = "9. GEOLOGIA";

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
