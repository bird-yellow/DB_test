package com.sun.Dao;

import com.sun.Entity.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CityDao {
        List<City>  listBySqlReturnEntity(@Param("sql") String sql);
        City        load(Integer id);
}
