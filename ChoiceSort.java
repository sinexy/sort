package com.company;

public class ChoiceSort {
    /**
     * 先假定本趟排序的最小值是第一个元素
     * 遍历找到最小的元素，与第一个交换
     * @param arr
     */
    public void sort(int[] arr){
        int len = arr.length;
        int minIndex = 0;
        for (int i = 0; i < len-1; i++) {
            for (int j = i+1 ; j < len ; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
