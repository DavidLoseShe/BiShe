package com.party.controller;

import com.party.entity.ActivityInformation;
import com.party.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public List<ActivityInformation> informationList(String activityPeopleId, String activityType, String activityState, String activityRelation, int pageNo){
      List<ActivityInformation> activityInformations=activityService.activityInformationList(pageNo,activityType,activityState,activityRelation,"1");

        return activityInformations;
    }
    @ResponseBody
    @RequestMapping("page")
    public int Page(String activityPeopleId,String activityType,String activityState,String activityRelation){
      int  page= activityService.getPage( activityType,activityState,activityRelation,"1");
      return page;
    }
}
