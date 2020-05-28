package dogs_cats.animal_shelter.service;

import dogs_cats.animal_shelter.model.Dog;
import dogs_cats.animal_shelter.repository.DogCRUDRepository;
import org.springframework.stereotype.Service;

@Service
public class DogService {
    private final DogCRUDRepository repository;

    public DogService(DogCRUDRepository dogCRUDRepository) {
        this.repository = dogCRUDRepository;
    }

    public Iterable<Dog> getAll() {
        return repository.findAll();
    }

    public Long create (Dog dog) {
        Dog created = repository.save(dog);
        return created.getId();
    }

    public Dog getByID(Long id) {
        return repository.findById(id).orElseThrow(() -> new NullPointerException("dog no found"));
    }

    public Long delete(Long id) {
        repository.deleteById(id);
        return id;
    }

}
