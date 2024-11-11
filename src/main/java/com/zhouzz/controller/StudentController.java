package com.zhouzz.controller;

import com.zhouzz.common.CommonResult;
import com.zhouzz.mapper.StudentMapper;
import com.zhouzz.pojo.Student;
import com.zhouzz.pojo.StudentExample;
import com.zhouzz.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

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
    @Autowired
    private RedisUtil redisUtil;

    //根据id查询学生信息
    @RequestMapping("/getStudentById")
    public CommonResult getStudentById(@RequestParam Long id) {
        //TODO 根据id查询学生信息
        StudentExample studentExample = new StudentExample();
        studentExample.createCriteria().andIdEqualTo(id);
        List<Student> students = studentMapper.selectByExample(studentExample);
        return new CommonResult("000000", "success", students);
        //此时40000个请求，每个请求都要查询一次数据库，效率低下，需要优化 吞吐量 是772.6/s
    }


    //优化查询从缓存里面取值
    @RequestMapping("/getStudentByIdFromCache")
    public CommonResult getStudentByIdFromCache(@RequestParam Long id) {
        //TODO 根据id查询学生信息

        List<Student> students2 = (List<Student>) redisUtil.get(id.toString());
        if (students2 == null) {
            System.out.println("从数据库中获取数据。。。。。。");
            StudentExample studentExample = new StudentExample();
            studentExample.createCriteria().andIdEqualTo(id);
            students2 = studentMapper.selectByExample(studentExample);
            redisUtil.set(id.toString(), students2,20, TimeUnit.SECONDS);
            return new CommonResult("000000", "success", students2);
        } else {
            System.out.println("从缓存中获取数据");
            return new CommonResult("000000", "success", students2);
        }


    }

    //简单返回一个字符串
    @RequestMapping("/hello")
    public CommonResult hello() {
        System.out.println(" hello 请求数据来了...............");
       //睡眠1秒
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new CommonResult("000000", "success", "hello world"+System.currentTimeMillis());

    }
}
