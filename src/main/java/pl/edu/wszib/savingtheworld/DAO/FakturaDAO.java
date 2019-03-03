package pl.edu.wszib.savingtheworld.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FakturaDAO extends CrudRepository <Faktura,Long>{
    Iterable <Faktura> findByTytuł(String tytuł);
    List<Faktura> findAllByPodatnik(Podatnik podatnik);
}
