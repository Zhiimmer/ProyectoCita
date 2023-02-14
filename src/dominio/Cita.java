/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author joha
 */
public abstract class Cita {

    /**
     * Atributos de la clase
     */
    protected String horaAcordada;
    protected Date fecha;
    protected String motivo;
    public abstract void setMotivo( );

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
     *
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
      SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
      try {
         Date fechaHora = formatoHora.parse(horaAcordada);
         System.out.println("Hora en formato: " + fechaHora);
      } catch (ParseException e) {
         System.out.println("Excepción al cambiar la hora acordada : " + e.getMessage());
      }
   }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
     try {
        this.fecha = fecha;
    } catch (Exception e) {
        System.out.println("Error al establecer fecha: " + e.getMessage());
    } finally {
        System.out.println("Bloque finally ejecutado");
    }
}
    

//    @Override
//    public String toString() {
//        return "Cita{" + "horaAcordada= " + horaAcordada + ", fecha= " + fecha + '}';
//    }

    @Override
    public String toString() {
        return "Cita{" + "horaAcordada=" + horaAcordada + ", fecha=" + fecha + ", motivo=" + motivo + '}';
        
   
    }
    
    

//    public String IniciarSesion(String user, String pass) {
//        Scanner src = new Scanner(System.in);
//        String user;
//        String pass;
//        System.out.println("Ingrese el Nombre del Usuario");
//        user = src.next();
//        System.out.println("Ingrese su clave personal");
//        pass = src.next();
//        System.out.println("Bienvenido al Menú Cupido Cabezón" + user);
//
//    }

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
