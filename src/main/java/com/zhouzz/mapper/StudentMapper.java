package com.zhouzz.mapper;

import com.zhouzz.pojo.Student;
import com.zhouzz.pojo.StudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.cursor.Cursor;

public interface StudentMapper {
    int countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    List<String> batchGetStudentIds(@Param("list") List<Student> students);

    List<Student> querySourceDataStudent();

    @Update("TRUNCATE TABLE STUDENT")
    void truncateTable();

    int batchInsert(@Param("list") List<Student> students);
    /**
     * 批量插入学生数据
     */
    int batchInsertStudents(@Param("list") List<Student> students);

}