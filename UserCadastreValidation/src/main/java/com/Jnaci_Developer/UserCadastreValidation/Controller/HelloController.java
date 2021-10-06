package com.Jnaci_Developer.UserCadastreValidation.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloMessage(){

        return "Hello Spring Boot";
    }

}
