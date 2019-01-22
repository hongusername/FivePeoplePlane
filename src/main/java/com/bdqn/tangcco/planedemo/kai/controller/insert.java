package com.bdqn.tangcco.planedemo.kai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * @program: planedemo
 * @description: 页面跳转controller
 * @author: ShiDunKai
 * @create: 2019-01-17 15:16
 **/
@Controller
public class insert {
                /*`Admin`管理员表
            `Catalog`目录表
            `Clause`条款表
            `Consult`咨询记录表
            `Laws`法规表
            `Leave`留言表
            `User`用户表*/
    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }
    @RequestMapping("Email")
    public String email(){
        return "email";
    }
    @RequestMapping("OpinionHTML")
    public String opinion(){
        return "opinionHTML";
    }
    @RequestMapping("HttpHTML")
    public String http(){
        return "httpHTML";
    }
    @RequestMapping("AdminManage")
    public String adminManager(){
        return "adminManage";
    }
    @RequestMapping("ShortNote")
    public String shortNote(){
        return "shortNote";
    }
    @RequestMapping("UserHTML")
    public String user(){
        return "userHTML";
    }
    @RequestMapping("AddCatalog")
    public String addCatalog(){
        return "addCatalog";
    }
    @RequestMapping("AddLaws")
    public String addLaws(){
        return "addLaws";
    }
    @RequestMapping("AddClause")
    public String addClause(){
        return "addClause";
    }
    @RequestMapping("LawsManage")
    public String lawsAdmin(){
        return "lawsManage";
    }
    @RequestMapping("ClauseHTML")
    public String clause(){
        return "clauseHTML";
    }
    @RequestMapping("ConsultHTML")
    public String consultHTML(){
        return "consultHTML";
    }
    @RequestMapping("LawsHTML")
    public String laws(){
        return "lawsHTML";
    }


}
