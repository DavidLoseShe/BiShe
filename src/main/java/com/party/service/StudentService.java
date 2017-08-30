package com.party.service;

import com.party.dao.StudentDao;
import com.party.iService.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by guhao on 2017/8/24.
 */
@Service
public class StudentService implements IStudentService{

    @Autowired
    private StudentDao studentDao;

    @Override
    public boolean QueryStudentIdService(String studentId) {
        return studentDao.QueryStudentIdDao(studentId);

    }

    @Override
    public boolean CheckStudentLoginService(String studentId,String studentPassword) {

        return studentDao.CheckStudentLoginDao(studentId,studentPassword);
    }
    public boolean SaveLoginTimeService(String studentId){
        return studentDao.SaveLoginTimeDao(studentId);
    }



    public boolean CheckLoginTimeService(String studentId){
            Date loginTime=studentDao.CheckLoginTimeDao(studentId);

            Calendar calDateA = Calendar.getInstance();
            calDateA.setTime(loginTime);

            Calendar calDateB = Calendar.getInstance();
            calDateB.setTime(new Date());

            return calDateA.get(Calendar.YEAR) == calDateB.get(Calendar.YEAR)
                    && calDateA.get(Calendar.MONTH) == calDateB.get(Calendar.MONTH)
                    &&  calDateA.get(Calendar.DAY_OF_MONTH) == calDateB.get(Calendar.DAY_OF_MONTH);

    }

    @Override
    public boolean SendFlowerService(String studentId) {
        return  studentDao.SendFlowers(studentId);

    }

    @Override
    public String QueryStudentNameService(String studentId) {
        return studentDao.QueryStudentNameDao(studentId);
    }

    //qi
    public boolean addNewUser(String studentId,String studentPassword){
        return studentDao.addNewUser(studentId,studentPassword);
    }
}
