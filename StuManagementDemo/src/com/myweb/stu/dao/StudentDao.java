package com.myweb.stu.dao;

import com.myweb.stu.bean.PageBean;
import com.myweb.stu.bean.Student;

import java.sql.SQLException;
import java.util.List;

/*
* 针对stus数据的访问和操作
* */
public interface StudentDao {
    int PAGE_SIZE =5;

    List<Student> findAll(String sql) throws SQLException;
    List<Student> findByPage(int page) throws SQLException;
    void insert(Student student) throws SQLException;
    void update(Student student) throws SQLException;
    void delete(Student student) throws SQLException;
    int countAll() throws SQLException;
    List<Student> search(String sname, String sgender) throws SQLException;
}
