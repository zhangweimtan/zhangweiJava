package com.myweb.stu.service;

import com.myweb.stu.bean.Student;

import java.sql.SQLException;
import java.util.List;

/*
* 这是学生业务的处理规范
* */
public interface StudentService {
    List<Student> findAll(String sql) throws SQLException;
    void insert(Student student) throws SQLException;
    void update(Student student) throws SQLException;
    void delete(Student student) throws SQLException;

}
