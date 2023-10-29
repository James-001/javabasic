package com.java.tips.thread.Thread3;

/**
 * Created by yto on 2020/12/15.
 */
public class Thread1 extends Thread{

    public void run() {
        System.out.println("Thread execute" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread1 th = new Thread1();
            th.start();
        }
    }
}
