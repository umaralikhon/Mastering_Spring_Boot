package com.example.mastering_spring_boot.learning;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ConnectionSettings.class)
public class AccountsClientConfig {
    ConnectionSettings connectionSettings;

    public AccountsClientConfig(ConnectionSettings connectionSettings){
        this.connectionSettings = connectionSettings;
    }

//    @Bean
    public void displayAccountClientConfig(){
        System.out.println("ACCOUNT CLIENT CONFIG");
        System.out.println("Host: " + connectionSettings.getHost());
        System.out.println("Port: " + connectionSettings.getPort());
        System.out.println();
    }
}
