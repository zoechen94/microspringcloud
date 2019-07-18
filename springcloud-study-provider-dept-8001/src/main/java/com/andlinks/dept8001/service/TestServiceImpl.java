package com.andlinks.dept8001.service;

import com.andlinks.dept8001.dao.DeptMapper;
import com.andlinks.springcloud.pojo.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements Test {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public void insert() {
        Dept dept1=new Dept();
         dept1.setDname("我是");
         dept1.setDbSource("ddb01");
         deptMapper.insert(dept1);
    }
}
