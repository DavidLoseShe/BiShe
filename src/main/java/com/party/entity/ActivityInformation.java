package com.party.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by guhao on 2017/8/23.
 */
@Data
@Entity
@Table(name = "ActivityTable")
public class ActivityInformation {

    @Id
    @Column(name = "ActivityId", nullable = false)
    private int activityId;
    @Column(name = "ActivityName", nullable = true, length = 255)
    private String activityName;
    @Column(name = "ActivityAddress", nullable = true, length = 255)
    private String activityAddress;
    @Column(name = "ActivityPeopleRemainNum", nullable = true, length = 3)
    private String activityPeopleRemainNum;
    @Column(name = "ActivityPeopleNum", nullable = true, length = 3)
    private String activityPeopleNum;
    @Column(name = "ActivityContent", nullable = false, length = 255)
    private String activityContent;
    @Column(name = "ActivityKind", nullable = true, length = 255)
    private String activityKind;
    @Column(name = "ActivityStartTime", nullable = true, length = 255)
    private String activityStartTime;
    @Column(name = "ActivityEndTime", nullable = true, length = 255)
    private String activityEndTime;
    @Column(name = "ActivityTime", nullable = true, length = 255)
    private String activityTime;
    @Column(name = "ActivityPeopleId", nullable = true, length = 255)
    private String activityPeopleId;
    @Column(name = "ActivityState", nullable = true, length = 255)
    private String activityState;
}
