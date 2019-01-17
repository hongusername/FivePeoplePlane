package com.bdqn.tangcco.planedemo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * @program: planedemo
 * @description: ${description}
 * @author: ShiDunKai
 * @create: 2019-01-17 14:32
 **/
@NoArgsConstructor
@Data
@RequiredArgsConstructor
public class Clause {
    private Integer clauseId;
    private Integer cateLogid;
    private Integer lawsId;
    private Integer clauseNumber;
    private String clauseName;
    private Integer clauseVersions;
    private String claseTitle;
    private String clauseText;
    private String clauseKeyword;
}
