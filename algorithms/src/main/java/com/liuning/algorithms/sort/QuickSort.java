package com.liuning.algorithms.sort;

/**
 * 快速排序
 *
 * @author liuning
 * @since 2021-03-30 23:39
 */
public class QuickSort {

    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int lo, int hi) {
        if (hi <= lo)
            return;
        int j = partition(arr, lo, hi);
        sort(arr, lo, j - 1);
        sort(arr, j + 1, hi);
    }

    private int partition(int[] arr, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        int v = arr[lo];
        while (true) {
            while (arr[++i] < v) if (i == hi) break;
            while (v < arr[--j]) if (j == lo) break;
            if (i >= j) break;
            exch(arr, i, j);
        }
        exch(arr, lo, j);
        return j;
    }

    private void exch(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * 主函数
     *
     * @param argd
     */
    public static void main(String[] argd) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        QuickSort sort = new QuickSort();
        sort.sort(arr);
        for (int s : arr) {
            System.out.print(s + " ");
        }
    }
}
