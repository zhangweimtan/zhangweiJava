package com.myweb.dao;

import com.myweb.bean.City;

import java.sql.SQLException;
import java.util.List;

public interface CityDao {
    List<City> findCity(int pid) throws SQLException;
}
