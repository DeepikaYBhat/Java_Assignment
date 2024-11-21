package com.javaexample.springbootfirst_app.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Springboot!";
    }
    @GetMapping("/base")
    public String base() {
        return "Welcome to the Niveus!";

    }
}