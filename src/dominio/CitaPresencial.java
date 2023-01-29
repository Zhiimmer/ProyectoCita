
package dominio;

import java.util.Date;

/**
 *
 * @author Edu. N
 */
public class CitaPresencial extends Cita{

    /**
     * Creacion de los atributos de la clase Cita Presencial
     */
    private String horaInicio;
    private String horaFinal;
    //private String motivo;
    private Static lugar;

    /**
     * Crea una instancia de la clase Cita Presencial
     *
     * @param horaInicio nos indica hora de inicio de la cita
     * @param horaFinal nos indica a que hora finaliza la cita
     * @param motivo motivo por lo que se realiza la cita

     */
    public CitaPresencial(Usuario[] usuarios, String horaAcordada, Date fecha, int numUsuario,String horaInicio, String horaFinal, String motivo, String Lugar) {
        super(usuarios, horaAcordada, fecha, numUsuario);
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.motivo = motivo;
        this.lugar = lugar;
    }

    /**
     * Creacion del constructor sin argumentos
     */
    public CitaPresencial() {
        super();
        horaInicio = "No hay hora de inicio";
        horaFinal = "No hay hora de final";
        motivo = "No hay ningun asunto";
        lugar = "No hay lugares";
    }

    //Contructor referenciable
    public CitaPresencial(CitaPresencial presencial1) {
        horaInicio = presencial1.getHoraInicio();
        horaFinal = presencial1.getHoraFinal();
        motivo = presencial1.getMotivo();
        lugar = presencial1.getLugar();

    }

    /**
     * Metodos Getter que nos permite mostrar el valor del atributo de la clase
     * Cita Presencial
     *
     * @return nos regresa los atributos de la clase Cita Presencial
     */
    public String getHoraInicio() {
        return horaInicio;
    }

    /**
     *
     * @return
     */
    public String getHoraFinal() {
        return horaFinal;
    }

    public String getMotivo() {
        return motivo;
    }
    
    public String getLugar(){
        return lugar;
    }

    /**
     * Metodo Setter que sirve para modificar el valor
     *
     * @param horaInicio
     */
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * Metodo Setter que sirve para modificar el valor
     *
     * @param horaFinal
     */
    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    /**
     * Metodo Setter que sirve para modificar el valor
     *
     * @param motivo
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    public void setLugar(String lugar){
        this.lugar = lugar;
    }

    
    /**
     * Método para convertir a String el objeto en Java
     *
     * @return Se poner en cadena de texto todos los atributos de la clase Cita
     * Presencial
     */
    @Override
    public String toString() {
        return "\nhoraInicio = " + horaInicio + " \nhoraFinal = " + horaFinal
                + " \nmotivo = " + motivo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CitaPresencial other = (CitaPresencial) obj;
        if (!Objects.equals(this.horaInicio, other.horaInicio)) {
            return false;
        }
        if (!Objects.equals(this.horaFinal, other.horaFinal)) {
            return false;
        }
        if (!Objects.equals(this.motivo, other.motivo)) {
            return false;
        }
        return Objects.equals(this.lugar, other.lugar);
    }
    
    

}

   