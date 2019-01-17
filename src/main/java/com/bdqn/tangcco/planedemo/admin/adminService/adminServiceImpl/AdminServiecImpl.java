package com.bdqn.tangcco.planedemo.admin.adminService.adminServiceImpl;

import com.bdqn.tangcco.planedemo.admin.adminService.AdminService;
import com.bdqn.tangcco.planedemo.admin.dao.AdminDao;
import com.bdqn.tangcco.planedemo.entity.Admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AdminServiecImpl implements AdminService {

    @Resource
    private AdminDao adminDao;


    @Override
    public List<Admin> queryAdmin() {
        return adminDao.queryAdmin();
    }

    @Override
    public Integer addAdmin(Admin admin) {
        return adminDao.addAdmin(admin);
    }

    @Override
    public Integer updateAdmin(Admin admin) {
        return adminDao.updateAdmin(admin);
    }

    @Override
    public Integer deleteAdmin(int adminId) {
        return adminDao.deleteAdmin(adminId);
    }

    @Override
    public Admin queryByAdminId(Integer adminId) {
        return adminDao.queryByAdminId(adminId);
    }
}
