package com.bdqn.tangcco.planedemo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Consult {


    /*FieldTypeComment
    consultId int(11)咨询记录id（pk）
    consultName varchar(20)咨询姓名
    consultPhone varchar(20)咨询电话
    consultTime timestamp咨询时间默认当前
    consultClause int(11)咨询条款编号
    consultText varchar(50)咨询内容
    userId int(11)用户id（FK）
    consultStatus int(11)咨询状态，默认0为未处理*/

    private int consultId;
    private String consultName;
    private String consultPhone;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date consultTime;
    private int consultClause;
    private String consultText;
    private int userId;
    private int consultStatus;


}
