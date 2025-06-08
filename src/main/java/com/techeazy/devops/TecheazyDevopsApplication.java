package com.techeazy.devops;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TecheazyDevopsApplication implements CommandLineRunner {

    @Value("${custom.message}")
    private String customMessage;

    public static void main(String[] args) {
        SpringApplication.run(TecheazyDevopsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Custom message from environment: " + customMessage);
    }
}

