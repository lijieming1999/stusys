package com.qf.dao;

import com.qf.entity.Student;

import java.util.List;

/**
 * @author LJM
 * @Date 2019/1/14
 */
public interface IStudentDao {

    public List<Student> getStuList();
    public int addStu(Student student);
}
