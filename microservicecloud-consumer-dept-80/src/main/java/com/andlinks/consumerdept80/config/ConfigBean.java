package com.andlinks.consumerdept80.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced //Spring cloud Ribbon是基于Netflix Ribbon实现的一套客户端 负载均衡的工具。
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    //自定义轮训规则 ,因为已经自定义了一个规则MyRule，所以这里隐藏
//    @Bean
//    public IRule getRule(){
//        return new RandomRule();
//    }
}
