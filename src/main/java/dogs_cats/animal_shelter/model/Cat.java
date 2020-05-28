package dogs_cats.animal_shelter.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
public class Cat {
    @Id
    private Long id;
    private String catName;
    private String catDescription;
    private String catBreed;
    private Boolean active;
    private String catType;
    private String catStory;
    private Date catAge;
    private String address;
    private String catGander;
    private String catColor;
    private Date catEnclosure;
    private Date catDeath;
    private Long peopleId;
    private String vetHistory;
    private Long prescriptionId;
    private String social;
}
