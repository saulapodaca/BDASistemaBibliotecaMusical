/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalpersistencia.datos;

import itson.sistemabibliotecamusicaldominio.AlbumDominio;
import itson.sistemabibliotecamusicaldominio.ArtistaDominio;
import itson.sistemabibliotecamusicaldominio.CancionDominio;
import itson.sistemabibliotecamusicaldominio.IntegranteDominio;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Camila Zubía
 */
public class DatosAInsertar {
    
    public List<ArtistaDominio> obtenerDatos(){
        return List.of(a1,a2,a3,a4,a5);
    }
    
    List<CancionDominio> canciones1_1 = List.of(
            new CancionDominio(new ObjectId(), "Howling", "src\\main\\resources\\imagenCancion.png"),
            new CancionDominio(new ObjectId(), "Call your mom", "src\\main\\resources\\imagenCancion.png"),
            new CancionDominio(new ObjectId(), "No Complaints", "src\\main\\resources\\imagenCancion.png")
    );
    List<CancionDominio> canciones1_2 = List.of(
            new CancionDominio(new ObjectId(), "Come Over", "src\\main\\resources\\imagenCancion.png"),
            new CancionDominio(new ObjectId(), "Forever", "src\\main\\resources\\imagenCancion.png"),
            new CancionDominio(new ObjectId(), "Your Needs, My Needs", "src\\main\\resources\\imagenCancion.png")
    );
    List<AlbumDominio> albumes1 = List.of(
            new AlbumDominio(new ObjectId(),"Stick Season", "2023", "Folk-pop", "src\\main\\resources\\imagenAlbum.png", canciones1_1),
            new AlbumDominio(new ObjectId(), "Busyhead", "2019", "Folk-pop", "src\\main\\resources\\imagenAlbum.png", canciones1_2)
    );
    List<IntegranteDominio> integrantes1 = new ArrayList<>();
    ArtistaDominio a1 = new ArtistaDominio(new ObjectId(), "Noah Kahan", "Folk-pop", "src\\main\\resources\\imagenArtista.png", false, integrantes1, albumes1);

    List<CancionDominio> canciones2_1 = List.of(
            new CancionDominio(new ObjectId(), "Dress", "src\\main\\resources\\imagenCancion.png"),
            new CancionDominio(new ObjectId(), "King Of My Heart", "src\\main\\resources\\imagenCancion.png"),
            new CancionDominio(new ObjectId(), "Call It What You Want", "src\\main\\resources\\imagenCancion.png")
    );
    List<CancionDominio> canciones2_2 = List.of(
            new CancionDominio(new ObjectId(), "exile", "src\\main\\resources\\imagenCancion.png"),
            new CancionDominio(new ObjectId(), "mirrorball", "src\\main\\resources\\imagenCancion.png"),
            new CancionDominio(new ObjectId(), "peace", "src\\main\\resources\\imagenCancion.png")
    );
    List<AlbumDominio> albumes2 = List.of(
            new AlbumDominio(new ObjectId(), "Reputation", "2017", "Pop", "src\\main\\resources\\imagenAlbum.png", canciones2_1),
            new AlbumDominio(new ObjectId(),"Folklore", "2020", "Pop", "src\\main\\resources\\imagenAlbum.png", canciones2_2)
    );
    List<IntegranteDominio> integrantes2 = new ArrayList<>();
    ArtistaDominio a2 = new ArtistaDominio(new ObjectId(), "Taylor Swift", "Pop", "src\\main\\resources\\imagenArtista.png", false, integrantes2, albumes2);

    List<CancionDominio> canciones3_1 = List.of(
            new CancionDominio(new ObjectId(), "Heartless", "src\\main\\resources\\imagenCancion.png"),
            new CancionDominio(new ObjectId(), "After Hours", "src\\main\\resources\\imagenCancion.png"),
            new CancionDominio(new ObjectId(), "Alone Again", "src\\main\\resources\\imagenCancion.png")
    );
    List<CancionDominio> canciones3_2 = List.of(
            new CancionDominio(new ObjectId(), "Sidewalks", "src\\main\\resources\\imagenCancion.png"),
            new CancionDominio(new ObjectId(), "Party Monster", "src\\main\\resources\\imagenCancion.png"),
            new CancionDominio(new ObjectId(), "Die For You", "src\\main\\resources\\imagenCancion.png")
    );
    List<AlbumDominio> albumes3 = List.of(
            new AlbumDominio(new ObjectId(), "After Hours", "2020", "R&B", "src\\main\\resources\\imagenAlbum.png", canciones3_1),
            new AlbumDominio(new ObjectId(), "Starboy", "2016", "R&B", "src\\main\\resources\\imagenAlbum.png", canciones3_2)
    );
    List<IntegranteDominio> integrantes3 = new ArrayList<>();
    ArtistaDominio a3 = new ArtistaDominio(new ObjectId(), "The Weeknd", "R&B", "src\\main\\resources\\imagenArtista.png", false, integrantes3, albumes3);

    List<CancionDominio> canciones4_1 = List.of(
             new CancionDominio(new ObjectId(), "Bonfire", "src\\main\\resources\\imagenCancion.png"),
            new CancionDominio(new ObjectId(), "Hearbeat", "src\\main\\resources\\imagenCancion.png"),
            new CancionDominio(new ObjectId(), "Les", "src\\main\\resources\\imagenCancion.png")
    );
    List<CancionDominio> canciones4_2 = List.of(
            new CancionDominio(new ObjectId(), "Freaks And Geeks", "src\\main\\resources\\imagenCancion.png"),
            new CancionDominio(new ObjectId(), "My Shine", "src\\main\\resources\\imagenCancion.png"),
            new CancionDominio(new ObjectId(), "Lights Turned On", "src\\main\\resources\\imagenCancion.png")
    );
    List<AlbumDominio> albumes4 = List.of(
            new AlbumDominio(new ObjectId(), "Camp", "2011", "Rap", "src\\main\\resources\\imagenAlbum.png", canciones4_1),
            new AlbumDominio(new ObjectId(), "EP", "2018", "Rap", "src\\main\\resources\\imagenAlbum.png", canciones4_2)
    );
    List<IntegranteDominio> integrantes4 = new ArrayList<>();
    ArtistaDominio a4 = new ArtistaDominio(new ObjectId(), "Childish Gambino", "Rap", "src\\main\\resources\\imagenArtista.png", false, integrantes4, albumes4);

    List<CancionDominio> canciones5_1 = List.of(
            new CancionDominio(new ObjectId(), "Ivy", "src\\main\\resources\\imagenCancion.png"),
            new CancionDominio(new ObjectId(), "Nights", "src\\main\\resources\\imagenCancion.png"),
            new CancionDominio(new ObjectId(), "White Ferrari", "src\\main\\resources\\imagenCancion.png")
    );
    List<CancionDominio> canciones5_2 = List.of(
            new CancionDominio(new ObjectId(), "Pyramids", "src\\main\\resources\\imagenCancion.png"),
            new CancionDominio(new ObjectId(), "Lost", "src\\main\\resources\\imagenCancion.png"),
            new CancionDominio(new ObjectId(), "Pilot Jones", "src\\main\\resources\\imagenCancion.png")
    );
    List<AlbumDominio> albumes5 = List.of(
            new AlbumDominio(new ObjectId(), "Blonde", "2016", "R&B", "src\\main\\resources\\imagenAlbum.png", canciones5_1),
            new AlbumDominio(new ObjectId(), "channel ORANGE", "2012", "R&B", "src\\main\\resources\\imagenAlbum.png", canciones5_2)
    );
    List<IntegranteDominio> integrantes5 = new ArrayList<>();
    ArtistaDominio a5 = new ArtistaDominio(new ObjectId(), "Frank Ocean", "R&B", "src\\main\\resources\\imagenArtista.png", false, integrantes5, albumes5);
}
