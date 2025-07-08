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
import itson.sistemabibliotecamusicaldominio.dtos.ResultadosDTO;
import itson.sistemabibliotecamusicaldominio.dtos.ResultadosDTO.Tipo;
import itson.sistemabibliotecamusicalpersistencia.ConexionBD;
import itson.sistemabibliotecamusicalpersistencia.daos.IArtistaDAO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Camila Zubía
 */
public class ArtistaDAO implements IArtistaDAO{

    @Override
    public List<ResultadosDTO> listarTodo() throws PersistenciaException {
        MongoDatabase baseDatos = new ConexionBD().conexion();
        MongoCollection<ArtistaDominio> coleccion
                = baseDatos.getCollection("artistas", ArtistaDominio.class);
        List<ResultadosDTO> todo = new ArrayList<>();
        FindIterable<ArtistaDominio> artistas = coleccion.find();
         for (ArtistaDominio a : artistas) {
            ResultadosDTO registro = new ResultadosDTO(Tipo.ARTISTA, a);
            todo.add(registro);
            List<AlbumDominio> albumes = a.getAlbumes();
            for (AlbumDominio album : albumes) {
                ResultadosDTO registro2 = new ResultadosDTO(Tipo.ALBUM, album);
                todo.add(registro2);
                List<CancionDominio> canciones = album.getCanciones();
                for (CancionDominio c : canciones) {
                    ResultadosDTO registro3 = new ResultadosDTO(Tipo.CANCION, c);
                    todo.add(registro3);
                }
            }
        }
        return todo;
    }

    @Override
    public List<ArtistaDominio> listarTodosLosArtistas() throws PersistenciaException {
        MongoDatabase baseDatos = new ConexionBD().conexion();
        
        MongoCollection<ArtistaDominio> coleccion
                = baseDatos.getCollection("personas", ArtistaDominio.class);
        
        List<ArtistaDominio> artistas = new ArrayList<>();
        
        for (ArtistaDominio a : coleccion.find()) {
            artistas.add(a);
        }
        return artistas;
    }

    @Override
    public List<ResultadosDTO> listarTodoPorFiltro(String filtro) throws PersistenciaException {
        filtro = filtro.toLowerCase();
        List<ResultadosDTO> resultados = new ArrayList<>();
        for (ResultadosDTO r : listarTodo()) {
            switch(r.getTipo()){
                case ARTISTA -> {
                    ArtistaDominio artista = (ArtistaDominio) r.getObjeto();
                    if (artista.getNombre().toLowerCase().contains(filtro) || 
                            artista.getGenero().toLowerCase().contains(filtro)) {
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
    }

    @Override
    public List<ArtistaDominio> listarArtistasPorFiltro(String filtro) throws PersistenciaException {
        filtro = filtro.toLowerCase();
        List<ArtistaDominio> resultados = new ArrayList<>();
        for (ArtistaDominio a : listarTodosLosArtistas()) {
            if (a.getNombre().toLowerCase().contains(filtro)
                    || a.getGenero().toLowerCase().contains(filtro)) {
                resultados.add(a);
            }
        }
        return resultados;
    }
    
}
