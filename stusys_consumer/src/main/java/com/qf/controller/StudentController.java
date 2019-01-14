package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Student;
import com.qf.service.IStudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author LJM
 * @Date 2019/1/14
 */
@Controller
@RequestMapping(value = "/stu")
public class StudentController {

    @Reference
    private IStudentService studentService;

    @RequestMapping(value = "/getStuList")
    public String getStuList(Model model){
        List<Student> stuList = studentService.getStuList();
        model.addAttribute("stuList",stuList);

        return "stuList";
    }
}

