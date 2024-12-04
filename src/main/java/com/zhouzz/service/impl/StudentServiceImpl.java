package com.zhouzz.service.impl;

import com.zhouzz.mapper.StudentMapper;
import com.zhouzz.pojo.Student;
import com.zhouzz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-12-04 10:23
 * @desc
 */
@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentMapper studentMapper;
    //如果transactional注解里面默认配置，只针对 runtimeException 进行回滚，其他异常不会回滚
    @Override
    @Transactional
    public void testTransaction() {

        /**
         * 测试结论，如果检查时抛出了异常，事务不会回滚，除非你手动抛出异常，比如这里的FileNotFoundException
         */
        Student s1 = new Student();
        s1.setId(5000L);
        s1.setName("张三");
        s1.setAge("29");
        int insert = studentMapper.insert(s1);
      /*  if (true) {
            throw new RuntimeException("测试事务回滚");
        }*/
        try {
            FileReader file = new FileReader("nonexistent_file.txt");
        } catch (FileNotFoundException e) {
         e.printStackTrace();
         throw new RuntimeException("系统找不到指定的文件路径.........");
        }
    }
}
