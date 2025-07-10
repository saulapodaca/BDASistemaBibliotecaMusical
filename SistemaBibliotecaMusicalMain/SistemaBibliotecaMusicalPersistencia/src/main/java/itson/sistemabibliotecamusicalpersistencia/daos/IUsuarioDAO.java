package itson.sistemabibliotecamusicalpersistencia.daos;

//@author SAUL ISAAC APODACA BALDENEGRO 00000252020

import itson.sistemabibliotecamusicaldominio.FavoritoDominio;
import itson.sistemabibliotecamusicaldominio.TipoFavoritoEnum;
import itson.sistemabibliotecamusicaldominio.UsuarioDominio;
import itson.sistemabibliotecamusicaldominio.dtos.ActualizarGenerosUsuarioDTO;
import itson.sistemabibliotecamusicaldominio.dtos.ModificarUsuarioDTO;
import itson.sistemabibliotecamusicaldominio.dtos.RegistrarUsuarioDTO;
import itson.sistemabibliotecamusicaldominio.dtos.ResultadosDTO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;
import java.util.List;
import org.bson.types.ObjectId;




public interface IUsuarioDAO {

    /**
     * obtiene un usuario en base a su nombre
     * @param nombreUsuario
     * @return
     * @throws PersistenciaException 
     */
    public UsuarioDominio obtenerUsuarioPorNombre(String nombreUsuario) throws PersistenciaException;
    
    /**
     * obtiene un usuario en base a su correo
     * @param correo
     * @return
     * @throws PersistenciaException 
     */
    public UsuarioDominio obtenerUsuarioPorCorreo(String correo) throws PersistenciaException;
    
    /**
     * agrega un usuario nuevo a la base de datos
     * @param nuevoUsuario
     * @return
     * @throws PersistenciaException 
     */
    public UsuarioDominio registrarUsuario(RegistrarUsuarioDTO nuevoUsuario) throws PersistenciaException;
    
    /**
     * modifica los atributos de un usuario que ya este registrado en una base de
     * datos
     * @param usuarioModificado
     * @return
     * @throws PersistenciaException 
     */
    public UsuarioDominio modificarUsuario(ModificarUsuarioDTO usuarioModificado) throws PersistenciaException;
    
    /**
     * actualiza la lista de generos no deseados de un usuario
     * @param usuarioActualizar
     * @return
     * @throws PersistenciaException 
     */
    public UsuarioDominio actualizarGenerosNoDeseados(ActualizarGenerosUsuarioDTO usuarioActualizar) throws PersistenciaException;
    
    /**
     * lista todos los generos no deseados dentro de la lista de generos no 
     * deseados de un usuario
     * @param id
     * @return
     * @throws PersistenciaException 
     */
    public List<String> obtenerGenerosNoDeseados(ObjectId id) throws PersistenciaException;
    
    /**
     * agrega un registro(artista, album, cancion) a la lista de favoritos de un
     * usuario
     * @param id
     * @return
     * @throws PersistenciaException 
     */
    public FavoritoDominio agregarFavorito(ObjectId id) throws PersistenciaException;
    
    /**
     * elimina un registro(artista, album, cancion) a la lista de favoritos de un
     * usuario
     * @param id
     * @throws PersistenciaException 
     */
    public void eliminarFavorito(ObjectId id) throws PersistenciaException;
    
    /**
     * verifica si un registro(artista, album, cancion) esta dentro de la lista
     * de favoritos de un usuario
     * @param id
     * @return
     * @throws PersistenciaException 
     */
    public boolean esFavorito(ObjectId id) throws PersistenciaException;
    
    /**
     * lista todos los registros que estan dentro de la lista de favoritos de un
     * usuario
     * @param generosNoDeseados
     * @return
     * @throws PersistenciaException 
     */
    public List<ResultadosDTO> listarFavoritos(List<String> generosNoDeseados) throws PersistenciaException;
    
    /**
     * lista todos los registros que estan dentro de la lista de favoritos de un
     * usuario si cumplen con el filtro
     * @param filtro
     * @param generosNoDeseados
     * @return
     * @throws PersistenciaException 
     */
    public List<ResultadosDTO> listarFavoritosPorFiltro(String filtro, List<String> generosNoDeseados) throws PersistenciaException;
    
    /**
     * lista todos los registros que estan dentro de la lista de favoritos de un
     * usuario si cumplen con el filtro y que sean de un tipo especifico
     * @param tipo
     * @param filtro
     * @param generosNoDeseados
     * @return
     * @throws PersistenciaException 
     */
    public List<ResultadosDTO> listarFavoritosPorTipoYFiltro(TipoFavoritoEnum tipo, String filtro, List<String> generosNoDeseados) throws PersistenciaException;
    
    /**
     * obtiene un usuario con base a su identificador
     * @param id
     * @return
     * @throws PersistenciaException 
     */
    public UsuarioDominio obtenerUsuarioPorId(ObjectId id) throws PersistenciaException;

}
