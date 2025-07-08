/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.fachada.implementaciones;

import itson.sistemabibliotecamusicaldominio.UsuarioDominio;
import itson.sistemabibliotecamusicaldominio.dtos.ModificarUsuarioDTO;
import itson.sistemabibliotecamusicaldominio.dtos.RegistrarUsuarioDTO;
import itson.sistemabibliotecamusicaldominio.dtos.UsuarioInicioSesionDTO;
import itson.sistemabibliotecamusicalnegocio.bos.IUsuarioNegocio;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import itson.sistemabibliotecamusicalnegocio.fachada.IUsuarioFachada;
import itson.sistemabibliotecamusicalnegocio.bos.implementaciones.UsuarioNegocio;
import itson.sistemabibliotecamusicalpersistencia.daos.IUsuarioDAO;
import itson.sistemabibliotecamusicalpersistencia.daos.implementaciones.UsuarioDAO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;

/**
 *
 * @author Camila Zubía
 */
public class UsuarioFachada implements IUsuarioFachada{

    private IUsuarioNegocio usuarioNegocio;
    private IUsuarioDAO usuarioDAO;
    
    public UsuarioFachada(){
        //creo conexion
        //creo dao y mando conexion
        this.usuarioDAO = new UsuarioDAO();
        this.usuarioNegocio = new UsuarioNegocio(usuarioDAO);
    }
    
    @Override
    public UsuarioDominio obtenerUsuarioPorNombre(UsuarioInicioSesionDTO usuario) throws NegocioException{
        try {
            return usuarioNegocio.obtenerUsuarioPorNombre(usuario);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }
    
    //boolean guardarEnFavoritos(ArtistaDTO artista) throws NegocioException;

    @Override
    public UsuarioDominio registrarUsuario(RegistrarUsuarioDTO nuevoUsuario) throws NegocioException {
        try{
            return usuarioNegocio.registrarUsuario(nuevoUsuario);
        }catch(NegocioException ex){
            throw new NegocioException(ex.getMessage());
        }
    }

    @Override
    public UsuarioDominio modificarUsuario(ModificarUsuarioDTO usuarioModificado) throws NegocioException {
        try{
            return usuarioNegocio.modificarUsuario(usuarioModificado);
        }catch (NegocioException ex){
            throw new NegocioException(ex.getMessage());
        }
    }
    
}
