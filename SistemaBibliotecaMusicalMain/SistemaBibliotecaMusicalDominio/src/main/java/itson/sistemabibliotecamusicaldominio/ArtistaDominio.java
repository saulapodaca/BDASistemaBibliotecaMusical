/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicaldominio;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Camila Zubía
 */
public class ArtistaDominio {
    
    private ObjectId id;
    private String nombre;
    private String genero;
    private String imagen;
    private boolean esBanda;
    private List<IntegrantesDominio> integrantes;
    private List<AlbumDominio> albumes;

    public ArtistaDominio() {
    }

    public ArtistaDominio(String nombre, String genero, String imagen, boolean esBanda, List<IntegrantesDominio> integrantes, List<AlbumDominio> albumes) {
        this.id = new ObjectId();
        this.nombre = nombre;
        this.genero = genero;
        this.imagen = imagen;
        this.esBanda = esBanda;
        this.integrantes = integrantes;
        this.albumes = albumes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public boolean isEsBanda() {
        return esBanda;
    }

    public void setEsBanda(boolean esBanda) {
        this.esBanda = esBanda;
    }

    public List<IntegrantesDominio> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<IntegrantesDominio> integrantes) {
        this.integrantes = integrantes;
    }

    public List<AlbumDominio> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(List<AlbumDominio> albumes) {
        this.albumes = albumes;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
    
    
}
