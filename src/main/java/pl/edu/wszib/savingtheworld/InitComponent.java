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



    @PreDestroy
    public void teardown(){
    }

}
