package com.andlinks.consumerdept80;

import com.andlinks.consumerdept80.com.andlinks.rule.DiyRule;
import com.andlinks.consumerdept80.com.andlinks.rule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "STUDY-SPRINGCLOUD-DEPT",configuration = MyRule.class)
public class ConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApp.class, args);
    }
}
