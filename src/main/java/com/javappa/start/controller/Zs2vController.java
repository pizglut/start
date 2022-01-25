package com.javappa.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Zs2vController {
    @GetMapping("/zs2v")
    public String sayZs2v() {
        return "zs2v";
    }
}
