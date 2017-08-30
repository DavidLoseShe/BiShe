package com.party.dao;

import com.party.entity.StudentInformation;
import com.party.iDao.IStudentDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
        return this.sessionFactory.openSession();
    }

    @Override
    public boolean QueryStudentIdDao(String studentId) {
        Session session=getCurrentSession();
        StudentInformation studentInformation= (StudentInformation) session.get(StudentInformation.class,studentId);
        session.close();
        if (studentInformation!=null){
            return true;
        }
        else return false;
    }

    @Override
    public boolean CheckStudentLoginDao(String studentId,String studentPassword) {
        Session session=getCurrentSession();
       StudentInformation studentInformation= (StudentInformation) session.get(StudentInformation.class,studentId);
        session.close();
      if(studentInformation.getStudentPassword().equals(studentPassword)){
          return true;
      }
       else return false;
    }
    public boolean SaveLoginTimeDao(String studentId){
        Session session=getCurrentSession();
        StudentInformation studentinformation = (StudentInformation) session.get(StudentInformation.class,studentId);
        studentinformation.setStudentLoginTime(new Date());
        Transaction trans = session.beginTransaction();
        session.update(studentinformation);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public boolean SendFlowers(String studentId) {
        Session session =getCurrentSession();
        StudentInformation studentinformation = (StudentInformation) session.get(StudentInformation.class,studentId);
        studentinformation.setStudentflower(studentinformation.getStudentflower()+1);
        Transaction trans = session.beginTransaction();
        session.update(studentinformation);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public Date CheckLoginTimeDao(String studentId) {
        Session session =getCurrentSession();
        StudentInformation studentinformation = (StudentInformation) session.get(StudentInformation.class,studentId);
        session.close();
        return  studentinformation.getStudentLoginTime();
    }

    @Override
    public String QueryStudentNameDao(String studentId) {
        Session session =getCurrentSession();
        StudentInformation studentinformation = (StudentInformation) session.get(StudentInformation.class,studentId);
        session.close();
        return studentinformation.getStudentName();
    }

    //qi
    public boolean addNewUser(String studentId,String studentPassword){
        Session session=getCurrentSession();
        StudentInformation studentInformation = new StudentInformation();
        studentInformation.setStudentId(studentId);
        studentInformation.setStudentPassword(studentPassword);
        studentInformation.setStudentflower(0);
        studentInformation.setStudentLoginTime(new Date());
        Transaction transaction=session.beginTransaction();
        session.save(studentInformation);
        transaction.commit();
        session.close();
        return true;
    }
}
