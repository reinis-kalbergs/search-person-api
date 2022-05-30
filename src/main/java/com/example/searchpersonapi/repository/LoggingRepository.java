package com.example.searchpersonapi.repository;

import com.example.searchpersonapi.model.LoggingInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoggingRepository extends JpaRepository<LoggingInfo, String> {

}
