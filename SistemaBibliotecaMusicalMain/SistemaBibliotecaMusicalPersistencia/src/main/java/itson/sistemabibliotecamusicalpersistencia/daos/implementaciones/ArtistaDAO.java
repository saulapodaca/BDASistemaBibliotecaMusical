/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalpersistencia.daos.implementaciones;

import itson.sistemabibliotecamusicaldominio.ArtistaDominio;
import itson.sistemabibliotecamusicaldominio.dtos.ResultadosDTO;
import itson.sistemabibliotecamusicalpersistencia.daos.IArtistaDAO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;
import java.util.List;

/**
 *
 * @author Camila Zubía
 */
public class ArtistaDAO implements IArtistaDAO{

    @Override
    public List<ResultadosDTO> listarTodo() throws PersistenciaException {
        
        System.out.println("listar todo");
        return null;
        
    }

    @Override
    public List<ArtistaDominio> listarTodosLosArtistas() throws PersistenciaException {
        
        System.out.println("listar todos los artistas");
        return null;
        
    }

    @Override
    public List<ResultadosDTO> listarTodoPorFiltro(String filtro) throws PersistenciaException {
        System.out.println("listar todo con filtro");
        return null;
    }

    @Override
    public List<ArtistaDominio> listarArtistasPorFiltro(String filtro) throws PersistenciaException {
        System.out.println("listar todos los artistas con filtro");
        return null;
    }
    
}
