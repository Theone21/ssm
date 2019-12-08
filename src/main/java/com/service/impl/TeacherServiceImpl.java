package com.service.impl;

import com.mapper.TeacherMapper;
import com.model.Teacher;
import com.service.TheacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TeacherServiceImpl implements TheacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    public Teacher getTeacherById(Integer id) {
        return teacherMapper.getTeacherById(id);
    }

    @Transactional
    public void testTransaction(){
        teacherMapper.updateTeacher();
        teacherMapper.insertTeacher();
    }
}
