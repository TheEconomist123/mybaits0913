package com.zhouzz.mybatis;

import com.zhouzz.BaseTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-09-03 15:52
 * @desc
 */
public class MyBatisMsg  extends BaseTest {



    //1.根据ids 批量更新 审核状态 审核时间 签约状态
    @Test
    public void updateStatus() {
        //1.1 准备参数


        List<Integer> ids = Arrays.asList(1001, 1006, 1003);
        String auditStatus = "2";//待复审
        String signStatus = "2";//未签约
        int  count=huisbankMesgSignMapper.updateStatus(ids,auditStatus,signStatus);
        System.out.println("更新成功"+count+"条数据");
    }


}
