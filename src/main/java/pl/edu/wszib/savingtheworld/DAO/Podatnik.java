package pl.edu.wszib.savingtheworld.DAO;

import javax.persistence.*;

@Entity
@Table
public class Podatnik {

    @Id //klucz podstawowy
    @GeneratedValue
    Long pesel;

    @Column(nullable=false)
    String imie;
    @Column(nullable=false)
    String nazwisko;

    public Podatnik(){};

    public Podatnik( String imie, String nazwisko) {

        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Long getPesel() {
        return pesel;
    }

    public void setPesel(Long pesel) {
        this.pesel = pesel;
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
}
