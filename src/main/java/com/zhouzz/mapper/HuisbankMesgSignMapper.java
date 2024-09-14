package com.zhouzz.mapper;

import com.zhouzz.pojo.HuisbankMesgSign;
import com.zhouzz.pojo.HuisbankMesgSignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HuisbankMesgSignMapper {

    int countByExample(HuisbankMesgSignExample example);

    int deleteByExample(HuisbankMesgSignExample example);

    int insert(HuisbankMesgSign record);

    int insertSelective(HuisbankMesgSign record);

    List<HuisbankMesgSign> selectByExample(HuisbankMesgSignExample example);

    int updateByExampleSelective(@Param("record") HuisbankMesgSign record, @Param("example") HuisbankMesgSignExample example);

    int updateByExample(@Param("record") HuisbankMesgSign record, @Param("example") HuisbankMesgSignExample example);

    int updateStatus(@Param("ids") List<Integer> ids, @Param("auditStatus") String auditStatus,@Param("signStatus") String signStatus);
}