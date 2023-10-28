package com.example.elastic.fanxing;

/**
 * Created by yto on 2019/10/11.
 */
public class FanxingMethod {

    public <T> T add(T t) {
        System.out.println(t);
        return t;
    }

    public <T> void save(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        String str = "jams@1&2+3@4&5_6";
        System.out.println(str.replaceAll("@","").replaceAll("\\+","").replaceAll("\\_","").replaceAll("\\&",""));
    }
}
