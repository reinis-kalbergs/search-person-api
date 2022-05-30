package com.example.searchpersonapi.controller;

import com.example.searchpersonapi.service.PersonService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class PersonControllerTest {

    @Mock
    PersonService personService;

    @InjectMocks
    PersonController personController;

    @Test
    public void shouldPassSearchQuery() {
        String personalId = "123";
        LocalDate dateOfBirth = LocalDate.of(1, 12, 24);

        personController.findPerson(personalId, dateOfBirth);

        Mockito.verify(personService).findPerson(personalId, dateOfBirth);
    }
}
