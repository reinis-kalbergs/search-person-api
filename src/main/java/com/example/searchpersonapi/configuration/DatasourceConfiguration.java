package com.example.searchpersonapi.configuration;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfiguration {

    @Bean
    public DataSource getDatabaseDataSource() {
        return DataSourceBuilder.create()
                .driverClassName("org.h2.Driver")
                .url("jdbc:h2:mem:mydb")
                .username("user")
                .password("")
                .build();
    }
}
