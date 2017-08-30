package com.party.controller;

import com.party.entity.ActivityInformation;
import com.party.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by guhao on 2017/8/25.
 */
@Controller
public class AdminController {
    @Autowired
    private ActivityService activityService;

    @ResponseBody
    @RequestMapping("AdminQueryActivityList")
    public List<ActivityInformation> AdminQueryActivityInfoList(){
            return activityService.AdminQueryActivityInfoList();
    }
}
