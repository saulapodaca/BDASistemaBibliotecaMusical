/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.fachada;

import itson.sistemabibliotecamusicaldominio.ArtistaDominio;
import itson.sistemabibliotecamusicaldominio.dtos.ResultadosDTO;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import java.util.List;

/**
 *
 * @author Camila Zubía
 */
public interface IArtistaFachada {
    
    List<ResultadosDTO> listarTodo(List<String> generosNoDeseados) throws NegocioException;
    
    List<ResultadosDTO> listarTodoPorFiltro(String filtro, List<String> generosNoDeseados) throws NegocioException;

    List<ArtistaDominio> listarTodosLosArtistas(List<String> generosNoDeseados) throws NegocioException;

    List<ArtistaDominio> listarArtistasPorFiltro(String filtro, List<String> generosNoDeseados) throws NegocioException;
    
    public List<String> obtenerTodosLosGeneros() throws NegocioException;
}
