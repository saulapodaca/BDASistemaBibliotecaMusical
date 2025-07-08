/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.bos;

import itson.sistemabibliotecamusicaldominio.CancionDominio;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author adell
 */
public interface ICancionNegocio {
    CancionDominio buscarPorId(ObjectId id) throws NegocioException;

    List<CancionDominio> listarTodasLasCanciones(List<String> generosNoDeseados) throws NegocioException;

    List<CancionDominio> listarCancionesPorFiltro(String filtro, List<String> generosNoDeseados) throws NegocioException;

}
