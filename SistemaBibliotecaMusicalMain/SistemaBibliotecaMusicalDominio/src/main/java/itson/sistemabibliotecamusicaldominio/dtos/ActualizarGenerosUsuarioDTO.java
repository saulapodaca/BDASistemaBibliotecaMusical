package itson.sistemabibliotecamusicaldominio.dtos;

//@author SAUL ISAAC APODACA BALDENEGRO 00000252020

import java.util.List;
import org.bson.types.ObjectId;

/**
 *  DTO que se utiliza para actualizar los generos musicales NO deseados por el
 * usuario
 * @author Camila Zubía
 */
public class ActualizarGenerosUsuarioDTO {
    private ObjectId id;
    private List<String> generosNoDeseados;

    /**
     * constructor que inicializa los atributos
     * @param id
     * @param generosNoDeseados 
     */
    public ActualizarGenerosUsuarioDTO(ObjectId id, List<String> generosNoDeseados) {
        this.id = id;
        this.generosNoDeseados = generosNoDeseados;
    }

    /**
     * constructor vacio
     */
    public ActualizarGenerosUsuarioDTO() {
    }

    /**
     * getters y setters
     * @return 
     */
    
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public List<String> getGenerosNoDeseados() {
        return generosNoDeseados;
    }

    public void setGenerosNoDeseados(List<String> generosNoDeseados) {
        this.generosNoDeseados = generosNoDeseados;
    }
    
}
