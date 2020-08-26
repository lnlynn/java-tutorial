package com.liuning.algorithms;

/**
 * @author liuning
 * @description LinkedList
 * @since 2020-08-26 23:52
 */
import java.util.Hashtable;

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

    /***从链表中删除重复数据***/
    //优点：时间复杂度较低
    //缺点：在遍历过程中需要额外的存储空间来保存已遍历过的值
    public void deleteDuplecate(Node head) {
        Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
        Node tmp = head;
        Node pre = null;
        while (tmp != null) {
            if (table.containsKey(tmp.data))
                pre.next = tmp.next;
            else {
                table.put(tmp.data, 1);
                pre = tmp;
            }
            tmp = tmp.next;
        }
    }

    //优点是不需要额外的存储空间，缺点也很明显，时间复杂度比上面介绍的算法高
    public void deleteDuplecate1(Node head) {
        Node p = head;
        while (p != null) {
            Node q = p;
            while (q.next != null) {
                if (p.data == q.next.data) {
                    q.next = q.next.next;
                } else
                    q = q.next;
            }
            p = p.next;
        }
    }

    /***如何找出单链表中的倒数第k个元素***/
    public Node findElem(Node head, int k) {
        if (k < 1 || k > this.length())
            return null;
        Node p1 = head;
        Node p2 = head;
        for (int i = 0; i < k - 1; i++)//前移k-1步
            p1 = p1.next;
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }

    /***如何实现链表的反转***/
    public void ReverseIteratively(Node head) {
        Node pReversedHead = head;
        Node pNode = head;
        Node pPrev = null;
        while (pNode != null) {
            Node pNext = pNode.next;
            if (pNext == null)
                pReversedHead = pNode;
            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }
        this.head = pReversedHead;
    }

    /***如何从尾到头输出单链表***/
    public void printListReversely(Node pListHead) {
        if (pListHead != null) {
            printListReversely(pListHead.next);
            System.out.print(pListHead.data + " ");
        }
    }

    /***如何寻找单链表的中间结点***/
    public Node SearchMid(Node head) {
        Node p = this.head;
        Node q = this.head;
        while (p != null && p.next != null && p.next.next != null) {
            p = p.next.next;
            q = q.next;
        }
        return q;
    }

    /***如何检测一个链表是否有环***/
    public boolean isLoop(Node head) {
        Node fast = head;
        Node slow = head;
        if (fast == null) {
            return false;
        }
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return !(fast == null || fast.next == null);
    }

    /***如何在不知道头指针的情况下删除指定结点***/
    public boolean deleteNode(Node n) {
        if (n == null || n.next == null)
            return false;
        int tmp = n.data;
        n.data = n.next.data;
        n.next.data = tmp;
        n.next = n.next.next;

        return true;
    }
}


