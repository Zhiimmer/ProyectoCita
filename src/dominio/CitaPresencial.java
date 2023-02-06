package dominio;

import java.util.Date;
import java.util.Objects;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    public enum Lugar {
        CISCO,
        CAFE_CISCO,
        CANCHA_CIVL,
        LABORATORIOS,
        ASO

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
     * @param horaInicio hora de inicio de la cita
     * @param horaFinal hora de finalización de la cita
     */
    public CitaPresencial(String horaAcordada, Date fecha, String horaInicio, String horaFinal) {
        super(horaAcordada, fecha);
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }

    /**
     * implementacion de la clase abstrascta de motivo
     */
    public void setMotivo() {
        this.motivo = "El motivo de la cita presencial es la posibillidad de conocerse en persona con su sugerencia";
    }

    /**
     * Constructor de copia
     *
     * @param presencial1 objeto CitaPresencial a copiar
     */
    public CitaPresencial(CitaPresencial presencial1) {
        super(presencial1.horaAcordada, presencial1.fecha);
        this.horaInicio = presencial1.horaInicio;
        this.horaFinal = presencial1.horaFinal;
    }
    
     /**
      * Método que establece la hora de inicio de la cita
     *@param horaInicio hora de inicio de la cita
     *Uso de excepciones para control de errores
     *se va crear un Try-Catch para mostrar mensaje el String en un formato de hora
     */
public void setHoraInicio(String horaInicio) {
      SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
      try {
         Date fechaHora = formatoHora.parse(horaInicio);
         System.out.println("Hora en formato de fecha: " + fechaHora);
      } catch (ParseException e) {
         System.out.println("Excepción al cambiar formato hora de empezar la cita : " + e.getMessage());
      }
   }


/**
     * Método que establece la hora final de la cita
     * @param horaFinal hora final de la cita
     *Uso de excepciones para control de errores
     *se va crear un Try-Catch para mostrar mensaje el String en un formato de horaFinal
     */
public void setHoraFinal(String horaFinal) {
      SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
      try {
         Date fechaHora = formatoHora.parse(horaFinal);
         System.out.println("Hora en formato de fecha: " + fechaHora);
      } catch (ParseException e) {
         System.out.println("Excepción al cambiar formato hora para acabar a cita : " + e.getMessage());
      }
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
     * Método que obtiene la hora final de la cita
     *
     * @return hora final de la cita
     */
    public String getHoraFinal() {
        return horaFinal;
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
