/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.fachada;

import itson.sistemabibliotecamusicaldominio.UsuarioDominio;
import itson.sistemabibliotecamusicaldominio.dtos.UsuarioRegistradoDTO;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;

/**
 *
 * @author Camila Zubía
 */
public interface IUsuarioFachada {
    
    //void guardarEnFavoritos(String idUsuario, Object favorito ) throws NegocioException;
    public UsuarioDominio obtenerUsuarioPorNombre(UsuarioRegistradoDTO usuario) throws NegocioException;
    
}
