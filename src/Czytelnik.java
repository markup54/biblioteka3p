import java.util.ArrayList;
import java.util.Date;

public class Czytelnik extends Osoba{
    private int nrCzytelnika;
    private static int liczbaCzytelnik;
    private ArrayList<Ksiazka> wypozyczoneKsiazki;

    public Czytelnik(String imie, String nazwisko, Date dataUr) {
        super(imie, nazwisko, dataUr);
        liczbaCzytelnik++;
        this.nrCzytelnika = liczbaCzytelnik;
        this.wypozyczoneKsiazki = new ArrayList<>();
    }

    public int getNrCzytelnika() {
        return nrCzytelnika;
    }

    public void setNrCzytelnika(int nrCzytelnika) {
        this.nrCzytelnika = nrCzytelnika;
    }

    public static int getLiczbaCzytelnik() {
        return liczbaCzytelnik;
    }

    public static void setLiczbaCzytelnik(int liczbaCzytelnik) {
        Czytelnik.liczbaCzytelnik = liczbaCzytelnik;
    }

    public ArrayList<Ksiazka> getWypozyczoneKsiazki() {
        return wypozyczoneKsiazki;
    }

    public void setWypozyczoneKsiazki(ArrayList<Ksiazka> wypozyczoneKsiazki) {
        this.wypozyczoneKsiazki = wypozyczoneKsiazki;
    }

    @Override
    public String toString() {
        return "Czytelnik{" +
                "nrCzytelnika=" + nrCzytelnika +
                ", wypozyczoneKsiazki=" + wypozyczoneKsiazki +
                "} " + super.toString();
    }
}
