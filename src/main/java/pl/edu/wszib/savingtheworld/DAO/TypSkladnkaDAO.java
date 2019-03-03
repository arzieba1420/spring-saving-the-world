package pl.edu.wszib.savingtheworld.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;
import org.springframework.stereotype.Repository;

@Repository
public interface TypSkladnkaDAO extends OurCrudRepository<TypSkladnika,Long> {

}
