/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.fachada.implementaciones;

import itson.sistemabibliotecamusicaldominio.AlbumDominio;
import itson.sistemabibliotecamusicalnegocio.IAlbumNegocio;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import itson.sistemabibliotecamusicalnegocio.fachada.IAlbumFachada;
import itson.sistemabibliotecamusicalnegocio.implementaciones.AlbumNegocio;
import itson.sistemabibliotecamusicalpersistencia.daos.IAlbumDAO;
import itson.sistemabibliotecamusicalpersistencia.daos.implementaciones.AlbumDAO;
import java.util.List;

/**
 *
 * @author adell
 */
public class AlbumFachada implements IAlbumFachada{
    
    private IAlbumNegocio albumNegocio;

    public AlbumFachada(IAlbumNegocio albumNegocio) {
        IAlbumDAO albumDAO = new AlbumDAO();
        this.albumNegocio = new AlbumNegocio(albumDAO);
    }
    
    
    @Override
    public List<AlbumDominio> listarPorFiltro(String filtro) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
