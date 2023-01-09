package io.github.flozano.jpaissues;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class JpaissuesApplicationTests {

    @Autowired
    PersonRepository personRepository;

    @Test
    void usePersonRepository() {
        var person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setBirthday(LocalDate.of(1980, 1, 1));
        var saved = personRepository.persist(person);
        assertTrue(saved.getId()>0);
    }


}
