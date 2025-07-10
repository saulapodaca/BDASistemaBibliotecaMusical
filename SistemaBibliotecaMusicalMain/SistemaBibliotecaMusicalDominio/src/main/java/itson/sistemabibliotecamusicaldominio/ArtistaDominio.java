/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicaldominio;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *representa a un artista
 * @author Camila Zubía
 */
public class ArtistaDominio {
    
    private ObjectId id;
    private String nombre;
    private String genero;
    private String imagen;
    private boolean esBanda;
    private List<IntegranteDominio> integrantes;
    private List<AlbumDominio> albumes;

    /**
     * constructor vacio
     */
    public ArtistaDominio() {
    }

    /**
     * constructor que inicializa todos los atributos
     * @param id
     * @param nombre
     * @param genero
     * @param imagen
     * @param esBanda
     * @param integrantes
     * @param albumes 
     */
    public ArtistaDominio(ObjectId id, String nombre, String genero, String imagen, boolean esBanda, List<IntegranteDominio> integrantes, List<AlbumDominio> albumes) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.imagen = imagen;
        this.esBanda = esBanda;
        this.integrantes = integrantes;
        this.albumes = albumes;
    }

    /**
     * getters y setters de los atributos
     * @return 
     */
    
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
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

    public List<IntegranteDominio> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<IntegranteDominio> integrantes) {
        this.integrantes = integrantes;
    }

    public List<AlbumDominio> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(List<AlbumDominio> albumes) {
        this.albumes = albumes;
    }
    
}
