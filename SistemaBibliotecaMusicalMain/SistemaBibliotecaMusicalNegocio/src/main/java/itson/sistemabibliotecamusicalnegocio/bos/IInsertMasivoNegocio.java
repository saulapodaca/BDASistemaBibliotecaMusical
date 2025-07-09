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

    void insertarDatosMasivos() throws NegocioException;

    boolean existenDatosIniciales() throws NegocioException;
    
}
