package itson.sistemabibliotecamusicalpersistencia.daos;

//@author SAUL ISAAC APODACA BALDENEGRO 00000252020

import itson.sistemabibliotecamusicaldominio.UsuarioDominio;
import itson.sistemabibliotecamusicaldominio.dtos.ModificarUsuarioDTO;
import itson.sistemabibliotecamusicaldominio.dtos.RegistrarUsuarioDTO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;




public interface IUsuarioDAO {

    public UsuarioDominio obtenerUsuarioPorNombre(String nombreUsuario) throws PersistenciaException;
    
    public UsuarioDominio obtenerUsuarioPorCorreo(String correo) throws PersistenciaException;
    
    public UsuarioDominio registrarUsuario(RegistrarUsuarioDTO nuevoUsuario) throws PersistenciaException;
    
    public UsuarioDominio modificarUsuario(ModificarUsuarioDTO usuarioModificado) throws PersistenciaException;
}
