/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicaldominio.dtos;

import itson.sistemabibliotecamusicaldominio.TipoFavoritoEnum;

/**
 *
 * @author Camila Zubía
 */
public class ResultadosDTO {
    
    private TipoFavoritoEnum tipo;
    private Object objeto;

    public ResultadosDTO(TipoFavoritoEnum tipo, Object objeto) {
        this.tipo = tipo;
        this.objeto = objeto;
    }

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
