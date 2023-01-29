/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.Date;
import java.util.Objects;

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
     * constructor con argumentos referenciado a objetos con la "sobre carga de métodos"
     *
     * @param cita1
     */
    public Cita(Cita cita1) {
       this(cita1.getHoraAcordada(), cita1.getFecha(), cita1.getMotivo());
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

   

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if ((o != null) && (o instanceof Cita)) {
            Cita c = (Cita) o;
            if ((fecha == c.fecha)) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.fecha);
        return hash;
}        
}
