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
        this("No hay hora Acordada", new Date(2000, 12, 13));
      

    }

    /**
     * Metodo con Argumentos
     *
     * @param horaAcordada
     * @param fecha
     
     */
    public Cita(String horaAcordada, Date fecha) {
        this.horaAcordada = horaAcordada;
        this.fecha = fecha;
       
    }

    /**
     * constructor con argumentos referenciado a objetos con la "sobre carga de métodos"
     *
     * @param cita1
     */
    public Cita(Cita cita1) {
       this(cita1.getHoraAcordada(), cita1.getFecha());
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

    @Override
    public String toString() {
        return "Cita{" + "horaAcordada= " + horaAcordada + ", fecha= " + fecha + '}';
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
