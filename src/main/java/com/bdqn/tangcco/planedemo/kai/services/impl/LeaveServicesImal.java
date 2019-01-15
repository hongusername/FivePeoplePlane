package com.bdqn.tangcco.planedemo.kai.services.impl;

import com.bdqn.tangcco.planedemo.entity.Leave;
import com.bdqn.tangcco.planedemo.kai.dao.LeaveDao;
import com.bdqn.tangcco.planedemo.kai.services.LeaveServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: planedemo
 * @description: ${description}
 * @author: ShiDunKai
 * @create: 2019-01-15 14:14
 **/
@Service
public class LeaveServicesImal implements LeaveServices {
    @Resource
    private LeaveDao leaveDao;



    @Override
    public Integer addLeaveText(Leave leave) {
        return leaveDao.addLeaveText(leave);
    }

    @Override
    public Integer deleteLeaveId(Integer leaveId) {
        return leaveDao.deleteLeaveId(leaveId);
    }

    @Override
    public Integer updateLeaveStatus(Leave leave) {
        return leaveDao.updateLeaveStatus(leave);
    }

    @Override
    public List<Leave> selectAllLeavte() {
        return leaveDao.selectAllLeavte();
    }
}
