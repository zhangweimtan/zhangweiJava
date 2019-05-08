package com.myweb.daoImpl;

import com.myweb.bean.City;
import com.myweb.dao.CityDao;
import com.myweb.util.JDBCUtil02;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class CityDaoImpl implements CityDao {
    @Override
    public List<City> findCity(int pid) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());
        String sql = "select * from city where pid =? ";
        return runner.query(sql, new BeanListHandler<City>(City.class),pid);

    }
}
