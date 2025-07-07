/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package itson.sistemabibliotecamusicalpersistencia.daos;

import itson.sistemabibliotecamusicaldominio.ArtistaDominio;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;
import java.util.List;

/**
 *
 * @author Camila Zubía
 */
public interface IArtistaDAO {
    
    List<ArtistaDominio> listarTodo() throws PersistenciaException;
    
    List<ArtistaDominio> listarTodosLosArtistas() throws PersistenciaException;
    
    List<ArtistaDominio> listarPorFiltro(String filtro) throws PersistenciaException;
    
}
