package com.andlinks.dept8001.controller;

import com.andlinks.dept8001.dao.DeptMapper;
import com.andlinks.springcloud.pojo.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private DeptMapper deptMapper;
    @GetMapping("/set")
    public void sett(){
        Dept dept=new Dept();
        dept.setD("我是一只羊");
        deptMapper.insert(dept);
    }
}
