package com.myweb.transaction.test;

import com.myweb.jdbc.util.JDBCUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDemo {

    @Test
    public void testTransaction() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtil.getConn();
            //默认是自动提交
            conn.setAutoCommit(false);
//            String sql = "select * from account";
            String sql = "update account set money = money + ? where id =?";
            ps = conn.prepareStatement(sql);
            //加钱
            ps.setInt(1, 100);
            ps.setInt(2, 1);
            ps.executeUpdate();
            //异常
            int a = 10/0;

            //扣钱
            ps.setInt(1, -100);
            ps.setInt(2, 2);
            ps.executeUpdate();
            //提交事务
            conn.commit();

        } catch (SQLException e) {
            //失败，回滚事务
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();

        } finally {
            JDBCUtil.release(conn,ps);
        }

    }
}
