import java.util.ArrayList;

public class Biblioteka {
    private ArrayList<Ksiazka> ksiazki = new ArrayList<>();
    private ArrayList<Czytelnik> czytelnicy = new ArrayList<>();
    private ArrayList<Bibliotekarz> biblioteklarze = new ArrayList<>();

    public Biblioteka() {
    }

    public  void wypozyczKsiazke (Ksiazka ksiazka, Czytelnik czytelnik){
        if(ksiazka.isCzyWypozyczona()){
            System.out.println("Nie można wypożyczyć");
        }
        else{
            ksiazka.setCzyWypozyczona(true);
            czytelnik.dodajKsiazke(ksiazka);
        }
    }
    /*
    ·        wypozyczKsiazke,



·        sprawdzCzyKsiazkaJestDostepna,



·        ileKsiazekWypozyczylCzytelnik,



·        dodajNowegoCzytelnika.
     */
}
