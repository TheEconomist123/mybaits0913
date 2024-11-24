package com.zhouzz.testuser;

import com.zhouzz.BaseTest;
import com.zhouzz.pojo.Users;
import org.junit.jupiter.api.Test;

public class TestUser extends BaseTest {


    // 用来测试插入用户的功能，并返回插入的用户id

    // 测试插入用户 采用序调用oracle 数据库序列 方式生成id 并返回插入的用户id
    @Test
    public void testInsertUser() {
        Users users = new Users();
        users.setUsername("zhouzz221");
        users.setPassword("123456");
        users.setEmail("zhouzz@163.com");
        users.setPhone("13812345678");
        int id = usersMapper.insertWithSequence(users);
        System.out.println("插入行数：" + id);
        System.out.println("插入的用户id为：" + users.getId());
    }
    //测试返回用户主键，而且不影响oracle中默认为空字段为当前时间的情况

    @Test
    public void testInsertUser2() {
        Users users = new Users();

        users.setUsername("李四lishuai");
        users.setPassword("123456");
        users.setEmail("zhouzz@163.com");
        users.setPhone("13812345678");
        int i = usersMapper.insertSelective(users);

        System.out.println("插入行数："+i);
        System.out.println("返回的用户id为："+users.getId());

    }
}