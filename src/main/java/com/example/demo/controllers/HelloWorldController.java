package com.example.demo.controllers;


import com.example.demo.services.HelloWorldService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloWorldController {
    private final HelloWorldService helloWorldService;

    @GetMapping("/hello-world")
    ResponseEntity getRequest() {
        return helloWorldService.process();
    }
}
