/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalpersistencia.datos;

import itson.sistemabibliotecamusicaldominio.AlbumDominio;
import itson.sistemabibliotecamusicaldominio.ArtistaDominio;
import itson.sistemabibliotecamusicaldominio.CancionDominio;
import itson.sistemabibliotecamusicaldominio.IntegrantesDominio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Camila Zubía
 */
public class DatosAInsertar {
    
    public List<ArtistaDominio> obtenerDatos(){
        return List.of(a1,a2,a3,a4,a5);
    }
    
    List<CancionDominio> canciones1_1 = List.of(
            new CancionDominio("Howling"),
            new CancionDominio("Call your mom"),
            new CancionDominio("No Complaints")
    );
    List<CancionDominio> canciones1_2 = List.of(
            new CancionDominio("Come Over"),
            new CancionDominio("Forever"),
            new CancionDominio("Your Needs, My Needs")
    );
    List<AlbumDominio> albumes1 = List.of(
            new AlbumDominio("Stick Season", "2023", "Folk-pop", "url", canciones1_1),
            new AlbumDominio("Busyhead", "2019", "Folk-pop", "url", canciones1_2)
    );
    List<IntegrantesDominio> integrantes1 = new ArrayList<>();
    ArtistaDominio a1 = new ArtistaDominio("Noah Kahan", "Folk-pop", "url", false, integrantes1, albumes1);

    List<CancionDominio> canciones2_1 = List.of(
            new CancionDominio("Dress"),
            new CancionDominio("King Of My Heart"),
            new CancionDominio("Call It What You Want")
    );
    List<CancionDominio> canciones2_2 = List.of(
            new CancionDominio("exile"),
            new CancionDominio("mirrorball"),
            new CancionDominio("peace")
    );
    List<AlbumDominio> albumes2 = List.of(
            new AlbumDominio("Reputation", "2017", "Pop", "url", canciones2_1),
            new AlbumDominio("Folklore", "2020", "Pop", "url", canciones2_2)
    );
    List<IntegrantesDominio> integrantes2 = new ArrayList<>();
    ArtistaDominio a2 = new ArtistaDominio("Taylor Swift", "Pop", "url", false, integrantes2, albumes2);

    List<CancionDominio> canciones3_1 = List.of(
            new CancionDominio("Heartless"),
            new CancionDominio("After Hours"),
            new CancionDominio("Alone Again")
    );
    List<CancionDominio> canciones3_2 = List.of(
            new CancionDominio("Sidewalks"),
            new CancionDominio("Party Monster"),
            new CancionDominio("Die For You")
    );
    List<AlbumDominio> albumes3 = List.of(
            new AlbumDominio("After Hours", "2020", "R&B", "url", canciones3_1),
            new AlbumDominio("Starboy", "2016", "R&B", "url", canciones3_2)
    );
    List<IntegrantesDominio> integrantes3 = new ArrayList<>();
    ArtistaDominio a3 = new ArtistaDominio("The Weeknd", "R&B", "url", false, integrantes3, albumes3);

    List<CancionDominio> canciones4_1 = List.of(
            new CancionDominio("Bonfire"),
            new CancionDominio("Heartbeat"),
            new CancionDominio("Les")
    );
    List<CancionDominio> canciones4_2 = List.of(
            new CancionDominio("Freaks And Geeks"),
            new CancionDominio("My Shine"),
            new CancionDominio("Lights Turned On")
    );
    List<AlbumDominio> albumes4 = List.of(
            new AlbumDominio("Camp", "2011", "Rap", "url", canciones4_1),
            new AlbumDominio("EP", "2018", "Rap", "url", canciones4_2)
    );
    List<IntegrantesDominio> integrantes4 = new ArrayList<>();
    ArtistaDominio a4 = new ArtistaDominio("Childish Gambino", "Rap", "url", false, integrantes4, albumes4);

    List<CancionDominio> canciones5_1 = List.of(
            new CancionDominio("Ivy"),
            new CancionDominio("Nights"),
            new CancionDominio("White Ferrari")
    );
    List<CancionDominio> canciones5_2 = List.of(
            new CancionDominio("Pyramids"),
            new CancionDominio("Lost"),
            new CancionDominio("Pilot Jones")
    );
    List<AlbumDominio> albumes5 = List.of(
            new AlbumDominio("Blonde", "2016", "R&B", "url", canciones5_1),
            new AlbumDominio("channel ORANGE", "2012", "R&B", "url", canciones5_2)
    );
    List<IntegrantesDominio> integrantes5 = new ArrayList<>();
    ArtistaDominio a5 = new ArtistaDominio("Frank Ocean", "R&B", "url", false, integrantes5, albumes5);
}
