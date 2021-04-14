package com.liuning.algorithms.leetcode.basic;

import java.util.Arrays;

/**
 * 179.最大数
 * 给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
 * 注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 *
 * @author liuning
 * @since 2021-04-12 23:55
 */
public class LargestNumber {

    public String largestNumber(int[] nums) {
        String[] h = new String[nums.length];
        for (int i = 0; i < nums.length; i++) h[i] = String.valueOf(nums[i]);
        Arrays.sort(h, (a, b) -> {
            if (a.charAt(0) != b.charAt(0)) {
                return b.charAt(0) - a.charAt(0);
            }
            String l1 = a + b;
            String l2 = b + a;
            return l2.compareTo(l1);
        });
        if (h[0].charAt(0) == '0') return "0";
        StringBuilder sb = new StringBuilder();
        for (String ky : h) sb.append(ky);
        return sb.toString();
    }
}
