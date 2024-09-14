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

         //新增员工
        EmpTest emp = new EmpTest();
        emp.setEmpno(1003);
        emp.setEname("李四1");
        emp.setJob("Java");
        emp.setMgr(1000);
        emp.setHiredate(new Date());
        emp.setSal(new BigDecimal("5000"));
        emp.setComm(new BigDecimal("3000"));
        emp.setDeptno(10);
        int i = empMapper.insertEmp(emp);
        System.out.println("新增员工结果：" + i);

    }


}
