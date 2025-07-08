package itson.sistemabibliotecamusicaldominio;

//@author SAUL ISAAC APODACA BALDENEGRO 00000252020

import java.util.Date;
import org.bson.types.ObjectId;


public class FavoritoDominio {
    private TipoFavoritoEnum tipo;
    private ObjectId referenciaFavorito;
    private Date fechaAgregado;

    public FavoritoDominio(TipoFavoritoEnum tipo, ObjectId referenciaFavorito, Date fechaAgregado) {
        this.tipo = tipo;
        this.referenciaFavorito = referenciaFavorito;
        this.fechaAgregado = fechaAgregado;
    }

    public FavoritoDominio() {
    }

    public TipoFavoritoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoFavoritoEnum tipo) {
        this.tipo = tipo;
    }

    public ObjectId getReferenciaFavorito() {
        return referenciaFavorito;
    }

    public void setReferenciaFavorito(ObjectId referenciaFavorito) {
        this.referenciaFavorito = referenciaFavorito;
    }

    public Date getFechaAgregado() {
        return fechaAgregado;
    }

    public void setFechaAgregado(Date fechaAgregado) {
        this.fechaAgregado = fechaAgregado;
    }
    
}
