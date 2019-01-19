package com.bdqn.tangcco.planedemo.entity;

/**
 * @program: planedemo
 * @description: ${description}
 * @author: ShiDunKai
 * @create: 2019-01-15 17:00
 **/
public class Laws {

    /*
    *
lawsId          varchar(30) NOT NULL部号别名
lawsPart        int(11) NOT NULL部号
lawsVersion     varchar(11) NOT NULL版本号R1/R2/R3等
lawsName        varchar(30) NOT NULL名称
lawsStauts      int(11) NOT NULL是否显示
lawsDownload    varchar(50) NOT NULL下载链接
lawsState       varchar(100) NOT NULL版本说明
lawsLogo        varchar(30) NOT NULLlogo_url
lawsFDBName     varchar(30) NOT NULL法规FDB文件名称
    * */

    private String lawsId;//部号别名
    private Integer lawsPart;//部号
    private String lawsVersion;//版本号R1/R2/R3等
    private Integer lawsStatus;//名称
    private String lawsName;//是否显示
    private String lawsDownload;//下载链接
    private String lawsState;//版本说明
    private String lawsLogo;//logo_url
    private String lawsFDBName;//法规FDB文件名称

}
