package com.example.searchpersonapi.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class LoggingInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "log_sequence")
    @Column(nullable = false)
    private Long id;
    private String reason;
    private String search;
    private LocalDateTime timestamp;

    public LoggingInfo(Long id, String reason, String search, LocalDateTime timestamp) {
        this.id = id;
        this.reason = reason;
        this.search = search;
        this.timestamp = timestamp;
    }

    public LoggingInfo(String reason, String search, LocalDateTime timestamp) {
        this.reason = reason;
        this.search = search;
        this.timestamp = timestamp;
    }

    public LoggingInfo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String message) {
        this.search = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
