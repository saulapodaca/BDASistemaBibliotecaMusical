/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.fachada.implementaciones;

import itson.sistemabibliotecamusicaldominio.CancionDominio;
import itson.sistemabibliotecamusicalnegocio.ICancionNegocio;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import itson.sistemabibliotecamusicalnegocio.fachada.ICancionFachada;
import itson.sistemabibliotecamusicalnegocio.implementaciones.CancionNegocio;
import itson.sistemabibliotecamusicalpersistencia.daos.ICancionDAO;
import itson.sistemabibliotecamusicalpersistencia.daos.implementaciones.CancionDAO;
import java.util.List;

/**
 *
 * @author adell
 */
public class CancionFachada implements ICancionFachada {

    private ICancionNegocio cancionNegocio;

    public CancionFachada(ICancionNegocio cancionNegocio) {
        ICancionDAO cancionDAO = new CancionDAO();
        this.cancionNegocio = new CancionNegocio(cancionDAO);
    }

    @Override
    public List<CancionDominio> listarPorFiltro(String filtro) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
