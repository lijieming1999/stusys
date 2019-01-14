package com.qf.service;

import com.qf.entity.Student;

import java.util.List;

/**
 * @author LJM
 * @Date 2019/1/14
 */
public interface IStudentService {

    public List<Student> getStuList();
    public int addStu(Student student);
}
