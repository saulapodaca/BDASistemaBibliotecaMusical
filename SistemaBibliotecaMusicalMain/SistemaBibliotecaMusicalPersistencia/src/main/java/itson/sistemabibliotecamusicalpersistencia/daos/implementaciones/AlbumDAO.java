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
import itson.sistemabibliotecamusicalpersistencia.ConexionBD;
import itson.sistemabibliotecamusicalpersistencia.daos.IAlbumDAO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author adell
 */
public class AlbumDAO implements IAlbumDAO {

    @Override
    public List<AlbumDominio> listarTodosLosAlbumes(List<String> generosNoDeseados) throws PersistenciaException {
        try{
            MongoDatabase baseDatos = new ConexionBD().conexion();
            MongoCollection<ArtistaDominio> coleccion
                    = baseDatos.getCollection("artistas", ArtistaDominio.class);

            List<AlbumDominio> todo = new ArrayList<>();
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
                    todo.add(album);
                }

            }
            return todo;
        }catch (Exception e) {
            throw new PersistenciaException("No se pudo listar los albumes: " + e.getMessage());
        }
    }

    @Override
    public List<AlbumDominio> listarAlbumesPorFiltro(String filtro, List<String> generosNoDeseados) throws PersistenciaException {
        try{
            filtro = filtro.toLowerCase();
            List<AlbumDominio> resultados = new ArrayList<>();
            for (AlbumDominio album : listarTodosLosAlbumes(generosNoDeseados)) {
                if (album.getNombre().toLowerCase().contains(filtro)
                        || album.getGeneroMusical().toLowerCase().contains(filtro)
                        || album.getFechaLanzamiento().toString().contains(filtro)) {
                    resultados.add(album);
                }
            }
            return resultados;
        }catch (PersistenciaException e) {
            throw new PersistenciaException("No se pudo listar los albumes por filtro: " + e.getMessage());
        }
    }

    @Override
    public AlbumDominio buscarPorId(ObjectId id) throws PersistenciaException {
        try{
            MongoDatabase baseDatos = new ConexionBD().conexion();
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
