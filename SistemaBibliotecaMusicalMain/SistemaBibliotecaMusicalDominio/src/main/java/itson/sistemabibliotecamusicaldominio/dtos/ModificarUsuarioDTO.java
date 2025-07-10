package itson.sistemabibliotecamusicaldominio.dtos;

//@author SAUL ISAAC APODACA BALDENEGRO 00000252020

import org.bson.types.ObjectId;

/**
 * DTO que se utiliza para modificar ciertos atributos del usuario
 * @author Camila Zubía
 */
public class ModificarUsuarioDTO {

    private ObjectId id;
    private String nombre;
    private String correo;
    private String imagen;

    /**
     * constructor vacio
     */
    public ModificarUsuarioDTO() {
    }

    /**
     * constructor que inicializa los atributos
     * @param id
     * @param nombre
     * @param correo
     * @param imagen 
     */
    public ModificarUsuarioDTO(ObjectId id, String nombre, String correo, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.imagen = imagen;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
}
