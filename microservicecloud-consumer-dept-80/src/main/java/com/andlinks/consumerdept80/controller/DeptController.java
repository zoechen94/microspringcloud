package com.andlinks.consumerdept80.controller;

import com.andlinks.springcloud.pojo.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/dept")
public class DeptController {
    private static final String REST_URL_PREFIX="http://localhost:8001/";
    /**
     * 提供了多种便捷访问Http服务的方法
     * url
     */
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/add")
    public String add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/test/add",null,String.class);
    }
}
