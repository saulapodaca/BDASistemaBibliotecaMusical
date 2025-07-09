/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.fachada.implementaciones;

import itson.sistemabibliotecamusicaldominio.AlbumDominio;
import itson.sistemabibliotecamusicalnegocio.bos.IAlbumNegocio;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import itson.sistemabibliotecamusicalnegocio.fachada.IAlbumFachada;
import itson.sistemabibliotecamusicalnegocio.bos.implementaciones.AlbumNegocio;
import itson.sistemabibliotecamusicalpersistencia.daos.IConexionBD;
import itson.sistemabibliotecamusicalpersistencia.daos.IAlbumDAO;
import itson.sistemabibliotecamusicalpersistencia.daos.implementaciones.AlbumDAO;
import itson.sistemabibliotecamusicalpersistencia.daos.implementaciones.ConexionBD;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author adell
 */
public class AlbumFachada implements IAlbumFachada{
    
    private IAlbumNegocio albumNegocio;

    public AlbumFachada() {
        IConexionBD conexion = new ConexionBD();
        IAlbumDAO albumDAO = new AlbumDAO(conexion);
        this.albumNegocio = new AlbumNegocio(albumDAO);
    }

    @Override
    public List<AlbumDominio> listarTodosLosAlbumes(List<String> generosNoDeseados) throws NegocioException {
        try {
            return albumNegocio.listarTodosLosAlbumes(generosNoDeseados);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    @Override
    public List<AlbumDominio> listarAlbumesPorFiltro(String filtro, List<String> generosNoDeseados) throws NegocioException {
        try {
            return albumNegocio.listarAlbumesPorFiltro(filtro, generosNoDeseados);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    @Override
    public AlbumDominio buscarPorId(ObjectId id) throws NegocioException {
        try {
            return albumNegocio.buscarPorId(id);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }
    
}
