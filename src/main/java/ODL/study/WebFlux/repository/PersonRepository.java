package ODL.study.WebFlux.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import ODL.study.WebFlux.entity.Person;

@Repository
public interface PersonRepository extends ReactiveCrudRepository<Person, Long> {

}
