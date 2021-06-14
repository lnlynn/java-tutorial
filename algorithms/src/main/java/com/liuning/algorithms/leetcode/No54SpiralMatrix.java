package com.liuning.algorithms.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * 旋转矩阵
 *
 * @author liuning
 * @since 2021-03-15 22:37
 */
public class No54SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> order = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return order;
        }
        int rows = matrix.length, columns = matrix[0].length;
        boolean[][] visited = new boolean[rows][columns];
        int total = rows * columns;
        int row = 0, column = 0;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int directionIndex = 0;
        for (int i = 0; i < total; i++) {
            order.add(matrix[row][column]);
            visited[row][column] = true;
            int nextRow = row + directions[directionIndex][0];
            int nextColumn = column + directions[directionIndex][1];
            if (nextRow < 0 || nextRow >= rows || nextColumn < 0 || nextColumn >= columns || visited[nextRow][nextColumn]) {
                directionIndex = (directionIndex + 1) % 4;
            }
            row += directions[directionIndex][0];
            column += directions[directionIndex][1];
        }
        return order;
    }

    /**
     * 对于这种螺旋遍历的方法，重要的是要确定上下左右四条边的位置，那么初始化的时候，上边up就是0，下边down就是m-1，
     * 左边left是0，右边right是n-1。
     * 然后我们进行while循环，先遍历上边，将所有元素加入结果res，然后上边下移一位，如果此时上边大于下边，
     * 说明此时已经遍历完成了，直接break。
     */
    public List<Integer> spiralOrder1(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int count = 0, row = matrix.length, column = matrix[0].length;
        int total = row * column;
        int up = 0, down = row - 1, left = 0, right = column - 1;
        while (count < total) {
            for (int i = left; i <= right && count < total; i++) {
                res.add(matrix[up][i]);
                count++;
            }
            up++;
            for (int i = up; i <= down && count < total; i++) {
                res.add(matrix[i][right]);
                count++;
            }
            right--;
            for (int i = right; i >= left && count < total; i--) {
                res.add(matrix[down][i]);
                count++;
            }
            down--;
            for (int i = down; i >= up && count < total; i--) {
                res.add(matrix[i][left]);
                count++;
            }
            left++;
        }
        return res;
    }

    public static void main(String[] args) {

        /**
         * 0 1
         * 1 0
         * 0 -1
         * -1 0
         */
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        int rows = directions.length, columns = directions[0].length;

        System.out.println(rows);
        System.out.println(columns);
        System.out.println(directions[3][0]);

        System.out.println(Math.pow(2, 3));

        System.out.println(13/5);
    }

    public static int reverse(int x) {

        //-2147483648 ~ 2147483647
        boolean a = x < 0;

        String str = new StringBuilder(Integer.toString(Math.abs(x))).reverse().toString();
        System.out.println("233"+Integer.toString(Math.abs(x)));
        long num = Long.parseLong(str);
        if (num > Math.pow(2, 31)) {
            return 0;
        }
        if(a) {
            return Math.negateExact(Integer.parseInt(str));
        }
        return Integer.parseInt(str);
    }

    public int evalRPN(String[] tokens) {

        Stack<String> stack = new Stack<>();

        for (String str : tokens) {
            switch (str) {
                case "+": {
                    int a = Integer.parseInt(stack.pop());
                    int b = Integer.parseInt(stack.pop());
                    int c = a + b;
                    stack.push(String.valueOf(c));
                    break;
                }
                case "-": {
                    int a = Integer.parseInt(stack.pop());
                    int b = Integer.parseInt(stack.pop());
                    int c = a - b;
                    stack.push(String.valueOf(c));
                    break;
                }
                case "*": {
                    int a = Integer.parseInt(stack.pop());
                    int b = Integer.parseInt(stack.pop());
                    int c = a * b;
                    stack.push(String.valueOf(c));
                    break;
                }
                case "/": {
                    int a = Integer.parseInt(stack.pop());
                    int b = Integer.parseInt(stack.pop());
                    int c = a / b;
                    stack.push(String.valueOf(c));
                    break;
                }
                default:
                    stack.push(str);
                    break;
            }
        }

        return Integer.parseInt(stack.pop());
    }
}
