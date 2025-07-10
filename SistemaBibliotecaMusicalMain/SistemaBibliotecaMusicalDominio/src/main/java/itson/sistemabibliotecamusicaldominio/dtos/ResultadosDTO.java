/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicaldominio.dtos;

import itson.sistemabibliotecamusicaldominio.TipoFavoritoEnum;

/**
 *DTO que se utiliza para guardar todos los registros (artista, album, cancion)
 * de la base de datos
 * @author Camila Zubía
 */
public class ResultadosDTO {
    
    private TipoFavoritoEnum tipo;
    private Object objeto;

    /**
     * constructor vacio
     */
    public ResultadosDTO() {
    }
    
    /**
     * constructor que inicializa los atributos
     * @param tipo
     * @param objeto 
     */
    public ResultadosDTO(TipoFavoritoEnum tipo, Object objeto) {
        this.tipo = tipo;
        this.objeto = objeto;
    }

    /**
     * getters y setters
     * @return 
     */
    
    public TipoFavoritoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoFavoritoEnum tipo) {
        this.tipo = tipo;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }
}
