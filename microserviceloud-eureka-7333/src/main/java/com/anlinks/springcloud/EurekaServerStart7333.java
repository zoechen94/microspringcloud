package com.anlinks.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerStart7333 {
    public static void main(String[] args){
        SpringApplication.run(EurekaServerStart7333.class,args);
    }
}
