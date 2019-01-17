package com.bdqn.tangcco.planedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Admin {


   /* FieldTypeComment
    adminId int(11)管理员Id（pk）
    adminGrade int(11)管理员等级
    adminName varchar(20)管理员姓名
    adminPhone varchar(20)管理员手机号
    adminPassword varchar(30)管理员密码
    adminTime timestamp管理员注册时间
    adminStatus int(11)管理员状态*/


    private int adminId;
    private int adminGrade;
    private String adminName;
    private int adminPhone;
    private String adminPassword;
    private Date adminTime;
    private int adminStatus;


}
