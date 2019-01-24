package com.bdqn.tangcco.planedemo.hui.service.impl;

import com.bdqn.tangcco.planedemo.entity.Catalog;
import com.bdqn.tangcco.planedemo.hui.dao.CataLogDao;
import com.bdqn.tangcco.planedemo.hui.service.CataLogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
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
    public PageInfo<Catalog> queryCataAll(String fk, Integer pageNumber) {
        PageHelper.startPage(pageNumber, 8);
        PageInfo<Catalog> pageInfo = new PageInfo<Catalog>(this.cataLogDao.queryCataAll(fk));
        return pageInfo;
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

    @Override
    public List<Catalog> listCatalog() {
        return this.cataLogDao.listCatalog();
    }

    @Override
    public PageInfo<Catalog> listCatalogAll(Integer pageNum, Integer pageSize) {
        List<Catalog> catalogList = new ArrayList<>();
        List<Catalog> list1 = this.cataLogDao.listCatalogByCateRank(0);
        for (int i = 0; i < list1.size(); i++) {
            catalogList.add(list1.get(i));
            List<Catalog> list2 = this.cataLogDao.listCatalogByCateRank(list1.get(i).getCatalogId());
            for (int j = 0; j < list2.size(); j++) {
                catalogList.add(list2.get(j));
                List<Catalog> list3 = this.cataLogDao.listCatalogByCateRank(list2.get(j).getCatalogId());
                for (int k = 0; k < list3.size(); k++) {
                    catalogList.add(list3.get(k));
                }
            }
        }
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<Catalog> pageInfo = new PageInfo<>(catalogList);
        return pageInfo;
    }


}
