package com.zhouzz.mapper;

import com.zhouzz.pojo.Testtableby;
import com.zhouzz.pojo.TesttablebyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TesttablebyMapper {
    int countByExample(TesttablebyExample example);

    int deleteByExample(TesttablebyExample example);

    int insert(Testtableby record);

    int insertSelective(Testtableby record);

    List<Testtableby> selectByExample(TesttablebyExample example);

    int updateByExampleSelective(@Param("record") Testtableby record, @Param("example") TesttablebyExample example);

    int updateByExample(@Param("record") Testtableby record, @Param("example") TesttablebyExample example);
}