package com.example.elastic.fanxing.jiekou;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by yto on 2019/10/11.
 */
public class TestDemo2 {

    public static void main(String[] args) throws Exception {
        TestDemo2 testDemo2 = new TestDemo2();
        System.out.println(testDemo2.james());
    }

    private static void asynUpdateShipmentData() {
        long a = System.currentTimeMillis();
        ExecutorService ex = Executors.newSingleThreadExecutor();
        try {
            ex.execute(() -> {
                for (int i = 0; i < 20; i++) {
                    System.out.println("james" + i);
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (Exception e) {
            ex.shutdown();
        } finally {
            ex.shutdown();
        }

        System.out.println("shijian:" + (System.currentTimeMillis() - a));
    }


    public String james() {

        TestDemo2 testDemo2 = new TestDemo2();
        testDemo2.asynUpdateShipmentData();
        return "woshi";
    }
}
