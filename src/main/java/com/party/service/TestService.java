package com.party.service;

import com.party.dao.TestDao;
import com.party.entity.Student;
import com.party.iService.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by guhao on 2017/8/21.
 */
@Service
@Transactional
public class TestService implements ITestService{

    @Autowired
    private TestDao testDao;

    public Student query() {

        return testDao.query();
    }
    public   void  save()
    {
        testDao.save();
    }}
