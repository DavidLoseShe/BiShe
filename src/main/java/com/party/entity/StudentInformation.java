package com.party.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by guhao on 2017/8/24.
 */
@Data
@Entity
@Table(name="StudentTable")
public class StudentInformation {
    @Id
    @Column(name = "StudentId", nullable = false, length = 255)
    private String studentId;
    @Column(name = "StudentPassword", nullable = true, length = 255)
    private String studentPassword;
    @Column(name = "StudentName", nullable = true, length = 255)
    private String studentName;
    @Column(name = "StudentClass", nullable = true, length = 255)
    private String studentClass;
    @Column(name = "StduentQQ", nullable = true, length = 255)
    private String studentQq;
    @Column(name = "StudentSay", nullable = true, length = 255)
    private String studentSay;
    @Column(name = "Studentflower", nullable = true)
    private Integer studentflower;
    @Column(name = "StudentEmail", nullable = true, length = 255)
    private String studentEmail;
    @Column(name = "StudentLoginTime", nullable = true)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date studentLoginTime;
}
