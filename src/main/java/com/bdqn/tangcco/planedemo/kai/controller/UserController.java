package com.bdqn.tangcco.planedemo.kai.controller;

import com.bdqn.tangcco.planedemo.entity.User;
import com.bdqn.tangcco.planedemo.xi.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @program: planedemo
 * @description: ${description}
 * @author: ShiDunKai
 * @create: 2019-01-17 16:00
 **/
@Controller
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("UserSelect")
    public String queryAllUser(Map map,String phone){
        if(phone!=null&&phone.equals("")){
            System.out.println("kong");
            map.put("userList",userService.queryUser());

        }else{
            map.put("userList",userService.querySome(phone));
            System.out.println("bukong");
        }

        return "userHTML";
    }

}
