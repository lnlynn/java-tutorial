package com.liuning.algorithms.primitive;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * PriorityQueue使用案例
 *
 * @author liuning
 * @since 2021-04-05 16:34
 */
public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            public int compare(int[] pair1, int[] pair2) {
                return pair1[0] != pair2[0] ? pair2[0] - pair1[0] : pair2[1] - pair1[1];
            }
        });

        pq.offer(new int[]{5, 7});
        pq.offer(new int[]{2, 8});
        pq.offer(new int[]{1, 9});
        pq.offer(new int[]{6, 4});

        System.out.println(Arrays.toString(pq.peek()));
        System.out.println((25 - 1) >>> 1);
    }
}
