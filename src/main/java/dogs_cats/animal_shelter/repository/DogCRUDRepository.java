package dogs_cats.animal_shelter.repository;

import dogs_cats.animal_shelter.model.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogCRUDRepository extends CrudRepository<Dog, Long> {

}
