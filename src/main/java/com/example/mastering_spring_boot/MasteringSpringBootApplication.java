package com.example.mastering_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MasteringSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MasteringSpringBootApplication.class, args);
    }

}
