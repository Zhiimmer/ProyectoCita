package dominio;

/**
 *
 * @author Edu. N
 */
public class Compatibilidad {

    /**
     * Atributos de la clase Compatibilidad
     */
    private boolean click;
    private double porcentaje;

    /**
     * Creacion del método constructor sin argumentos
     */
    public Compatibilidad() {
//        this.click = false;
//        this.porcentaje = 00;
        this(false, 0.0);
    }

    /**
     * Creacion del metodo constructor con argumentos
     *
     * @param click
     * @param porcentaje
     */
    public Compatibilidad(boolean click, double porcentaje) {
        this.click = click;
        this.porcentaje = porcentaje;
    }

    /**
     * Metodo Constructor con llamada a Objetos
     *
     * @param comp1
     */
    public Compatibilidad(Compatibilidad comp1) {
//        click = comp1.isClick();
//        porcentaje = comp1.getPorcentaje();
        this(comp1.click, comp1.getPorcentaje());
    }

    public boolean isClick() {
        return click;
    }

    public void setClick(boolean click) {
        this.click = click;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    /**
     * Creacion del Método tostring
     *
     * @return
     */
    @Override
    public String toString() {
        return "\n Hacen Click = " + click + "\n Porcentaje de Compatibilidad = " + porcentaje + "%";
    }

}
