/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package itson.sistemabibliotecamusicalpersistencia.daos;

import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;

/**
 *
 * @author Camila Zubía
 */
public interface IInsertMasivoDAO {
    
    /**
     * Metodo para insertar masivamente los datos en la bd
     *
     * @throws PersistenciaException
     */
    void insertarDatosMasivos() throws PersistenciaException;

    /**
     * metodo para validar la existencia de datos en la bd
     *
     * @return
     * @throws PersistenciaException
     */
    boolean existenDatosIniciales() throws PersistenciaException;
    
}
