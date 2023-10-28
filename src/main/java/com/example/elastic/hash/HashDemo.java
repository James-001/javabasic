package com.example.elastic.hash;

/**
 * Created by yto on 2019/10/10.
 */
public class HashDemo {

    public static void main(String[] args) {
        HashDemo demo1 = new HashDemo();
        System.out.println(demo1.hashCode());

        HashDemo demo2 = new HashDemo();
        System.out.println(demo2.hashCode());
        System.out.println(demo2.hashCode());
        System.out.println(demo2.hashCode());

        boolean compare = demo1 == demo1;
        System.out.println(compare);
    }


}
