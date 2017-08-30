package com.party.controller;

import com.party.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 28223 on 2017/8/29.
 */
@Controller
public class RegisterController {
    @Autowired
    private StudentService studentService;

    @ResponseBody
    @RequestMapping("checkUserName")
    public  boolean CheckRegister(String regUserName){
        return   studentService.QueryStudentIdService(regUserName);

    }
    @RequestMapping("Register.do")
    public String RegisterNewUser(String regUserName,String regPassword,String regpasswordenter){

        if (!studentService.QueryStudentIdService(regUserName)) {
            studentService.addNewUser(regUserName,regpasswordenter);
        }
        return "welcome";
    }
}
