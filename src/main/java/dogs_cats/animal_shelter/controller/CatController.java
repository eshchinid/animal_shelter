package dogs_cats.animal_shelter.controller;

import dogs_cats.animal_shelter.model.Cat;
import dogs_cats.animal_shelter.service.CatService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cats")
@Api(value = "Cat", description = "Контроллер для работы с таблицей CAT")
public class CatController {
    private final CatService service;

    public CatController(CatService service) {
        this.service = service;
    }

    @GetMapping("/getAll")
    @ApiOperation("Получить весь список кошек")
    public Iterable<Cat> getAll(){
        return service.getAll();
    }

    @PutMapping("create")
    @ApiOperation("Создать запись о кошке")
    public Long create(@RequestBody Cat cat){
        return service.create(cat);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation("Удалить")
    public Long delete(@PathVariable Long id) {
        return service.delete(id);
    }
}
