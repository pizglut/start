package com.javappa.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Lq4csController {
    @GetMapping("/lq4cs")
    public String sayLq4cs() {
        return "lq4cs";

    }
}
