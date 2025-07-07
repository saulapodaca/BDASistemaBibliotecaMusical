package itson.sistemabibliotecamusicalpresentacion.utilidades;

//@author SAUL ISAAC APODACA BALDENEGRO 00000252020

import itson.sistemabibliotecamusicaldominio.UsuarioDominio;


public class SesionUsuario {

    private static UsuarioDominio usuarioActual;

    public static void iniciarSesion(UsuarioDominio usuario) {
        SesionUsuario.usuarioActual = usuario;
    }

    public static UsuarioDominio getUsuario() {
        return usuarioActual;
    }

    public static void cerrarSesion() {
        usuarioActual = null;
    }

    public static boolean haySesionActiva() {
        return usuarioActual != null;
    }
}
