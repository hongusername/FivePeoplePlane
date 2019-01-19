package com.bdqn.tangcco.planedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @program: planedemo
 * @description: ${description}
 * @author: ShiDunKai
 * @create: 2019-01-15 17:00
 **/
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Laws {
    private String lawsId;
    private Integer lawsPart;
    private String lawsVersion;
    private Integer lawsStatus;
    private String lawsName;
    private String lawsDownload;
    private String lawsState;
    private String lawsLogo;
    private String lawsFDBName;
}
