/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.bos.implementaciones;

import itson.sistemabibliotecamusicaldominio.CancionDominio;
import itson.sistemabibliotecamusicalnegocio.bos.ICancionNegocio;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import itson.sistemabibliotecamusicalpersistencia.daos.ICancionDAO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author adell
 */
public class CancionNegocio implements ICancionNegocio {
    
    private ICancionDAO cancionDAO;

    public CancionNegocio(ICancionDAO cancionDAO) {
        this.cancionDAO = cancionDAO;
    }

    /**
     * lista todos las canciones de la base de datos, excluyendo a los que sean 
     * de un genero no deseado
     * @param generosNoDeseados
     * @return 
     * @throws itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException 
     */
    @Override
    public List<CancionDominio> listarTodasLasCanciones(List<String> generosNoDeseados) throws NegocioException {
        try {
            return cancionDAO.listarTodasLasCanciones(generosNoDeseados);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Ha ocurrido un error al listar todas las canciones");
        }
    }

    /**
     * lista todos lss canciones de la base de datos que hayan cumplido con el
     * filtro, excluyendo a los que sean de un genero no deseado
     * @param filtro
     * @param generosNoDeseados
     * @return 
     * @throws itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException 
     */
    @Override
    public List<CancionDominio> listarCancionesPorFiltro(String filtro, List<String> generosNoDeseados) throws NegocioException {
        try {
            return cancionDAO.listarCancionesPorFiltro(filtro, generosNoDeseados);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Ha ocurrido un error al listar todas las canciones por filtro");
        }
    }

    /**
     * busca una cancion en la base de datos en base a su identificador
     * @param id
     * @return 
     * @throws itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException 
     */
    @Override
    public CancionDominio buscarPorId(ObjectId id) throws NegocioException {
        try {
            return cancionDAO.buscarPorId(id);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Ha ocurrido un error al buscar por id");
        }
    }
}
