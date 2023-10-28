package com.example.elastic.thread.Thread3;

/**
 * Created by yto on 2020/12/15.
 */
public class Thread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread execute: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread2 thread2 = new Thread2();

        for (int i = 0; i < 10; i++) {
            new Thread(thread2, "name" + i).start();
        }
    }
}
