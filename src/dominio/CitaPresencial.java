package dominio;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Edu. N
 */
public class CitaPresencial extends Cita {

    /**
     * Clase que representa una cita presencial
     */
    private String horaInicio;
    private String horaFinal;
    private static Cita lugares[];
    private static int numLugares;

    /**
     * Bloque estático que inicializa los atributos de la clase
     */
    static {
        numLugares = 0;
        lugares = new Cita[3];
    }

    /**
     * Constructor por defecto que inicializa los atributos a valores por defecto
     */
    public CitaPresencial() {
        super();
        this.horaInicio = "No hay hora de inicio";
        this.horaFinal = "No hay hora de final";
    }

    /**
     * Constructor que recibe valores para inicializar los atributos
     *
     * @param horaAcordada hora acordada para la cita
     * @param fecha fecha acordada para la cita
     * @param motivo motivo de la cita
     * @param horaInicio hora de inicio de la cita
     * @param horaFinal hora de finalización de la cita
     */
    public CitaPresencial(String horaAcordada, Date fecha, String motivo, String horaInicio, String horaFinal) {
        super(horaAcordada, fecha, motivo);
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }

    /**
     * Constructor de copia
     *
     * @param presencial1 objeto CitaPresencial a copiar
     */
    public CitaPresencial(CitaPresencial presencial1) {
        super(presencial1.horaAcordada, presencial1.fecha, presencial1.motivo);
        this.horaInicio = presencial1.horaInicio;
        this.horaFinal = presencial1.horaFinal;
    }

    /**
     * Método que obtiene la hora de inicio de la cita
     *
     * @return hora de inicio de la cita
     */
    public String getHoraInicio() {
        return horaInicio;
    }

    /**
     * Método que establece la hora de inicio de la cita
     *
     * @param horaInicio hora de inicio de la cita
     */
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * Método que obtiene la hora final de la cita
     *
     * @return hora final de la cita
     */
    public String getHoraFinal() {
        return horaFinal;
    }

    /**
     * Método que establece la hora final de la cita
     *
     * @param horaFinal hora final de la cita
     */
    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    /**
     * Método para obtener el arreglo de lugares.
     *
     * @return Arreglo de citas.
     */
    public static Cita[] getLugares() {
        return lugares;
    }

    /**
     * Método para establecer el arreglo de lugares.
     *
     * @param lugares Arreglo de citas a establecer.
     */
    public static void setLugares(Cita[] lugares) {
        CitaPresencial.lugares = lugares;
    }

    /**
     * Método para obtener el número de lugares.
     *
     * @return Número de lugares.
     */
    public static int getNumLugares() {
        return numLugares;
    }

    /**
     * Método para establecer el número de lugares.
     *
     * @param numLugares Número de lugares a establecer.
     */
    public static void setNumLugares(int numLugares) {
        CitaPresencial.numLugares = numLugares;
    }

    /**
     * Método toString para imprimir los valores de horaInicio y horaFinal.
     *
     * @return Cadena con los valores de horaInicio y horaFinal.
     */
    @Override
    public String toString() {
        return "\nhoraInicio = " + horaInicio + " \nhoraFinal = " + horaFinal;
    }

}
