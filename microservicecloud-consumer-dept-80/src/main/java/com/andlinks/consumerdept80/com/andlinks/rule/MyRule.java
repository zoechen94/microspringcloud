package com.andlinks.consumerdept80.com.andlinks.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义的Ribbon规则，官方警告不能在@ComponetScan的包下或者子包下，那启动类是在整个包下的，
 * 启动类的@SpringBootApplication 打开是有ComponentScan，于是就另外开一个包放进去。
 */
@Configuration
public class MyRule {
    @Bean
    public IRule getMyRule(){
//        return new RandomRule();
        return new DiyRule();
    }
}
