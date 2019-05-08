package com.myweb.dao;

import com.myweb.bean.Words;

import java.sql.SQLException;
import java.util.List;

public interface WordDao{
     List<Words> findWord(String word) throws SQLException;
}
