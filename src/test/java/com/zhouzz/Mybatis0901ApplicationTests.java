package com.zhouzz;


import com.zhouzz.mapper.EmpMapperTest;
import com.zhouzz.pojo.EmpTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Date;

@SpringBootTest
class Mybatis0901ApplicationTests {

    @Autowired
    private EmpMapperTest empMapper;

    @Test
    void contextLoads() {



    }


}
