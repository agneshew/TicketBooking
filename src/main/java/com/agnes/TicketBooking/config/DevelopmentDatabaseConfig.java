package com.agnes.TicketBooking.config;

import ch.vorburger.mariadb4j.springframework.MariaDB4jSpringService;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;
import java.sql.Driver;

@Configuration
@Profile("development")
public class DevelopmentDatabaseConfig {

    protected static final int DB_PORT = 3310;

    @Bean(name = "mariadb4j")
    MariaDB4jSpringService mariaDB4j() {
        MariaDB4jSpringService service = new MariaDB4jSpringService();
        service.setDefaultPort(DB_PORT);
        return service;
    }

    @Bean
    @DependsOn("mariadb4j")
    DataSource ds() {
        SimpleDriverDataSource ds = new SimpleDriverDataSource();
        ds.setDriverClass(Driver.class);
        ds.setUrl(String.format("jdbc:mysql://localhost:%d/test", DB_PORT));
        ds.setUsername("root");
        return ds;
    }

}
