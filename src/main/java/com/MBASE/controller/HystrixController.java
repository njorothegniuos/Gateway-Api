package com.MBASE.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class HystrixController {

    @GetMapping("/bookhub")
    public String firstServiceFallback(){
        return "This is a fallback for the bookhub service.";
    }

    @GetMapping("/user")
    public String secondServiceFallback(){
        return "user Server overloaded! Please try after some time.";
    }
}
