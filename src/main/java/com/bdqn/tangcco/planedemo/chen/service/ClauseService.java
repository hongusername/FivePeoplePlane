package com.bdqn.tangcco.planedemo.chen.service;

import com.bdqn.tangcco.planedemo.entity.Clause;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ClauseService {
    //获取条款集合
    PageInfo<Clause> getClausesList(Clause clause,Integer pageNumber,Integer pageSize);

    //编辑条款的信息
    Integer updateClause(Clause clause);

    //删除条款
    Integer deleteClause(Integer id);

    //新增条款
    Integer addClause(Clause clause);

    //查询一条 条款记录
    Clause queryCLause(Integer ClauseId);

}
