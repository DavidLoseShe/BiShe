package com.party.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by guhao on 2017/8/24.
 */
@Data
@Entity
@Table(name = "RemarkTable")
public class RemarkInformation {
    @Id
    @Column(name = "remarkId", nullable = false)
    private int remarkId;
    @Column(name = "activityId", nullable = true)
    private Integer activityId;
    @Column(name = "studentId", nullable = true, length = 255)
    private String studentId;
    @Column(name = "remarkContent", nullable = true, length = 255)
    private String remarkContent;
    @Column(name = "remarkTime", nullable = true, length = 255)
    private String remarkTime;
}
