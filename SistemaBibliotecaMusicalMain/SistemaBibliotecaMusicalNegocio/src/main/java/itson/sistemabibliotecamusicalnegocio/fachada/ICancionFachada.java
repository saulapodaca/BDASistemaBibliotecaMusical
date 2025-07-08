/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.fachada;

import itson.sistemabibliotecamusicaldominio.CancionDominio;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import java.util.List;

/**
 *
 * @author adell
 */
public interface ICancionFachada {
    
    List<CancionDominio> listarTodasLasCanciones() throws NegocioException;

    List<CancionDominio> listarCancionesPorFiltro(String filtro) throws NegocioException;
    
}
