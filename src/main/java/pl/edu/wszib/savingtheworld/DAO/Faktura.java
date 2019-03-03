package pl.edu.wszib.savingtheworld.DAO;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Faktura {

    @Id
    @GeneratedValue
    Long idFaktury;

    double kwota;
    String tytuł;


    @ManyToOne(fetch = FetchType.EAGER,  optional = false)
    @JoinColumn (name="podatnik_pesel", nullable=false)
            @OnDelete(action = OnDeleteAction.CASCADE)
    Podatnik podatnik;

    public Faktura(){

    };

    public Faktura(double kwota, String tytuł) {
        this.kwota = kwota;
        this.tytuł = tytuł;
    }



    public Faktura(String tytuł) {
        this.tytuł = tytuł;
    }

    public Long getIdFaktury() {
        return idFaktury;
    }

    public void setIdFaktury(Long idFaktury) {
        this.idFaktury = idFaktury;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public String getTytuł() {
        return tytuł;
    }

    public void setTytuł(String tytuł) {
        this.tytuł = tytuł;
    }

    public Podatnik getPodatnik() {
        return podatnik;
    }

    public void setPodatnik(Podatnik podatnik) {
        this.podatnik = podatnik;
    }
}
