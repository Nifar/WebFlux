package ODL.study.WebFlux.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ODL.study.WebFlux.entity.Person;
import ODL.study.WebFlux.service.PersonService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/person")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PersonController {

    PersonService personService;

    @GetMapping("/create")
    public Mono<Person> create(@RequestParam(required = true) String firstName,
            @RequestParam(required = true) String lastName) {
        return personService.create(new Person(firstName, lastName));

    }

    @GetMapping(value = "/findAll")
    public Flux<Person> list() {
        return personService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity<Person>> getUserById(@PathVariable Long id) {
        return personService.findById(id).map(user -> ResponseEntity.ok(user))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

}
