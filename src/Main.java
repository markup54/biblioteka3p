import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Czytelnik czytelnik = new Czytelnik("Jan","Nowak",new Date(1950,12,6));
        System.out.println(czytelnik);
    }
}