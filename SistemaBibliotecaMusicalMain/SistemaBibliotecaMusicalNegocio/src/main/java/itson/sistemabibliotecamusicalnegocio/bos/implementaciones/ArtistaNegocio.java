/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.bos.implementaciones;

import itson.sistemabibliotecamusicaldominio.ArtistaDominio;
import itson.sistemabibliotecamusicaldominio.dtos.ResultadosDTO;
import itson.sistemabibliotecamusicalnegocio.bos.IArtistaNegocio;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import itson.sistemabibliotecamusicalpersistencia.daos.IArtistaDAO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Camila Zubía
 */
public class ArtistaNegocio implements IArtistaNegocio{
    
    private IArtistaDAO artistaDAO;

    public ArtistaNegocio(IArtistaDAO artistaDAO) {
        this.artistaDAO = artistaDAO;
    }

    @Override
    public List<ResultadosDTO> listarTodo(List<String> generosNoDeseados) throws NegocioException {
        try {
            return artistaDAO.listarTodo(generosNoDeseados);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Ha ocurrido un error al listar todo");
        }
    }

    @Override
    public List<ArtistaDominio> listarTodosLosArtistas(List<String> generosNoDeseados) throws NegocioException {
        try {
            return artistaDAO.listarTodosLosArtistas(generosNoDeseados);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Ha ocurrido un error al listar todos los artistas");
        }
    }

    @Override
    public List<ResultadosDTO> listarTodoPorFiltro(String filtro, List<String> generosNoDeseados) throws NegocioException {
        try {
            return artistaDAO.listarTodoPorFiltro(filtro, generosNoDeseados);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Ha ocurrido un error al listar todo por filtro");
        }
    }

    @Override
    public List<ArtistaDominio> listarArtistasPorFiltro(String filtro, List<String> generosNoDeseados) throws NegocioException {
        try {
            return artistaDAO.listarArtistasPorFiltro(filtro, generosNoDeseados);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Ha ocurrido un error al listar todos los artistas por filtro");
        }
    }

    @Override
    public List<String> obtenerTodosLosGeneros() throws NegocioException {
        try{
            return artistaDAO.obtenerTodosLosGeneros();
        }catch(PersistenciaException ex){
            throw new NegocioException(ex.getMessage());
        }
    }

    @Override
    public ArtistaDominio buscarPorId(ObjectId id) throws NegocioException {
        try {
            return artistaDAO.buscarPorId(id);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Ha ocurrido un error al buscar por id");
        }
    }
    
}
