package com.Gaurav.C4.shorturl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {
    @GetMapping("/api/hello")
    public String sayHello() {
        return "Hello";
    }
}
