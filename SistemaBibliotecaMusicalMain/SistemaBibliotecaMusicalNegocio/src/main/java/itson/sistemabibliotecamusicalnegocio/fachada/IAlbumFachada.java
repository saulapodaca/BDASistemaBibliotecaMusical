/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.fachada;

import itson.sistemabibliotecamusicaldominio.AlbumDominio;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import java.util.List;

/**
 *
 * @author adell
 */
public interface IAlbumFachada {

    List<AlbumDominio> listarTodosLosAlbumes() throws NegocioException;

    List<AlbumDominio> listarAlbumesPorFiltro(String filtro) throws NegocioException;

}
