package com.bdqn.tangcco.planedemo.shuo.services;

import com.bdqn.tangcco.planedemo.entity.Laws;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Program：planedemo
 * @Description：法规业务层接口
 * @Author：LearnLi
 * @Create:2019-01-17 16:57
 */


public interface LawsServices {

    PageInfo<Laws> queryAllLaws(Integer pageNumber,Integer pageSize,String lawsId, String lawsName);
    boolean queryByLawsId(String lawId);
    Integer addLaws(Laws laws);
    Integer updateLaws(Laws laws);
    Integer deleteLaws(String lawsId);
    Laws queryOneByLawId(String lawId);
    List<Laws> queryAllLawsId();
}
