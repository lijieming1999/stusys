package com.qf.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.IStudentDao;
import com.qf.entity.Student;
import com.qf.service.IStudentService;

import java.util.List;

/**
 * @author LJM
 * @Date 2019/1/14
 */
@Service
public class StudentServiceImpl implements IStudentService{

    @Reference
    private IStudentDao studentDao;


    @Override
    public List<Student> getStuList() {
        System.out.println("提供者被调用");
        return studentDao.getStuList();
    }

    @Override
    public int addStu(Student student) {
        return 0;
    }
}
