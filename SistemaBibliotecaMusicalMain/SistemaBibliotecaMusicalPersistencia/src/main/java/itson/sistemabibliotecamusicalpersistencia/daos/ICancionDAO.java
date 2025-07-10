/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package itson.sistemabibliotecamusicalpersistencia.daos;

import itson.sistemabibliotecamusicaldominio.CancionDominio;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author adell
 */
public interface ICancionDAO {
    
    /**
     * lista todos las canciones de la base de datos, excluyendo a los que sean 
     * de un genero no deseado
     * @param generosNoDeseados
     * @return
     * @throws PersistenciaException 
     */
    List<CancionDominio> listarTodasLasCanciones(List<String> generosNoDeseados) throws PersistenciaException;
    
    /**
     * lista todos lss canciones de la base de datos que hayan cumplido con el
     * filtro, excluyendo a los que sean de un genero no deseado
     * @param filtro
     * @param generosNoDeseados
     * @return
     * @throws PersistenciaException 
     */
    List<CancionDominio> listarCancionesPorFiltro(String filtro, List<String> generosNoDeseados) throws PersistenciaException; 
       
    /**
     * busca una cancion en la base de datos en base a su identificador
     * @param id
     * @return
     * @throws PersistenciaException 
     */
    CancionDominio buscarPorId(ObjectId id) throws PersistenciaException;
}
