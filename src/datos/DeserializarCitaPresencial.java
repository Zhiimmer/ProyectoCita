package datos;
import dominio.CitaPresencial;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
/**
 *
 * @author fernando
 */
public class DeserializarCitaPresencial {
    public DeserializarCitaPresencial() {

        CitaPresencial cp = null;

        try {
            FileInputStream f = new FileInputStream("FechaCitaPresencial.txt");

            ObjectInputStream o = new ObjectInputStream(f);

            cp = (CitaPresencial) o.readObject();

            o.close();
            System.out.println("Fecha de la cita deserializado: " + cp);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new DeserializarCitaPresencial();
    }
}


