/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicaldominio;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Camila Zubía
 */
public class AlbumDominio {
    
    //private ObjectId id;
    private String nombre;
    private LocalDate fechaLanzamiento;
    private String generoMusical;
    private String imagenPortada;
    private List<String> canciones;

    public AlbumDominio(String nombre, LocalDate fechaLanzamiento, String generoMusical, String imagenPortada, List<String> canciones) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.generoMusical = generoMusical;
        this.imagenPortada = imagenPortada;
        this.canciones = canciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
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

    public List<String> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<String> canciones) {
        this.canciones = canciones;
    }

    
}
