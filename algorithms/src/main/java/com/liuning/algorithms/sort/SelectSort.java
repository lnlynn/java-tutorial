package com.liuning.algorithms.sort;

import java.util.Arrays;

/**
 * 选择排序法
 *
 * @author liuning
 * @since 2020-09-01 23:52
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] array = {1, 4, 68, 35, 67, 3, 3, 9, 2, 45, 9};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int flag = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < temp) {
                    temp = arr[j];
                    flag = j;
                }
            }
            if (flag != i) {
                arr[flag] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
