package com.example.elastic.zhichuandi;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yto on 2019/12/27.
 */
public class Test {

    private static String statics = "statics";

    private String feiStatic = "fei";

    private int intvalue = 1;

    public static void main(String[] args) {
        Test test = new Test();
        test.test();

        double james = 123.4561;

        System.out.println(Math.round(james * 100));
        System.out.println((double)Math.round(james * 100));
        System.out.println((double) Math.round(james * 100) / 100);

    }

    public void test() {
        Test test = new Test();
        Car car = new Car();
        car.setName("car");

        String fangfacanshu = "fangfacanshu";
        int ffintvalue = 1;

        test.processs(feiStatic, statics, car, fangfacanshu, intvalue, ffintvalue);

        System.out.println("fei static:" + feiStatic + ", static:" + statics +
                ", car: " + car.getName() + ", fangfacanshu:" + fangfacanshu
                + ", int:" + intvalue + ", ffint:" + ffintvalue);

    }

    public void processs(String fei, String statics, Car car, String fangfacanshu, int a, int ff) {
        fei = "fei-change";
        statics = "fei-change";
        car.setName("cat-change");
        fangfacanshu = "fangfacanshu-change";
        a = 2;
        ff = 2;
    }
}
