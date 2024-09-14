package com.zhouzz.mybatis;

import com.zhouzz.BaseTest;
import com.zhouzz.pojo.Emp;
import com.zhouzz.pojo.EmpExample;
import com.zhouzz.pojo.EmpTest;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-09-10 10:45
 * @desc
 */
public class MyBatisEmp  extends BaseTest {


    @Test
    public void test() {

        //测试emp表的更新功能
        Emp emp = new Emp();
        emp.setEmpno(7935);
        emp.setEname("刘亦菲");
        emp.setJob("歌手");
        emp.setMgr(null);

        EmpExample empExample = new EmpExample();
        EmpExample.Criteria criteria = empExample.createCriteria().andEmpnoEqualTo(emp.getEmpno());
        int i = empMapper.updateByExampleSelective(emp, empExample);

        System.out.println("i = " + i);


    }
}
