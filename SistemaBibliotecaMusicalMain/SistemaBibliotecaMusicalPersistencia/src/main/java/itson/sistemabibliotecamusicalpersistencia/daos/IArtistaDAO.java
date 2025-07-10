/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package itson.sistemabibliotecamusicalpersistencia.daos;

import itson.sistemabibliotecamusicaldominio.ArtistaDominio;
import itson.sistemabibliotecamusicaldominio.dtos.ResultadosDTO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *interfaz que define las operaciones relacionadas a los artistas
 * @author Camila Zubía
 */
public interface IArtistaDAO {
    
    /**
     * busca un artista en la base de datos en base a su identificador
     * @param id
     * @return
     * @throws PersistenciaException 
     */
    ArtistaDominio buscarPorId(ObjectId id) throws PersistenciaException;
    
    /**
     * lista todos los registros(artista, album, cancion) de la base de datos
     * excluyendo los que tienen un genero no deseado y los guarda en una lista
     * @param generosNoDeseados
     * @return
     * @throws PersistenciaException 
     */
    List<ResultadosDTO> listarTodo(List<String> generosNoDeseados) throws PersistenciaException;
    
    /**
     * lista todos los artistas de la base de datos excluyendo los que son de un
     * genero no deseado
     * @param generosNoDeseados
     * @return
     * @throws PersistenciaException 
     */
    List<ArtistaDominio> listarTodosLosArtistas(List<String> generosNoDeseados) throws PersistenciaException;
    
    /**
     * lista todos los registros de la base de datos que cumplan con el filtro, 
     * excluyendo los que son de generos no deseados
     * @param filtro
     * @param generosNoDeseados
     * @return
     * @throws PersistenciaException 
     */
    List<ResultadosDTO> listarTodoPorFiltro(String filtro, List<String> generosNoDeseados) throws PersistenciaException;
    
    /**
     * lista todos los artistas de la base de datos que hayan cumplido con el filtro
     * excluyendo los que son de un genero no deseado
     * @param filtro
     * @param generosNoDeseados
     * @return
     * @throws PersistenciaException 
     */
    List<ArtistaDominio> listarArtistasPorFiltro(String filtro, List<String> generosNoDeseados) throws PersistenciaException;
    
    /**
     * lista todos los generos (distintos) que tengan los artistas
     * @return
     * @throws PersistenciaException 
     */
    List<String> obtenerTodosLosGeneros() throws PersistenciaException;
}
