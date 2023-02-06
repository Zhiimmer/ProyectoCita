/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author ronny
 */
public class SugerenciaNoEncontradaException extends Exception{
    
   private int codigoError;
   private String mensaje;
   
   public SugerenciaNoEncontradaException(int codigoError, String mensaje) {
      super(mensaje);
      this.codigoError = codigoError;
      this.mensaje = mensaje;
   }

    public int getCodigoError() {
        return codigoError;
    }

    public String getMensaje() {
        return mensaje;
    }


}
