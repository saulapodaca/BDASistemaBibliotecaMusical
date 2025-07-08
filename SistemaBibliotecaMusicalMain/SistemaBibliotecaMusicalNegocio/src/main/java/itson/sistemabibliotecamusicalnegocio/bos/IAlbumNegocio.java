/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.bos;

import itson.sistemabibliotecamusicaldominio.AlbumDominio;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author adell
 */
public interface IAlbumNegocio {
    AlbumDominio buscarPorId(ObjectId id) throws NegocioException;
    
    List<AlbumDominio> listarTodosLosAlbumes(List<String> generosNoDeseados) throws NegocioException;

    List<AlbumDominio> listarAlbumesPorFiltro(String filtro, List<String> generosNoDeseados) throws NegocioException;

}
