/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.bos;

import itson.sistemabibliotecamusicaldominio.UsuarioDominio;
import itson.sistemabibliotecamusicaldominio.dtos.ActualizarGenerosUsuarioDTO;
import itson.sistemabibliotecamusicaldominio.dtos.ModificarUsuarioDTO;
import itson.sistemabibliotecamusicaldominio.dtos.RegistrarUsuarioDTO;
import itson.sistemabibliotecamusicaldominio.dtos.UsuarioInicioSesionDTO;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import java.util.List;

/**
 *
 * @author Camila Zubía
 */
public interface IUsuarioNegocio {

    public UsuarioDominio obtenerUsuarioPorNombre(UsuarioInicioSesionDTO usuario) throws NegocioException;

    public UsuarioDominio registrarUsuario(RegistrarUsuarioDTO nuevoUsuario) throws NegocioException;

    public UsuarioDominio modificarUsuario(ModificarUsuarioDTO usuarioModificado) throws NegocioException;

    public UsuarioDominio actualizarGenerosNoDeseados(ActualizarGenerosUsuarioDTO usuarioActualizar) throws NegocioException;
    
    public List<String> obtenerGenerosNoDeseados(UsuarioDominio usuarioDominio) throws NegocioException;
    
    
}
