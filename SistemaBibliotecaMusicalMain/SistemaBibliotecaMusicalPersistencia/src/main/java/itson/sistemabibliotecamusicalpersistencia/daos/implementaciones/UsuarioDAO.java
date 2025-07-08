package itson.sistemabibliotecamusicalpersistencia.daos.implementaciones;

//@author SAUL ISAAC APODACA BALDENEGRO 00000252020

import itson.sistemabibliotecamusicaldominio.UsuarioDominio;
import itson.sistemabibliotecamusicaldominio.dtos.ActualizarGenerosUsuarioDTO;
import itson.sistemabibliotecamusicaldominio.dtos.ModificarUsuarioDTO;
import itson.sistemabibliotecamusicaldominio.dtos.RegistrarUsuarioDTO;
import itson.sistemabibliotecamusicalpersistencia.daos.IUsuarioDAO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;


public class UsuarioDAO implements IUsuarioDAO{

    //falta conexion
    
    public UsuarioDAO (){
        //falta conexion
    }
    
    @Override
    public UsuarioDominio obtenerUsuarioPorNombre(String nombreUsuario) throws PersistenciaException{
        return new UsuarioDominio();
    }

    @Override
    public UsuarioDominio obtenerUsuarioPorCorreo(String correo) throws PersistenciaException {
        return new UsuarioDominio();
    }

    @Override
    public UsuarioDominio registrarUsuario(RegistrarUsuarioDTO nuevoUsuario) throws PersistenciaException {
        return new UsuarioDominio();
    }

    @Override
    public UsuarioDominio modificarUsuario(ModificarUsuarioDTO usuarioModificado) throws PersistenciaException {
        return new UsuarioDominio();
    }

    @Override
    public UsuarioDominio actualizarGenerosNoDeseados(ActualizarGenerosUsuarioDTO usuarioActualizar) throws PersistenciaException {
        UsuarioDominio usuario = new UsuarioDominio();
        usuario.setId(usuarioActualizar.getId());
        usuario.setGenerosNoDeseados(usuarioActualizar.getGenerosNoDeseados());
        return usuario;
    }

    @Override
    public List<String> obtenerGenerosNoDeseados(ObjectId id) throws PersistenciaException {
        List<String> generos = new ArrayList<>();
        generos.add("Rock");
        generos.add("Trap");
        return generos;
    }

    
    
}
