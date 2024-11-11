package com.zhouzz.mapper;

import com.zhouzz.pojo.EmployeeData;
import com.zhouzz.pojo.EmployeeDataExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


public interface EmployeeDataMapper {
    int countByExample(EmployeeDataExample example);

    int deleteByExample(EmployeeDataExample example);

    int insert(EmployeeData record);

    int insertSelective(EmployeeData record);

    List<EmployeeData> selectByExample(EmployeeDataExample example);

    int updateByExampleSelective(@Param("record") EmployeeData record, @Param("example") EmployeeDataExample example);

    int updateByExample(@Param("record") EmployeeData record, @Param("example") EmployeeDataExample example);
}