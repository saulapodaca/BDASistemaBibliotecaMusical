/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.bos;

import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;

/**
 *
 * @author Camila Zubía
 */
public interface IInsertMasivoNegocio {

    /**
     * Metodo para insertar masivamente los datos en la bd
     *
     * @throws itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException
     */
    void insertarDatosMasivos() throws NegocioException;

    /**
     * metodo para validar la existencia de datos en la bd
     *
     * @return
     * @throws itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException
     */
    boolean existenDatosIniciales() throws NegocioException;
    
}
