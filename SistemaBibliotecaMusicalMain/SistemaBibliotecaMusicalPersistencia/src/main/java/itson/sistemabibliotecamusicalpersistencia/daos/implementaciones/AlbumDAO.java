/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalpersistencia.daos.implementaciones;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import itson.sistemabibliotecamusicaldominio.AlbumDominio;
import itson.sistemabibliotecamusicaldominio.ArtistaDominio;
import itson.sistemabibliotecamusicalpersistencia.daos.IConexionBD;
import itson.sistemabibliotecamusicalpersistencia.daos.IAlbumDAO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *clase que implementa una interfaz y permite acceso a los albumes de la base de
 * datos
 * @author adell
 */
public class AlbumDAO implements IAlbumDAO {
    
    /**
     * conexion a la base de datos
     */
    private IConexionBD conexionBD;

    /**
     * constructor que recibe la conexion a la base de datos 
     * @param conexionBD 
     */
    public AlbumDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    /**
     * metodo que lista todos los albumes excepto los que sean de un genero no deseado
     * @param generosNoDeseados
     * @return
     * @throws PersistenciaException 
     */
    @Override
    public List<AlbumDominio> listarTodosLosAlbumes(List<String> generosNoDeseados) throws PersistenciaException {
        try{
            MongoDatabase baseDatos = conexionBD.conexion();
            MongoCollection<ArtistaDominio> coleccion
                    = baseDatos.getCollection("artistas", ArtistaDominio.class);

            List<AlbumDominio> todo = new ArrayList<>();
            FindIterable<ArtistaDominio> artistas = coleccion.find();

            List<String> generosNormalizados = generosNoDeseados.stream()
                    .map(g -> g.toLowerCase().trim())
                    .toList();
            
            for (ArtistaDominio a : artistas) {
                if (generosNormalizados.contains(a.getGenero().toLowerCase().trim())) {
                    continue;
                }
                List<AlbumDominio> albumes = a.getAlbumes();

                for (AlbumDominio album : albumes) {
                    if (generosNormalizados.contains(album.getGeneroMusical().toLowerCase().trim())) {
                        continue;
                    }
                    todo.add(album);
                }

            }
            return todo;
        }catch (Exception e) {
            throw new PersistenciaException("No se pudo listar los albumes: " + e.getMessage());
        }
    }

    /**
     * metodo que lista todos los albumes que cumplan con el filtro y no sean de
     * un genero no deseado
     * @param filtro
     * @param generosNoDeseados
     * @return
     * @throws PersistenciaException 
     */
    @Override
    public List<AlbumDominio> listarAlbumesPorFiltro(String filtro, List<String> generosNoDeseados) throws PersistenciaException {
        try{
            filtro = filtro.toLowerCase();
            List<AlbumDominio> resultados = new ArrayList<>();
            for (AlbumDominio album : listarTodosLosAlbumes(generosNoDeseados)) {
                if (album.getNombre().toLowerCase().contains(filtro)
                        || album.getGeneroMusical().toLowerCase().contains(filtro)
                        || album.getFechaLanzamiento().contains(filtro)) {
                    resultados.add(album);
                }
            }
            return resultados;
        }catch (PersistenciaException e) {
            throw new PersistenciaException("No se pudo listar los albumes por filtro: " + e.getMessage());
        }
    }

    /**
     * metodo que busca un usuario por su id
     * @param id
     * @return
     * @throws PersistenciaException 
     */
    @Override
    public AlbumDominio buscarPorId(ObjectId id) throws PersistenciaException {
        try{
            MongoDatabase baseDatos = conexionBD.conexion();
            MongoCollection<ArtistaDominio> coleccion
                    = baseDatos.getCollection("artistas", ArtistaDominio.class);

            FindIterable<ArtistaDominio> artistas = coleccion.find();
            for (ArtistaDominio a : artistas) {
                for (AlbumDominio album : a.getAlbumes()) {
                    if (album.getId().equals(id)) {
                        return album;
                    }
                }
            }
            throw new PersistenciaException("No se encontro ningun album con el ID: " + id);
        }catch (PersistenciaException e) {
            throw new PersistenciaException("No se pudo buscar el album por ID: " + e.getMessage());
        }
    }

}
