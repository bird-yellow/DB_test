package com.sun.Service;

import com.sun.Dao.ManageDao;
import com.sun.POJO.Manage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManageServiceImpl implements  ManageService {
    @Autowired
    private ManageDao manageDao;

    @Override
    public Manage load(Integer id) {
            return  manageDao.load(id);
    }

    @Override
    public List<Manage> findBySqlReturnEntity(String sql) {
        return  manageDao.findBySqlReturnEntity(sql);
    }
}
