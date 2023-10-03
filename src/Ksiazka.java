public class Ksiazka {
    private String Tytul;
    private Osoba autor;
    private boolean czyWypozyczona;

    public Ksiazka(String tytul, Osoba autor) {
        Tytul = tytul;
        this.autor = autor;
        czyWypozyczona = false;
    }

    public String getTytul() {
        return Tytul;
    }

    public void setTytul(String tytul) {
        Tytul = tytul;
    }

    public Osoba getAutor() {
        return autor;
    }

    public void setAutor(Osoba autor) {
        this.autor = autor;
    }

    public boolean isCzyWypozyczona() {
        return czyWypozyczona;
    }

    public void setCzyWypozyczona(boolean czyWypozyczona) {
        this.czyWypozyczona = czyWypozyczona;
    }
}
