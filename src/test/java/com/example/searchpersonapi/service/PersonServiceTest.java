package com.example.searchpersonapi.service;

import com.example.searchpersonapi.repository.PersonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {
    @Mock
    PersonRepository personRepository;
    @Mock
    DatabaseLoggingService loggingService;

    @InjectMocks
    PersonService personService;

    @Test
    public void shouldThrowErrorNotFound() {
        String personalId = "123";
        LocalDate dateOfBirth = LocalDate.of(1, 12, 24);

        Mockito.when(personRepository.findByPersonalIdAndDateOfBirth(Mockito.anyString(), Mockito.any(LocalDate.class)))
                .thenReturn(Optional.empty());

        ResponseStatusException exception = Assertions.assertThrows(ResponseStatusException.class,
                () -> personService.findPerson(personalId, dateOfBirth));

        Assertions.assertEquals(exception.getStatus(), HttpStatus.NOT_FOUND);
    }
}
