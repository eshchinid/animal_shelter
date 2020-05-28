package dogs_cats.animal_shelter.repository;

import dogs_cats.animal_shelter.model.Cat;
import org.springframework.data.repository.CrudRepository;

public interface CatCRUDRepository extends CrudRepository<Cat,Long> {
}
