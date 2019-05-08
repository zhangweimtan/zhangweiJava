package com.myweb.dao.impl;

import com.myweb.dao.UserDao;
import com.myweb.util.JDBCUtil02;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean checkUserName(String userName) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());
        String sql = "select count(*) from t_user where username = ?";
        Long result = (Long) runner.query(sql, new ScalarHandler(),userName);
//        System.out.println("result="+result);
//        long result = (long) runner.query(sql, new ScalarHandler(), userName);
        return result.intValue() >0 ;
    }
}
