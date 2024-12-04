package com.zhouzz.mapper;

import com.zhouzz.pojo.Dept;
import com.zhouzz.pojo.Emp;
import com.zhouzz.pojo.EmpExt;
import com.zhouzz.pojo.EmpTest;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper   // 标注该类为mybatis的mapper接口
@Repository   // 标注该类为mybatis的mapper类
public interface EmpMapperTest {

    //新增员工信息  入参为Emp对象 实体类对象
    int insertEmp(EmpTest emp);

    //修改员工信息
    int updateEmp(EmpTest emp);

    //根据员工号批量删除员工
    int deleteEmpsByEmpno(int[] empnos);

    //根据员工号查询员工信息
    EmpTest selectEmpByEmpno(int empno);

    //查询所有员工信息
    List<EmpTest> selectAllEmps();
    //根据员工部门和员工姓名模糊查询员工信息
    List<EmpTest> selectEmpsByDeptAndName(Integer deptno, String ename );

    //根据map条件查询员工信息  也可以通过2@Param注解的方式传入参数
    List<EmpTest> selectEmpsByMap(Map<String, Object> map);

    //查询用户信息的总记录数
    int selectEmpCount();

    //根据员工号查询数据 并返回 map集合 返回值不管几条都可以将 empno 作为key获取数据
    @MapKey("EMPNO") //注意字段名大写 EMPNO
    Map<Object, Object> selectEmpByEmpnoToMap(@Param("empno") Integer empno);

    //查询所有员工信息返回是List<Map<String, Object>>集合
    @MapKey("DEPTNO") //注意字段名大写 EMPNO
    List<Map<String, Object>> selectAllEmpsToMap();

    @MapKey("DEPTNO") //注意字段名大写 EMPNO
    Map<String, Object>  selectAllEmpsToMap2();

    //根据员工号数组批量删除员工
    int deleteEmps(@Param("empnos") Integer[] empnos);

    //根据表名查询数据
    @MapKey("EMPNO") //注意字段名大写 EMPNO
    List<Map<String, Object>> selectByTableName(@Param("tableName")String tableName);

    //新增员工bigint自增主键 返回主键值
    int insertEmpAutoPrimaryKey(EmpTest emp);

    //测试一下关联查询  查询员工的部门信息
    @MapKey("EMPNO") //注意字段名大写 EMPNO
    List<Map<String, Object>> selectEmpAndDept();

    List<EmpExt> selectEmpAndDept2();

    EmpTest selectEmpAndDept3(@Param("empno") Integer empno);

    List<Dept> selectDeptAndEmp(@Param("deptno") Integer deptno);

    List<Emp> selectEmpByLocs(@Param("locs") String[] locs);

    List<Emp> selectEmpByLoc(String loc);

    //五种入参方式的测试方法
    //第一种 只有一个入参参数  ${} #{} 里面内容可以随便输入
    //第二种 两个参数  arg0, arg1 param1, param2
    //第三种 多个参数通过map作为载体传递
    //第四种 传入实体类对象
    //第五种 传入@Param注解的参数

}
