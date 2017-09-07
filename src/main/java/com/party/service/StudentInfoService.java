package com.party.service;

import com.party.dao.StudentInfoDao;
import com.party.entity.StudentInformation;
import com.party.iService.IStudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 28223 on 2017/8/24.
 */
@Service
@Transactional
public class StudentInfoService implements IStudentInfoService {
    @Autowired
    private StudentInfoDao studentInfoDao;
    @Override
    public StudentInformation QueryStudentInfo(String studentId) {

        return studentInfoDao.QueryStudentInfo(studentId);
    }

    @Override
    public boolean ModifyStudentInfo(String studentId, String studentName, String studentClass, String studentQQ, String studentSay) {

        return studentInfoDao.ModifyStudentInfo(studentId,studentName,
                studentClass,studentQQ,studentSay);
    }
}
