package pl.edu.wszib.savingtheworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.edu.wszib.savingtheworld.DAO.Podatnik;
import pl.edu.wszib.savingtheworld.DAO.PodatnikDAO;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class InitComponent {

    @Autowired
    PodatnikDAO podatnikDAO;

    @PostConstruct
    public void init(){
       Podatnik podatnik = podatnikDAO.save(new Podatnik("TestImie","TestNazwisko"));
       Podatnik podatnik2 = podatnikDAO.save(new Podatnik("TestImie2","TestNazwisko2"));
       Podatnik podatnik3 = podatnikDAO.save(new Podatnik("TestImie3","TestNazwisko3"));
       Podatnik podatnik4 = podatnikDAO.save(new Podatnik("TestImie4","TestNazwisko4"));
       Podatnik podatnik5 = podatnikDAO.save(new Podatnik("TestImie5","TestNazwisko5"));
       Podatnik podatnik6 = podatnikDAO.save(new Podatnik("TestImie6","TestNazwisko6"));

    }

    @PreDestroy
    public void teardown(){
    }

}
