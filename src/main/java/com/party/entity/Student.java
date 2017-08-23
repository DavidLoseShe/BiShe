package com.party.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by guhao on 2017/8/21.
 */
@Data
@Entity
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "created")
    private Integer created ;

    @Column(name = "username")
    private String username;

    @Column(name = "address")

    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "remark")
    private String remark;
}
