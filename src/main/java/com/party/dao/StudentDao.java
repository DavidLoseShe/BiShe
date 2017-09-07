package com.party.dao;

import com.party.entity.StudentInformation;
import com.party.iDao.IStudentDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * Created by guhao on 2017/8/24.
 */
@Repository
public class StudentDao implements IStudentDao{

    @Autowired
    private SessionFactory sessionFactory;
    private Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public boolean QueryStudentIdDao(String studentId) {
        Session session=getCurrentSession();
        StudentInformation studentInformation= (StudentInformation) session.get(StudentInformation.class,studentId);
        if (studentInformation!=null){
            return true;
        }
        else return false;
    }

    @Override
    public boolean CheckStudentLoginDao(String studentId,String studentPassword) {
        Session session=getCurrentSession();
       StudentInformation studentInformation= (StudentInformation) session.get(StudentInformation.class,studentId);
      if(studentInformation.getStudentPassword().equals(studentPassword)){
          return true;
      }
       else return false;
    }
    public boolean SaveLoginTimeDao(String studentId){
        Session session=getCurrentSession();
        StudentInformation studentinformation = (StudentInformation) session.get(StudentInformation.class,studentId);
        studentinformation.setStudentLoginTime(new Date());
        session.update(studentinformation);
        return true;
    }

    @Override
    public boolean SendFlowers(String studentId) {
        Session session =getCurrentSession();
        StudentInformation studentinformation = (StudentInformation) session.get(StudentInformation.class,studentId);
        studentinformation.setStudentflower(studentinformation.getStudentflower()+1);
        session.update(studentinformation);
        return true;
    }

    @Override
    public Date CheckLoginTimeDao(String studentId) {
        Session session =getCurrentSession();
        StudentInformation studentinformation = (StudentInformation) session.get(StudentInformation.class,studentId);
        return  studentinformation.getStudentLoginTime();
    }

    @Override
    public String QueryStudentNameDao(String studentId) {
        Session session =getCurrentSession();
        StudentInformation studentinformation = (StudentInformation) session.get(StudentInformation.class,studentId);
        return studentinformation.getStudentName();
    }

    @Override
    public boolean ModifyStudentPassDao(String studentId, String studentPassword) {
        Session session=getCurrentSession();
        StudentInformation studentinformation = (StudentInformation) session.get(StudentInformation.class,studentId);
        studentinformation.setStudentPassword(studentPassword);
        session.update(studentinformation);
        return true;
    }

    //qi
    public boolean addNewUser(String studentId,String studentPassword){
        Session session=getCurrentSession();
        StudentInformation studentInformation = new StudentInformation();
        studentInformation.setStudentId(studentId);
        studentInformation.setStudentPassword(studentPassword);
        studentInformation.setStudentflower(0);
        studentInformation.setStudentLoginTime(new Date());
        session.save(studentInformation);
        return true;
    }
}
