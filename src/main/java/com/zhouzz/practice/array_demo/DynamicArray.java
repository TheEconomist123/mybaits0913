package com.zhouzz.practice.array_demo;

import java.util.Arrays;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-09-24 16:42
 * @desc 动态数组
 */
public class DynamicArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 6, 7, 8, 9};
        int[] arr3 = new int[10];
        System.arraycopy(arr, 3, arr2, 0, 1);

        String string = Arrays.toString(arr2);
        System.out.println("string = " + string);

        System.out.println("------------------二维数组----------------------");
        //二维数组
        int[][] arr4 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("arr4[0][2] = " + arr4[0][2]);   // 3
        //java中的数组是连续存储的，所以可以直接通过下标访问元素

        // 二维数组的遍历 1. 外层循环遍历行 2. 内层循环遍历列
        //空间局部性 ，缓存行命中率高，访问速度快，适合于对稀疏矩阵的遍历，先遍历行再遍历列 这样效率高

    }


}
