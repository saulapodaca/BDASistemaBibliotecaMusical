package itson.sistemabibliotecamusicaldominio.dtos;

//@author SAUL ISAAC APODACA BALDENEGRO 00000252020

public class UsuarioRegistradoDTO {

    private String usuario;
    private String contraseniaHasheada;
    private char[] contrasenia;

    public UsuarioRegistradoDTO() {
    }

    public UsuarioRegistradoDTO(String usuario, String contraseniaHasheada) {
        this.usuario = usuario;
        this.contraseniaHasheada = contraseniaHasheada;
    }

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
