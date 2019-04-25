package com.myweb.stu.serviceImpl;

import com.myweb.stu.bean.Student;
import com.myweb.stu.dao.StudentDao;
import com.myweb.stu.daoImpl.StudentDaoImpl;
import com.myweb.stu.service.StudentService;

import java.sql.SQLException;
import java.util.List;

/*
*负责查询所有学生的信息，然后呈现在list.jsp
 *  */

public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> findAll(String sql) throws SQLException {
        StudentDao dao = new StudentDaoImpl();
        return dao.findAll(sql);
    }

    @Override
    public void insert(Student student) throws SQLException {
        StudentDao dao = new StudentDaoImpl();
        dao.insert(student);
    }

    @Override
    public void update(Student student) throws SQLException {
        StudentDao dao = new StudentDaoImpl();
        dao.update(student);
    }
    @Override
    public void delete(Student student) throws SQLException {
        StudentDao dao = new StudentDaoImpl();
        dao.delete(student);
    }
}
