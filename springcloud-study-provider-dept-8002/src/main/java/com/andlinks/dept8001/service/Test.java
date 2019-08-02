package com.andlinks.dept8001.service;

import com.andlinks.springcloud.pojo.entity.Dept;

import java.util.List;

public interface Test {
    void insert();
    Dept getOneById(Long id);
    List<Dept> listAll();
}
