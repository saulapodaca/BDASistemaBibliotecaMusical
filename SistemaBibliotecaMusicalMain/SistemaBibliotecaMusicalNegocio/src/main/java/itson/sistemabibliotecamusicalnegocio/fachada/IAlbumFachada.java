/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.fachada;

import itson.sistemabibliotecamusicaldominio.AlbumDominio;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author adell
 */
public interface IAlbumFachada {
    
    /**
     * busca un album en la base de datos en base a su identificador
     *
     * @param id
     * @return
     * @throws
     * itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException
     */
    AlbumDominio buscarPorId(ObjectId id) throws NegocioException;

    /**
     * lista todos los albumes de la base de datos, excluyendo a los que sean de
     * un genero no deseado
     *
     * @param generosNoDeseados
     * @return
     * @throws
     * itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException
     */
    List<AlbumDominio> listarTodosLosAlbumes(List<String> generosNoDeseados) throws NegocioException;

    /**
     * lista todos los albumes de la base de datos que hayan cumplido con el
     * filtro , excluyendo a los que sean de un genero no deseado
     *
     * @param filtro
     * @param generosNoDeseados
     * @return
     * @throws
     * itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException
     */
    List<AlbumDominio> listarAlbumesPorFiltro(String filtro, List<String> generosNoDeseados) throws NegocioException;

}
