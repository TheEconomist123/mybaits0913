package com.zhouzz.test.abstract1;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-12-09 15:11
 * @desc 抽象类就是无法具体化的类，只能作为父类被继承，不能创建对象。
 */
public abstract class A {
    //抽象类本质就是被继承的类，不能创建对象，只能作为父类被继承。

    public abstract void method();

    public void method2() {
        System.out.println("A method2");
    }

    public A() {

        System.out.println("A constructor");
    }

}
