package com.zhouzz.mybatis;

import com.zhouzz.BaseTest;
import com.zhouzz.pojo.Stud;
import com.zhouzz.pojo.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-12-19 17:54
 * @desc
 */
public class TestStu extends BaseTest {


    @Test
    public void testqueryStu() {


        List<Stud> students = new ArrayList<>();
        Stud s1 = new Stud();
        s1.setAge("29");


        Stud s2 = new Stud();
        s2.setAge("30");
        s2.setSex("1");

        students.add(s1);
        students.add(s2);

        for (Stud student : students) {

            System.out.println("student = " + student);
        }

        List<String> ids = studentMapper.queryByStudentList(students);

        for (String id : ids) {
            System.out.println("id = " + id);  
        }

    }
}
