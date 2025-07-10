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
   
        List<CancionDominio> canciones6_1 = List.of(
                new CancionDominio(new ObjectId(),"El Triste", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"La Nave del Olvido", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Amar y Querer", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones6_2 = List.of(
                new CancionDominio(new ObjectId(),"40 y 20", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Gavilán o Paloma", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Lo Pasado, Pasado", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes6 = List.of(
                new AlbumDominio(new ObjectId(),"El Triste", "1970", "Balada", "src\\main\\resources\\imagenAlbum.png", canciones6_1),
                new AlbumDominio(new ObjectId(),"40 y 20", "1992", "Balada", "src\\main\\resources\\imagenAlbum.png", canciones6_2));
        List<IntegranteDominio> integrantes6 = new ArrayList<>();
        ArtistaDominio a6 = new ArtistaDominio(new ObjectId(),"José José", "Balada", "src\\main\\resources\\imagenArtista.png", false, integrantes6, albumes6);

        List<CancionDominio> canciones7_1 = List.of(
                new CancionDominio(new ObjectId(),"Take Me to Church", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Angel of Small Death and the Codeine Scene", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Cherry Wine", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones7_2 = List.of(
                new CancionDominio(new ObjectId(),"Eat Your Young", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Francesca", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Unknown / Nth", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes7 = List.of(
                new AlbumDominio(new ObjectId(),"Hozier", "2014", "Indie Rock", "src\\main\\resources\\imagenAlbum.png", canciones7_1),
                new AlbumDominio(new ObjectId(),"Unreal Unearth", "2023", "Indie Rock", "src\\main\\resources\\imagenAlbum.png", canciones7_2));
        List<IntegranteDominio> integrantes7 = new ArrayList<>();
        ArtistaDominio a7 = new ArtistaDominio(new ObjectId(),"Hozier", "Indie Rock", "src\\main\\resources\\imagenArtista.png", false, integrantes7, albumes7);

        List<CancionDominio> canciones8_1 = List.of(
                new CancionDominio(new ObjectId(),"Grace", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Last Goodbye", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Lover, You Should’ve Come Over", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones8_2 = List.of(
                new CancionDominio(new ObjectId(),"Hallelujah", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Forget Her", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Dream Brother", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes8 = List.of(
                new AlbumDominio(new ObjectId(),"Grace", "1994", "Alternative Rock", "src\\main\\resources\\imagenAlbum.png", canciones8_1),
                new AlbumDominio(new ObjectId(),"Sketches for My Sweetheart the Drunk", "1998", "Alternative Rock", "src\\main\\resources\\imagenAlbum.png", canciones8_2));
        List<IntegranteDominio> integrantes8 = new ArrayList<>();
        ArtistaDominio a8 = new ArtistaDominio(new ObjectId(),"Jeff Buckley", "Alternative Rock", "src\\main\\resources\\imagenArtista.png", false, integrantes8, albumes8);

        List<CancionDominio> canciones9_1 = List.of(
                new CancionDominio(new ObjectId(),"The A Team", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Lego House", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Give Me Love", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones9_2 = List.of(
                new CancionDominio(new ObjectId(),"Shape of You", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Perfect", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Castle on the Hill", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes9 = List.of(
                new AlbumDominio(new ObjectId(),"+ (Plus)", "2011", "Pop", "src\\main\\resources\\imagenAlbum.png", canciones9_1),
                new AlbumDominio(new ObjectId(),"÷ (Divide)", "2017", "Pop", "src\\main\\resources\\imagenAlbum.png", canciones9_2));
        List<IntegranteDominio> integrantes9 = new ArrayList<>();
        ArtistaDominio a9 = new ArtistaDominio(new ObjectId(),"Ed Sheeran", "Pop", "src\\main\\resources\\imagenArtista.png", false, integrantes9, albumes9);

        List<CancionDominio> canciones10_1 = List.of(
                new CancionDominio(new ObjectId(),"Nobody", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Geyser", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Two Slow Dancers", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones10_2 = List.of(
                new CancionDominio(new ObjectId(),"Working for the Knife", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Love Me More", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Heat Lightning", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes10 = List.of(
                new AlbumDominio(new ObjectId(),"Be the Cowboy", "2018", "Indie Rock", "src\\main\\resources\\imagenAlbum.png", canciones10_1),
                new AlbumDominio(new ObjectId(),"Laurel Hell", "2022", "Indie Rock", "src\\main\\resources\\imagenAlbum.png", canciones10_2));
        List<IntegranteDominio> integrantes10 = new ArrayList<>();
        ArtistaDominio a10 = new ArtistaDominio(new ObjectId(),"Mitski", "Indie Rock", "src\\main\\resources\\imagenArtista.png", false, integrantes10, albumes10);

        List<CancionDominio> canciones11_1 = List.of(
                new CancionDominio(new ObjectId(),"Video Games", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Born to Die", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Summertime Sadness", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones11_2 = List.of(
                new CancionDominio(new ObjectId(),"Norman Fucking Rockwell", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Mariners Apartment Complex", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Venice Bitch", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes11 = List.of(
                new AlbumDominio(new ObjectId(),"Born to Die", "2012", "Baroque Pop", "src\\main\\resources\\imagenAlbum.png", canciones11_1),
                new AlbumDominio(new ObjectId(),"Norman Fucking Rockwell!", "2019", "Art Pop", "src\\main\\resources\\imagenAlbum.png", canciones11_2));
        List<IntegranteDominio> integrantes11 = new ArrayList<>();
        ArtistaDominio a11 = new ArtistaDominio(new ObjectId(),"Lana Del Rey", "Art Pop", "src\\main\\resources\\imagenArtista.png", false, integrantes11, albumes11);

        List<CancionDominio> canciones12_1 = List.of(
                new CancionDominio(new ObjectId(),"Pancakes", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"You Could Start a Cult", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Apple Pie", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones12_2 = List.of(
                new CancionDominio(new ObjectId(),"Ceilings", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Erase Me", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Nothing Is Ever Wrong", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes12 = List.of(
                new AlbumDominio(new ObjectId(),"Give Me a Minute", "2020", "Indie Folk", "src\\main\\resources\\imagenAlbum.png", canciones12_1),
                new AlbumDominio(new ObjectId(),"Five Seconds Flat", "2022", "Indie Pop", "src\\main\\resources\\imagenAlbum.png", canciones12_2));
        List<IntegranteDominio> integrantes12 = new ArrayList<>();
        ArtistaDominio a12 = new ArtistaDominio(new ObjectId(),"Lizzy McAlpine", "Indie Folk / Indie Pop", "src\\main\\resources\\imagenArtista.png", false, integrantes12, albumes12);

        List<CancionDominio> canciones13_1 = List.of(
                new CancionDominio(new ObjectId(),"Easy Love", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Mojito", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Romeo", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones13_2 = List.of(
                new CancionDominio(new ObjectId(),"No More Runnin'", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Drive Me", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Cupid", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes13 = List.of(
                new AlbumDominio(new ObjectId(),"Easy Love", "2021", "R&B", "src\\main\\resources\\imagenAlbum.png", canciones13_1),
                new AlbumDominio(new ObjectId(),"Drive Me Crazy", "2023", "R&B / Soul", "src\\main\\resources\\imagenAlbum.png", canciones13_2));
        List<IntegranteDominio> integrantes13 = new ArrayList<>();
        ArtistaDominio a13 = new ArtistaDominio(new ObjectId(),"Gigi Perez", "R&B / Soul", "src\\main\\resources\\imagenArtista.png", false, integrantes13, albumes13);

        List<CancionDominio> canciones14_1 = List.of(
                new CancionDominio(new ObjectId(),"Love Galore", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"The Weekend", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Supermodel", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones14_2 = List.of(
                new CancionDominio(new ObjectId(),"Good Days", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"I Hate U", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Kill Bill", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes14 = List.of(
                new AlbumDominio(new ObjectId(),"Ctrl", "2017", "R&B / Alternative R&B", "src\\main\\resources\\imagenAlbum.png", canciones14_1),
                new AlbumDominio(new ObjectId(),"SOS", "2022", "R&B / Neo Soul", "src\\main\\resources\\imagenAlbum.png", canciones14_2));
        List<IntegranteDominio> integrantes14 = new ArrayList<>();
        ArtistaDominio a14 = new ArtistaDominio(new ObjectId(),"SZA", "R&B / Neo Soul", "src\\main\\resources\\imagenArtista.png", false, integrantes14, albumes14);

        List<CancionDominio> canciones15_1 = List.of(
                new CancionDominio(new ObjectId(),"Mask Off", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"March Madness", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Where Ya At", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones15_2 = List.of(
                new CancionDominio(new ObjectId(),"Life Is Good", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Low Life", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Jumpman", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes15 = List.of(
                new AlbumDominio(new ObjectId(),"Future", "2017", "Hip Hop / Trap", "src\\main\\resources\\imagenAlbum.png", canciones15_1),
                new AlbumDominio(new ObjectId(),"High Off Life", "2020", "Hip Hop / Trap", "src\\main\\resources\\imagenAlbum.png", canciones15_2));
        List<IntegranteDominio> integrantes15 = new ArrayList<>();
        ArtistaDominio a15 = new ArtistaDominio(new ObjectId(),"Future", "Hip Hop / Trap", "src\\main\\resources\\imagenArtista.png", false, integrantes15, albumes15);

        List<CancionDominio> canciones16_1 = List.of(
                new CancionDominio(new ObjectId(),"Creep", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Fake Plastic Trees", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"High and Dry", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones16_2 = List.of(
                new CancionDominio(new ObjectId(),"Paranoid Android", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Karma Police", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"No Surprises", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes16 = List.of(
                new AlbumDominio(new ObjectId(),"Pablo Honey", "1993", "Alternative Rock", "src\\main\\resources\\imagenAlbum.png", canciones16_1),
                new AlbumDominio(new ObjectId(),"OK Computer", "1997", "Alternative Rock", "src\\main\\resources\\imagenAlbum.png", canciones16_2));
        List<IntegranteDominio> integrantes16 = List.of(
                new IntegranteDominio(new ObjectId(),"Thom Yorke", "Vocalista, guitarra", LocalDate.of(1985, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Jonny Greenwood", "Guitarra, teclados", LocalDate.of(1985, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Colin Greenwood", "Bajo", LocalDate.of(1985, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Ed O'Brien", "Guitarra, coros", LocalDate.of(1985, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Philip Selway", "Batería", LocalDate.of(1985, 1, 1), null, true));
        ArtistaDominio a16 = new ArtistaDominio(new ObjectId(),"Radiohead", "Alternative Rock", "src\\main\\resources\\imagenArtista.png", true, integrantes16, albumes16);

        List<CancionDominio> canciones17_1 = List.of(
                new CancionDominio(new ObjectId(),"Bohemian Rhapsody", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"You're My Best Friend", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Somebody to Love", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones17_2 = List.of(
                new CancionDominio(new ObjectId(),"We Will Rock You", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"We Are the Champions", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Another One Bites the Dust", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes17 = List.of(
                new AlbumDominio(new ObjectId(),"A Night at the Opera", "1975", "Rock", "src\\main\\resources\\imagenAlbum.png", canciones17_1),
                new AlbumDominio(new ObjectId(),"News of the World", "1977", "Rock", "src\\main\\resources\\imagenAlbum.png", canciones17_2));
        List<IntegranteDominio> integrantes17 = List.of(
                new IntegranteDominio(new ObjectId(),"Freddie Mercury", "Vocalista, piano", LocalDate.of(1970, 1, 1), LocalDate.of(1991, 11, 24), false),
                new IntegranteDominio(new ObjectId(),"Brian May", "Guitarra, coros", LocalDate.of(1970, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"John Deacon", "Bajo", LocalDate.of(1970, 1, 1), LocalDate.of(1997, 1, 1), false),
                new IntegranteDominio(new ObjectId(),"Roger Taylor", "Batería, coros", LocalDate.of(1970, 1, 1), null, true));
        ArtistaDominio a17 = new ArtistaDominio(new ObjectId(),"Queen", "Rock", "src\\main\\resources\\imagenArtista.png", true, integrantes17, albumes17);

        List<CancionDominio> canciones18_1 = List.of(
                new CancionDominio(new ObjectId(),"This Charming Man", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"What Difference Does It Make?", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Still Ill", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones18_2 = List.of(
                new CancionDominio(new ObjectId(),"There Is a Light That Never Goes Out", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Bigmouth Strikes Again", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"I Know It's Over", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes18 = List.of(
                new AlbumDominio(new ObjectId(),"The Smiths", "1984", "Alternative Rock", "src\\main\\resources\\imagenAlbum.png", canciones18_1),
                new AlbumDominio(new ObjectId(),"The Queen Is Dead", "1986", "Indie Rock", "src\\main\\resources\\imagenAlbum.png", canciones18_2));
        List<IntegranteDominio> integrantes18 = List.of(
                new IntegranteDominio(new ObjectId(),"Morrissey", "Vocalista", LocalDate.of(1982, 1, 1), LocalDate.of(1987, 1, 1), false),
                new IntegranteDominio(new ObjectId(),"Johnny Marr", "Guitarra", LocalDate.of(1982, 1, 1), LocalDate.of(1987, 1, 1), false),
                new IntegranteDominio(new ObjectId(),"Andy Rourke", "Bajo", LocalDate.of(1982, 1, 1), LocalDate.of(1987, 1, 1), false),
                new IntegranteDominio(new ObjectId(),"Mike Joyce", "Batería", LocalDate.of(1982, 1, 1), LocalDate.of(1987, 1, 1), false));
        ArtistaDominio a18 = new ArtistaDominio(new ObjectId(),"The Smiths", "Alternative Rock / Indie Rock", "src\\main\\resources\\imagenArtista.png", false, integrantes18, albumes18);
        
        List<CancionDominio> canciones19_1 = List.of(
                new CancionDominio(new ObjectId(),"What Makes You Beautiful", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"One Thing", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Little Things", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones19_2 = List.of(
                new CancionDominio(new ObjectId(),"Story of My Life", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Drag Me Down", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Night Changes", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes19 = List.of(
                new AlbumDominio(new ObjectId(),"Up All Night", "2011", "Pop", "src\\main\\resources\\imagenAlbum.png", canciones19_1),
                new AlbumDominio(new ObjectId(),"Four", "2014", "Pop Rock", "src\\main\\resources\\imagenAlbum.png", canciones19_2));
        List<IntegranteDominio> integrantes19 = List.of(
                new IntegranteDominio(new ObjectId(),"Harry Styles", "Vocalista", LocalDate.of(2010, 7, 1), LocalDate.of(2016, 1, 1), false),
                new IntegranteDominio(new ObjectId(),"Liam Payne", "Vocalista", LocalDate.of(2010, 7, 1), LocalDate.of(2016, 1, 1), false),
                new IntegranteDominio(new ObjectId(),"Louis Tomlinson", "Vocalista", LocalDate.of(2010, 7, 1), LocalDate.of(2016, 1, 1), false),
                new IntegranteDominio(new ObjectId(),"Niall Horan", "Vocalista", LocalDate.of(2010, 7, 1), LocalDate.of(2016, 1, 1), false),
                new IntegranteDominio(new ObjectId(),"Zayn Malik", "Vocalista", LocalDate.of(2010, 7, 1), LocalDate.of(2015, 3, 25), false));
        ArtistaDominio a19 = new ArtistaDominio(new ObjectId(),"One Direction", "Pop / Pop Rock", "src\\main\\resources\\imagenArtista.png", false, integrantes19, albumes19);

        List<CancionDominio> canciones20_1 = List.of(
                new CancionDominio(new ObjectId(),"Chocolate", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Sex", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Robbers", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones20_2 = List.of(
                new CancionDominio(new ObjectId(),"Love It If We Made It", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"It's Not Living (If It's Not With You)", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Somebody Else", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes20 = List.of(
                new AlbumDominio(new ObjectId(),"The 1975", "2013", "Pop Rock / Indie Pop", "src\\main\\resources\\imagenAlbum.png", canciones20_1),
                new AlbumDominio(new ObjectId(),"A Brief Inquiry into Online Relationships", "2018", "Art Pop / Synth Pop", "src\\main\\resources\\imagenAlbum.png", canciones20_2));
        List<IntegranteDominio> integrantes20 = List.of(
                new IntegranteDominio(new ObjectId(),"Matty Healy", "Vocalista, guitarra", LocalDate.of(2002, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Adam Hann", "Guitarra", LocalDate.of(2002, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Ross MacDonald", "Bajo", LocalDate.of(2002, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"George Daniel", "Batería", LocalDate.of(2002, 1, 1), null, true));
        ArtistaDominio a20 = new ArtistaDominio(new ObjectId(),"The 1975", "Indie Rock / Pop Rock", "src\\main\\resources\\imagenArtista.png", false, integrantes20, albumes20);

        List<CancionDominio> canciones21_1 = List.of(
                new CancionDominio(new ObjectId(),"First Class", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Seven", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Devil Like Me", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones21_2 = List.of(
                new CancionDominio(new ObjectId(),"It's Called: Freefall", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Painkillers", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Hide", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes21 = List.of(
                new AlbumDominio(new ObjectId(),"RKS", "2015", "Indie Rock", "src\\main\\resources\\imagenAlbum.png", canciones21_1),
                new AlbumDominio(new ObjectId(),"How to: Friend, Love, Freefall", "2018", "Alternative Rock", "src\\main\\resources\\imagenAlbum.png", canciones21_2));
        List<IntegranteDominio> integrantes21 = List.of(
                new IntegranteDominio(new ObjectId(),"Ela Melo", "Vocalista", LocalDate.of(2013, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Darrick 'Bozzy' Keller", "Guitarra", LocalDate.of(2013, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Charlie Holt", "Bajo", LocalDate.of(2013, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Jesse Wells", "Teclados, guitarra", LocalDate.of(2013, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Caleb Hickman", "Batería", LocalDate.of(2013, 1, 1), null, true));
        ArtistaDominio a21 = new ArtistaDominio(new ObjectId(),"Rainbow Kitten Surprise", "Indie Rock / Alternative", "src\\main\\resources\\imagenArtista.png", false, integrantes21, albumes21);

        List<CancionDominio> canciones22_1 = List.of(
                new CancionDominio(new ObjectId(),"Push", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"3AM", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Real World", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones22_2 = List.of(
                new CancionDominio(new ObjectId(),"Unwell", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"If You're Gone", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Bent", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes22 = List.of(
                new AlbumDominio(new ObjectId(),"Yourself or Someone Like You", "1996", "Alternative Rock", "src\\main\\resources\\imagenAlbum.png", canciones22_1),
                new AlbumDominio(new ObjectId(),"Mad Season", "2000", "Pop Rock / Alternative", "src\\main\\resources\\imagenAlbum.png", canciones22_2));
        List<IntegranteDominio> integrantes22 = List.of(
                new IntegranteDominio(new ObjectId(),"Rob Thomas", "Vocalista, piano", LocalDate.of(1995, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Brian Yale", "Bajo", LocalDate.of(1995, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Paul Doucette", "Batería / guitarra rítmica", LocalDate.of(1995, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Kyle Cook", "Guitarra líder, coros", LocalDate.of(1995, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Adam Gaynor", "Guitarra rítmica, coros", LocalDate.of(1995, 1, 1), LocalDate.of(2005, 1, 1), false));
        ArtistaDominio a22 = new ArtistaDominio(new ObjectId(),"Matchbox Twenty", "Pop Rock / Alternative Rock", "src\\main\\resources\\imagenArtista.png", false, integrantes22, albumes22);

        List<CancionDominio> canciones23_1 = List.of(
                new CancionDominio(new ObjectId(),"Rhiannon", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Landslide", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Say You Love Me", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones23_2 = List.of(
                new CancionDominio(new ObjectId(),"Dreams", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Go Your Own Way", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"The Chain", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes23 = List.of(
                new AlbumDominio(new ObjectId(),"Fleetwood Mac", "1975", "Soft Rock", "src\\main\\resources\\imagenAlbum.png", canciones23_1),
                new AlbumDominio(new ObjectId(),"Rumours", "1977", "Pop Rock / Classic Rock", "src\\main\\resources\\imagenAlbum.png", canciones23_2));
        List<IntegranteDominio> integrantes23 = List.of(
                new IntegranteDominio(new ObjectId(),"Mick Fleetwood", "Batería", LocalDate.of(1967, 7, 1), null, true),
                new IntegranteDominio(new ObjectId(),"John McVie", "Bajo", LocalDate.of(1967, 7, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Stevie Nicks", "Voz", LocalDate.of(1975, 1, 1), LocalDate.of(2023, 1, 1), false),
                new IntegranteDominio(new ObjectId(),"Lindsey Buckingham", "Guitarra, voz", LocalDate.of(1975, 1, 1), LocalDate.of(2018, 4, 1), false),
                new IntegranteDominio(new ObjectId(),"Christine McVie", "Teclado, voz", LocalDate.of(1970, 1, 1), LocalDate.of(2022, 11, 30), false));
        ArtistaDominio a23 = new ArtistaDominio(new ObjectId(),"Fleetwood Mac", "Rock / Soft Rock / Pop Rock", "src\\main\\resources\\imagenArtista.png", false, integrantes23, albumes23);

        List<CancionDominio> canciones24_1 = List.of(
                new CancionDominio(new ObjectId(),"Drops of Jupiter", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Meet Virginia", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Calling All Angels", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones24_2 = List.of(
                new CancionDominio(new ObjectId(),"Hey, Soul Sister", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Marry Me", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"If It's Love", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes24 = List.of(
                new AlbumDominio(new ObjectId(),"Drops of Jupiter", "2001", "Alternative Rock", "src\\main\\resources\\imagenAlbum.png", canciones24_1),
                new AlbumDominio(new ObjectId(),"Save Me, San Francisco", "2009", "Pop Rock", "src\\main\\resources\\imagenAlbum.png", canciones24_2));
        List<IntegranteDominio> integrantes24 = List.of(
                new IntegranteDominio(new ObjectId(),"Pat Monahan", "Vocalista", LocalDate.of(1993, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Luis Maldonado", "Guitarra", LocalDate.of(2014, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Hector Maldonado", "Bajo", LocalDate.of(2009, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Jerry Becker", "Teclado, guitarra", LocalDate.of(2008, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Drew Shoals", "Batería", LocalDate.of(2014, 1, 1), LocalDate.of(2022, 1, 1), false));
        ArtistaDominio a24 = new ArtistaDominio(new ObjectId(),"Train", "Pop Rock / Alternative Rock", "src\\main\\resources\\imagenArtista.png", false, integrantes24, albumes24);

        List<CancionDominio> canciones25_1 = List.of(
                new CancionDominio(new ObjectId(),"I Bet You Look Good on the Dancefloor", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Mardy Bum", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"When the Sun Goes Down", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones25_2 = List.of(
                new CancionDominio(new ObjectId(),"Do I Wanna Know?", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"R U Mine?", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Why'd You Only Call Me When You're High?", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes25 = List.of(
                new AlbumDominio(new ObjectId(),"Whatever People Say I Am, That's What I'm Not", "2006", "Garage Rock / Indie Rock", "src\\main\\resources\\imagenAlbum.png", canciones25_1),
                new AlbumDominio(new ObjectId(),"AM", "2013", "Indie Rock / Psychedelic Rock", "src\\main\\resources\\imagenAlbum.png", canciones25_2));
        List<IntegranteDominio> integrantes25 = List.of(
                new IntegranteDominio(new ObjectId(),"Alex Turner", "Vocalista, guitarra", LocalDate.of(2002, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Matt Helders", "Batería, coros", LocalDate.of(2002, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Jamie Cook", "Guitarra", LocalDate.of(2002, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Nick O'Malley", "Bajo", LocalDate.of(2006, 6, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Andy Nicholson", "Bajo", LocalDate.of(2002, 1, 1), LocalDate.of(2006, 5, 1), false));
        ArtistaDominio a25 = new ArtistaDominio(new ObjectId(),"Arctic Monkeys", "Indie Rock / Garage Rock", "src\\main\\resources\\imagenArtista.png", false, integrantes25, albumes25);

        List<CancionDominio> canciones26_1 = List.of(
                new CancionDominio(new ObjectId(),"Yellow", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Trouble", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Shiver", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones26_2 = List.of(
                new CancionDominio(new ObjectId(),"Viva La Vida", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Violet Hill", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Lost!", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes26 = List.of(
                new AlbumDominio(new ObjectId(),"Parachutes", "2000", "Alternative Rock / Britpop", "src\\main\\resources\\imagenAlbum.png", canciones26_1),
                new AlbumDominio(new ObjectId(),"Viva la Vida or Death and All His Friends", "2008", "Art Rock / Baroque Pop", "src\\main\\resources\\imagenAlbum.png", canciones26_2));
        List<IntegranteDominio> integrantes26 = List.of(
                new IntegranteDominio(new ObjectId(),"Chris Martin", "Vocalista, piano, guitarra", LocalDate.of(1996, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Jonny Buckland", "Guitarra líder", LocalDate.of(1996, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Guy Berryman", "Bajo", LocalDate.of(1996, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Will Champion", "Batería, coros", LocalDate.of(1997, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Phil Harvey", "Director creativo / ex-mánager", LocalDate.of(1996, 1, 1), null, true));
        ArtistaDominio a26 = new ArtistaDominio(new ObjectId(),"Coldplay", "Alternative Rock / Pop Rock", "src\\main\\resources\\imagenArtista.png", false, integrantes26, albumes26);

        List<CancionDominio> canciones27_1 = List.of(
                new CancionDominio(new ObjectId(),"This Love", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"She Will Be Loved", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Harder to Breathe", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones27_2 = List.of(
                new CancionDominio(new ObjectId(),"Sugar", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Animals", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Maps", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes27 = List.of(
                new AlbumDominio(new ObjectId(),"Songs About Jane", "2002", "Pop Rock / Funk Rock", "src\\main\\resources\\imagenAlbum.png", canciones27_1),
                new AlbumDominio(new ObjectId(),"V", "2014", "Pop / Pop Rock", "src\\main\\resources\\imagenAlbum.png", canciones27_2));
        List<IntegranteDominio> integrantes27 = List.of(
                new IntegranteDominio(new ObjectId(),"Adam Levine", "Vocalista", LocalDate.of(2001, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Jesse Carmichael", "Teclado, guitarra rítmica", LocalDate.of(2001, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"James Valentine", "Guitarra líder", LocalDate.of(2001, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Mickey Madden", "Bajo", LocalDate.of(2001, 1, 1), LocalDate.of(2020, 7, 1), false),
                new IntegranteDominio(new ObjectId(),"Matt Flynn", "Batería", LocalDate.of(2006, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"PJ Morton", "Teclado", LocalDate.of(2012, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Sam Farrar", "Multiinstrumentista", LocalDate.of(2016, 1, 1), null, true));
        ArtistaDominio a27 = new ArtistaDominio(new ObjectId(),"Maroon 5", "Pop Rock / Funk Pop", "src\\main\\resources\\imagenArtista.png", false, integrantes27, albumes27);

        
        List<CancionDominio> canciones28_1 = List.of(
                new CancionDominio(new ObjectId(),"Mr. Brightside", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Somebody Told Me", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"All These Things That I've Done", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones28_2 = List.of(
                new CancionDominio(new ObjectId(),"Human", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Spaceman", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"A Dustland Fairytale", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes28 = List.of(
                new AlbumDominio(new ObjectId(),"Hot Fuss", "2004", "Alternative Rock / Post-Punk Revival", "src\\main\\resources\\imagenAlbum.png", canciones28_1),
                new AlbumDominio(new ObjectId(),"Day & Age", "2008", "Synthpop / New Wave", "src\\main\\resources\\imagenAlbum.png", canciones28_2));
        List<IntegranteDominio> integrantes28 = List.of(
                new IntegranteDominio(new ObjectId(),"Brandon Flowers", "Vocalista, teclado", LocalDate.of(2001, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Dave Keuning", "Guitarra", LocalDate.of(2001, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Mark Stoermer", "Bajo", LocalDate.of(2002, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Ronnie Vannucci Jr.", "Batería", LocalDate.of(2002, 1, 1), null, true));
        ArtistaDominio a28 = new ArtistaDominio(new ObjectId(),"The Killers", "Alternative Rock / Indie Rock / Synthpop", "src\\main\\resources\\imagenArtista.png", false, integrantes28, albumes28);

        List<CancionDominio> canciones29_1 = List.of(
                new CancionDominio(new ObjectId(),"Sweater Weather", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Afraid", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Female Robbery", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones29_2 = List.of(
                new CancionDominio(new ObjectId(),"Daddy Issues", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Cry Baby", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"The Beach", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes29 = List.of(
                new AlbumDominio(new ObjectId(),"I Love You.", "2013", "Indie Rock / Alternative R&B", "src\\main\\resources\\imagenAlbum.png", canciones29_1),
                new AlbumDominio(new ObjectId(),"Wiped Out!", "2015", "Alternative Rock / Dream Pop", "src\\main\\resources\\imagenAlbum.png", canciones29_2));
        List<IntegranteDominio> integrantes29 = List.of(
                new IntegranteDominio(new ObjectId(),"Jesse Rutherford", "Vocalista", LocalDate.of(2011, 1, 1), LocalDate.of(2022, 10, 1), false),
                new IntegranteDominio(new ObjectId(),"Zach Abels", "Guitarra", LocalDate.of(2011, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Jeremy Freedman", "Guitarra rítmica", LocalDate.of(2011, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Mikey Margott", "Bajo", LocalDate.of(2011, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Brandon Fried", "Batería", LocalDate.of(2014, 1, 1), LocalDate.of(2022, 11, 1), false));
        ArtistaDominio a29 = new ArtistaDominio(new ObjectId(),"The Neighbourhood", "Indie Rock / Alternative R&B", "src\\main\\resources\\imagenArtista.png", false, integrantes29, albumes29);

        List<CancionDominio> canciones30_1 = List.of(
                new CancionDominio(new ObjectId(),"Ho Hey", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Stubborn Love", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Submarines", "src\\main\\resources\\imagenCancion.png"));
        List<CancionDominio> canciones30_2 = List.of(
                new CancionDominio(new ObjectId(),"Ophelia", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Angela", "src\\main\\resources\\imagenCancion.png"),
                new CancionDominio(new ObjectId(),"Sleep on the Floor", "src\\main\\resources\\imagenCancion.png"));
        List<AlbumDominio> albumes30 = List.of(
                new AlbumDominio(new ObjectId(),"The Lumineers", "2012", "Folk Rock / Americana", "src\\main\\resources\\imagenAlbum.png", canciones30_1),
                new AlbumDominio(new ObjectId(),"Cleopatra", "2016", "Folk Rock / Indie Folk", "src\\main\\resources\\imagenAlbum.png", canciones30_2));
        List<IntegranteDominio> integrantes30 = List.of(
                new IntegranteDominio(new ObjectId(),"Wesley Schultz", "Vocalista y guitarra", LocalDate.of(2005, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Jeremy Fraites", "Batería y percusión", LocalDate.of(2005, 1, 1), null, true),
                new IntegranteDominio(new ObjectId(),"Neyla Pekarek", "Cello y coros", LocalDate.of(2009, 1, 1), LocalDate.of(2018, 1, 1), false));
        ArtistaDominio a30 = new ArtistaDominio(new ObjectId(),"The Lumineers", "Folk Rock / Americana", "src\\main\\resources\\imagenArtista.png", false, integrantes30, albumes30);

        
        this.artistas = List.of(a1,a2,a3,a4,a5,a6, a7, a8, a9, a10, a11, a12, a13, a14, a15,
        a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30);
    }
    
    public List<ArtistaDominio> obtenerDatos(){
        return artistas;
    }
}
