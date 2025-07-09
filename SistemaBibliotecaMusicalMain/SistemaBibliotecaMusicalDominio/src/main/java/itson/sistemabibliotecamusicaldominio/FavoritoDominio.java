package itson.sistemabibliotecamusicaldominio;

//@author SAUL ISAAC APODACA BALDENEGRO 00000252020

import java.util.Date;
import org.bson.types.ObjectId;


public class FavoritoDominio {
    private ObjectId id;
    private TipoFavoritoEnum tipo;
    private ObjectId referenciaFavorito;
    private Date fechaAgregado;

    public FavoritoDominio(TipoFavoritoEnum tipo, ObjectId referenciaFavorito) {
        this.id = new ObjectId();
        this.tipo = tipo;
        this.referenciaFavorito = referenciaFavorito;
        this.fechaAgregado = new Date();
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

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
}
