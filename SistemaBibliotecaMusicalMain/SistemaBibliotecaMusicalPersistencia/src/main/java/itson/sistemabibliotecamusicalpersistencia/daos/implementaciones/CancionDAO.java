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
import itson.sistemabibliotecamusicaldominio.CancionDominio;
import itson.sistemabibliotecamusicalpersistencia.daos.IConexionBD;
import itson.sistemabibliotecamusicalpersistencia.daos.ICancionDAO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *clase que implementa una interfaz y permite acceso a las canciones de la base
 * de datos
 * @author adell
 */
public class CancionDAO implements ICancionDAO {
    
    /**
     * conexion a la base de datos
     */
    private IConexionBD conexionBD;

    /**
     * constructor que recibe la conexion a la base de datos 
     * @param conexionBD 
     */
    public CancionDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    /**
     * metodo que lista todas la canciones que no sean de un genero no deseado
     * @param generosNoDeseados
     * @return
     * @throws PersistenciaException 
     */
    @Override
    public List<CancionDominio> listarTodasLasCanciones(List<String> generosNoDeseados) throws PersistenciaException {
        try{
            MongoDatabase baseDatos = conexionBD.conexion();

            MongoCollection<ArtistaDominio> coleccion
                    = baseDatos.getCollection("artistas", ArtistaDominio.class);

            List<CancionDominio> todo = new ArrayList<>();

            FindIterable<ArtistaDominio> artistas = coleccion.find();

            for (ArtistaDominio a : artistas) {
                if (generosNoDeseados.contains(a.getGenero())) {
                    continue;
                }
                List<AlbumDominio> albumes = a.getAlbumes();
                for (AlbumDominio album : albumes) {
                    if (generosNoDeseados.contains(album.getGeneroMusical())) {
                        continue;
                    }
                    List<CancionDominio> canciones = album.getCanciones();
                    for (CancionDominio c : canciones) {
                        todo.add(c);
                    }
                }
            }
            return todo;
        }catch (Exception e) {
            throw new PersistenciaException("No se pudo listar las canciones: " + e.getMessage());
        }
    }

    /**
     * metodo que lista todas las canciones que cumplan con el filtro y no sean
     * de un genero no deseado
     * @param filtro
     * @param generosNoDeseados
     * @return
     * @throws PersistenciaException 
     */
    @Override
    public List<CancionDominio> listarCancionesPorFiltro(String filtro, List<String> generosNoDeseados) throws PersistenciaException {
        try{
            filtro = filtro.toLowerCase();

            List<CancionDominio> resultados = new ArrayList<>();

            for (CancionDominio cancion : listarTodasLasCanciones(generosNoDeseados)) {

                if (cancion.getNombre().toLowerCase().contains(filtro)) {
                    resultados.add(cancion);
                }
            }
            return resultados;
        }catch (PersistenciaException e) {
            throw new PersistenciaException("No se pudo listar las canciones por filtro: " + e.getMessage());
        }
    }

    /**
     * metodo que recupera una cancion por su id
     * @param id
     * @return
     * @throws PersistenciaException 
     */
    @Override
    public CancionDominio buscarPorId(ObjectId id) throws PersistenciaException {
        try{
            MongoDatabase baseDatos = conexionBD.conexion();
            MongoCollection<ArtistaDominio> coleccion
                    = baseDatos.getCollection("artistas", ArtistaDominio.class);
            FindIterable<ArtistaDominio> artistas = coleccion.find();
            for (ArtistaDominio a : artistas) {
                for (AlbumDominio album : a.getAlbumes()) {
                    for (CancionDominio c : album.getCanciones()) {
                        if (c.getId().equals(id)) {
                            return c;
                        }
                    }
                }
            }
            throw new PersistenciaException("No se encontro ninguna cancion con el ID: " + id);
        }catch (PersistenciaException e) {
            throw new PersistenciaException("No se pudo buscar la cancion por ID: " + e.getMessage());
        }
    }

}
