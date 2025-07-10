package itson.sistemabibliotecamusicaldominio.dtos;

//@author SAUL ISAAC APODACA BALDENEGRO 00000252020

/**
 * DTO que se utiliza para registrar un usuario nuevo a la biblioteca musical
 * @author Camila Zubía
 */
public class RegistrarUsuarioDTO {

    private String usuario;
    private String contraseniaHasheada;
    private char[] contrasenia;
    private String correo;
    private String imagen;
    
    /**
     * constructor vacio
     */
    public RegistrarUsuarioDTO() {
    }

    /**
     * constructor que inicializa todos los atributos
     * @param usuario
     * @param contrasenia
     * @param correo
     * @param imagen 
     */
    public RegistrarUsuarioDTO(String usuario, char[] contrasenia, String correo, String imagen) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.correo = correo;
        this.imagen = imagen;
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
}
