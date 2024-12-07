package com.zhouzz.study.enumdemo;

public class Test {
    public static void main(String[] args) {

        System.out.println("A.X = " + A.X);


        A a = A.X;
        A b = A.Y;

        System.out.println("a.ordinal() = " + a.ordinal());
        System.out.println("b.ordinal() = " + b.ordinal());
        System.out.println("A.valueOf(\"X\") = " + A.valueOf("X"));

        System.out.println(" ==================================" );

        A[] values = A.values();
        for (int i = 0; i < values.length; i++) {
            A value = values[i];
            System.out.println(value);
        }
        A z = A.valueOf("Z");
        System.out.println("z = " + z);

    }
}
