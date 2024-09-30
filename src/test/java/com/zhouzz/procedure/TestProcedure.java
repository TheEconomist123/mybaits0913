package com.zhouzz.procedure;

import com.zhouzz.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import java.sql.Types;
import java.util.Map;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-09-27 15:50
 * @desc
 */
public class TestProcedure extends BaseTest {


    @Test
    public void testProcedure() {
        //统计执行时间
        long start = System.currentTimeMillis();
        //调用存储过程
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("cust_asset_proc");
        // 执行存储过程并获取输出
        Map<String, Object> execute = jdbcCall.execute();
        System.out.println("execute = " + execute);
        long end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - start) + "ms");

    }


}
