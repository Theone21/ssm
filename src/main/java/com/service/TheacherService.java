package com.service;

import com.model.Teacher;

public interface TheacherService {

    Teacher getTeacherById(Integer id);

    void testTransaction();
}
