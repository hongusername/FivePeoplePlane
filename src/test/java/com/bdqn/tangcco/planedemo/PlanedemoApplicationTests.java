package com.bdqn.tangcco.planedemo;

import com.bdqn.tangcco.planedemo.admin.adminService.AdminService;
import com.bdqn.tangcco.planedemo.chen.service.ClauseService;
import com.bdqn.tangcco.planedemo.entity.*;
import com.bdqn.tangcco.planedemo.hui.service.CataLogService;
import com.bdqn.tangcco.planedemo.kai.services.LeaveServices;
import com.bdqn.tangcco.planedemo.xi.service.ConsultServices;
import com.bdqn.tangcco.planedemo.xi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
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
    private UserService userService;
    @Resource
    private ConsultServices consultServices;
    @Resource
    private ClauseService clauseService;
    @Resource
    private CataLogService cataLogService;

    @Test
    public void testAdd() {
        this.cataLogService.addCata(new Catalog(null,"CARE-23-R1","操纵性和机动性==",1,0,1));
    }

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
    public void testupdate() {
        /*SimpleDateFormat sm=new SimpleDateFormat("yyyy-MM-dd");
        String shijian="2018-12-12";
        Date shijian2=(new SimpleDateFormat("yyyy-MM-dd")).format(shijain);*/
        System.out.println(adminService.updateAdmin(new Admin(5, 0, "OK", 0, "ok", null, 0)));
    }

    @Test
    public void testSelect() {
        Leave leave = new Leave();
        leave.setLeaveId(6);
        leave.setLeaveStatus(4);
        List<Leave> list = leaveServices.selectAllLeavte();
        for (Leave l : list) {
            System.out.println(l);
        }
    }

  /*  @Test
    public void testQueryAllCon() {
        List<Consult> list = consultServices.selectAllC(1,3);
        for (Consult l : list) {
            System.out.println(l);
        }
    }*/

    @Test
    public void testInsertCOnsult() {
        Consult con = new Consult();
        con.setConsultClause(12);
        con.setConsultName("昔哥");
        con.setConsultPhone("120");
        con.setConsultText("我还能再抢救一下");
        con.setUserId(2);
        System.out.println(consultServices.addConsult(con));
        ;
    }

    @Test
    public void testDelete() {
        System.out.println(consultServices.deleteConsult(14));
    }

    @Test
    public void testUpdateConsult() {
        Consult consult = new Consult();
        consult.setConsultId(11);
        consult.setConsultStatus(8);
        System.out.println(consultServices.updateConsultStatus(consult));
    }

    @Test
    public void testQueryUserSome() {
        String phone = "1";
        List<User> list = userService.querySome(phone, 1, 2).getList();
        for (User u : list) {
            System.out.println(u);
        }
    }


    /*测试条款表*/
    @Test
    public void testCLauseList() {
        Clause cla = new Clause();
        cla.setClauseKeyword("dasd");
        cla.setLawsId(1);
        cla.setClauseNumber(123);
        for (Clause c : clauseService.getClausesList(cla, 1, 5).getList()) {
            System.out.println(c);
        }
    }

    @Test
    public void testUpdate() {
        Clause cla = new Clause();
        //cla.setClauseId(1);
        cla.setClauseKeyword("dasd");
        cla.setLawsId(1);
        cla.setClauseNumber(123);
        clauseService.updateClause(cla);
    }

    @Test
    public void testClasuseQuery() {
        System.out.println(clauseService.queryCLause(1));
    }

    @Test
    public void testQuery12(){
        System.out.println(consultServices.selectAllC("110","抢救一下",1,10).getSize());
    }






}

