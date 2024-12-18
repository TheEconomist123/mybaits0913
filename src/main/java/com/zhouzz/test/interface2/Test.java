package com.zhouzz.test.interface2;

/*
 *
 * @author zhouzz
 * @date 2024年12月14日18:45:10
 * @version 1.0
 * @description 接口测试
 */
public class Test {


    public static void main(String[] args) {

        Driver driver = new Student();
        Driver driver1 = new Teacher();
        //面向接口编程,解耦合、提高代码复用性
        BoyFriend bf = new Student();
        BoyFriend bf1 = new Teacher();


    }
}

interface Driver {
}

interface BoyFriend {
}

class People {
}

class Student extends People implements Driver, BoyFriend {
}

class Teacher extends People implements Driver, BoyFriend {
}