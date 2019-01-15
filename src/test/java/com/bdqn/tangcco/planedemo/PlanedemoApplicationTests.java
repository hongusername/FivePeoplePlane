package com.bdqn.tangcco.planedemo;

import com.bdqn.tangcco.planedemo.admin.adminService.AdminService;
import com.bdqn.tangcco.planedemo.entity.Admin;
import com.bdqn.tangcco.planedemo.entity.Consult;
import com.bdqn.tangcco.planedemo.entity.Leave;
import com.bdqn.tangcco.planedemo.kai.services.LeaveServices;
import com.bdqn.tangcco.planedemo.entity.User;
import com.bdqn.tangcco.planedemo.xi.service.ConsultServices;
import com.bdqn.tangcco.planedemo.xi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlanedemoApplicationTests {
    @Resource
    private DataSource dataSource;
    @Resource
    private AdminService adminService;
    @Resource
    private LeaveServices leaveServices;
    @Resource
    private ConsultServices consultServices;

    @Test
    public void contextLoads() {
        try {
            Connection connection = dataSource.getConnection();
            System.out.println(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //Admin
    @Test
    public void testQuery() {
        System.out.println(adminService.queryAdmin());
    }

    @Test
    public void testaddAdmin() {
        System.out.println(adminService.addAdmin(new Admin(5, 2, "Whit?", 1234123132, "adaddsss", null, 2)));
    }

    @Test
    public void testQueryById() {
        System.out.println(adminService.queryByAdminId(2));
    }

    @Test
    public void testdelete() {
        System.out.println(adminService.deleteAdmin(4));
    }
    @Test
    public void testupdate(){
        /*SimpleDateFormat sm=new SimpleDateFormat("yyyy-MM-dd");
        String shijian="2018-12-12";
        Date shijian2=(new SimpleDateFormat("yyyy-MM-dd")).format(shijain);*/
        System.out.println(adminService.updateAdmin(new Admin(5,0,"OK",0,"ok",null,0)));
    }
    @Test
    public void testSelect(){
        Leave leave=new Leave();
        leave.setLeaveId(6);
        leave.setLeaveStatus(4);
        List<Leave> list=leaveServices.selectAllLeavte();
        for(Leave l:list){
            System.out.println(l);
        }
    }
    @Test
    public void testQueryAllCon(){
        List<Consult> list=consultServices.selectAllC();
        for (Consult l:list){
            System.out.println(l);
        }
    }

}

