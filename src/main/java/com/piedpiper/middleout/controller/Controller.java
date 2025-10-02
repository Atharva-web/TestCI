package com.piedpiper.middleout.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String greetUser() {
        return "Pied Piper";
    }
}
