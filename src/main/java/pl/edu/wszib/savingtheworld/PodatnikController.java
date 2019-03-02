package pl.edu.wszib.savingtheworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.edu.wszib.savingtheworld.DAO.Podatnik;
import pl.edu.wszib.savingtheworld.DAO.PodatnikDAO;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static com.sun.xml.internal.ws.policy.sourcemodel.wspolicy.XmlToken.Optional;

@RestController
@RequestMapping("/podatnik")
public class PodatnikController {

    @Autowired
    PodatnikDAO podatnikDAO;

    List<Podatnik> podatnicy = new ArrayList<>();


    @GetMapping("/getOne")
    public Podatnik podatnik (Long pesel){
        return podatnikDAO.findById(pesel).orElse(null);
    }

    @GetMapping("/getAll")
    public List<Podatnik> podatnicy(){
       /*return StreamSupport.stream(podatnikDAO.findAll().spliterator(),false).collect(Collectors.toList() );*/
         podatnikDAO.findAll().forEach(i-> podatnicy.add(i));
         return podatnicy;
    }

    @PostMapping
    public Podatnik zapisz(Podatnik podatnik){

            return podatnikDAO.save(podatnik);

    }

    @DeleteMapping
    public Podatnik usun(Long pesel){
        Podatnik temp = podatnikDAO.findById(pesel).get();
        podatnikDAO.deleteById(pesel);
        return temp;

    }

}
