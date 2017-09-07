package com.party.dao;

import com.party.entity.Student;
import com.party.iDao.ITestDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by guhao on 2017/8/21.
 */
@Repository
public class TestDao implements ITestDao{
     @Resource
     private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }


    public Student query() {
        int a=2;
      Student student = (Student) getCurrentSession().get(Student.class,a);
        return student;
    }
    public  void save(){
        Student student =new Student();
        student.setId(2);
        student.setAddress("4564654");
        getCurrentSession().update(student);
    }

}
