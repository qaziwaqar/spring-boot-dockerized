package com.overjet.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Qazi Waqar
 */
@RestController
public class WelcomeController {
    @GetMapping(value = "/")
    public String getWelcomeMessage() {
        return "Welcome to Spring Boot POC";
    }
}
