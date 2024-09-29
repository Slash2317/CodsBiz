package com.codsbiz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DashboardController {
    
    @RequestMapping(value = "/load-text")
    public String loadText() {
        return "text";
    }
}
