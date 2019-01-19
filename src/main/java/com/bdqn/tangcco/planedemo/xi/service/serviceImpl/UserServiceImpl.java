package com.bdqn.tangcco.planedemo.xi.service.serviceImpl;

import com.bdqn.tangcco.planedemo.entity.User;
import com.bdqn.tangcco.planedemo.xi.dao.UserDao;
import com.bdqn.tangcco.planedemo.xi.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public List<User> querySome(String phone) {
        return userDao.querySome(phone);
    }

    @Override
    public List<User> queryUser() {
        return userDao.queryUser();
    }

    @Override
    public Integer addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public Integer updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public Integer deleteUser(int userId) {
        return userDao.deleteUser(userId);
    }

    @Override
    public User queryByUserId(int userId) {
        return userDao.queryByUserId(userId);
    }


}
