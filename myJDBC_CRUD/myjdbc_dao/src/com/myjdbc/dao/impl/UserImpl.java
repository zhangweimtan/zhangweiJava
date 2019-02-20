package com.myjdbc.dao.impl;

import com.myjdbc.dao.demo.UserDao;
import com.myjdbc.dao.user.User;
import com.myjdbc.util.JDBCUtil;

import java.io.OutputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.myjdbc.util.JDBCUtil.getConn;
import static com.myjdbc.util.JDBCUtil.release;

public class UserImpl implements UserDao {

    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    String result = null;

    @Override
    public void findAll() {
//        List<User> usersList = new ArrayList<>();
//        User user = new User();
        try {
            //1,conn
            conn = JDBCUtil.getConn();
            //2, statement
            String sql = "select * from t_user";
            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(, );
            rs = ps.executeQuery();
            while(rs.next()){
                 String userName = rs.getString("username");
//                 user.setName(userName);
                 String password = rs.getString("password");
//                 user.setPassword(password);
//                 usersList.add(user);
//                result = "name:"+userName+"= password:"+password;
                System.out.println("name:"+userName+"= password:"+password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(conn,st,rs );
        }
    }

    @Override
    public void insert(String userName, String psd){
        Connection conn = null;
        Statement st = null;
        try {
            //添加
            //1,获取连接对象，ctrl alt v
            conn = getConn();
            //2,根据连接，得到statement

            String sql = "INSERT INTO t_user VALUES (null,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,userName );
            ps.setString(2, psd);
            //3,执行sql语句,返回数值
            int i = ps.executeUpdate();
            //返回的数值，如果大于0，即成功，否则失败
            if(i>0){
                System.out.println("添加成功！");
            }else {
                System.out.println("添加失败！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //释放资源
            release(conn,st);
        }
    }

    @Override
    public void delete(int id){
        Connection conn = null;
        Statement st = null;
        try {
            //删除
            //1,获取连接对象，ctrl alt v
            conn = getConn();
            //2,根据连接，得到statement
//            st = conn.createStatement();
            String sql = "delete from t_user where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, 5);
            int i = ps.executeUpdate();
            //3,执行sql语句
//            int i = st.executeUpdate(sql);
            //返回的数值，如果大于0，即成功，否则失败
            if(i>0){
                System.out.println("删除成功！");
            }else {
                System.out.println("删除失败！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //释放资源
            release(conn,st);
        }

    }

    @Override
    public void update(String psd, int id){
        Connection conn = null;
        Statement st = null;
        try {
            //修改update student set age = 16 where id = 7
            //1,获取连接对象，ctrl alt v
            conn = getConn();
            //2,根据连接，得到statement
//            st = conn.createStatement();
            String sql = "update t_user set password = ? where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,psd );
            ps.setInt(2,id );
            int i = ps.executeUpdate();
            //3,执行sql语句
//            int i = st.executeUpdate(sql);
            //返回的数值，如果大于0，即成功，否则失败
            if(i>0){
                System.out.println("更新成功！");
            }else {
                System.out.println("更新失败！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //释放资源
            release(conn,st);
        }
    }

    @Override
    public void login(String userName, String psd){
        try {
            //1,conn
            conn = JDBCUtil.getConn();
            //2, PrepareStatement,预处理sql，
            String sql = "select * from t_user where username=? and password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,userName );
            ps.setString(2,psd);
            //3, rs
            ResultSet rs = ps.executeQuery();
            //4,if else
            if(rs.next()){
                System.out.println("登陆成功");
            }else{
                System.out.println("登陆失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(conn,st,rs );
        }
    }
}
