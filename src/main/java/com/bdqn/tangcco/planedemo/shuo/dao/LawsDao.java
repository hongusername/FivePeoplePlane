package com.bdqn.tangcco.planedemo.shuo.dao;

import com.bdqn.tangcco.planedemo.entity.Laws;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Program：planedemo
 * @Description：
 * @Author：LearnLi
 * @Create:2019-01-17 15:12
 */

public interface LawsDao {

    /*

    * 2019年1月17日15点43分
    *LearnLi
    *
    *
    private String lawsId;//部号别名
    private Integer lawsPart;//部号
    private String lawsVersion;//版本号R1/R2/R3等
    private Integer lawsStatus;//名称
    private String lawsName;//是否显示
    private String lawsDownload;//下载链接
    private String lawsState;//版本说明
    private String lawsLogo;//logo_url
    private String lawsFDBName;//法规FDB文件名称
    * */

    /*
     * 2019年1月17日16点29分
     *通过法规部号，法规名称模糊查询所有法规
     * */
    List<Laws> queryAllLaws(String lawsId, String lawsName);

    /*
     * 2019年1月17日16点29分
     * 通过别名查询是否存在数据
     * */
    boolean queryByLawsId(String lawId);
    /*
    * 2019年1月19日09点29分
    * 通过id查询一条数据
    * */
    Laws queryOneByLawId(String lawId);

    /*
     *2019年1月17日16点49分
     *增加法规
     *return Integer
     * */
    Integer addLaws(@Param("laws") Laws laws);

    /*
     *2019年1月17日16点49分
     *编辑法规
     *return Integer
     * */
    Integer updateLaws(@Param("laws") Laws laws);

    /*
     *2019年1月17日16点54分
     *删除法规
     *return Integer
     * */
    Integer deleteLaws(String lawsId);
    /*
    * 2019年1月19日14点37分
    * 查询所有主键
    * */
    List<Laws> queryAllLawsId();
}