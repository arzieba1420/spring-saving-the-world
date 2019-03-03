package pl.edu.wszib.savingtheworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.edu.wszib.savingtheworld.DAO.Faktura;
import pl.edu.wszib.savingtheworld.DAO.FakturaDAO;
import pl.edu.wszib.savingtheworld.DAO.Podatnik;
import pl.edu.wszib.savingtheworld.DAO.PodatnikDAO;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Component
public class InitComponent {

    @Autowired
    PodatnikDAO podatnikDAO;

    @Autowired
    FakturaDAO fakturaDAO;

    @PostConstruct
    public void init(){

        IntStream.range(0,50).forEach(i-> {
            Podatnik podatnik = new Podatnik("Test"+i,"TestN"+i);
            Podatnik podatnikSaved= podatnikDAO.save(podatnik);



        IntStream.range(0,10000).forEach(j->{
            Faktura faktura = new Faktura(3.50,"text"+j);
            faktura.setPodatnik(podatnikSaved);
            faktura = fakturaDAO.save(faktura);
        });

        });


        System.out.println("");

    }


    @PreDestroy
    public void teardown(){
    }

}
