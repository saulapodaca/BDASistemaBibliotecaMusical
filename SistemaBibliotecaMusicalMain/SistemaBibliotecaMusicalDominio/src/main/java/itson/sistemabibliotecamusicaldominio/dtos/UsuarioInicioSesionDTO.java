/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicaldominio.dtos;

/**
 *DTO que se utiliza para guardar el usuario y contraseña(hasheada) de un usuario
 * que inicio sesion
 * @author Camila Zubía
 */
public class UsuarioInicioSesionDTO {
    
    private String usuario;
    private String contraseniaHasheada;
    private char[] contrasenia;

    /**
     * constructor vacio
     */
    public UsuarioInicioSesionDTO() {
    }
    
    /**
     * constructor que inicializa los atributos
     * @param usuario
     * @param contrasenia 
     */
    public UsuarioInicioSesionDTO(String usuario, char[] contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    /**
     * getters y setters
     * @return 
     */
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseniaHasheada() {
        return contraseniaHasheada;
    }

    public void setContraseniaHasheada(String contraseniaHasheada) {
        this.contraseniaHasheada = contraseniaHasheada;
    }

    public char[] getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(char[] contrasenia) {
        this.contrasenia = contrasenia;
    }
}
