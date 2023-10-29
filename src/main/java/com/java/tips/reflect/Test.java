package com.java.tips.reflect;

/**
 * 反射：通过配置文件获取实例
 * Created by yto on 2018/12/11.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        ShouJi shouji = new BasicFactory().newInstance(ShouJi.class);
        shouji.add();
        System.out.println(shouji);
    }
}
