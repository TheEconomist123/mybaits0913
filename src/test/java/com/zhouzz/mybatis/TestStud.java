package com.zhouzz.mybatis;

import com.zhouzz.BaseTest;
import com.zhouzz.pojo.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestStud extends BaseTest {


    @Test
    public void testSelectAll() {
        Student s1 = new Student();
        s1.setName("啊阿萨");
        s1.setAge("23");
        s1.setSex("0");
        Student s2 = new Student();
        s2.setName("小米糕");
        s2.setAge("30");
        s2.setSex("1");
        Student s3 = new Student();
        s3.setName("小米糕");
        s3.setAge("32");
        s3.setSex("1");
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s2);
        students.add(s3);
        List<String> list = studentMapper.batchGetStudentIds(students);
        for (String s : list) {
            System.out.println("s = " + s);
        }
    }


}
