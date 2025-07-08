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

    @Override
    public List<AlbumDominio> listarTodosLosAlbumes(List<String> generosNoDeseados) throws NegocioException {
        try {
            return albumDAO.listarTodosLosAlbumes(generosNoDeseados);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Ha ocurrido un error al listar todos los albumes");
        }
    }

    @Override
    public List<AlbumDominio> listarAlbumesPorFiltro(String filtro, List<String> generosNoDeseados) throws NegocioException {
        try {
            filtroValido(filtro);
            return albumDAO.listarAlbumesPorFiltro(filtro,generosNoDeseados);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Ha ocurrido un error al listar todos los albumes por filtro");
        }
    }

    private void filtroValido(String filtro) throws NegocioException {
        if (filtro == null || filtro.trim().isEmpty()) {
            throw new NegocioException("El filtro no puede estar vacio");
        }
    }

    @Override
    public AlbumDominio buscarPorId(ObjectId id) throws NegocioException {
        try {
            return albumDAO.buscarPorId(id);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Ha ocurrido un error al buscar por id");
        }
    }
}
