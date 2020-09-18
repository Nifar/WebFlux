package ODL.study.WebFlux.service;

import org.springframework.stereotype.Service;

import ODL.study.WebFlux.entity.Person;
import ODL.study.WebFlux.repository.PersonRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PersonService {

    PersonRepository repository;

    public Mono<Person> create(final Person person) {
        return repository.save(person);
    }

    public Flux<Person> findAll() {
        return repository.findAll();
    }

    public Mono<Person> findById(final Long id) {
        return repository.findById(id);
    }

}
