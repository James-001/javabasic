package com.java.tips.fanxing;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Jihe jihe = new Jihe();
        System.out.println(jihe.save("new"));
        System.out.println(jihe.save(new Test()));
    }

}
