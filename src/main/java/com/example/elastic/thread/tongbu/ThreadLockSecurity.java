package com.example.elastic.thread.tongbu;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用Lock实现线程同步/安全
 * Lock锁机制， 通过创建Lock对象，采用lock()加锁，unlock()解锁，来保护指定的代码块
 */
public class ThreadLockSecurity {

    static int tickets = 100;

    class SellTickets implements Runnable {

        Lock lock = new ReentrantLock();

        @Override
        public void run() {
            long t1 = System.currentTimeMillis();

            // Lock锁机制
            while (tickets > 0) {
                lock.lock();
                try {
                    if (tickets <= 0) {
                        return;
                    }
                    System.out.println(Thread.currentThread().getName() + "--->售出第：  " + tickets + " 票");
                    tickets--;
                } catch (Exception e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                } finally {
                    lock.unlock();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (tickets <= 0) {
                System.out.println(Thread.currentThread().getName() + "--->售票结束！");
            }

            System.out.println("---all time:" + (System.currentTimeMillis() - t1));
        }
    }

    public static void main(String[] args) {
        SellTickets sell = new ThreadLockSecurity().new SellTickets();
        Thread thread1 = new Thread(sell, "1号窗口");
        Thread thread2 = new Thread(sell, "2号窗口");
        Thread thread3 = new Thread(sell, "3号窗口");
        Thread thread4 = new Thread(sell, "4号窗口");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        for (int i = 5; i < 100; i++) {
            Thread thread = new Thread(sell, i + "号窗口");
            thread.start();
        }
    }
}
