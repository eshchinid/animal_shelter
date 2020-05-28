package dogs_cats.animal_shelter.repository;

import dogs_cats.animal_shelter.model.Dog;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class DogRepository_test {
    private static final RowMapper<Dog> ROW_MAPPER = BeanPropertyRowMapper.newInstance(Dog.class);

    private static final String PAGEBLE = "" +
            "limit :pageSize " +
            "offset :offset";
    private static final String GETALL = "select * from public.dog" + PAGEBLE;
    private static final String CREATE = "INSERT INTO public.dog " +
            "(dog_name, dog_breed, dog_description, active, dog_type, dog_story, cash, address, dog_gander, dog_color, dog_age, dog_enclosure, dog_death, vet_history";

    public static final String UPDATE = "UPDATE public.dog " +
            "SET " +
            "WHERE id=:id;  ";

}
