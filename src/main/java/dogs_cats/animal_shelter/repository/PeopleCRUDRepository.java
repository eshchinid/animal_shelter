package dogs_cats.animal_shelter.repository;

import dogs_cats.animal_shelter.model.People;
import org.springframework.data.repository.CrudRepository;

public interface PeopleCRUDRepository extends CrudRepository<People, Long> {
}
