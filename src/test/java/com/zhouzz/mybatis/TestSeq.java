package com.zhouzz.mybatis;


import com.zhouzz.BaseTest;
import com.zhouzz.pojo.Testtableby;
import com.zhouzz.util.SnowflakeIdGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-10-01 15:45
 * @desc
 */
public class TestSeq  extends BaseTest {

    @Autowired
    private SnowflakeIdGenerator snowflakeIdGenerator;



    @Test
    public void testSeq() {

        //其实就是测试mybatis的批量插入的性能
        System.out.println("开始......");

        long l = System.currentTimeMillis();

        Testtableby testtableby = new Testtableby();
        testtableby.setCreatetime(new Date());
        for (int i = 0; i < 5000000; i++) {
            testtableby.setSex(i % 2 == 0? "男" : "女");
            int insert = testtablebyMapper.insert(testtableby);
        }

        System.out.println("结束......");
        System.out.println("耗时：" + (System.currentTimeMillis() - l) + "毫秒");
    }


    //测试生成主键方法
    @Test
    public void testSeq2() {

        for (int i = 0; i < 1000; i++) {
            System.out.println("snowflakeIdGenerator.nextId() = " + snowflakeIdGenerator.nextId());
        }


    }

}
