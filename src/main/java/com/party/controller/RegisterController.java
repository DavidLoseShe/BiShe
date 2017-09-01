package com.party.controller;

import com.party.service.StudentService;
import com.party.until.MailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Random;

/**
 * Created by 28223 on 2017/8/29.
 */
@Controller
public class RegisterController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private MailUtil mailUtil;

    @ResponseBody
    @RequestMapping("checkUserName")
    public  boolean CheckRegister(String regUserName){
        return   studentService.QueryStudentIdService(regUserName);

    }
    @ResponseBody
    @RequestMapping("Register.do")
    public boolean RegisterNewUser(String regUserName,String regPassword,String regpasswordenter,HttpSession session,String validate){
        String s= (String) session.getAttribute("validate");
        if(validate.equals(s)){
          if (!studentService.QueryStudentIdService(regUserName)) {
              studentService.addNewUser(regUserName,regpasswordenter);
          }
          return true;
      }
      return false;
    }
    @ResponseBody
    @RequestMapping("validateEmail.do")
    public boolean validateEmail(HttpSession session,String email){
        StringBuilder str=new StringBuilder();//定义变长字符串
        Random random=new Random();
                         //随机生成数字，并添加到字符串
        for(int i=0;i<8;i++){
            str.append(random.nextInt(10));
        }
        String s= str.toString();
        session.setAttribute("validate",s);
        mailUtil.send(email, "This is a test single mail", s);
        return true;
    }
}
