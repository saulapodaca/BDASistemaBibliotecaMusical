/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.fachada;

import itson.sistemabibliotecamusicaldominio.FavoritoDominio;
import itson.sistemabibliotecamusicaldominio.TipoFavoritoEnum;
import itson.sistemabibliotecamusicaldominio.UsuarioDominio;
import itson.sistemabibliotecamusicaldominio.dtos.ActualizarGenerosUsuarioDTO;
import itson.sistemabibliotecamusicaldominio.dtos.ModificarUsuarioDTO;
import itson.sistemabibliotecamusicaldominio.dtos.RegistrarUsuarioDTO;
import itson.sistemabibliotecamusicaldominio.dtos.ResultadosDTO;
import itson.sistemabibliotecamusicaldominio.dtos.UsuarioInicioSesionDTO;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Camila Zubía
 */
public interface IUsuarioFachada {
    
    public UsuarioDominio obtenerUsuarioPorNombre(UsuarioInicioSesionDTO usuario) throws NegocioException;
    
    public UsuarioDominio registrarUsuario(RegistrarUsuarioDTO nuevoUsuario) throws NegocioException;
    
    public UsuarioDominio modificarUsuario(ModificarUsuarioDTO usuarioModificado) throws NegocioException;
    
    public UsuarioDominio actualizarGenerosNoDeseados(ActualizarGenerosUsuarioDTO usuarioActualizar) throws NegocioException;
    
    public List<String> obtenerGenerosNoDeseados(UsuarioDominio usuarioDominio) throws NegocioException;
    
    public FavoritoDominio agregarFavorito(ObjectId id) throws NegocioException;

    public void eliminarFavorito(ObjectId id) throws NegocioException;

    public boolean esFavorito(ObjectId id) throws NegocioException;

    public List<ResultadosDTO> listarFavoritos(List<String> generosNoDeseados) throws NegocioException;

    public List<ResultadosDTO> listarFavoritosPorFiltro(String filtro, List<String> generosNoDeseados) throws NegocioException;

    public List<ResultadosDTO> listarFavoritosPorTipoYFiltro(TipoFavoritoEnum tipo, String filtro, List<String> generosNoDeseados) throws NegocioException;
    
    public UsuarioDominio obtenerUsuarioPorId(ObjectId id) throws NegocioException;

}
