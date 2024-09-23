package com.zhouzz.practice.arithmetic;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-09-22 16:53
 * @desc 二分查找
 */
public class BinarySearch {

    public static void main(String[] args) {

        int[] nums = {1, 23, 36, 45, 51, 64, 72, 83, 90, 100};
        int target = 360;
        int index = binarySearchBasic(nums, target);
        System.out.println(index);

    }


    // 二分查找基础版本
    public static int binarySearchBasic(int[] nums, int target) {
        //设置左右指针
        int left = 0;
        int right = nums.length - 1;
        System.out.println("left: " + left + " right: " + right);
        //循环查找
        while (left <= right) {
            //这一个判断条件是为了防止死循环，如果left和right相等，说明没找到，返回-1 （这种）
            int mid = left + (right - left) / 2;  //不要写成mid = (left + right) / 2，这样会有整型溢出
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

            System.out.println("left: " + left + " right: " + right);
        }
        //未找到
        return -1;
    }

    //线性查找 (不推荐) 时间复杂度O(n)
    // 线性查找是指从头到尾依次查找，直到找到或遍历完整个数组。
    // 线性查找的优点是简单，缺点是效率低，且不适合大规模数据。
    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }


}
