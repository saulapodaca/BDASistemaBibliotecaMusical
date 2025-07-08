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
    public List<CancionDominio> listarTodasLasCanciones() throws NegocioException {
        try {
            return cancionDAO.listarTodasLasCanciones();
        } catch (PersistenciaException ex) {
            throw new NegocioException("Ha ocurrido un error al listar todas las canciones");
        }
    }

    @Override
    public List<CancionDominio> listarCancionesPorFiltro(String filtro) throws NegocioException {
        try {
            filtroValido(filtro);
            return cancionDAO.listarCancionesPorFiltro(filtro);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Ha ocurrido un error al listar todas las canciones por filtro");
        }
    }
    
    private void filtroValido(String filtro) throws NegocioException {
        if (filtro == null || filtro.trim().isEmpty()) {
            throw new NegocioException("El filtro no puede estar vacio");
        }
    }
}
