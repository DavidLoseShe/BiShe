package com.party.iService;

/**
 * Created by guhao on 2017/8/24.
 */
public interface IStudentService {
    boolean QueryStudentIdService(String studentId);
    boolean CheckStudentLoginService(String studentId,String studentPassword);
    boolean SaveLoginTimeService(String studentId);
    boolean SendFlowerService(String studentId);
    String QueryStudentNameService(String studentId);
    boolean ModifyStudentPass(String studentId,String studentPassword);
    //qi
    boolean addNewUser(String studentId,String studentPassword);
}
