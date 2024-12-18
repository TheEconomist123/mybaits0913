package com.zhouzz.test.interface4;

public class Test {
    public static void main(String[] args) {

        A a = new AImpl();
        a.method2();
        A.method4();
        System.out.println("a.A_CONSTANT = " + a.A_CONSTANT);

    }
}

class AImpl implements A {
    public void method1() {
        System.out.println("AImpl method1");
    }

}


interface A1 {

    default void method1() {
        System.out.println("A1 default method1");
    }
}

interface A2 {

    default void method1() {
        System.out.println("A2 default method2");
    }
}

class B implements A1, A2 {

    @Override
    public void method1() {
        A1.super.method1(); //调用A1的默认方法
        A2.super.method1();//调用A2的默认方法

    }
}

