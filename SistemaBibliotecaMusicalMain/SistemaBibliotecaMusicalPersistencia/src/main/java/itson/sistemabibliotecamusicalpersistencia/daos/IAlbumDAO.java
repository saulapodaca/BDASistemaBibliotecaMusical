/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalpersistencia.daos;

import itson.sistemabibliotecamusicaldominio.AlbumDominio;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author adell
 */
public interface IAlbumDAO {
    /**
     * lista todos los albumes de la base de datos, excluyendo a los que sean de
     * un genero no deseado
     * @param generosNoDeseados
     * @return
     * @throws PersistenciaException 
     */
    List<AlbumDominio> listarTodosLosAlbumes(List<String> generosNoDeseados) throws PersistenciaException;
    
    /**
     * lista todos los albumes de la base de datos que hayan cumplido con el filtro
     * , excluyendo a los que sean de un genero no deseado
     * @param filtro
     * @param generosNoDeseados
     * @return
     * @throws PersistenciaException 
     */
    List<AlbumDominio> listarAlbumesPorFiltro(String filtro, List<String> generosNoDeseados) throws PersistenciaException;
    
    /**
     * busca un album en la base de datos en base a su identificador
     * @param id
     * @return
     * @throws PersistenciaException 
     */
    AlbumDominio buscarPorId(ObjectId id) throws PersistenciaException;
}
