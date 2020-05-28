package dogs_cats.animal_shelter.service;

import dogs_cats.animal_shelter.model.People;
import dogs_cats.animal_shelter.repository.PeopleCRUDRepository;
import org.springframework.stereotype.Service;

@Service
public class PeopleService {
    private final PeopleCRUDRepository repository;

    public PeopleService(PeopleCRUDRepository repository) {
        this.repository = repository;
    }


    public Iterable<People> getAll() {
        return repository.findAll();
    }

    public Long create (People people) {
        People created = repository.save(people);
        return created.getId();
    }

    public People getByID(Long id) {
        return repository.findById(id).orElseThrow(() -> new NullPointerException("dog no found"));
    }

    public Long delete(Long id) {
        repository.deleteById(id);
        return id;
    }
}
