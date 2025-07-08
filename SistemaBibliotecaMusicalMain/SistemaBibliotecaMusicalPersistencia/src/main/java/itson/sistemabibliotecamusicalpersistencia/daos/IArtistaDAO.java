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
 *
 * @author Camila Zubía
 */
public interface IArtistaDAO {
    
    ArtistaDominio buscarPorId(ObjectId id) throws PersistenciaException;
    
    List<ResultadosDTO> listarTodo(List<String> generosNoDeseados) throws PersistenciaException;
    
    List<ArtistaDominio> listarTodosLosArtistas(List<String> generosNoDeseados) throws PersistenciaException;
    
    List<ResultadosDTO> listarTodoPorFiltro(String filtro, List<String> generosNoDeseados) throws PersistenciaException;
    
    List<ArtistaDominio> listarArtistasPorFiltro(String filtro, List<String> generosNoDeseados) throws PersistenciaException;
    
    public List<String> obtenerTodosLosGeneros() throws PersistenciaException;
}
