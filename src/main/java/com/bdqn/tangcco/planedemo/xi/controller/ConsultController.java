package com.bdqn.tangcco.planedemo.xi.controller;


import com.bdqn.tangcco.planedemo.entity.Consult;
import com.bdqn.tangcco.planedemo.xi.service.ConsultServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Map;

@Controller
public class ConsultController {

    @Resource
    private ConsultServices consultServices;
    @RequestMapping("selectAll")
    public String queryAllConsult(Map map,String phone,String text,@RequestParam(defaultValue = "10") Integer pageSize,@RequestParam(defaultValue = "1") Integer pageNum){
        map.put("ConsultList",consultServices.selectAllC(phone,text,pageNum,pageSize));
        System.out.println(phone+text);
        return "consultHTML";
    }





}
