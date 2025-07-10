/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.fachada.implementaciones;

import itson.sistemabibliotecamusicalnegocio.bos.IInsertMasivoNegocio;
import itson.sistemabibliotecamusicalnegocio.bos.implementaciones.InsertMasivoNegocio;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import itson.sistemabibliotecamusicalnegocio.fachada.IInsertMasivoFachada;
import itson.sistemabibliotecamusicalpersistencia.daos.IConexionBD;
import itson.sistemabibliotecamusicalpersistencia.daos.IInsertMasivoDAO;
import itson.sistemabibliotecamusicalpersistencia.daos.implementaciones.ConexionBD;
import itson.sistemabibliotecamusicalpersistencia.daos.implementaciones.InsertMasivoDAO;

/**
 *
 * @author Camila Zubía
 */
public class InsertMasivoFachada implements IInsertMasivoFachada{
    
    private IInsertMasivoNegocio insertNegocio;

    public InsertMasivoFachada() {
        IConexionBD conexion = new ConexionBD();
        IInsertMasivoDAO insertDAO = new InsertMasivoDAO(conexion);
        this.insertNegocio = new InsertMasivoNegocio(insertDAO);
    }


    @Override
    public void insertarDatosMasivos() throws NegocioException {
        try {
            insertNegocio.insertarDatosMasivos();
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    @Override
    public boolean existenDatosIniciales() throws NegocioException {
        try {
            return insertNegocio.existenDatosIniciales();
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }
    
}
