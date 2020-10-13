package com.sun.Service;

import com.sun.POJO.Manage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ManageService  {
    Manage load(Integer id);

    List<Manage> findBySqlReturnEntity(@Param("Sql") String sql);
}
