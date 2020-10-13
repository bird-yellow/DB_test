package com.sun.Service;

import com.sun.Dao.DistrictDao;
import com.sun.Entity.District;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements  DistrictService {
    @Autowired
    private DistrictDao districtDao;

    @Override
    public List<District> listBySqlReturnEntity(String sql) {
        return districtDao.listBySqlReturnEntity(sql);
    }

    @Override
    public District load(Integer id) {
        return districtDao.load(id);
    }
}
