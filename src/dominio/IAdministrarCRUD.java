/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dominio;

/**
 *
 * @author
 */
interface IAdministrarCRUD {

    /**
     * Método que permite modificar el estado de un Objeto
     *
     * @param obj
     * @param posicion
     * @return Un mensaje para alertar al usuario
     */
    public String editar(Object obj, int posicion);

    /**
     * Metodo que permite eliminar un Objeto
     *
     * @param obj
     * @param posicion
     * @return Un mensaje para alertar al usuario
     * @throws Exception
     */
    public String borrar(Object obj, int posicion) throws Exception;

    /**
     * Metodo que permita listar un Conjunto de Objetos
     *
     * @param obj
     * @return La lista de Objetos almacenados
     */
    public String listar(Object obj);
    
}
