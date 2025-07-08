package itson.sistemabibliotecamusicaldominio.dtos;

//@author SAUL ISAAC APODACA BALDENEGRO 00000252020

import java.util.List;
import org.bson.types.ObjectId;


public class ActualizarGenerosUsuarioDTO {
    private ObjectId id;
    private List<String> generosNoDeseados;

    public ActualizarGenerosUsuarioDTO(ObjectId id, List<String> generosNoDeseados) {
        this.id = id;
        this.generosNoDeseados = generosNoDeseados;
    }

    public ActualizarGenerosUsuarioDTO() {
    }

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
