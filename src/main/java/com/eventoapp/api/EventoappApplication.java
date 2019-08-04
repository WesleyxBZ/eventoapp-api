package com.eventoapp.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EventoappApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventoappApplication.class, args);
    }

}

