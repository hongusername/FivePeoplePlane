package com.bdqn.tangcco.planedemo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class User {




   /* FieldTypeComment
    userId int(11)用户Id（PK）
    userPhone varchar(20)手机号
    userPassword varchar(30)密码
    userType int(11)用户类型
    userDate timestamp注册时间
    userStatus int(11)状态*/


   private int userId;
   private String userPhone;
   private String userPassword;
   private int userType;
   @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
   private Date userDate;
   private int userStatus;



}
