/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.bos.implementaciones;

import itson.sistemabibliotecamusicaldominio.AlbumDominio;
import itson.sistemabibliotecamusicalnegocio.bos.IAlbumNegocio;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import itson.sistemabibliotecamusicalpersistencia.daos.IAlbumDAO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author adell
 */
public class AlbumNegocio implements IAlbumNegocio {

    private IAlbumDAO albumDAO;

    public AlbumNegocio(IAlbumDAO albumDAO) {
        this.albumDAO = albumDAO;
    }

    /**
     * lista todos los albumes de la base de datos, excluyendo a los que sean de
     * un genero no deseado
     * @param generosNoDeseados
     * @return 
     * @throws itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException 
     */
    @Override
    public List<AlbumDominio> listarTodosLosAlbumes(List<String> generosNoDeseados) throws NegocioException {
        try {
            return albumDAO.listarTodosLosAlbumes(generosNoDeseados);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Ha ocurrido un error al listar todos los albumes");
        }
    }

    /**
     * lista todos los albumes de la base de datos que hayan cumplido con el filtro
     * , excluyendo a los que sean de un genero no deseado
     * @param filtro
     * @param generosNoDeseados
     * @return
     * @throws itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException 
     */
    @Override
    public List<AlbumDominio> listarAlbumesPorFiltro(String filtro, List<String> generosNoDeseados) throws NegocioException {
        try {
            return albumDAO.listarAlbumesPorFiltro(filtro,generosNoDeseados);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Ha ocurrido un error al listar todos los albumes por filtro");
        }
    }

    /**
     * busca un album en la base de datos en base a su identificador
     * @param id
     * @return 
     * @throws itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException 
     */
    @Override
    public AlbumDominio buscarPorId(ObjectId id) throws NegocioException {
        try {
            return albumDAO.buscarPorId(id);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Ha ocurrido un error al buscar por id");
        }
    }
}
