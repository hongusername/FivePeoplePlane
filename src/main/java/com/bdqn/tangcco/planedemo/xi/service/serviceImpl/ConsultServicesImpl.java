package com.bdqn.tangcco.planedemo.xi.service.serviceImpl;

import com.bdqn.tangcco.planedemo.entity.Consult;
import com.bdqn.tangcco.planedemo.xi.dao.ConsultDao;
import com.bdqn.tangcco.planedemo.xi.service.ConsultServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ConsultServicesImpl implements ConsultServices {
    @Resource
    private ConsultDao consultDao;

    @Override
    public List<Consult> selectAllC() {
        return consultDao.selectAllC();
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
