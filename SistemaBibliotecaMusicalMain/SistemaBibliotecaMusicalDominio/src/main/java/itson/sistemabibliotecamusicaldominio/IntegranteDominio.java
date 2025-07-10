/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicaldominio;

import java.time.LocalDate;

/**
 *representa a un integrante de una banda (artista)
 * @author Camila Zubía
 */
public class IntegranteDominio {
    
    private String nombre;
    private String rol;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;
    private boolean activo;

    /**
     * constructor vacio
     */
    public IntegranteDominio() {
    }
    
    /**
     * constructor que inicializa todos los atributos
     * @param nombre
     * @param rol
     * @param fechaIngreso
     * @param activo 
     */
    public IntegranteDominio(String nombre, String rol, LocalDate fechaIngreso, boolean activo) {
        this.nombre = nombre;
        this.rol = rol;
        this.fechaIngreso = fechaIngreso;
        this.activo = activo;
    }

    /**
     * getters y setters de los atributos
     * @return
     */
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getInstrumento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
