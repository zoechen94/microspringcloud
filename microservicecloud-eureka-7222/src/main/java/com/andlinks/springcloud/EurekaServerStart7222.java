package com.andlinks.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerStart7222 {
    public static void main(String[] args){
        SpringApplication.run(EurekaServerStart7222.class,args);
    }
}
