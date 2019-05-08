package com.myweb.stu.daoImpl;

import com.myweb.stu.bean.PageBean;
import com.myweb.stu.bean.Student;
import com.myweb.stu.dao.StudentDao;
import com.myweb.stu.util.JDBCUtil02;

import com.myweb.stu.util.TextUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;


import java.awt.*;
import java.sql.SQLException;
import java.util.ArrayList;
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
    public List<Student> findByPage(int page) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());
//        int offset = (page-1)*5;
        List<Student> list = runner.query("select * from t_stu limit ? offset ?", new BeanListHandler<Student>(Student.class),PAGE_SIZE,(page-1)*PAGE_SIZE);
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

    @Override
    public int countAll() throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());
        Long query = (long) runner.query("select count(*) from t_stu", new ScalarHandler<>());
        int result = query.intValue();
        return result;
    }

    @Override
    public List<Student> search(String sname, String sgender) throws SQLException {
//        System.out.println("name=="+sname+"  gender=="+sgender);
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());
        /*
         * 如果只有姓名，模糊查询sname like?
         * 如果只有性别 gender=?
         * 如果都有，and
         * 如果没有，查所有findAll
         * */
        String sql = "select * from t_stu where 1=1";
        List<String> slist = new ArrayList<>();
        //判断字符串，姓名和性别
        if (!TextUtil.isEmpty(sname)) {
            sql = sql + " and sname like ?";
            slist.add("%" + sname + "%");
        }
        if (!TextUtil.isEmpty(sgender)) {
            sql = sql + " and gender=?";
            slist.add(sgender);
        }
        List<Student> list = runner.query(sql, new BeanListHandler<Student>(Student.class), slist.toArray());
        return list;
    }


}


