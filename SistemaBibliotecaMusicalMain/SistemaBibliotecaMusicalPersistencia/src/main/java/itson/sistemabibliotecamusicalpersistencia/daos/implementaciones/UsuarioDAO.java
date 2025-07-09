package itson.sistemabibliotecamusicalpersistencia.daos.implementaciones;

//@author SAUL ISAAC APODACA BALDENEGRO 00000252020

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.Updates;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;
import itson.sistemabibliotecamusicaldominio.AlbumDominio;
import itson.sistemabibliotecamusicaldominio.ArtistaDominio;
import itson.sistemabibliotecamusicaldominio.CancionDominio;
import itson.sistemabibliotecamusicaldominio.FavoritoDominio;
import itson.sistemabibliotecamusicaldominio.TipoFavoritoEnum;
import itson.sistemabibliotecamusicaldominio.UsuarioDominio;
import itson.sistemabibliotecamusicaldominio.dtos.ActualizarGenerosUsuarioDTO;
import itson.sistemabibliotecamusicaldominio.dtos.ModificarUsuarioDTO;
import itson.sistemabibliotecamusicaldominio.dtos.RegistrarUsuarioDTO;
import itson.sistemabibliotecamusicaldominio.dtos.ResultadosDTO;
import itson.sistemabibliotecamusicalpersistencia.IConexionBD;
import itson.sistemabibliotecamusicalpersistencia.daos.IArtistaDAO;
import itson.sistemabibliotecamusicalpersistencia.daos.IUsuarioDAO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;


public class UsuarioDAO implements IUsuarioDAO{

    private IArtistaDAO artistaDAO;
    private IConexionBD conexionBD;
    
    public UsuarioDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
        this.artistaDAO = new ArtistaDAO(conexionBD);
    }

    @Override
    public UsuarioDominio obtenerUsuarioPorNombre(String nombreUsuario) throws PersistenciaException {
        try {
            MongoDatabase bd = conexionBD.conexion();
            MongoCollection<UsuarioDominio> collection = bd.getCollection("usuarios", UsuarioDominio.class);

            return collection.find(eq("nombreUsuario", nombreUsuario)).first();
        } catch (Exception ex) {
            throw new PersistenciaException("Error al buscar usuario por nombre: " + ex.getMessage());
        }
    }

    @Override
    public UsuarioDominio obtenerUsuarioPorCorreo(String correo) throws PersistenciaException {
        try {
            MongoDatabase bd = conexionBD.conexion();
            MongoCollection<UsuarioDominio> collection = bd.getCollection("usuarios", UsuarioDominio.class);

            return collection.find(eq("correo", correo)).first();
        } catch (Exception e) {
            throw new PersistenciaException("Error al buscar usuario por correo: " + e.getMessage(), e);
        }
    }

    @Override
    public UsuarioDominio registrarUsuario(RegistrarUsuarioDTO nuevoUsuario) throws PersistenciaException {
        try {
            MongoDatabase bd = conexionBD.conexion();
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
            MongoDatabase bd = conexionBD.conexion();
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
            MongoDatabase bd = conexionBD.conexion();
            MongoCollection<UsuarioDominio> collection
                    = bd.getCollection("usuarios", UsuarioDominio.class);
            Bson filtro = eq("_id", usuarioActualizar.getId());
            Bson actualizacion = Updates.push("generosNoDeseados", usuarioActualizar.getGenerosNoDeseados());
            collection.updateOne(filtro, actualizacion);
            return obtenerUsuarioPorId(usuarioActualizar.getId());
        }catch(PersistenciaException ex){
            throw new PersistenciaException("Error al actualizar géneros no deseados: " + ex.getMessage());
        }
    }

    @Override
    public List<String> obtenerGenerosNoDeseados(ObjectId id) throws PersistenciaException {
        try{
            MongoDatabase bd = conexionBD.conexion();
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
            MongoDatabase bd = conexionBD.conexion();
            MongoCollection<UsuarioDominio> collection
                    = bd.getCollection("usuarios", UsuarioDominio.class);
            return collection.find(eq("_id", id)).first();
        } catch(Exception ex){
            throw new PersistenciaException("Error al obtener usuario por ID: " + ex.getMessage());
        }

    }

    @Override
    public FavoritoDominio agregarFavorito(ObjectId id) throws PersistenciaException {
        try{
            MongoDatabase baseDatos = conexionBD.conexion();
            MongoCollection<FavoritoDominio> coleccion = baseDatos.getCollection("favoritos", FavoritoDominio.class);

            if (coleccion.find(Filters.eq("referenciaFavorito", id)).first() != null) {
                throw new PersistenciaException("Este elemento ya esta en la lista de favoritos.");
            }

            List<ResultadosDTO> resultados = artistaDAO.listarTodo(List.of());
            FavoritoDominio nuevoFavorito = null;

            for (ResultadosDTO r : resultados) {
                switch (r.getTipo()) {
                    case ARTISTA -> {
                        ArtistaDominio a = (ArtistaDominio) r.getObjeto();
                        if (a.getId().equals(id)) {
                            nuevoFavorito = new FavoritoDominio(TipoFavoritoEnum.ARTISTA, a.getId());
                        }
                    }
                    case ALBUM -> {
                        AlbumDominio album = (AlbumDominio) r.getObjeto();
                        if (album.getId().equals(id)) {
                            nuevoFavorito = new FavoritoDominio(TipoFavoritoEnum.ALBUM, album.getId());
                        }
                    }
                    case CANCION -> {
                        CancionDominio cancion = (CancionDominio) r.getObjeto();
                        if (cancion.getId().equals(id)) {
                            nuevoFavorito = new FavoritoDominio(TipoFavoritoEnum.CANCION, cancion.getId());
                        }
                    }
                }

                if (nuevoFavorito != null) {
                    coleccion.insertOne(nuevoFavorito);
                    return nuevoFavorito;
                }
            }

            throw new PersistenciaException("No se encontró ningún elemento con el ID proporcionado.");
        }catch (PersistenciaException e) {
            throw new PersistenciaException("No se pudo agregar a favoritos: " + e.getMessage());
        }
    }


    @Override
    public void eliminarFavorito(ObjectId id) throws PersistenciaException {
        try{
            MongoDatabase baseDatos = conexionBD.conexion();
            MongoCollection<FavoritoDominio> coleccion = baseDatos.getCollection("favoritos", FavoritoDominio.class);
            if (coleccion.find(Filters.eq("referenciaFavorito", id)).first() == null) {
                throw new PersistenciaException("Este elemento no esta en la lista de favoritos.");
            }
            coleccion.deleteOne(Filters.eq("referenciaFavorito", id));
        }catch (PersistenciaException e) {
            throw new PersistenciaException("No se pudo eliminar de favoritos: " + e.getMessage());
        }
    }

    @Override
    public List<ResultadosDTO> listarFavoritos(List<String> generosNoDeseados) throws PersistenciaException {
        try {
            MongoDatabase baseDatos = conexionBD.conexion();
            MongoCollection<FavoritoDominio> coleccion = baseDatos.getCollection("favoritos", FavoritoDominio.class);

            Set<ObjectId> idsFavoritos = coleccion.find()
                    .map(FavoritoDominio::getReferenciaFavorito)
                    .into(new ArrayList<>())
                    .stream()
                    .collect(Collectors.toSet());
            
            List<ResultadosDTO> resultadosTotales = artistaDAO.listarTodo(generosNoDeseados);
            List<ResultadosDTO> resultadosFavoritos = new ArrayList<>();

            for (ResultadosDTO r : resultadosTotales) {
                ObjectId id = switch (r.getTipo()) {
                    case ARTISTA ->
                        ((ArtistaDominio) r.getObjeto()).getId();
                    case ALBUM ->
                        ((AlbumDominio) r.getObjeto()).getId();
                    case CANCION ->
                        ((CancionDominio) r.getObjeto()).getId();
                };

                if (idsFavoritos.contains(id)) {
                    resultadosFavoritos.add(r);
                }
            }
            return resultadosFavoritos;
        } catch (PersistenciaException e) {
            throw new PersistenciaException("No se pudo listar los favoritos: " + e.getMessage());
        }
    }

    @Override
    public List<ResultadosDTO> listarFavoritosPorFiltro(String filtro, List<String> generosNoDeseados) throws PersistenciaException {
        try {
            MongoDatabase baseDatos = conexionBD.conexion();
            MongoCollection<FavoritoDominio> coleccion = baseDatos.getCollection("favoritos", FavoritoDominio.class);

            Set<ObjectId> idsFavoritos = coleccion.find()
                    .map(FavoritoDominio::getReferenciaFavorito)
                    .into(new ArrayList<>())
                    .stream()
                    .collect(Collectors.toSet());

            List<ResultadosDTO> filtrados = artistaDAO.listarTodoPorFiltro(filtro, generosNoDeseados);
            List<ResultadosDTO> resultadosFavoritos = new ArrayList<>();

            for (ResultadosDTO r : filtrados) {
                ObjectId id = switch (r.getTipo()) {
                    case ARTISTA ->
                        ((ArtistaDominio) r.getObjeto()).getId();
                    case ALBUM ->
                        ((AlbumDominio) r.getObjeto()).getId();
                    case CANCION ->
                        ((CancionDominio) r.getObjeto()).getId();
                };

                if (idsFavoritos.contains(id)) {
                    resultadosFavoritos.add(r);
                }
            }

            return resultadosFavoritos;

        } catch (PersistenciaException e) {
            throw new PersistenciaException("No se pudo listar los favoritos filtrados: " + e.getMessage());
        }
    }


    @Override
    public List<ResultadosDTO> listarFavoritosPorTipoYFiltro(TipoFavoritoEnum tipo, String filtro, List<String> generosNoDeseados) throws PersistenciaException {
        try {
            MongoDatabase baseDatos = conexionBD.conexion();
            MongoCollection<FavoritoDominio> favoritosCol = baseDatos.getCollection("favoritos", FavoritoDominio.class);

            Set<ObjectId> idsFavoritos = favoritosCol.find(Filters.eq("tipo", tipo))
                    .map(FavoritoDominio::getReferenciaFavorito)
                    .into(new ArrayList<>())
                    .stream()
                    .collect(Collectors.toSet());

            List<ResultadosDTO> filtrados = artistaDAO.listarTodoPorFiltro(filtro, generosNoDeseados);
            List<ResultadosDTO> favoritosFiltrados = new ArrayList<>();
            
            for (ResultadosDTO r : filtrados) {
                if (!r.getTipo().equals(tipo)) {
                    continue;
                }

                ObjectId id = switch (r.getTipo()) {
                    case ARTISTA ->
                        ((ArtistaDominio) r.getObjeto()).getId();
                    case ALBUM ->
                        ((AlbumDominio) r.getObjeto()).getId();
                    case CANCION ->
                        ((CancionDominio) r.getObjeto()).getId();
                };

                if (idsFavoritos.contains(id)) {
                    favoritosFiltrados.add(r);
                }
            }

            return favoritosFiltrados;

        } catch (PersistenciaException e) {
            throw new PersistenciaException("No se pudo listar los favoritos por tipo y filtro: " + e.getMessage());
        }
    }

    @Override
    public boolean esFavorito(ObjectId id) throws PersistenciaException {
        MongoDatabase baseDatos = conexionBD.conexion();
        MongoCollection<FavoritoDominio> col = baseDatos.getCollection("favoritos", FavoritoDominio.class);
        return col.find(Filters.eq("referenciaFavorito", id)).first() != null;
    }

}
