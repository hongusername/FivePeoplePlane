package com.bdqn.tangcco.planedemo.hui.service;

import com.bdqn.tangcco.planedemo.entity.Catalog;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Auther: 马旭辉
 * @Date: 2019/1/17 16:35
 * @Description:
 */
public interface CataLogService {
    PageInfo<Catalog> queryCataAll(String fk, Integer pageNumber);

    Catalog queryCataById(Integer pk);

    Integer addCata(Catalog catalog);

    Integer deleteCata(Integer pk);

    List<Catalog> listCatalog();

    PageInfo<Catalog> listCatalogAll(Integer pageNum, Integer pageSize);
}
