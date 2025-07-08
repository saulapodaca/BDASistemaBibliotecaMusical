/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.bos;

import itson.sistemabibliotecamusicaldominio.ArtistaDominio;
import itson.sistemabibliotecamusicaldominio.dtos.ResultadosDTO;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import java.util.List;

/**
 *
 * @author Camila Zubía
 */
public interface IArtistaNegocio {
    
    List<ResultadosDTO> listarTodo() throws NegocioException;
    
    List<ResultadosDTO> listarTodoPorFiltro(String filtro) throws NegocioException;

    List<ArtistaDominio> listarTodosLosArtistas() throws NegocioException;

    List<ArtistaDominio> listarArtistasPorFiltro(String filtro) throws NegocioException;
    
    public List<String> obtenerTodosLosGeneros() throws NegocioException;
}
