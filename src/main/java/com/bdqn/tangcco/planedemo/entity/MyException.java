package com.bdqn.tangcco.planedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Auther: 马旭辉
 * @Date: 2019/1/22 14:30
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyException implements Serializable {
    private String code;
    private String msg;
}
