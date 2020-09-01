package com.liuning.algorithms.sort;

/**
 * 冒泡排序法
 *
 * @author liuning
 * @since 2020-09-01 23:49
 */
public class BubbleSort {

    public static void BubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
