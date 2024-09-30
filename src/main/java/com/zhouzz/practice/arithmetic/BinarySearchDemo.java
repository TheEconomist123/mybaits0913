package com.zhouzz.practice.arithmetic;

import io.lettuce.core.ScriptOutputType;

import java.util.Arrays;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-09-24 15:35
 * @desc 针对二分查找进行的一些练习
 */
public class BinarySearchDemo {

    // 二分查找 针对有序数组，查找目标值 查到返回索引，没查到返回 索引应该在的位置 -（target+1）
    public static void main(String[] args) {
        int[] nums = {2, 3, 7, 7, 7, 7, 7, 9, 10, 34, 36, 40, 41};
        int i = binarySearchRightMost(nums, 2);
        System.out.println("i = " + i);
    }

    //如果用重复的元素，则返回第一个重复元素的索引
    public static int binarySearchLeftMost(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int candidate = -1;
        while (left <= right) {
            int mid = (right + left) / 2;
            System.out.println("left = " + left + " mid = " + mid + " right = " + right);
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                candidate = mid;
                right = mid - 1;
            }
        }
        return candidate;
    }

    //如果用重复的元素，则返回第一个重复元素的索引
    public static int binarySearchRightMost(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int candidate = -1;
        while (left <= right) {
            int mid = (right + left) / 2;
            System.out.println("left = " + left + " mid = " + mid + " right = " + right);
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                candidate = mid;
                left = mid + 1;
            }
        }
        return candidate;
    }
}
