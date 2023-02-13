package datos;

import dominio.CitaPresencial;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/**
 *
 * @author fernando
 */
public class SerializarCitaPresencial {
    
    public SerializarCitaPresencial() {
        CitaPresencial cp = new CitaPresencial();

        try {
            FileOutputStream f = new FileOutputStream("FechaCitaPresencial.txt");
            
            ObjectOutputStream o = new ObjectOutputStream(f);
            
            o.writeObject(cp);
            o.close();
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new SerializarCitaPresencial();
    }
}

