package com.example.demo.service;

import com.example.demo.entity.Person;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    public Person findPerson() {
        return getOnePerson();
    }

    public List<Person> findAll() {
        return getAllPersons();
    }

    @SneakyThrows
    private Person getOnePerson() {
        Thread.sleep(3000);
        return new Person("Johnny", 40);
    }

    @SneakyThrows
    private List<Person> getAllPersons() {
        Thread.sleep(3000);
        return List.of(
                new Person("Adam", 15),
                new Person("Lisa", 30),
                new Person("John", 25)
        );
    }
}
