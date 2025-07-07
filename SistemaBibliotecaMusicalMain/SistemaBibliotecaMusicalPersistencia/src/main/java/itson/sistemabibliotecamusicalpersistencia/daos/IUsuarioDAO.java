package itson.sistemabibliotecamusicalpersistencia.daos;

//@author SAUL ISAAC APODACA BALDENEGRO 00000252020

import itson.sistemabibliotecamusicaldominio.UsuarioDominio;
import itson.sistemabibliotecamusicaldominio.dtos.UsuarioRegistradoDTO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;




public interface IUsuarioDAO {

    public UsuarioDominio obtenerUsuarioPorNombre(UsuarioRegistradoDTO usuario) throws PersistenciaException;
}
