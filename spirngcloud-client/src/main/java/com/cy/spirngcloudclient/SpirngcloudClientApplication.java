package com.cy.spirngcloudclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.cy")
@EnableEurekaClient
public class SpirngcloudClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpirngcloudClientApplication.class, args);
    }

}
