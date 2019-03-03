package pl.edu.wszib.savingtheworld.DAO;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.persistence.*;
import java.util.List;
import java.util.Random;
import java.util.stream.LongStream;

@Entity
@Table
public class TypSkladnika {

    @Id
    @GeneratedValue
    Long id;
    @Column(unique = true)
    String nazwa; //unikalna






    public TypSkladnika() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }


}
