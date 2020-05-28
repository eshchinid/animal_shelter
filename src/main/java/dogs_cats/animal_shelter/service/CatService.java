package dogs_cats.animal_shelter.service;

import dogs_cats.animal_shelter.model.Cat;
import dogs_cats.animal_shelter.model.Dog;
import dogs_cats.animal_shelter.repository.CatCRUDRepository;
import org.springframework.stereotype.Service;

@Service
public class CatService {
    private final CatCRUDRepository repository;

    public CatService(CatCRUDRepository repository) {
        this.repository = repository;
    }


    public Iterable<Cat> getAll() {
        return repository.findAll();
    }

    public Long create (Cat cat) {
        Cat created = repository.save(cat);
        return created.getId();
    }

    public Cat getByID(Long id) {
        return repository.findById(id).orElseThrow(() -> new NullPointerException("dog no found"));
    }

    public Long delete(Long id) {
        repository.deleteById(id);
        return id;
    }
}
