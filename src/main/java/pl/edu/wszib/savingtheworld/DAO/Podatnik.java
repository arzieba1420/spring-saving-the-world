package pl.edu.wszib.savingtheworld.DAO;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Podatnik {

    @Id //klucz podstawowy
    @GeneratedValue
    public Long pesel;

    @Column(nullable=false)
    public String imie;
    @Column(nullable=false)
    public String nazwisko;

    @OneToMany(mappedBy = "podatnik", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    List<Faktura> faktury;

    public Podatnik(){};

    public Podatnik( String imie, String nazwisko) {

        this.imie = imie;
        this.nazwisko = nazwisko;
    }



    public void setFaktury(List<Faktura> faktury) {
        this.faktury = faktury;
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

    public List<Faktura> getFaktury() {
        return faktury;
    }
}
