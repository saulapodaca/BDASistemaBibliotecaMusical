/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicaldominio.dtos;

/**
 *
 * @author Camila Zubía
 */
public class ResultadosDTO {
    
    public enum Tipo {ARTISTA, ALBUM, CANCION}
    
    private Tipo tipo;
    private Object objeto;

    public ResultadosDTO(Tipo tipo, Object objeto) {
        this.tipo = tipo;
        this.objeto = objeto;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }
}
