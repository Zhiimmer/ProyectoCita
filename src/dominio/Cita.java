/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.Date;

/**
 *
 * @author joha
 */
public class Cita {

    /**
     * Atributos de la clase
     */
    protected String horaAcordada;
    protected Date fecha;
    protected String motivo;

    /**
     * Metodo sin argumentos
     */
    public Cita() {

        this.horaAcordada = "No hay hora Acordada";
        this.fecha = new Date(2000, 12, 13);
        this.motivo = "razon para la cita";

    }

    /**
     * Metodo con Argumentos
     *
     * @param horaAcordada
     * @param fecha
     * @param motivo
     */
    public Cita(String horaAcordada, Date fecha, String motivo) {
        this.horaAcordada = horaAcordada;
        this.fecha = fecha;
        this.motivo = motivo;
    }

    /**
     * constructor con argumentos referenciado a objetos
     *
     * @param cit
     */
    public Cita(Cita cit) {
        horaAcordada = cit.horaAcordada;
        fecha = cit.fecha;
        motivo = cit.motivo;
    }

    /**
     * Metodos get y set
     *
     * @return
     */
    public String getHoraAcordada() {
        return horaAcordada;
    }

    public void setHoraAcordada(String horaAcordada) {
        this.horaAcordada = horaAcordada;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public String toString() {
        return "Cita{" + "horaAcordada=" + horaAcordada + ", fecha=" + fecha + ", motivo=" + motivo + '}';
    }

}
