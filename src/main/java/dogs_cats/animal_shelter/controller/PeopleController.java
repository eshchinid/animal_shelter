package dogs_cats.animal_shelter.controller;

import dogs_cats.animal_shelter.model.People;
import dogs_cats.animal_shelter.service.PeopleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/people")
@Api(value = "People", description = "Контроллер для работы с таблицей People")
public class PeopleController {
    private final PeopleService service;

    public PeopleController(PeopleService service) {
        this.service = service;
    }

    @GetMapping("/getAll")
    @ApiOperation("Получить весь список людей")
    public Iterable<People> getAll(){
        return service.getAll();
    }

    @PutMapping("create")
    @ApiOperation("Создать запись о людях")
    public Long create(@RequestBody People People){
        return service.create(People);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation("Удалить")
    public Long delete(@PathVariable Long id) {
        return service.delete(id);
    }
}
