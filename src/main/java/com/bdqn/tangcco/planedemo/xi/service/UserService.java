package com.bdqn.tangcco.planedemo.xi.service;


import com.bdqn.tangcco.planedemo.entity.User;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    PageInfo<User> querySome(@Param("phone") String phone,Integer pageNum,Integer pageSize);

    PageInfo<User> queryUser(Integer pageNum,Integer pageSize);

    Integer addUser(User user);

    Integer updateUser(User user);

    Integer deleteUser(int userId);

    User queryByUserId(int userId);


}
