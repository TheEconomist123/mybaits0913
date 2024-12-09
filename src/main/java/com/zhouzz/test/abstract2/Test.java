package com.zhouzz.test.abstract2;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-12-09 15:34
 * @desc 模版方法设计模式
 */
public class Test {
    public static void main(String[] args) {


        //动态的满足三个条件
        //1. 子类可以实现抽象类中的抽象方法
        //2. 子类可以重写父类中的非抽象方法
        //3. 父类的引用指向子类的对象
          People people = new Student();
          people.write();


    }
}
