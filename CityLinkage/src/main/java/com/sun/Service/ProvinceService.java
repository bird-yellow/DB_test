package com.sun.Service;

import com.sun.Entity.Province;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProvinceService {
    List<Province> listBySqlReturnEntity(@Param("sql") String sql);
    Province                load(Integer id);

}
