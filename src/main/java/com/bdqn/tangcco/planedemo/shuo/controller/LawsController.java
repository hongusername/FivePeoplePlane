package com.bdqn.tangcco.planedemo.shuo.controller;

import com.bdqn.tangcco.planedemo.entity.Laws;
import com.bdqn.tangcco.planedemo.shuo.services.LawsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Program：planedemo
 * @Description：法规controller
 * @Author：LearnLi
 * @Create:2019-01-19 10:03
 */

@Controller
public class LawsController {

    @Autowired
    private LawsServices ls;


    @RequestMapping("/lawslist")
    public String LawsList(Model model){


        return "lawsHTML";
    }



}
