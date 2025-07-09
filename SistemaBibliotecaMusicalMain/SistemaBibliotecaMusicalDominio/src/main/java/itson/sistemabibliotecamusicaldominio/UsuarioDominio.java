package itson.sistemabibliotecamusicaldominio;

//@author SAUL ISAAC APODACA BALDENEGRO 00000252020

import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;


public class UsuarioDominio {

    private ObjectId id;
    private String nombreUsuario;
    private String contrasenia;
    private String correo;
    private String imagen;
    private List<FavoritoDominio> favoritos;
    private List<String> generosNoDeseados;

    public UsuarioDominio() {
    }

    public UsuarioDominio(ObjectId id, String nombreUsuario, String contrasenia, String correo, String imagen, List<FavoritoDominio> favoritos, List<String> generosNoDeseados) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.correo = correo;
        this.imagen = imagen;
        this.favoritos = new ArrayList<>();
        this.generosNoDeseados = new ArrayList<>();
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public List<FavoritoDominio> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(List<FavoritoDominio> favoritos) {
        this.favoritos = favoritos;
    }

    public List<String> getGenerosNoDeseados() {
        return generosNoDeseados;
    }

    public void setGenerosNoDeseados(List<String> generosNoDeseados) {
        this.generosNoDeseados = generosNoDeseados;
    }
    
}
