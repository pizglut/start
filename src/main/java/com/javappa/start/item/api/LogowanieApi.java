package com.javappa.start.item.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogowanieApi {

    @GetMapping("/logowanie")
    public String sayLogowanie() {
        return "logowanie";
    }
}
