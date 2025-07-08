/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.fachada.implementaciones;

import itson.sistemabibliotecamusicaldominio.ArtistaDominio;
import itson.sistemabibliotecamusicaldominio.dtos.ResultadosDTO;
import itson.sistemabibliotecamusicalnegocio.IArtistaNegocio;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import itson.sistemabibliotecamusicalnegocio.fachada.IArtistaFachada;
import itson.sistemabibliotecamusicalnegocio.implementaciones.ArtistaNegocio;
import itson.sistemabibliotecamusicalpersistencia.daos.IArtistaDAO;
import itson.sistemabibliotecamusicalpersistencia.daos.implementaciones.ArtistaDAO;
import java.util.List;

/**
 *
 * @author Camila Zubía
 */
public class ArtistaFachada implements IArtistaFachada{
    
    private IArtistaNegocio artistaNegocio;

    public ArtistaFachada() {
        IArtistaDAO artistaDAO = new ArtistaDAO();
        this.artistaNegocio = new ArtistaNegocio(artistaDAO);
    }

    @Override
    public List<ResultadosDTO> listarTodo() throws NegocioException {
        try {
            return artistaNegocio.listarTodo();
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    @Override
    public List<ArtistaDominio> listarTodosLosArtistas() throws NegocioException {
        try {
            return artistaNegocio.listarTodosLosArtistas();
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    @Override
    public List<ResultadosDTO> listarTodoPorFiltro(String filtro) throws NegocioException {
        try {
            return artistaNegocio.listarTodoPorFiltro(filtro);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    @Override
    public List<ArtistaDominio> listarArtistasPorFiltro(String filtro) throws NegocioException {
        try {
            return artistaNegocio.listarArtistasPorFiltro(filtro);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }
}
