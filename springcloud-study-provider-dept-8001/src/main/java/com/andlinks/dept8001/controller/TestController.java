package com.andlinks.dept8001.controller;

import com.andlinks.dept8001.service.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private Test test;
    @GetMapping("/add")
    public void setTest(){
        test.insert();
    }
}
