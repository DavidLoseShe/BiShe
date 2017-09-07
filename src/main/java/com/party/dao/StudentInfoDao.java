package com.party.dao;

import com.party.entity.StudentInformation;
import com.party.iDao.IStudentInfoDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by 28223 on 2017/8/24.
 */
@Repository
public class StudentInfoDao implements IStudentInfoDao{
    @Autowired
    private SessionFactory sessionFactory;
    private  Session getCurrentSession(){
            return this.sessionFactory.openSession();
    }
    public StudentInformation QueryStudentInfo(String studentId){
        Session session= getCurrentSession();
        StudentInformation studentinformation= (StudentInformation) session.get(StudentInformation.class,studentId);
        return  studentinformation;
    }
    public boolean ModifyStudentInfo(String studentId,String studentName,
                                     String studentClass,String studentQQ,String studentSay){
        Session session = getCurrentSession();
        StudentInformation studentinformation= (StudentInformation) session.get(StudentInformation.class,studentId);
        studentinformation.setStudentQq(studentQQ);
        studentinformation.setStudentClass(studentClass);
        studentinformation.setStudentName(studentName);
        studentinformation.setStudentSay(studentSay);
        session.update(studentinformation);
        return true;
    }

}
