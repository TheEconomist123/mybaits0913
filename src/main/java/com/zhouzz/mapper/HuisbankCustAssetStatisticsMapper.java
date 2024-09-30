package com.zhouzz.mapper;

import com.zhouzz.pojo.HuisbankCustAssetStatistics;
import com.zhouzz.pojo.HuisbankCustAssetStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HuisbankCustAssetStatisticsMapper {
    int countByExample(HuisbankCustAssetStatisticsExample example);

    int deleteByExample(HuisbankCustAssetStatisticsExample example);

    int insert(HuisbankCustAssetStatistics record);

    int insertSelective(HuisbankCustAssetStatistics record);

    List<HuisbankCustAssetStatistics> selectByExample(HuisbankCustAssetStatisticsExample example);

    int updateByExampleSelective(@Param("record") HuisbankCustAssetStatistics record, @Param("example") HuisbankCustAssetStatisticsExample example);

    int updateByExample(@Param("record") HuisbankCustAssetStatistics record, @Param("example") HuisbankCustAssetStatisticsExample example);
}