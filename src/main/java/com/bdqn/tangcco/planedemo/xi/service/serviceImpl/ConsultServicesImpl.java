package com.bdqn.tangcco.planedemo.xi.service.serviceImpl;

import com.bdqn.tangcco.planedemo.entity.Consult;
import com.bdqn.tangcco.planedemo.entity.User;
import com.bdqn.tangcco.planedemo.xi.dao.ConsultDao;
import com.bdqn.tangcco.planedemo.xi.service.ConsultServices;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ConsultServicesImpl implements ConsultServices {
    @Resource
    private ConsultDao consultDao;

    @Override
    public PageInfo<Consult> selectAllC(String phone,String text,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        System.out.println(phone+text);
        List<Consult> list=consultDao.selectAllC(phone,text);
        PageInfo<Consult> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Integer addConsult(Consult consult) {
        return consultDao.addConsult(consult);
    }

    @Override
    public Integer deleteConsult(Integer consultId) {
        return consultDao.deleteConsult(consultId);
    }

    @Override
    public Integer updateConsultStatus(Consult consult) {
        return consultDao.updateConsultStatus(consult);
    }
}
