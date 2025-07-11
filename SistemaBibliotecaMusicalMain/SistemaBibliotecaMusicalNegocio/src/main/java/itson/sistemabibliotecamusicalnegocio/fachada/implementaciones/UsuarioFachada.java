/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.fachada.implementaciones;

import itson.sistemabibliotecamusicaldominio.FavoritoDominio;
import itson.sistemabibliotecamusicaldominio.TipoFavoritoEnum;
import itson.sistemabibliotecamusicaldominio.UsuarioDominio;
import itson.sistemabibliotecamusicaldominio.dtos.ActualizarGenerosUsuarioDTO;
import itson.sistemabibliotecamusicaldominio.dtos.ModificarUsuarioDTO;
import itson.sistemabibliotecamusicaldominio.dtos.RegistrarUsuarioDTO;
import itson.sistemabibliotecamusicaldominio.dtos.ResultadosDTO;
import itson.sistemabibliotecamusicaldominio.dtos.UsuarioInicioSesionDTO;
import itson.sistemabibliotecamusicalnegocio.bos.IUsuarioNegocio;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import itson.sistemabibliotecamusicalnegocio.fachada.IUsuarioFachada;
import itson.sistemabibliotecamusicalnegocio.bos.implementaciones.UsuarioNegocio;
import itson.sistemabibliotecamusicalpersistencia.daos.IConexionBD;
import itson.sistemabibliotecamusicalpersistencia.daos.IUsuarioDAO;
import itson.sistemabibliotecamusicalpersistencia.daos.implementaciones.ConexionBD;
import itson.sistemabibliotecamusicalpersistencia.daos.implementaciones.UsuarioDAO;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Camila Zubía
 */
public class UsuarioFachada implements IUsuarioFachada{

    private IUsuarioNegocio usuarioNegocio;
    private IUsuarioDAO usuarioDAO;
    
    public UsuarioFachada(){
        IConexionBD conexion = new ConexionBD();
        this.usuarioDAO = new UsuarioDAO(conexion);
        this.usuarioNegocio = new UsuarioNegocio(usuarioDAO);
    }
    
    /**
     * obtiene un usuario en base a su nombre
     *
     * @param usuario
     * @return
     * @throws NegocioException
     */
    @Override
    public UsuarioDominio obtenerUsuarioPorNombre(UsuarioInicioSesionDTO usuario) throws NegocioException{
        try {
            return usuarioNegocio.obtenerUsuarioPorNombre(usuario);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }
    
    /**
     * agrega un usuario nuevo a la base de datos
     *
     * @param nuevoUsuario
     * @return
     * @throws NegocioException
     */
    @Override
    public UsuarioDominio registrarUsuario(RegistrarUsuarioDTO nuevoUsuario) throws NegocioException {
        try{
            return usuarioNegocio.registrarUsuario(nuevoUsuario);
        }catch(NegocioException ex){
            throw new NegocioException(ex.getMessage());
        }
    }

    /**
     * modifica los atributos de un usuario que ya este registrado en una base
     * de datos
     *
     * @param usuarioModificado
     * @return
     * @throws NegocioException
     */
    @Override
    public UsuarioDominio modificarUsuario(ModificarUsuarioDTO usuarioModificado) throws NegocioException {
        try{
            return usuarioNegocio.modificarUsuario(usuarioModificado);
        }catch (NegocioException ex){
            throw new NegocioException(ex.getMessage());
        }
    }

    /**
     * actualiza la lista de generos no deseados de un usuario
     *
     * @param usuarioActualizar
     * @return
     * @throws NegocioException
     */
    @Override
    public UsuarioDominio actualizarGenerosNoDeseados(ActualizarGenerosUsuarioDTO usuarioActualizar) throws NegocioException {
        try{
            return usuarioNegocio.actualizarGenerosNoDeseados(usuarioActualizar);
        }catch(NegocioException ex){
            throw new NegocioException(ex.getMessage());
        }
    }

    /**
     * lista todos los generos no deseados dentro de la lista de generos no
     * deseados de un usuario
     *
     * @param id
     * @return
     * @throws NegocioException
     */
    @Override
    public List<String> obtenerGenerosNoDeseados(UsuarioDominio usuarioDominio) throws NegocioException {
        try {
            return usuarioNegocio.obtenerGenerosNoDeseados(usuarioDominio);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    /**
     * agrega un registro(artista, album, cancion) a la lista de favoritos de un
     * usuario
     *
     * @param id
     * @return
     * @throws NegocioException
     */
    @Override
    public FavoritoDominio agregarFavorito(ObjectId id) throws NegocioException {
        try {
            return usuarioNegocio.agregarFavorito(id);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    /**
     * elimina un registro(artista, album, cancion) a la lista de favoritos de
     * un usuario
     *
     * @param id
     * @throws NegocioException
     */
    @Override
    public void eliminarFavorito(ObjectId id) throws NegocioException {
        try {
            usuarioNegocio.eliminarFavorito(id);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    /**
     * verifica si un registro(artista, album, cancion) esta dentro de la lista
     * de favoritos de un usuario
     *
     * @param id
     * @return
     * @throws NegocioException
     */
    @Override
    public boolean esFavorito(ObjectId id) throws NegocioException {
        try {
            return usuarioNegocio.esFavorito(id);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    /**
     * lista todos los registros que estan dentro de la lista de favoritos de un
     * usuario
     *
     * @param generosNoDeseados
     * @return
     * @throws NegocioException
     */
    @Override
    public List<ResultadosDTO> listarFavoritos(List<String> generosNoDeseados) throws NegocioException {
        try {
            return usuarioNegocio.listarFavoritos(generosNoDeseados);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    /**
     * lista todos los registros que estan dentro de la lista de favoritos de un
     * usuario si cumplen con el filtro
     *
     * @param filtro
     * @param generosNoDeseados
     * @return
     * @throws NegocioException
     */
    @Override
    public List<ResultadosDTO> listarFavoritosPorFiltro(String filtro, List<String> generosNoDeseados) throws NegocioException {
        try {
            return usuarioNegocio.listarFavoritosPorFiltro(filtro, generosNoDeseados);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    /**
     * lista todos los registros que estan dentro de la lista de favoritos de un
     * usuario si cumplen con el filtro y que sean de un tipo especifico
     *
     * @param tipo
     * @param filtro
     * @param generosNoDeseados
     * @return
     * @throws NegocioException
     */
    @Override
    public List<ResultadosDTO> listarFavoritosPorTipoYFiltro(TipoFavoritoEnum tipo, String filtro, List<String> generosNoDeseados) throws NegocioException {
        try {
            return usuarioNegocio.listarFavoritosPorTipoYFiltro(tipo, filtro, generosNoDeseados);
        } catch (NegocioException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    /**
     * obtiene un usuario con base a su identificador
     *
     * @param id
     * @return
     * @throws NegocioException
     */
    @Override
    public UsuarioDominio obtenerUsuarioPorId(ObjectId id) throws NegocioException {
        try{
            return usuarioNegocio.obtenerUsuarioPorId(id);
        } catch (NegocioException ex){
            throw new NegocioException(ex.getMessage());
        }
    }

}
