package com.bdqn.tangcco.planedemo.kai.controller;

import com.bdqn.tangcco.planedemo.entity.User;
import com.bdqn.tangcco.planedemo.xi.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
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
    public String queryAllUser(Map map, String phone, @RequestParam(defaultValue = "1",required = false) Integer pageNum, @RequestParam(defaultValue = "5",required = false) Integer pageSize){
        if(phone!=null&&!phone.equals("")){
            System.out.println("kong");
            map.put("userList",userService.querySome(phone,pageNum,pageSize).getList());
            map.put("phone",phone);
        }else{
            map.put("userList",userService.queryUser(pageNum,pageSize).getList());
            map.put("phone",phone);
            System.out.println("bukong");
        }
        return "userHTML";
    }
    @RequestMapping("UserSelectAjax")
    @ResponseBody
    public PageInfo<User> queryAllUserAjax(Map map, String phone, @RequestParam(defaultValue = "1",required = false) Integer pageNum, @RequestParam(defaultValue = "5",required = false) Integer pageSize){
        if(phone!=null&&!phone.equals("")){
            PageInfo<User> aaa=userService.querySome(phone,pageNum,pageSize);
            System.out.println("Ajaxkong"+pageNum+pageSize+phone+"asdfasdf"+aaa.getTotal()+"asdfsfsdf"+aaa.getPages());
            return userService.querySome(phone,pageNum,pageSize);
        }else{
            System.out.println("AjaxubKong"+pageNum+pageSize+phone);
            List<User> list=userService.queryUser(pageNum,pageSize).getList();
            for(User u:list){
                System.out.println(u);
            }
           return userService.queryUser(pageNum,pageSize);
        }
    }

}
