package com.liuning.algorithms.sort;

/**
 * @author liuning
 * @description InsertSort
 * @since 2020-08-30 23:51
 */
public class InsertSort {

    /**
     * 插入排序法
     **/
    public static void InsertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j;
            for (j = i; j > 0 && array[j - 1] > temp; j--) {
                array[j] = array[j - 1];
            }
            array[j] = temp;
        }
    }
}
