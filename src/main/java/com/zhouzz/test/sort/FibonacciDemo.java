package com.zhouzz.test.sort;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-10-09 14:40
 * @desc Fibonacci Demo
 */
public class FibonacciDemo {


    public static void main(String[] args) {

        //int fibonacci = fibonacci(4);
        int fibonacci2 = fibonacci2(400);

        //System.out.println("fibonacci = " + fibonacci);
        System.out.println("fibonacci2 = " + fibonacci2);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    //递归的优化方法
    public static int fibonacci2(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
