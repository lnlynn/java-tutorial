package com.liuning.algorithms;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(binarySearchRecursive(arr, 10, 0, arr.length));
        System.out.println(binarySearchIteration(arr, 4));
    }

    /**
     * 递归的二分查找
     **/
    public static int binarySearchRecursive(int[] arr, int value, int lo, int hi) {

        if (hi < lo) return lo;

        int mid = lo + (hi - lo) / 2;

        if (value < arr[mid])
            return binarySearchRecursive(arr, value, lo, mid - 1);
        else if (value > arr[mid])
            return binarySearchRecursive(arr, value, mid + 1, hi);
        else
            return mid;
    }

    /**
     * 迭代的二分查找
     **/
    public static int binarySearchIteration(int[] array, int value) {

        int lo = 0;
        int hi = array.length;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (value < array[mid]) hi = mid - 1;
            else if (value > array[mid]) lo = mid + 1;
            else return mid;
        }
        return 0;
    }
}
