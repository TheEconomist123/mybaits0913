package com.zhouzz.practice.arithmetic;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-09-22 16:53
 * @desc 二分查找
 */
public class BinarySearch {


    // 二分查找基础版本
    public static int binarySearchBasic(int[] nums, int target) {
        //设置左右指针
        int left = 0;
        int right = nums.length - 1;
        System.out.println("left: " + left + " right: " + right);
        //循环查找
        while (left <= right) {
            //这一个判断条件是为了防止死循环，如果left和right相等，说明没找到，返回-1 （这种）
            //  int mid = left + (right - left) / 2;  //不要写成mid = (left + right) / 2，这样会有整型溢出
            int mid = (left + right) >>> 1;  //不要写成mid = (left + right) / 2，这样会有整型溢出
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

    // 二分查找防治整型溢出 (推荐) 时间复杂度O(logn) >>>1写法
    // 防治整型溢出的方法是将mid = (left + right)>>>1，即将mid的计算结果向右移一位。
    // 这样做的原因是，如果left和right相等，则mid = (left + right) / 2，此时mid的结果为0，
    // 而nums[mid]的结果为nums[0]，如果nums[0]等于target，则返回0，但实际上应该返回-1。
    // 因此，将mid的计算结果向右移一位，即mid = (left + right)>>>1，可以避免整型溢出。
    // 另外，如果数组中存在负数，则需要考虑负数的情况。
    // 负数的情况是，如果target小于数组中的最小值，则应该返回-1，如果target大于数组中的最大值，则应该返回-1。
    // 因此，需要在循环中添加判断条件，如果left大于right，则说明没找到，返回-1。
    // 最后，如果数组中存在重复元素，则二分查找的结果可能不准确。
    // 因此，在实际应用中，应当结合其他条件，如数组是否有序、数组元素是否唯一等，来决定使用哪种查找算法。
    public static int binarySearchOptimized(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {    //防止死循环
            int mid = (left + right) >>> 1;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }


    //二分查找放置重复元素的情况，返回最左侧的索引 简单写法 采用中间candidates变量存储中间值，防止数组中存在重复元素时，candidates变量会存储多个相同值
    public static int binarySearchWithDuplicate(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int candidates = -1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] == target) {
                candidates = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return candidates;
    }

    //二分查找 返回>=target最靠左索引
    public static int binarySearchLeft(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;        //防止死循环
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] >= target) {
                if (mid == 0 || nums[mid - 1] < target) {
                    return mid;
                } else {
                    right = mid - 1;
                }
            } else {
                left = mid + 1;
            }            //这里的判断条件是nums[mid]>=target，所以mid左侧的元素都不可能>=target，所以right=mid-1    这里的判断条件是nums[mid]>=target，所以mid左侧的元素都不可能>=target，所以right=mid-1
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] nums = {1, 23, 36, 36, 36, 45, 83, 90, 100};
        int target = 37;
        int index = binarySearchLeft(nums, target);
        System.out.println(index);

    }

}
