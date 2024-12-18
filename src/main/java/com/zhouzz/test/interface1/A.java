package com.zhouzz.test.interface1;

public interface A {

    //jdk8 之前接口中只能定义常量跟抽象方法，jdk8 之后可以定义默认方法和静态方法  修饰符都是 public abstract
    //接口不可以实例化，只能被实现类实现


    //1.定义常量
    public static final String SCHOOL_NAME = "ZhouZhou";
    //2.抽象方法
    public abstract void study();


}
