package com.zhouzz.test.sort;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-10-09 13:49
 * @desc 插入排序
 */
public class InsertionSort {


    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 3, 1, 3};
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    //通过debug调试
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            //这是临时存储变量
            int temp = arr[i];
            int j = i - 1;
       /*
       这个是进行插入排序的过程，比如到了第四个索引，他会通过这个while 循环中的j--
        ，跟之前一个个比较，直到找到它大于的元素才罢休，进行位置调换，这个调换值就存储在temp里面
        */
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }


 /*   总结
    冒泡排序由于频繁交换元素，在大多数情况下效率较低，适合对排序性能要求不高的场合。
    插入排序在数据量较小或数据部分有序时效率更高，特别是在实时处理少量新增元素的场景中有
*/

}
