/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalpersistencia.daos.implementaciones;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import com.mongodb.client.model.Filters;
import itson.sistemabibliotecamusicaldominio.AlbumDominio;
import itson.sistemabibliotecamusicaldominio.ArtistaDominio;
import itson.sistemabibliotecamusicaldominio.CancionDominio;
import itson.sistemabibliotecamusicaldominio.TipoFavoritoEnum;
import itson.sistemabibliotecamusicaldominio.dtos.ResultadosDTO;
import itson.sistemabibliotecamusicalpersistencia.IConexionBD;
import itson.sistemabibliotecamusicalpersistencia.daos.IArtistaDAO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Camila Zubía
 */
public class ArtistaDAO implements IArtistaDAO{
    
    private final IConexionBD conexionBD;

    public ArtistaDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    @Override
    public List<ResultadosDTO> listarTodo(List<String> generosNoDeseados) throws PersistenciaException {
        try{
            MongoDatabase baseDatos = conexionBD.conexion();
            MongoCollection<ArtistaDominio> coleccion
                    = baseDatos.getCollection("artistas", ArtistaDominio.class);
            List<ResultadosDTO> todo = new ArrayList<>();
            FindIterable<ArtistaDominio> artistas = coleccion.find();
            for (ArtistaDominio a : artistas) {
                if (generosNoDeseados.contains(a.getGenero())) {
                    continue;
                }
                ResultadosDTO registro = new ResultadosDTO(TipoFavoritoEnum.ARTISTA, a);
                todo.add(registro);
                List<AlbumDominio> albumes = a.getAlbumes();
                for (AlbumDominio album : albumes) {
                    if (generosNoDeseados.contains(album.getGeneroMusical())) {
                        continue;
                    }
                    ResultadosDTO registro2 = new ResultadosDTO(TipoFavoritoEnum.ALBUM, album);
                    todo.add(registro2);
                    List<CancionDominio> canciones = album.getCanciones();
                    for (CancionDominio c : canciones) {
                        ResultadosDTO registro3 = new ResultadosDTO(TipoFavoritoEnum.CANCION, c);
                        todo.add(registro3);
                    }
                }
            }
            return todo;
        }catch (Exception e) {
            throw new PersistenciaException("No se pudo listar todo: " + e.getMessage());
        }
    }

    @Override
    public List<ArtistaDominio> listarTodosLosArtistas(List<String> generosNoDeseados) throws PersistenciaException {
        try{
            MongoDatabase baseDatos = conexionBD.conexion();
            MongoCollection<ArtistaDominio> coleccion
                    = baseDatos.getCollection("artistas", ArtistaDominio.class);

            List<ArtistaDominio> artistas = new ArrayList<>();

            for (ArtistaDominio a : coleccion.find()) {
                if (generosNoDeseados.contains(a.getGenero())) {
                    continue;
                }
                artistas.add(a);
            }
            return artistas; 
        }catch (Exception e) {
            throw new PersistenciaException("No se pudo listar todos los artistas: " + e.getMessage());
        }
    }

    @Override
    public List<ResultadosDTO> listarTodoPorFiltro(String filtro, List<String> generosNoDeseados) throws PersistenciaException {
        try{
            filtro = filtro.toLowerCase();
            List<ResultadosDTO> resultados = new ArrayList<>();
            for (ResultadosDTO r : listarTodo(generosNoDeseados)) {
                switch (r.getTipo()) {
                    case ARTISTA -> {
                        ArtistaDominio artista = (ArtistaDominio) r.getObjeto();
                        if (artista.getNombre().toLowerCase().contains(filtro)
                                || artista.getGenero().toLowerCase().contains(filtro)) {
                            resultados.add(r);
                        }
                    }
                    case ALBUM -> {
                        AlbumDominio album = (AlbumDominio) r.getObjeto();
                        if (album.getNombre().toLowerCase().contains(filtro)
                                || album.getGeneroMusical().toLowerCase().contains(filtro)
                                || album.getFechaLanzamiento().toString().contains(filtro)) {
                            resultados.add(r);
                        }
                    }
                    case CANCION -> {
                        CancionDominio cancion = (CancionDominio) r.getObjeto();
                        if (cancion.getNombre().toLowerCase().contains(filtro)) {
                            resultados.add(r);
                        }
                    }
                }
            }
            return resultados;
        }catch (PersistenciaException e) {
            throw new PersistenciaException("No se pudo listar todo por filtro: " + e.getMessage());
        }
    }

    @Override
    public List<ArtistaDominio> listarArtistasPorFiltro(String filtro, List<String> generosNoDeseados) throws PersistenciaException {
        try{
            filtro = filtro.toLowerCase();
            List<ArtistaDominio> resultados = new ArrayList<>();
            for (ArtistaDominio a : listarTodosLosArtistas(generosNoDeseados)) {
                if (a.getNombre().toLowerCase().contains(filtro)
                        || a.getGenero().toLowerCase().contains(filtro)) {
                    resultados.add(a);
                }
            }
            return resultados;
        }catch (PersistenciaException e) {
            throw new PersistenciaException("No se pudo listar los artistas por filtro: " + e.getMessage());
        }
    }

    @Override
    public List<String> obtenerTodosLosGeneros() throws PersistenciaException {
        try{
            MongoDatabase baseDatos = conexionBD.conexion();
            MongoCollection<ArtistaDominio> coleccion = baseDatos.getCollection("artistas", ArtistaDominio.class);
            List<String> generos = new ArrayList<>();
            MongoIterable<String> generosDistintos = coleccion.distinct("genero", String.class);
            for (String genero : generosDistintos) {
                generos.add(genero);
            }
            return generos;
        }catch (Exception e) {
            throw new PersistenciaException("No se pudo obtener los generos: " + e.getMessage());
        }
    }

    @Override
    public ArtistaDominio buscarPorId(ObjectId id) throws PersistenciaException {
        try {
            MongoDatabase baseDatos = conexionBD.conexion();
            MongoCollection<ArtistaDominio> coleccion = baseDatos.getCollection("artistas", ArtistaDominio.class);
            return coleccion.find(Filters.eq("_id", id)).first();
        } catch (Exception e) {
            throw new PersistenciaException("No se pudo buscar el artista por ID: " + e.getMessage());
        }
    }

}
