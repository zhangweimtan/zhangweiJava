package com.myweb.stu.daoImpl;

import com.myweb.stu.bean.Student;
import com.myweb.stu.dao.StudentDao;
import com.myweb.stu.util.JDBCUtil02;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;


import java.sql.SQLException;
import java.util.List;

/*
* StudentDao的实现，针对前面的规范的具体实现
* */
public class StudentDaoImpl implements StudentDao {
    /*
    * 查询所有学生
    * */
    @Override
    public List<Student> findAll(String sql) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());

        List<Student> list = runner.query(sql, new BeanListHandler<Student>(Student.class));

        return list;
    }

    @Override
    public void insert(Student student) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());
        runner.update("insert into t_stu values(null,?,?,?,?,?,?)",
                student.getSname(),
                student.getGender(),
                student.getPhone(),
                student.getBirthday(),
                student.getHobby(),
                student.getInfo()
                );
    }

    @Override
    public void update(Student student) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());

        runner.update("update t_stu set sname=?, gender=?, phone=?, birthday=?, hobby=?, info=? where sid=?",
                student.getSname(),
                student.getGender(),
                student.getPhone(),
                student.getBirthday(),
                student.getHobby(),
                student.getInfo(),
                student.getSid()
        );
    }

    @Override
    public void delete(Student student) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());

        runner.update("delete from t_stu where sid=?",
               student.getSid()
        );
    }

}
