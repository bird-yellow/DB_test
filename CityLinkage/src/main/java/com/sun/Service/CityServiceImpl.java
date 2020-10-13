package com.sun.Service;

import com.sun.Dao.CityDao;
import com.sun.Entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl  implements  CityService{
    @Autowired
    private CityDao cityDao;

    @Override
    public List<City> listBySqlReturnEntity(String sql) {
            return  cityDao.listBySqlReturnEntity(sql);
    }

    @Override
    public City load(Integer id) {
        return  cityDao.load(id);
    }
}
