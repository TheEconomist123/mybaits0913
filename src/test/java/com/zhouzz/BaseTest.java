package com.zhouzz;

import com.zhouzz.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-09-01 19:45
 * @desc
 */

@SpringBootTest
public class BaseTest {

    @Autowired
    protected EmpMapperTest empMapperTest;
    @Autowired
    protected EmpMapper empMapper;

    @Autowired
    protected HuisbankMesgSignMapper huisbankMesgSignMapper;

    @Autowired
    protected StudentMapper studentMapper;

    @Autowired
    protected JdbcTemplate jdbcTemplate;

    @Autowired
    protected TesttablebyMapper testtablebyMapper;

    @Autowired
    protected MenuMapper menuMapper;

    @Autowired
    protected ProductMapper productMapper;



}
