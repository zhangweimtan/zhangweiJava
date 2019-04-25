package com.myweb.stu.dao;

import com.myweb.stu.bean.Student;

import java.sql.SQLException;
import java.util.List;

/*
* 针对stus数据的访问和操作
* */
public interface StudentDao {
    List<Student> findAll(String sql) throws SQLException;
    void insert(Student student) throws SQLException;
    void update(Student student) throws SQLException;
    void delete(Student student) throws SQLException;
}
