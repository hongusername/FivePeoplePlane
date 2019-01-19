package com.bdqn.tangcco.planedemo.xi.dao;


import com.bdqn.tangcco.planedemo.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {


    List<User> queryUser();

    List<User> querySome(@Param("phone") String phone);

    Integer addUser(User user);

    Integer updateUser(User user);

    Integer deleteUser(int userId);

    User queryByUserId(int userId);


}
