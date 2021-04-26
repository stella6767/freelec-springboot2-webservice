package com.example.intellijstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class IntellijStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntellijStartApplication.class, args);
    }

}
