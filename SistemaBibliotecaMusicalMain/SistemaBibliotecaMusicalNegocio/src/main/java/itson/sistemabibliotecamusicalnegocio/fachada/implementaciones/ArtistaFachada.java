/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.fachada.implementaciones;

import itson.sistemabibliotecamusicaldominio.ArtistaDominio;
import itson.sistemabibliotecamusicaldominio.dtos.ResultadosDTO;
import itson.sistemabibliotecamusicalnegocio.bos.IArtistaNegocio;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import itson.sistemabibliotecamusicalnegocio.fachada.IArtistaFachada;
import itson.sistemabibliotecamusicalnegocio.bos.implementaciones.ArtistaNegocio;
import itson.sistemabibliotecamusicalpersistencia.daos.IArtistaDAO;
import itson.sistemabibliotecamusicalpersistencia.daos.implementaciones.ArtistaDAO;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Camila Zubía
 */
public class ArtistaFachada implements IArtistaFachada{
    
    private IArtistaNegocio artistaNegocio;

    public ArtistaFachada() {
        IArtistaDAO artistaDAO = new ArtistaDAO();
        this.artistaNegocio = new ArtistaNegocio(artistaDAO);
    }

    @Override
    public List<ResultadosDTO> listarTodo(List<String> generosNoDeseados) throws NegocioException {
        try {
            return artistaNegocio.listarTodo(generosNoDeseados);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    @Override
    public List<ArtistaDominio> listarTodosLosArtistas(List<String> generosNoDeseados) throws NegocioException {
        try {
            return artistaNegocio.listarTodosLosArtistas(generosNoDeseados);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    @Override
    public List<ResultadosDTO> listarTodoPorFiltro(String filtro, List<String> generosNoDeseados) throws NegocioException {
        try {
            return artistaNegocio.listarTodoPorFiltro(filtro, generosNoDeseados);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    @Override
    public List<ArtistaDominio> listarArtistasPorFiltro(String filtro, List<String> generosNoDeseados) throws NegocioException {
        try {
            return artistaNegocio.listarArtistasPorFiltro(filtro, generosNoDeseados);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    @Override
    public List<String> obtenerTodosLosGeneros() throws NegocioException {
        try{
            return artistaNegocio.obtenerTodosLosGeneros();
        }catch(NegocioException ex){
            throw new NegocioException(ex.getMessage());
        }
    }

    @Override
    public ArtistaDominio buscarPorId(ObjectId id) throws NegocioException {
        try {
            return artistaNegocio.buscarPorId(id);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }
}
