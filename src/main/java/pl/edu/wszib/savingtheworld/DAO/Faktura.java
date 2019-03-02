package pl.edu.wszib.savingtheworld.DAO;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Faktura {

    @Id
    @GeneratedValue
    Long idFaktury;

    double kwota;
    String tytuł;




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
}
