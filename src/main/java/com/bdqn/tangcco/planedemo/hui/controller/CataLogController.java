package com.bdqn.tangcco.planedemo.hui.controller;

import com.bdqn.tangcco.planedemo.entity.Catalog;
import com.bdqn.tangcco.planedemo.hui.service.CataLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 马旭辉
 * @Date: 2019/1/17 16:42
 * @Description:
 */
@RestController
public class CataLogController {
    @Autowired
    private CataLogService cataLogService;

    @GetMapping("/get1")
    public Object get1(Integer pk) {
        return this.cataLogService.queryCataById(pk);
    }

    @GetMapping("/get2")
    public Object get2(String fk) {
        return this.cataLogService.queryCataAll(fk);
    }

    @PostMapping("/add1")
    public Object add1(Catalog catalog) {
        return this.cataLogService.addCata(catalog);
    }

    @GetMapping("/delete1")
    public Object delete1(Integer pk) {
        return this.cataLogService.deleteCata(pk);
    }

}
