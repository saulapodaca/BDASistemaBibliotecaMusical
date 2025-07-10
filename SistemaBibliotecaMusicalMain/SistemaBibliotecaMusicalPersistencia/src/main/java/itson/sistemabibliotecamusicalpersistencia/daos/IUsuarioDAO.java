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

    public UsuarioDominio obtenerUsuarioPorNombre(String nombreUsuario) throws PersistenciaException;
    
    public UsuarioDominio obtenerUsuarioPorCorreo(String correo) throws PersistenciaException;
    
    public UsuarioDominio registrarUsuario(RegistrarUsuarioDTO nuevoUsuario) throws PersistenciaException;
    
    public UsuarioDominio modificarUsuario(ModificarUsuarioDTO usuarioModificado) throws PersistenciaException;
    
    public UsuarioDominio actualizarGenerosNoDeseados(ActualizarGenerosUsuarioDTO usuarioActualizar) throws PersistenciaException;
    
    public List<String> obtenerGenerosNoDeseados(ObjectId id) throws PersistenciaException;
    
    public FavoritoDominio agregarFavorito(ObjectId id) throws PersistenciaException;
    
    public void eliminarFavorito(ObjectId id) throws PersistenciaException;
    
    public boolean esFavorito(ObjectId id) throws PersistenciaException;
    
    public List<ResultadosDTO> listarFavoritos(List<String> generosNoDeseados) throws PersistenciaException;
    
    public List<ResultadosDTO> listarFavoritosPorFiltro(String filtro, List<String> generosNoDeseados) throws PersistenciaException;
    
    public List<ResultadosDTO> listarFavoritosPorTipoYFiltro(TipoFavoritoEnum tipo, String filtro, List<String> generosNoDeseados) throws PersistenciaException;
    
    public UsuarioDominio obtenerUsuarioPorId(ObjectId id) throws PersistenciaException;

}
