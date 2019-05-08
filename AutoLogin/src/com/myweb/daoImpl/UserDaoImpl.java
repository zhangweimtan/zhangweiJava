package com.myweb.daoImpl;

import com.myweb.dao.UserDao;
import com.myweb.domain.UserBean;
import com.myweb.util.JDBCUtil02;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public UserBean login(UserBean user) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());
        String sql = "select * from t_user where username=? and password=?";
        return runner.query(sql, new BeanHandler<UserBean>(UserBean.class), user.getUsername(), user.getPassword());

    }
}
