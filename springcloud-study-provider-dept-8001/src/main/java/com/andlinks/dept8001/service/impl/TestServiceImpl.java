package com.andlinks.dept8001.service.impl;

import com.andlinks.dept8001.dao.DeptMapper;
import com.andlinks.dept8001.service.Test;
import com.andlinks.springcloud.pojo.entity.Dept;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class TestServiceImpl implements Test {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public void insert(Dept dept){
       deptMapper.insert(dept);
    }

    @Override
    public Dept getOne() {
        return deptMapper.selectAll();
    }
}
