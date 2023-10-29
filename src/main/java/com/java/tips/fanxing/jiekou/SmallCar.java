package com.java.tips.fanxing.jiekou;

/**
 * Created by yto on 2019/10/11.
 */
public class SmallCar implements Che<Integer> {

    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public Integer name(Integer value) {
        return value;
    }
}
