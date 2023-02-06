/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author ronny
 */
public class DuplicadoException extends Exception{
    Object obj;
    public DuplicadoException(String msg, Object obj){
        super("msg");
    }

    /**
     * Metodo constructor con argumentos
     * @param Cuenta 
     */
    DuplicadoException(String Cuenta) {
    }
    
    //get

    public Object getObj() {
        return obj;
    }
}
