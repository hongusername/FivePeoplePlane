package com.bdqn.tangcco.planedemo.xi.dao;

import com.bdqn.tangcco.planedemo.entity.Consult;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConsultDao {
    //查询所有咨询信息
    List<Consult> selectAllC();
    //新增查询信息
    Integer addConsult(@Param("consult") Consult consult);
    //根据Id删除咨询信息
    Integer deleteConsult(@Param("consultId") Integer consultId);
    //更新咨询状态
    Integer updateConsultStatus(@Param("consult") Consult consult);
}
