package pl.edu.wszib.savingtheworld.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Random;
import java.util.stream.LongStream;

@Component
public  class KsiazkaInitComponent {
    @Autowired
    SkladnikDAO skladnikDAO;
    @Autowired
    KsiazkaKucharskaDAO ksiazkaKucharskaDAO;
    @Autowired
    PrzepisDAO przepisDAO;
    @Autowired
    TypSkladnkaDAO typSkladnkaDAO;

}
