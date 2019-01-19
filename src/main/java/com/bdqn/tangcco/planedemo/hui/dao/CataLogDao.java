package com.bdqn.tangcco.planedemo.hui.dao;

import com.bdqn.tangcco.planedemo.entity.Catalog;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Auther: 马旭辉
 * @Date: 2019/1/17 15:53
 * @Description: 目录表dao方法
 */
public interface CataLogDao {
    /**
     * 组合查询，根据所属法规来查询目录
     *
     * @return
     */
    @Select("select * from Catalog where cataLaws=#{fk} order by catalogId desc")
    List<Catalog> queryCataAll(@Param("fk") String fk);

    /**
     * 根据主键查一条
     *
     * @return
     */
    @Select("select * from Catalog where catalogId=#{pk} order by catalogId desc")
    Catalog queryCataById(@Param("pk") Integer pk);

    /**
     * 新增法规
     *
     * @param catalog
     * @return
     */
    @Insert("insert into Catalog Values(null,#{c.cataLaws},#{c.cateText},#{c.cateGrade},#{c.cateRank},#{c.cateNumber})")
    Integer addCata(@Param("c") Catalog catalog);

    /**
     * 根据主键删除
     *
     * @param pk
     * @return
     */
    @Delete("delete from Catalog where catalogId=#{pk}")
    Integer deleteCata(@Param("pk") Integer pk);
}
