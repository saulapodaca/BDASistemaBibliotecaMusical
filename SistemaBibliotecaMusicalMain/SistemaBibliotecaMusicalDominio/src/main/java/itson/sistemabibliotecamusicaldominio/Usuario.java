package itson.sistemabibliotecamusicaldominio;

//@author SAUL ISAAC APODACA BALDENEGRO 00000252020

public class Usuario {

    private String nombreUsuario;
    private String contrasenia;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String contrasenia) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
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
    
}
