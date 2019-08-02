package com.andlinks.consumerdept80.controller;

import com.andlinks.springcloud.common.ResultData;
import com.andlinks.springcloud.pojo.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {
//    private static final String REST_URL_PREFIX="http://localhost:8001/";

    //服务提供者
    private static final String REST_URL_PREFIX="http://STUDY-SPRINGCLOUD-DEPT";
    /**
     * 提供了多种便捷访问Http服务的方法
     * url
     */
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/add")
    public ResultData<String> add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/test/add",null,ResultData.class);
    }

    @RequestMapping(value = "/consumer/{id}")
    public ResultData<Dept> getOneById(@PathVariable Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/test/"+id,ResultData.class);
    }

    @RequestMapping(value = "/consumer/all")
    public ResultData<List<Dept>> getAll(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/test/listAll",ResultData.class);
    }
}
