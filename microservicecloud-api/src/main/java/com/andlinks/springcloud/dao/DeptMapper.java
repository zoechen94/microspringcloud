package com.andlinks.springcloud.dao;

import com.andlinks.springcloud.pojo.entity.Dept;

import java.util.List;

public interface DeptMapper {
    int deleteByPrimaryKey(Long deptno);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Long deptno);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);

    Dept selectById(Long id);

    List<Dept> selectAll();
}