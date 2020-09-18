package ODL.study.WebFlux.entity;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

public class AbstractEntity {

    @Id
    @Getter
    @Setter
    private Long id;

}
