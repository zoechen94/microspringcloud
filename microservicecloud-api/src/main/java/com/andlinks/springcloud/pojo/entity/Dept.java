package com.andlinks.springcloud.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    private static final long serialVersionUID = 8894343976144923252L;
    private Long deptno;//
    private String dname;
    private String db_source;
    public static void main(String[]args){
        System.out.println("dd");
    }
}
