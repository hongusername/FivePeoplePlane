package com.bdqn.tangcco.planedemo.admin.adminService;

import com.bdqn.tangcco.planedemo.entity.Admin;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AdminService {

    List<Admin> queryAdmin();

    Integer addAdmin(Admin admin);
    Integer updateAdmin(Admin admin);
    Integer deleteAdmin(int adminId);

    Admin queryByAdminId(Integer adminId);


}
