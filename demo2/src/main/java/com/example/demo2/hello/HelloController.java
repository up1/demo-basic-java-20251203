package com.example.demo2.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Message sayHi(){
        return new Message("Hello Spring Boot");
    }

}
