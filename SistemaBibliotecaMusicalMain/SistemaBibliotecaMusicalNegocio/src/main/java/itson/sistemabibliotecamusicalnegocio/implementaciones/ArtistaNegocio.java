/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.implementaciones;

import itson.sistemabibliotecamusicaldominio.ArtistaDominio;
import itson.sistemabibliotecamusicalnegocio.IArtistaNegocio;
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
    public List<ArtistaDominio> listarTodo() throws NegocioException {
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
    public List<ArtistaDominio> listarPorFiltro(String filtro) throws NegocioException {
        try {
            filtroValido(filtro);
            return artistaDAO.listarPorFiltro(filtro);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Ha ocurrido un error al listar por filtro");
        }
    }
    
    private void filtroValido(String filtro) throws NegocioException {
        if (filtro == null || filtro.trim().isEmpty()) {
            throw new NegocioException("El filtro no puede estar vacio");
        }
    }

}
