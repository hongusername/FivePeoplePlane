package com.bdqn.tangcco.planedemo.xi.service;

import com.bdqn.tangcco.planedemo.entity.Consult;

import java.util.List;

public interface ConsultServices {
    //查询所有咨询信息
    List<Consult> selectAllC();
    //新增查询信息
    Integer addConsult(Consult consult);
    //根据Id删除咨询信息
    Integer deleteConsult(Integer consultId);
    //更新咨询状态
    Integer updateConsultStatus(Consult consult);
}
