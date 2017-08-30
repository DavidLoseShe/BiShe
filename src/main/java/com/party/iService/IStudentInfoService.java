package com.party.iService;

import com.party.entity.StudentInformation;

/**
 * Created by 28223 on 2017/8/24.
 */
public interface IStudentInfoService {
    StudentInformation QueryStudentInfo(String studentId);
    boolean ModifyStudentInfo(String studentId, String studentName,
                              String studentClass, String studentQQ, String studentSay);
}
