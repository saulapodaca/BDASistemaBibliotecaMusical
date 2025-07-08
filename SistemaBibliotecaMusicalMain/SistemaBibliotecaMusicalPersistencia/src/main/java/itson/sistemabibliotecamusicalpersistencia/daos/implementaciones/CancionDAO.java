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
import itson.sistemabibliotecamusicalpersistencia.daos.ICancionDAO;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adell
 */
public class CancionDAO implements ICancionDAO {

    @Override
    public List<CancionDominio> listarTodasLasCanciones() throws PersistenciaException {
        MongoDatabase baseDatos = new ConexionBD().conexion();

        MongoCollection<ArtistaDominio> coleccion
                = baseDatos.getCollection("personas", ArtistaDominio.class);

        List<CancionDominio> todo = new ArrayList<>();

        FindIterable<ArtistaDominio> artistas = coleccion.find();

        for (ArtistaDominio a : artistas) {

            List<AlbumDominio> albumes = a.getAlbumes();
            for (AlbumDominio album : albumes) {

                List<CancionDominio> canciones = album.getCanciones();
                for (CancionDominio c : canciones) {
                    todo.add(c);
                }
            }
        }
        return todo;
    }

    @Override
    public List<CancionDominio> listarCancionesPorFiltro(String filtro) throws PersistenciaException {
        filtro = filtro.toLowerCase();

        List<CancionDominio> resultados = new ArrayList<>();

        for (CancionDominio cancion : listarTodasLasCanciones()) {

            if (cancion.getNombre().toLowerCase().contains(filtro)) {
                resultados.add(cancion);
            }
        }
        return resultados;

    }

}
