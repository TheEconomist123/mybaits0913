package com.zhouzz.test.abstract1;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-12-09 15:25
 * @desc
 */
public class B  extends A {


    public B() {

        System.out.println("B constructor");
    }

    @Override
    public void method() {
        System.out.println("true = " + true);
    }


}
