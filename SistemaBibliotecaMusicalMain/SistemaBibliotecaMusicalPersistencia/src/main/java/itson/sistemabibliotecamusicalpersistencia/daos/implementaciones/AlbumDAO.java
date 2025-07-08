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
import itson.sistemabibliotecamusicalpersistencia.ConexionBD;
import itson.sistemabibliotecamusicalpersistencia.daos.IAlbumDAO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adell
 */
public class AlbumDAO implements IAlbumDAO {

    @Override
    public List<AlbumDominio> listarTodosLosAlbumes() throws PersistenciaException {

        MongoDatabase baseDatos = new ConexionBD().conexion();

        MongoCollection<ArtistaDominio> coleccion
                = baseDatos.getCollection("personas", ArtistaDominio.class);

        List<AlbumDominio> todo = new ArrayList<>();
        FindIterable<ArtistaDominio> artistas = coleccion.find();

        for (ArtistaDominio a : artistas) {

            List<AlbumDominio> albumes = a.getAlbumes();

            for (AlbumDominio album : albumes) {
                todo.add(album);
            }

        }
        return todo;
    }

    @Override
    public List<AlbumDominio> listarAlbumesPorFiltro(String filtro) throws PersistenciaException {
        filtro = filtro.toLowerCase();
        List<AlbumDominio> resultados = new ArrayList<>();
        for (AlbumDominio album : listarTodosLosAlbumes()) {
            if (album.getNombre().toLowerCase().contains(filtro)
                    || album.getGeneroMusical().toLowerCase().contains(filtro)
                    || album.getFechaLanzamiento().toString().contains(filtro)) {
                resultados.add(album);
            }
        }
        return resultados;
    }

}
