/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.bos.implementaciones;

import itson.sistemabibliotecamusicaldominio.UsuarioDominio;
import itson.sistemabibliotecamusicaldominio.dtos.RegistrarUsuarioDTO;
import itson.sistemabibliotecamusicaldominio.dtos.UsuarioInicioSesionDTO;
import itson.sistemabibliotecamusicalnegocio.bos.IUsuarioNegocio;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import itson.sistemabibliotecamusicalpersistencia.daos.IUsuarioDAO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;
import java.io.File;
import java.util.Arrays;
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
            boolean contrasenaValida = BCrypt.checkpw(
                    usuario.getContrasenia().toString(), usuarioRegistrado.getContrasenia());
            return contrasenaValida ? usuarioRegistrado : null;
        } catch (PersistenciaException ex) {
            throw new NegocioException(ex.getMessage());
        }

    }

    
    @Override
    public UsuarioDominio registrarUsuario(RegistrarUsuarioDTO nuevoUsuario) throws NegocioException {
        try{
            validarNuevoUsuario(nuevoUsuario);
            nuevoUsuario.setContraseniaHasheada(
                    encriptarContrasena(nuevoUsuario.getContrasenia().toString()));
            if (nuevoUsuario.getContrasenia() != null) {
                Arrays.fill(nuevoUsuario.getContrasenia(), '\0');
            }
            return usuarioDAO.registrarUsuario(nuevoUsuario);
        } catch (PersistenciaException ex){
            throw new NegocioException("Ocurrió un error al registrar al usuario.");
        }
    }

    private String encriptarContrasena(String textoPlano) throws NegocioException {
        try {
            String hash = BCrypt.hashpw(textoPlano, BCrypt.gensalt());
            return hash;
        } catch (Exception ex) {
            throw new NegocioException("Error al encriptar la contraseña.");
        }
    }
    
    private void validarNuevoUsuario(RegistrarUsuarioDTO nuevoUsuario) throws NegocioException, PersistenciaException{
        validarNombreUsuarioNoVacio(nuevoUsuario);
        validarCorreoNoVacio(nuevoUsuario);
        validarFormatoCorreo(nuevoUsuario);
        validarNombreUsuarioNoDuplicado(nuevoUsuario);
        validarCorreoNoDuplicado(nuevoUsuario);
        validarContrasenia(nuevoUsuario);
        validarFotoPerfil(nuevoUsuario);
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

    private void validarNombreUsuarioNoVacio(RegistrarUsuarioDTO nuevoUsuario) throws NegocioException {
        if (nuevoUsuario.getUsuario() == null || nuevoUsuario.getUsuario().isBlank()) {
            throw new NegocioException("El nombre de usuario no puede estar vacío.");
        }
    }

    private void validarCorreoNoVacio(RegistrarUsuarioDTO nuevoUsuario) throws NegocioException {
        if (nuevoUsuario.getCorreo() == null || nuevoUsuario.getCorreo().isBlank()) {
            throw new NegocioException("El correo electrónico no puede estar vacío.");
        }
    }
  
    private void validarFormatoCorreo(RegistrarUsuarioDTO nuevoUsuario) throws NegocioException {
        if (!nuevoUsuario.getCorreo().matches(PATRON_CORREO)) {
            throw new NegocioException("El correo electrónico no tiene un formato válido.");
        }
    }
    
    private void validarFotoPerfil(RegistrarUsuarioDTO nuevoUsuario) throws NegocioException {
        if (nuevoUsuario.getImagen() == null || nuevoUsuario.getImagen().trim().isEmpty()) {
            return;
        } else {
            File archivo = new File(nuevoUsuario.getImagen().trim());
            if (!archivo.exists()) {
                throw new NegocioException("La imagen seleccionada no existe");
            }
        }
    }
}
