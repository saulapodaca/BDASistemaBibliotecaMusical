/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio;

import itson.sistemabibliotecamusicaldominio.ArtistaDominio;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import java.util.List;

/**
 *
 * @author Camila Zubía
 */
public interface IArtistaNegocio {
    
    List<ArtistaDominio> listarTodo() throws NegocioException;

    List<ArtistaDominio> listarTodosLosArtistas() throws NegocioException;

    List<ArtistaDominio> listarPorFiltro(String filtro) throws NegocioException;
    
}
