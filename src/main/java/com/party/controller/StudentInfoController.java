package com.party.controller;

import com.party.entity.StudentInformation;
import com.party.service.StudentInfoService;
import com.party.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by 28223 on 2017/8/24.
 */
@Controller
public class StudentInfoController {
    @Autowired
    private StudentInfoService studentInfoService;
    @Autowired
    private StudentService studentService;

    @ResponseBody
    @RequestMapping("StudentInfo")
    public StudentInformation QueryStudentInfo(HttpSession session){
        String studentId=(String) session.getAttribute("User");
            StudentInformation studentInformation=studentInfoService.QueryStudentInfo(studentId);
        return studentInformation;
    }
    @ResponseBody
    @RequestMapping("ModifyStudentInfo")
    public Boolean ModifyStudentInfo(String studentName,
                                     String studentClass,String studentQQ,String studentSay,HttpSession session ){
        String studentId=(String) session.getAttribute("User");
        return studentInfoService.ModifyStudentInfo(studentId,studentName,
                studentClass,studentQQ,studentSay);
    }

    @ResponseBody
    @RequestMapping("QueryStudentName")
    public String QueryStudentName(HttpSession session){
        String studentId=(String) session.getAttribute("User");
        return studentService.QueryStudentNameService(studentId);
    }


}
