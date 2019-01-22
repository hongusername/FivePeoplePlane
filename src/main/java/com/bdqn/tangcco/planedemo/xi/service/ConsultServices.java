package com.bdqn.tangcco.planedemo.xi.service;

import com.bdqn.tangcco.planedemo.entity.Consult;
import com.github.pagehelper.PageInfo;
import io.lettuce.core.dynamic.annotation.Param;

import java.util.List;

public interface ConsultServices {
    //查询所有咨询信息 List<Consult> selectAllC(@Param("phone") String phone,@Param("text") String text);
    PageInfo<Consult> selectAllC(@Param("phone") String phone, @Param("text") String text, Integer pageNum, Integer pageSize);
    //新增查询信息
    Integer addConsult(Consult consult);
    //根据Id删除咨询信息
    Integer deleteConsult(Integer consultId);
    //更新咨询状态
    Integer updateConsultStatus(Consult consult);
}
