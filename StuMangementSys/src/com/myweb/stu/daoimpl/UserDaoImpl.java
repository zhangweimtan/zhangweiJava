package com.myweb.stu.daoimpl;

import com.myweb.stu.dao.UserDao;
import com.myweb.stu.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

    static Connection conn = null;
    static PreparedStatement ps = null;
    static ResultSet rs = null;
    @Override
    public boolean login(String userName, String password) {


        try {
            //1,conn
            Connection conn = JDBCUtil.getConn();
            String sql = "select * from t_user where username=? and password=?";
            //2, ps
            PreparedStatement ps = conn.prepareStatement(sql);
            //3,ps插入sql关键词
            ps.setString(1, userName);
            ps.setString(2, password);
            //4,exec
            ResultSet rs = ps.executeQuery();
            //5,success,true
            return rs.next();

//            System.out.println("数据库状态："+conn.isClosed());
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //ps,st
            JDBCUtil.release(conn,ps,rs);
        }
        return false;
    }
}
