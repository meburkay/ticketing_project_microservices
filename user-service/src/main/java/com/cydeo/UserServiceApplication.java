package com.cydeo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//We add this for defining that this service will be eureka discovery client.Other than the server to the other services we must add this annotation. For the server we added the @EnableDiscoveryServer annotation.
@EnableDiscoveryClient
public class UserServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(UserServiceApplication.class,args);
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
