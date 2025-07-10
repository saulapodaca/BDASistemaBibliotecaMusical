/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.bos;

import itson.sistemabibliotecamusicaldominio.ArtistaDominio;
import itson.sistemabibliotecamusicaldominio.dtos.ResultadosDTO;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Camila Zubía
 */
public interface IArtistaNegocio {
    
    /**
     * busca un artista en la base de datos en base a su identificador
     * @param id
     * @return 
     * @throws itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException 
     */
    ArtistaDominio buscarPorId(ObjectId id) throws NegocioException;
    
    /**
     * lista todos los registros(artista, album, cancion) de la base de datos
     * excluyendo los que tienen un genero no deseado y los guarda en una lista
     * @param generosNoDeseados
     * @return
     * @throws itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException 
     */
    List<ResultadosDTO> listarTodo(List<String> generosNoDeseados) throws NegocioException;
    
    /**
     * lista todos los registros de la base de datos que cumplan con el filtro, 
     * excluyendo los que son de generos no deseados
     * @param filtro
     * @param generosNoDeseados
     * @return 
     * @throws itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException 
     */
    List<ResultadosDTO> listarTodoPorFiltro(String filtro, List<String> generosNoDeseados) throws NegocioException;

    /**
     * lista todos los artistas de la base de datos excluyendo los que son de un
     * genero no deseado
     * @param generosNoDeseados
     * @return 
     * @throws itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException 
     */
    List<ArtistaDominio> listarTodosLosArtistas(List<String> generosNoDeseados) throws NegocioException;

    /**
     * lista todos los artistas de la base de datos que hayan cumplido con el filtro
     * excluyendo los que son de un genero no deseado
     * @param filtro
     * @param generosNoDeseados
     * @return
     * @throws itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException 
     */
    List<ArtistaDominio> listarArtistasPorFiltro(String filtro, List<String> generosNoDeseados) throws NegocioException;
    
    /**
     * lista todos los generos (distintos) que tengan los artistas
     * @return 
     * @throws itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException 
     */
    public List<String> obtenerTodosLosGeneros() throws NegocioException;
}
