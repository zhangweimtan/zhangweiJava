package com.myweb.stu.dao;

import com.myweb.stu.bean.Student;

import java.util.List;

public interface StuDao {

    /*
    * 查询学生信息，返回集合
    * */
    List<Student> findAll();

}
