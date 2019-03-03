package pl.edu.wszib.savingtheworld.DAO;


import javax.persistence.*;

@Entity
@Table
public class Składnik {

    @Id
    @GeneratedValue
    Long id;

    @OneToOne(optional = true)
    TypSkladnika typSkladnika;
    int ilosc;
    @ManyToOne(optional = false)
    @JoinColumn(name = "przepis_id", nullable = false)
    Przepis przepis;

    public Składnik() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypSkladnika getTypSkladnika() {
        return typSkladnika;
    }

    public void setTypSkladnika(TypSkladnika typSkladnika) {
        this.typSkladnika = typSkladnika;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public Przepis getPrzepis() {
        return przepis;
    }

    public void setPrzepis(Przepis przepis) {
        this.przepis = przepis;
    }
}
