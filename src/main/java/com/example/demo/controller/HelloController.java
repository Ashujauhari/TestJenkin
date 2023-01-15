package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
//Write the business 
	    @GetMapping("/")
	    String hello() {
	        return "Hello World, Spring Boot.... Welcome to You!";
	    }
}
