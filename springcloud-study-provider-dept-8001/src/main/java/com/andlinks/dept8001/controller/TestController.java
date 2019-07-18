package com.andlinks.dept8001.controller;

import com.andlinks.dept8001.service.Test;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Api(value = "con")
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private Test test;
@ApiOperation("测试")
    @GetMapping("/add")
    public void setTest(){
        test.insert();
    }
}
