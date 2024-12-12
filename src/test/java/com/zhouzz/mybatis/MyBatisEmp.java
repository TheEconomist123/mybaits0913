package com.zhouzz.mybatis;

import com.zhouzz.BaseTest;
import com.zhouzz.pojo.Emp;
import com.zhouzz.pojo.EmpExample;
import com.zhouzz.pojo.EmpTest;
import com.zhouzz.test.abstract1.A;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.*;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-09-10 10:45
 * @desc
 */
public class MyBatisEmp extends BaseTest {


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

    //根据员工名称模糊查询员工信息
    @Test
    public void testSelectByEmpName() {
        String empName = "M";
        List<Emp> emps = empMapper.seleceByEmpName(empName);

        System.out.println("emps = " + emps);

    }

    //根据部门号查询员工信息  这样可以规避掉查询单个超过1000条数据导致oracle数据报错
    @Test
    public void testSelectByDeptno() {

        List<Integer> allDeptNos = new ArrayList<>(); // 假设 2000 个部门编号
        for (int i = 1; i < 4000; i++) {
            allDeptNos.add(i);
        }
        int batchSize = 1000;

      // 将部门编号分块
        List<List<Integer>> deptNoGroups = new ArrayList<>();
        for (int i = 0; i < allDeptNos.size(); i += batchSize) {
            deptNoGroups.add(allDeptNos.subList(i, Math.min(i + batchSize, allDeptNos.size())));
        }

        // 调用查询
        List<Emp> employees = empMapper.findEmployeesByDeptNos(deptNoGroups);

        for (Emp employee : employees) {

            System.out.println("employee = " + employee);
        }


    }


}
