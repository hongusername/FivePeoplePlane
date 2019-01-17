package com.bdqn.tangcco.planedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @program: planedemo
 * @description: ${description}
 * @author: ShiDunKai
 * @create: 2019-01-15 16:58
 **/
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Catalog {
    private Integer catalogId;
    private String cataLaws;
    private String cataText;
    private Integer cateGrade;
    private Integer cateRank;
    private Integer cateNumber;
}
