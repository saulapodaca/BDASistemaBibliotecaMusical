package itson.sistemabibliotecamusicalpersistencia.daos.implementaciones;

//@author SAUL ISAAC APODACA BALDENEGRO 00000252020

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.Updates;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;
import itson.sistemabibliotecamusicaldominio.UsuarioDominio;
import itson.sistemabibliotecamusicaldominio.dtos.ActualizarGenerosUsuarioDTO;
import itson.sistemabibliotecamusicaldominio.dtos.ModificarUsuarioDTO;
import itson.sistemabibliotecamusicaldominio.dtos.RegistrarUsuarioDTO;
import itson.sistemabibliotecamusicalpersistencia.daos.IUsuarioDAO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.List;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;


public class UsuarioDAO implements IUsuarioDAO{

    //falta conexion
    
    public UsuarioDAO() {
        //falta conexion
    }

    @Override
    public UsuarioDominio obtenerUsuarioPorNombre(String nombreUsuario) throws PersistenciaException {
        try {
            MongoDatabase bd = new ConexionBD().conexion();
            MongoCollection<UsuarioDominio> collection = bd.getCollection("usuarios", UsuarioDominio.class);

            return collection.find(eq("nombreUsuario", nombreUsuario)).first();
        } catch (Exception ex) {
            throw new PersistenciaException("Error al buscar usuario por nombre: " + ex.getMessage());
        }
    }

    @Override
    public UsuarioDominio obtenerUsuarioPorCorreo(String correo) throws PersistenciaException {
        try {
            MongoDatabase bd = new ConexionBD().conexion();
            MongoCollection<UsuarioDominio> collection = bd.getCollection("usuarios", UsuarioDominio.class);

            return collection.find(eq("correo", correo)).first();
        } catch (Exception e) {
            throw new PersistenciaException("Error al buscar usuario por correo: " + e.getMessage(), e);
        }
    }

    @Override
    public UsuarioDominio registrarUsuario(RegistrarUsuarioDTO nuevoUsuario) throws PersistenciaException {
        try {
            MongoDatabase bd = new ConexionBD().conexion();
            MongoCollection<UsuarioDominio> collection = 
                    bd.getCollection("usuarios", UsuarioDominio.class);
            UsuarioDominio usuario = new UsuarioDominio();
            usuario.setId(new ObjectId());
            usuario.setNombreUsuario(nuevoUsuario.getUsuario());
            usuario.setCorreo(nuevoUsuario.getCorreo());
            usuario.setContrasenia(nuevoUsuario.getContraseniaHasheada());
            usuario.setImagen(nuevoUsuario.getImagen());
            //listas vacias al crearlo
            usuario.setFavoritos(new ArrayList<>());
            usuario.setGenerosNoDeseados(new ArrayList<>());

            collection.insertOne(usuario);
            return usuario;
        } catch (Exception ex) {
            throw new PersistenciaException("Error al registrar el usuario: " + ex.getMessage());
        }
    }

    @Override
    public UsuarioDominio modificarUsuario(ModificarUsuarioDTO usuarioModificado) throws PersistenciaException {
        try{
            MongoDatabase bd = new ConexionBD().conexion();
            MongoCollection<UsuarioDominio> collection = 
                    bd.getCollection("usuarios", UsuarioDominio.class);
            
            Bson filtro = eq("_id", usuarioModificado.getId());
            Bson actualizacion = combine(
                    set("nombreUsuario", usuarioModificado.getNombre()),
                    set("correo", usuarioModificado.getCorreo()),
                    set("imagen", usuarioModificado.getImagen())
            );
            
            collection.updateOne(filtro, actualizacion);
            return obtenerUsuarioPorId(usuarioModificado.getId());
        }catch(PersistenciaException ex){
            throw new PersistenciaException("Error al modificar el usuario: " + ex.getMessage());
        }
    }

    @Override
    public UsuarioDominio actualizarGenerosNoDeseados(ActualizarGenerosUsuarioDTO usuarioActualizar) throws PersistenciaException {
        try{
            MongoDatabase bd = new ConexionBD().conexion();
            MongoCollection<UsuarioDominio> collection
                    = bd.getCollection("usuarios", UsuarioDominio.class);
            Bson filtro = eq("_id", usuarioActualizar.getId());
            Bson actualizacion = Updates.push("generosNoDeseados", usuarioActualizar.getGenerosNoDeseados());
            collection.updateOne(filtro, actualizacion);
            return obtenerUsuarioPorId(usuarioActualizar.getId());
        }catch(Exception ex){
            throw new PersistenciaException("Error al actualizar géneros no deseados: " + ex.getMessage());
        }
    }

    @Override
    public List<String> obtenerGenerosNoDeseados(ObjectId id) throws PersistenciaException {
        try{
            MongoDatabase bd = new ConexionBD().conexion();
            MongoCollection<UsuarioDominio> collection
                    = bd.getCollection("usuarios", UsuarioDominio.class);
            Bson filtro = eq("_id", id);
            
            UsuarioDominio usuario = collection.find(filtro).first();
            return (usuario != null && usuario.getGenerosNoDeseados() != null)
                ? usuario.getGenerosNoDeseados()
                : new ArrayList<>();
            
        } catch (Exception ex){
            throw new PersistenciaException("Error al obtener géneros no deseados: " + ex.getMessage());
        }
    }

    public UsuarioDominio obtenerUsuarioPorId(ObjectId id) throws PersistenciaException {
        try {
            MongoDatabase bd = new ConexionBD().conexion();
            MongoCollection<UsuarioDominio> collection
                    = bd.getCollection("usuarios", UsuarioDominio.class);
            return collection.find(eq("_id", id)).first();
        } catch(Exception ex){
            throw new PersistenciaException("Error al obtener usuario por ID: " + ex.getMessage());
        }

    }

}
