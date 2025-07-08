/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.bos.implementaciones;

import itson.sistemabibliotecamusicaldominio.ArtistaDominio;
import itson.sistemabibliotecamusicaldominio.dtos.ResultadosDTO;
import itson.sistemabibliotecamusicalnegocio.bos.IArtistaNegocio;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import itson.sistemabibliotecamusicalpersistencia.daos.IArtistaDAO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;
import java.util.List;

/**
 *
 * @author Camila Zubía
 */
public class ArtistaNegocio implements IArtistaNegocio{
    
    private IArtistaDAO artistaDAO;

    public ArtistaNegocio(IArtistaDAO artistaDAO) {
        this.artistaDAO = artistaDAO;
    }

    @Override
    public List<ResultadosDTO> listarTodo() throws NegocioException {
        try {
            return artistaDAO.listarTodo();
        } catch (PersistenciaException ex) {
            throw new NegocioException("Ha ocurrido un error al listar todo");
        }
    }

    @Override
    public List<ArtistaDominio> listarTodosLosArtistas() throws NegocioException {
        try {
            return artistaDAO.listarTodosLosArtistas();
        } catch (PersistenciaException ex) {
            throw new NegocioException("Ha ocurrido un error al listar todos los artistas");
        }
    }

    @Override
    public List<ResultadosDTO> listarTodoPorFiltro(String filtro) throws NegocioException {
        try {
            this.filtroValido(filtro);
            return artistaDAO.listarTodoPorFiltro(filtro);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Ha ocurrido un error al listar todos los artistas");
        }
    }

    @Override
    public List<ArtistaDominio> listarArtistasPorFiltro(String filtro) throws NegocioException {
        try {
            this.filtroValido(filtro);
            return artistaDAO.listarArtistasPorFiltro(filtro);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Ha ocurrido un error al listar todos los artistas");
        }
    }
    
    private void filtroValido(String filtro) throws NegocioException {
        if (filtro == null || filtro.trim().isEmpty()) {
            throw new NegocioException("El filtro no puede estar vacio");
        }
    }

    @Override
    public List<String> obtenerTodosLosGeneros() throws NegocioException {
        try{
            return artistaDAO.obtenerTodosLosGeneros();
        }catch(PersistenciaException ex){
            throw new NegocioException(ex.getMessage());
        }
    }
    
}
