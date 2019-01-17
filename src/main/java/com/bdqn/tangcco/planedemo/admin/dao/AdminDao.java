package com.bdqn.tangcco.planedemo.admin.dao;


import com.bdqn.tangcco.planedemo.entity.Admin;

import java.util.List;

public interface AdminDao {


    List<Admin> queryAdmin();

    Integer addAdmin(Admin admin);

    Integer updateAdmin(Admin admin);

    Integer deleteAdmin(int adminId);

    Admin queryByAdminId(Integer adminId);



}
