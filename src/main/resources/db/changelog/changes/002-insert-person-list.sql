--liquibase formatted sql

--changeset reinis:2

INSERT INTO person (personal_id, first_name, last_name, gender, date_of_birth)
VALUES ('238410-12392', 'Loran', 'De Ruyter', 'FEMALE', '1989-04-13'),
       ('28-231561', 'Lamberta', 'Christiaens', 'FEMALE', '1948-12-10'),
       ('6415-7575', 'Carrie', 'Green', 'FEMALE', '1997-04-22'),
       ('5696-021791 ', 'Hannah', 'Ma', 'FEMALE', '1989-03-11'),
       ('23576-54884 ', 'Necati', 'Erbay', 'MALE', '1960-11-28'),
       ('17292-50730 ', 'Isaac', 'Nunes', 'MALE', '1967-04-25'),
       ('8732-016360 ', 'Aapo', 'Lepisto', 'MALE', '1987-03-01');