package com.example.searchpersonapi.repository;

import com.example.searchpersonapi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, String> {

    Optional<Person> findByPersonalIdAndDateOfBirth(String personalId, LocalDate dateOfBirth);

}
