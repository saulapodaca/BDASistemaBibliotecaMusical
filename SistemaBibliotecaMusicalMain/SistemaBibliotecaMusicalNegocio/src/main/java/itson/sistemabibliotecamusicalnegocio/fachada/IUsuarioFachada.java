/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.fachada;

import itson.sistemabibliotecamusicaldominio.UsuarioDominio;
import itson.sistemabibliotecamusicaldominio.dtos.ModificarUsuarioDTO;
import itson.sistemabibliotecamusicaldominio.dtos.RegistrarUsuarioDTO;
import itson.sistemabibliotecamusicaldominio.dtos.UsuarioInicioSesionDTO;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;

/**
 *
 * @author Camila Zubía
 */
public interface IUsuarioFachada {
    
    //void guardarEnFavoritos(String idUsuario, Object favorito ) throws NegocioException;
    public UsuarioDominio obtenerUsuarioPorNombre(UsuarioInicioSesionDTO usuario) throws NegocioException;
    
    public UsuarioDominio registrarUsuario(RegistrarUsuarioDTO nuevoUsuario) throws NegocioException;
    
    public UsuarioDominio modificarUsuario(ModificarUsuarioDTO usuarioModificado) throws NegocioException;
    
}
