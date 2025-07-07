/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalnegocio.implementaciones;

import itson.sistemabibliotecamusicaldominio.UsuarioDominio;
import itson.sistemabibliotecamusicaldominio.dtos.UsuarioInicioSesionDTO;
import itson.sistemabibliotecamusicalnegocio.IUsuarioNegocio;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import itson.sistemabibliotecamusicalpersistencia.daos.IUsuarioDAO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;
import java.util.Arrays;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Camila Zubía
 */
public class UsuarioNegocio implements IUsuarioNegocio{

    private IUsuarioDAO usuarioDAO;
    
    public UsuarioNegocio(IUsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    @Override
    public UsuarioDominio obtenerUsuarioPorNombre(UsuarioInicioSesionDTO usuario) throws NegocioException{
         try{
            UsuarioDominio usuarioRegistrado =  usuarioDAO.obtenerUsuarioPorNombre(usuario);
            if (usuarioRegistrado == null)
                return null;
            encriptarContrasena(usuario);
            boolean contrasenaValida = BCrypt.checkpw(
                    usuario.getContraseniaHasheada(), usuarioRegistrado.getContrasenia());
            return contrasenaValida ? usuarioRegistrado : null;
        }catch(PersistenciaException ex){
            throw new NegocioException(ex.getMessage());
        }
        
    }

    private String encriptarContrasena(UsuarioInicioSesionDTO usuarioInicioSesionDTO) throws NegocioException{
        try {
            String textoPlano = new String(usuarioInicioSesionDTO.getContrasenia());
            String hash = BCrypt.hashpw(textoPlano, BCrypt.gensalt());
            if (usuarioInicioSesionDTO.getContrasenia() != null) {
                Arrays.fill(usuarioInicioSesionDTO.getContrasenia(), '\0');
            }
            return hash;
        } catch (Exception ex) {
            throw new NegocioException();
        }

    }
}
