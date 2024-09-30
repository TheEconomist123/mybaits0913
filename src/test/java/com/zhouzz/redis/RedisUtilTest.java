package com.zhouzz.redis;

import com.zhouzz.BaseTest;
import com.zhouzz.pojo.ClassifyDemo;
import com.zhouzz.pojo.Student;
import com.zhouzz.utils.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-09-23 14:34
 * @desc
 */
public class RedisUtilTest extends BaseTest {


    @Autowired
    private RedisUtil redisUtil;


    //TODO: add test cases
    @Test
    public void test() {
        redisUtil.set("zzz", "周政之");
        String value = (String) redisUtil.get("zzz");
        System.out.println(value);
    }

    //设置对应redis的值的过期时间
    @Test
    public void testExpire() {
        redisUtil.set("LYF", "刘亦菲11", 10, TimeUnit.SECONDS);
        String value = (String) redisUtil.get("LYF");
        System.out.println(value);

    }

    //测试将lsit存入redis
    @Test
    public void testList() {
        List<Student> students = studentMapper.selectByExample(null);
        redisUtil.set("students", students);
        List<Student> students2 = (List<Student>) redisUtil.get("students");
        System.out.println(students2);

    }

    //向redis数据中放入5万条数据，key 从10000000 开始 ，对应的值是 List<ClassifyDemo>
    @Test
    public void testList01() {

        //计时器
        long start = System.currentTimeMillis();
        //向redis数据中放入5万条数据，key 从10000000 开始 ，对应的值是 List<ClassifyDemo>

        List<ClassifyDemo> list = new ArrayList<>();

        ClassifyDemo classifyDemo01 = new ClassifyDemo("a财票_商票_银票", "3000000", "2000");
        ClassifyDemo classifyDemo02 = new ClassifyDemo("b财票_商票_银票", "3000000", "2000");
        ClassifyDemo classifyDemo03 = new ClassifyDemo("c财票_商票_银票", "3000000", "2000");
        ClassifyDemo classifyDemo04 = new ClassifyDemo("d财票_商票_银票", "3000000", "2000");
        ClassifyDemo classifyDemo05 = new ClassifyDemo("e财票_商票_银票", "3000000", "2000");
        ClassifyDemo classifyDemo06 = new ClassifyDemo("f财票_商票_银票", "3000000", "2000");
        ClassifyDemo classifyDemo07 = new ClassifyDemo("g财票_商票_银票", "3000000", "2000");
        ClassifyDemo classifyDemo08 = new ClassifyDemo("h财票_商票_银票", "3000000", "2000");
        ClassifyDemo classifyDemo09 = new ClassifyDemo("i财票_商票_银票", "3000000", "2000");
        ClassifyDemo classifyDemo10 = new ClassifyDemo("j财票_商票_银票", "3000000", "2000");
        ClassifyDemo classifyDemo11 = new ClassifyDemo("k财票_商票_银票", "3000000", "2000");
        ClassifyDemo classifyDemo12 = new ClassifyDemo("l财票_商票_银票", "3000000", "2000");
        ClassifyDemo classifyDemo13 = new ClassifyDemo("m财票_商票_银票", "3000000", "2000");
        ClassifyDemo classifyDemo14 = new ClassifyDemo("n财票_商票_银票", "3000000", "2000");
        ClassifyDemo classifyDemo15 = new ClassifyDemo("o财票_商票_银票", "3000000", "2000");
        ClassifyDemo classifyDemo16 = new ClassifyDemo("p财票_商票_银票", "3000000", "2000");
        ClassifyDemo classifyDemo17 = new ClassifyDemo("q财票_商票_银票", "3000000", "2000");
        list.add(classifyDemo01);
        list.add(classifyDemo02);
        list.add(classifyDemo03);
        list.add(classifyDemo04);
        list.add(classifyDemo05);
        list.add(classifyDemo06);
        list.add(classifyDemo07);
        list.add(classifyDemo08);
        list.add(classifyDemo09);
        list.add(classifyDemo10);
        list.add(classifyDemo11);
        list.add(classifyDemo12);
        list.add(classifyDemo13);
        list.add(classifyDemo14);
        list.add(classifyDemo15);
        list.add(classifyDemo16);
        list.add(classifyDemo17);


        for (int i = 1; i < 60000; i++) {
            redisUtil.set("LYF_" + i, list, 10, TimeUnit.HOURS);
        }

        System.out.println("redis数据写入成功");

        long l = System.currentTimeMillis();
// 耗时
        System.out.println("耗时：" + (l - start) + "ms");

    }

}
