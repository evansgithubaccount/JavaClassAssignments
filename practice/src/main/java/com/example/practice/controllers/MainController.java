package com.example.practice.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//provides hints for Spring that the class plays a specific role. Our class is a web @Controller so Spring considers it when handling web requests
@RestController

public class MainController {

    //annotation that provides "routing" info. Tells Spring that any http request with "/" path should be mapped to the home() method
    @RequestMapping("/")
    //Because of RestController annotation, Spring renders resulting string directly back to the caller. In this case caller is the home() method and string is returned
    public String home(){
        return "Hello comma World!";
    }
}
