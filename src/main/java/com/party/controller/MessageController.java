package com.party.controller;

import com.party.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by guhao on 2017/8/24.
 */
@Controller
public class MessageController {
    @Autowired
    private MessageService messageService;

    @ResponseBody
    @RequestMapping("messageAmount")
    public int QueryMessageAmount(HttpSession session){
        String studentId = (String)session.getAttribute("User");
        return messageService.QueryMessageAmountService(studentId);
    }
}
