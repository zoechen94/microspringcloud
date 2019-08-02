package com.andlinks.dept8001.service;

import com.andlinks.springcloud.dao.DeptMapper;
import com.andlinks.springcloud.pojo.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements Test {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public void insert() {
        Dept dept1=new Dept();
         dept1.setDname("我是");
         deptMapper.insert(dept1);
    }

    @Override
    public Dept getOneById(Long id) {
        return deptMapper.selectById(id);
    }

    @Override
    public List<Dept> listAll() {
        return deptMapper.selectAll();
    }
}
