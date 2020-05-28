package dogs_cats.animal_shelter.model;


import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
public class Dog {
    @Id
    private Long id;
    private String dogName;
    private String dogDescription;
    private String dogBreed;
    private Boolean active;
    private String dogType;
    private String dogStory;
    private Date dogAge;
    private String address;
    private String dogGander;
    private String dogColor;
    private Date dogEnclosure;
    private Date dogDeath;
    private Long peopleId;
    private String vetHistory;
    private Long prescriptionId;
    private String social;
}
