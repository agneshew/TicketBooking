package com.agnes.TicketBooking.config;

import ch.vorburger.mariadb4j.DBConfigurationBuilder;
import ch.vorburger.mariadb4j.springframework.MariaDB4jSpringService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

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
}
