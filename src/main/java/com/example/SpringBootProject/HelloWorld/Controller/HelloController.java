package com.example.SpringBootProject.HelloWorld.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(path="/")
    public String hello(){
        return "Welcome";
    }
}
