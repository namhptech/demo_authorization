package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class Controller {
    @GetMapping("/api/test")
    public String test() {
        return "This is a test API";
    }

    @GetMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
