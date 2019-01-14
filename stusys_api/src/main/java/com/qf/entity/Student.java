package com.qf.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author LJM
 * @Date 2019/1/14
 */
@Data
public class Student implements Serializable{
    private Integer id;
    private String name;
    private Integer age;
    private String claName; //所属班级

}
