# Search person RestAPI

REST API that returns a Person object in JSON, when searched for a person with id and date of birth.

### Available endpoints

```
localhost:8080/person?id={personalId}&date={dateOfBirth} [GET]
```

Returns a Person object in JSON with:

- personalId
- firstName
- lastName
- gender
- dateOfBirth with format(yyyy-MM-dd)

If no person is found a 404 error code will be returned.

### Running

Java 17 and Maven has to be installed.

```console
mvnw spring-boot:run
```

It will start the application and generate H2 database with 2 tables: person_table and logging_info. As well as already
present list of person data for testing purposes.

### Database

H2 database available at:

```
localhost:8080/h2-console/
```

You can connect to it by entering the information below:

You can view the person data in by using SQL select statement:

```
SELECT * FROM PERSON
```

### Logging

Logs can also be accessed in H2 console:

```
SELECT * FROM LOGGING_INFO
```

And a log file will be generated in the logs directory.
