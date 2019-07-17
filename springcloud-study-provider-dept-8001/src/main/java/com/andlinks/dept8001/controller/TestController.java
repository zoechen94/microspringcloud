package com.andlinks.dept8001.controller;

import com.andlinks.dept8001.dao.DeptMapper;
import com.andlinks.dept8001.service.Test;
import com.andlinks.dept8001.service.impl.TestServiceImpl;
import com.andlinks.springcloud.pojo.entity.Dept;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.io.ResolverUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/set")
    @ApiOperation(value = "测试")
    public void sett(){
        Test test=new TestServiceImpl();
        Dept dept=new Dept();
        dept.setD("我是一只羊");
        test.insert(dept);
    }

    @GetMapping("/getOne")
    @ApiOperation(value = "测试One")
    public Dept getOne(){
      Test test=new TestServiceImpl();
      return test.getOne();
    }
}
