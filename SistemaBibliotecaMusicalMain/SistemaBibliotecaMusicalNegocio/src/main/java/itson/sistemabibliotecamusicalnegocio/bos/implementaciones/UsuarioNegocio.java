/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.bos.implementaciones;

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
import itson.sistemabibliotecamusicalpersistencia.daos.IUsuarioDAO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;
import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import org.bson.types.ObjectId;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Camila Zubía
 */
public class UsuarioNegocio implements IUsuarioNegocio {

    private final String PATRON_CORREO = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    private IUsuarioDAO usuarioDAO;

    public UsuarioNegocio(IUsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    @Override
    public UsuarioDominio obtenerUsuarioPorNombre(UsuarioInicioSesionDTO usuario) throws NegocioException {
        try {
            UsuarioDominio usuarioRegistrado = usuarioDAO.obtenerUsuarioPorNombre(usuario.getUsuario());
            if (usuarioRegistrado == null) {
                return null;
            }
            String contraseñaPlano = new String (usuario.getContrasenia());
            boolean contrasenaValida = BCrypt.checkpw(
                    contraseñaPlano, usuarioRegistrado.getContrasenia());
            System.out.println(contrasenaValida);
            return contrasenaValida ? usuarioRegistrado : null;
        } catch (PersistenciaException ex) {
            throw new NegocioException(ex.getMessage());
        }

    }

    @Override
    public UsuarioDominio registrarUsuario(RegistrarUsuarioDTO nuevoUsuario) throws NegocioException {
        try{
            validarNuevoUsuario(nuevoUsuario);
            String contraseñaPlano = new String (nuevoUsuario.getContrasenia());
            nuevoUsuario.setContraseniaHasheada(
                    encriptarContrasena(contraseñaPlano));
            if (nuevoUsuario.getContrasenia() != null) {
                Arrays.fill(nuevoUsuario.getContrasenia(), '\0');
            }
            return usuarioDAO.registrarUsuario(nuevoUsuario);
        } catch (PersistenciaException ex){
            throw new NegocioException("Ocurrió un error al registrar al usuario.");
        }
    }
    
    @Override
    public UsuarioDominio modificarUsuario(ModificarUsuarioDTO usuarioModificado) throws NegocioException {
        try{
            validarModificarUsuario(usuarioModificado);
            return usuarioDAO.modificarUsuario(usuarioModificado);
        }catch(PersistenciaException ex){
            throw new NegocioException("Error al modificar el usuario");
        }
    }

    private String encriptarContrasena(String textoPlano) throws NegocioException {
        String hash = BCrypt.hashpw(textoPlano, BCrypt.gensalt());
        return hash;
    }
    
    private void validarNuevoUsuario(RegistrarUsuarioDTO nuevoUsuario) throws NegocioException, PersistenciaException{
        validarNombreUsuarioNoVacio(nuevoUsuario.getUsuario());
        validarCorreoNoVacio(nuevoUsuario.getCorreo());
        validarFormatoCorreo(nuevoUsuario.getCorreo());
        validarNombreUsuarioNoDuplicado(nuevoUsuario);
        validarCorreoNoDuplicado(nuevoUsuario);
        validarContrasenia(nuevoUsuario);
        nuevoUsuario.setImagen(validarFotoPerfil(nuevoUsuario.getImagen()));
    }

    private void validarNombreUsuarioNoDuplicado(RegistrarUsuarioDTO nuevoUsuario) throws NegocioException, PersistenciaException {
        if (usuarioDAO.obtenerUsuarioPorNombre(nuevoUsuario.getUsuario()) != null) {
            throw new NegocioException("Ya se encuentra un usuario registrado con ese nombre.");
        }
    }

    private void validarCorreoNoDuplicado(RegistrarUsuarioDTO nuevoUsuario) throws NegocioException, PersistenciaException {
        if (usuarioDAO.obtenerUsuarioPorCorreo(nuevoUsuario.getCorreo()) != null) {
            throw new NegocioException("Ya se encuentra un usuario con el mismo correo registrado.");
        }
    }

    private void validarContrasenia(RegistrarUsuarioDTO nuevoUsuario) throws NegocioException {
        if (nuevoUsuario.getContrasenia() == null) {
            throw new NegocioException("La contraseña no puede ser nula.");
        }
        if (nuevoUsuario.getContrasenia().length < 6) {
            throw new NegocioException("La contraseña debe tener al menos 6 caracteres.");
        }
        boolean contieneNumero = new String(nuevoUsuario.getContrasenia()).matches(".*\\d.*");
        if (!contieneNumero) {
            throw new NegocioException("La contraseña debe contener al menos un número.");
        }
    }

    private void validarNombreUsuarioNoVacio(String nombre) throws NegocioException {
        if (nombre == null || nombre.isBlank()) {
            throw new NegocioException("El nombre de usuario no puede estar vacío.");
        }
    }

    private void validarCorreoNoVacio(String correo) throws NegocioException {
        if (correo == null || correo.isBlank()) {
            throw new NegocioException("El correo electrónico no puede estar vacío.");
        }
    }
  
    private void validarFormatoCorreo(String correo) throws NegocioException {
        if (!correo.matches(PATRON_CORREO)) {
            throw new NegocioException("El correo electrónico no tiene un formato válido.");
        }
    }
    
    private String validarFotoPerfil(String imagen) throws NegocioException {
        if (imagen == null || imagen.trim().isEmpty()) {
            return "src\\main\\resources\\imagenPerfilDefault.png";
        } else {
            File archivo = new File(imagen.trim());
            if (!archivo.exists()) {
                throw new NegocioException("La imagen seleccionada no existe");
            }
            return imagen.trim();
        }
    }

    private void validarModificarUsuario(ModificarUsuarioDTO usuarioModificado) throws NegocioException, PersistenciaException{
        validarNombreUsuarioNoVacio(usuarioModificado.getNombre());
        validarCorreoNoVacio(usuarioModificado.getCorreo());
        validarFormatoCorreo(usuarioModificado.getCorreo());
        usuarioModificado.setImagen(validarFotoPerfil(usuarioModificado.getImagen()));
        validarNuevoNombre(usuarioModificado);
        validarNuevoCorreo(usuarioModificado);
    }
    
    
    private void validarNuevoNombre(ModificarUsuarioDTO usuarioModificado) throws PersistenciaException, NegocioException{
        UsuarioDominio usuarioExistente = usuarioDAO.obtenerUsuarioPorNombre(
                usuarioModificado.getNombre());
        if(usuarioExistente != null && 
                !usuarioExistente.getId().equals(usuarioModificado.getId())){
            throw new NegocioException("Ya existe otro usuario con ese nombre.");
        }
    }
    
    private void validarNuevoCorreo(ModificarUsuarioDTO usuarioModificado) throws NegocioException, PersistenciaException{
        UsuarioDominio usuarioExistente = usuarioDAO.obtenerUsuarioPorCorreo(usuarioModificado.getCorreo());
        if(usuarioExistente != null &&
                !usuarioExistente.getId().equals(usuarioModificado.getId())){
            throw new NegocioException("Ya existe otro usuario con el mismo correo.");
        }
    }

    @Override
    public UsuarioDominio actualizarGenerosNoDeseados(ActualizarGenerosUsuarioDTO usuarioActualizar) throws NegocioException {
        try{
            return usuarioDAO.actualizarGenerosNoDeseados(usuarioActualizar);
        }catch(PersistenciaException ex){
            throw new NegocioException(ex.getMessage());
        }
    }

    @Override
    public List<String> obtenerGenerosNoDeseados(UsuarioDominio usuarioDominio) throws NegocioException {
        try{
            return usuarioDAO.obtenerGenerosNoDeseados(usuarioDominio.getId());
        }catch(PersistenciaException ex){
            throw new NegocioException(ex.getMessage());
        }
    }

    @Override
    public FavoritoDominio agregarFavorito(ObjectId id) throws NegocioException {
        try {
            return usuarioDAO.agregarFavorito(id);
        } catch (PersistenciaException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    @Override
    public void eliminarFavorito(ObjectId id) throws NegocioException {
        try {
            usuarioDAO.eliminarFavorito(id);
        } catch (PersistenciaException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    @Override
    public boolean esFavorito(ObjectId id) throws NegocioException {
        try {
            return usuarioDAO.esFavorito(id);
        } catch (PersistenciaException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    @Override
    public List<ResultadosDTO> listarFavoritos(List<String> generosNoDeseados) throws NegocioException {
        try {
            return usuarioDAO.listarFavoritos(generosNoDeseados);
        } catch (PersistenciaException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    @Override
    public List<ResultadosDTO> listarFavoritosPorFiltro(String filtro, List<String> generosNoDeseados) throws NegocioException {
        try {
            return usuarioDAO.listarFavoritosPorFiltro(filtro, generosNoDeseados);
        } catch (PersistenciaException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

    @Override
    public List<ResultadosDTO> listarFavoritosPorTipoYFiltro(TipoFavoritoEnum tipo, String filtro, List<String> generosNoDeseados) throws NegocioException {
        try {
            return usuarioDAO.listarFavoritosPorFiltro(filtro, generosNoDeseados);
        } catch (PersistenciaException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }
}
