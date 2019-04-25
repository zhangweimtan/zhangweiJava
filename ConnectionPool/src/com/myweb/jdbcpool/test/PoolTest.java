package com.myweb.jdbcpool.test;

import com.myweb.jdbc.util.MyDataBase;
import org.junit.Test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PoolTest {

    @Test
    public void testPoll() {
        //new 一个连接池
        MyDataBase dateBase = new MyDataBase();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = dateBase.getConnection();
            String sql = "insert into account values (null, ?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, "zansan");
            ps.setInt(2, 100);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            //归还连接
            dateBase.addBack(conn);
        }
    }
}
