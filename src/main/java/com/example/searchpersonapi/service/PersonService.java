package com.example.searchpersonapi.service;

import com.example.searchpersonapi.model.Person;
import com.example.searchpersonapi.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.Optional;


@Service
public class PersonService {
    private final PersonRepository personRepository;
    private final DatabaseLoggingService loggingService;
    private final Logger logger = LoggerFactory.getLogger(PersonService.class);

    public PersonService(PersonRepository personRepository, DatabaseLoggingService loggingService) {
        this.personRepository = personRepository;
        this.loggingService = loggingService;
    }

    public Person findPerson(String personalId, LocalDate dateOfBirth) {
        Optional<Person> personOptional = findPersonInDatabase(personalId, dateOfBirth);
        String query = queryInfo(personalId, dateOfBirth);
        logInfo(query);
        if (personOptional.isEmpty()) {
            logNotFound(query);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Person was not found: " + query);
        }
        return personOptional.get();
    }

    private Optional<Person> findPersonInDatabase(String personalId, LocalDate dateOfBirth) {
        return personRepository.findByPersonalIdAndDateOfBirth(personalId, dateOfBirth);
    }

    private String queryInfo(String personalId, LocalDate dateOfBirth) {
        return "{personalId: " + personalId + "; dateOfBirth: " + dateOfBirth + "}";
    }

    private void logInfo(String query) {
        logger.info("Person was searched with query: " + query);
        loggingService.saveLog("Search query", query);
    }

    private void logNotFound(String query) {
        logger.warn("Person was not found: " + query);
        loggingService.saveLog("Person Not Found", query);
    }
}
