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
    
    List<AlbumDominio> listarTodosLosAlbumes(List<String> generosNoDeseados) throws PersistenciaException;
    
    List<AlbumDominio> listarAlbumesPorFiltro(String filtro, List<String> generosNoDeseados) throws PersistenciaException;
    
    AlbumDominio buscarPorId(ObjectId id) throws PersistenciaException;
}
