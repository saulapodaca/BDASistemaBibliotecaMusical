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
import itson.sistemabibliotecamusicalpersistencia.daos.IConexionBD;
import itson.sistemabibliotecamusicalpersistencia.daos.ICancionDAO;
import itson.sistemabibliotecamusicalpersistencia.daos.implementaciones.CancionDAO;
import itson.sistemabibliotecamusicalpersistencia.daos.implementaciones.ConexionBD;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author adell
 */
public class CancionFachada implements ICancionFachada {

    private ICancionNegocio cancionNegocio;

    public CancionFachada() {
        IConexionBD conexion = new ConexionBD();
        ICancionDAO cancionDAO = new CancionDAO(conexion);
        this.cancionNegocio = new CancionNegocio(cancionDAO);
    }

    /**
     * lista todos las canciones de la base de datos, excluyendo a los que sean 
     * de un genero no deseado
     * @param generosNoDeseados
     * @return 
     * @throws itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException 
     */
    @Override
    public List<CancionDominio> listarTodasLasCanciones(List<String> generosNoDeseados) throws NegocioException {
        try {
            return cancionNegocio.listarTodasLasCanciones(generosNoDeseados);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    /**
     * lista todos lss canciones de la base de datos que hayan cumplido con el
     * filtro, excluyendo a los que sean de un genero no deseado
     * @param filtro
     * @param generosNoDeseados
     * @return 
     * @throws itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException 
     */
    @Override
    public List<CancionDominio> listarCancionesPorFiltro(String filtro, List<String> generosNoDeseados) throws NegocioException {
        try {
            return cancionNegocio.listarCancionesPorFiltro(filtro, generosNoDeseados);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    /**
     * busca una cancion en la base de datos en base a su identificador
     * @param id
     * @return 
     * @throws itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException 
     */
    @Override
    public CancionDominio buscarPorId(ObjectId id) throws NegocioException {
        try {
            return cancionNegocio.buscarPorId(id);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }
}
