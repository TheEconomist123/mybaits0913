package com.zhouzz.controller;

import com.zhouzz.common.CommonResult;
import com.zhouzz.mapper.StudentMapper;
import com.zhouzz.pojo.Student;
import com.zhouzz.pojo.StudentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-11-10 9:03
 * @desc
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentMapper studentMapper;

  //根据id查询学生信息
    @RequestMapping("/getStudentById")
    public CommonResult getStudentById(@RequestParam Long id){
        //TODO 根据id查询学生信息
        StudentExample studentExample = new StudentExample();
        studentExample.createCriteria().andIdEqualTo(id);
        List<Student> students = studentMapper.selectByExample(studentExample);
       return  new CommonResult("000000","success",students);
    }
}
