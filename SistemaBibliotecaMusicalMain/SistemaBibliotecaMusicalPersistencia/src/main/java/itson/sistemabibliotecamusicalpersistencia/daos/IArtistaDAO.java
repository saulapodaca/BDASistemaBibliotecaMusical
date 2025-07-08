/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package itson.sistemabibliotecamusicalpersistencia.daos;

import itson.sistemabibliotecamusicaldominio.ArtistaDominio;
import itson.sistemabibliotecamusicaldominio.dtos.ResultadosDTO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;
import java.util.List;

/**
 *
 * @author Camila Zubía
 */
public interface IArtistaDAO {
    
    List<ResultadosDTO> listarTodo() throws PersistenciaException;
    
    List<ArtistaDominio> listarTodosLosArtistas() throws PersistenciaException;
    
    List<ResultadosDTO> listarTodoPorFiltro(String filtro) throws PersistenciaException;
    
    List<ArtistaDominio> listarArtistasPorFiltro(String filtro) throws PersistenciaException;
    
    public List<String> obtenerTodosLosGeneros() throws PersistenciaException;
}
