package pl.edu.wszib.savingtheworld.DAO;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface FakturaDAO extends PagingAndSortingRepository<Faktura,Long> {
    List <Faktura> findByTytuł(String tytuł);
   Page<Faktura> findAllByPodatnik_Pesel(Long pesel, Pageable pageable);
}
