package com.zhouzz.practice.bubble_sort;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-09-29 22:07
 * @desc
 */
public class BubbleSortDemo {

     public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2, 7, 1, 4};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
