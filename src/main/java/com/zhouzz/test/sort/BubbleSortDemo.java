package com.zhouzz.test.sort;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-10-09 10:32
 * @desc 冒泡排序算法
 */
public class BubbleSortDemo {

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 5, 3, 2, 1};
        bubbleSort2(arr);
       /* for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
*/
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
            for (int c = 0; c < arr.length; c++) {
                System.out.print(arr[c] + " ");
            }
            System.out.println("");
        }
    }

    //自己写一个冒泡排序
/*    <ol>
        <li>第一步：设置一个flag变量，用来标记是否进行过交换，如果没有进行过交换，则说明数组已经有序，可以提前结束循环。</li>
        <li>第二步：遍历数组，比较相邻的两个元素，如果前者大于后者，则交换位置。</li>

    </ol>*/
    public static void bubbleSort2(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
            for (int c = 0; c < arr.length; c++) {
                System.out.print(arr[c] + " ");
            }
            System.out.println("");

        }
    }

}
