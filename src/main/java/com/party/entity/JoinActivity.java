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
@Table(name = "JoinActivityTable")
public class JoinActivity {
    @Id
    @Column(name = "sid", nullable = false)
        private int sid;
    @Column(name = "activityiid", nullable = true)
        private Integer activityiid;
    @Column(name = "peopleiid", nullable = true, length = 10)
        private String peopleiid;
    @Column(name = "states", nullable = true, length = 10)
        private String states;

    }
