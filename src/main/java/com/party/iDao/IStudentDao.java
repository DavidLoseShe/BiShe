package com.party.iDao;

import java.util.Date;

/**
 * Created by guhao on 2017/8/24.
 */
public interface IStudentDao {
    boolean QueryStudentIdDao(String studentId);
    boolean CheckStudentLoginDao(String studentId,String studentPassword);
    boolean SaveLoginTimeDao(String studentId);
    boolean SendFlowers(String studentId);
    Date CheckLoginTimeDao(String studentId);
    String QueryStudentNameDao(String studentId);
    //qi
    boolean addNewUser(String studentId,String studentPassword);
}
