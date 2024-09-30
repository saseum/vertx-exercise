package com.saseum.vertxexercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class VertxExerciseApplication {

    public static void main(String[] args) {
        SpringApplication.run(VertxExerciseApplication.class, args);
    }

    @GetMapping
    public String index() {
        return "Hello World!";
    }
}
