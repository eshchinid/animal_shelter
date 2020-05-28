package dogs_cats.animal_shelter.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Prescription {
    @Id
    private Long id;
    private String prescription;
    private String prescriptionSchedule;
    private Boolean active;
    private Long dogId;
}
