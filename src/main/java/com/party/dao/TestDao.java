package com.party.dao;

import com.party.entity.Student;
import com.party.iDao.ITestDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by guhao on 2017/8/21.
 */
@Repository
public class TestDao implements ITestDao{
     @Autowired
     private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.openSession();
    }


    public Student query() {
        int a=2;
        /*String hql="from Student";*/
      Student student = (Student) getCurrentSession().get(Student.class,a);
        return student;
    }

}
