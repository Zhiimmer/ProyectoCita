package dominio;

import java.util.Date;

/**
 *
 * @author Ronny Alexis Paspuel Anchundia
 */
public class CitaVirtual extends Cita {

    /**
     * Clase que representa una cita virtual con atributos adicionales a una cita general.
     */
    private double duracionLlamada;
    private String plataforma;

    /**
     * Constructor sin parametros que inicializa la duracion de la llamada en 0.0 y la plataforma en "No hay plataforma".
     */
    public CitaVirtual() {
        super();
        this.duracionLlamada = 0.0;
        this.plataforma = "No hay plataforma";
//        this(0.0, "No hay plataforma");

    }
/**
     * implementacion de la clase abstrascta de motivo
     */
    @Override
    public void motivo(){
        System.out.println("El motivo de la cita poder pasar tiempo junto a la persona a traves del internet");
    }
    
    /**
     * Constructor con parametros que inicializa los atributos de una cita virtual
     *
     * @param horaAcordada hora acordada para la cita
     * @param fecha fecha acordada para la cita
     * @param motivo motivo de la cita
     * @param duracionLlamada duracion de la llamada
     * @param plataforma plataforma utilizada para la llamada
     */
    public CitaVirtual(String horaAcordada, Date fecha, String motivo, double duracionLlamada, String plataforma) {
        super(horaAcordada, fecha);
        this.duracionLlamada = duracionLlamada;
        this.plataforma = plataforma;
    }

    /**
     * Constructor con llamada a objetos
     *
     * @param citaV1 
     */
    public CitaVirtual(CitaVirtual citaV1) {
        super(citaV1.horaAcordada, citaV1.fecha);
        this.duracionLlamada = citaV1.getDuracionLlamada();
        this.plataforma = citaV1.getPlataforma();
        //  this(citaV1.getDuracionLamada(), citaV1.getPlataforma());

    }

    /**
     * Obtiene la duracion de la llamada
     *
     * @return duracion de la llamada
     */
    public double getDuracionLlamada() {
        return duracionLlamada;
    }

    /**
     * Asigna una nueva duracion de la llamada
     *
     * @param duracionLamada duracion de la llamada
     */
    public void setDuracionLlamada(double duracionLamada) {
        this.duracionLlamada = duracionLlamada;
    }

    /**
     * Obtiene la plataforma utilizada para la llamada
     *
     * @return plataforma utilizada para la llamada
     */
    public String getPlataforma() {
        return plataforma;
    }

    /**
     * Asigna una nueva plataforma para la llamada
     *
     * @param plataforma nueva plataforma para la llamada
     */
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return super.toString() + this.horaAcordada + this.plataforma;
    }
}
