package com.javappa.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogowanieController {
    @GetMapping("/logowanie")
    public String sayLogowanie() {
        return "logowanie";

    }
}
