package com.zhouzz.mybatis;

import com.zhouzz.BaseTest;
import com.zhouzz.pojo.EmpTest;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author zzz
 * @version 1.0
 * @date 2024-09-01 19:46
 * @desc mybatis 基本测试 外加 入参种类 以及如何接受入参方法逻辑 涉及到 #{}  ${}
 */
public class MybatisDemo extends BaseTest {


    //测试更新员工信息
    @Test
    public void updateEmp() {
        EmpTest emp = new EmpTest();
        emp.setEmpno(1001);
        emp.setEname("张三111");
        int i = empMapperTest.updateEmp(emp);
        System.out.println("更新了" + i + "条数据");
    }


    //测试批量删除员工信息
    @Test
    public void deleteEmps() {
        int[] empnos = {1001, 1002};
        int i = empMapperTest.deleteEmpsByEmpno(empnos);
        System.out.println("删除了" + i + "条数据");

    }
    //接下来针对各式各样的查询操作，我们将在后续的测试用例中逐步完善。

    //根据员工编号查询员工信息
    @Test
    public void selectEmpByEmpno() {
        EmpTest emp = empMapperTest.selectEmpByEmpno(7521);
        System.out.println(emp);
    }

    //查询所有员工信息
    @Test
    public void selectAllEmps() {
        List<EmpTest> emps = empMapperTest.selectAllEmps();
        System.out.println("查询到"+emps.size()+"条数据");
    }
    //根据部门号和员工名模糊查询员工信息

    @Test
    public void selectEmpsByDeptnoAndEname() {
        List<EmpTest> emps = empMapperTest.selectEmpsByDeptAndName(10, "L");
        System.out.println("查询到"+emps.size()+"条数据");
    }
    //通过传递map参数 根据部门号和员工名模糊查询员工信息
    @Test
    public void selectEmpsByMap() {
        System.out.println("通过传递map参数 根据部门号和员工名模糊查询员工信息");
        Map<String, Object> map = new HashMap<>();
        map.put("deptno", 10);
        map.put("ename", "L");
        List<EmpTest> emps = empMapperTest.selectEmpsByMap(map);
        System.out.println("查询到"+emps.size()+"条数据");
    }




}
