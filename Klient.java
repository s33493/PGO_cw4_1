import java.lang.reflect.Array;
import java.util.ArrayList;

public class Klient {
    private String imie;
    private String nazwisko;
    private String email;
    private ArrayList<Wydarzenie>Wydarzenie;
    public Klient(String imie, String nazwisko, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }
    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Wydarzenie> getWydarzenie() {
        return Wydarzenie;
    }

    public void setWydarzenie(ArrayList<Wydarzenie> wydarzenie) {
        Wydarzenie = wydarzenie;
    }
    public void DodajRezerwacje(Wydarzenie wydarzenie) {
        Wydarzenie.add(wydarzenie);
    }
    public void WyswietlRezerwacje() {
        System.out.println(Wydarzenie.toString());

    }
}
