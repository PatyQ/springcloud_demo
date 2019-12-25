package com.cy.springbootserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringbootServer2Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootServer2Application.class, args);
    }

}
