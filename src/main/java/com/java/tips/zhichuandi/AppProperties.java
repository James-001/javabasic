package com.java.tips.zhichuandi;

/**
 * Created by yto on 2019/12/27.
 */
public class AppProperties {

    private static String statics = "statics";

    private String feiStatic = "fei";

    private int intvalue = 1;

    public static void main(String[] args) {
        AppProperties test = new AppProperties();
        test.test();

        double james = 123.4561;

        System.out.println(Math.round(james * 100));
        System.out.println((double)Math.round(james * 100));
        System.out.println((double) Math.round(james * 100) / 100);

    }

    public void test() {
        AppProperties test = new AppProperties();
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
