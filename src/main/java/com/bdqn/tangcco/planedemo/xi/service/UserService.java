package com.bdqn.tangcco.planedemo.xi.service;


import com.bdqn.tangcco.planedemo.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> queryUser();

    Integer addUser(User user);

    Integer updateUser(User user);

    Integer deleteUser(int userId);

    User queryByUserId(int userId);


}
