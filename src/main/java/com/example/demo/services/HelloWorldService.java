package com.example.demo.services;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public ResponseEntity<String> process() {
        return new ResponseEntity<>("YOOO\n", HttpStatus.OK);
    }
}
