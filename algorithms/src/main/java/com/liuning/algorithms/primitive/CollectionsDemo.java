package com.liuning.algorithms.primitive;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 基本集合类的使用
 *
 * @author liuning
 * @since 2021-06-14 15:28
 */
public class CollectionsDemo {

    public static void main(String[] args) {

        //队列
        Queue<String> queue = new LinkedList<>();
        queue.offer("Hello");
        queue.add("World");
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());

        //栈
        LinkedList<String> stack = new LinkedList<>();
        stack.push("Hello");
        stack.push("World");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(queue.size());
    }
}
