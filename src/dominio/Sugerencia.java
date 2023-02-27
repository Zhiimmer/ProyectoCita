package dominio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Edu. N
 */
public class Sugerencia implements Serializable {

    /**
     * Descripción de la sugerencia
     */
    private String descripcion;

    /**
     * Fecha en que fue realizada la sugerencia
     */
    private Date fechaSugerencia;

    /**
     * Constructor sin argumentos que inicializa la descripción de la sugerencia a "Sin descripción" y la fecha de la sugerencia a nulo
     */
    public Sugerencia() {
        this("Sin descripción", new Date());
    }

    /**
     * Constructor con dos argumentos que inicializa la descripción y la fecha de la sugerencia
     *
     * @param descripcion la descripción de la sugerencia
     * @param fechaSugerencia la fecha en que se hizo la sugerencia
     */
    public Sugerencia(String descripcion, Date fechaSugerencia) {
        this.descripcion = descripcion;
        this.fechaSugerencia = fechaSugerencia;
    }

    /**
     * Constructor que permite referenciar objetos de esta clase
     *
     * @param su el objeto Sugerencia a referenciar
     */
    public Sugerencia(Sugerencia su) {
        this(su.descripcion, su.fechaSugerencia);
    }

    //Gets y Sets
    
    /**
     * Obtiene la descripción de la sugerencia
     *
     * @return la descripción de la sugerencia
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción de la sugerencia
     *
     * @param descripcion la descripción de la sugerencia
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la fecha en que fue realizada la sugerencia
     *
     * @return la fecha en que fue realizada la sugerencia
     */
    public Date getFechaSugerencia() {
        return fechaSugerencia;
    }

    /**
     * Modifica la fecha de pago
     * @param fechaSugerencia 
     */
    public void setFechaSugerencia(Date fechaSugerencia) {
        this.fechaSugerencia = fechaSugerencia;
    }

    @Override
    public String toString() {
        return "\n\nSugerencia \nDescripcion: " + this.descripcion + ", \nFecha de la Sugerencia: " + this.fechaSugerencia;
    }

}
