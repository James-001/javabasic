package com.example.elastic.neibulei;

/**
 * Created by yto on 2020/1/16.
 */
public class Test2 {
    public static void main(String[] arg) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("---run method---");
            }
        });
        thread.start();
    }
}
