package com.party.controller;

import com.party.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;


/**
 * Created by guhao on 2017/8/24.
 */
@Controller
public class LoginController {
    @Autowired
    private StudentService studentService;

    @ResponseBody
    @RequestMapping("CheckLogin")
    public boolean CheckLoginId(String studentId){
              return studentService.QueryStudentIdService(studentId);
    }

    @ResponseBody
    @RequestMapping("Login.do")
    public boolean Login(HttpSession session, String studentId, String studentPassword){
       if( studentService.CheckStudentLoginService(studentId,studentPassword)){
           session.setAttribute("User",studentId);
           return true;
       }
        else  return false;
        }
    @RequestMapping("ExitSystem.do")
    public String ExitSystem(HttpSession session,SessionStatus sessionStatus){
        String studentId = (String)session.getAttribute("User");
        session.removeAttribute("User");
        session.invalidate();
        sessionStatus.setComplete();
        return "welcome";
    }

    @ResponseBody
    @RequestMapping("CheckLoginTime.do")
    public boolean CheckLoginTime(HttpSession session){
        String studentId = (String) session.getAttribute("User");
               return studentService.CheckLoginTimeService(studentId);
    }

    @ResponseBody
    @RequestMapping("SendFlower.do")
    public boolean SendFlower(HttpSession session){
        String studentId = (String)session.getAttribute("User");
         return   studentService.SendFlowerService(studentId);
    }

    @ResponseBody
    @RequestMapping("SaveLoginTime.do")
    public boolean SaveLoginTime(HttpSession session){
        String studentId = (String)session.getAttribute("User");
        return studentService.SaveLoginTimeService(studentId);
    }
}
