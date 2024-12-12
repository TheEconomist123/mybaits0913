package com.zhouzz.mapper;

import com.zhouzz.pojo.Emp;
import com.zhouzz.pojo.EmpExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface EmpMapper {
    int countByExample(EmpExample example);

    int deleteByExample(EmpExample example);

    int deleteByPrimaryKey(Integer empno);

    int insert(Emp record);

    int insertSelective(Emp record);

    List<Emp> selectByExample(EmpExample example);

    Emp selectByPrimaryKey(Integer empno);

    int updateByExampleSelective(@Param("record") Emp record, @Param("example") EmpExample example);

    int updateByExample(@Param("record") Emp record, @Param("example") EmpExample example);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

    List<Emp> seleceByEmpName(String ename);

    @Select("""
    <script>
    SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO
    FROM EMP
    WHERE 1=1
    <if test="deptNos != null and deptNos.size > 0">
        <foreach collection="deptNos" item="deptNoGroup" open="AND (" close=")" separator=" OR ">
            DEPTNO IN
            <foreach collection="deptNoGroup" item="deptNo" open="(" close=")" separator=",">
                #{deptNo}
            </foreach>
        </foreach>
    </if>
    ORDER BY EMPNO DESC
    </script>
""")
    List<Emp> findEmployeesByDeptNos(@Param("deptNos") List<List<Integer>> deptNos);


}
