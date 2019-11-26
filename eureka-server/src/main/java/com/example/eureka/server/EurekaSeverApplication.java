package com.example.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

@SpringBootApplication
@EnableApolloConfig
@EnableEurekaServer
public class EurekaSeverApplication {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SpringApplication.run(EurekaSeverApplication.class, args);
    }

}
