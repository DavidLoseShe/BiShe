package com.party.controller;

import com.party.entity.ActivityInformation;
import com.party.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by guhao on 2017/8/23.
 */
@Controller
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    @ResponseBody
    @RequestMapping("activityList")
    public List<ActivityInformation> ActivityInformationList(String activityPeopleId, String activityType, String activityState, String activityRelation, int pageNo, HttpSession session){
        String studentId= (String) session.getAttribute("User");
        List<ActivityInformation> activityInformations=activityService.activityInformationList(pageNo,activityType,activityState,activityRelation,studentId);
        return activityInformations;
    }
    @ResponseBody
    @RequestMapping("page")
    public int Page(String activityPeopleId,String activityType,String activityState,String activityRelation,HttpSession session){
        String  studentId= (String ) session.getAttribute("User");
      int  page= activityService.getPage( activityType,activityState,activityRelation,studentId);
      return page;
    }
    @ResponseBody
    @RequestMapping("personActivityInfo")
    public List<ActivityInformation> QueryPersonActivityInfo(HttpSession session){
        String studentId= (String) session.getAttribute("User");
        List<ActivityInformation>activityInformationList=activityService.QueryPersonActivityInfo(studentId);
        return activityInformationList;
    }
}
