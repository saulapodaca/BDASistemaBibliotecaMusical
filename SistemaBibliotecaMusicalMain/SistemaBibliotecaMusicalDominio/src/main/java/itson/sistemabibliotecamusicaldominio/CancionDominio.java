/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicaldominio;

import org.bson.types.ObjectId;

/**
 * representa a una cancion de un album
 * @author Camila Zubía
 */
public class CancionDominio {
    
    private ObjectId id;
    private String nombre;
    private String imagenCancion;

    /**
     * constructor vacio
     */
    public CancionDominio() {
    }

    /**
     * constructor que inicializa todos los atributos
     * @param id
     * @param nombre
     * @param imagenCancion 
     */
    public CancionDominio(ObjectId id, String nombre, String imagenCancion) {
        this.id = id;
        this.nombre = nombre;
        this.imagenCancion = imagenCancion;
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

    public String getImagenCancion() {
        return imagenCancion;
    }

    public void setImagenCancion(String imagenCancion) {
        this.imagenCancion = imagenCancion;
    }    
    
}
