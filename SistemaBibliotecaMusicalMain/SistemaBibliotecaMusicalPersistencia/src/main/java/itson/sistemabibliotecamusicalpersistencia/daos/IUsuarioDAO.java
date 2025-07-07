package itson.sistemabibliotecamusicalpersistencia.daos;

//@author SAUL ISAAC APODACA BALDENEGRO 00000252020

import itson.sistemabibliotecamusicaldominio.UsuarioDominio;
import itson.sistemabibliotecamusicaldominio.dtos.UsuarioInicioSesionDTO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;




public interface IUsuarioDAO {

    public UsuarioDominio obtenerUsuarioPorNombre(UsuarioInicioSesionDTO usuario) throws PersistenciaException;
}
