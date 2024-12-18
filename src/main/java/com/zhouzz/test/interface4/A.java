package com.zhouzz.test.interface4;

public interface A {

    //静态最终常量
    public static final int A_CONSTANT = 10;

    //公开抽象方法
    public abstract void method1();

    //默认方法
    public default void method2() {
        System.out.println("接口中默认方法 method2()");
        method3();
    }

    //私有方法 不能被子类继承 供自己接口内部调用
    private void method3() {
        System.out.println("接口中私有方法 method3()");
    }

    //静态方法 只能通过接口名调用，子类无法调用，
    public static void method4() {
        System.out.println("接口里面的 method4()");
    }


}
