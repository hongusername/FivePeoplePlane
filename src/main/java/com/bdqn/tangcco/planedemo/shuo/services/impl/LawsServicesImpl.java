package com.bdqn.tangcco.planedemo.shuo.services.impl;

import com.bdqn.tangcco.planedemo.entity.Laws;
import com.bdqn.tangcco.planedemo.shuo.dao.LawsDao;
import com.bdqn.tangcco.planedemo.shuo.services.LawsServices;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Program：planedemo
 * @Description：业务层实现类
 * @Author：LearnLi
 * @Create:2019-01-17 16:58
 */
@Service
public class LawsServicesImpl implements LawsServices {

    @Resource
    private LawsDao ld;



    @Override
    public PageInfo<Laws> queryAllLaws(Integer pageNumber,Integer pageSize,String lawsId, String lawsName) {
        PageHelper.startPage(pageNumber,pageSize);
        List<Laws> list=ld.queryAllLaws(lawsId,lawsName);
        PageInfo<Laws> pi=new PageInfo<Laws>(list);
        return pi;
    }

    @Override
    public boolean queryByLawsId(String lawId) {
        return ld.queryByLawsId(lawId);
    }

    @Override
    public Integer addLaws(Laws laws) {
        return ld.addLaws(laws);
    }

    @Override
    public Integer updateLaws(Laws laws) {
        return ld.updateLaws(laws);
    }

    @Override
    public Integer deleteLaws(String lawsId) {
        return ld.deleteLaws(lawsId);
    }

    @Override
    public Laws queryOneByLawId(String lawId) {
        return ld.queryOneByLawId(lawId);
    }

    @Override
    public List<String> queryAllLawsId() {
        return ld.queryAllLawsId();
    }
}
