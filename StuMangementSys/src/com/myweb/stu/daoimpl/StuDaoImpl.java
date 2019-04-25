package com.myweb.stu.daoimpl;

import com.myweb.stu.bean.Student;
import com.myweb.stu.dao.StuDao;
import com.myweb.stu.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StuDaoImpl implements StuDao {

    static Connection conn = null;
    static PreparedStatement ps = null;
    static ResultSet rs = null;
    List<Student> list = new ArrayList<>();
    @Override
    public List<Student> findAll() {
        try {
            //1,conn
            Connection conn = JDBCUtil.getConn();
            String sql = "select * from t_stus";
            //2, ps
            PreparedStatement ps = conn.prepareStatement(sql);
            //3,ps插入sql关键词
//            ps.setString(1, userName);
//            ps.setString(2, password);
            //4,exec
            ResultSet rs = ps.executeQuery();
            //5,success,true

            //数据多了，用对象装，对象多，用集合装

            while (rs.next()){
                Student stu = new Student();

                stu.setId(rs.getInt("id"));
                stu.setAge(rs.getInt("age"));
                stu.setName(rs.getString("name"));
                stu.setGender(rs.getString("gender"));
                stu.setAddress(rs.getString("address"));
                list.add(stu);
            }

//            System.out.println("数据库状态："+conn.isClosed());
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //ps,st
            JDBCUtil.release(conn,ps,rs);
        }
        return list;
    }
}
