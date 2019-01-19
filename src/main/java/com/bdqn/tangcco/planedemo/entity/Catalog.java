package com.bdqn.tangcco.planedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * @program: planedemo
 * @description: ${description}
 * @author: ShiDunKai
 * @create: 2019-01-15 16:58
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Catalog {
    private Integer catalogId;//目录id
    private String cataLaws;//所属法规
    private String cateText;//目录标题
    private Integer cateGrade;//目录层级
    private Integer cateRank;//上级目录id
    private Integer cateNumber;//同级序号
}
