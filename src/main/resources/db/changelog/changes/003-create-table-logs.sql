--liquibase formatted sql

--changeset reinis:3

CREATE SEQUENCE IF NOT EXISTS log_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE logging_info
(
    id        BIGINT NOT NULL,
    reason    VARCHAR(255),
    search    VARCHAR(255),
    timestamp TIMESTAMP WITHOUT TIME ZONE,
    CONSTRAINT pk_logginginfo PRIMARY KEY (id)
);