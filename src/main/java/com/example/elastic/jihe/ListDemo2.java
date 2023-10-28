package com.example.elastic.jihe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by yto on 2020/12/15.
 */
public class ListDemo2{

    public static void main(String[] args) {
        Work work = new Work();
        new Thread(work::add).start();
        new Thread(work::add).start();
        new Thread(work::add).start();
        new Thread(work::add).start();
    }



    static class Work {
        Lock lock = new ReentrantLock();
        public  void add() {


            try {
                if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                    System.out.println("---yes----");
                    Thread.sleep(2000);
                }else {
                    System.out.println("---no----");
                }
            } catch (InterruptedException e) {
                System.out.println("---InterruptedException----");
                e.printStackTrace();
            }
        }
    }
}
