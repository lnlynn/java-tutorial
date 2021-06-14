package com.liuning.algorithms.collections;

/**
 * @author liuning
 * @description LinkedList
 * @since 2020-08-26 23:52
 */

public class LinkedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(5);
        list.addNode(3);
        list.addNode(1);
        list.addNode(3);

        System.out.println("listLen=" + list.length());

        System.out.println("Before order:");
        list.printList();

        list.orderList();
        System.out.println("After order:");
        list.printList();
    }

    Node head = null;

    /**
     * 向链表中插入数据
     *
     * @param d：插入数据的内容
     */
    public void addNode(int d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
            return;
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newNode;
    }

    /*
     * @param index:删除第index个结点
     * @return
     */
    public Boolean deleteNode(int index) {
        if (index < 1 || index > length()) {
            return false;
        }
        if (index == 1) {
            head = head.next;
            return true;
        }
        int i = 1;
        Node preNode = head;
        Node curNode = preNode.next;
        while (curNode != null) {
            if (i == index) {
                preNode.next = curNode.next;
                return true;
            }
            preNode = curNode;
            curNode = curNode.next;
            i++;
        }
        return true;
    }

    /*
     * @return  返回结点的长度
     */
    public int length() {
        int length = 0;
        Node tmp = head;
        while (tmp != null) {
            length++;
            tmp = tmp.next;
        }
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    //对链表进行排序，返回排序后的头结点
    public Node orderList() {
        Node nextNode = null;
        int temp = 0;
        Node curNode = head;
        while (curNode.next != null) {
            nextNode = curNode.next;
            while (nextNode != null) {
                if (curNode.data > nextNode.data) {
                    temp = curNode.data;
                    curNode.data = nextNode.data;
                    nextNode.data = temp;
                }
                nextNode = nextNode.next;
            }
            curNode = curNode.next;
        }
        return head;
    }

    private static class Node {
        Node next = null;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

}


