package com.zhouzz.study.pattern;

public class Test {
    public static void main(String[] args) {


        B instance = B.getInstance();
        B instance1 = B.getInstance();
        System.out.println("instance = " + instance);
        System.out.println("instance1 = " + instance1);


    }
}
