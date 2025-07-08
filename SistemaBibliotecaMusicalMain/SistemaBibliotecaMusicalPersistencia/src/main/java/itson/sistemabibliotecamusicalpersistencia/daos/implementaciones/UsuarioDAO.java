package itson.sistemabibliotecamusicalpersistencia.daos.implementaciones;

//@author SAUL ISAAC APODACA BALDENEGRO 00000252020

import itson.sistemabibliotecamusicaldominio.UsuarioDominio;
import itson.sistemabibliotecamusicaldominio.dtos.RegistrarUsuarioDTO;
import itson.sistemabibliotecamusicalpersistencia.daos.IUsuarioDAO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;


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

    
}
