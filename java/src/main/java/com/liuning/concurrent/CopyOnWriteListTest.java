package com.liuning.concurrent;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteListTest {

    public static void main(String[] args) throws InterruptedException {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("LiuNing");
        list.add("Liu");
        list.add("Ning");
        System.out.println(list);

        System.out.println("CopyOnWriteArrayList迭代器弱一致性：");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                list.remove(3);
            }
        });

        Iterator<String> iterator = list.iterator();

        //获取迭代器后再启动线程，且主线程等待该子线程执行完毕
        thread.start();
        thread.join();

        //迭代输出list，可以看到，子线程的删除对此次迭代不可见
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
