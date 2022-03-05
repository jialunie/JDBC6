package com.itheima.mapper;

import com.itheima.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BrandMapper {
    List<Brand> selectAll();  //第三版

    Brand selectById(int id); //master2


    List<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String companyName, @Param("brandName") String brandName);

    List<Brand> selectByCondition(Map map);

    List<Brand> selectByConditionSingle(Brand brand);

    void add(Brand brand);

    int update(Brand brand);
//    List<Brand> selectByCondition(Brand brand);
//    List<Brand> selectByCondition(Map map);

    void deleteByIds(int[] ids);






}
