--liquibase formatted sql

--changeset reinis:1

CREATE TABLE person
(
    personal_id   VARCHAR(255) NOT NULL,
    first_name    VARCHAR(255),
    last_name     VARCHAR(255),
    gender        VARCHAR(255),
    date_of_birth date,
    CONSTRAINT pk_person PRIMARY KEY (personal_id)
);
