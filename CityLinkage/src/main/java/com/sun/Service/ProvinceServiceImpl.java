package com.sun.Service;

import com.sun.Dao.ProvinceDao;
import com.sun.Entity.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl implements  ProvinceService {
        @Autowired
        private ProvinceDao provinceDao;

    @Override
    public List<Province> listBySqlReturnEntity(String sql) {
        return provinceDao.listBySqlReturnEntity(sql);
    }

    @Override
    public Province load(Integer id) {
        return provinceDao.load(id);
    }
}
