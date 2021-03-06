package com.party.service;

import com.party.dao.ActivityDao;
import com.party.entity.ActivityInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by guhao on 2017/8/23.
 */
@Service
@Transactional
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

        return  activityInformations;
    }
    public List<ActivityInformation> AdminQueryActivityInfoList(){
      List<ActivityInformation> activityInformations=  activityDao.AdminQueryActivityInfoList();
       return  activityInformations;
    }
    //QI
    public List<ActivityInformation> QueryPersonActivityInfo(String studentId){
        List<ActivityInformation> activityInformationList=activityDao.QueryPersonActivityInfo(studentId);
        return activityInformationList;
    }
}
