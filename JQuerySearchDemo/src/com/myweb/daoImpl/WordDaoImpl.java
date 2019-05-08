package com.myweb.daoImpl;

import com.myweb.bean.Words;
import com.myweb.dao.WordDao;
import com.myweb.util.JDBCUtil02;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class WordDaoImpl implements WordDao {
    @Override
    public List<Words> findWord(String word) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());
        String sql = "select * from s_word where words like ?";
        return runner.query(sql,  new BeanListHandler<Words>(Words.class),word+"%");

    }
}
