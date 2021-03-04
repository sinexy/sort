package com.company;

public class BubbleSort {

    /**
     * 冒泡排序
     * 找最大，放到数组最后
     * 比较相邻的两个元素，把较大的放在后面
     * @param arr
     */
    public void sort(int[] arr){
        int len = arr.length;
        for (int i = 0; i < len-1; i++) {
            for (int j = 0 ; j < len - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
