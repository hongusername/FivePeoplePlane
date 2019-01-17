package com.bdqn.tangcco.planedemo.hui.service.impl;

import com.bdqn.tangcco.planedemo.entity.Catalog;
import com.bdqn.tangcco.planedemo.hui.dao.CataLogDao;
import com.bdqn.tangcco.planedemo.hui.service.CataLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: 马旭辉
 * @Date: 2019/1/17 16:38
 * @Description:
 */
@Service
public class CataLogServiceImpl implements CataLogService {
    @Resource
    private CataLogDao cataLogDao;

    @Override
    public List<Catalog> queryCataAll(String fk) {
        return this.cataLogDao.queryCataAll(fk);
    }

    @Override
    public Catalog queryCataById(Integer pk) {
        return this.cataLogDao.queryCataById(pk);
    }

    @Override
    public Integer addCata(Catalog catalog) {
        return this.cataLogDao.addCata(catalog);
    }

    @Override
    public Integer deleteCata(Integer pk) {
        return this.cataLogDao.deleteCata(pk);
    }
}
