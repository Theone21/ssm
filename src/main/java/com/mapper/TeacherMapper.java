package com.mapper;

import com.model.Teacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherMapper {

    Teacher getTeacherById(Integer id);

    Integer updateTeacher();

    Integer insertTeacher();
}
