package datos;

import dominio.Compatibilidad;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Edu. N
 */
public class DeserializarCompatibilidad {

    public DeserializarCompatibilidad() {

        Compatibilidad comp = null;

        try {
            FileInputStream f = new FileInputStream("compatibilidad.txt");

            ObjectInputStream o = new ObjectInputStream(f);

            comp = (Compatibilidad) o.readObject();

            o.close();
            System.out.println("Objeto deserializado: " + comp);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new DeserializarCompatibilidad();
    }
}
