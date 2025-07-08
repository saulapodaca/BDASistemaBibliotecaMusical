/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.implementaciones;

import itson.sistemabibliotecamusicaldominio.CancionDominio;
import itson.sistemabibliotecamusicalnegocio.ICancionNegocio;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import itson.sistemabibliotecamusicalpersistencia.daos.ICancionDAO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adell
 */
public class CancionNegocio implements ICancionNegocio {
    
    private ICancionDAO cancionDAO;

    public CancionNegocio(ICancionDAO cancionDAO) {
        this.cancionDAO = cancionDAO;
    }
    
    @Override
    public List<CancionDominio> listarPorFiltro(String filtro) throws NegocioException {
        try {
            return cancionDAO.listarPorFiltro(filtro);
        } catch (PersistenciaException ex) {
            Logger.getLogger(CancionNegocio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
