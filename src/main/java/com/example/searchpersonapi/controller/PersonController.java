package com.example.searchpersonapi.controller;

import com.example.searchpersonapi.model.Person;
import com.example.searchpersonapi.service.PersonService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@CrossOrigin
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/person")
    @ResponseStatus(HttpStatus.OK)
    public Person findPerson(
            @RequestParam(value = "id") String personalId,
            @RequestParam(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dateOfBirth) {
        return personService.findPerson(personalId, dateOfBirth);
    }
}
