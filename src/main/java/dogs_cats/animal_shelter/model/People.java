package dogs_cats.animal_shelter.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class People {
    @Id
    private Long id;
    private String name;
    private Boolean enclosure;
    private Boolean curator;
    private Boolean volunteer;
    private Boolean active;
    private Integer phone;
    private String description;
    private String social;
    private Long dogId;
}
