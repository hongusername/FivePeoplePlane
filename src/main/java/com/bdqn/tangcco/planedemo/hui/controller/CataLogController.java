package com.bdqn.tangcco.planedemo.hui.controller;

import com.bdqn.tangcco.planedemo.entity.Catalog;
import com.bdqn.tangcco.planedemo.hui.service.CataLogService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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


    @PostMapping("/add1")
    public Object add1(Catalog catalog) {
        return this.cataLogService.addCata(catalog);
    }

    @GetMapping("/delete1")
    public Object delete1(Integer pk) {
        return this.cataLogService.deleteCata(pk);
    }

    /**
     * 去增加页面，需要查询出所有的法规，然后查出所选法规下面的所有目录
     *
     * @return
     */
    @GetMapping("/toaddcata")
    public Object toAdd() {
        //查询所有法规

        return null;
    }

    /**
     * 执行新增操作，判断是否增加成功
     *
     * @param catalog
     * @return
     */
    @PostMapping("/addcata")
    public Object doAdd(Catalog catalog) {
        int i = this.cataLogService.addCata(catalog);
        if (i > 0) {
            return "新增成功！";
        } else {
            return "添加失败！";
        }
    }

    @GetMapping("/listCatalog")
    public Object listCatalog(Integer pageNum, Integer pageSize, Model model) {
        PageInfo<Catalog> pageInfo = this.cataLogService.listCatalogAll(pageNum, pageSize);
        model.addAttribute("pageinfo", pageInfo);
        ModelAndView m = new ModelAndView();
        m.setViewName("");
        return null;

    }


}
