package com.andlinks.dept8001.service.impl;

import com.andlinks.dept8001.dao.DeptMapper;
import com.andlinks.dept8001.service.Test;
import com.andlinks.springcloud.pojo.entity.Dept;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements Test {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public void insert(Dept dept){
       deptMapper.insert(dept);
    }
}
