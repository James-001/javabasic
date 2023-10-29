package com.java.tips.thread.threadLocal;

/**
 * Created by yto on 2019/10/23.
 */
public class ThreadLocalDemo {


    public static void main(String[] args) throws Exception {

        final ThreadLocal<String> threadLocal = new ThreadLocal<String>();
        threadLocal.set("main");

        System.out.println("threadLocal1==" + threadLocal.get());

        new Thread(new Runnable() {
            @Override
            public void run() {
                String s = threadLocal.get();
                System.out.println("threadLocal2==" + s);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocal.set("thread 1");
                String s = threadLocal.get();
                System.out.println("threadLocal3==" + s);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocal.set("james");
                threadLocal.set("wade");
                String s = threadLocal.get();
                System.out.println("threadLocal4==" + s);
            }
        }).start();
    }
}
