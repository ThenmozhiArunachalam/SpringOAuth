package com.example.SpringOAuth.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/test")
    public String test(Authentication user) {
        System.out.println("is Authenticated: " + user.isAuthenticated());
        return "Hello";
    }
}
