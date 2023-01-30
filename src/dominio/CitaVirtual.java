package dominio;

import java.util.Date;

/**
 *
 * @author Ronny Alexis Paspuel Anchundia
 */
public class CitaVirtual extends Cita {

    //Atributo de la clase Cita Virtual
    private double duracionLamada;
    private String plataforma;

    /**
     * Creacion del constructor sin argumentos
     */
    public CitaVirtual() {
        super();
        this.duracionLamada = 0.0;
        this.plataforma = "No hay plataforma";
//        this(0.0, "No hay plataforma");

    }

    public CitaVirtual(String horaAcordada, Date fecha, String motivo, double duracionLamada, String plataforma) {
        super(horaAcordada, fecha, motivo);
        this.duracionLamada = duracionLamada;
        this.plataforma = plataforma;
    }

    //Contructor referenciable
    public CitaVirtual(CitaVirtual citaV1) {
        super(citaV1.horaAcordada, citaV1.fecha, citaV1.motivo);
        this.duracionLamada = citaV1.getDuracionLamada();
        this.plataforma = citaV1.getPlataforma();
        //  this(citaV1.getDuracionLamada(), citaV1.getPlataforma());

    }

    public double getDuracionLamada() {
        return duracionLamada;
    }

    public void setDuracionLamada(double duracionLamada) {
        this.duracionLamada = duracionLamada;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return super.toString() + this.horaAcordada + this.plataforma;
    }
}
