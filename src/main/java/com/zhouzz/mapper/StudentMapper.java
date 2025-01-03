package com.zhouzz.mapper;

import com.zhouzz.pojo.Stud;
import com.zhouzz.pojo.Student;
import com.zhouzz.pojo.StudentExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentMapper {
    int countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    List<String> queryByStudentList(@Param("studList") List<Stud> studList);
}
