package itson.sistemabibliotecamusicalpersistencia.daos.implementaciones;

//@author SAUL ISAAC APODACA BALDENEGRO 00000252020

import itson.sistemabibliotecamusicaldominio.UsuarioDominio;
import itson.sistemabibliotecamusicaldominio.dtos.UsuarioInicioSesionDTO;
import itson.sistemabibliotecamusicalpersistencia.daos.IUsuarioDAO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;


public class UsuarioDAO implements IUsuarioDAO{

    //falta conexion
    
    public UsuarioDAO (){
        //falta conexion
    }
    
    @Override
    public UsuarioDominio obtenerUsuarioPorNombre(UsuarioInicioSesionDTO usuario) throws PersistenciaException{
        return new UsuarioDominio();
    }

    
}
