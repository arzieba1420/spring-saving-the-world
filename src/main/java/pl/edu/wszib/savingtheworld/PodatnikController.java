package pl.edu.wszib.savingtheworld;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.edu.wszib.savingtheworld.DAO.Faktura;
import pl.edu.wszib.savingtheworld.DAO.Podatnik;
import pl.edu.wszib.savingtheworld.DAO.PodatnikDAO;
import pl.edu.wszib.savingtheworld.DTO.PodatnikDTO;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;



@RestController
@RequestMapping("/podatnik")
public class PodatnikController {

    @Autowired
    PodatnikDAO podatnikDAO;

    @Autowired
    Mapper mapper;

    List<PodatnikDTO> podatnicy = new ArrayList<>();


    @GetMapping("/getOne")
    public PodatnikDTO podatnik (Long pesel){
        return podatnikDAO.findById(pesel)
                .map(podatnik->mapper.map(podatnik,PodatnikDTO.class)).orElse(null);
    }

    @GetMapping("/getAll")
    public List<PodatnikDTO> podatnicy(){
       return StreamSupport.stream(podatnikDAO.findAll().spliterator(),false)
               .map(podatnik -> mapper.map(podatnik,PodatnikDTO.class))
               .collect(Collectors.toList() );
         /*podatnikDAO.findAll().forEach(i-> podatnicy.add(i));*/

    }

    @PostMapping
    public PodatnikDTO zapisz(PodatnikDTO podatnik){

            return mapper.map( podatnikDAO.save(mapper.map(podatnik,Podatnik.class)), PodatnikDTO.class);

    }

    @DeleteMapping
    public PodatnikDTO usun(Long pesel){
        Podatnik temp = podatnikDAO.findById(pesel).get();
        podatnikDAO.deleteById(pesel);
        return mapper.map(temp, PodatnikDTO.class);

    }

    @GetMapping("/faktury")
    @ResponseBody
    public Page<Faktura> faktury ( Long pesel, int strona, int rozmiar){


    }


}
