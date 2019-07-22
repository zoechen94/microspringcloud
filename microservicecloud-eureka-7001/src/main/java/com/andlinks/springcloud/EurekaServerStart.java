package com.andlinks.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerStart {
    public static void main(String[] args){
        SpringApplication.run(EurekaServerStart.class,args);
    }
}
