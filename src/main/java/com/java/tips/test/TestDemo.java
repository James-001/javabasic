package com.java.tips.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yto on 2020/8/12.
 */
public class TestDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList();

        for (int i = 0; i < 50; i++) {
            list.add("james"+i);
        }

        list.parallelStream().forEach(e -> {
            System.out.println(e);
        });

    }

}
