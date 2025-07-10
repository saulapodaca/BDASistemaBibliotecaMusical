package itson.sistemabibliotecamusicaldominio;

//@author SAUL ISAAC APODACA BALDENEGRO 00000252020

import java.util.Date;
import org.bson.types.ObjectId;

/**
 * representa un objeto(artista, cancion, album) que el usuario agrego a su lista
 * de favoritos
 * @author Camila Zubía
 */
public class FavoritoDominio {
    private TipoFavoritoEnum tipo;
    private ObjectId referenciaFavorito;
    private Date fechaAgregado;

    /**
     * constructor vacio
     */
    public FavoritoDominio() {
    }

    /**
     * constructor que inicializa todos los atributos
     * @param tipo
     * @param referenciaFavorito 
     */
    public FavoritoDominio(TipoFavoritoEnum tipo, ObjectId referenciaFavorito) {
        this.tipo = tipo;
        this.referenciaFavorito = referenciaFavorito;
        this.fechaAgregado = new Date();
    }
    
    /**
     * getters y setters de los atributos
     * @return
     */
    
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
