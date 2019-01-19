package com.bdqn.tangcco.planedemo.chen.dao;

import com.bdqn.tangcco.planedemo.entity.Clause;

import java.util.List;

public interface ClauseDao {
    //获取条款集合
    List<Clause> getClausesList(Clause clause);

    //编辑条款的信息
    Integer updateClause(Clause clause);

    //删除条款
    Integer deleteClause(Integer id);

    //新增条款
    Integer addClause(Clause clause);

    //查询一条 条款记录
    Clause queryCLause(Integer ClauseId);
}
