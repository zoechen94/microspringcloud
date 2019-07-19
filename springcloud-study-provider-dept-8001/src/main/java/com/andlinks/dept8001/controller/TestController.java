package com.andlinks.dept8001.controller;

import com.andlinks.dept8001.service.Test;
import com.andlinks.springcloud.common.ResultData;
import com.andlinks.springcloud.pojo.entity.Dept;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "con")
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private Test test;

    @ApiOperation("测试")
    @PostMapping("/add")
    public ResultData<String> setTest() {
        test.insert();
        return ResultData.success("成功");
    }

    @ApiOperation("根据id查询单个实体")
    @GetMapping("/{id}")
    @ApiImplicitParam(name = "id",value = "主键",paramType = "path",defaultValue = "1",dataType = "Long")
    public ResultData<Dept> getOneById(@PathVariable Long id){
        return ResultData.success(test.getOneById(id));
    }

    @ApiOperation("查询所有数据")
    @GetMapping("/listAll")
    public ResultData<List<Dept>> listAll(){
        return ResultData.success(test.listAll());
    }
}
