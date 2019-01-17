package com.bdqn.tangcco.planedemo.hui.service;

import com.bdqn.tangcco.planedemo.entity.Catalog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: 马旭辉
 * @Date: 2019/1/17 16:35
 * @Description:
 */
public interface CataLogService {
    List<Catalog> queryCataAll(String fk);

    Catalog queryCataById(Integer pk);

    Integer addCata(Catalog catalog);

    Integer deleteCata(Integer pk);
}
