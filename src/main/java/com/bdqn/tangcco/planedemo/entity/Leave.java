package com.bdqn.tangcco.planedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @program: planedemo
 * @description: ${description}
 * @author: ShiDunKai
 * @create: 2019-01-15 14:02
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Leave {
    private Integer leaveId;
    private String leaveText;
    private Integer userId;
    private Date leaveTime;
    private Integer leaveStatus;
}
