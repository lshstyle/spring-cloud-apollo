package com.example.spring.boot;

import org.springframework.boot.SpringApplication;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@org.springframework.boot.autoconfigure.SpringBootApplication
@EnableApolloConfig
@EnableEurekaClient
public class SpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class, args);
    }
}
