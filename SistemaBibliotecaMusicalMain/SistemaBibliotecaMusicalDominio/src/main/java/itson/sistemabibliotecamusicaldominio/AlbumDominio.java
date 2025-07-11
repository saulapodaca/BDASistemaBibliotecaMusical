/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicaldominio;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *representa un el album de un artista
 * @author Camila Zubía
 */
public class AlbumDominio {
    
    private ObjectId id;
    private String nombre;
    private String fechaLanzamiento;
    private String generoMusical;
    private String imagenPortada;
    private List<CancionDominio> canciones;

    /**
     * constructor vacio
     */
    public AlbumDominio() {
    }

    /**
     * constructor que inicializa todos los atributos
     * @param id
     * @param nombre
     * @param fechaLanzamiento
     * @param generoMusical
     * @param imagenPortada
     * @param canciones 
     */
    public AlbumDominio(ObjectId id, String nombre, String fechaLanzamiento, String generoMusical, String imagenPortada, List<CancionDominio> canciones) {
        this.id = id;
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.generoMusical = generoMusical;
        this.imagenPortada = imagenPortada;
        this.canciones = canciones;
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

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public String getImagenPortada() {
        return imagenPortada;
    }

    public void setImagenPortada(String imagenPortada) {
        this.imagenPortada = imagenPortada;
    }

    public List<CancionDominio> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<CancionDominio> canciones) {
        this.canciones = canciones;
    }

}
