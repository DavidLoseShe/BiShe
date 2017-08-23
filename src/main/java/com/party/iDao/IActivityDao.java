package com.party.iDao;

import com.party.entity.ActivityInformation;

import java.util.List;

/**
 * Created by guhao on 2017/8/23.
 */
public interface IActivityDao {
    int GetPage(String activityType,String activityState,String activityRelation,String peopleId);
    List<ActivityInformation> QueryActivityInfo(int pageNo,String activityType,String activityState,String activityRelation,String peopleid);
}
