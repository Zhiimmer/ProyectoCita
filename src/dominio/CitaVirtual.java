
package dominio;

import java.util.Date;

/**
 *
 * @author Ronny Alexis Paspuel Anchundia
 */
public class CitaVirtual extends Cita{

    private double duracionLamada;
    private String plataforma;

    //Atributo de la clase Cita
    public CitaVirtual(Usuario[] usuarios, String horaAcordada, Date fecha, int numUsuario,double duracionLamada, String plataforma) {
        super(usuarios, horaAcordada, fecha, numUsuario);
        this.duracionLamada = duracionLamada;
        this.plataforma = plataforma;
    }

    /**
     * Creacion del constructor sin argumentos
     */
    public CitaVirtual() {
        super();
        duracionLamada = 0.0;
        plataforma = "No hay plataforma";

    }
//Contructor referenciable

    public CitaVirtual(CitaVirtual citaV1) {
        super();
       duracionLamada = citaV1.getDuracionLamada();
       plataforma=citaV1.getPlataforma();
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
        return super.toString()+this.horaAcordada+this.plataforma;
    }
}
