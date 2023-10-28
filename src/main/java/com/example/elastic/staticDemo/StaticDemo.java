package com.example.elastic.staticDemo;

/**
 * Created by yto on 2019/10/9.
 */
public class StaticDemo {

    public static String james = "static";
    public String wade = "bian";

    public static void main(String[] args) {

        StaticDemo dem = new StaticDemo();

        StaticDemo.james = "changestatic";
        dem.setWade("changebian");
        System.out.println("static : " + james);
        System.out.println("bian : " + dem.wade);
        dem.add();
    }

    public void add() {
        StaticDemo dem = new StaticDemo();
        System.out.println("static : " + james);
        System.out.println("bian : " + dem.wade);
    }

    public String getWade() {
        return wade;
    }

    public void setWade(String wade) {
        this.wade = wade;
    }

    public static String getJames() {
        return james;
    }

    public static void setJames(String james) {
        StaticDemo.james = james;
    }
}
