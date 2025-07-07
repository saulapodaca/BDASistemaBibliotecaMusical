package itson.sistemabibliotecamusicaldominio;

//@author SAUL ISAAC APODACA BALDENEGRO 00000252020

import java.util.ArrayList;
import java.util.List;


public class UsuarioDominio {

    //private ObjectId id;
    private String nombreUsuario;
    private String contrasenia;
    private String correo;
    private String imagen;
    private List<ArtistaDominio> artistasFavoritos;
    private List<AlbumDominio> albumesFavoritos;
    private List<CancionDominio> cancionesFavoritos;
    private List<String> generosNoDeseados;

    public UsuarioDominio() {
    }

    public UsuarioDominio(String nombreUsuario, String contrasenia, String correo, String imagen) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.correo = correo;
        this.imagen = imagen;
        this.artistasFavoritos = new ArrayList<>();
        this.albumesFavoritos = new ArrayList<>();
        this.cancionesFavoritos = new ArrayList<>();
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

    public List<ArtistaDominio> getArtistasFavoritos() {
        return artistasFavoritos;
    }

    public void setArtistasFavoritos(List<ArtistaDominio> artistasFavoritos) {
        this.artistasFavoritos = artistasFavoritos;
    }

    public List<AlbumDominio> getAlbumesFavoritos() {
        return albumesFavoritos;
    }

    public void setAlbumesFavoritos(List<AlbumDominio> albumesFavoritos) {
        this.albumesFavoritos = albumesFavoritos;
    }

    public List<CancionDominio> getCancionesFavoritos() {
        return cancionesFavoritos;
    }

    public void setCancionesFavoritos(List<CancionDominio> cancionesFavoritos) {
        this.cancionesFavoritos = cancionesFavoritos;
    }

    public List<String> getGenerosNoDeseados() {
        return generosNoDeseados;
    }

    public void setGenerosNoDeseados(List<String> generosNoDeseados) {
        this.generosNoDeseados = generosNoDeseados;
    }
    
    
}
