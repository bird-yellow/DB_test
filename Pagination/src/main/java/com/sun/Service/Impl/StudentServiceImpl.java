package com.sun.Service.Impl;

import com.github.pagehelper.PageHelper;
import com.sun.Dao.StudentDao;
import com.sun.Entity.Student;
import com.sun.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> getAll() {
        return  studentDao.getAll();
    }
}
