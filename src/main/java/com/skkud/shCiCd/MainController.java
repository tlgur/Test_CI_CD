package com.skkud.shCiCd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String hello() {
        System.out.println("Hello Server!");
        System.out.println("Hello Github");
        System.out.println("Hello Github Real!");
        return "Hello ApI!";
    }
}