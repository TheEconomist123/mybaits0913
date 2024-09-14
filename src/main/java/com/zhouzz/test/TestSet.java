package com.zhouzz.test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-09-09 15:29
 * @desc
 */
public class TestSet {
    public static void main(String[] args) {
/*
        //测试set集合特点
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
       System.out.println(set.add("world1"));*/

        int count = 0;
        for (int i = 0; i <= 100; i++) {

            count += i;
        }

        System.out.println(count);
    }
}
