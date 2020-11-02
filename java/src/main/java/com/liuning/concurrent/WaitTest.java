package com.liuning.concurrent;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Object.wait测试
 *
 * @author liuning
 * @since 2020-11-02 23:31
 */
public class WaitTest {

   private final Queue<String> queue = new LinkedBlockingQueue<>();

   public void producer() {
       synchronized (queue) {
           //判断生产者队列是否已满
           while (queue.size() == Byte.MAX_VALUE) {
               try {
                   //挂起当前线程，并释放synchronized锁
                   queue.wait();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
           queue.add("queue");
           //通知消费者消费
           queue.notifyAll();
       }
   }

   public void consumer() {
       synchronized (queue) {
           //判断生产者队列是否已满
           while (queue.size() == 0) {
               try {
                   //挂起当前线程，并释放synchronized锁
                   queue.wait();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
           queue.remove();
           //通知生产者生产
           queue.notifyAll();
       }
   }
}
