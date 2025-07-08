/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.fachada.implementaciones;

import itson.sistemabibliotecamusicaldominio.CancionDominio;
import itson.sistemabibliotecamusicalnegocio.bos.ICancionNegocio;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import itson.sistemabibliotecamusicalnegocio.fachada.ICancionFachada;
import itson.sistemabibliotecamusicalnegocio.bos.implementaciones.CancionNegocio;
import itson.sistemabibliotecamusicalpersistencia.daos.ICancionDAO;
import itson.sistemabibliotecamusicalpersistencia.daos.implementaciones.CancionDAO;
import java.util.List;

/**
 *
 * @author adell
 */
public class CancionFachada implements ICancionFachada {

    private ICancionNegocio cancionNegocio;

    public CancionFachada() {
        ICancionDAO cancionDAO = new CancionDAO();
        this.cancionNegocio = new CancionNegocio(cancionDAO);
    }

    @Override
    public List<CancionDominio> listarTodasLasCanciones() throws NegocioException {
        try {
            return cancionNegocio.listarTodasLasCanciones();
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    @Override
    public List<CancionDominio> listarCancionesPorFiltro(String filtro) throws NegocioException {
        try {
            return cancionNegocio.listarCancionesPorFiltro(filtro);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }
}
