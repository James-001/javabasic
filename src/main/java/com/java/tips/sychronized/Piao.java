package com.java.tips.sychronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 100个人抢10张票
 */
public class Piao {
    public static void main(String[] args) {
        int totalPerson = 100;

        ExecutorService service = Executors.newCachedThreadPool();
        QiangPiao thread = new QiangPiao();
        for (int i = 0; i < totalPerson; i++) {
            Future<?> result = service.submit(thread);
        }
    }
}

class QiangPiao implements Runnable {
    private Integer totalPiao = 10;
    private boolean flag = true;

    @Override
    public void run() {
        synchronized (this) {  // 处理线程同步，不加的话，整个抢票全部混乱
            if (totalPiao >= 1) {
                task();
            } else {
                System.out.println(Thread.currentThread().getName() + "== 不好意思，没票了");
            }
        }
    }

    public void task() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ", 成功抢到：" + totalPiao-- + " 号票.");
    }
}
