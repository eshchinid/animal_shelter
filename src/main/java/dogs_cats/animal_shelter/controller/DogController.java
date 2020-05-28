package dogs_cats.animal_shelter.controller;

import dogs_cats.animal_shelter.model.Dog;
import dogs_cats.animal_shelter.service.DogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;

@RestController
@RequestMapping("/api/dogs")
@Api(value = "DOG", description = "Контроллер для работы с таблицей DOG")
public class DogController {
    private final DogService service;

    public DogController(DogService service) {
        this.service = service;
    }

    @GetMapping("/getAll")
    @ApiOperation("Получить весь список собак")
    public Iterable<Dog> getAll(@RequestBody Pageable pageable){
        return service.getAll();
    }

    @PutMapping("create")
    @ApiOperation("Создать запись о собаке")
    public Long create(@RequestBody Dog dog){
        return service.create(dog);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation("Удалить")
    public Long delete(@PathVariable Long id) {
        return service.delete(id);
    }
}
