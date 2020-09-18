package ODL.study.WebFlux.entity;

import org.springframework.data.relational.core.mapping.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Person extends AbstractEntity {

    String firstName;

    String lastName;

}
