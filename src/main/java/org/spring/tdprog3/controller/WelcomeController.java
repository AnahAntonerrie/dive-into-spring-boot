package org.spring.tdprog3.controller;

import org.spring.tdprog3.entity.StudentEntity;
import org.spring.tdprog3.service.WelcomeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class WelcomeController {
    private final WelcomeService welcomeService;
    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }

    @GetMapping("/welcome")
    public String welcome(@RequestParam(defaultValue = "World") String name) {
        return welcomeService.getWelcomeMessage(name);
    }
}
