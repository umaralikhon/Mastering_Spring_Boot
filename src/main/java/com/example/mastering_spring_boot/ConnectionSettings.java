package com.example.mastering_spring_boot;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "account.client")
@Data
public class ConnectionSettings {
    private String host;
    private int port;
    private String logDir;
    private int timeout;

    @Bean
    public void display(){
        System.out.println("CONNECTION SETTINGS");
        System.out.println("Host: " + host);
        System.out.println("Port: " + port);
        System.out.println("LogDir: " + logDir);
        System.out.println("Timeout: " + timeout);
        System.out.println();
    }
}
