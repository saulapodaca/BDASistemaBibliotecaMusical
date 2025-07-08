/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package itson.sistemabibliotecamusicalpersistencia.daos;

import itson.sistemabibliotecamusicaldominio.CancionDominio;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;
import java.util.List;

/**
 *
 * @author adell
 */
public interface ICancionDAO {
    
    List<CancionDominio> listarTodasLasCanciones(List<String> generosNoDeseados) throws PersistenciaException;
    
    List<CancionDominio> listarCancionesPorFiltro(String filtro, List<String> generosNoDeseados) throws PersistenciaException; 
       
}
