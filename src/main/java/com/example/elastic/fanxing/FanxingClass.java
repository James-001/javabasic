package com.example.elastic.fanxing;

/**
 * Created by yto on 2019/10/11.
 */
public class FanxingClass<T> {

    public void add (T t) {
        System.out.println(t);
    }

    public String james() {
        return null;
    }

    public static void main(String[] args) {
        FanxingClass fanxingClass = new FanxingClass();
        fanxingClass.add("james");
        fanxingClass.add(new String("ni hao"));

        FanxingClass<String> fanxingClass2 = new FanxingClass<String>();
        fanxingClass2.add("james");
        fanxingClass2.add(new String("ni hao"));

        //fanxingClass2.add(new Object()); 编译失败
    }
}
