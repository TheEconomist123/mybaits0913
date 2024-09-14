package com.zhouzz.mybatis;

import com.zhouzz.BaseTest;
import com.zhouzz.pojo.Dept;
import com.zhouzz.pojo.EmpExt;
import com.zhouzz.pojo.EmpTest;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-09-01 22:41
 * @desc mybatis 各种查询 测试
 */
public class MybatisSelect extends BaseTest {


    //通过员工号查询员工信息 返回单个对象 保证结果不能有多条 否则报错
    @Test
    public void testSelectById() {
        //如果返回是一对象，没查到数据 返回null，如果返回是集合，没查到数据 返回空集合 返回值是数组类型 查询数据为空时，默认返回null
        EmpTest emp = empMapperTest.selectEmpByEmpno(77811);
        System.out.println(emp);
    }

    //查询员工总记录数  返回值是int类型

    @Test
    public void testSelectCount() {
        int count = empMapperTest.selectEmpCount();
        System.out.println(count);
    }

    //根据员工号查询员工信息 返回是Map<String, Object>类型 保证结果不能有多条 否则报错
    @Test
    public void testSelectMapByEmpno() {
        Map<Object, Object> map = empMapperTest.selectEmpByEmpnoToMap(7934);
        System.out.println(map);
        Map<String, Object> empMap = (Map<String, Object>) map.get(new BigDecimal("7934"));
        System.out.println(empMap);

        empMap.forEach((k, v) -> System.out.println(k + ":" + v));

    }
    //查询所有员工信息 返回是List<Map<String, Object>>类型 保证结果有多条

    @Test
    public void testSelectAll() {
        //查询所有员工信息 返回是List<Map<String, Object>>类型 保证结果有多条
        List<Map<String, Object>> maps = empMapperTest.selectAllEmpsToMap();
        System.out.println(maps);
    }

    //查询多个员工信息返回 Map<String, Object>类型 保证结果有多条
    @Test
    public void testSelectByMap() {
        //查询多个员工信息返回 Map<String, Object>类型 保证结果有多条
        Map<String, Object> map = empMapperTest.selectAllEmpsToMap2();
        System.out.println(map);
        //这种针对MapperKey deptno重复在map直接key会被覆盖掉
    }

    //新增员工信息 返回是int类型 新增成功返回1 失败返回0
    @Test
    public void testInsertEmp() {
        EmpTest emp = new EmpTest();
        emp.setEmpno(1005);
        emp.setEname("刘亦菲");
        emp.setJob("演员");
        emp.setMgr(7934);
        emp.setHiredate(new Date());
        emp.setSal(new BigDecimal("9000"));
        emp.setComm(new BigDecimal("1000"));
        emp.setDeptno(10);
        int result = empMapperTest.insertEmp(emp);
        System.out.println(result);
    }
    //演示批量删除员工信息 返回是int类型 成功返回删除的条数 失败返回0

    @Test
    public void testDeleteEmps() {
        Integer[] empnos = new Integer[]{1004, 1005, 1008};
        int result = empMapperTest.deleteEmps(empnos);
        System.out.println("删除的员工数据条数：" + result);
    }

    //将数据表名当做入参动态查询指定表数据
    @Test
    public void testSelectByTableName() {
        List<Map<String, Object>> maps = empMapperTest.selectByTableName("emp");
        System.out.println(maps);
    }

    //向oracle数据库员工表里插入数据 并且自动递增生成主键empno，且返回主键empno
    @Test
    public void testInsertEmpAuto() {
        EmpTest emp = new EmpTest();
        emp.setEname("周海媚");
        emp.setJob("演员");
        emp.setMgr(7934);
        emp.setHiredate(new Date());
        emp.setSal(new BigDecimal("2040"));
        emp.setComm(new BigDecimal("40"));
        emp.setDeptno(10);
        int result = empMapperTest.insertEmpAutoPrimaryKey(emp);
        System.out.println("新增条数：" + result);
        System.out.println("新增员工empno：" + emp.getEmpno());
    }

    //测试一下关联查询员工跟部门信息
    @Test
    public void testSelectEmpAndDept() {
        List<Map<String, Object>> maps = empMapperTest.selectEmpAndDept();
        System.out.println("查询结果：" + maps);
    }

    //测试一下关联查询员工跟部门信息，返回dept对象
    @Test
    public void testSelectEmpAndDept2() {
        List<EmpExt> maps = empMapperTest.selectEmpAndDept2();
        //格式化日期数据为字符串
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("查询结果：" + maps);
        for (EmpExt map : maps) {

            System.out.println(map.getEmpno() + " " + map.getEname() + " " + map.getDname()+" "+ map.getLoc());
        }
    }

    //多对一查询，查询员工信息和部门信息，返回emp对象
    @Test
    public void testSelectEmpAndDept3() {
        int empno = 7934;
        EmpTest emp = empMapperTest.selectEmpAndDept3(empno);
        System.out.println("查询结果：" + emp);
    }
    //测试部门与员工多对一查询，返回dept对象
    @Test
    public void testSelectDeptAndEmp() {
        int deptno = 10;
        List<Dept> dept = empMapperTest.selectDeptAndEmp(null);
        System.out.println("查询结果：" + dept);
        for (Dept dept1 : dept) {
          System.out.println(dept1.getDeptno() + " " + dept1.getDname() + " " + dept1.getLoc());
         dept1.getEmps().forEach(emp -> System.out.println(emp.getEmpno() + " " + emp.getEname()));
        }

    }


}
