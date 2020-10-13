package com.sun.Dao;

import com.sun.Entity.District;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DistrictDao {
        List<District> listBySqlReturnEntity(@Param("sql")String sql);

        District load(Integer id);
}
