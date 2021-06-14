package com.liuning.algorithms.collections;

import static java.util.Arrays.copyOf;

public class StackUseArray<E> {
    private Object[] stack;
    private int size;//数组中存储元素的个数
    public StackUseArray(){
        stack = new Object[10];//初始长度为10
    }
    //判断堆栈是否为空
    public boolean isEmpty(){
        return size == 0;
    }
    public E peek(){
        if(isEmpty()){
            return null;
        }
        return (E) stack[size -1];
    }
    public E pop(){
        E e = peek();
        stack[size - 1] = null;
        size --;
        return e;
    }
    public E push(E e){
        ensureCapacity(size + 1);
        stack[size++] = e;
        return e;
    }
    //判断数组是否已满，若已满，则扩充数组空间
    private void ensureCapacity(int size){
        int len = stack.length;
        if(size > len){
            int newLen = 10;//每次数组扩充的容量
            stack = copyOf(stack,newLen);
        }
    }
    public static void main(String[] args){
        StackUseArray<Integer> s = new StackUseArray<Integer>();
        s.push(1);
        s.push(2);
        s.push(1);
        s.push(2);
        s.push(1);
        s.push(2);
        s.push(1);
        s.push(2);
        System.out.println("栈中元素个数为：" + s.size);

    }

}
