package com.zhouzz.study.pattern;

//设计成单例模式
public class A {

    //饿汉式单例，已经提前create好了对象
    private static final A a = new A();


    private A() {

    }
    public static A getInstance() {
        return a;
    }


    //饿汉式单例模式的缺点：
    // 1. 资源浪费，如果没有用到该对象，就没有必要创建，浪费资源
    //饿汉式单例优点：
    // 1. 线程安全，在第一次调用getInstance()时，已经创建好了对象，所以不需要加锁，保证线程安全
    // 2. 避免了多线程同步问题，在第一次创建对象时，其他线程不能访问该对象，保证了线程安全
}
