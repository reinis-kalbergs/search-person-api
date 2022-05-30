package com.example.searchpersonapi.service;

import com.example.searchpersonapi.model.LoggingInfo;
import com.example.searchpersonapi.repository.LoggingRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Service
@Transactional
public class DatabaseLoggingService {
    private final LoggingRepository loggingRepository;

    public DatabaseLoggingService(LoggingRepository loggingRepository) {
        this.loggingRepository = loggingRepository;
    }

    public void saveLog(String action, String message) {
        loggingRepository.save(new LoggingInfo(action, message, LocalDateTime.now()));
    }
}
