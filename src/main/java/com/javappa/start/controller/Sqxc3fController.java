package com.javappa.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Sqxc3fController {
    @GetMapping("/sqxc3f")
    public String saySqxc3f() {
        return "sqxc3f";
    }
}
