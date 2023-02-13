
package datos;

import dominio.Compatibilidad;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Edu. N
 */
public class SerializarYDeserializarCompatibilidad {
   public SerializarYDeserializarCompatibilidad() {
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
        new SerializarYDeserializarCompatibilidad();
   }
}
