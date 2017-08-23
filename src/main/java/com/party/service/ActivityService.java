package com.party.service;

import com.party.dao.ActivityDao;
import com.party.entity.ActivityInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by guhao on 2017/8/23.
 */
@Service
public class ActivityService {
@Autowired
private ActivityDao activityDao;
    public int getPage(String activityType,String activityState,String activityRelation,String  peopleid){
        int page;
        page=activityDao.GetPage(activityType,activityState,activityRelation,peopleid);

        return  page;
    }
    public List<ActivityInformation> activityInformationList(int pageNo, String activityType, String activityState, String activityRelation, String  peopleid){
        List<ActivityInformation> activityInformations;

        activityInformations=activityDao.QueryActivityInfo(pageNo,activityType,activityState,activityRelation,peopleid);
        System.out.print(activityType);
        return  activityInformations;
    }
}
