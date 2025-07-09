/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalpersistencia.datos;

import itson.sistemabibliotecamusicaldominio.AlbumDominio;
import itson.sistemabibliotecamusicaldominio.ArtistaDominio;
import itson.sistemabibliotecamusicaldominio.CancionDominio;
import itson.sistemabibliotecamusicaldominio.IntegrantesDominio;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Camila Zubía
 */
public class DatosAInsertar {
    
    private final List<ArtistaDominio> artistas;

    public DatosAInsertar() {
        
        List<CancionDominio> canciones1_1 = List.of(
                new CancionDominio("Howling"),
                new CancionDominio("Call your mom"),
                new CancionDominio("No Complaints"));
        List<CancionDominio> canciones1_2 = List.of(
                new CancionDominio("Come Over"),
                new CancionDominio("Forever"),
                new CancionDominio("Your Needs, My Needs"));
        List<AlbumDominio> albumes1 = List.of(
                new AlbumDominio("Stick Season", "2023", "Folk-pop", "url", canciones1_1),
                new AlbumDominio("Busyhead", "2019", "Folk-pop", "url", canciones1_2));
        List<IntegrantesDominio> integrantes1 = new ArrayList<>();
        ArtistaDominio a1 = new ArtistaDominio("Noah Kahan", "Folk-pop", "url", false, integrantes1, albumes1);

        List<CancionDominio> canciones2_1 = List.of(
                new CancionDominio("Dress"),
                new CancionDominio("King Of My Heart"),
                new CancionDominio("Call It What You Want"));
        List<CancionDominio> canciones2_2 = List.of(
                new CancionDominio("exile"),
                new CancionDominio("mirrorball"),
                new CancionDominio("peace"));
        List<AlbumDominio> albumes2 = List.of(
                new AlbumDominio("Reputation", "2017", "Pop", "url", canciones2_1),
                new AlbumDominio("Folklore", "2020", "Pop", "url", canciones2_2));
        List<IntegrantesDominio> integrantes2 = new ArrayList<>();
        ArtistaDominio a2 = new ArtistaDominio("Taylor Swift", "Pop", "url", false, integrantes2, albumes2);

        List<CancionDominio> canciones3_1 = List.of(
                new CancionDominio("Heartless"),
                new CancionDominio("After Hours"),
                new CancionDominio("Alone Again"));
        List<CancionDominio> canciones3_2 = List.of(
                new CancionDominio("Sidewalks"),
                new CancionDominio("Party Monster"),
                new CancionDominio("Die For You"));
        List<AlbumDominio> albumes3 = List.of(
                new AlbumDominio("After Hours", "2020", "R&B", "url", canciones3_1),
                new AlbumDominio("Starboy", "2016", "R&B", "url", canciones3_2));
        List<IntegrantesDominio> integrantes3 = new ArrayList<>();
        ArtistaDominio a3 = new ArtistaDominio("The Weeknd", "R&B", "url", false, integrantes3, albumes3);

        List<CancionDominio> canciones4_1 = List.of(
                new CancionDominio("Bonfire"),
                new CancionDominio("Heartbeat"),
                new CancionDominio("Les"));
        List<CancionDominio> canciones4_2 = List.of(
                new CancionDominio("Freaks And Geeks"),
                new CancionDominio("My Shine"),
                new CancionDominio("Lights Turned On"));
        List<AlbumDominio> albumes4 = List.of(
                new AlbumDominio("Camp", "2011", "Rap", "url", canciones4_1),
                new AlbumDominio("EP", "2018", "Rap", "url", canciones4_2));
        List<IntegrantesDominio> integrantes4 = new ArrayList<>();
        ArtistaDominio a4 = new ArtistaDominio("Childish Gambino", "Rap", "url", false, integrantes4, albumes4);

        List<CancionDominio> canciones5_1 = List.of(
                new CancionDominio("Ivy"),
                new CancionDominio("Nights"),
                new CancionDominio("White Ferrari"));
        List<CancionDominio> canciones5_2 = List.of(
                new CancionDominio("Pyramids"),
                new CancionDominio("Lost"),
                new CancionDominio("Pilot Jones"));
        List<AlbumDominio> albumes5 = List.of(
                new AlbumDominio("Blonde", "2016", "R&B", "url", canciones5_1),
                new AlbumDominio("channel ORANGE", "2012", "R&B", "url", canciones5_2));
        List<IntegrantesDominio> integrantes5 = new ArrayList<>();
        ArtistaDominio a5 = new ArtistaDominio("Frank Ocean", "R&B", "url", false, integrantes5, albumes5);
        
        List<CancionDominio> canciones6_1 = List.of(
                new CancionDominio("El Triste"),
                new CancionDominio("La Nave del Olvido"),
                new CancionDominio("Amar y Querer"));
        List<CancionDominio> canciones6_2 = List.of(
                new CancionDominio("40 y 20"),
                new CancionDominio("Gavilán o Paloma"),
                new CancionDominio("Lo Pasado, Pasado"));
        List<AlbumDominio> albumes6 = List.of(
                new AlbumDominio("El Triste", "1970", "Balada", "url", canciones6_1),
                new AlbumDominio("40 y 20", "1992", "Balada", "url", canciones6_2));
        List<IntegrantesDominio> integrantes6 = new ArrayList<>();
        ArtistaDominio a6 = new ArtistaDominio("José José", "Balada", "url", false, integrantes6, albumes6);

        List<CancionDominio> canciones7_1 = List.of(
                new CancionDominio("Take Me to Church"),
                new CancionDominio("Angel of Small Death and the Codeine Scene"),
                new CancionDominio("Cherry Wine"));
        List<CancionDominio> canciones7_2 = List.of(
                new CancionDominio("Eat Your Young"),
                new CancionDominio("Francesca"),
                new CancionDominio("Unknown / Nth"));
        List<AlbumDominio> albumes7 = List.of(
                new AlbumDominio("Hozier", "2014", "Indie Rock", "url", canciones7_1),
                new AlbumDominio("Unreal Unearth", "2023", "Indie Rock", "url", canciones7_2));
        List<IntegrantesDominio> integrantes7 = new ArrayList<>();
        ArtistaDominio a7 = new ArtistaDominio("Hozier", "Indie Rock", "url", false, integrantes7, albumes7);

        List<CancionDominio> canciones8_1 = List.of(
                new CancionDominio("Grace"),
                new CancionDominio("Last Goodbye"),
                new CancionDominio("Lover, You Should’ve Come Over"));
        List<CancionDominio> canciones8_2 = List.of(
                new CancionDominio("Hallelujah"),
                new CancionDominio("Forget Her"),
                new CancionDominio("Dream Brother"));
        List<AlbumDominio> albumes8 = List.of(
                new AlbumDominio("Grace", "1994", "Alternative Rock", "url", canciones8_1),
                new AlbumDominio("Sketches for My Sweetheart the Drunk", "1998", "Alternative Rock", "url", canciones8_2));
        List<IntegrantesDominio> integrantes8 = new ArrayList<>();
        ArtistaDominio a8 = new ArtistaDominio("Jeff Buckley", "Alternative Rock", "url", false, integrantes8, albumes8);

        List<CancionDominio> canciones9_1 = List.of(
                new CancionDominio("The A Team"),
                new CancionDominio("Lego House"),
                new CancionDominio("Give Me Love"));
        List<CancionDominio> canciones9_2 = List.of(
                new CancionDominio("Shape of You"),
                new CancionDominio("Perfect"),
                new CancionDominio("Castle on the Hill"));
        List<AlbumDominio> albumes9 = List.of(
                new AlbumDominio("+ (Plus)", "2011", "Pop", "url", canciones9_1),
                new AlbumDominio("÷ (Divide)", "2017", "Pop", "url", canciones9_2));
        List<IntegrantesDominio> integrantes9 = new ArrayList<>();
        ArtistaDominio a9 = new ArtistaDominio("Ed Sheeran", "Pop", "url", false, integrantes9, albumes9);

        List<CancionDominio> canciones10_1 = List.of(
                new CancionDominio("Nobody"),
                new CancionDominio("Geyser"),
                new CancionDominio("Two Slow Dancers"));
        List<CancionDominio> canciones10_2 = List.of(
                new CancionDominio("Working for the Knife"),
                new CancionDominio("Love Me More"),
                new CancionDominio("Heat Lightning"));
        List<AlbumDominio> albumes10 = List.of(
                new AlbumDominio("Be the Cowboy", "2018", "Indie Rock", "url", canciones10_1),
                new AlbumDominio("Laurel Hell", "2022", "Indie Rock", "url", canciones10_2));
        List<IntegrantesDominio> integrantes10 = new ArrayList<>();
        ArtistaDominio a10 = new ArtistaDominio("Mitski", "Indie Rock", "url", false, integrantes10, albumes10);

        List<CancionDominio> canciones11_1 = List.of(
                new CancionDominio("Video Games"),
                new CancionDominio("Born to Die"),
                new CancionDominio("Summertime Sadness"));
        List<CancionDominio> canciones11_2 = List.of(
                new CancionDominio("Norman Fucking Rockwell"),
                new CancionDominio("Mariners Apartment Complex"),
                new CancionDominio("Venice Bitch"));
        List<AlbumDominio> albumes11 = List.of(
                new AlbumDominio("Born to Die", "2012", "Baroque Pop", "url", canciones11_1),
                new AlbumDominio("Norman Fucking Rockwell!", "2019", "Art Pop", "url", canciones11_2));
        List<IntegrantesDominio> integrantes11 = new ArrayList<>();
        ArtistaDominio a11 = new ArtistaDominio("Lana Del Rey", "Art Pop", "url", false, integrantes11, albumes11);

        List<CancionDominio> canciones12_1 = List.of(
                new CancionDominio("Pancakes"),
                new CancionDominio("You Could Start a Cult"),
                new CancionDominio("Apple Pie"));
        List<CancionDominio> canciones12_2 = List.of(
                new CancionDominio("Ceilings"),
                new CancionDominio("Erase Me"),
                new CancionDominio("Nothing Is Ever Wrong"));
        List<AlbumDominio> albumes12 = List.of(
                new AlbumDominio("Give Me a Minute", "2020", "Indie Folk", "url", canciones12_1),
                new AlbumDominio("Five Seconds Flat", "2022", "Indie Pop", "url", canciones12_2));
        List<IntegrantesDominio> integrantes12 = new ArrayList<>();
        ArtistaDominio a12 = new ArtistaDominio("Lizzy McAlpine", "Indie Folk / Indie Pop", "url", false, integrantes12, albumes12);

        List<CancionDominio> canciones13_1 = List.of(
                new CancionDominio("Easy Love"),
                new CancionDominio("Mojito"),
                new CancionDominio("Romeo"));
        List<CancionDominio> canciones13_2 = List.of(
                new CancionDominio("No More Runnin'"),
                new CancionDominio("Drive Me"),
                new CancionDominio("Cupid"));
        List<AlbumDominio> albumes13 = List.of(
                new AlbumDominio("Easy Love", "2021", "R&B", "url", canciones13_1),
                new AlbumDominio("Drive Me Crazy", "2023", "R&B / Soul", "url", canciones13_2));
        List<IntegrantesDominio> integrantes13 = new ArrayList<>();
        ArtistaDominio a13 = new ArtistaDominio("Gigi Perez", "R&B / Soul", "url", false, integrantes13, albumes13);

        List<CancionDominio> canciones14_1 = List.of(
                new CancionDominio("Love Galore"),
                new CancionDominio("The Weekend"),
                new CancionDominio("Supermodel"));
        List<CancionDominio> canciones14_2 = List.of(
                new CancionDominio("Good Days"),
                new CancionDominio("I Hate U"),
                new CancionDominio("Kill Bill"));
        List<AlbumDominio> albumes14 = List.of(
                new AlbumDominio("Ctrl", "2017", "R&B / Alternative R&B", "url", canciones14_1),
                new AlbumDominio("SOS", "2022", "R&B / Neo Soul", "url", canciones14_2));
        List<IntegrantesDominio> integrantes14 = new ArrayList<>();
        ArtistaDominio a14 = new ArtistaDominio("SZA", "R&B / Neo Soul", "url", false, integrantes14, albumes14);

        List<CancionDominio> canciones15_1 = List.of(
                new CancionDominio("Mask Off"),
                new CancionDominio("March Madness"),
                new CancionDominio("Where Ya At"));
        List<CancionDominio> canciones15_2 = List.of(
                new CancionDominio("Life Is Good"),
                new CancionDominio("Low Life"),
                new CancionDominio("Jumpman"));
        List<AlbumDominio> albumes15 = List.of(
                new AlbumDominio("Future", "2017", "Hip Hop / Trap", "url", canciones15_1),
                new AlbumDominio("High Off Life", "2020", "Hip Hop / Trap", "url", canciones15_2));
        List<IntegrantesDominio> integrantes15 = new ArrayList<>();
        ArtistaDominio a15 = new ArtistaDominio("Future", "Hip Hop / Trap", "url", false, integrantes15, albumes15);

        List<CancionDominio> canciones16_1 = List.of(
                new CancionDominio("Creep"),
                new CancionDominio("Fake Plastic Trees"),
                new CancionDominio("High and Dry"));
        List<CancionDominio> canciones16_2 = List.of(
                new CancionDominio("Paranoid Android"),
                new CancionDominio("Karma Police"),
                new CancionDominio("No Surprises"));
        List<AlbumDominio> albumes16 = List.of(
                new AlbumDominio("Pablo Honey", "1993", "Alternative Rock", "url", canciones16_1),
                new AlbumDominio("OK Computer", "1997", "Alternative Rock", "url", canciones16_2));
        List<IntegrantesDominio> integrantes16 = List.of(
                new IntegrantesDominio("Thom Yorke", "Vocalista, guitarra", LocalDate.of(1985, 1, 1), null, true),
                new IntegrantesDominio("Jonny Greenwood", "Guitarra, teclados", LocalDate.of(1985, 1, 1), null, true),
                new IntegrantesDominio("Colin Greenwood", "Bajo", LocalDate.of(1985, 1, 1), null, true),
                new IntegrantesDominio("Ed O'Brien", "Guitarra, coros", LocalDate.of(1985, 1, 1), null, true),
                new IntegrantesDominio("Philip Selway", "Batería", LocalDate.of(1985, 1, 1), null, true));
        ArtistaDominio a16 = new ArtistaDominio("Radiohead", "Alternative Rock", "url", true, integrantes16, albumes16);

        List<CancionDominio> canciones17_1 = List.of(
                new CancionDominio("Bohemian Rhapsody"),
                new CancionDominio("You're My Best Friend"),
                new CancionDominio("Somebody to Love"));
        List<CancionDominio> canciones17_2 = List.of(
                new CancionDominio("We Will Rock You"),
                new CancionDominio("We Are the Champions"),
                new CancionDominio("Another One Bites the Dust"));
        List<AlbumDominio> albumes17 = List.of(
                new AlbumDominio("A Night at the Opera", "1975", "Rock", "url", canciones17_1),
                new AlbumDominio("News of the World", "1977", "Rock", "url", canciones17_2));
        List<IntegrantesDominio> integrantes17 = List.of(
                new IntegrantesDominio("Freddie Mercury", "Vocalista, piano", LocalDate.of(1970, 1, 1), LocalDate.of(1991, 11, 24), false),
                new IntegrantesDominio("Brian May", "Guitarra, coros", LocalDate.of(1970, 1, 1), null, true),
                new IntegrantesDominio("John Deacon", "Bajo", LocalDate.of(1970, 1, 1), LocalDate.of(1997, 1, 1), false),
                new IntegrantesDominio("Roger Taylor", "Batería, coros", LocalDate.of(1970, 1, 1), null, true));
        ArtistaDominio a17 = new ArtistaDominio("Queen", "Rock", "url", true, integrantes17, albumes17);

        List<CancionDominio> canciones18_1 = List.of(
                new CancionDominio("This Charming Man"),
                new CancionDominio("What Difference Does It Make?"),
                new CancionDominio("Still Ill"));
        List<CancionDominio> canciones18_2 = List.of(
                new CancionDominio("There Is a Light That Never Goes Out"),
                new CancionDominio("Bigmouth Strikes Again"),
                new CancionDominio("I Know It's Over"));
        List<AlbumDominio> albumes18 = List.of(
                new AlbumDominio("The Smiths", "1984", "Alternative Rock", "url", canciones18_1),
                new AlbumDominio("The Queen Is Dead", "1986", "Indie Rock", "url", canciones18_2));
        List<IntegrantesDominio> integrantes18 = List.of(
                new IntegrantesDominio("Morrissey", "Vocalista", LocalDate.of(1982, 1, 1), LocalDate.of(1987, 1, 1), false),
                new IntegrantesDominio("Johnny Marr", "Guitarra", LocalDate.of(1982, 1, 1), LocalDate.of(1987, 1, 1), false),
                new IntegrantesDominio("Andy Rourke", "Bajo", LocalDate.of(1982, 1, 1), LocalDate.of(1987, 1, 1), false),
                new IntegrantesDominio("Mike Joyce", "Batería", LocalDate.of(1982, 1, 1), LocalDate.of(1987, 1, 1), false));
        ArtistaDominio a18 = new ArtistaDominio("The Smiths", "Alternative Rock / Indie Rock", "url", false, integrantes18, albumes18);
        
        List<CancionDominio> canciones19_1 = List.of(
                new CancionDominio("What Makes You Beautiful"),
                new CancionDominio("One Thing"),
                new CancionDominio("Little Things"));
        List<CancionDominio> canciones19_2 = List.of(
                new CancionDominio("Story of My Life"),
                new CancionDominio("Drag Me Down"),
                new CancionDominio("Night Changes"));
        List<AlbumDominio> albumes19 = List.of(
                new AlbumDominio("Up All Night", "2011", "Pop", "url", canciones19_1),
                new AlbumDominio("Four", "2014", "Pop Rock", "url", canciones19_2));
        List<IntegrantesDominio> integrantes19 = List.of(
                new IntegrantesDominio("Harry Styles", "Vocalista", LocalDate.of(2010, 7, 1), LocalDate.of(2016, 1, 1), false),
                new IntegrantesDominio("Liam Payne", "Vocalista", LocalDate.of(2010, 7, 1), LocalDate.of(2016, 1, 1), false),
                new IntegrantesDominio("Louis Tomlinson", "Vocalista", LocalDate.of(2010, 7, 1), LocalDate.of(2016, 1, 1), false),
                new IntegrantesDominio("Niall Horan", "Vocalista", LocalDate.of(2010, 7, 1), LocalDate.of(2016, 1, 1), false),
                new IntegrantesDominio("Zayn Malik", "Vocalista", LocalDate.of(2010, 7, 1), LocalDate.of(2015, 3, 25), false));
        ArtistaDominio a19 = new ArtistaDominio("One Direction", "Pop / Pop Rock", "url", false, integrantes19, albumes19);

        List<CancionDominio> canciones20_1 = List.of(
                new CancionDominio("Chocolate"),
                new CancionDominio("Sex"),
                new CancionDominio("Robbers"));
        List<CancionDominio> canciones20_2 = List.of(
                new CancionDominio("Love It If We Made It"),
                new CancionDominio("It's Not Living (If It's Not With You)"),
                new CancionDominio("Somebody Else"));
        List<AlbumDominio> albumes20 = List.of(
                new AlbumDominio("The 1975", "2013", "Pop Rock / Indie Pop", "url", canciones20_1),
                new AlbumDominio("A Brief Inquiry into Online Relationships", "2018", "Art Pop / Synth Pop", "url", canciones20_2));
        List<IntegrantesDominio> integrantes20 = List.of(
                new IntegrantesDominio("Matty Healy", "Vocalista, guitarra", LocalDate.of(2002, 1, 1), null, true),
                new IntegrantesDominio("Adam Hann", "Guitarra", LocalDate.of(2002, 1, 1), null, true),
                new IntegrantesDominio("Ross MacDonald", "Bajo", LocalDate.of(2002, 1, 1), null, true),
                new IntegrantesDominio("George Daniel", "Batería", LocalDate.of(2002, 1, 1), null, true));
        ArtistaDominio a20 = new ArtistaDominio("The 1975", "Indie Rock / Pop Rock", "url", false, integrantes20, albumes20);

        List<CancionDominio> canciones21_1 = List.of(
                new CancionDominio("First Class"),
                new CancionDominio("Seven"),
                new CancionDominio("Devil Like Me"));
        List<CancionDominio> canciones21_2 = List.of(
                new CancionDominio("It's Called: Freefall"),
                new CancionDominio("Painkillers"),
                new CancionDominio("Hide"));
        List<AlbumDominio> albumes21 = List.of(
                new AlbumDominio("RKS", "2015", "Indie Rock", "url", canciones21_1),
                new AlbumDominio("How to: Friend, Love, Freefall", "2018", "Alternative Rock", "url", canciones21_2));
        List<IntegrantesDominio> integrantes21 = List.of(
                new IntegrantesDominio("Ela Melo", "Vocalista", LocalDate.of(2013, 1, 1), null, true),
                new IntegrantesDominio("Darrick 'Bozzy' Keller", "Guitarra", LocalDate.of(2013, 1, 1), null, true),
                new IntegrantesDominio("Charlie Holt", "Bajo", LocalDate.of(2013, 1, 1), null, true),
                new IntegrantesDominio("Jesse Wells", "Teclados, guitarra", LocalDate.of(2013, 1, 1), null, true),
                new IntegrantesDominio("Caleb Hickman", "Batería", LocalDate.of(2013, 1, 1), null, true));
        ArtistaDominio a21 = new ArtistaDominio("Rainbow Kitten Surprise", "Indie Rock / Alternative", "url", false, integrantes21, albumes21);

        List<CancionDominio> canciones22_1 = List.of(
                new CancionDominio("Push"),
                new CancionDominio("3AM"),
                new CancionDominio("Real World"));
        List<CancionDominio> canciones22_2 = List.of(
                new CancionDominio("Unwell"),
                new CancionDominio("If You're Gone"),
                new CancionDominio("Bent"));
        List<AlbumDominio> albumes22 = List.of(
                new AlbumDominio("Yourself or Someone Like You", "1996", "Alternative Rock", "url", canciones22_1),
                new AlbumDominio("Mad Season", "2000", "Pop Rock / Alternative", "url", canciones22_2));
        List<IntegrantesDominio> integrantes22 = List.of(
                new IntegrantesDominio("Rob Thomas", "Vocalista, piano", LocalDate.of(1995, 1, 1), null, true),
                new IntegrantesDominio("Brian Yale", "Bajo", LocalDate.of(1995, 1, 1), null, true),
                new IntegrantesDominio("Paul Doucette", "Batería / guitarra rítmica", LocalDate.of(1995, 1, 1), null, true),
                new IntegrantesDominio("Kyle Cook", "Guitarra líder, coros", LocalDate.of(1995, 1, 1), null, true),
                new IntegrantesDominio("Adam Gaynor", "Guitarra rítmica, coros", LocalDate.of(1995, 1, 1), LocalDate.of(2005, 1, 1), false));
        ArtistaDominio a22 = new ArtistaDominio("Matchbox Twenty", "Pop Rock / Alternative Rock", "url", false, integrantes22, albumes22);

        List<CancionDominio> canciones23_1 = List.of(
                new CancionDominio("Rhiannon"),
                new CancionDominio("Landslide"),
                new CancionDominio("Say You Love Me"));
        List<CancionDominio> canciones23_2 = List.of(
                new CancionDominio("Dreams"),
                new CancionDominio("Go Your Own Way"),
                new CancionDominio("The Chain"));
        List<AlbumDominio> albumes23 = List.of(
                new AlbumDominio("Fleetwood Mac", "1975", "Soft Rock", "url", canciones23_1),
                new AlbumDominio("Rumours", "1977", "Pop Rock / Classic Rock", "url", canciones23_2));
        List<IntegrantesDominio> integrantes23 = List.of(
                new IntegrantesDominio("Mick Fleetwood", "Batería", LocalDate.of(1967, 7, 1), null, true),
                new IntegrantesDominio("John McVie", "Bajo", LocalDate.of(1967, 7, 1), null, true),
                new IntegrantesDominio("Stevie Nicks", "Voz", LocalDate.of(1975, 1, 1), LocalDate.of(2023, 1, 1), false),
                new IntegrantesDominio("Lindsey Buckingham", "Guitarra, voz", LocalDate.of(1975, 1, 1), LocalDate.of(2018, 4, 1), false),
                new IntegrantesDominio("Christine McVie", "Teclado, voz", LocalDate.of(1970, 1, 1), LocalDate.of(2022, 11, 30), false));
        ArtistaDominio a23 = new ArtistaDominio("Fleetwood Mac", "Rock / Soft Rock / Pop Rock", "url", false, integrantes23, albumes23);

        List<CancionDominio> canciones24_1 = List.of(
                new CancionDominio("Drops of Jupiter"),
                new CancionDominio("Meet Virginia"),
                new CancionDominio("Calling All Angels"));
        List<CancionDominio> canciones24_2 = List.of(
                new CancionDominio("Hey, Soul Sister"),
                new CancionDominio("Marry Me"),
                new CancionDominio("If It's Love"));
        List<AlbumDominio> albumes24 = List.of(
                new AlbumDominio("Drops of Jupiter", "2001", "Alternative Rock", "url", canciones24_1),
                new AlbumDominio("Save Me, San Francisco", "2009", "Pop Rock", "url", canciones24_2));
        List<IntegrantesDominio> integrantes24 = List.of(
                new IntegrantesDominio("Pat Monahan", "Vocalista", LocalDate.of(1993, 1, 1), null, true),
                new IntegrantesDominio("Luis Maldonado", "Guitarra", LocalDate.of(2014, 1, 1), null, true),
                new IntegrantesDominio("Hector Maldonado", "Bajo", LocalDate.of(2009, 1, 1), null, true),
                new IntegrantesDominio("Jerry Becker", "Teclado, guitarra", LocalDate.of(2008, 1, 1), null, true),
                new IntegrantesDominio("Drew Shoals", "Batería", LocalDate.of(2014, 1, 1), LocalDate.of(2022, 1, 1), false));
        ArtistaDominio a24 = new ArtistaDominio("Train", "Pop Rock / Alternative Rock", "url", false, integrantes24, albumes24);

        List<CancionDominio> canciones25_1 = List.of(
                new CancionDominio("I Bet You Look Good on the Dancefloor"),
                new CancionDominio("Mardy Bum"),
                new CancionDominio("When the Sun Goes Down"));
        List<CancionDominio> canciones25_2 = List.of(
                new CancionDominio("Do I Wanna Know?"),
                new CancionDominio("R U Mine?"),
                new CancionDominio("Why'd You Only Call Me When You're High?"));
        List<AlbumDominio> albumes25 = List.of(
                new AlbumDominio("Whatever People Say I Am, That's What I'm Not", "2006", "Garage Rock / Indie Rock", "url", canciones25_1),
                new AlbumDominio("AM", "2013", "Indie Rock / Psychedelic Rock", "url", canciones25_2));
        List<IntegrantesDominio> integrantes25 = List.of(
                new IntegrantesDominio("Alex Turner", "Vocalista, guitarra", LocalDate.of(2002, 1, 1), null, true),
                new IntegrantesDominio("Matt Helders", "Batería, coros", LocalDate.of(2002, 1, 1), null, true),
                new IntegrantesDominio("Jamie Cook", "Guitarra", LocalDate.of(2002, 1, 1), null, true),
                new IntegrantesDominio("Nick O'Malley", "Bajo", LocalDate.of(2006, 6, 1), null, true),
                new IntegrantesDominio("Andy Nicholson", "Bajo", LocalDate.of(2002, 1, 1), LocalDate.of(2006, 5, 1), false));
        ArtistaDominio a25 = new ArtistaDominio("Arctic Monkeys", "Indie Rock / Garage Rock", "url", false, integrantes25, albumes25);

        List<CancionDominio> canciones26_1 = List.of(
                new CancionDominio("Yellow"),
                new CancionDominio("Trouble"),
                new CancionDominio("Shiver"));
        List<CancionDominio> canciones26_2 = List.of(
                new CancionDominio("Viva La Vida"),
                new CancionDominio("Violet Hill"),
                new CancionDominio("Lost!"));
        List<AlbumDominio> albumes26 = List.of(
                new AlbumDominio("Parachutes", "2000", "Alternative Rock / Britpop", "url", canciones26_1),
                new AlbumDominio("Viva la Vida or Death and All His Friends", "2008", "Art Rock / Baroque Pop", "url", canciones26_2));
        List<IntegrantesDominio> integrantes26 = List.of(
                new IntegrantesDominio("Chris Martin", "Vocalista, piano, guitarra", LocalDate.of(1996, 1, 1), null, true),
                new IntegrantesDominio("Jonny Buckland", "Guitarra líder", LocalDate.of(1996, 1, 1), null, true),
                new IntegrantesDominio("Guy Berryman", "Bajo", LocalDate.of(1996, 1, 1), null, true),
                new IntegrantesDominio("Will Champion", "Batería, coros", LocalDate.of(1997, 1, 1), null, true),
                new IntegrantesDominio("Phil Harvey", "Director creativo / ex-mánager", LocalDate.of(1996, 1, 1), null, true));
        ArtistaDominio a26 = new ArtistaDominio("Coldplay", "Alternative Rock / Pop Rock", "url", false, integrantes26, albumes26);

        List<CancionDominio> canciones27_1 = List.of(
                new CancionDominio("This Love"),
                new CancionDominio("She Will Be Loved"),
                new CancionDominio("Harder to Breathe"));
        List<CancionDominio> canciones27_2 = List.of(
                new CancionDominio("Sugar"),
                new CancionDominio("Animals"),
                new CancionDominio("Maps"));
        List<AlbumDominio> albumes27 = List.of(
                new AlbumDominio("Songs About Jane", "2002", "Pop Rock / Funk Rock", "url", canciones27_1),
                new AlbumDominio("V", "2014", "Pop / Pop Rock", "url", canciones27_2));
        List<IntegrantesDominio> integrantes27 = List.of(
                new IntegrantesDominio("Adam Levine", "Vocalista", LocalDate.of(2001, 1, 1), null, true),
                new IntegrantesDominio("Jesse Carmichael", "Teclado, guitarra rítmica", LocalDate.of(2001, 1, 1), null, true),
                new IntegrantesDominio("James Valentine", "Guitarra líder", LocalDate.of(2001, 1, 1), null, true),
                new IntegrantesDominio("Mickey Madden", "Bajo", LocalDate.of(2001, 1, 1), LocalDate.of(2020, 7, 1), false),
                new IntegrantesDominio("Matt Flynn", "Batería", LocalDate.of(2006, 1, 1), null, true),
                new IntegrantesDominio("PJ Morton", "Teclado", LocalDate.of(2012, 1, 1), null, true),
                new IntegrantesDominio("Sam Farrar", "Multiinstrumentista", LocalDate.of(2016, 1, 1), null, true));
        ArtistaDominio a27 = new ArtistaDominio("Maroon 5", "Pop Rock / Funk Pop", "url", false, integrantes27, albumes27);

        
        List<CancionDominio> canciones28_1 = List.of(
                new CancionDominio("Mr. Brightside"),
                new CancionDominio("Somebody Told Me"),
                new CancionDominio("All These Things That I've Done"));
        List<CancionDominio> canciones28_2 = List.of(
                new CancionDominio("Human"),
                new CancionDominio("Spaceman"),
                new CancionDominio("A Dustland Fairytale"));
        List<AlbumDominio> albumes28 = List.of(
                new AlbumDominio("Hot Fuss", "2004", "Alternative Rock / Post-Punk Revival", "url", canciones28_1),
                new AlbumDominio("Day & Age", "2008", "Synthpop / New Wave", "url", canciones28_2));
        List<IntegrantesDominio> integrantes28 = List.of(
                new IntegrantesDominio("Brandon Flowers", "Vocalista, teclado", LocalDate.of(2001, 1, 1), null, true),
                new IntegrantesDominio("Dave Keuning", "Guitarra", LocalDate.of(2001, 1, 1), null, true),
                new IntegrantesDominio("Mark Stoermer", "Bajo", LocalDate.of(2002, 1, 1), null, true),
                new IntegrantesDominio("Ronnie Vannucci Jr.", "Batería", LocalDate.of(2002, 1, 1), null, true));
        ArtistaDominio a28 = new ArtistaDominio("The Killers", "Alternative Rock / Indie Rock / Synthpop", "url", false, integrantes28, albumes28);

        List<CancionDominio> canciones29_1 = List.of(
                new CancionDominio("Sweater Weather"),
                new CancionDominio("Afraid"),
                new CancionDominio("Female Robbery"));
        List<CancionDominio> canciones29_2 = List.of(
                new CancionDominio("Daddy Issues"),
                new CancionDominio("Cry Baby"),
                new CancionDominio("The Beach"));
        List<AlbumDominio> albumes29 = List.of(
                new AlbumDominio("I Love You.", "2013", "Indie Rock / Alternative R&B", "url", canciones29_1),
                new AlbumDominio("Wiped Out!", "2015", "Alternative Rock / Dream Pop", "url", canciones29_2));
        List<IntegrantesDominio> integrantes29 = List.of(
                new IntegrantesDominio("Jesse Rutherford", "Vocalista", LocalDate.of(2011, 1, 1), LocalDate.of(2022, 10, 1), false),
                new IntegrantesDominio("Zach Abels", "Guitarra", LocalDate.of(2011, 1, 1), null, true),
                new IntegrantesDominio("Jeremy Freedman", "Guitarra rítmica", LocalDate.of(2011, 1, 1), null, true),
                new IntegrantesDominio("Mikey Margott", "Bajo", LocalDate.of(2011, 1, 1), null, true),
                new IntegrantesDominio("Brandon Fried", "Batería", LocalDate.of(2014, 1, 1), LocalDate.of(2022, 11, 1), false));
        ArtistaDominio a29 = new ArtistaDominio("The Neighbourhood", "Indie Rock / Alternative R&B", "url", false, integrantes29, albumes29);

        List<CancionDominio> canciones30_1 = List.of(
                new CancionDominio("Ho Hey"),
                new CancionDominio("Stubborn Love"),
                new CancionDominio("Submarines"));
        List<CancionDominio> canciones30_2 = List.of(
                new CancionDominio("Ophelia"),
                new CancionDominio("Angela"),
                new CancionDominio("Sleep on the Floor"));
        List<AlbumDominio> albumes30 = List.of(
                new AlbumDominio("The Lumineers", "2012", "Folk Rock / Americana", "url", canciones30_1),
                new AlbumDominio("Cleopatra", "2016", "Folk Rock / Indie Folk", "url", canciones30_2));
        List<IntegrantesDominio> integrantes30 = List.of(
                new IntegrantesDominio("Wesley Schultz", "Vocalista y guitarra", LocalDate.of(2005, 1, 1), null, true),
                new IntegrantesDominio("Jeremy Fraites", "Batería y percusión", LocalDate.of(2005, 1, 1), null, true),
                new IntegrantesDominio("Neyla Pekarek", "Cello y coros", LocalDate.of(2009, 1, 1), LocalDate.of(2018, 1, 1), false));
        ArtistaDominio a30 = new ArtistaDominio("The Lumineers", "Folk Rock / Americana", "url", false, integrantes30, albumes30);

        
        this.artistas = List.of(a1,a2,a3,a4,a5,a6, a7, a8, a9, a10, a11, a12, a13, a14, a15,
        a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30);
    }
    
    public List<ArtistaDominio> obtenerDatos(){
        return artistas;
    }
    
}
