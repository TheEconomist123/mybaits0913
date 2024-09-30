package com.zhouzz.practice.factoria;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-09-28 10:36
 * @desc 递归反转字符串
 */
public class RecursiveDemo {
    public static void main(String[] args) {
        f(0,"hello");

    }

    public static void f(int n,String s) {
        if (n == s.length()) {
            return;
        }
        f(n+1,s);
        System.out.println(s.charAt(n));
    }

}
