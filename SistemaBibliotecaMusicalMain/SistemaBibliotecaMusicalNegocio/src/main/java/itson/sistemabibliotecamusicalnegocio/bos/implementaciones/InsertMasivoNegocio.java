/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.bos.implementaciones;

import itson.sistemabibliotecamusicalnegocio.bos.IInsertMasivoNegocio;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import itson.sistemabibliotecamusicalpersistencia.daos.IInsertMasivoDAO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;

/**
 *
 * @author Camila Zubía
 */
public class InsertMasivoNegocio implements IInsertMasivoNegocio {

    private IInsertMasivoDAO insertDAO;

    public InsertMasivoNegocio(IInsertMasivoDAO insertDAO) {
        this.insertDAO = insertDAO;
    }

    @Override
    public void insertarDatosMasivos() throws NegocioException {
        try {
            insertDAO.insertarDatosMasivos();
        } catch (PersistenciaException ex) {
            throw new NegocioException("Ha ocurrido un error al insertar datos masivos: " + ex.getMessage(), ex);
        }
    }

    @Override
    public boolean existenDatosIniciales() throws NegocioException {
        try {
            return insertDAO.existenDatosIniciales();
        } catch (PersistenciaException ex) {
            throw new NegocioException("Ha ocurrido un error al verificar datos iniciales: " + ex.getMessage(), ex);
        }
    }
}
