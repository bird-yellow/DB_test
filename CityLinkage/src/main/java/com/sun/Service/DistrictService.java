package com.sun.Service;

import com.sun.Entity.District;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DistrictService {
    List<District> listBySqlReturnEntity(@Param("sql")String sql);
    District    load(Integer id);
}
