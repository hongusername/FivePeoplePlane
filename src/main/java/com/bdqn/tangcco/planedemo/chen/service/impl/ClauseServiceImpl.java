package com.bdqn.tangcco.planedemo.chen.service.impl;

import com.bdqn.tangcco.planedemo.chen.service.ClauseService;
import com.bdqn.tangcco.planedemo.chen.dao.ClauseDao;
import com.bdqn.tangcco.planedemo.entity.Clause;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClauseServiceImpl implements ClauseService {
    @Resource
    private ClauseDao clauseDao;

    @Override
    public PageInfo<Clause> getClausesList(Clause clause, Integer pageNumber, Integer pageSize) {
        PageHelper.startPage(pageNumber, pageSize);
        List<Clause> list = clauseDao.getClausesList(clause);
        PageInfo<Clause> page = new PageInfo<Clause>(list);
        return page;
    }

    @Override
    public Integer updateClause(Clause clause) {
        return clauseDao.updateClause(clause);
    }

    @Override
    public Integer deleteClause(Integer id) {
        return clauseDao.deleteClause(id);
    }

    @Override
    public Integer addClause(Clause clause) {
        return clauseDao.addClause(clause);
    }

    @Override
    public Clause queryCLause(Integer ClauseId) {
        return clauseDao.queryCLause(ClauseId);
    }
}
