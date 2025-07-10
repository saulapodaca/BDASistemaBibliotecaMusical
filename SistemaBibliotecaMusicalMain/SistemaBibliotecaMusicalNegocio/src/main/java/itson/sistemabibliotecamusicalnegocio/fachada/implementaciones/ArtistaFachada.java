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
import itson.sistemabibliotecamusicalpersistencia.daos.IConexionBD;
import itson.sistemabibliotecamusicalpersistencia.daos.IArtistaDAO;
import itson.sistemabibliotecamusicalpersistencia.daos.implementaciones.ArtistaDAO;
import itson.sistemabibliotecamusicalpersistencia.daos.implementaciones.ConexionBD;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Camila Zubía
 */
public class ArtistaFachada implements IArtistaFachada{
    
    private IArtistaNegocio artistaNegocio;

    public ArtistaFachada() {
        IConexionBD conexion = new ConexionBD();
        IArtistaDAO artistaDAO = new ArtistaDAO(conexion);
        this.artistaNegocio = new ArtistaNegocio(artistaDAO);
    }

    /**
     * lista todos los registros(artista, album, cancion) de la base de datos
     * excluyendo los que tienen un genero no deseado y los guarda en una lista
     * @param generosNoDeseados
     * @return
     * @throws itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException 
     */
    @Override
    public List<ResultadosDTO> listarTodo(List<String> generosNoDeseados) throws NegocioException {
        try {
            return artistaNegocio.listarTodo(generosNoDeseados);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    /**
     * lista todos los artistas de la base de datos excluyendo los que son de un
     * genero no deseado
     * @param generosNoDeseados
     * @return 
     * @throws itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException 
     */
    @Override
    public List<ArtistaDominio> listarTodosLosArtistas(List<String> generosNoDeseados) throws NegocioException {
        try {
            return artistaNegocio.listarTodosLosArtistas(generosNoDeseados);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    /**
     * lista todos los registros de la base de datos que cumplan con el filtro, 
     * excluyendo los que son de generos no deseados
     * @param filtro
     * @param generosNoDeseados
     * @return 
     * @throws itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException 
     */
    @Override
    public List<ResultadosDTO> listarTodoPorFiltro(String filtro, List<String> generosNoDeseados) throws NegocioException {
        try {
            return artistaNegocio.listarTodoPorFiltro(filtro, generosNoDeseados);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    /**
     * lista todos los artistas de la base de datos que hayan cumplido con el filtro
     * excluyendo los que son de un genero no deseado
     * @param filtro
     * @param generosNoDeseados
     * @return
     * @throws itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException 
     */
    @Override
    public List<ArtistaDominio> listarArtistasPorFiltro(String filtro, List<String> generosNoDeseados) throws NegocioException {
        try {
            return artistaNegocio.listarArtistasPorFiltro(filtro, generosNoDeseados);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    /**
     * lista todos los generos (distintos) que tengan los artistas
     * @return 
     * @throws itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException 
     */
    @Override
    public List<String> obtenerTodosLosGeneros() throws NegocioException {
        try{
            return artistaNegocio.obtenerTodosLosGeneros();
        }catch(NegocioException ex){
            throw new NegocioException(ex.getMessage());
        }
    }

    /**
     * busca un artista en la base de datos en base a su identificador
     * @param id
     * @return 
     * @throws itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException 
     */
    @Override
    public ArtistaDominio buscarPorId(ObjectId id) throws NegocioException {
        try {
            return artistaNegocio.buscarPorId(id);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }
}
