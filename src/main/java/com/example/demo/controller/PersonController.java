package com.example.demo.controller;

import com.example.demo.entity.Person;
import com.example.demo.service.MeterService;
import com.example.demo.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
public class PersonController {


    private final PersonService personService;
    private final MeterService meterService;

    @GetMapping("/get")
    public Person findPerson() {
        meterService.start();
        Person person = personService.findPerson();
        meterService.stop();
        return person;
    }

    @GetMapping("/get/all")
    public List<Person> findAll() {
        meterService.start();
        List<Person> persons = personService.findAll();
        meterService.stop();
        return persons;
    }
}
