/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalpersistencia.datos;

import itson.sistemabibliotecamusicaldominio.AlbumDominio;
import itson.sistemabibliotecamusicaldominio.ArtistaDominio;
import itson.sistemabibliotecamusicaldominio.CancionDominio;
import itson.sistemabibliotecamusicaldominio.IntegranteDominio;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Camila Zubía
 */
public class DatosAInsertar {

    private final List<ArtistaDominio> artistas;

    public DatosAInsertar() {

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
                new AlbumDominio(new ObjectId(), "Stick Season", "2023", "Folk-pop", "src\\main\\resources\\imagenAlbum.png", canciones1_1),
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
                new AlbumDominio(new ObjectId(), "Folklore", "2020", "Pop", "src\\main\\resources\\imagenAlbum.png", canciones2_2)
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

        List<CancionDominio> canciones6_1 = List.of(
                new CancionDominio(new ObjectId(), "El Triste", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "La Nave del Olvido", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Amar y Querer", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones6_2 = List.of(
                new CancionDominio(new ObjectId(), "40 y 20", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Gavilán o Paloma", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Lo Pasado, Pasado", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes6 = List.of(
                new AlbumDominio(new ObjectId(), "El Triste", "1970", "Balada", "src\\main\\resources\\imagenAlbum.png", canciones6_1),
                new AlbumDominio(new ObjectId(), "40 y 20", "1992", "Balada", "src\\main\\resources\\imagenAlbum.png", canciones6_2));
        List<IntegranteDominio> integrantes6 = new ArrayList<>();
        ArtistaDominio a6 = new ArtistaDominio(new ObjectId(), "José José", "Balada", "src\\main\\resources\\imagenArtista.png", false, integrantes6, albumes6);

        List<CancionDominio> canciones7_1 = List.of(
                new CancionDominio(new ObjectId(), "Take Me to Church", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Angel of Small Death and the Codeine Scene", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Cherry Wine", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones7_2 = List.of(
                new CancionDominio(new ObjectId(), "Eat Your Young", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Francesca", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Unknown / Nth", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes7 = List.of(
                new AlbumDominio(new ObjectId(), "Hozier", "2014", "Indie Rock", "src\\main\\resources\\imagenAlbum.png", canciones7_1),
                new AlbumDominio(new ObjectId(), "Unreal Unearth", "2023", "Indie Rock", "src\\main\\resources\\imagenAlbum.png", canciones7_2));
        List<IntegranteDominio> integrantes7 = new ArrayList<>();
        ArtistaDominio a7 = new ArtistaDominio(new ObjectId(), "Hozier", "Indie Rock", "src\\main\\resources\\imagenArtista.png", false, integrantes7, albumes7);

        List<CancionDominio> canciones8_1 = List.of(
                new CancionDominio(new ObjectId(), "Grace", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Last Goodbye", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Lover, You Should’ve Come Over", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones8_2 = List.of(
                new CancionDominio(new ObjectId(), "Hallelujah", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Forget Her", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Dream Brother", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes8 = List.of(
                new AlbumDominio(new ObjectId(), "Grace", "1994", "Alternative Rock", "src\\main\\resources\\imagenAlbum.png", canciones8_1),
                new AlbumDominio(new ObjectId(), "Sketches for My Sweetheart the Drunk", "1998", "Alternative Rock", "src\\main\\resources\\imagenAlbum.png", canciones8_2));
        List<IntegranteDominio> integrantes8 = new ArrayList<>();
        ArtistaDominio a8 = new ArtistaDominio(new ObjectId(), "Jeff Buckley", "Alternative Rock", "src\\main\\resources\\imagenArtista.png", false, integrantes8, albumes8);

        List<CancionDominio> canciones9_1 = List.of(
                new CancionDominio(new ObjectId(), "The A Team", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Lego House", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Give Me Love", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones9_2 = List.of(
                new CancionDominio(new ObjectId(), "Shape of You", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Perfect", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Castle on the Hill", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes9 = List.of(
                new AlbumDominio(new ObjectId(), "+ (Plus)", "2011", "Pop", "src\\main\\resources\\imagenAlbum.png", canciones9_1),
                new AlbumDominio(new ObjectId(), "÷ (Divide)", "2017", "Pop", "src\\main\\resources\\imagenAlbum.png", canciones9_2));
        List<IntegranteDominio> integrantes9 = new ArrayList<>();
        ArtistaDominio a9 = new ArtistaDominio(new ObjectId(), "Ed Sheeran", "Pop", "src\\main\\resources\\imagenArtista.png", false, integrantes9, albumes9);

        List<CancionDominio> canciones10_1 = List.of(
                new CancionDominio(new ObjectId(), "Nobody", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Geyser", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Two Slow Dancers", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones10_2 = List.of(
                new CancionDominio(new ObjectId(), "Working for the Knife", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Love Me More", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Heat Lightning", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes10 = List.of(
                new AlbumDominio(new ObjectId(), "Be the Cowboy", "2018", "Indie Rock", "src\\main\\resources\\imagenAlbum.png", canciones10_1),
                new AlbumDominio(new ObjectId(), "Laurel Hell", "2022", "Indie Rock", "src\\main\\resources\\imagenAlbum.png", canciones10_2));
        List<IntegranteDominio> integrantes10 = new ArrayList<>();
        ArtistaDominio a10 = new ArtistaDominio(new ObjectId(), "Mitski", "Indie Rock", "src\\main\\resources\\imagenArtista.png", false, integrantes10, albumes10);

        List<CancionDominio> canciones11_1 = List.of(
                new CancionDominio(new ObjectId(), "Video Games", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Born to Die", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Summertime Sadness", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones11_2 = List.of(
                new CancionDominio(new ObjectId(), "Norman Fucking Rockwell", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Mariners Apartment Complex", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Venice Bitch", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes11 = List.of(
                new AlbumDominio(new ObjectId(), "Born to Die", "2012", "Baroque Pop", "src\\main\\resources\\imagenAlbum.png", canciones11_1),
                new AlbumDominio(new ObjectId(), "Norman Fucking Rockwell!", "2019", "Art Pop", "src\\main\\resources\\imagenAlbum.png", canciones11_2));
        List<IntegranteDominio> integrantes11 = new ArrayList<>();
        ArtistaDominio a11 = new ArtistaDominio(new ObjectId(), "Lana Del Rey", "Art Pop", "src\\main\\resources\\imagenArtista.png", false, integrantes11, albumes11);

        List<CancionDominio> canciones12_1 = List.of(
                new CancionDominio(new ObjectId(), "Pancakes", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "You Could Start a Cult", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Apple Pie", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones12_2 = List.of(
                new CancionDominio(new ObjectId(), "Ceilings", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Erase Me", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Nothing Is Ever Wrong", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes12 = List.of(
                new AlbumDominio(new ObjectId(), "Give Me a Minute", "2020", "Indie Folk", "src\\main\\resources\\imagenAlbum.png", canciones12_1),
                new AlbumDominio(new ObjectId(), "Five Seconds Flat", "2022", "Indie Pop", "src\\main\\resources\\imagenAlbum.png", canciones12_2));
        List<IntegranteDominio> integrantes12 = new ArrayList<>();
        ArtistaDominio a12 = new ArtistaDominio(new ObjectId(), "Lizzy McAlpine", "Indie Folk / Indie Pop", "src\\main\\resources\\imagenArtista.png", false, integrantes12, albumes12);

        List<CancionDominio> canciones13_1 = List.of(
                new CancionDominio(new ObjectId(), "Easy Love", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Mojito", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Romeo", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones13_2 = List.of(
                new CancionDominio(new ObjectId(), "No More Runnin'", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Drive Me", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Cupid", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes13 = List.of(
                new AlbumDominio(new ObjectId(), "Easy Love", "2021", "R&B", "src\\main\\resources\\imagenAlbum.png", canciones13_1),
                new AlbumDominio(new ObjectId(), "Drive Me Crazy", "2023", "R&B / Soul", "src\\main\\resources\\imagenAlbum.png", canciones13_2));
        List<IntegranteDominio> integrantes13 = new ArrayList<>();
        ArtistaDominio a13 = new ArtistaDominio(new ObjectId(), "Gigi Perez", "R&B / Soul", "src\\main\\resources\\imagenArtista.png", false, integrantes13, albumes13);

        List<CancionDominio> canciones14_1 = List.of(
                new CancionDominio(new ObjectId(), "Love Galore", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "The Weekend", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Supermodel", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones14_2 = List.of(
                new CancionDominio(new ObjectId(), "Good Days", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "I Hate U", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Kill Bill", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes14 = List.of(
                new AlbumDominio(new ObjectId(), "Ctrl", "2017", "R&B / Alternative R&B", "src\\main\\resources\\imagenAlbum.png", canciones14_1),
                new AlbumDominio(new ObjectId(), "SOS", "2022", "R&B / Neo Soul", "src\\main\\resources\\imagenAlbum.png", canciones14_2));
        List<IntegranteDominio> integrantes14 = new ArrayList<>();
        ArtistaDominio a14 = new ArtistaDominio(new ObjectId(), "SZA", "R&B / Neo Soul", "src\\main\\resources\\imagenArtista.png", false, integrantes14, albumes14);

        List<CancionDominio> canciones15_1 = List.of(
                new CancionDominio(new ObjectId(), "Mask Off", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "March Madness", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Where Ya At", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones15_2 = List.of(
                new CancionDominio(new ObjectId(), "Life Is Good", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Low Life", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Jumpman", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes15 = List.of(
                new AlbumDominio(new ObjectId(), "Future", "2017", "Hip Hop / Trap", "src\\main\\resources\\imagenAlbum.png", canciones15_1),
                new AlbumDominio(new ObjectId(), "High Off Life", "2020", "Hip Hop / Trap", "src\\main\\resources\\imagenAlbum.png", canciones15_2));
        List<IntegranteDominio> integrantes15 = new ArrayList<>();
        ArtistaDominio a15 = new ArtistaDominio(new ObjectId(), "Future", "Hip Hop / Trap", "src\\main\\resources\\imagenArtista.png", false, integrantes15, albumes15);

        List<CancionDominio> canciones16_1 = List.of(
                new CancionDominio(new ObjectId(), "Creep", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Fake Plastic Trees", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "High and Dry", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones16_2 = List.of(
                new CancionDominio(new ObjectId(), "Paranoid Android", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Karma Police", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "No Surprises", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes16 = List.of(
                new AlbumDominio(new ObjectId(), "Pablo Honey", "1993", "Alternative Rock", "src\\main\\resources\\imagenAlbum.png", canciones16_1),
                new AlbumDominio(new ObjectId(), "OK Computer", "1997", "Alternative Rock", "src\\main\\resources\\imagenAlbum.png", canciones16_2));
        List<IntegranteDominio> integrantes16 = List.of(
                new IntegranteDominio(new ObjectId(), "Thom Yorke", "Vocalista, guitarra", LocalDate.of(1985, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Jonny Greenwood", "Guitarra, teclados", LocalDate.of(1985, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Colin Greenwood", "Bajo", LocalDate.of(1985, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Ed O'Brien", "Guitarra, coros", LocalDate.of(1985, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Philip Selway", "Batería", LocalDate.of(1985, 1, 1), null, true));
        ArtistaDominio a16 = new ArtistaDominio(new ObjectId(), "Radiohead", "Alternative Rock", "src\\main\\resources\\imagenArtista.png", true, integrantes16, albumes16);

        List<CancionDominio> canciones17_1 = List.of(
                new CancionDominio(new ObjectId(), "Bohemian Rhapsody", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "You're My Best Friend", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Somebody to Love", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones17_2 = List.of(
                new CancionDominio(new ObjectId(), "We Will Rock You", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "We Are the Champions", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Another One Bites the Dust", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes17 = List.of(
                new AlbumDominio(new ObjectId(), "A Night at the Opera", "1975", "Rock", "src\\main\\resources\\imagenAlbum.png", canciones17_1),
                new AlbumDominio(new ObjectId(), "News of the World", "1977", "Rock", "src\\main\\resources\\imagenAlbum.png", canciones17_2));
        List<IntegranteDominio> integrantes17 = List.of(
                new IntegranteDominio(new ObjectId(), "Freddie Mercury", "Vocalista, piano", LocalDate.of(1970, 1, 1), LocalDate.of(1991, 11, 24), false),
                new IntegranteDominio(new ObjectId(), "Brian May", "Guitarra, coros", LocalDate.of(1970, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "John Deacon", "Bajo", LocalDate.of(1970, 1, 1), LocalDate.of(1997, 1, 1), false),
                new IntegranteDominio(new ObjectId(), "Roger Taylor", "Batería, coros", LocalDate.of(1970, 1, 1), null, true));
        ArtistaDominio a17 = new ArtistaDominio(new ObjectId(), "Queen", "Rock", "src\\main\\resources\\imagenArtista.png", true, integrantes17, albumes17);

        List<CancionDominio> canciones18_1 = List.of(
                new CancionDominio(new ObjectId(), "This Charming Man", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "What Difference Does It Make?", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Still Ill", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones18_2 = List.of(
                new CancionDominio(new ObjectId(), "There Is a Light That Never Goes Out", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Bigmouth Strikes Again", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "I Know It's Over", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes18 = List.of(
                new AlbumDominio(new ObjectId(), "The Smiths", "1984", "Alternative Rock", "src\\main\\resources\\imagenAlbum.png", canciones18_1),
                new AlbumDominio(new ObjectId(), "The Queen Is Dead", "1986", "Indie Rock", "src\\main\\resources\\imagenAlbum.png", canciones18_2));
        List<IntegranteDominio> integrantes18 = List.of(
                new IntegranteDominio(new ObjectId(), "Morrissey", "Vocalista", LocalDate.of(1982, 1, 1), LocalDate.of(1987, 1, 1), false),
                new IntegranteDominio(new ObjectId(), "Johnny Marr", "Guitarra", LocalDate.of(1982, 1, 1), LocalDate.of(1987, 1, 1), false),
                new IntegranteDominio(new ObjectId(), "Andy Rourke", "Bajo", LocalDate.of(1982, 1, 1), LocalDate.of(1987, 1, 1), false),
                new IntegranteDominio(new ObjectId(), "Mike Joyce", "Batería", LocalDate.of(1982, 1, 1), LocalDate.of(1987, 1, 1), false));
        ArtistaDominio a18 = new ArtistaDominio(new ObjectId(), "The Smiths", "Alternative Rock / Indie Rock", "src\\main\\resources\\imagenArtista.png", true, integrantes18, albumes18);

        List<CancionDominio> canciones19_1 = List.of(
                new CancionDominio(new ObjectId(), "What Makes You Beautiful", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "One Thing", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Little Things", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones19_2 = List.of(
                new CancionDominio(new ObjectId(), "Story of My Life", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Drag Me Down", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Night Changes", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes19 = List.of(
                new AlbumDominio(new ObjectId(), "Up All Night", "2011", "Pop", "src\\main\\resources\\imagenAlbum.png", canciones19_1),
                new AlbumDominio(new ObjectId(), "Four", "2014", "Pop Rock", "src\\main\\resources\\imagenAlbum.png", canciones19_2));
        List<IntegranteDominio> integrantes19 = List.of(
                new IntegranteDominio(new ObjectId(), "Harry Styles", "Vocalista", LocalDate.of(2010, 7, 1), LocalDate.of(2016, 1, 1), false),
                new IntegranteDominio(new ObjectId(), "Liam Payne", "Vocalista", LocalDate.of(2010, 7, 1), LocalDate.of(2016, 1, 1), false),
                new IntegranteDominio(new ObjectId(), "Louis Tomlinson", "Vocalista", LocalDate.of(2010, 7, 1), LocalDate.of(2016, 1, 1), false),
                new IntegranteDominio(new ObjectId(), "Niall Horan", "Vocalista", LocalDate.of(2010, 7, 1), LocalDate.of(2016, 1, 1), false),
                new IntegranteDominio(new ObjectId(), "Zayn Malik", "Vocalista", LocalDate.of(2010, 7, 1), LocalDate.of(2015, 3, 25), false));
        ArtistaDominio a19 = new ArtistaDominio(new ObjectId(), "One Direction", "Pop / Pop Rock", "src\\main\\resources\\imagenArtista.png", true, integrantes19, albumes19);

        List<CancionDominio> canciones20_1 = List.of(
                new CancionDominio(new ObjectId(), "Chocolate", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Sex", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Robbers", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones20_2 = List.of(
                new CancionDominio(new ObjectId(), "Love It If We Made It", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "It's Not Living (If It's Not With You)", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Somebody Else", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes20 = List.of(
                new AlbumDominio(new ObjectId(), "The 1975", "2013", "Pop Rock / Indie Pop", "src\\main\\resources\\imagenAlbum.png", canciones20_1),
                new AlbumDominio(new ObjectId(), "A Brief Inquiry into Online Relationships", "2018", "Art Pop / Synth Pop", "src\\main\\resources\\imagenAlbum.png", canciones20_2));
        List<IntegranteDominio> integrantes20 = List.of(
                new IntegranteDominio(new ObjectId(), "Matty Healy", "Vocalista, guitarra", LocalDate.of(2002, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Adam Hann", "Guitarra", LocalDate.of(2002, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Ross MacDonald", "Bajo", LocalDate.of(2002, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "George Daniel", "Batería", LocalDate.of(2002, 1, 1), null, true));
        ArtistaDominio a20 = new ArtistaDominio(new ObjectId(), "The 1975", "Indie Rock / Pop Rock", "src\\main\\resources\\imagenArtista.png", true, integrantes20, albumes20);

        List<CancionDominio> canciones21_1 = List.of(
                new CancionDominio(new ObjectId(), "First Class", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Seven", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Devil Like Me", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones21_2 = List.of(
                new CancionDominio(new ObjectId(), "It's Called: Freefall", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Painkillers", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Hide", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes21 = List.of(
                new AlbumDominio(new ObjectId(), "RKS", "2015", "Indie Rock", "src\\main\\resources\\imagenAlbum.png", canciones21_1),
                new AlbumDominio(new ObjectId(), "How to: Friend, Love, Freefall", "2018", "Alternative Rock", "src\\main\\resources\\imagenAlbum.png", canciones21_2));
        List<IntegranteDominio> integrantes21 = List.of(
                new IntegranteDominio(new ObjectId(), "Ela Melo", "Vocalista", LocalDate.of(2013, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Darrick 'Bozzy' Keller", "Guitarra", LocalDate.of(2013, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Charlie Holt", "Bajo", LocalDate.of(2013, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Jesse Wells", "Teclados, guitarra", LocalDate.of(2013, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Caleb Hickman", "Batería", LocalDate.of(2013, 1, 1), null, true));
        ArtistaDominio a21 = new ArtistaDominio(new ObjectId(), "Rainbow Kitten Surprise", "Indie Rock / Alternative", "src\\main\\resources\\imagenArtista.png", true, integrantes21, albumes21);

        List<CancionDominio> canciones22_1 = List.of(
                new CancionDominio(new ObjectId(), "Push", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "3AM", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Real World", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones22_2 = List.of(
                new CancionDominio(new ObjectId(), "Unwell", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "If You're Gone", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Bent", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes22 = List.of(
                new AlbumDominio(new ObjectId(), "Yourself or Someone Like You", "1996", "Alternative Rock", "src\\main\\resources\\imagenAlbum.png", canciones22_1),
                new AlbumDominio(new ObjectId(), "Mad Season", "2000", "Pop Rock / Alternative", "src\\main\\resources\\imagenAlbum.png", canciones22_2));
        List<IntegranteDominio> integrantes22 = List.of(
                new IntegranteDominio(new ObjectId(), "Rob Thomas", "Vocalista, piano", LocalDate.of(1995, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Brian Yale", "Bajo", LocalDate.of(1995, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Paul Doucette", "Batería / guitarra rítmica", LocalDate.of(1995, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Kyle Cook", "Guitarra líder, coros", LocalDate.of(1995, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Adam Gaynor", "Guitarra rítmica, coros", LocalDate.of(1995, 1, 1), LocalDate.of(2005, 1, 1), false));
        ArtistaDominio a22 = new ArtistaDominio(new ObjectId(), "Matchbox Twenty", "Pop Rock / Alternative Rock", "src\\main\\resources\\imagenArtista.png", true, integrantes22, albumes22);

        List<CancionDominio> canciones23_1 = List.of(
                new CancionDominio(new ObjectId(), "Rhiannon", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Landslide", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Say You Love Me", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones23_2 = List.of(
                new CancionDominio(new ObjectId(), "Dreams", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Go Your Own Way", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "The Chain", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes23 = List.of(
                new AlbumDominio(new ObjectId(), "Fleetwood Mac", "1975", "Soft Rock", "src\\main\\resources\\imagenAlbum.png", canciones23_1),
                new AlbumDominio(new ObjectId(), "Rumours", "1977", "Pop Rock / Classic Rock", "src\\main\\resources\\imagenAlbum.png", canciones23_2));
        List<IntegranteDominio> integrantes23 = List.of(
                new IntegranteDominio(new ObjectId(), "Mick Fleetwood", "Batería", LocalDate.of(1967, 7, 1), null, true),
                new IntegranteDominio(new ObjectId(), "John McVie", "Bajo", LocalDate.of(1967, 7, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Stevie Nicks", "Voz", LocalDate.of(1975, 1, 1), LocalDate.of(2023, 1, 1), false),
                new IntegranteDominio(new ObjectId(), "Lindsey Buckingham", "Guitarra, voz", LocalDate.of(1975, 1, 1), LocalDate.of(2018, 4, 1), false),
                new IntegranteDominio(new ObjectId(), "Christine McVie", "Teclado, voz", LocalDate.of(1970, 1, 1), LocalDate.of(2022, 11, 30), false));
        ArtistaDominio a23 = new ArtistaDominio(new ObjectId(), "Fleetwood Mac", "Rock / Soft Rock / Pop Rock", "src\\main\\resources\\imagenArtista.png", true, integrantes23, albumes23);

        List<CancionDominio> canciones24_1 = List.of(
                new CancionDominio(new ObjectId(), "Drops of Jupiter", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Meet Virginia", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Calling All Angels", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones24_2 = List.of(
                new CancionDominio(new ObjectId(), "Hey, Soul Sister", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Marry Me", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "If It's Love", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes24 = List.of(
                new AlbumDominio(new ObjectId(), "Drops of Jupiter", "2001", "Alternative Rock", "src\\main\\resources\\imagenAlbum.png", canciones24_1),
                new AlbumDominio(new ObjectId(), "Save Me, San Francisco", "2009", "Pop Rock", "src\\main\\resources\\imagenAlbum.png", canciones24_2));
        List<IntegranteDominio> integrantes24 = List.of(
                new IntegranteDominio(new ObjectId(), "Pat Monahan", "Vocalista", LocalDate.of(1993, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Luis Maldonado", "Guitarra", LocalDate.of(2014, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Hector Maldonado", "Bajo", LocalDate.of(2009, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Jerry Becker", "Teclado, guitarra", LocalDate.of(2008, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Drew Shoals", "Batería", LocalDate.of(2014, 1, 1), LocalDate.of(2022, 1, 1), false));
        ArtistaDominio a24 = new ArtistaDominio(new ObjectId(), "Train", "Pop Rock / Alternative Rock", "src\\main\\resources\\imagenArtista.png", true, integrantes24, albumes24);

        List<CancionDominio> canciones25_1 = List.of(
                new CancionDominio(new ObjectId(), "I Bet You Look Good on the Dancefloor", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Mardy Bum", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "When the Sun Goes Down", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones25_2 = List.of(
                new CancionDominio(new ObjectId(), "Do I Wanna Know?", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "R U Mine?", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Why'd You Only Call Me When You're High?", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes25 = List.of(
                new AlbumDominio(new ObjectId(), "Whatever People Say I Am, That's What I'm Not", "2006", "Garage Rock / Indie Rock", "src\\main\\resources\\imagenAlbum.png", canciones25_1),
                new AlbumDominio(new ObjectId(), "AM", "2013", "Indie Rock / Psychedelic Rock", "src\\main\\resources\\imagenAlbum.png", canciones25_2));
        List<IntegranteDominio> integrantes25 = List.of(
                new IntegranteDominio(new ObjectId(), "Alex Turner", "Vocalista, guitarra", LocalDate.of(2002, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Matt Helders", "Batería, coros", LocalDate.of(2002, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Jamie Cook", "Guitarra", LocalDate.of(2002, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Nick O'Malley", "Bajo", LocalDate.of(2006, 6, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Andy Nicholson", "Bajo", LocalDate.of(2002, 1, 1), LocalDate.of(2006, 5, 1), false));
        ArtistaDominio a25 = new ArtistaDominio(new ObjectId(), "Arctic Monkeys", "Indie Rock / Garage Rock", "src\\main\\resources\\imagenArtista.png", true, integrantes25, albumes25);

        List<CancionDominio> canciones26_1 = List.of(
                new CancionDominio(new ObjectId(), "Yellow", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Trouble", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Shiver", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones26_2 = List.of(
                new CancionDominio(new ObjectId(), "Viva La Vida", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Violet Hill", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Lost!", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes26 = List.of(
                new AlbumDominio(new ObjectId(), "Parachutes", "2000", "Alternative Rock / Britpop", "src\\main\\resources\\imagenAlbum.png", canciones26_1),
                new AlbumDominio(new ObjectId(), "Viva la Vida or Death and All His Friends", "2008", "Art Rock / Baroque Pop", "src\\main\\resources\\imagenAlbum.png", canciones26_2));
        List<IntegranteDominio> integrantes26 = List.of(
                new IntegranteDominio(new ObjectId(), "Chris Martin", "Vocalista, piano, guitarra", LocalDate.of(1996, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Jonny Buckland", "Guitarra líder", LocalDate.of(1996, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Guy Berryman", "Bajo", LocalDate.of(1996, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Will Champion", "Batería, coros", LocalDate.of(1997, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Phil Harvey", "Director creativo / ex-mánager", LocalDate.of(1996, 1, 1), null, true));
        ArtistaDominio a26 = new ArtistaDominio(new ObjectId(), "Coldplay", "Alternative Rock / Pop Rock", "src\\main\\resources\\imagenArtista.png", true, integrantes26, albumes26);

        List<CancionDominio> canciones27_1 = List.of(
                new CancionDominio(new ObjectId(), "This Love", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "She Will Be Loved", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Harder to Breathe", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones27_2 = List.of(
                new CancionDominio(new ObjectId(), "Sugar", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Animals", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Maps", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes27 = List.of(
                new AlbumDominio(new ObjectId(), "Songs About Jane", "2002", "Pop Rock / Funk Rock", "src\\main\\resources\\imagenAlbum.png", canciones27_1),
                new AlbumDominio(new ObjectId(), "V", "2014", "Pop / Pop Rock", "src\\main\\resources\\imagenAlbum.png", canciones27_2));
        List<IntegranteDominio> integrantes27 = List.of(
                new IntegranteDominio(new ObjectId(), "Adam Levine", "Vocalista", LocalDate.of(2001, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Jesse Carmichael", "Teclado, guitarra rítmica", LocalDate.of(2001, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "James Valentine", "Guitarra líder", LocalDate.of(2001, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Mickey Madden", "Bajo", LocalDate.of(2001, 1, 1), LocalDate.of(2020, 7, 1), false),
                new IntegranteDominio(new ObjectId(), "Matt Flynn", "Batería", LocalDate.of(2006, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "PJ Morton", "Teclado", LocalDate.of(2012, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Sam Farrar", "Multiinstrumentista", LocalDate.of(2016, 1, 1), null, true));
        ArtistaDominio a27 = new ArtistaDominio(new ObjectId(), "Maroon 5", "Pop Rock / Funk Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes27, albumes27);

        List<CancionDominio> canciones28_1 = List.of(
                new CancionDominio(new ObjectId(), "Mr. Brightside", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Somebody Told Me", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "All These Things That I've Done", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones28_2 = List.of(
                new CancionDominio(new ObjectId(), "Human", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Spaceman", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "A Dustland Fairytale", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes28 = List.of(
                new AlbumDominio(new ObjectId(), "Hot Fuss", "2004", "Alternative Rock / Post-Punk Revival", "src\\main\\resources\\imagenAlbum.png", canciones28_1),
                new AlbumDominio(new ObjectId(), "Day & Age", "2008", "Synthpop / New Wave", "src\\main\\resources\\imagenAlbum.png", canciones28_2));
        List<IntegranteDominio> integrantes28 = List.of(
                new IntegranteDominio(new ObjectId(), "Brandon Flowers", "Vocalista, teclado", LocalDate.of(2001, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Dave Keuning", "Guitarra", LocalDate.of(2001, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Mark Stoermer", "Bajo", LocalDate.of(2002, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Ronnie Vannucci Jr.", "Batería", LocalDate.of(2002, 1, 1), null, true));
        ArtistaDominio a28 = new ArtistaDominio(new ObjectId(), "The Killers", "Alternative Rock / Indie Rock / Synthpop", "src\\main\\resources\\imagenArtista.png", true, integrantes28, albumes28);

        List<CancionDominio> canciones29_1 = List.of(
                new CancionDominio(new ObjectId(), "Sweater Weather", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Afraid", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Female Robbery", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones29_2 = List.of(
                new CancionDominio(new ObjectId(), "Daddy Issues", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Cry Baby", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "The Beach", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes29 = List.of(
                new AlbumDominio(new ObjectId(), "I Love You.", "2013", "Indie Rock / Alternative R&B", "src\\main\\resources\\imagenAlbum.png", canciones29_1),
                new AlbumDominio(new ObjectId(), "Wiped Out!", "2015", "Alternative Rock / Dream Pop", "src\\main\\resources\\imagenAlbum.png", canciones29_2));
        List<IntegranteDominio> integrantes29 = List.of(
                new IntegranteDominio(new ObjectId(), "Jesse Rutherford", "Vocalista", LocalDate.of(2011, 1, 1), LocalDate.of(2022, 10, 1), false),
                new IntegranteDominio(new ObjectId(), "Zach Abels", "Guitarra", LocalDate.of(2011, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Jeremy Freedman", "Guitarra rítmica", LocalDate.of(2011, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Mikey Margott", "Bajo", LocalDate.of(2011, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Brandon Fried", "Batería", LocalDate.of(2014, 1, 1), LocalDate.of(2022, 11, 1), false));
        ArtistaDominio a29 = new ArtistaDominio(new ObjectId(), "The Neighbourhood", "Indie Rock / Alternative R&B", "src\\main\\resources\\imagenArtista.png", true, integrantes29, albumes29);

        List<CancionDominio> canciones30_1 = List.of(
                new CancionDominio(new ObjectId(), "Ho Hey", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Stubborn Love", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Submarines", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones30_2 = List.of(
                new CancionDominio(new ObjectId(), "Ophelia", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Angela", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Sleep on the Floor", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes30 = List.of(
                new AlbumDominio(new ObjectId(), "The Lumineers", "2012", "Folk Rock / Americana", "src\\main\\resources\\imagenAlbum.png", canciones30_1),
                new AlbumDominio(new ObjectId(), "Cleopatra", "2016", "Folk Rock / Indie Folk", "src\\main\\resources\\imagenAlbum.png", canciones30_2));
        List<IntegranteDominio> integrantes30 = List.of(
                new IntegranteDominio(new ObjectId(), "Wesley Schultz", "Vocalista y guitarra", LocalDate.of(2005, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Jeremy Fraites", "Batería y percusión", LocalDate.of(2005, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Neyla Pekarek", "Cello y coros", LocalDate.of(2009, 1, 1), LocalDate.of(2018, 1, 1), false));
        ArtistaDominio a30 = new ArtistaDominio(new ObjectId(), "The Lumineers", "Folk Rock / Americana", "src\\main\\resources\\imagenArtista.png", true, integrantes30, albumes30);

        /**
         * ADEL
         */
        List<CancionDominio> canciones31_1 = List.of(
                new CancionDominio(new ObjectId(), "On The Ground", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Gone", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Hard to Love", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones31_2 = List.of(
                new CancionDominio(new ObjectId(), "The Happiest Girl", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Yeah Yeah Yeah", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Tally", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes31 = List.of(
                new AlbumDominio(new ObjectId(), "R", "2021", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones31_1),
                new AlbumDominio(new ObjectId(), "BORN PINK (Solo Tracks)", "2022", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones31_2)
        );
        List<IntegranteDominio> integrantes31 = new ArrayList<>();
        ArtistaDominio a31 = new ArtistaDominio(new ObjectId(), "Rosé", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes31, albumes31);

        List<CancionDominio> canciones32_1 = List.of(
                new CancionDominio(new ObjectId(), "LALISA", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "MONEY", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "SG", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones32_2 = List.of(
                new CancionDominio(new ObjectId(), "SHOONG! (feat. Lisa)", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "G(old) (feat. Lisa)", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "All About You (feat. Lisa)", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes32 = List.of(
                new AlbumDominio(new ObjectId(), "LALISA", "2021", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones32_1),
                new AlbumDominio(new ObjectId(), "Lisa's Features", "2023", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones32_2)
        );
        List<IntegranteDominio> integrantes32 = new ArrayList<>();
        ArtistaDominio a32 = new ArtistaDominio(new ObjectId(), "Lisa", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes32, albumes32);

        List<CancionDominio> canciones33_1 = List.of(
                new CancionDominio(new ObjectId(), "Solo", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "You & Me", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Jentle Garden", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones33_2 = List.of(
                new CancionDominio(new ObjectId(), "One Of The Girls", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Jiggle Jiggle", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Can't Stop Us", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes33 = List.of(
                new AlbumDominio(new ObjectId(), "SOLO & Singles", "2018", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones33_1),
                new AlbumDominio(new ObjectId(), "The Idol (Soundtrack)", "2023", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones33_2)
        );
        List<IntegranteDominio> integrantes33 = new ArrayList<>();
        ArtistaDominio a33 = new ArtistaDominio(new ObjectId(), "Jennie", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes33, albumes33);

        List<CancionDominio> canciones34_1 = List.of(
                new CancionDominio(new ObjectId(), "Flower", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "All Eyes On Me", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Set Me Free", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones34_2 = List.of(
                new CancionDominio(new ObjectId(), "Coming Home (feat. Jisoo)", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "The Other Side (feat. Jisoo)", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Dream (feat. Jisoo)", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes34 = List.of(
                new AlbumDominio(new ObjectId(), "ME", "2023", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones34_1),
                new AlbumDominio(new ObjectId(), "Jisoo's Collaborations", "2022", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones34_2)
        );
        List<IntegranteDominio> integrantes34 = new ArrayList<>();
        ArtistaDominio a34 = new ArtistaDominio(new ObjectId(), "Jisoo", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes34, albumes34);

        List<CancionDominio> canciones35_1 = List.of(
                new CancionDominio(new ObjectId(), "Seven (feat. Latto)", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "3D (feat. Jack Harlow)", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Standing Next to You", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones35_2 = List.of(
                new CancionDominio(new ObjectId(), "Yes or No", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Hate You", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Too Much (with The Kid LAROI & Central Cee)", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes35 = List.of(
                new AlbumDominio(new ObjectId(), "GOLDEN", "2023", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones35_1),
                new AlbumDominio(new ObjectId(), "GOLDEN (Bonus Tracks)", "2023", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones35_2)
        );
        List<IntegranteDominio> integrantes35 = new ArrayList<>();
        ArtistaDominio a35 = new ArtistaDominio(new ObjectId(), "Jungkook", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes35, albumes35);

        List<CancionDominio> canciones36_1 = List.of(
                new CancionDominio(new ObjectId(), "Like Crazy", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Set Me Free Pt.2", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Face-off", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones36_2 = List.of(
                new CancionDominio(new ObjectId(), "Closer Than This", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "VIBE (feat. Jimin)", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "With You (with Ha Sungwoon)", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes36 = List.of(
                new AlbumDominio(new ObjectId(), "FACE", "2023", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones36_1),
                new AlbumDominio(new ObjectId(), "Closer Than This & Features", "2023", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones36_2)
        );
        List<IntegranteDominio> integrantes36 = new ArrayList<>();
        ArtistaDominio a36 = new ArtistaDominio(new ObjectId(), "Jimin", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes36, albumes36);

        List<CancionDominio> canciones37_1 = List.of(
                new CancionDominio(new ObjectId(), "Love Me Again", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Slow Dancing", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Rainy Days", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones37_2 = List.of(
                new CancionDominio(new ObjectId(), "Blue", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "For Us", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Winter Bear", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes37 = List.of(
                new AlbumDominio(new ObjectId(), "Layover", "2023", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones37_1),
                new AlbumDominio(new ObjectId(), "Layover (Bonus Tracks)", "2023", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones37_2)
        );
        List<IntegranteDominio> integrantes37 = new ArrayList<>();
        ArtistaDominio a37 = new ArtistaDominio(new ObjectId(), "V", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes37, albumes37);

        List<CancionDominio> canciones38_1 = List.of(
                new CancionDominio(new ObjectId(), "Daechwita", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Haegeum", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "AMYGDALA", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones38_2 = List.of(
                new CancionDominio(new ObjectId(), "People", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Burn It (feat. MAX)", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Strange (feat. RM)", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes38 = List.of(
                new AlbumDominio(new ObjectId(), "D-DAY", "2023", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones38_1),
                new AlbumDominio(new ObjectId(), "D-2", "2020", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones38_2)
        );
        List<IntegranteDominio> integrantes38 = new ArrayList<>();
        ArtistaDominio a38 = new ArtistaDominio(new ObjectId(), "Agust D", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes38, albumes38);

        List<CancionDominio> canciones39_1 = List.of(
                new CancionDominio(new ObjectId(), "Arson", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "MORE", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Future", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones39_2 = List.of(
                new CancionDominio(new ObjectId(), "on the street (with J. Cole)", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Daydream (백일몽)", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Ego", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes39 = List.of(
                new AlbumDominio(new ObjectId(), "Jack In The Box", "2022", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones39_1),
                new AlbumDominio(new ObjectId(), "Hope World & Singles", "2018", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones39_2)
        );
        List<IntegranteDominio> integrantes39 = new ArrayList<>();
        ArtistaDominio a39 = new ArtistaDominio(new ObjectId(), "J-Hope", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes39, albumes39);

        List<CancionDominio> canciones40_1 = List.of(
                new CancionDominio(new ObjectId(), "The Astronaut", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Abyss", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Moon", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones40_2 = List.of(
                new CancionDominio(new ObjectId(), "Epiphany", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Awake", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Tonight", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes40 = List.of(
                new AlbumDominio(new ObjectId(), "The Astronaut & Singles", "2022", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones40_1),
                new AlbumDominio(new ObjectId(), "Jin's Solo Tracks", "2018", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones40_2)
        );
        List<IntegranteDominio> integrantes40 = new ArrayList<>();
        ArtistaDominio a40 = new ArtistaDominio(new ObjectId(), "Jin", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes40, albumes40);

        List<CancionDominio> canciones41_1 = List.of(
                new CancionDominio(new ObjectId(), "Wild Flower (with Cho Youjeen)", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Still Life (with Anderson .Paak)", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Yun (with Erykah Badu)", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones41_2 = List.of(
                new CancionDominio(new ObjectId(), "Come Back to Me", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Badbye (with eAeon)", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Seoul (Prod. HONNE)", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes41 = List.of(
                new AlbumDominio(new ObjectId(), "Indigo", "2022", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones41_1),
                new AlbumDominio(new ObjectId(), "Mono. & Singles", "2018", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones41_2)
        );
        List<IntegranteDominio> integrantes41 = new ArrayList<>();
        ArtistaDominio a41 = new ArtistaDominio(new ObjectId(), "RM", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes41, albumes41);

        List<CancionDominio> canciones42_1 = List.of(
                new CancionDominio(new ObjectId(), "LILAC", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Coin", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Celebrity", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones42_2 = List.of(
                new CancionDominio(new ObjectId(), "Blueming", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Love Poem", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Palette (feat. G-Dragon)", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes42 = List.of(
                new AlbumDominio(new ObjectId(), "LILAC", "2021", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones42_1),
                new AlbumDominio(new ObjectId(), "Love Poem & Palette", "2019", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones42_2)
        );
        List<IntegranteDominio> integrantes42 = new ArrayList<>();
        ArtistaDominio a42 = new ArtistaDominio(new ObjectId(), "IU", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes42, albumes42);

        List<CancionDominio> canciones43_1 = List.of(
                new CancionDominio(new ObjectId(), "Gashina", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Siren", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Heroine", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones43_2 = List.of(
                new CancionDominio(new ObjectId(), "TAIL", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Pporappippam (보라빛 밤)", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Noir", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes43 = List.of(
                new AlbumDominio(new ObjectId(), "Warning", "2018", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones43_1),
                new AlbumDominio(new ObjectId(), "Tail & Singles", "2021", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones43_2)
        );
        List<IntegranteDominio> integrantes43 = new ArrayList<>();
        ArtistaDominio a43 = new ArtistaDominio(new ObjectId(), "Sunmi", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes43, albumes43);

        List<CancionDominio> canciones44_1 = List.of(
                new CancionDominio(new ObjectId(), "Gotta Go", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Snapping", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Roller Coaster", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones44_2 = List.of(
                new CancionDominio(new ObjectId(), "BICYCLE", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Killing Me", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "PLAY (feat. Changmo)", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes44 = List.of(
                new AlbumDominio(new ObjectId(), "Flourishing", "2019", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones44_1),
                new AlbumDominio(new ObjectId(), "Querencia", "2021", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones44_2)
        );
        List<IntegranteDominio> integrantes44 = new ArrayList<>();
        ArtistaDominio a44 = new ArtistaDominio(new ObjectId(), "Chungha", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes44, albumes44);

        List<CancionDominio> canciones45_1 = List.of(
                new CancionDominio(new ObjectId(), "Maria", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Twit", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Kidding", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones45_2 = List.of(
                new CancionDominio(new ObjectId(), "I'm a B", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "LMM", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Don't Give Kisses", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes45 = List.of(
                new AlbumDominio(new ObjectId(), "Maria", "2020", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones45_1),
                new AlbumDominio(new ObjectId(), "Guilty Pleasure", "2021", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones45_2)
        );
        List<IntegranteDominio> integrantes45 = new ArrayList<>();
        ArtistaDominio a45 = new ArtistaDominio(new ObjectId(), "Hwasa", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes45, albumes45);

        List<CancionDominio> canciones46_1 = List.of(
                new CancionDominio(new ObjectId(), "DDU-DU DDU-DU", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Forever Young", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Kill This Love", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones46_2 = List.of(
                new CancionDominio(new ObjectId(), "How You Like That", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Lovesick Girls", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Ice Cream (with Selena Gomez)", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes46 = List.of(
                new AlbumDominio(new ObjectId(), "Kill This Love", "2019", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones46_1),
                new AlbumDominio(new ObjectId(), "THE ALBUM", "2020", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones46_2)
        );
        List<IntegranteDominio> integrantes46 = List.of(
                new IntegranteDominio(new ObjectId(), "Jisoo", "Vocalista", LocalDate.of(2016, 8, 8), null, true),
                new IntegranteDominio(new ObjectId(), "Jennie", "Rapera, Vocalista", LocalDate.of(2016, 8, 8), null, true),
                new IntegranteDominio(new ObjectId(), "Rosé", "Vocalista", LocalDate.of(2016, 8, 8), null, true),
                new IntegranteDominio(new ObjectId(), "Lisa", "Rapera, Bailarina", LocalDate.of(2016, 8, 8), null, true)
        );
        ArtistaDominio a46 = new ArtistaDominio(new ObjectId(), "BLACKPINK", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes46, albumes46);

        List<CancionDominio> canciones47_1 = List.of(
                new CancionDominio(new ObjectId(), "Boy With Luv (feat. Halsey)", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "DNA", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "IDOL", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones47_2 = List.of(
                new CancionDominio(new ObjectId(), "Dynamite", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Butter", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Permission to Dance", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes47 = List.of(
                new AlbumDominio(new ObjectId(), "Love Yourself: Answer", "2018", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones47_1),
                new AlbumDominio(new ObjectId(), "BE", "2020", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones47_2)
        );
        List<IntegranteDominio> integrantes47 = List.of(
                new IntegranteDominio(new ObjectId(), "RM", "Líder, Rapero", LocalDate.of(2013, 6, 13), null, true),
                new IntegranteDominio(new ObjectId(), "Jin", "Vocalista", LocalDate.of(2013, 6, 13), null, true),
                new IntegranteDominio(new ObjectId(), "Suga", "Rapero", LocalDate.of(2013, 6, 13), null, true),
                new IntegranteDominio(new ObjectId(), "J-Hope", "Rapero, Bailarín", LocalDate.of(2013, 6, 13), null, true),
                new IntegranteDominio(new ObjectId(), "Jimin", "Vocalista, Bailarín", LocalDate.of(2013, 6, 13), null, true),
                new IntegranteDominio(new ObjectId(), "V", "Vocalista", LocalDate.of(2013, 6, 13), null, true),
                new IntegranteDominio(new ObjectId(), "Jungkook", "Vocalista, Bailarín", LocalDate.of(2013, 6, 13), null, true)
        );
        ArtistaDominio a47 = new ArtistaDominio(new ObjectId(), "BTS", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes47, albumes47);

        List<CancionDominio> canciones48_1 = List.of(
                new CancionDominio(new ObjectId(), "Feel Special", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Fancy", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "CHEER UP", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones48_2 = List.of(
                new CancionDominio(new ObjectId(), "Alcohol-Free", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "SCIENTIST", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "The Feels", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes48 = List.of(
                new AlbumDominio(new ObjectId(), "Feel Special", "2019", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones48_1),
                new AlbumDominio(new ObjectId(), "Taste of Love", "2021", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones48_2)
        );
        List<IntegranteDominio> integrantes48 = List.of(
                new IntegranteDominio(new ObjectId(), "Nayeon", "Vocalista", LocalDate.of(2015, 10, 20), null, true),
                new IntegranteDominio(new ObjectId(), "Jeongyeon", "Vocalista", LocalDate.of(2015, 10, 20), null, true),
                new IntegranteDominio(new ObjectId(), "Momo", "Bailarina, Vocalista", LocalDate.of(2015, 10, 20), null, true),
                new IntegranteDominio(new ObjectId(), "Sana", "Vocalista", LocalDate.of(2015, 10, 20), null, true),
                new IntegranteDominio(new ObjectId(), "Jihyo", "Líder, Vocalista", LocalDate.of(2015, 10, 20), null, true),
                new IntegranteDominio(new ObjectId(), "Mina", "Bailarina, Vocalista", LocalDate.of(2015, 10, 20), null, true),
                new IntegranteDominio(new ObjectId(), "Dahyun", "Rapera, Vocalista", LocalDate.of(2015, 10, 20), null, true),
                new IntegranteDominio(new ObjectId(), "Chaeyoung", "Rapera, Vocalista", LocalDate.of(2015, 10, 20), null, true),
                new IntegranteDominio(new ObjectId(), "Tzuyu", "Vocalista, Visual", LocalDate.of(2015, 10, 20), null, true)
        );
        ArtistaDominio a48 = new ArtistaDominio(new ObjectId(), "TWICE", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes48, albumes48);

        List<CancionDominio> canciones49_1 = List.of(
                new CancionDominio(new ObjectId(), "Red Flavor", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Bad Boy", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Psycho", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones49_2 = List.of(
                new CancionDominio(new ObjectId(), "Queendom", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Feel My Rhythm", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Birthday", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes49 = List.of(
                new AlbumDominio(new ObjectId(), "The ReVe Festival Finale", "2019", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones49_1),
                new AlbumDominio(new ObjectId(), "Queendom", "2021", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones49_2)
        );
        List<IntegranteDominio> integrantes49 = List.of(
                new IntegranteDominio(new ObjectId(), "Irene", "Líder, Rapera, Vocalista", LocalDate.of(2014, 8, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Seulgi", "Vocalista, Bailarina", LocalDate.of(2014, 8, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Wendy", "Vocalista", LocalDate.of(2014, 8, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Joy", "Vocalista, Rapera", LocalDate.of(2014, 8, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Yeri", "Vocalista, Rapera", LocalDate.of(2015, 3, 11), null, true)
        );
        ArtistaDominio a49 = new ArtistaDominio(new ObjectId(), "Red Velvet", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes49, albumes49);

        List<CancionDominio> canciones50_1 = List.of(
                new CancionDominio(new ObjectId(), "Love Shot", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Tempo", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Monster", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones50_2 = List.of(
                new CancionDominio(new ObjectId(), "Obsession", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Don't fight the feeling", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Ko Ko Bop", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes50 = List.of(
                new AlbumDominio(new ObjectId(), "Love Shot", "2018", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones50_1),
                new AlbumDominio(new ObjectId(), "EX'ACT", "2016", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones50_2)
        );
        List<IntegranteDominio> integrantes50 = List.of(
                new IntegranteDominio(new ObjectId(), "Xiumin", "Vocalista", LocalDate.of(2012, 4, 8), null, true),
                new IntegranteDominio(new ObjectId(), "Suho", "Líder, Vocalista", LocalDate.of(2012, 4, 8), null, true),
                new IntegranteDominio(new ObjectId(), "Lay", "Vocalista, Bailarín", LocalDate.of(2012, 4, 8), null, true),
                new IntegranteDominio(new ObjectId(), "Baekhyun", "Vocalista", LocalDate.of(2012, 4, 8), null, true),
                new IntegranteDominio(new ObjectId(), "Chen", "Vocalista", LocalDate.of(2012, 4, 8), null, true),
                new IntegranteDominio(new ObjectId(), "Chanyeol", "Rapero, Vocalista", LocalDate.of(2012, 4, 8), null, true),
                new IntegranteDominio(new ObjectId(), "D.O.", "Vocalista", LocalDate.of(2012, 4, 8), null, true),
                new IntegranteDominio(new ObjectId(), "Kai", "Bailarín, Rapero", LocalDate.of(2012, 4, 8), null, true),
                new IntegranteDominio(new ObjectId(), "Sehun", "Rapero, Bailarín", LocalDate.of(2012, 4, 8), null, true)
        );
        ArtistaDominio a50 = new ArtistaDominio(new ObjectId(), "EXO", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes50, albumes50);

        List<CancionDominio> canciones51_1 = List.of(
                new CancionDominio(new ObjectId(), "God's Menu", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Back Door", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Maniac", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones51_2 = List.of(
                new CancionDominio(new ObjectId(), "CASE 143", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "S-Class", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Thunderous", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes51 = List.of(
                new AlbumDominio(new ObjectId(), "GO LIVE", "2020", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones51_1),
                new AlbumDominio(new ObjectId(), "MAXIDENT", "2022", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones51_2)
        );
        List<IntegranteDominio> integrantes51 = List.of(
                new IntegranteDominio(new ObjectId(), "Bang Chan", "Líder, Vocalista, Rapero", LocalDate.of(2018, 3, 25), null, true),
                new IntegranteDominio(new ObjectId(), "Lee Know", "Bailarín, Vocalista", LocalDate.of(2018, 3, 25), null, true),
                new IntegranteDominio(new ObjectId(), "Changbin", "Rapero", LocalDate.of(2018, 3, 25), null, true),
                new IntegranteDominio(new ObjectId(), "Hyunjin", "Bailarín, Rapero", LocalDate.of(2018, 3, 25), null, true),
                new IntegranteDominio(new ObjectId(), "Han", "Rapero, Vocalista", LocalDate.of(2018, 3, 25), null, true),
                new IntegranteDominio(new ObjectId(), "Felix", "Bailarín, Rapero", LocalDate.of(2018, 3, 25), null, true),
                new IntegranteDominio(new ObjectId(), "Seungmin", "Vocalista", LocalDate.of(2018, 3, 25), null, true),
                new IntegranteDominio(new ObjectId(), "I.N", "Vocalista", LocalDate.of(2018, 3, 25), null, true)
        );
        ArtistaDominio a51 = new ArtistaDominio(new ObjectId(), "Stray Kids", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes51, albumes51);

        List<CancionDominio> canciones52_1 = List.of(
                new CancionDominio(new ObjectId(), "Tomboy", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Nxde", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Queencard", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones52_2 = List.of(
                new CancionDominio(new ObjectId(), "LATATA", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Oh My God", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "HANN (Alone)", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes52 = List.of(
                new AlbumDominio(new ObjectId(), "I NEVER DIE", "2022", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones52_1),
                new AlbumDominio(new ObjectId(), "I feel", "2023", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones52_2)
        );
        List<IntegranteDominio> integrantes52 = List.of(
                new IntegranteDominio(new ObjectId(), "Miyeon", "Vocalista", LocalDate.of(2018, 5, 2), null, true),
                new IntegranteDominio(new ObjectId(), "Minnie", "Vocalista", LocalDate.of(2018, 5, 2), null, true),
                new IntegranteDominio(new ObjectId(), "Soyeon", "Líder, Rapera", LocalDate.of(2018, 5, 2), null, true),
                new IntegranteDominio(new ObjectId(), "Yuqi", "Vocalista, Bailarina", LocalDate.of(2018, 5, 2), null, true),
                new IntegranteDominio(new ObjectId(), "Shuhua", "Vocalista", LocalDate.of(2018, 5, 2), null, true)
        );
        ArtistaDominio a52 = new ArtistaDominio(new ObjectId(), "(G)I-DLE", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes52, albumes52);

        List<CancionDominio> canciones53_1 = List.of(
                new CancionDominio(new ObjectId(), "DALLA DALLA", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "ICY", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "WANNABE", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones53_2 = List.of(
                new CancionDominio(new ObjectId(), "LOCO", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "SNEAKERS", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Not Shy", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes53 = List.of(
                new AlbumDominio(new ObjectId(), "IT'z ICY", "2019", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones53_1),
                new AlbumDominio(new ObjectId(), "CRAZY IN LOVE", "2021", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones53_2)
        );
        List<IntegranteDominio> integrantes53 = List.of(
                new IntegranteDominio(new ObjectId(), "Yeji", "Líder, Bailarina, Vocalista", LocalDate.of(2019, 2, 12), null, true),
                new IntegranteDominio(new ObjectId(), "Lia", "Vocalista", LocalDate.of(2019, 2, 12), null, true),
                new IntegranteDominio(new ObjectId(), "Ryujin", "Rapera, Bailarina", LocalDate.of(2019, 2, 12), null, true),
                new IntegranteDominio(new ObjectId(), "Chaeryeong", "Bailarina, Vocalista", LocalDate.of(2019, 2, 12), null, true),
                new IntegranteDominio(new ObjectId(), "Yuna", "Bailarina, Vocalista", LocalDate.of(2019, 2, 12), null, true)
        );
        ArtistaDominio a53 = new ArtistaDominio(new ObjectId(), "ITZY", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes53, albumes53);

        List<CancionDominio> canciones54_1 = List.of(
                new CancionDominio(new ObjectId(), "Super Shy", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "ETA", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Ditto", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones54_2 = List.of(
                new CancionDominio(new ObjectId(), "Hype Boy", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Attention", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "OMG", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes54 = List.of(
                new AlbumDominio(new ObjectId(), "Get Up", "2023", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones54_1),
                new AlbumDominio(new ObjectId(), "NewJeans 1st EP 'New Jeans'", "2022", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones54_2)
        );
        List<IntegranteDominio> integrantes54 = List.of(
                new IntegranteDominio(new ObjectId(), "Minji", "Vocalista, Bailarina", LocalDate.of(2022, 7, 22), null, true),
                new IntegranteDominio(new ObjectId(), "Hanni", "Vocalista, Bailarina", LocalDate.of(2022, 7, 22), null, true),
                new IntegranteDominio(new ObjectId(), "Danielle", "Vocalista, Bailarina", LocalDate.of(2022, 7, 22), null, true),
                new IntegranteDominio(new ObjectId(), "Haerin", "Vocalista, Bailarina", LocalDate.of(2022, 7, 22), null, true),
                new IntegranteDominio(new ObjectId(), "Hyein", "Vocalista, Bailarina", LocalDate.of(2022, 7, 22), null, true)
        );
        ArtistaDominio a54 = new ArtistaDominio(new ObjectId(), "NewJeans", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes54, albumes54);

        List<CancionDominio> canciones55_1 = List.of(
                new CancionDominio(new ObjectId(), "ELEVEN", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "LOVE DIVE", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "After LIKE", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones55_2 = List.of(
                new CancionDominio(new ObjectId(), "Kitsch", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "I AM", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Baddie", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes55 = List.of(
                new AlbumDominio(new ObjectId(), "LOVE DIVE", "2022", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones55_1),
                new AlbumDominio(new ObjectId(), "I've IVE", "2023", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones55_2)
        );
        List<IntegranteDominio> integrantes55 = List.of(
                new IntegranteDominio(new ObjectId(), "Yujin", "Líder, Vocalista", LocalDate.of(2021, 12, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Gaeul", "Bailarina, Rapera", LocalDate.of(2021, 12, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Rei", "Rapera, Vocalista", LocalDate.of(2021, 12, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Wonyoung", "Vocalista, Bailarina", LocalDate.of(2021, 12, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Liz", "Vocalista", LocalDate.of(2021, 12, 1), null, true),
                new IntegranteDominio(new ObjectId(), "Leeseo", "Vocalista", LocalDate.of(2021, 12, 1), null, true)
        );
        ArtistaDominio a55 = new ArtistaDominio(new ObjectId(), "IVE", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes55, albumes55);

        List<CancionDominio> canciones56_1 = List.of(
                new CancionDominio(new ObjectId(), "FEARLESS", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "ANTIFRAGILE", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "UNFORGIVEN (feat. Nile Rodgers)", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones56_2 = List.of(
                new CancionDominio(new ObjectId(), "EASY", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Perfect Night", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Eve, Psyche & The Bluebeard's wife", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes56 = List.of(
                new AlbumDominio(new ObjectId(), "UNFORGIVEN", "2023", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones56_1),
                new AlbumDominio(new ObjectId(), "EASY", "2024", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones56_2)
        );
        List<IntegranteDominio> integrantes56 = List.of(
                new IntegranteDominio(new ObjectId(), "Sakura", "Vocalista, Bailarina", LocalDate.of(2022, 5, 2), null, true),
                new IntegranteDominio(new ObjectId(), "Kim Chae-won", "Líder, Vocalista", LocalDate.of(2022, 5, 2), null, true),
                new IntegranteDominio(new ObjectId(), "Huh Yun-jin", "Vocalista, Bailarina", LocalDate.of(2022, 5, 2), null, true),
                new IntegranteDominio(new ObjectId(), "Kazuha", "Bailarina, Rapera", LocalDate.of(2022, 5, 2), null, true),
                new IntegranteDominio(new ObjectId(), "Hong Eun-chae", "Bailarina, Vocalista", LocalDate.of(2022, 5, 2), null, true)
        );
        ArtistaDominio a56 = new ArtistaDominio(new ObjectId(), "LE SSERAFIM", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes56, albumes56);

        List<CancionDominio> canciones57_1 = List.of(
                new CancionDominio(new ObjectId(), "Ditto", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Bubblegum", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Cool With You", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones57_2 = List.of(
                new CancionDominio(new ObjectId(), "Magnetic", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Lucky Girl", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Mascara", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes57 = List.of(
                new AlbumDominio(new ObjectId(), "NewJeans 2nd EP 'Get Up'", "2023", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones57_1),
                new AlbumDominio(new ObjectId(), "ILLIT 1st Mini Album 'SUPER REAL ME'", "2024", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones57_2)
        );
        List<IntegranteDominio> integrantes57 = List.of(
                new IntegranteDominio(new ObjectId(), "Yunah", "Líder, Vocalista", LocalDate.of(2024, 3, 25), null, true),
                new IntegranteDominio(new ObjectId(), "Minju", "Vocalista, Bailarina", LocalDate.of(2024, 3, 25), null, true),
                new IntegranteDominio(new ObjectId(), "Moka", "Bailarina, Vocalista", LocalDate.of(2024, 3, 25), null, true),
                new IntegranteDominio(new ObjectId(), "Wonhee", "Vocalista", LocalDate.of(2024, 3, 25), null, true),
                new IntegranteDominio(new ObjectId(), "Iroha", "Bailarina, Rapera", LocalDate.of(2024, 3, 25), null, true)
        );
        ArtistaDominio a57 = new ArtistaDominio(new ObjectId(), "ILLIT", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes57, albumes57);

        List<CancionDominio> canciones58_1 = List.of(
                new CancionDominio(new ObjectId(), "DREAMCATCHER", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Good Night", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "PIRI", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones58_2 = List.of(
                new CancionDominio(new ObjectId(), "Scream", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Odd Eye", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "MAISON", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes58 = List.of(
                new AlbumDominio(new ObjectId(), "Dystopia : The Tree of Language", "2020", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones58_1),
                new AlbumDominio(new ObjectId(), "Apocalypse : Save Us", "2022", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones58_2)
        );
        List<IntegranteDominio> integrantes58 = List.of(
                new IntegranteDominio(new ObjectId(), "JiU", "Líder, Vocalista", LocalDate.of(2017, 1, 13), null, true),
                new IntegranteDominio(new ObjectId(), "SuA", "Bailarina, Vocalista", LocalDate.of(2017, 1, 13), null, true),
                new IntegranteDominio(new ObjectId(), "Siyeon", "Vocalista", LocalDate.of(2017, 1, 13), null, true),
                new IntegranteDominio(new ObjectId(), "Handong", "Vocalista", LocalDate.of(2017, 1, 13), null, true),
                new IntegranteDominio(new ObjectId(), "Yoohyeon", "Vocalista", LocalDate.of(2017, 1, 13), null, true),
                new IntegranteDominio(new ObjectId(), "Dami", "Rapera, Bailarina", LocalDate.of(2017, 1, 13), null, true),
                new IntegranteDominio(new ObjectId(), "Gahyeon", "Vocalista", LocalDate.of(2017, 1, 13), null, true)
        );
        ArtistaDominio a58 = new ArtistaDominio(new ObjectId(), "Dreamcatcher", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes58, albumes58);

        List<CancionDominio> canciones59_1 = List.of(
                new CancionDominio(new ObjectId(), "Shine", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Naughty Boy", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Daisy", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones59_2 = List.of(
                new CancionDominio(new ObjectId(), "DO or NOT", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Feel It", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Humph!", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes59 = List.of(
                new AlbumDominio(new ObjectId(), "THUMBS UP!", "2019", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones59_1),
                new AlbumDominio(new ObjectId(), "LOVE or TAKE", "2021", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones59_2)
        );
        List<IntegranteDominio> integrantes59 = List.of(
                new IntegranteDominio(new ObjectId(), "Hui", "Líder, Vocalista", LocalDate.of(2016, 10, 10), null, true),
                new IntegranteDominio(new ObjectId(), "Jinho", "Vocalista", LocalDate.of(2016, 10, 10), null, true),
                new IntegranteDominio(new ObjectId(), "Hongseok", "Vocalista", LocalDate.of(2016, 10, 10), null, true),
                new IntegranteDominio(new ObjectId(), "Shinwon", "Vocalista", LocalDate.of(2016, 10, 10), null, true),
                new IntegranteDominio(new ObjectId(), "Yeo One", "Vocalista", LocalDate.of(2016, 10, 10), null, true),
                new IntegranteDominio(new ObjectId(), "Yanan", "Vocalista", LocalDate.of(2016, 10, 10), null, true),
                new IntegranteDominio(new ObjectId(), "Yuto", "Rapero", LocalDate.of(2016, 10, 10), null, true),
                new IntegranteDominio(new ObjectId(), "Kino", "Bailarín, Vocalista", LocalDate.of(2016, 10, 10), null, true),
                new IntegranteDominio(new ObjectId(), "Wooseok", "Rapero", LocalDate.of(2016, 10, 10), null, true)
        );
        ArtistaDominio a59 = new ArtistaDominio(new ObjectId(), "PENTAGON", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes59, albumes59);

        List<CancionDominio> canciones60_1 = List.of(
                new CancionDominio(new ObjectId(), "Adios", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "DUN DUN", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "LA DI DA", "src\\main\\resources\\imagenCancion.png")
        );
        List<CancionDominio> canciones60_2 = List.of(
                new CancionDominio(new ObjectId(), "FIRST", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "PIRATE", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(), "Bon Bon Chocolat", "src\\main\\resources\\imagenCancion.png")
        );
        List<AlbumDominio> albumes60 = List.of(
                new AlbumDominio(new ObjectId(), "REMINISCENCE", "2020", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones60_1),
                new AlbumDominio(new ObjectId(), "RETURN OF THE GIRL", "2021", "K-Pop", "src\\main\\resources\\imagenAlbum.png", canciones60_2)
        );
        List<IntegranteDominio> integrantes60 = List.of(
                new IntegranteDominio(new ObjectId(), "E:U", "Líder, Rapera", LocalDate.of(2019, 3, 18), null, true),
                new IntegranteDominio(new ObjectId(), "Sihyeon", "Vocalista", LocalDate.of(2019, 3, 18), null, true),
                new IntegranteDominio(new ObjectId(), "Mia", "Vocalista, Bailarina", LocalDate.of(2019, 3, 18), null, true),
                new IntegranteDominio(new ObjectId(), "Onda", "Bailarina, Vocalista", LocalDate.of(2019, 3, 18), null, true),
                new IntegranteDominio(new ObjectId(), "Aisha", "Vocalista, Rapera", LocalDate.of(2019, 3, 18), null, true),
                new IntegranteDominio(new ObjectId(), "Yiren", "Bailarina, Vocalista", LocalDate.of(2019, 3, 18), null, true)
        );
        ArtistaDominio a60 = new ArtistaDominio(new ObjectId(), "EVERGLOW", "K-Pop", "src\\main\\resources\\imagenArtista.png", true, integrantes60, albumes60);

        this.artistas = List.of(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15,
                a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30, a31, a32, a33,
                a34, a35, a36, a37, a38, a39, a40, a41, a42, a43, a44, a45,a46,a47,a48,a49,a50,a51,a52,a53,a54,a55,a56,
                a57,a58,a59,a60);
    }

    public List<ArtistaDominio> obtenerDatos() {
        return artistas;
    }
}
