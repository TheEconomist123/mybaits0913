package com.zhouzz;

import com.zhouzz.mapper.EmpMapper;
import com.zhouzz.mapper.EmpMapperTest;
import com.zhouzz.mapper.HuisbankMesgSignMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-09-01 19:45
 * @desc
 */

@SpringBootTest
public  class BaseTest {

    @Autowired
    protected EmpMapperTest empMapperTest;
    @Autowired
    protected EmpMapper empMapper;

    @Autowired
    protected HuisbankMesgSignMapper huisbankMesgSignMapper;
}
