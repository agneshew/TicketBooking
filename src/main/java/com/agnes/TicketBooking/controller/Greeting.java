package com.agnes.TicketBooking.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping ("/greet")
public class Greeting {

    @RequestMapping({"","/{user}"})
    public String greetingUser(@PathVariable(name="user", required = false)Optional<String> maybeUser) {
        String user = maybeUser.filter(StringUtils::isNotBlank).orElse("unknown person");
        return String.format("Hello %s!", user);
    }
}
