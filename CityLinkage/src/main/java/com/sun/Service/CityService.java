package com.sun.Service;

import com.sun.Entity.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CityService {
    List<City> listBySqlReturnEntity(@Param("sql") String sql);
    City        load(Integer id);

}
