package com.example.elastic.thread;


import com.alibaba.fastjson.JSON;

import javax.servlet.http.Cookie;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yto on 2020/7/16.
 */
public class Test {
    public static void main(String [] args) {
        double duration2 = Double.valueOf(123);
        duration2 = duration2 / 6;
        double ceil = Math.ceil(duration2);
        int result = new Double(ceil).intValue();

        System.out.println(result);
    }
}
