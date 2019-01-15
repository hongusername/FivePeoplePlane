package com.bdqn.tangcco.planedemo.kai.services;

import com.bdqn.tangcco.planedemo.entity.Leave;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: planedemo
 * @description: ${description}
 * @author: ShiDunKai
 * @create: 2019-01-15 14:13
 **/
public interface LeaveServices {
    //新增留言
    Integer addLeaveText(@Param("leave") Leave leave);
    //根据留言Id删除指定留言
    Integer deleteLeaveId(@Param("leaveId")Integer leaveId);
    //修改留言状态
    Integer updateLeaveStatus(Leave leave);
    //产看所有留言
    List<Leave> selectAllLeavte();
}
