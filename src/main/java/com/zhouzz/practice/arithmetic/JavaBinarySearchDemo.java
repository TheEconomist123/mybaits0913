package com.zhouzz.practice.arithmetic;

import java.util.Arrays;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-09-23 22:17
 * @desc  java二分查找算法 demo    -(insertion point +1)
 */
public class JavaBinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 1;

        int i = Arrays.binarySearch(arr, target);


        System.out.println("i = " + i);
        //java中的0==-0 结果为true
        System.out.println(0==-0);


    }
}
