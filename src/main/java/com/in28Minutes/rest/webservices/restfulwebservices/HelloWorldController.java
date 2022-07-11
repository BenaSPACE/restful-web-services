package com.in28Minutes.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {
    //GET
    //URI - /Hello-World
    //method - "Hello World"

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

}
