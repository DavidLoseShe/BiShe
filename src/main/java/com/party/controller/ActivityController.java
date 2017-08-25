package com.party.controller;

import com.party.entity.ActivityInformation;
import com.party.entity.StudentInformation;
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
        StudentInformation studentInformation= (StudentInformation) session.getAttribute("User");
        List<ActivityInformation> activityInformations=activityService.activityInformationList(pageNo,activityType,activityState,activityRelation,studentInformation.getStudentId());

        return activityInformations;
    }
    @ResponseBody
    @RequestMapping("page")
    public int Page(String activityPeopleId,String activityType,String activityState,String activityRelation,HttpSession session){
        StudentInformation studentInformation= (StudentInformation) session.getAttribute("User");
      int  page= activityService.getPage( activityType,activityState,activityRelation,studentInformation.getStudentId());
      return page;
    }

}
