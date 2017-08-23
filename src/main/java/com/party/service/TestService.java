package com.party.service;

import com.party.dao.TestDao;
import com.party.entity.Student;
import com.party.iService.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by guhao on 2017/8/21.
 */
@Service
public class TestService implements ITestService{

    @Autowired
    private TestDao testDao;
    public Student query() {
       return testDao.query();
    }
}
