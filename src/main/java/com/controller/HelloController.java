package com.controller;

import com.model.Teacher;
import com.service.TheacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    private TheacherService theacherService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

    @RequestMapping("/getTeacher")
    @ResponseBody
    public Teacher getTeacherById(Integer id){
        return theacherService.getTeacherById(id);
    }

    @RequestMapping("/testTransaction")
    @ResponseBody
    public Teacher testTransaction(){
        theacherService.testTransaction();
        return theacherService.getTeacherById(1);
    }
}
