package datos;

import dominio.Compatibilidad;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Edu. N
 */
public class SerializarCompatibilidad {

    public SerializarCompatibilidad() {
        Compatibilidad c = new Compatibilidad(true, 100.0);

        try {
            FileOutputStream f = new FileOutputStream("compatibilidad.txt");
            
            ObjectOutputStream o = new ObjectOutputStream(f);
            
            o.writeObject(c);
            o.close();
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new SerializarCompatibilidad();
    }
}
