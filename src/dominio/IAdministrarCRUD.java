/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dominio;

/**
 *
 * @author Gaby Fernandez
 */
interface IAdministrarCRUD {

    /**
     *
     * @param obj
     * @param posicion
     * @return
     */
    public String editar(Object obj, int posicion);

    /**
     *
     * @param obj
     * @param posicion
     * @return
     * @throws Exception
     */
    public String borrar(Object obj, int posicion) throws Exception;

    /**
     *
     * @param obj
     * @return
     */
    public String listar(Object obj);
}
