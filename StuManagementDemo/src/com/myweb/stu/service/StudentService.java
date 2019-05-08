package com.myweb.stu.service;

import com.myweb.stu.bean.PageBean;
import com.myweb.stu.bean.Student;

import java.sql.SQLException;
import java.util.List;

/*
* 这是学生业务的处理规范
* */
public interface StudentService<T> {
    List<Student> findAll(String sql) throws SQLException;
    void insert(Student student) throws SQLException;
    void update(Student student) throws SQLException;
    void delete(Student student) throws SQLException;
    List<Student> search(String sname, String sgender) throws SQLException;
    PageBean<T> findByPage(int page) throws SQLException;
    int countAll() throws SQLException;


}
