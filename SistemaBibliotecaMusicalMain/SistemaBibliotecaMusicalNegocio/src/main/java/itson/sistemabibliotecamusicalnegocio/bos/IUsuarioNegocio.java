/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.bos;

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
public interface IUsuarioNegocio {
    
    /**
     * obtiene un usuario en base a su nombre
     *
     * @param usuario
     * @return
     * @throws NegocioException
     */
    public UsuarioDominio obtenerUsuarioPorNombre(UsuarioInicioSesionDTO usuario) throws NegocioException;

    /**
     * agrega un usuario nuevo a la base de datos
     *
     * @param nuevoUsuario
     * @return
     * @throws NegocioException
     */
    public UsuarioDominio registrarUsuario(RegistrarUsuarioDTO nuevoUsuario) throws NegocioException;

    /**
     * modifica los atributos de un usuario que ya este registrado en una base
     * de datos
     *
     * @param usuarioModificado
     * @return
     * @throws NegocioException
     */
    public UsuarioDominio modificarUsuario(ModificarUsuarioDTO usuarioModificado) throws NegocioException;

    /**
     * actualiza la lista de generos no deseados de un usuario
     *
     * @param usuarioActualizar
     * @return
     * @throws NegocioException
     */
    public UsuarioDominio actualizarGenerosNoDeseados(ActualizarGenerosUsuarioDTO usuarioActualizar) throws NegocioException;

    /**
     * lista todos los generos no deseados dentro de la lista de generos no
     * deseados de un usuario
     *
     * @param id
     * @return
     * @throws NegocioException
     */
    public List<String> obtenerGenerosNoDeseados(UsuarioDominio usuarioDominio) throws NegocioException;

    /**
     * agrega un registro(artista, album, cancion) a la lista de favoritos de un
     * usuario
     *
     * @param id
     * @return
     * @throws NegocioException
     */
    public FavoritoDominio agregarFavorito(ObjectId id) throws NegocioException;

    /**
     * elimina un registro(artista, album, cancion) a la lista de favoritos de
     * un usuario
     *
     * @param id
     * @throws NegocioException
     */
    public void eliminarFavorito(ObjectId id) throws NegocioException;

    /**
     * verifica si un registro(artista, album, cancion) esta dentro de la lista
     * de favoritos de un usuario
     *
     * @param id
     * @return
     * @throws NegocioException
     */
    public boolean esFavorito(ObjectId id) throws NegocioException;

    /**
     * lista todos los registros que estan dentro de la lista de favoritos de un
     * usuario
     *
     * @param generosNoDeseados
     * @return
     * @throws NegocioException
     */
    public List<ResultadosDTO> listarFavoritos(List<String> generosNoDeseados) throws NegocioException;

    /**
     * lista todos los registros que estan dentro de la lista de favoritos de un
     * usuario si cumplen con el filtro
     *
     * @param filtro
     * @param generosNoDeseados
     * @return
     * @throws NegocioException
     */
    public List<ResultadosDTO> listarFavoritosPorFiltro(String filtro, List<String> generosNoDeseados) throws NegocioException;

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
    public List<ResultadosDTO> listarFavoritosPorTipoYFiltro(TipoFavoritoEnum tipo, String filtro, List<String> generosNoDeseados) throws NegocioException;

    /**
     * obtiene un usuario con base a su identificador
     *
     * @param id
     * @return
     * @throws NegocioException
     */
    public UsuarioDominio obtenerUsuarioPorId(ObjectId id) throws NegocioException;

}
