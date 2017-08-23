package com.party.controller;

import com.party.entity.Student;
import com.party.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by XRog
 * On 2/1/2017.12:36 AM
 */
@Controller
@RequestMapping("/test")
public class MainController {

@Autowired
    private TestService testService;

@ResponseBody
@RequestMapping("test")
    public Student Test(){

    return testService.query();
}

    @RequestMapping("/test1.do")
    public String Test1(Model model){
        return "test1";
    }
    @ResponseBody
    @RequestMapping("/test2.do")
    public String Test2(String username){
        System.out.print(username);
        return "我刚刚输入的是"+username;
    }
}
