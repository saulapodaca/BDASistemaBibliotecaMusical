/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.fachada.implementaciones;

import itson.sistemabibliotecamusicaldominio.UsuarioDominio;
import itson.sistemabibliotecamusicaldominio.dtos.UsuarioRegistradoDTO;
import itson.sistemabibliotecamusicalnegocio.IUsuarioNegocio;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import itson.sistemabibliotecamusicalnegocio.fachada.IUsuarioFachada;
import itson.sistemabibliotecamusicalnegocio.implementaciones.UsuarioNegocio;
import itson.sistemabibliotecamusicalpersistencia.daos.IUsuarioDAO;
import itson.sistemabibliotecamusicalpersistencia.daos.implementaciones.UsuarioDAO;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public UsuarioDominio obtenerUsuarioPorNombre(UsuarioRegistradoDTO usuario) throws NegocioException{
        try {
            return usuarioNegocio.obtenerUsuarioPorNombre(usuario);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }
    
    //boolean guardarEnFavoritos(ArtistaDTO artista) throws NegocioException;
    
}
